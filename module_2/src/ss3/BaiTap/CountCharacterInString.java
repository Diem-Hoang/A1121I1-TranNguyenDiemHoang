package ss3.BaiTap;

import java.util.Scanner;

public class CountCharacterInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = input.nextLine();
        System.out.print("Chuỗi vừa nhập: " + s);

        int count = 0;
        System.out.println("Nhập ký tự cần đếm: ");
        char c = input.nextLine().charAt(0);
        for(int i=0; i<s.length(); i++) {
            if(c == s.charAt(i)){
                count++;
            }
        }
        System.out.print("Số lần xuất hiện của ký tự trong chuỗi: "+count);
    }
}
