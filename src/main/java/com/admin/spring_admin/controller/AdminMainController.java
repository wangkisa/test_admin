package com.admin.spring_admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminMainController {

    @GetMapping("/admin")
    public String admin_index() {
        return "/common/login";

    }
}