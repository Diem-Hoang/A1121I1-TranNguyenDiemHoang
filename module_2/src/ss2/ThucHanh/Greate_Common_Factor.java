package ss2.ThucHanh;

import java.util.Scanner;

public class Greate_Common_Factor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0 && b==0){
            System.out.println("a và b không có ước chung lớn nhất!");
        }else{
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            System.out.println("Ước chung lớn nhất của a và b: " + a);
        }
    }
}
