package ss1.BaiTap;

import java.util.Scanner;

public class Usd_Vnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền USD: ");
        int usd = scanner.nextInt();

        int vnd = usd*23000;
        System.out.print("Giá trị tiền VNĐ: " + vnd);
    }
}
