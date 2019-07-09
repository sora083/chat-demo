package com.sora.socket.web.chatdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseMessage {
    
    private String userName;
    private String content;
}
