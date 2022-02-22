package ss2.BaiTap;

import java.util.Scanner;

public class FirstPrime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Số lượng số nguyên tố cần in ra: ");
        int number = input.nextInt();
        int count = 0, N = 2;
        for(int i=2; i>=2; i++){
            int check = 1;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j == 0){
                    check = 0;
                    break;
                }
            }
            if(check == 1){
                System.out.print(i + " ");
                count++;
            }
            if(count == number){
                break;
            }
        }
    }
}
