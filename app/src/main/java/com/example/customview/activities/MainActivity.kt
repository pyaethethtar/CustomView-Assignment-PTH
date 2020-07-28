package com.example.customview.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.example.customview.R
import com.example.customview.adapter.TabPagerAdapter
import com.example.customview.mvp.presenters.MainPresenter
import com.example.customview.mvp.presenters.MainPresenterImpl
import com.example.customview.mvp.views.MainView
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottom_sheet_profile.*

class MainActivity : AppCompatActivity(), MainView {

    lateinit var mPresenter: MainPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpPresenter()
        setUpListener()




    }

    private fun setUpPresenter(){
        mPresenter = ViewModelProviders.of(this).get(MainPresenterImpl::class.java)
        mPresenter.initPresenter(this)
    }

    private fun setUpListener(){
        ivGoToProfile.setOnClickListener {
            mPresenter.onTapProfileImage()
        }
        ivGoToProfile1.setOnClickListener {
            mPresenter.onTapProfileImage()
        }
        ivGoToProfile2.setOnClickListener {
            mPresenter.onTapProfileImage()
        }
        ivGotoCreateTask.setOnClickListener {
            mPresenter.onTapCreateTask()
        }
    }


    override fun showProfile() {
        val pagerAdapter = TabPagerAdapter(supportFragmentManager)
        pager.adapter=pagerAdapter
        tabLayout.setupWithViewPager(pager)

        val sheet = BottomSheetBehavior.from(bottom_sheet)
        val dialogView = layoutInflater.inflate(R.layout.bottom_sheet_profile, null)
        val dialog = BottomSheetDialog(this)
        dialog.setContentView(dialogView)
        dialog.show()
    }

    override fun navigateToCreateTask() {
        startActivity(CreateTaskActivity.newIntent(this))
    }
}
