package soNguyenTo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InSoChan {
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
        List<Integer> listSo = new ArrayList();
        System.out.println("Mời bạn nhập vào số nguyên dương : ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++){
            if(i % 2 == 0){
                listSo.add(i);
            }
        }

        System.out.println(listSo.toString());
    }

    public static void vongWhile(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> listSo = new ArrayList();
        System.out.println("Mời bạn nhập vào số nguyên dương : ");
        int n = Integer.parseInt(scanner.nextLine());
        int i = 0;
        while (i < n){
            if(i % 2 == 0){
                listSo.add(i);
            }
            i++;
        }

        System.out.println(listSo.toString());
    }

    public static void vongDoWhile(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> listSo = new ArrayList();
        System.out.println("Mời bạn nhập vào số nguyên dương : ");
        int n = Integer.parseInt(scanner.nextLine());
        int i = 0;
        do {
            if(i % 2 == 0){
                listSo.add(i);
            }
            i++;
        }while (i < n);

        System.out.println(listSo.toString());
    }
}
