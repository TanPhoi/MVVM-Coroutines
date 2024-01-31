package com.example.mvvm_coroutines.ui.main

import com.example.mvvm_coroutines.data.local.AppPreferences
import com.example.mvvm_coroutines.ui.base.BaseViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val appPreferences: AppPreferences
) : BaseViewModel() {
    init {

    }
}