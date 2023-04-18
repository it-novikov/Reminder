package com.hoori.reminder.domain.di

import com.hoori.reminder.domain.interactors.RemindersInteractor
import com.hoori.reminder.domain.usecase.ReminderUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DomainModule {

    @Binds
    abstract fun bindReminderUseCase(impl: RemindersInteractor): ReminderUseCase
}