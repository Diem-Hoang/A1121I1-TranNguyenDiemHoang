package model.repository.Interface;

import model.bean.ContractDAO.Contract;

import java.util.List;

public interface IContractRepository {
    List<Contract> getAllListContract();
    boolean deleteContract(int id);
}
