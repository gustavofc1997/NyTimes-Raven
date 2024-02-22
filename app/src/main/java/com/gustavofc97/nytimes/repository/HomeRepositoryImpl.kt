package com.gustavofc97.nytimes.repository

import com.gustavofc97.nytimes.data.dao.MessageDao
import com.gustavofc97.nytimes.data.entity.Message
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HomeRepositoryImpl @Inject constructor(
    private val messageDao: MessageDao
) : HomeRepository {
    override fun loadData(): Flow<Message?> {
        return messageDao.getMessage()
    }
}
