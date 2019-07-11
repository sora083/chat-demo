package com.sora.socket.web.chatdemo.repository;

import com.sora.socket.web.chatdemo.entity.ChatItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatItemRepository extends JpaRepository<ChatItem, Long> {
}
