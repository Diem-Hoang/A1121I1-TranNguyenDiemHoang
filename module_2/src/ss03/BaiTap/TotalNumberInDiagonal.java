package ss03.BaiTap;

import java.util.Scanner;

public class TotalNumberInDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col;
        do{
            System.out.print("Nhập số hàng: ");
            row = input.nextInt();
            System.out.print("Nhập số cột: ");
            col = input.nextInt();
            if(row!=col){
                System.out.println("Mời bạn nhập lại!");
            }
        }while(row!=col);

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
        int sum=0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println("Tổng các số của đường chéo chính = "+ sum);
    }
}
