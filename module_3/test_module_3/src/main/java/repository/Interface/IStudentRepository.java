package repository.Interface;

import model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAllListStudent();
    boolean deleteStudent(int id);
    boolean addStudent (Student student);
}
