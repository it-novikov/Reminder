package com.hoori.reminder.domain.models

data class ReminderModel(
    val id: Int = 0,
    val title: String,
    val description: String? = null,
    val reminderDate: String,
    val reminderTime: String,
    val repetition: RepetitionState? = null
)
