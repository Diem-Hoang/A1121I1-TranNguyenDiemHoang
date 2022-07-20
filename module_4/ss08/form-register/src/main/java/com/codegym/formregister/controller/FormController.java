package com.codegym.formregister.controller;

import com.codegym.formregister.entity.Account;
import com.codegym.formregister.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/register")
public class FormController  {

    private IAccountService iAccountService;
    @Autowired
    public FormController(IAccountService iAccountService) {
        this.iAccountService = iAccountService;
    }

    @GetMapping("/form")
    public String showForm( Model model ){
        model.addAttribute("account", new Account());
        return "form";
    }
    @PostMapping("/create")
    public String form(@Validated @ModelAttribute(  value = "account") Account account,
                       BindingResult bindingResult){
        if (bindingResult.hasErrors()  ) {
            return "form";
        }
        iAccountService.createAccount(account);
        return "/success";
    }

    @ExceptionHandler(Exception.class)
    public String error(Exception e, Model m) {
        m.addAttribute("error", e.getCause());
        return "fail";
    }
}