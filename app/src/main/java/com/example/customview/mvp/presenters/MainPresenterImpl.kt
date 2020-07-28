package com.example.customview.mvp.presenters

import androidx.lifecycle.ViewModel
import com.example.customview.mvp.views.MainView

class MainPresenterImpl : MainPresenter, ViewModel(){


    private var mView: MainView?= null

    override fun initPresenter(view: MainView) {
        mView=view
    }

    override fun onTapProfileImage() {
        mView?.showProfile()
    }

    override fun onTapCreateTask() {
        mView?.navigateToCreateTask()
    }
}