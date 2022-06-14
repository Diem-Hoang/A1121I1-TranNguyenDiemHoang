package model.repository.Impl;

import model.bean.Customer;
import model.repository.Interface.ICustomerRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static model.repository.BaseRepository.getConnect;

public class CustomerRepository implements ICustomerRepository {
    private final String SELECT_ALL_CUSTOMERS = "SELECT * FROM customer";
    private final String ADD_CUSTOMERS_SQL = "INSERT INTO customer(customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email,\n" +
            "customer_address,customer_type_id) VALUES(?, ?, ?, ?, ?, ?, ?, ?);";
    private final String DELETE_CUSTOMER_SQL = "DELETE FROM customer WHERE customer_id=?";
    private final String SELECT_CUSTOMER = "SELECT * FROM customer WHERE customer_id=?";
    private final String EDIT_CUSTOMER_SQL = "UPDATE customer SET customer_name = ?, customer_birthday = ?, customer_gender = ?, customer_id_card = ?, customer_phone = ?, customer_email = ?, customer_address = ?, customer_type_id = ? where customer_id = ?";
    @Override
    public List<Customer> getAllListCustomer() {
        // using try-with-resources to avoid closing resources (boiler plate code)
        List<Customer> customers = new ArrayList<>();
        // Step 1: Establishing a Connection
        try (Connection connection = getConnect();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMERS);) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int customer_id = rs.getInt("customer_id");
                String customer_name = rs.getString("customer_name");
                String customer_birthday = rs.getString("customer_birthday");
                boolean customer_gender = rs.getBoolean("customer_gender");
                String customer_id_card = rs.getString("customer_id_card");
                String customer_phone = rs.getString("customer_phone");
                String customer_email = rs.getString("customer_email");
                String customer_address = rs.getString("customer_address");
                int customer_type_id = rs.getInt("customer_type_id");
                customers.add(new Customer(customer_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address, customer_type_id));
            }
        } catch (SQLException e) {
        }
        return customers;
    }

    @Override
    public boolean addCustomer(Customer customer) {
        System.out.println(ADD_CUSTOMERS_SQL);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = getConnect(); PreparedStatement preparedStatement = connection.prepareStatement(ADD_CUSTOMERS_SQL)) {
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getBirthday());
            preparedStatement.setBoolean(3, customer.getGender());
            preparedStatement.setString(4, customer.getIdCard());
            preparedStatement.setString(5, customer.getPhone());
            preparedStatement.setString(6, customer.getEmail());
            preparedStatement.setString(7, customer.getAddress());
            preparedStatement.setInt(8, customer.getIdTypeCustomer());
            System.out.println(preparedStatement);
            if( preparedStatement.executeUpdate()>0){
                return true;
            }
        } catch (SQLException e) {
        }
        return false;
    }

    @Override
    public boolean deleteCustomer(int id) {
        try (Connection connection = getConnect(); PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CUSTOMER_SQL)) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            if( preparedStatement.executeUpdate()>0){
                return true;
            }
        } catch (SQLException e) {
        }
        return false;
    }

    @Override
    public Customer getCustomerById(int id) {
        try (Connection connection = getConnect();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int customer_id = rs.getInt("customer_id");
                String customer_name = rs.getString("customer_name");
                String customer_birthday = rs.getString("customer_birthday");
                boolean customer_gender = rs.getBoolean("customer_gender");
                String customer_id_card = rs.getString("customer_id_card");
                String customer_phone = rs.getString("customer_phone");
                String customer_email = rs.getString("customer_email");
                String customer_address = rs.getString("customer_address");
                int customer_type_id = rs.getInt("customer_type_id");

                return (new Customer(customer_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address, customer_type_id));
            }
        } catch (SQLException e) {
        }
        return null;
    }

    @Override
    public boolean editCustomer(Customer customer) throws SQLException {
        boolean rowEdited;

        try (Connection connection = getConnect(); PreparedStatement preparedStatement = connection.prepareStatement(EDIT_CUSTOMER_SQL);) {
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getBirthday());
            preparedStatement.setBoolean(3, customer.getGender());
            preparedStatement.setString(4, customer.getIdCard());
            preparedStatement.setString(5, customer.getPhone());
            preparedStatement.setString(6, customer.getEmail());
            preparedStatement.setString(7, customer.getAddress());
            preparedStatement.setInt(8, customer.getIdTypeCustomer());
            preparedStatement.setInt(9, customer.getId());
            rowEdited = preparedStatement.executeUpdate() > 0;
        }
        return rowEdited;
    }
}
