package ss4.BaiTap.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant() < 0){
            System.out.println("The equation has no roots");
        }else if(quadraticEquation.getDiscriminant() == 0){
            System.out.println("The equation has 1 root: " + quadraticEquation.getRoot1());
        }else{
            System.out.println("The equation has 2 root: ");
            System.out.println("Root 1: " + quadraticEquation.getRoot1());
            System.out.println("Root 2: " + quadraticEquation.getRoot2());
        }
    }
}
