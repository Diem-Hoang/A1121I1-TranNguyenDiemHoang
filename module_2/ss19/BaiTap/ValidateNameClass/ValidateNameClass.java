package ss19.BaiTap.ValidateNameClass;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateNameClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name class: ");
        String nameClass = sc.nextLine();

        String pattern = "^(C|A|P)[\\d]{4}(G|H|I|K|L|M)$";
        if(Pattern.matches(pattern, nameClass)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
