package model.repository.Interface;

import model.bean.Service;

public interface ILoginRepository {
    Service.User checkExits(Service.User u) ;
}
