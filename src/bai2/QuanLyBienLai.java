package bai2;

import baitap1.TheMuon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyBienLai {
    static List<BienLai> listBienLai = new ArrayList();
    static int tienDienMotSo = 4000;

    public static void main(String[] args) {
        menuQuanLy();
    }

    public static void menuQuanLy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ---------------------Mời bạn chọn chức năng ----------------------");
        System.out.println("Chức năng 1: Thêm thông tin ");
        System.out.println("Chức năng 2: Cập nhật thông tin ");
        System.out.println("Chức năng 3: Xoá");
        System.out.println("Chức năng 4: Hiển thị tất cả thông tin ");
        System.out.println("Chức năng 0: Kết thúc chương trình ");
        System.out.println("Nhập số từ 0 => 4 để chọn chức năng bạn muốn thực hiện: ");
        int so = Integer.parseInt(scanner.nextLine());
        while (so <= 4) {
            switch (so) {
                case 0:
                    System.out.println("Chương trình kết thúc");
                    return;
                case 1:
                    themThongTin();
                    break;
                case 2:
                    System.out.println("Cập nhật thông tin");
                    break;
                case 3:
                    System.out.println("Mời bạn nhập mã công tơ mét để xoá: ");
                    String maSoCTD = scanner.nextLine();
                    removeBienLai(maSoCTD);
                case 4:
                    inBienLai();
            }
        }
    }

    public static void themThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thêm thông tin của hộ gia đình");
        System.out.println("Mời bạn nhập số hộ gia đình cần thêm: ");
        int so = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < so; i++) {
            System.out.println("Mời bạn nhập thông tin của hộ gia đình thứ : " + (i + 1));
            System.out.println("Nhập tên của chủ hộ thứ " + (i + 1));
            String tenChuHo = scanner.nextLine();
            System.out.println("Nhập số nhà  của chủ hộ thứ " + (i + 1));
            int soNha = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập mã số của chủ hộ " + (i + 1));
            String maSoCTD = scanner.nextLine();
            System.out.println("Nhập chỉ số điện cũ của chủ hộ " + (i + 1));
            int chiSoDienCu = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập chỉ số điện mới của chủ hộ " + (i + 1));
            int chiSoDienMoi = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập chỉ số điện mới của chủ hộ " + (i + 1));
            int tongTien = (chiSoDienMoi - chiSoDienCu) * tienDienMotSo;
            BienLai bienLai = new BienLai(tenChuHo, soNha, maSoCTD, chiSoDienCu, chiSoDienMoi, tongTien);
            addBienLai(bienLai);
        }
        menuQuanLy();
    }

    public static void inBienLai(){
        System.out.println("Thông tin các sinh viên ");
        for (BienLai bienLai : listBienLai
        ) {
            bienLai.showThongTinKhachHang();
        }
        menuQuanLy();
    }

    public static void addBienLai(BienLai bienlai){
        listBienLai.add(bienlai);
    }

    public static void removeBienLai(String maSoCTD){
        Scanner scanner = new Scanner(System.in);
        Boolean check = listBienLai.removeIf(list -> (list.getMaSoCTD().equals(maSoCTD)));
        if (check) {
            System.out.println("Xoá thành công");
        } else {
            System.out.println("Xoá thất bại");
        }
        if (listBienLai.size() > 0) {
            System.out.println("Bạn có muốn tiếp tục xoá không, nếu có mời nhập ok: ");
            String checkRemove = scanner.nextLine();
            if (checkRemove.equals("ok")) {
                System.out.println("Nhập mã phiếu mượn bạn muốn xoá: ");
                String maBienLai = scanner.nextLine();
                removeBienLai(maBienLai);
            }
        }
        System.out.println("Kết thúc chương trình");
    }

}
