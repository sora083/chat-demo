package com.sora.socket.web.chatdemo.controller;

import com.sora.socket.web.chatdemo.service.ChatService;
import javax.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class ChatController {
    
    private final ChatService chatService;

    @RequestMapping("/chat")
    public String index(HttpServletRequest request, Model model) {

        String userName = request.getRemoteUser();

        model.addAttribute("userName", userName);
        model.addAttribute("chatItems", chatService.loadPastMessage());

        return "chat";
    }
}
