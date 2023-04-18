package com.hoori.reminder.ui

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import com.hoori.reminder.navigation.AppNavGraph
import com.hoori.reminder.navigation.Router
import com.hoori.reminder.ui.screens.DetailedReminderScreen
import com.hoori.reminder.ui.screens.NewReminderScreen
import com.hoori.reminder.ui.screens.ReminderListScreen
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.qualifiers.ApplicationContext

@Composable
fun MainScreen() {
    val navHostController = rememberNavController()

    AppNavGraph(
        navController = navHostController,
        reminderListScreenContent = {
            ReminderListScreen {
                navHostController.navigate(Router.NewReminder.route)
            }
        },
        newReminderScreenContent = {
            NewReminderScreen {
                navHostController.navigate(Router.DetailedReminder.route)
            }
        },
        detailedReminderScreenContent = {
            DetailedReminderScreen {
                navHostController.navigate(Router.ReminderList.route)
            }
        }
    )
}