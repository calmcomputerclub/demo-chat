package com.demo.chat.service

import com.demo.chat.domain.Chat

data class SendChatCommand(
    val message: String,
    val sender: String
) {
    fun toEntity(): Chat {
        return Chat(message, sender)
    }
}
