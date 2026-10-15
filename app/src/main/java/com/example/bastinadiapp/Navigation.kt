package com.example.bastinadiapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.bastinadiapp.ui.theme.AttractionDetailsScreen
import com.example.bastinadiapp.ui.theme.CityScreen
import com.example.bastinadiapp.ui.theme.TripScreen

object Routes {
    const val HOME_SCREEN = "CityScreen"
    const val SCREEN_ATTRACTION_DETAILS = "AttractionDetails/{attractionId}"
    const val TRIP_SCREEN = "TripScreen"

    fun getAttractionDetailsPath(attractionId: Int?) : String {
        if (attractionId != null && attractionId != -1) {
            return "AttractionDetails/$attractionId"
        }
        return "AttractionDetails/0"
    }

}

@Composable
fun NavigationController() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.HOME_SCREEN) {

        composable(Routes.HOME_SCREEN) {
            CityScreen(
                navigation = navController
            )
        }
        composable(Routes.TRIP_SCREEN) {
            TripScreen(
                navigation = navController
            )
        }

        composable(
            "AttractionDetails/{attractionId}",
            arguments = listOf(
                navArgument("attractionId") {
                    type = NavType.IntType
                }
            )
        ) {navBackStackEntry ->
            navBackStackEntry.arguments?.getInt("attractionId")?.let {
                AttractionDetailsScreen(
                    navigation = navController,
                    attractionId = it
                )
            }
        }
    }
}