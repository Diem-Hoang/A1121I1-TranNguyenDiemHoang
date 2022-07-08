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
    @GetMapping("")
    public String showForm(Model model){
        String [] thongtindilai = {"Tàu bay", "Tàu thuyền", "Ô tô", "Khác (Ghi rõ)"};
        String [] gioitinh = {"Nam", "Nữ", "Khác"};
        String [] quoctich = {"Việt Nam", "Nhật Bản", "Trung Quốc", "Mỹ", "Anh", "Pháp"};
        model.addAttribute("medical" ,new MedicalDeclaration());
        model.addAttribute("thongtindilai",thongtindilai);
        model.addAttribute("gioitinh" ,gioitinh  );
        model.addAttribute("quoctich" ,quoctich  );
        return "form";

    }

}
