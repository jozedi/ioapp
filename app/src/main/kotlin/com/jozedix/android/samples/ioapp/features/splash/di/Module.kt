package com.jozedix.android.samples.ioapp.features.splash.di

import com.jozedix.android.samples.ioapp.features.splash.presentation.view.SplashViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

internal val splashModule = module {
    viewModel { SplashViewModel() }
}
