package ss2.BaiTap;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class ShowMenu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0){
            System.out.println("Menu:");
            System.out.println("  1. In hình chữ nhật");
            System.out.println("  2. In hình tam giác vuông");
            System.out.println("  3. In hình tam giác cân");
            System.out.println("  4. In hình vuông");
            System.out.println("  5. Exit");
            System.out.print("  Enter your choice: ");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("1. In hình chữ nhật");
                    System.out.print("Nhập chiều dài hình chữ nhật: ");
                    int a = input.nextInt();
                    System.out.print("Nhập chiều rộng hình chữ nhật: ");
                    int b = input.nextInt();
                    for(int i=0; i<b; i++){
                        for(int j=0; j<a; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("2. In hình tam giác vuông");
                    System.out.print("Nhập chiều cao tam giác vuông: ");
                    int h = input.nextInt();
                    for(int i=1; i<=h; i++){
                        for(int j=1; j<=i; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for(int i=h; i>=1; i--){
                        for(int j=1; j<=i; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("In tam giác cân");
                    System.out.print("Nhập vào chiều cao tam giác cân: ");
                    int m = input.nextInt();
                    int k = 0;
                    for (int i = 1; i <= m; ++i, k = 0) {
                        for (int j = 1; j<= m - i; ++j){
                            System.out.print("  ");
                        }
                        while (k != 2 * i - 1) {
                            System.out.print("* ");
                            ++k;
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("In hình vuông");
                    System.out.print("Nhập vào cạnh hình vuông: ");
                    int n = input.nextInt();
                    for(int i=1; i<=n; i++){
                        for(int j=1; j<=n; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
