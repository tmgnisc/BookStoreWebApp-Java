package com.BookStoreLearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.BookStoreLearning.entity.loginUser;
import com.BookStoreLearning.repository.userRepository;

public class userController {

	 @Autowired
	    private userRepository userrepository;

	    @GetMapping("/signup")
	    public String signupForm() {
	        return "signup";
	    }

	    @PostMapping("/signup")
	    public String signupSubmit(@RequestParam String username, @RequestParam String password) {
	        loginUser user = new loginUser();
	        user.setUsername(username);
	        user.setPassword(password);
	        userrepository.save(user);
	        return "redirect:/login";
	    }
	}