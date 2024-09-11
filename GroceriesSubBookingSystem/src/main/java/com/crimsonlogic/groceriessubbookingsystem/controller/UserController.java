package com.crimsonlogic.groceriessubbookingsystem.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crimsonlogic.groceriessubbookingsystem.entity.Users;
import com.crimsonlogic.groceriessubbookingsystem.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService usersService;

    @GetMapping("/signup")
    public String showSignUpForm(Model model) {
        model.addAttribute("user", new Users());
        return "signup";
    }

    @PostMapping("/signup")
    public String registerUser(@ModelAttribute("user") Users user, Model model) {
        usersService.registerUser(user);
        model.addAttribute("message", "User registered successfully!");
        return "login";
    }

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new Users());
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@ModelAttribute("user") Users user, Model model) {
        Optional<Users> loggedInUser = usersService.loginUser(user.getUserEmail(), user.getUserPassword());
        if (loggedInUser.isPresent()) {
             user = loggedInUser.get();
            model.addAttribute("user", user);
            if ("seller".equalsIgnoreCase(user.getUserRole())) {
                return "seller";
            } else if ("customer".equalsIgnoreCase(user.getUserRole())) {
                return "customer";
            } else {
                model.addAttribute("error", "Unknown user role");
                return "login";
            }
        } else {
            model.addAttribute("error", "Invalid email or password");
            return "login";
        }
    }

    @GetMapping("/profile")
    public String showProfileForm(@RequestParam("id") String userId, Model model) {
        Optional<Users> user = usersService.getUserById(userId);
        user.ifPresent(value -> model.addAttribute("user", value));
        return "profile";
    }

    @PostMapping("/profile")
    public String updateUser(@ModelAttribute("user") Users user, Model model) {
        usersService.updateUser(user.getUser_id(), user);
        model.addAttribute("message", "Profile updated successfully!");
        return "profile";
    }
}
