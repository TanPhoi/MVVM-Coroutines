package com.example.mvvm_coroutines.ui.home

import android.app.AlertDialog
import android.graphics.drawable.ColorDrawable
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.core.view.GravityCompat
import androidx.navigation.fragment.findNavController
import com.example.mvvm_coroutines.R
import com.example.mvvm_coroutines.databinding.FragmentHomeBinding
import com.example.mvvm_coroutines.ui.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    override fun layoutRes(): Int = R.layout.fragment_home

    override fun viewModelClass(): Class<HomeViewModel> = HomeViewModel::class.java

    override fun initView() {

    }
}