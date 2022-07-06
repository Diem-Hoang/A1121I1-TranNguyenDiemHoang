package com.codegym.service;

import com.codegym.model.Email;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class EmailService implements IEmailService {
    private static Map<Integer, Email> emails;

    static {
        emails = new HashMap<>();
        emails.put(1, new Email(1, "English", 50, true, "King"));
        emails.put(2, new Email(2, "Vietnamese", 15, false, "Zeus"));
        emails.put(3, new Email(3, "Japanese", 100, true, "Hera"));
        emails.put(4, new Email(4, "Chinese", 100, true, "Thor"));
        emails.put(5, new Email(5, "Vietnamese", 25, false, "Thor"));
    }

    public List<Email> showList() {
        return new ArrayList<>(emails.values());
    }

    public Email findById(Integer id) {
        return emails.get(id);
    }

    public void update(Email email) {
        emails.put(email.getId(), email);
    }
}