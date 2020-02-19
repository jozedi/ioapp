package com.jozedix.android.samples

object Deps {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:1.3.50"
    const val kotlinCoroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.3"
    const val kotlinCoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.3"

    object BuildPlugins {
        const val androidGradle = "com.android.tools.build:gradle:3.5.3"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.50"
        const val kotlinSerializationPlugin = "org.jetbrains.kotlin:kotlin-serialization:1.3.50"
        const val safeArgsPlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:2.2.0"
    }

    object Android {
        const val appCompat = "androidx.appcompat:appcompat:1.1.0"
        const val androidKTX = "androidx.core:core-ktx:1.3.0-alpha01"
        const val material = "com.google.android.material:material:1.2.0-alpha01"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.0-beta3"

        const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:2.2.1"
        const val navigationUI = "androidx.navigation:navigation-ui-ktx:2.2.1"

        const val multidex = "androidx.multidex:multidex:2.0.1"
    }

    object Libs {
        const val flexbox = "com.google.android:flexbox:1.0.0"
        const val coil = "io.coil-kt:coil:0.9.1"

        const val koin = "org.koin:koin-android:2.0.1"
        const val koinCore = "org.koin:koin-core:2.0.1"
        const val koinScope = "org.koin:koin-android-scope:2.0.1"
        const val koinViewModel = "org.koin:koin-android-viewmodel:2.0.1"

        const val workManager = "androidx.work:work-runtime:2.3.1"
        const val workManagerKTX = "androidx.work:work-runtime-ktx:2.3.1"
        const val crashActivity = "cat.ereza:customactivityoncrash:2.2.0"

        const val kotlinSerialization = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.9.1"

        // Data
        const val retrofit = "com.squareup.retrofit2:retrofit:2.7.1"
        const val retrofitKotlixConverter = "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.4.0"
        const val okHttp = "com.squareup.okhttp3:okhttp:3.10.0"
        const val okHttpInterceptor = "com.squareup.okhttp3:logging-interceptor:3.9.1"

        // Debug
        const val stetho = "com.facebook.stetho:stetho:1.5.0"

        const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:2.2.0"
        const val lifecycleViewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0"
        const val lifecycleLivedata = "androidx.lifecycle:lifecycle-livedata-ktx:2.2.0"

        const val roomRuntime = "androidx.room:room-runtime:2.2.3"
        const val roomKtx = "androidx.room:room-ktx:2.2.3"
        const val roomCompiler = "androidx.room:room-compiler:2.2.3"
    }

    object Test {
        const val junit = "junit:junit:4.12"
        const val koinTest = "org.koin:koin-test:2.0.1"
        const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:1.9.3"
        const val androidTestCore = "androidx.test:core:1.2.0"
        const val androidTestRunner = "androidx.test:runner:1.2.0"
        const val androidTestRules = "androidx.test:rules:1.2.0"
        const val androidArchTestCore = "android.arch.core:core-testing:1.1.1"
        const val kluent = "org.amshove.kluent:kluent-android:1.56"
        const val mockk = "io.mockk:mockk:1.9.3"
        const val mockkAndroid = "io.mockk:mockk-android:1.9.3"
        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.3.3"
        const val workManager = "androidx.work:work-testing:2.3.1"
    }
}
