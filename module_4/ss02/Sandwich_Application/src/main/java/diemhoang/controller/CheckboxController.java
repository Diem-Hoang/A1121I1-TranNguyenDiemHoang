package diemhoang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CheckboxController {
    @GetMapping(value = "/form")
    public String showForm(){
        return "form";
    }
    @PostMapping(value = "/form")
    public String checkBox(@RequestParam(value = "sandwich") String sandwich, Model model ){
        model.addAttribute("sandwich", sandwich);
        return "form";
    }

}
