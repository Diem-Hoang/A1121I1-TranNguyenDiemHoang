package diemhoang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculateController {
    @GetMapping(value = "/caculate")
    public String showForm(){
        return "form";
    }
    @PostMapping(value = "/caculate")
    public String caculate(@RequestParam(value = "num1") int num1,
                           @RequestParam(value = "num2") int num2,
                           @RequestParam(value = "caculate") String caculate,
                           Model model){
        int result = 0;
        switch (caculate){
            case "cong":
                result = num1 + num2;
                break;
            case "tru":
                result = num1 - num2;
                break;
            case "nhan":
                result = num1 * num2;
                break;
            case "chia":
                result = num1 / num2;
                break;
        }
        model.addAttribute("result", result);
        return "form";
    }

}
