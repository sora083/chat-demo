package com.sora.socket.web.chatdemo.entity;

import lombok.Data;

@Data
public class ChatItem {
    
    private String userName;
    private long commented_datetime;
    private String message;
}
