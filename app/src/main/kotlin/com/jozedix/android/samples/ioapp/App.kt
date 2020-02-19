package com.jozedix.android.samples.ioapp

import androidx.multidex.MultiDexApplication
import com.jozedix.android.samples.ioapp.di.injectModules

open class App : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        initializeKoin()
    }

    private fun initializeKoin() {
        injectModules(this)
    }
}
