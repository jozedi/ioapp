package com.jozedix.android.samples.ioapp.features.splash.presentation.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashViewModel : ViewModel() {

    val completed: LiveData<Boolean> get() = _completed
    private val _completed = MutableLiveData<Boolean>(false)

    init {
        viewModelScope.launch {
            delay(DELAY)
            _completed.postValue(true)
        }
    }

    companion object {
        private const val DELAY = 2000L
    }
}
