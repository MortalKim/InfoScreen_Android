/*
 * Copyright (c) 2022 . All rights reserved.
 * Created by MortalKim on 9/25/22, 9:11 PM
 * Email: jinhaihan@outlook.com
 * ProjectName: InfoScreen
 * FileName: MainViewModel.kt
 * LastModified: 9/25/22, 9:11 PM
 *
 */

package com.kim.infoscreen.ui.main

import android.app.Application
import android.view.View
import android.view.View.GONE
import androidx.databinding.ObservableByte
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import com.kim.infoscreen.base.activity.AppBaseViewModel
import me.goldze.mvvmhabit.binding.command.BindingAction

import me.goldze.mvvmhabit.binding.command.BindingCommand




class MainViewModel(application: Application):AppBaseViewModel<MainModel>(application,MainModel()) {
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
        textLunarVisibility.set(GONE)
        textYearVisibility.set(GONE)
        textMonthDay.set(showYear.get().toString())
    })

    var toCurrent: BindingCommand<*> = BindingCommand<Any?>(BindingAction {
        scrollToCurrentNotify.notifyChange()
    })
}