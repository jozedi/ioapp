package com.jozedix.android.samples.ioapp.di

import android.app.Application
import com.jozedix.android.samples.ioapp.features.di.featureModules
import com.jozedix.android.samples.ioapp.utils.listByElementsOf
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.module.Module

internal fun injectModules(app: Application) {
    startKoin {
        androidLogger()
        androidContext(app)
        modules(baseModules)
    }
}

val baseModules by lazy {
    listByElementsOf<Module>(
        featureModules
    )
}


