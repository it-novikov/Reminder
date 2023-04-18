package com.hoori.reminder.data.datasource.local

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.map
import com.hoori.reminder.data.local.entities.reminder.mappers.ReminderEntityToModelMapper
import com.hoori.reminder.data.local.entities.reminder.mappers.ReminderModelToEntityMapper
import com.hoori.reminder.data.local.room.RemindersDao
import com.hoori.reminder.domain.datasource.RemindersLocalDataSource
import com.hoori.reminder.domain.models.ReminderModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class RemindersLocalDataSourceImpl @Inject constructor(
    private val remindersDao: RemindersDao,
    private val reminderModelToEntityMapper: ReminderModelToEntityMapper,
    private val reminderEntityToModelMapper: ReminderEntityToModelMapper
) : RemindersLocalDataSource {

    override fun getReminders(): Flow<List<ReminderModel>> = remindersDao.getReminders().map { remindersList ->
        remindersList.map { entity ->
            reminderEntityToModelMapper.map(entity)
        }
    }

    override suspend fun insertReminder(model: ReminderModel) =
        remindersDao.insertReminder(reminderModelToEntityMapper.map(model))

    override suspend fun removeReminder(id: Int) = remindersDao.removeReminder(id)

    override suspend fun changeReminder(model: ReminderModel) =
        remindersDao.changeReminder(reminderModelToEntityMapper.map(model))
}
