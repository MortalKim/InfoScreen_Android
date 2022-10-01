/*
 * Copyright (c) 2022 . All rights reserved.
 * ProjectName: InfoScreen
 * FileName: CalendarViewModel.kt
 * URL: https://github.com/MortalKim/InfoScreen_Android
 * Email: jinhaihan@outlook.com
 * LastModified: 10/1/22, 3:56 PM
 *
 */

package com.kim.infoscreen.ui.fragments.calendar

import android.app.Application
import android.util.Log
import android.view.View
import androidx.databinding.ObservableByte
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import com.haibin.calendarview.Calendar
import com.haibin.calendarview.CalendarView
import com.kim.infoscreen.base.fragment.AppBaseFragmentViewModel
import me.goldze.mvvmhabit.binding.command.BindingAction
import me.goldze.mvvmhabit.binding.command.BindingCommand

/**
 * File name: CalendarViewModel
 * Description: The Calendar fragment view's viewmodel
 * Creation Time: 10/1/2022 3:55 PM.
 *
 * @author Hayne Kim
 * @email jinhaihan@outlook.com
 */
class CalendarViewModel(application: Application):AppBaseFragmentViewModel<CalendarModel>(application, CalendarModel()),
    CalendarView.OnCalendarSelectListener,
    CalendarView.OnYearChangeListener,
    View.OnClickListener{

    var showYear = ObservableInt(0)
    var scrollToCurrentNotify = ObservableByte()
    var textLunarVisibility = ObservableField(View.VISIBLE)
    var textYearVisibility = ObservableField(View.VISIBLE)
    var textMonthVisibility = ObservableField(View.VISIBLE)
    var textMonthDay = ObservableField("123")
    var textYear = ObservableField("123")
    var textLunar = ObservableField("123")
    var textCurrentDay = ObservableField("123")


    var textMonthDayClickCommand: BindingCommand<*> = BindingCommand<Any?>(BindingAction {
        showYear.notifyChange()
        textLunarVisibility.set(View.GONE)
        textYearVisibility.set(View.GONE)
        textMonthDay.set(showYear.get().toString())
    })

    var toCurrent: BindingCommand<*> = BindingCommand<Any?>(BindingAction {
        scrollToCurrentNotify.notifyChange()
    })

    override fun onCalendarOutOfRange(calendar: Calendar?) {

    }

    override fun onCalendarSelect(calendar: Calendar, isClick: Boolean) {
        textLunarVisibility.set(View.VISIBLE)
        textYearVisibility.set(View.VISIBLE)
        textMonthDay.set(calendar.month.toString() + "/" + calendar.day + "  ")
        textYear.set(calendar.year.toString())
        textLunar.set(calendar.lunar)
        showYear.set(calendar.year)
        Log.e(
            "onDateSelected", "  -- " + calendar.year +
                    "  --  " + calendar.month +
                    "  -- " + calendar.day +
                    "  --  " + isClick + "  --   " + calendar.scheme
        )
    }

    override fun onYearChange(year: Int) {
        textMonthDay.set(year.toString())
    }

    override fun onClick(v: View?) {

    }
}