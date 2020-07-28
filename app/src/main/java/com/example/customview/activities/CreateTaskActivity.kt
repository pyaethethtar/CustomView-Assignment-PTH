package com.example.customview.activities

import android.app.DatePickerDialog
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.google.android.material.bottomsheet.BottomSheetDialog
import java.util.*
import android.widget.DatePicker
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.R
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.View
import java.text.SimpleDateFormat


class CreateTaskActivity : AppCompatActivity() {

    lateinit var myCalendar: Calendar


    companion object{
        fun newIntent(context: Context): Intent{
            return Intent(context, CreateTaskActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.customview.R.layout.activity_create_task)

        val dialogView = layoutInflater.inflate(com.example.customview.R.layout.bottom_sheet_description, null)
        val dialog = BottomSheetDialog(this)
        dialog.setContentView(dialogView)
        dialog.show()

       





    }




}
