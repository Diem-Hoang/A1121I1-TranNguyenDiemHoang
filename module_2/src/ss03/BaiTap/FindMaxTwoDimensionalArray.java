package ss03.BaiTap;

import java.util.Scanner;

public class FindMaxTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int row = input.nextInt();
        System.out.print("Nhập số cột: ");
        int col = input.nextInt();

        int arr[][] = new int[row][col];
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print("Nhập giá trị phần tử " + "[" + i + "][" + j + "]: ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println();
        System.out.println("Mảng hai chiều vừa nhập: ");
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.printf("%4d",arr[i][j]);
            }
            System.out.println();
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng hai chiều: " + max);
    }
}
