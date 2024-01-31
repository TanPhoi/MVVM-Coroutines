package com.example.mvvm_coroutines.ui.splash

import android.os.CountDownTimer
import android.os.Handler
import androidx.navigation.fragment.findNavController
import com.example.mvvm_coroutines.R
import com.example.mvvm_coroutines.databinding.FragmentSplashBinding
import com.example.mvvm_coroutines.ui.base.BaseFragment
import java.lang.ref.WeakReference

class SplashFragment : BaseFragment<FragmentSplashBinding, SplashViewModel>() {
    companion object {
        const val TIMER_DURATION = 5000L
        const val TIMER_COUNT_DOWN = 1000L
    }

    private var countIndex = 0
    private var countDownTimer: WeakReference<CountDownTimer>? = null

    override fun layoutRes(): Int = R.layout.fragment_splash

    override fun viewModelClass(): Class<SplashViewModel> = SplashViewModel::class.java

    override fun initView() {
        Handler().postDelayed({
            findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
        }, 1000)
    }


}