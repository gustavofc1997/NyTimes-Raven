package com.gustavofc97.nytimes.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Message(
    @PrimaryKey(autoGenerate = true)
    val messageId: Long = 0,
    val text: String
)
