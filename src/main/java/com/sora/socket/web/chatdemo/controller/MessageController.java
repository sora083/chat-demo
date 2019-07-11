package com.sora.socket.web.chatdemo.controller;

import com.sora.socket.web.chatdemo.entity.RequestMessage;
import com.sora.socket.web.chatdemo.entity.ResponseMessage;
import com.sora.socket.web.chatdemo.service.ChatService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MessageController {

    private final ChatService chatService;

    @MessageMapping("/message")
    @SendTo("/topic/message")
    public ResponseMessage greeting(RequestMessage requestMessage) {

        log.info("requestMessage: {}", requestMessage.toString());
        chatService.putMessage(requestMessage);

        return new ResponseMessage(requestMessage.getUserName(), requestMessage.getContent());
    }
}
