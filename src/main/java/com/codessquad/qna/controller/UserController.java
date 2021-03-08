package com.codessquad.qna.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @PostMapping("user/create")
    public String create(String userId, String password){
        System.out.println("userId: "+userId);
        return "welcome";

    }
}
