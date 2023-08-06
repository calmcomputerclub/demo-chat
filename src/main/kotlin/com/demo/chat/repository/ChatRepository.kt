package com.demo.chat.repository

import com.demo.chat.domain.Chat
import org.springframework.data.jpa.repository.JpaRepository

interface ChatRepository : JpaRepository<Chat, Long> {
}