package repository.Impl;

import model.Student;
import model.StudentType;
import repository.Interface.IStudentTypeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static repository.BaseRepository.getConnect;

public class StudentTypeRepository implements IStudentTypeRepository {
    private final String SELECT_ALL_STUDENT_TYPE = " select * from student_type ";
    @Override
    public List<StudentType> getAllListStudentType() {
        List<StudentType> studentTypes = new ArrayList<>();
        // Step 1: Establishing a Connection
        try (Connection connection = getConnect();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_STUDENT_TYPE);) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("id_student_type");
                String name = rs.getString("name");
                studentTypes.add(new StudentType(id, name));
            }
        } catch (SQLException e) {
        }
        return studentTypes;
    }
}
