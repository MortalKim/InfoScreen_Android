/*
 * Copyright (c) 2022 . All rights reserved.
 * Created by MortalKim on 9/4/22, 4:44 PM
 * Email: jinhaihan@outlook.com
 * ProjectName: InfoScreen
 * FileName: AppBaseFragmentViewModel.kt
 * LastModified: 9/4/22, 4:44 PM
 *
 */

package com.kim.infoscreen.base.fragment

import android.app.Application
import me.goldze.mvvmhabit.base.BaseViewModel

class AppBaseFragmentViewModel<Model : AppBaseFragmentModel?> : BaseViewModel<Model> {
    constructor(application: Application) : super(application)
    constructor(application: Application, model: Model) : super(application, model)

}