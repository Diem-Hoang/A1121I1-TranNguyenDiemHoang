package ss03.BaiTap;

import java.util.Scanner;

public class AddElement {
        public static void main (String[]args){
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
            System.out.print("Nhập giá trị cần chèn: ");
            int x = input.nextInt();
            System.out.println();
            int index;
            do {
                System.out.print("Nhập vị trí cần chèn: ");
                index = input.nextInt();
                if (index < 0 || index > array.length) {
                    System.out.println("Không chèn được phần tử vào mảng. Mời nhập lại!");
                }
            } while (index < 0 || index >= array.length);
            int tempArr[] = new int[n + 1];
            for (int i=0; i<index; i++){
                tempArr[i] = array[i];
            }
            tempArr[index] = x;
            for(int i=index+1; i<n+1; i++){
                tempArr[i] = array[i-1];
            }
            System.out.print("Mảng sau khi chèn phần tử: ");
            for (int i = 0; i < tempArr.length; i++) {
                System.out.print(tempArr[i] + " ");
            }

        }

    }