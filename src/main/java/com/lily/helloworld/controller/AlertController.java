package com.lily.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlertController {

    @GetMapping("/message")
    public String showMessage(Model model) {
    	
        model.addAttribute("message", "성공적으로 처리되었습니다!");
        model.addAttribute("searchUrl", "/home");

        return "message"; // message.html
    }
    
    @GetMapping("/home")
    public String homePage(Model model) {

        return "home";  // home.html
    }
}