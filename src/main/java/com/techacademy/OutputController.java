package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OutputController {

    @PostMapping("/output")
    public String postOutput(String inputValue,Model model) {
        model.addAttribute("inputValue", inputValue);
        return "output";

    }

}
