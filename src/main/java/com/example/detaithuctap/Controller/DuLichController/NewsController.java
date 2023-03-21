package com.example.detaithuctap.Controller.DuLichController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class NewsController {
    @GetMapping("/contact")
    public String contactHome(HttpSession session){
        return "contact";
    }
    @GetMapping("/news")
    public String newsHome(HttpSession session){
        return "blog";
    }
}
