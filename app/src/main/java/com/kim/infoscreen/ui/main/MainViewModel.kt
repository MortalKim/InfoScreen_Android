/*
 * Copyright (c) 2022 . All rights reserved.
 * ProjectName: InfoScreen
 * FileName: MainViewModel.kt
 * URL: https://github.com/MortalKim/InfoScreen_Android
 * Email: jinhaihan@outlook.com
 * LastModified: 10/1/22, 3:34 PM
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

}