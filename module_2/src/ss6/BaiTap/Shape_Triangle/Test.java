package ss6.BaiTap.Shape_Triangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        double a=0,b=0,c=0;
        boolean t = false;

        System.out.println("Nhập màu sắc cho hình: ");
        String color = input.nextLine();
        do{
            System.out.println("Nhập độ dài ba cạnh tam giác: ");
            a = input.nextDouble();
            b = input.nextDouble();
            c = input.nextDouble();

            if( a<=0 ||b<=0 || c<= 0) t =false;
            else {
                if( a+b >=c && b+c>=a && a+c>=b)
                    t= true;
                else{
                    System.out.println("\nMời bạn nhập lại!");
                }

            }
        }while (t==false);

        Triangle tg = new Triangle(a,b,c, color);
        System.out.println(tg);

    }
}
