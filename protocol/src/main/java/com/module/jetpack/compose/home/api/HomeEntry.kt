package com.module.jetpack.compose.home.api

import com.module.jetpack.compose.common.ComposableFeatureEntry

abstract class HomeEntry : ComposableFeatureEntry {

    final override val featureRoute = "home-feature"

    fun route() = featureRoute
    fun startDestination() = "$featureRoute/"
    fun startDestinationInParent(parentName: String) = "$parentName$featureRoute/"
}