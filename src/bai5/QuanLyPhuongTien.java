package bai5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyPhuongTien {
    static List<PhuongTien> listPhuongTien = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn chọn chức năng để tiếp tục chương trình: ");
        System.out.println("1. Thêm phương tiện");
        System.out.println("2. Xóa phương tiện");
        System.out.println("3. Thoát chương trình");
        System.out.println("Mời bạn nhập chương trình muốn chạy: ");
        int so = Integer.parseInt(scanner.nextLine());
        do {
            switch (so) {
                case 1:
                    addPhuongTien();
                    break;
                case 2:
                    removePhuongTien();
                    break;
            }
        } while (so <= 3 && so >= 0);

    }

    public static void addPhuongTien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số phương tiện muốn thêm");
        int so = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < so; i++) {
            System.out.println("Mời bạn chọn loại phương tiện trong 3 loại sau");
            System.out.println("1. Ô to --- 2. Xe tải --- 3. Xe máy");
            int type = Integer.parseInt(scanner.nextLine());
            switch (type) {
                case 1:
                    System.out.println("Mời bạn nhập thông tin của xe ô tô: ");
                case 2:
                    System.out.println("Mời bạn nhập thông tin của xe tải: ");
                case 3:
                    System.out.println("Mời bạn nhập thông tin của xe máy: ");
            }
            createPhuongTien(type, (i + 1));
        }
    }

    public static void createPhuongTien(int type, int id) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập hãng sản xuất của xe: ");
        String hangSX = scanner.nextLine();
        System.out.println("Mời bạn nhập năm sản xuất của xe: ");
        int namSx = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập giá bán của xe: ");
        int giaBan = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập màu xe: ");
        String mauXe = scanner.nextLine();
        switch (type) {
            case 1:
                System.out.println("Mời bạn nhập số chỗ ngồi: ");
                int soChoNgoi = Integer.parseInt(scanner.nextLine());
                System.out.println("Mời bạn nhập kiểu động cơ");
                String kieuDongCo = scanner.nextLine();
                PhuongTien oto = new Oto(id, hangSX, namSx, giaBan, mauXe, soChoNgoi, kieuDongCo);
                listPhuongTien.add(oto);
                break;
            case 2:
                System.out.println("Mời bạn nhập trọng tải: ");
                int trongTai = Integer.parseInt(scanner.nextLine());
                PhuongTien xeTai = new XeTai(id, hangSX, namSx, giaBan, mauXe, trongTai);
                listPhuongTien.add(xeTai);
                break;
            case 3:
                System.out.println("Mời bạn nhập công suất: ");
                int congXuat = Integer.parseInt(scanner.nextLine());
                PhuongTien xeMay = new XeMay(id, hangSX, namSx, giaBan, mauXe, congXuat);
                listPhuongTien.add(xeMay);
                break;
            default:
                System.out.println("Mời bạn chạy lại chương trình");
                return;
        }
    }

    public static void removePhuongTien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập id phương tiện cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        Boolean check = listPhuongTien.removeIf(list -> (list.getId() == id));
        if (check) {
            System.out.println("Xoá thành công");
        } else {
            System.out.println("Xoá thất bại");
        }
        if (listPhuongTien.size() > 0) {
            System.out.println("Bạn có muốn tiếp tục xoá không, nếu có mời nhập ok: ");
            String checkRemove = scanner.nextLine();
            if (checkRemove.equals("ok")) {
                removePhuongTien();
            }
        }
        System.out.println("Kết thúc chương trình");
    }
}
