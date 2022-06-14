package model.service.Impl;

import model.bean.RentType;
import model.bean.Service;
import model.repository.Impl.ServiceDAORepository;
import model.repository.Interface.IServiceDAORepository;
import model.service.Interface.IServiceDAO_Service;

import java.util.List;

public class ServiceDAO_Service implements IServiceDAO_Service {
    private IServiceDAORepository iServiceDAORepository =new ServiceDAORepository();
    @Override
    public List<RentType> getListRent_Type() {

        System.out.println("1");
        return iServiceDAORepository.getListRentType();
    }

    @Override
    public boolean addService(Service service) {
        return  iServiceDAORepository.addService(service);
    }

    @Override
    public List<Service> getAllListService() {
        return  iServiceDAORepository.getAllListService();
    }
}