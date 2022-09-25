/*
 * Copyright (c) 2022 . All rights reserved.
 * Created by MortalKim on 9/25/22, 9:51 PM
 * Email: jinhaihan@outlook.com
 * ProjectName: InfoScreen
 * FileName: BindingAdapter.kt
 * LastModified: 9/25/22, 9:51 PM
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