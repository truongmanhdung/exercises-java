package soNguyenTo;

import java.util.Scanner;

public class SoNguyenTo {
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
                    System.out.println(vongFor());
                    break;
                case 2:
                    System.out.println(vongWhile());
                    break;
                case 3:
                    System.out.println(vongDoWhile());
                    break;
            }

        }while(so < 3);
    }


    public static String vongFor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số nguyên dương : ");
        int n = Integer.parseInt(scanner.nextLine());
        if(n < 2){
            return "số n là số nguyên tố";
        }else{
            for (int i = 2; i < n; i++) {
                if(n % i == 0) {
                    return "n ko phải là số nguyên tố";
                }
            }
            return "n là số nguyên tố";
        }

    }

    public static String vongWhile(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số nguyên dương : ");
        int n = Integer.parseInt(scanner.nextLine());
        if(n < 2){
            return "số n là số nguyên tố";
        }
        int i = 2;
        while(i < n){
            if(n % i == 0) {
                return "n ko phải là số nguyên tố";
            }
            i++;
        }

        return "n là số nguyên tố";
    }

    public static String vongDoWhile(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số nguyên dương : ");
        int n = Integer.parseInt(scanner.nextLine());
        int i = 2;
        do{
            if(n < 2){
                return "n ko phải là số nguyên tố";
            }else {
                if (n % i == 0) {
                    return "n ko phải là số nguyên tố";
                }

            }
            i++;
        }while(i < n);
        return "n là số nguyên tố";
    }
}
