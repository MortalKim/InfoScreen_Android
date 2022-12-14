/*
 * Copyright (c) 2022 . All rights reserved.
 * ProjectName: InfoScreen
 * FileName: AppBaseViewModel.kt
 * URL: https://github.com/MortalKim/InfoScreen_Android
 * Email: jinhaihan@outlook.com
 * LastModified: 10/1/22, 3:34 PM
 *
 */

package com.kim.infoscreen.base.activity

import android.app.Application
import me.goldze.mvvmhabit.base.BaseViewModel

open class AppBaseViewModel<Model:AppBaseModel>: BaseViewModel<Model> {
    constructor(application: Application) : super(application)
    constructor(application: Application, model: Model) : super(application, model)
}