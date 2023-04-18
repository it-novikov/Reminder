package com.hoori.reminder.data.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hoori.reminder.data.local.entities.reminder.ReminderEntity

@Database(entities = [ReminderEntity::class], version = 1, exportSchema = false)
abstract class RemindersDatabase : RoomDatabase() {

    abstract fun remindersDao(): RemindersDao
}