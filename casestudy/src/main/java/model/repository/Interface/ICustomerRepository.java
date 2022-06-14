package model.repository.Interface;

import model.bean.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerRepository {
    List<Customer> getAllListCustomer();
    boolean addCustomer(Customer customer);

    boolean deleteCustomer(int id);

    Customer getCustomerById(int id);

    boolean editCustomer(Customer customer) throws SQLException;
}
