package model.service.Interface;

import model.bean.Service;

public interface ILoginService {
    Service.User checkExits(Service.User u);
}
