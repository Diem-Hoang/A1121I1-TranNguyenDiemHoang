package ss2.ThucHanh;

import java.util.Scanner;

public class Drawing_Menu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0){
            System.out.println("1. Vẽ hình tam giác");
            System.out.println("2. Vẽ hình vuông");
            System.out.println("3. Vẽ hình chữ nhật");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("1. Vẽ hình tam giác");
                System.out.println("* * * * * * *");
                System.out.println("  * * * * *  ");
                System.out.println("    * * *    ");
                System.out.println("      *      ");
                break;
            case 2:
                System.out.println("2. Vẽ hình vuông");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 3:
                System.out.println("3. Vẽ hình chữ nhật");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
        }
    }
}
