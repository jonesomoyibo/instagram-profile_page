package com.decagon.jones.weekthreetask

import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    public fun onClick(view: View): Unit {

        var isDarkTheme : Boolean
        switch_dark.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                isDarkTheme = true
                MainController.preferencePutBoolean("DarkTheme", true)
            } else {
                isDarkTheme = false
                MainController.preferencePutBoolean("DarkTheme", false)
            }
        })

    }

}