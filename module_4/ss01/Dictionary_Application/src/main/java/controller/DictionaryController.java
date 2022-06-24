package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {

    @GetMapping("/dictionary")
    public String Dictionary() {
        return "dictionary";
    }

    @PostMapping("/result")
    public String result(@RequestParam(value = "word") String word, Model model) {
        switch(word){
            case "dog": model.addAttribute("result","chó");
                break;
            case "cat": model.addAttribute("result","mèo");
                break;
            case "pig": model.addAttribute("result","heo");
                break;
            case "rabbit": model.addAttribute("result","thỏ");
                break;
            case "hamter": model.addAttribute("result","chuột");
                break;
            default: model.addAttribute("result","Không có kết quả trùng khớp")    ;
        }
        return "dictionary";
    }
}
