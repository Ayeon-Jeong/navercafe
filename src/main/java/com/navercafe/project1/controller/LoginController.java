package com.navercafe.project1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @GetMapping("/login.do")
    public String loginController() {
        return "login";

    }

    @GetMapping("/print.do")
    public String printController(HttpServletRequest request) {
        System.out.println(request.getParameter("username"));
        System.out.println(request.getParameter("password"));
        return "login";
    }
}
