package repository.Impl;

import model.User;
import repository.BaseRepository;
import repository.Interface.ILoginRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginRepository implements ILoginRepository {
    @Override
    public User checkExits(User u) {
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
