package com.lily.project.controller;

import com.lily.project.entity.Account;
import com.lily.project.repository.AccountRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class AlertController {

    @Autowired
    private AccountRepository accountRepository;

    // 기본 페이지 = 로그인 페이지로 설정
    @GetMapping("/")
    public String indexRedirect() {
        return "redirect:/login";
    }

    // 로그인 페이지
    @GetMapping("/login")
    public String loginPage(Model model) {
        model.addAttribute("account", new Account());
        return "login";
    }

    // 로그인 처리(POST 방식)
    @PostMapping("/login")
    public String login(@ModelAttribute Account account, Model model, HttpSession session) {
        Optional<Account> optional = accountRepository.findByAccountId(account.getAccountId());

        if (optional.isEmpty()) {
            // 입력한 아이디가 DB에 없는 정보일 경우
        	model.addAttribute("message", "존재하지 않는 ID 입니다.");
        	model.addAttribute("account", new Account());
            return "login";
        }

        Account dbAccount = optional.get();

        if (account.getPassword().equals(dbAccount.getPassword())) {
            // 로그인 성공 시 세션 저장 후 hello 페이지로 이동
            session.setAttribute("accountId", dbAccount.getAccountId());
            return "redirect:/hello";
        }

        // 비밀번호 틀린 경우
        model.addAttribute("message", "비밀번호가 틀렸습니다.");
        return "login";
    }
    
    // 로그인 성공 후 hello 페이지(GET 방식)
    @GetMapping("/hello")
    public String helloPage(Model model) {
        model.addAttribute("message", "로그인을 성공했습니다!");
        return "hello";
    }

    // 회원가입 페이지
    @GetMapping("/register")
    public String homePage(Model model) {
        model.addAttribute("account", new Account());
        return "register";
    }

    // 회원가입 성공 후 로그인 페이지
    @PostMapping("/register")
    public String registerAccount(Account account, Model model) {
        accountRepository.save(account);
        model.addAttribute("message", "회원가입이 성공적으로 처리되었습니다!");
        return "login";
    }

    // 메시지 출력
    @GetMapping("/message")
    public String showMessage(@RequestParam String message,
            @RequestParam String searchUrl,
            Model model) {
        model.addAttribute("message", message);
        model.addAttribute("searchUrl", searchUrl);
        return "message";
    }
}