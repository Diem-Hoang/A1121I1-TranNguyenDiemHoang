package service.Impl;

import model.Student;
import repository.Impl.StudentRepository;
import repository.Interface.IStudentRepository;
import service.Interface.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {
    IStudentRepository iStudentRepository = new StudentRepository();
    @Override
    public List<Student> getAllListStudent() {
        return iStudentRepository.getAllListStudent();
    }

    @Override
    public boolean deleteStudent(int id) {
        return iStudentRepository.deleteStudent(id);
    }

    @Override
    public boolean addStudent(Student student) {
        return iStudentRepository.addStudent(student);
    }
}
