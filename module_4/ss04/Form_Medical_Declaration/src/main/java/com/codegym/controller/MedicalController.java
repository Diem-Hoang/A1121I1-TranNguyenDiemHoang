package com.codegym.controller;

import com.codegym.service.IMedicalDeclaration;
import com.codegym.service.MedicalDeclaration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/list")
public class MedicalController {
    private final IMedicalDeclaration iMedicalDeclaration = new MedicalDeclaration();
    @GetMapping("")
    public String index(Model model) {
        List<MedicalDeclaration> medicalDeclarations = iMedicalDeclaration.findAll();
        model.addAttribute("list", medicalDeclarations);
        return "list";
    }
}
