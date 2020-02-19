package com.jozedix.android.samples

object Config {
    const val applicationId = "com.jozedix.android.samples.ioapp"
    const val appName = "App Development"
    const val minimumSdk = 21
    const val compileSdk = 29
    const val targetSdk = 29
    const val versionMajor = 0
    const val versionMinor = 1
    const val versionPatch = 0
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    object Repository {
        const val jitpack = "https://jitpack.io"
        const val google = "https://maven.google.com/"
        const val kotlinx = "https://kotlin.bintray.com/kotlinx"
    }

    object Packaging {
        val excludes = arrayOf(
            "LICENSE.txt",
            "META-INF/DEPENDENCIES",
            "META-INF/ASL2.0",
            "META-INF/NOTICE",
            "META-INF/LICENSE"
        )
    }
}
