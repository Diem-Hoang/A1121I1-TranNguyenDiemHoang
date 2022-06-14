package model.repository.Impl;

import model.bean.Employee;
import model.repository.Interface.IEmployeeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static model.repository.BaseRepository.getConnect;

public class EmployeeRepository implements IEmployeeRepository {
    private final String SELECT_EMPLOYEE = "select * from employee where employee_id=?";
    private final String SELECT_ALL_EMPLOYEE = "select * from employee";
    private final String DELETE_EMPLOYEE_SQL = "delete from employee where employee_id=?";
    private final String ADD_EMPLOYEE_SQL = "insert into employee(employee_name, employee_birthday, employee_id_card, employee_salary, employee_phone, employee_email, employee_address, position_id, education_degree_id, division_id) " +
            "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private final String EDIT_EMPLOYEE_SQL ="update employee set employee_name = ?, employee_birthday = ?, employee_id_card = ?, employee_salary = ?, employee_phone = ?, employee_email = ?, employee_address = ?, position_id = ?, education_degree_id = ?, division_id = ? where employee_id = ?";
    private final String SEARCH_EMPLOYEE ="select * from employee where `employee_id` like ? and `employee_name` like ?;";
    @Override
    public List<Employee> getAllListEmployee() {
        List<Employee> employees = new ArrayList<>();
        try(Connection connection = getConnect();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_EMPLOYEE);) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int employee_id = rs.getInt("employee_id");
                String employee_name = rs.getString("employee_name");
                String employee_birthday = rs.getString("employee_birthday");
                String employee_id_card = rs.getString("employee_id_card");
                double employee_salary = rs.getDouble("employee_salary");
                String employee_phone = rs.getString("employee_phone");
                String employee_email = rs.getString("employee_email");
                String employee_address = rs.getString("employee_address");
                int position_id = rs.getInt("position_id");
                int education_degree_id = rs.getInt("education_degree_id");
                int division_id = rs.getInt("division_id");
                String username = rs.getString("username");
                employees.add(new Employee(employee_id, employee_name, employee_birthday, employee_id_card, employee_phone, employee_email, employee_address, employee_salary, position_id, education_degree_id, division_id, username));
            }
        } catch (SQLException e) {

        }
        return employees;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        System.out.println(ADD_EMPLOYEE_SQL);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = getConnect(); PreparedStatement preparedStatement = connection.prepareStatement(ADD_EMPLOYEE_SQL)) {
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getBirthday());
            preparedStatement.setString(3, employee.getIdCard());
            preparedStatement.setDouble(4, employee.getSalary());
            preparedStatement.setString(5, employee.getPhone());
            preparedStatement.setString(6, employee.getEmail());
            preparedStatement.setString(7, employee.getAddress());
            preparedStatement.setInt(8, employee.getIdPosition());
            preparedStatement.setInt(9, employee.getIdEducationDegree());
            preparedStatement.setInt(10, employee.getIdDivision());
            System.out.println(preparedStatement);
            if( preparedStatement.executeUpdate()>0){
                return true;
            }
        } catch (SQLException e) {
        }
        return false;
    }

    @Override
    public boolean deleteEmployee(int id) {
        try(Connection connection = getConnect(); PreparedStatement preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE_SQL)){
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            if(preparedStatement.executeUpdate()>0){
                return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public Employee getEmployeeById(int id) {
        try (Connection connection = getConnect();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EMPLOYEE);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int idEmployee = rs.getInt("employee_id");
                String name = rs.getString("employee_name");
                String birthday = rs.getString("employee_birthday");
                String idCard = rs.getString("employee_id_card");
                Double salary = rs.getDouble("employee_salary");
                String phone = rs.getString("employee_phone");
                String email = rs.getString("employee_email");
                String address = rs.getString("employee_address");
                int idPosition = rs.getInt("position_id");
                int idEducationDegree = rs.getInt("education_degree_id");
                int idDivision = rs.getInt("division_id");
                return (new Employee(idEmployee, name, birthday, idCard, phone, email, address, salary, idPosition, idEducationDegree, idDivision));
            }
        } catch (SQLException e) {
        }
        return null;
    }

    @Override
    public boolean editEmployee(Employee employee) throws SQLException {
        boolean rowEdited;

        try (Connection connection = getConnect(); PreparedStatement preparedStatement = connection.prepareStatement(EDIT_EMPLOYEE_SQL);) {
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getBirthday());
            preparedStatement.setString(3, employee.getIdCard());
            preparedStatement.setDouble(4, employee.getSalary());
            preparedStatement.setString(5, employee.getPhone());
            preparedStatement.setString(6, employee.getEmail());
            preparedStatement.setString(7, employee.getAddress());
            preparedStatement.setInt(8, employee.getIdPosition());
            preparedStatement.setInt(9, employee.getIdEducationDegree());
            preparedStatement.setInt(10, employee.getIdDivision());
            preparedStatement.setInt(11, employee.getId());
            rowEdited = preparedStatement.executeUpdate() > 0;
        }
        return rowEdited;
    }

    @Override
    public List<Employee> searchEmployee(int idEmployee, String nameEmployee) {
        List<Employee> employeeList = new ArrayList<>();
        Connection connection = getConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_EMPLOYEE);
            preparedStatement.setString(1, "%" + idEmployee + "%");
            preparedStatement.setString(2, "%" + nameEmployee + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Integer id = resultSet.getInt("employee_id");
                String name = resultSet.getString("employee_name");
                String birthday = resultSet.getString("employee_birthday");
                String idCard = resultSet.getString("employee_id_card");
                Double salary = resultSet.getDouble("employee_salary");
                String phone = resultSet.getString("employee_phone");
                String email = resultSet.getString("employee_email");
                String address = resultSet.getString("employee_address");
                Integer positionId = resultSet.getInt("position_id");
                Integer educationDegreeId = resultSet.getInt("education_degree_id");
                Integer divisionId = resultSet.getInt("division_id");
                String username = resultSet.getString("username");

                employeeList.add(new Employee(id, name, birthday, idCard, salary, phone, email, address, positionId, educationDegreeId, divisionId, username));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employeeList;
    }
}
