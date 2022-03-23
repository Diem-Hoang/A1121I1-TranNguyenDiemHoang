package ss03.BaiTap;

import java.util.Scanner;

public class TotalNumberInColumn {
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
        int k;
        do{
            System.out.println("Nhập vào thứ tự cột cần tính tổng: ");
            k = input.nextInt();
            if(k<0 || k>=arr.length){
                System.out.println("Không tồn tại cột! Mời bạn nhập lại!");
            }
        }while(k<0 || k>=arr.length);
        int sum=0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i][k];
        }
        System.out.println("Tổng các số của cột " + k + " = "+ sum);
    }
}
