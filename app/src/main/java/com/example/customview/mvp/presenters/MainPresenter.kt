package com.example.customview.mvp.presenters

import androidx.lifecycle.ViewModel
import com.example.customview.mvp.views.MainView

interface MainPresenter {

    fun initPresenter(view: MainView)
    fun onTapProfileImage()
    fun onTapCreateTask()
}