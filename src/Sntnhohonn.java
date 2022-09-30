import java.util.Scanner;

public class Sntnhohonn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num1, numND, resultND = 0;
            System.out.println("Mời bạn nhập vào số cần check ngược đảo: ");
            num1 = Integer.parseInt(sc.nextLine());

            numND = num1;
            while(numND != 0) {
                int phanDu = numND % 10;
                resultND = resultND * 10 + phanDu;
                numND /= 10;
            }
            System.out.println(num1 == resultND ? "Số " + num1 + " là số ngược đảo " : "Số " + num1 +
                    " không phải là số ngược đảo ");
        }
    }
}




