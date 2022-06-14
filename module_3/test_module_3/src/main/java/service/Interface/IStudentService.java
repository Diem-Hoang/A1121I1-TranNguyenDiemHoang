package service.Interface;

import model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAllListStudent();
    boolean deleteStudent(int id);
    boolean addStudent (Student student);
}
