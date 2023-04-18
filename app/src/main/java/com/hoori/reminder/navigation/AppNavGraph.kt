package com.hoori.reminder.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavGraph(
    navController: NavHostController,
    reminderListScreenContent: @Composable () -> Unit,
    newReminderScreenContent: @Composable () -> Unit,
    detailedReminderScreenContent: @Composable () -> Unit,
) {
    NavHost(
        navController = navController,
        startDestination = Router.ReminderList.route
    ) {
        composable(route = Router.ReminderList.route) {
            reminderListScreenContent()
        }
        composable(route = Router.NewReminder.route) {
            newReminderScreenContent()
        }
        composable(route = Router.DetailedReminder.route) {
            detailedReminderScreenContent()
        }
    }
}
