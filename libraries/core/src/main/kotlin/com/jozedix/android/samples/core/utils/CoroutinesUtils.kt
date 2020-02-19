package com.jozedix.android.samples.core.utils

import kotlinx.coroutines.*

suspend fun CoroutineScope.io(f: suspend () -> Unit) {
    withContext(Dispatchers.IO) { f.invoke() }
}

suspend fun CoroutineScope.ui(f: suspend () -> Unit) {
    withContext(Dispatchers.Main) { f.invoke() }
}

fun Any.default(f: suspend () -> Unit) {
    GlobalScope.launch(Dispatchers.Default) {
        f.invoke()
    }
}

fun Any.ui(f: suspend () -> Unit) {
    GlobalScope.launch(Dispatchers.Main) {
        f.invoke()
    }
}

fun Any.io(f: suspend () -> Unit) {
    GlobalScope.launch(Dispatchers.IO) {
        f.invoke()
    }
}
