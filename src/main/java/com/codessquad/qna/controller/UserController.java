package com.codessquad.qna.controller;

import com.codessquad.qna.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    private List<User> users = new ArrayList<>();

    @PostMapping("/user/create")
    public String create(User user){
        users.add(user);
        System.out.println("User : "+user);
        return "redirect:/user/list";
    }

    @GetMapping("/user/list")
    public String list(Model model){
        model.addAttribute("users", users);
        return "/user/list";
    }
}
