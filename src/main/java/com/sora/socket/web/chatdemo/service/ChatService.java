package com.sora.socket.web.chatdemo.service;

import com.sora.socket.web.chatdemo.entity.ChatItem;
import com.sora.socket.web.chatdemo.entity.RequestMessage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    //@Autowired
    //private DynamoDBAPI dynamoDBAPI;

    public List<ChatItem> loadPastMessage() {

        // TODO
        List<ChatItem> chatItems = new ArrayList<>();
        Collections.reverse(chatItems);

        return chatItems;
    }

    public void putMessage(RequestMessage requestMessage) {

        ChatItem chatItem = new ChatItem();
        chatItem.setUserName(requestMessage.getUserName());
        chatItem.setMessage(requestMessage.getContent());

        //dynamoDBAPI.put(chatItem);
    }
}
