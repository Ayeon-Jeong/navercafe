package com.navercafe.project1.controller;

import com.navercafe.project1.member.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
public class LoginController {

    @GetMapping("/login.do")
    public String login() {
        return "login";

    }

    @PostMapping("/print.do")
    public String print(@ModelAttribute Member member, Model model) {
        log.info("{},{}",member.getUsername(),member.getPassword());

        return "print";
    }

    @ResponseBody
    @PostMapping("/print.json")
    public Member print(@RequestBody Member member) {
        member.setPassword("1234");
        return member;
    }
}




