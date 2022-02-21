package ss2.ThucHanh;

import java.util.Scanner;

public class Interest_Calculator {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền gửi tiết kiệm: ");
        money = scanner.nextDouble();

        System.out.print("Nhập số tháng gửi tiết kiệm: ");
        month = scanner.nextInt();

        System.out.print("Nhập tỉ lệ lãi suất: ");
        interestRate = scanner.nextDouble();

        double total = 0;
        for(int i=0; i<month; i++){
            total += money * (interestRate/100)/12 * month;
        }
        System.out.println("Tổng số tiền lãi nhận được: " + total);
    }
}
