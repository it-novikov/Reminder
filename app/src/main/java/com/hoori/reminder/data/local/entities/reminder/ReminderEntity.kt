package com.hoori.reminder.data.local.entities.reminder

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.hoori.reminder.domain.models.RepetitionState

@Entity(tableName = "reminders")
data class ReminderEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")           val id: Int = 0,
    @ColumnInfo(name = "title")        val title: String,
    @ColumnInfo(name = "description")  val description: String? = null,
    @ColumnInfo(name = "reminderDate") val reminderDate: String,
    @ColumnInfo(name = "reminderTime") val reminderTime: String,
    @ColumnInfo(name = "repetition")   val repetition: RepetitionState? = null
)