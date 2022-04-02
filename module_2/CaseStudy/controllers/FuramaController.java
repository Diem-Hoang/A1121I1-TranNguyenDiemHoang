package CaseStudy.controllers;

import CaseStudy.services.Impl.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu(){
        int choose=0;
        do{
            System.out.println("_____Main Menu_____");
            System.out.println("1.\tEmployee Management");
            System.out.println("2.\tCustomer Management");
            System.out.println("3.\tFacility Management");
            System.out.println("4.\tBooking Management");
            System.out.println("5.\tPromotion Management");
            System.out.println("6.\tExit");
            System.out.print("Enter your choose: ");
            switch (sc.nextInt()){
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerMenu();
                    break;
                case 3:
                    displayFacilityMenu();
                    break;
                case 4:
                    displayBookingMenu();
                    break;
                case 5:
                    displayPromotionMenu();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nError! Please re-enter your choose!");
            }
        }while(choose<1 || choose>6);

    }
    public static void displayEmployeeMenu(){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        int choose = 0;
        do {
            System.out.println();
            System.out.println("_____Sub Menu_____");
            System.out.println("1.\tDisplay list employees");
            System.out.println("2.\tAdd new employee");
            System.out.println("3.\tEdit employee");
            System.out.println("4.\tReturn main menu");
            System.out.print("Enter your choose: ");
            switch (sc.nextInt()){
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    System.out.println("\nError! Please re-enter your choose!");
        }}while(choose<1 || choose>4);

    }
    public static void displayCustomerMenu(){
        System.out.println();
        System.out.println("_____Sub Menu_____");
        System.out.println("1.\tDisplay list customers");
        System.out.println("2.\tAdd new customer");
        System.out.println("3.\tEdit customer");
        System.out.println("4.\tReturn main menu");
        System.out.print("Enter your choose: ");
        sc.nextInt();
    }
    public static void displayFacilityMenu(){
        System.out.println();
        System.out.println("_____Sub Menu_____");
        System.out.println("1.\tDisplay list facility");
        System.out.println("2.\tAdd new facility");
        System.out.println("3.\tDisplay list facility maintenance");
        System.out.println("4.\tReturn main menu");
        System.out.print("Enter your choose: ");
        sc.nextInt();
    }
    public static void displayBookingMenu(){
        System.out.println();
        System.out.println("_____Sub Menu_____");
        System.out.println("1.\tAdd new booking");
        System.out.println("2.\tDisplay list booking");
        System.out.println("3.\tCreate new constracts");
        System.out.println("4.\tDisplay list contracts");
        System.out.println("5.\tEdit contracts");
        System.out.println("6.\tReturn main menu");
        System.out.print("Enter your choose: ");
        sc.nextInt();
    }
    public static void displayPromotionMenu(){
        System.out.println();
        System.out.println("_____Sub Menu_____");
        System.out.println("1.\tDisplay list customers use service");
        System.out.println("2.\tDisplay list customers get voucher");
        System.out.println("3.\tReturn main menu");
        System.out.print("Enter your choose: ");
        sc.nextInt();
    }
}
