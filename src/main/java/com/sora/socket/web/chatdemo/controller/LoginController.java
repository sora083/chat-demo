package com.sora.socket.web.chatdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        log.info("call /login");
        return "login";
    }
}
