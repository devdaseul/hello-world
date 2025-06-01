package com.lily.project.controller;

import com.lily.project.entity.Account;
import com.lily.project.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AlertController {

    @Autowired
    private AccountRepository accountRepository;

    // 회원가입 페이지
    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("account", new Account());
        return "home";
    }

    // 회원가입 정보 등록
    @PostMapping("/register")
    public String registerAccount(Account account, Model model) {
        accountRepository.save(account);  // DB에 insert

        model.addAttribute("message", "회원가입이 성공적으로 처리되었습니다!");
        model.addAttribute("searchUrl", "/home");

        return "message";
    }

    @GetMapping("/message")
    public String showMessage(Model model) {
        model.addAttribute("message", "성공적으로 처리되었습니다!");
        model.addAttribute("searchUrl", "/home");
        return "message";
    }
}