package com.demo.chat.api

import com.demo.chat.domain.Chat
import com.demo.chat.service.ChatService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/chats")
class ChatApi(
    private val chatService: ChatService,
) {
    @GetMapping
    fun findAll(): List<Chat> {
        return chatService.findAll()
    }

    @PostMapping
    fun send(@RequestBody request: SendRequest) {
        chatService.save(request.toCommand())
    }
}