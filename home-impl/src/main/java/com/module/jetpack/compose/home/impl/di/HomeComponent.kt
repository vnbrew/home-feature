package com.module.jetpack.compose.home.impl.di

import com.module.jetpack.compose.common.di.FeatureScoped
import com.module.jetpack.compose.data.api.DataProvider
import com.module.jetpack.compose.home.api.HomeProvider
import com.module.jetpack.compose.home.impl.HomeViewModel
import dagger.Component


@FeatureScoped
@Component(
    dependencies = [DataProvider::class],
    modules = [HomeModule::class]
)
interface HomeComponent : HomeProvider {
    val viewModel: HomeViewModel
}