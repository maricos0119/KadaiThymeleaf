package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class InputController {

    @GetMapping("/input")
    public String getInput(String previous,Model model) {
        if(previous != null && !previous.isEmpty()) {
            model.addAttribute("previous",previous);
        }
        // input.htmlに画面遷移
        return "input";
    }


}
