package model.service.Interface;

import model.bean.RentType;
import model.bean.Service;

import java.util.List;

public interface IServiceDAO_Service {

    List<RentType> getListRent_Type();
    boolean addService(Service service);
    List<Service> getAllListService();

}
