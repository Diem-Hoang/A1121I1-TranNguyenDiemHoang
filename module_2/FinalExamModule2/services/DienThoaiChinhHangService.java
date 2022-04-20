package FinalExamModule2.services;

import FinalExamModule2.util.NotFoundMedicalRecordException;

public interface DienThoaiChinhHangService {
    void display();


    void addNew();


    void delete() throws NotFoundMedicalRecordException;
}
