package com.demo.chat.service

import com.demo.chat.domain.Chat
import com.demo.chat.repository.ChatRepository
import org.springframework.stereotype.Service

@Service
class ChatService(
    private val chatRepository: ChatRepository
) {
    fun save(command: SendChatCommand) {
        chatRepository.save(command.toEntity())
    }

    fun findAll(): List<Chat> {
        return chatRepository.findAll()
    }
}