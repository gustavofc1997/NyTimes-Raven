package com.gustavofc97.nytimes.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.gustavofc97.nytimes.data.dao.MessageDao
import com.gustavofc97.nytimes.data.entity.Message

@Database(
    version = 1,
    entities = [Message::class],
    exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun messageDao(): MessageDao
}
