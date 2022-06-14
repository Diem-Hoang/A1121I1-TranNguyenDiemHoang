package model.repository.Impl;

import model.bean.ContractDAO.Contract;
import model.bean.Customer;
import model.repository.Interface.IContractRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static model.repository.BaseRepository.getConnect;

public class ContractRepository implements IContractRepository {
    private final String SELECT_ALL_CONTRACTS = "SELECT * FROM contract";
    private final String DELETE_CONTRACTS_SQL = "DELETE FROM contract WHERE contract_id = ?";
    @Override
    public List<Contract> getAllListContract() {
        // using try-with-resources to avoid closing resources (boiler plate code)
        List<Contract> contracts = new ArrayList<>();
        // Step 1: Establishing a Connection
        try (Connection connection = getConnect();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CONTRACTS);) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int idContract = rs.getInt("contract_id");
                String startDate = rs.getString("contract_start_date");
                String endDate = rs.getString("contract_end_date");
                double deposit = rs.getDouble("contract_deposit");
                double totalMoney = rs.getDouble("contract_total_money");
                int idEmployee = rs.getInt("employee_id");
                int idCustomer = rs.getInt("customer_id");
                int idService = rs.getInt("service_id");
                contracts.add(new Contract(idContract, startDate, endDate, deposit, totalMoney, idEmployee, idCustomer, idContract));
            }
        } catch (SQLException e) {
        }
        return contracts;
    }

    @Override
    public boolean deleteContract(int id) {
        try (Connection connection = getConnect(); PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CONTRACTS_SQL)) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            if( preparedStatement.executeUpdate()>0){
                return true;
            }
        } catch (SQLException e) {
        }
        return false;
    }
}
