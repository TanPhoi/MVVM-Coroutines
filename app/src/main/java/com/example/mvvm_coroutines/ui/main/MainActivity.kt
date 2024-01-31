package com.example.mvvm_coroutines.ui.main

import com.example.mvvm_coroutines.R
import com.example.mvvm_coroutines.databinding.ActivityMainBinding
import com.example.mvvm_coroutines.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {
    override fun layoutRes(): Int = R.layout.activity_main

    override fun viewModelClass(): Class<MainViewModel> = MainViewModel::class.java

    override fun initView() {

    }

}