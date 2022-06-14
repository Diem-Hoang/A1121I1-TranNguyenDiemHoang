package model.service.Impl;

import model.bean.ContractDAO.Contract;
import model.repository.Impl.ContractRepository;
import model.repository.Interface.IContractRepository;
import model.service.Interface.IContractService;

import java.util.List;

public class ContractService implements IContractService {
    private IContractRepository iContractRepository = new ContractRepository();
    @Override
    public List<Contract> getAllListContract() {
        return iContractRepository.getAllListContract();
    }

    @Override
    public boolean deleteContract(int id) {
        return iContractRepository.deleteContract(id);
    }
}
