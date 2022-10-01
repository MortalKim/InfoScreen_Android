/*
 * Copyright (c) 2022 . All rights reserved.
 * ProjectName: InfoScreen
 * FileName: MainActivity.kt
 * URL: https://github.com/MortalKim/InfoScreen_Android
 * Email: jinhaihan@outlook.com
 * LastModified: 10/1/22, 3:34 PM
 *
 */

package com.kim.infoscreen.ui.main

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.databinding.Observable
import androidx.databinding.Observable.OnPropertyChangedCallback
import com.haibin.calendarview.Calendar
import com.haibin.calendarview.CalendarView.OnCalendarSelectListener
import com.haibin.calendarview.CalendarView.OnYearChangeListener
import com.kim.infoscreen.BR
import com.kim.infoscreen.R
import com.kim.infoscreen.base.activity.AppBaseActivity
import com.kim.infoscreen.databinding.ActivityMainBinding


class MainActivity : AppBaseActivity<ActivityMainBinding,MainViewModel>() ,
    OnCalendarSelectListener,
    OnYearChangeListener,
    View.OnClickListener {

    private var mYear = 0

    private val onPropertyChangedCallback = object : OnPropertyChangedCallback() {
        override fun onPropertyChanged(sender: Observable?, propertyId: Int) {
            when (sender) {
                viewModel.showYear -> {
                    binding.calendarView.showYearSelectLayout(viewModel.showYear.get())
                }
                viewModel.scrollToCurrentNotify -> {
                    binding.calendarView.scrollToCurrent()
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        super.onCreate(savedInstanceState)

        initView()
        initData2()
        }

    override fun initContentView(savedInstanceState: Bundle?): Int {
        return R.layout.activity_main
    }

    override fun initVariableId(): Int {
        return BR.mainViewModel
    }

    override fun initViewModel(): MainViewModel {
        return MainViewModel(application)
    }

    @SuppressLint("SetTextI18n")
    fun initView() {
        viewModel.textYear.set(binding.calendarView.curYear.toString())
        viewModel.showYear.set(binding.calendarView.curYear)
        viewModel.textMonthDay.set(binding.calendarView.curMonth.toString() + "/" + binding.calendarView.curDay + "  ")
        viewModel.textLunar.set("Today")
        viewModel.textCurrentDay.set(binding.calendarView.curDay.toString())
    }

    fun initData2() {
        viewModel.showYear.addOnPropertyChangedCallback(onPropertyChangedCallback)
        viewModel.scrollToCurrentNotify.addOnPropertyChangedCallback(onPropertyChangedCallback)


        val year = binding.calendarView.curYear
        val month = binding.calendarView.curMonth
        val map: MutableMap<String, Calendar> = HashMap()
        map[getSchemeCalendar(year, month, 3, -0xbf24db, "text").toString()] =
            getSchemeCalendar(year, month, 3, -0xbf24db, "text")
        map[getSchemeCalendar(year, month, 6, -0x196ec8, "text").toString()] =
            getSchemeCalendar(year, month, 6, -0x196ec8, "text")
        map[getSchemeCalendar(year, month, 9, -0x20ecaa, "text").toString()] =
            getSchemeCalendar(year, month, 9, -0x20ecaa, "text")
        map[getSchemeCalendar(year, month, 13, -0x123a93, "text").toString()] =
            getSchemeCalendar(year, month, 13, -0x123a93, "text")
        map[getSchemeCalendar(year, month, 14, -0x123a93, "text").toString()] =
            getSchemeCalendar(year, month, 14, -0x123a93, "text")
        map[getSchemeCalendar(year, month, 15, -0x5533bc, "text").toString()] =
            getSchemeCalendar(year, month, 15, -0x5533bc, "text")
        map[getSchemeCalendar(year, month, 18, -0x43ec10, "text").toString()] =
            getSchemeCalendar(year, month, 18, -0x43ec10, "text")
        map[getSchemeCalendar(year, month, 22, -0x20ecaa, "text").toString()] =
            getSchemeCalendar(year, month, 22, -0x20ecaa, "text")
        map[getSchemeCalendar(year, month, 25, -0xec5310, "text").toString()] =
            getSchemeCalendar(year, month, 25, -0xec5310, "text")
        map[getSchemeCalendar(year, month, 27, -0xec5310, "text").toString()] =
            getSchemeCalendar(year, month, 27, -0xec5310, "text")

        binding.calendarView.setSchemeDate(map)
    }

    private fun getSchemeCalendar(
        year: Int,
        month: Int,
        day: Int,
        color: Int,
        text: String
    ): Calendar {
        val calendar = Calendar()
        calendar.year = year
        calendar.month = month
        calendar.day = day
        calendar.schemeColor = color //if set color, mark will be this color
        calendar.scheme = text
        calendar.addScheme(color, "假")
        calendar.addScheme(if (day % 2 == 0) -0xff3300 else -0x2ea012, "节")
        calendar.addScheme(if (day % 2 == 0) -0x9a0000 else -0xbe961f, "记")
        return calendar
    }

    override fun onCalendarOutOfRange(calendar: Calendar?) {}

    @SuppressLint("SetTextI18n")
    override fun onCalendarSelect(calendar: Calendar, isClick: Boolean) {
        binding.tvLunar.visibility = View.VISIBLE
        binding.tvYear.visibility = View.VISIBLE
        binding.tvMonthDay.text = calendar.month.toString() + "/" + calendar.day + "  "
        binding.tvYear.text = calendar.year.toString()
        binding.tvLunar.text = calendar.lunar
        mYear = calendar.year
        Log.e(
            "onDateSelected", "  -- " + calendar.year +
                    "  --  " + calendar.month +
                    "  -- " + calendar.day +
                    "  --  " + isClick + "  --   " + calendar.scheme
        )
    }

    override fun onYearChange(year: Int) {
        binding.tvMonthDay.text = year.toString()
    }

    override fun onClick(view: View?) {}

    override fun onPointerCaptureChanged(hasCapture: Boolean) {
        super.onPointerCaptureChanged(hasCapture)
    }
}