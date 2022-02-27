package ss3.BaiTap;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m;
        do {
            System.out.print("Nhập độ dài của mảng thứ nhất: ");
            n = input.nextInt();
            if (n > 20) {
                System.out.println("Mời bạn nhập lại! (n<20)");
            }
        } while (n > 20);
        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập giá trị của phần tử thứ " + i + ": ");
            array1[i] = input.nextInt();
        }
        System.out.println("----------------------------------");
        do {
            System.out.print("Nhập độ dài của mảng thứ hai: ");
            m = input.nextInt();
            if (m > 20) {
                System.out.println("Mời bạn nhập lại! (m<20)");
            }
        } while (m > 20);
        int[] array2 = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Nhập giá trị của phần tử thứ " + i + ": ");
            array2[i] = input.nextInt();
        }
        System.out.println("----------------------------------");
        System.out.print("Mảng thứ nhất vừa nhập: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println();
        System.out.print("Mảng thứ hai vừa nhập: ");
        for (int i = 0; i < m; i++) {
            System.out.print(array2[i] + ", ");
        }
        int[] array3 = new int[n+m];
        for(int i=0; i<n; i++){
            array3[i] = array1[i];
        }
        for (int i=n, j=0; i<array3.length; i++, j++){
            array3[i] = array2[j];
        }
        System.out.println();
        System.out.print("Mảng thứ ba sau khi gộp: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + ", ");
        }
    }
}
