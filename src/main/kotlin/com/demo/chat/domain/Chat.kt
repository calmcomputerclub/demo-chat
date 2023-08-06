package com.demo.chat.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
class Chat(
    message: String,
    sender: String,
    sentAt: LocalDateTime = LocalDateTime.now()
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0;

    val message: String = message;

    val sender: String = sender;

    val sentAt: LocalDateTime = sentAt
}