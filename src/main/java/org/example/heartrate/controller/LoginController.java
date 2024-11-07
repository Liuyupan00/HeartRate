package org.example.heartrate.controller;

import org.example.heartrate.entity.ResultEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class LoginController {

    @PostMapping("/login")
    public String login() {

        return "login";
    }

    @GetMapping("/data")
    public String data() {

        return "data";
    }
}
