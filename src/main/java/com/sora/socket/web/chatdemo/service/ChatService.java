package com.sora.socket.web.chatdemo.service;

import com.sora.socket.web.chatdemo.entity.ChatItem;
import com.sora.socket.web.chatdemo.entity.RequestMessage;
import com.sora.socket.web.chatdemo.repository.ChatItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatService {

    private final ChatItemRepository chatItemRepository;

    public List<ChatItem> loadPastMessage() {

        List<ChatItem> chatItems = chatItemRepository.findAll();
        Collections.reverse(chatItems);

        return chatItems;
    }

    public void putMessage(RequestMessage requestMessage) {

        LocalDateTime now = LocalDateTime.now();

        ChatItem chatItem = new ChatItem();
        chatItem.setUserName(requestMessage.getUserName());
        chatItem.setCommented_datetime(now);
        chatItem.setMessage(requestMessage.getContent());

        chatItemRepository.save(chatItem);
    }
}
