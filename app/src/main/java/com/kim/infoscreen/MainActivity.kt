/*
 * Copyright (c) 2022 . All rights reserved.
 * Created by MortalKim on 9/4/22, 4:43 PM
 * Email: jinhaihan@outlook.com
 * ProjectName: InfoScreen
 * FileName: MainActivity.kt
 * LastModified: 9/4/22, 3:59 PM
 *
 */

package com.kim.infoscreen

import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main)
    }
}