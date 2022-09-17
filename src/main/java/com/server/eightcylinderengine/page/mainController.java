package com.server.eightcylinderengine.page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class mainController {
    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("hello", "서버에서 보내준 값입니다.");
        return "index";
    }
}
