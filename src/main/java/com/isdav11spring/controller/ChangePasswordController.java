package com.isdav11spring.controller;

import com.isdav11spring.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class ChangePasswordController {

    private final CustomerService customerService;


    @GetMapping("/change-password")
    public String changePassword() {
        return "change-password";
    }

    @PostMapping("/change-password")
    public String changePasswordRequest(@RequestParam("email") String email, Model model) {
        model.addAttribute("email", email);
        return customerService.changePassword(email);
    }
}
