package com.hoori.reminder.data.local.room

import androidx.room.*
import com.hoori.reminder.data.local.entities.reminder.ReminderEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface RemindersDao {

    @Query("SELECT * FROM reminders")
    fun getReminders(): Flow<List<ReminderEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertReminder(model: ReminderEntity)

    @Query("DELETE FROM reminders WHERE id = :id")
    suspend fun removeReminder(id: Int)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun changeReminder(model: ReminderEntity)
}