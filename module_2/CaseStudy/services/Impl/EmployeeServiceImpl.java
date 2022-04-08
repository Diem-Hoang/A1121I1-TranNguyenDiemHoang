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

    public Employee addEmployee(){
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

        System.out.print("Enter qualification: ");
        String qualification = scanner.nextLine();

        System.out.print("Enter position: ");
        String position = scanner.nextLine();

        System.out.print("Enter salary: ");
        int salary = Integer.parseInt(scanner.nextLine());

        return new Employee(id, name, dateOfBirth, gender, idCardNumber, phoneNumber, email, qualification, position, salary);
    }

    @Override
    public void display() {
        System.out.println();
        System.out.println("_____Display list employee_____");
        for(Employee employee : employeeList){
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println();
        System.out.println("_____Add Employee_____");
        employeeList.add(addEmployee());
        System.out.println("Add success!");
    }

    @Override
    public void edit() {
        System.out.println();
        System.out.println("_____Edit_____");
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();

        for(int i=0; i<employeeList.size(); i++){
            if(id.equals(employeeList.get(i).getId())){
                System.out.println(employeeList.get(i).toString());
                employeeList.set(i,addEmployee());
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
