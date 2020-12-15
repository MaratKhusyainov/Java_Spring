package com.spring.Hometask3;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String mainPage() {
        return "start_page";
    }
}
