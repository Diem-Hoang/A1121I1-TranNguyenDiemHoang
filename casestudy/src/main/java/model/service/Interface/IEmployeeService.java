package model.service.Interface;

import model.bean.Employee;

import java.sql.SQLException;
import java.util.List;

public interface IEmployeeService {
    List<Employee> getAllListEmployee();
    boolean deleteEmployee(int id);
    boolean addEmployee(Employee employee);
    Employee getEmployeeById(int id);
    boolean editEmployee(Employee employee) throws SQLException;
    List<Employee> searchEmployee(int idEmployee, String nameEmployee);

}
