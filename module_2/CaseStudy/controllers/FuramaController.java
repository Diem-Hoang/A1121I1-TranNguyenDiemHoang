package CaseStudy.controllers;

import CaseStudy.services.Impl.CustomerServiceImpl;
import CaseStudy.services.Impl.EmployeeServiceImpl;
import CaseStudy.services.Impl.FacilityServiceImpl;

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
                    employeeService.edit();
                    break;
                case 4:

                    break;
                default:
                    System.out.println("\nError! Please re-enter your choose!");
        }}while(choose<1 || choose>4);

    }
    public static void displayCustomerMenu(){
        int choose = 0;
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        do{
            System.out.println();
            System.out.println("_____Sub Menu_____");
            System.out.println("1.\tDisplay list customers");
            System.out.println("2.\tAdd new customer");
            System.out.println("3.\tEdit customer");
            System.out.println("4.\tReturn main menu");
            System.out.print("Enter your choose: ");
            sc.nextInt();
            switch (sc.nextInt()){
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.addNew();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:

                    break;
                default:
                    System.out.println("\nError! Please re-enter your choose!");
            }
        }while(choose<1 || choose>4);
    }
    public static void displayFacilityMenu(){
        int choose = 0;
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        do{
            System.out.println();
            System.out.println("_____Sub Menu_____");
            System.out.println("1.\tDisplay list facility");
            System.out.println("2.\tAdd new facility");
            System.out.println("3.\tDisplay list facility maintenance");
            System.out.println("4.\tReturn main menu");
            System.out.print("Enter your choose: ");
            sc.nextInt();
            switch (sc.nextInt()){
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    addNewFacilityMenu();
                    break;
                case 3:
                    facilityService.displayMaintain();
                    break;
                case 4:

                    break;
                default:
                    System.out.println("\nError! Please re-enter your choose!");
            }
        }while(choose<1 || choose>4);
    }

    public static void addNewFacilityMenu(){
        int choose = 0;
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        do{
            System.out.println();
            System.out.println("_____Sub Menu_____");
            System.out.println("1.\tAdd new villa");
            System.out.println("2.\tAdd new house");
            System.out.println("3.\tAdd new room");
            System.out.println("4.\tBack to menu");
            System.out.print("Enter your choose: ");
            sc.nextInt();
            switch (sc.nextInt()){
                case 1:
                    facilityService.addNewVilla();
                    displayFacilityMenu();
                    break;
                case 2:
                    facilityService.addNewHouse();
                    displayFacilityMenu();
                    break;
                case 3:
                    facilityService.addNewRoom();
                    displayFacilityMenu();
                    break;
                case 4:

                    break;
                default:
                    System.out.println("\nError! Please re-enter your choose!");
            }
        }while(choose<1 || choose>4);
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
