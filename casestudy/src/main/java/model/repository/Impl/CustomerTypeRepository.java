package model.repository.Impl;

import model.bean.CustomerType;
import model.repository.BaseRepository;
import model.repository.Interface.ICustomerType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeRepository implements ICustomerType {
    private final String SELECT_ALL_CUSTOMERSTYPE = "SELECT * FROM furama.customer_type;";

    @Override
    public List<CustomerType> getAllListCustomerType() {
        // using try-with-resources to avoid closing resources (boiler plate code)
        List<CustomerType> customerTypes = new ArrayList<>();
        // Step 1: Establishing a Connection
        try (Connection connection = BaseRepository.getConnect();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMERSTYPE);) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int customerTypeID = rs.getInt("customer_type_id");
                String customerTypeName = rs.getString("customer_type_name");
                customerTypes.add(new CustomerType(customerTypeID, customerTypeName));
            }
        } catch (SQLException e) {
        }
        return customerTypes;
    }
}
