package FinalExamModule2.services;

import FinalExamModule2.util.NotFoundMedicalRecordException;

public interface DienThoaiXachTayService {
    void display();


    void addNew();


    void delete() throws NotFoundMedicalRecordException;
}
