package com.hoori.reminder.ui

import androidx.lifecycle.ViewModel
import com.hoori.reminder.domain.interactors.RemindersInteractor
import com.hoori.reminder.domain.models.ReminderModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val remindersInteractor: RemindersInteractor
) : ViewModel() {

    private val _reminders = MutableSharedFlow<List<ReminderModel>>()
    val reminders: SharedFlow<List<ReminderModel>> = _reminders
}
