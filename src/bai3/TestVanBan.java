package bai3;

import java.util.Scanner;

public class TestVanBan {
    public static final char check = 'a';
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập chuỗi string: ");
        String text = scanner.nextLine();
        demSoKiTuA(text);
    }

    public static void demSoKiTuA(String st){
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == check) {
                count++;
            }
        }
        System.out.println("Số kí tự a xuất hiện là :" + count);
    }
}
