package model.service.Impl;

import model.bean.Customer;
import model.repository.Interface.ICustomerRepository;
import model.repository.Impl.CustomerRepository;
import model.service.Interface.ICustomerService;

import java.sql.SQLException;
import java.util.List;

public class CustomerService implements ICustomerService {
    public ICustomerRepository iCustomerRepository = new CustomerRepository();

    @Override
    public List<Customer> getAllListCustomer() {
        return iCustomerRepository.getAllListCustomer();
    }

    @Override
    public boolean addCustomer(Customer customer) {
        return iCustomerRepository.addCustomer(customer);
    }

    @Override
    public boolean deleteCustomer(int id) {
        return iCustomerRepository.deleteCustomer(id);
    }

    @Override
    public Customer getCustomerById(int id) {
        return iCustomerRepository.getCustomerById(id);
    }

    @Override
    public boolean editCustomer(Customer customer) throws SQLException {
        return iCustomerRepository.editCustomer(customer);
    }
}
