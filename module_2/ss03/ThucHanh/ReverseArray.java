package ss03.ThucHanh;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhập độ dài của mảng: ");
            n = input.nextInt();
            if(n > 20){
                System.out.println("Mời bạn nhập lại! (n<20)");
            }
        }while (n>20);
        int List[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Nhập giá trị của phần tử thứ " + i + ": ");
            List[i] = input.nextInt();
        }
        System.out.print("Mảng vừa nhập: ");
        for(int i=0; i<n; i++){
            System.out.print(List[i] + ", ");
        }
        System.out.println();
        for(int i=0; i<n/2; i++){
            int temp = List[i];
            List[i] = List[n-1-i];
            List[n-1-i] = temp;
        }
        System.out.print("Mảng vừa đảo: ");
        for(int i=0; i<n; i++){
            System.out.print(List[i] + ", ");
        }
    }
}
