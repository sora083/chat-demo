package com.sora.socket.web.chatdemo.entity;

import lombok.Data;

@Data
public class RequestMessage {
    
    private String userName;
    private String content;
}
