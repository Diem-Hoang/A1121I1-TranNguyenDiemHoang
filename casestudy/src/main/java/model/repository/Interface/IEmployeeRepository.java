package model.repository.Interface;

import model.bean.Customer;
import model.bean.Employee;

import java.sql.SQLException;
import java.util.List;

public interface IEmployeeRepository {
    List<Employee> getAllListEmployee();
    boolean addEmployee(Employee employee);
    boolean deleteEmployee(int id);
    Employee getEmployeeById(int id);
    boolean editEmployee(Employee employee) throws SQLException;
    List<Employee> searchEmployee(int idEmployee, String nameEmployee);
}
