package service.Impl;

import model.StudentType;
import repository.Impl.StudentTypeRepository;
import repository.Interface.IStudentTypeRepository;
import service.Interface.IStudentTypeService;

import java.util.List;

public class StudentTypeService implements IStudentTypeService {
    IStudentTypeRepository iStudentTypeRepository = new StudentTypeRepository();
    @Override
    public List<StudentType> getAllListStudentType() {
        return iStudentTypeRepository.getAllListStudentType();
    }
}
