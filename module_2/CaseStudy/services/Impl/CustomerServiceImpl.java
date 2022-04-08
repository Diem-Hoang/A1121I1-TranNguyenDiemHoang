package CaseStudy.services.Impl;

import CaseStudy.models.Customer;
import CaseStudy.services.CustomerService;

import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList =  new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    public Customer addCustomer(){
        System.out.println();
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter fullname: ");
        String name = scanner.nextLine();

        System.out.print("Enter birthday: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();

        System.out.print("Enter IDCardNumber: ");
        int idCardNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter phone number: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.println("Enter customer type: ");
        String customerType = scanner.nextLine();

        System.out.println("Enter address: ");
        String address = scanner.nextLine();

        return new Customer(name, dateOfBirth, gender, idCardNumber, phoneNumber, email, customerType, address);
    }
    @Override
    public void display() {
        System.out.println();
        System.out.println("_____Display list customer_____");
        for(Customer customer : customerList){
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println();
        System.out.println("_____Add Customer_____");
        customerList.add(addCustomer());
        System.out.println("Add success!");
    }

    @Override
    public void edit() {
        System.out.println();
        System.out.println("_____Edit_____");
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();

        for(int i=0; i<customerList.size(); i++){
            if(id.equals(customerList.get(i).getId())){
                System.out.println(customerList.get(i).toString());
                customerList.set(i,addCustomer());
                System.out.println("Edit success!");
            }else{
                System.out.println("ID is not valid!");
            }
        }
    }

    @Override
    public void delete() {

    }
}
