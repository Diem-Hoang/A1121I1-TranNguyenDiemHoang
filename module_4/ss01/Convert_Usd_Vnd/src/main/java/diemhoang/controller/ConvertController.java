package diemhoang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ConvertController {
    @GetMapping(value = "/form")
    public String showForm() {
        return "convert";
    }
    @PostMapping
    public String result(@RequestParam(value = "usd") int usd , Model model){
        model.addAttribute("vnd" , usd*23000);
        return "convert";
    }
}
