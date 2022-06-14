package model.service.Interface;

import model.bean.ContractDAO.Contract;

import java.util.List;

public interface IContractService {
    List<Contract> getAllListContract();
    boolean deleteContract(int id);
}
