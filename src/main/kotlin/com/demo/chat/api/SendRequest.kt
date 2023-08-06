package com.demo.chat.api

import com.demo.chat.service.SendChatCommand

data class SendRequest(
    val message: String,
    val sender: String
) {
    fun toCommand(): SendChatCommand {
        return SendChatCommand(message, sender)
    }
}