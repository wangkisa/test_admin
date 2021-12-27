package com.admin.spring_admin.controller;

import com.admin.spring_admin.service.AdminCommonIF;
import com.admin.spring_admin.service.commonImpl.AdminCommonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminMainController {

    @GetMapping("/admin")
    public String admin_index() {
        return "/common/login";
    }

    @GetMapping("/admin_login")
    public String admin_login() {
        System.out.println("call admin_login()");
        return "redirect:userMainPage";
//        if (adminCommonService.isAuthenticated()) {
//            return "redirect:userMainPage";
//        }
//        return "/common/login";
    }

    @GetMapping("/userMainPage")
    public String getUserPage() {
        System.out.println("call userMainPage()");
        return "/main/index";
    }
}