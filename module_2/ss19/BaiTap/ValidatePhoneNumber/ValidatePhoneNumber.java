package ss19.BaiTap.ValidatePhoneNumber;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String phoneNumber = sc.nextLine();

        String pattern = "^\\([\\d]{2}\\)-\\([\\d]{10}\\)$";
        if (Pattern.matches(pattern, phoneNumber)) {
            System.out.print("Valid");
        } else {
            System.out.print("Invalid");
        }
    }
}
