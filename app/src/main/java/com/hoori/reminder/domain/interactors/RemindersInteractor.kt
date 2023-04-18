package com.hoori.reminder.domain.interactors

import com.hoori.reminder.domain.models.ReminderModel
import com.hoori.reminder.domain.repository.ReminderRepository
import com.hoori.reminder.domain.usecase.ReminderUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RemindersInteractor @Inject constructor(
    private val reminderRepository: ReminderRepository
) : ReminderUseCase {

    override fun getReminders(): Flow<List<ReminderModel>> = reminderRepository.getReminders()

    override suspend fun insertReminder(model: ReminderModel) =
        reminderRepository.insertReminder(model)

    override suspend fun removeReminder(id: Int) = reminderRepository.removeReminder(id)

    override suspend fun changeReminder(model: ReminderModel) =
        reminderRepository.changeReminder(model)
}
