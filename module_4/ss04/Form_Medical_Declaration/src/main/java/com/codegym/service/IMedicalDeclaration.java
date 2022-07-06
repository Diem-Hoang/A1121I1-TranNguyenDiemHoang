package com.codegym.service;

import java.util.List;

public interface IMedicalDeclaration {
    List<MedicalDeclaration> findAll();

    void save(MedicalDeclaration medicalDeclaration);

    MedicalDeclaration findById(int id);

    void update(int id, MedicalDeclaration medicalDeclaration);

    void remove(int id);
}
