package com.jozedix.android.samples.core.utils

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes

fun ViewGroup.inflate(@LayoutRes layout: Int) =
    LayoutInflater.from(context).inflate(layout, this, false)

fun ViewGroup.inflate(layoutInflater: LayoutInflater, @LayoutRes layout: Int) =
    layoutInflater.inflate(layout, this, false)
