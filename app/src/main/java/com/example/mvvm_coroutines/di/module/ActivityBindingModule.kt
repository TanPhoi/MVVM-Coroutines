package com.example.mvvm_coroutines.di.module

import com.example.mvvm_coroutines.ui.home.HomeFragment
import com.example.mvvm_coroutines.ui.main.MainActivity
import com.example.mvvm_coroutines.ui.splash.SplashFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {
    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun bindSplashFragment(): SplashFragment

    @ContributesAndroidInjector
    abstract fun bindHomeFragment(): HomeFragment

}