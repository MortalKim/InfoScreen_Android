/*
 * Copyright (c) 2022 . All rights reserved.
 * ProjectName: InfoScreen
 * FileName: CustomBindingAdapter.kt
 * URL: https://github.com/MortalKim/InfoScreen_Android
 * Email: jinhaihan@outlook.com
 * LastModified: 10/1/22, 3:34 PM
 *
 */

package com.kim.infoscreen.base.binding

import androidx.databinding.BindingAdapter
import com.haibin.calendarview.CalendarView

//FileName: BindingAdapter
//Description: Custom binding adapter

object CustomBindingAdapter {
    @BindingAdapter(
        value = ["showYear"]
    )
    @JvmStatic
    fun calendarViewShowYearSelectLayout(view: CalendarView, showYear:Int) {
        view.showYearSelectLayout(showYear)
    }
}