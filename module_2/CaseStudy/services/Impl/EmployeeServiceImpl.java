package CaseStudy.services.Impl;

import CaseStudy.models.Employee;
import CaseStudy.services.EmployeeService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<Employee>();
    private Scanner scanner = new Scanner(System.in);


    @Override
    public void display() {
        System.out.println();
        System.out.println("_____Display_____");
        for(Employee employee : employeeList){
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println();
        System.out.print("Enter your ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your birthday: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Enter your gender: ");
        String gender = scanner.nextLine();

        System.out.print("Enter your IDCardNumber: ");
        int idCardNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter your phone number: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your qualification: ");
        String qualification = scanner.nextLine();

        System.out.print("Enter your position: ");
        String position = scanner.nextLine();

        System.out.print("Enter your salary: ");
        int salary = Integer.parseInt(scanner.nextLine());

        Employee employee = new Employee(id, name, dateOfBirth, gender, idCardNumber, phoneNumber, email, qualification, position, salary);
        employeeList.add(employee);
    }

    @Override
    public void edit() {
        boolean check;
        System.out.println();
        System.out.println("_____Edit_____");
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        for(int i=0; i<employeeList.size(); i++){
            if(id.equals(employeeList.get(i).getId())){
                System.out.println(employeeList.get(i).toString());
                //employeeList.set(i,addNew());
            }
        }

    }

    @Override
    public void delete() {

    }
}
