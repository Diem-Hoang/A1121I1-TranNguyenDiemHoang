package model.repository.Interface;

import model.bean.RentType;
import model.bean.Service;

import java.util.List;

public interface IServiceDAORepository {
    List<RentType> getListRentType();

    boolean addService(Service service);
    List<Service> getAllListService();
}