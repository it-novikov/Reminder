package com.hoori.reminder.data.repository

import com.hoori.reminder.domain.datasource.RemindersLocalDataSource
import com.hoori.reminder.domain.models.ReminderModel
import com.hoori.reminder.domain.repository.ReminderRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ReminderRepositoryImpl @Inject constructor(
    private val remindersLocalDataSource: RemindersLocalDataSource
) : ReminderRepository {

    override fun getReminders(): Flow<List<ReminderModel>> = remindersLocalDataSource.getReminders()

    override suspend fun insertReminder(model: ReminderModel) =
        remindersLocalDataSource.insertReminder(model)

    override suspend fun removeReminder(id: Int) = remindersLocalDataSource.removeReminder(id)

    override suspend fun changeReminder(model: ReminderModel) =
        remindersLocalDataSource.changeReminder(model)
}
