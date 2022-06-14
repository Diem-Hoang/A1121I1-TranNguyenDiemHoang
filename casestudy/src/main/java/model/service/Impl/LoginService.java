package model.service.Impl;

import model.bean.Service;
import model.repository.Impl.LoginRepository;
import model.repository.Interface.ILoginRepository;
import model.service.Interface.ILoginService;

public class LoginService implements ILoginService {
    private ILoginRepository iLoginRepository = new LoginRepository();
    @Override
    public Service.User checkExits(Service.User u) {
        return  iLoginRepository.checkExits(u);
    }
}
