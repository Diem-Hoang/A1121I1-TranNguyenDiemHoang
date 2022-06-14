package model.repository.Impl;

import model.bean.Service;
import model.repository.BaseRepository;
import model.repository.Interface.ILoginRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginRepository implements ILoginRepository {
    @Override
    public Service.User checkExits(Service.User u) {
        Connection connection = BaseRepository.getConnect();
        String sql = "select * from user where username = ? and password = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, u.getUsername());
            ps.setString(2,u.getPassword());
            ResultSet rs = ps.executeQuery();
            while ( rs.next()){
              return u;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return  null;
        }

        return  null;
    }

}
