package ss3.BaiTap;

import java.util.Scanner;

public class Delete_Element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhập độ dài của mảng: ");
            n = input.nextInt();
            if(n>20){
                System.out.println("Mời bạn nhập lại! (n<20)");
            }
        }while (n>20);
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Nhập giá trị của phần tử thứ " + i + ": ");
            array[i] = input.nextInt();
        }
        System.out.print("Mảng vừa nhập: ");
        for(int i=0; i<n; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        System.out.print("Nhập phần tử cần xóa trong mảng: ");
        int x = input.nextInt();
        int count = -1;
        for(int i=0; i<array.length; i++){
            if(array[i] == x){
                count = i;
            }
        }
        if(count == -1){
            System.out.println("Không tìm thấy phần tử cần xóa!");
        }else{
            for(int i=count; i<n-1; i++){
                array[i] = array[i+1];
            }
            n--;
        }
        System.out.print("Mảng sau khi xóa phần tử: ");
        for(int i=0; i<n; i++){
            System.out.print(array[i] + ", ");
        }
    }
}
