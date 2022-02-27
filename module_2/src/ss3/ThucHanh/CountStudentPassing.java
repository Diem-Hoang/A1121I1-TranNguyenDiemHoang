package ss3.ThucHanh;

import java.util.Scanner;

public class CountStudentPassing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int[] array;
        do {
            System.out.print("Nhập độ dài của mảng: ");
            n = input.nextInt();
            if (n > 20)
                System.out.println("Mời bạn nhập lại! (n<20)");
        } while(n > 20);
        array = new int[n];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập điểm của học sinh: " + (i + 1) + ": ");
            array[i] = input.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("Danh sách điểm vừa nhập: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\n Số học sinh thi đậu: " + count);
    }
}
