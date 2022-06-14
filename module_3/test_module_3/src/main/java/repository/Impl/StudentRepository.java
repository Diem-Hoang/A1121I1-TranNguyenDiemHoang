package repository.Impl;

import model.Student;
import static repository.BaseRepository.getConnect;
import repository.Interface.IStudentRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private final String SELECT_ALL_STUDENT = " select * from student ";
    private final String DELETE_STUDENT = " delete from student where id = ? ";
    @Override
    public List<Student> getAllListStudent() {
        List<Student> students = new ArrayList<>();
        // Step 1: Establishing a Connection
        try (Connection connection = getConnect();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_STUDENT);) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String birthday = rs.getString("birthday");
                String email = rs.getString("email");
                int idType = rs.getInt("id_student_type");
                students.add(new Student(id, name, birthday, email, idType));
            }
        } catch (SQLException e) {
        }
        return students;
    }

    @Override
    public boolean deleteStudent(int id) {
        try (Connection connection = getConnect(); PreparedStatement preparedStatement = connection.prepareStatement(DELETE_STUDENT)) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            if( preparedStatement.executeUpdate()>0){
                return true;
            }
        } catch (SQLException e) {
        }
        return false;
    }

    @Override
    public boolean addStudent(Student student) {
        return false;
    }
}
