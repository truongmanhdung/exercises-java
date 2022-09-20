package soNguyenTo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giaithua {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        int so ;
        do{
            System.out.println("1. Vòng lặp for");
            System.out.println("2. Vòng lặp while");
            System.out.println("3. Vòng lặp do while");
            System.out.println("Mời bạn chọn dùng vòng lặp ?");
            so = Integer.parseInt(scanner.nextLine());

            switch (so){
                case 1:
                    vongFor();
                    break;
                case 2:
                    vongWhile();
                    break;
                case 3:
                    vongDoWhile();
                    break;
            }

        }while(so < 3);
    }


    public static void vongFor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số nguyên dương : ");
        int n = Integer.parseInt(scanner.nextLine());
        int giaiThua = n;
        if(n == 1){
            giaiThua = 1;
        }else{
            for (int i = n - 1;  i > 1; i --){
                giaiThua = giaiThua*(i);
            }
        }

        System.out.println("Giai thừa của số n là: " + giaiThua);
    }

    public static void vongWhile(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số nguyên dương : ");
        int n = Integer.parseInt(scanner.nextLine());
        int i = n - 1;
        int giaiThua = n;
        if(n == 1){
            giaiThua = 1;
        }else{
            while (1 < i){
                giaiThua = giaiThua*(i);
                i --;
            }
        }

        System.out.println("Giai thừa của số n là: " + giaiThua);


    }

    public static void vongDoWhile(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số nguyên dương : ");
        int n = Integer.parseInt(scanner.nextLine());
        int i = n - 1;
        int giaiThua = n;

            do{
                if(n == 1){
                    giaiThua = 1;
                    i = 0;
                }else{
                    giaiThua = giaiThua*(i);
                    i --;
                }

            }while (i > 1);

        System.out.println("Giai thừa của số n là: " + giaiThua);


    }
}
