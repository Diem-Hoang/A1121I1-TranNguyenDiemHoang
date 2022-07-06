package com.codegym.service;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MedicalDeclaration implements IMedicalDeclaration{
    @Override
    public List<MedicalDeclaration> findAll() {
        return null;
    }

    @Override
    public void save(MedicalDeclaration medicalDeclaration) {

    }

    @Override
    public MedicalDeclaration findById(int id) {
        return null;
    }

    @Override
    public void update(int id, MedicalDeclaration medicalDeclaration) {

    }

    @Override
    public void remove(int id) {

    }
}
