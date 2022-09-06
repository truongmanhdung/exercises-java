package bai7;

import java.util.Date;
import java.util.Scanner;

public class QuanLySinhVien {
    public static void main(String[] args) {
        SinhVien dung = new SinhVien("sadsa", new Date() , 21111111, 2112, "asdadsasd", "gioi");
        dung.showInfoSinhVien();
    }

    public void menu(){
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
//                    addPhuongTien();
                    break;
                case 2:
//                    removePhuongTien();
                    break;
            }
        } while (so <= 3 && so >= 0);
    }
}
