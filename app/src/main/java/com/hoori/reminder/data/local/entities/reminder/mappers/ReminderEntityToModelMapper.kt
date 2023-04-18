package com.hoori.reminder.data.local.entities.reminder.mappers

import com.hoori.core.mapper.Mapper
import com.hoori.reminder.data.local.entities.reminder.ReminderEntity
import com.hoori.reminder.domain.models.ReminderModel
import javax.inject.Inject

class ReminderEntityToModelMapper @Inject constructor() : Mapper<ReminderEntity, ReminderModel> {

    override fun map(data: ReminderEntity): ReminderModel = ReminderModel(
        id           = data.id,
        title        = data.title,
        description  = data.description,
        reminderDate = data.reminderDate,
        reminderTime = data.reminderTime,
        repetition   = data.repetition
    )
}
