package com.codegym.controller;


import com.codegym.model.Email;
import com.codegym.service.EmailService;
import com.codegym.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/email")
public class EmailController {
@Autowired
private IEmailService iEmailService;

    @GetMapping("")
    public String email(Model model) {
        List<Email> emailList = iEmailService.showList();
        model.addAttribute("email", emailList);
        return "list";
    }
    @GetMapping("/{id}/edit")
    public String showEdit(@PathVariable int id, ModelMap model) {
        model.addAttribute("email", iEmailService.findById(id));
        String[] language ={"English","Vietnamese","Japanese","Chinese"};
        Integer[] page = {5,10,15,25,50,100};
        model.addAttribute("page",page);
        model.addAttribute("language",language);
        return "edit";
    }

    @PostMapping("/edit")
    public String submit(@ModelAttribute("email") Email email) {
        iEmailService.update(email);
        return "redirect:/email";
    }
}