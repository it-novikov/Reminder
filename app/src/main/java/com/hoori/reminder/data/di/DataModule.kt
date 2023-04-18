package com.hoori.reminder.data.di

import com.hoori.reminder.data.datasource.local.RemindersLocalDataSourceImpl
import com.hoori.reminder.data.repository.ReminderRepositoryImpl
import com.hoori.reminder.domain.datasource.RemindersLocalDataSource
import com.hoori.reminder.domain.repository.ReminderRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    abstract fun bindRepository(impl: ReminderRepositoryImpl) : ReminderRepository

    @Binds
    abstract fun bindLocalDataSource(impl: RemindersLocalDataSourceImpl) : RemindersLocalDataSource
}
