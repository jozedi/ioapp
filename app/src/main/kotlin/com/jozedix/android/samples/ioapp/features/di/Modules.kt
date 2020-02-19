package com.jozedix.android.samples.ioapp.features.di

import com.jozedix.android.samples.ioapp.features.splash.di.splashModule
import com.jozedix.android.samples.ioapp.utils.listByElementsOf
import org.koin.core.module.Module

internal val featureModules by lazy {
    listByElementsOf<Module>(
        splashModule
    )
}
