package service.Impl;

import model.User;
import repository.Impl.LoginRepository;
import repository.Interface.ILoginRepository;
import service.Interface.ILoginService;

public class LoginService implements ILoginService {
    private ILoginRepository iLoginRepository = new LoginRepository();
    @Override
    public User checkExits(User u) {
        return  iLoginRepository.checkExits(u);
    }
}
