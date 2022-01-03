package com.admin.spring_admin.controller;

import com.admin.spring_admin.service.AdminCommonIF;
//import com.admin.spring_admin.service.commonImpl.AdminCommonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/admin")
public class AdminMainController {

    @GetMapping("")
    public String admin_index() {
        return "/common/login";
    }

    @GetMapping("/perform_login")
    public String perform_login() {
        System.out.println("call admin_login()");
        return "redirect:/admin/main";
//        if (adminCommonService.isAuthenticated()) {
//            return "redirect:userMainPage";
//        }
//        return "/common/login";
    }

    @GetMapping("/main")
    public String getUserPage() {
        System.out.println("call userMainPage()");
        return "/main/index";
    }

    @GetMapping("/test_user")
    public String getUserTestPage() {
        System.out.println("call userMainPage2222()");
        return "/user/user_list";
    }
}