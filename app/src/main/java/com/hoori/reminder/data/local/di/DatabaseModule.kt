package com.hoori.reminder.data.local.di

import android.content.Context
import androidx.room.Room
import com.hoori.reminder.R
import com.hoori.reminder.data.local.room.RemindersDao
import com.hoori.reminder.data.local.room.RemindersDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context) = Room
        .databaseBuilder(context, RemindersDatabase::class.java, "reminders_database")
        .fallbackToDestructiveMigration()
        .build()

    @Provides
    fun provideRemindersDao(remindersDatabase: RemindersDatabase): RemindersDao =
        remindersDatabase.remindersDao()
}
