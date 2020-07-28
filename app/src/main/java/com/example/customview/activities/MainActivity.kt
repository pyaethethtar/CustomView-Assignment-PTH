package com.example.customview.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customview.R
import com.example.customview.adapter.TabPagerAdapter
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottom_sheet_profile.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sheet = BottomSheetBehavior.from(bottom_sheet)
        val dialogView = layoutInflater.inflate(R.layout.bottom_sheet_profile, null)
        val dialog = BottomSheetDialog(this)
        dialog.setContentView(dialogView)

        ivGoToProfile.setOnClickListener {

            dialog.show()
        }
        ivGoToProfile1.setOnClickListener {
            dialog.show()
        }
        ivGoToProfile2.setOnClickListener {
            dialog.show()
        }
        ivGotoCreateTask.setOnClickListener {
            startActivity(CreateTaskActivity.newIntent(this))
        }

        val pagerAdapter = TabPagerAdapter(supportFragmentManager)
        pager.adapter=pagerAdapter
        tabLayout.setupWithViewPager(pager)

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabSelected(tab: TabLayout.Tab?) {

            }

        })


    }
}
