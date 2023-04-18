package com.hoori.reminder.domain.usecase

import com.hoori.reminder.domain.models.ReminderModel
import kotlinx.coroutines.flow.Flow

interface ReminderUseCase {

    fun getReminders(): Flow<List<ReminderModel>>
    suspend fun insertReminder(model: ReminderModel)
    suspend fun removeReminder(id: Int)
    suspend fun changeReminder(model: ReminderModel)
}