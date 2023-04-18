package com.hoori.reminder.navigation

import javax.inject.Inject

sealed class Router @Inject constructor(
    val route: String
) {
    object ReminderList : Router(REMINDER_LIST)
    object NewReminder : Router(NEW_REMINDER)
    object DetailedReminder : Router(DETAILED_REMINDER)

    private companion object {
        const val REMINDER_LIST = "reminderListScreen"
        const val NEW_REMINDER = "newReminderScreen"
        const val DETAILED_REMINDER = "detailedReminderScreen"
    }
}
