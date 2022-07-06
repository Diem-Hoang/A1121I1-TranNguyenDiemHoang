package com.codegym.service;

import com.codegym.model.Email;

import java.util.List;

public interface IEmailService {
    List<Email> showList();
    Email findById(Integer id);
    void update(Email email);
}
