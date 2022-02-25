package ss3.ThucHanh;

import sun.security.mscapi.CPublicKey;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double C, F;
        do{
            System.out.println("_____Menu_____");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter F: ");
                    F = input.nextDouble();
                    System.out.println("F to C: " + FtoC(F));
                    break;
                case 2:
                    System.out.println("Enter C: ");
                    C = input.nextDouble();
                    System.out.println("C to F: " + CtoF(C));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }while (choice != 0);
    }
    public static double FtoC(double F){
        double C = (5.0 / 9) * (F - 32);
        return C;
    }
    public static double CtoF(double C){
        double F = (9.0 / 5) * C + 32;
        return F;
    }
}
