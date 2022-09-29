import java.util.Scanner;

public class Sntnhohonn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num1,num2, numND, resultND = 0;
            System.out.println("Mời bạn nhập vào số thứ nhất: ");
            num1 = Integer.parseInt(sc.nextLine());

            System.out.println("Mời bạn nhập vào số thứ hai: ");
            num2 = Integer.parseInt(sc.nextLine());
            numND = num2;
            while(numND != 0) {
                int digit = numND % 10;
                resultND = resultND * 10 + digit;
                numND /= 10;
            }
            System.out.println(num1 == resultND ? "Số " + num2 + " là số ngược của số " + num1 : "Số " + num2 +
                    " không phải ngược của số " + num1);
        }
    }
}




