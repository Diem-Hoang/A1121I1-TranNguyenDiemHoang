package ss3.BaiTap;

import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập độ dài của mảng: ");
            n = input.nextInt();
            if (n > 20) {
                System.out.println("Mời bạn nhập lại! (n<20)");
            }
        } while (n > 20);
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập giá trị của phần tử thứ " + i + ": ");
            array[i] = input.nextInt();
        }
        System.out.print("Mảng vừa nhập: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng: " + min);
    }
}
