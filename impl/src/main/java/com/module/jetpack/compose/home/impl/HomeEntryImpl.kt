package com.module.jetpack.compose.home.impl

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.module.jetpack.compose.common.Destinations
import com.module.jetpack.compose.common.di.injectedViewModel
import com.module.jetpack.compose.data.api.LocalDataProvider
import com.module.jetpack.compose.home.api.HomeEntry
import com.module.jetpack.compose.home.impl.di.DaggerHomeComponent
import com.module.jetpack.compose.home.impl.ui.HomeScreen
import javax.inject.Inject

class HomeEntryImpl @Inject constructor() : HomeEntry() {

    @Composable
    override fun NavGraphBuilder.Composable(
        navController: NavHostController,
        destinations: Destinations,
        backStackEntry: NavBackStackEntry
    ) {
        val viewModel = injectedViewModel {
            DaggerHomeComponent.builder()
                .dataProvider(LocalDataProvider.current)
                .build()
                .viewModel
        }

        HomeScreen(viewModel, onUserSelected = {
        })
    }
}