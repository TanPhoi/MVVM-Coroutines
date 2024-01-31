package com.example.mvvm_coroutines.ui.splash

import com.example.mvvm_coroutines.data.local.AppPreferences
import com.example.mvvm_coroutines.ui.base.BaseViewModel
import javax.inject.Inject

class SplashViewModel @Inject constructor(
    private val appPreferences: AppPreferences
) : BaseViewModel() {
    init {

    }

    fun getFirstScreen(): Boolean {
        return appPreferences.getFirstScreen()
    }

}