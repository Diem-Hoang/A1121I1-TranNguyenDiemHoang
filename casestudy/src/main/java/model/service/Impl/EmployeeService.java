package model.service.Impl;

import model.bean.Employee;
import model.repository.Interface.IEmployeeRepository;
import model.repository.Impl.EmployeeRepository;
import model.service.Interface.IEmployeeService;

import java.sql.SQLException;
import java.util.List;

public class EmployeeService implements IEmployeeService {
    public IEmployeeRepository iEmployeeRepository = new EmployeeRepository();
    @Override
    public List<Employee> getAllListEmployee() {
        return iEmployeeRepository.getAllListEmployee();
    }

    @Override
    public boolean deleteEmployee(int id) {
        return iEmployeeRepository.deleteEmployee(id);
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return iEmployeeRepository.addEmployee(employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
        return iEmployeeRepository.getEmployeeById(id);
    }

    @Override
    public boolean editEmployee(Employee employee) throws SQLException {
        return iEmployeeRepository.editEmployee(employee);
    }

    @Override
    public List<Employee> searchEmployee(int idEmployee, String nameEmployee) {
        return iEmployeeRepository.searchEmployee(idEmployee, nameEmployee);
    }
}
