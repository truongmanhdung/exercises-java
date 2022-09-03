package baitap1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyTheMuon {
    static List<TheMuon> listTheMuon = new ArrayList();

    public static void main(String[] args) {
        nhapThongTinSinhVien();
    }

    public static void nhapThongTinSinhVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số sinh viên muốn thêm: ");
        int so = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < so; i++) {
            System.out.println("Mời bạn nhập thông tin của sinh viên thứ : " + (i + 1));
            System.out.println("Nhập tên của sinh viên thứ " + (i + 1));
            String hoTen = scanner.nextLine();
            System.out.println("Nhập tuổi của sinh viên thứ " + (i + 1));
            int tuoi = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập lớp của sinh viên thứ " + (i + 1));
            String lop = scanner.nextLine();
            System.out.println("Nhập ngày mượn của sinh viên thứ " + (i + 1));
            int ngayMuon = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập ngày trả của sinh viên thứ " + (i + 1));
            int ngayTra = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập số hiệu sách của sinh viên thứ " + (i + 1));
            int soHieuSach = Integer.parseInt(scanner.nextLine());
            String maPhieuMuon = "mapm" + i;
            TheMuon theMuon = new TheMuon(hoTen, tuoi, lop, maPhieuMuon, ngayMuon, ngayTra, soHieuSach);
            themPhieuMuon(theMuon);
        }

        System.out.println("Thông tin các sinh viên ");
        for (TheMuon theMuon : listTheMuon
        ) {
            inThongTinPhieuMuon(theMuon);
        }

        System.out.println("Nhập mã phiếu mượn bạn muốn xoá: ");
        String maPhieuMuon = scanner.nextLine();
        xoaPhieuMuon(maPhieuMuon);
    }

    public static void inThongTinPhieuMuon(TheMuon theMuon) {
        theMuon.inThongTinSinhVien();
    }

    public static void themPhieuMuon(TheMuon theMuon) {
        listTheMuon.add(theMuon);
    }

    public static void xoaPhieuMuon(String maTheMuon) {
        Scanner scanner = new Scanner(System.in);
        Boolean check = listTheMuon.removeIf(list -> (list.getMaPhieuMuon().equals(maTheMuon)));
        if (check) {
            System.out.println("Xoá thành công");
        } else {
            System.out.println("Xoá thất bại");
        }
        if (listTheMuon.size() > 0) {
            System.out.println("Bạn có muốn tiếp tục xoá không, nếu có mời nhập ok: ");
            String checkRemove = scanner.nextLine();
            if (checkRemove.equals("ok")) {
                System.out.println("Nhập mã phiếu mượn bạn muốn xoá: ");
                String maPhieuMuon = scanner.nextLine();
                xoaPhieuMuon(maPhieuMuon);
            }
        }
        System.out.println("Kết thúc chương trình");
    }
}
