/*
 * Copyright (c) 2022 . All rights reserved.
 * Created by MortalKim on 9/4/22, 4:42 PM
 * Email: jinhaihan@outlook.com
 * ProjectName: InfoScreen
 * FileName: AppBaseViewModel.kt
 * LastModified: 9/4/22, 4:09 PM
 *
 */

package com.kim.infoscreen.base.activity

import android.app.Application
import me.goldze.mvvmhabit.base.BaseViewModel

open class AppBaseViewModel<Model:AppBaseModel>: BaseViewModel<Model> {
    constructor(application: Application) : super(application)
    constructor(application: Application, model: Model) : super(application, model)
}