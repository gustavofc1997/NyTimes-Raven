package com.gustavofc97.nytimes.repository

import com.gustavofc97.nytimes.data.entity.Message
import kotlinx.coroutines.flow.Flow

interface HomeRepository {
    fun loadData(): Flow<Message?>
}
