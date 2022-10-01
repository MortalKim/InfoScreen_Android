/*
 * Copyright (c) 2022 . All rights reserved.
 * ProjectName: InfoScreen
 * FileName: AppBaseActivity.kt
 * URL: https://github.com/MortalKim/InfoScreen_Android
 * Email: jinhaihan@outlook.com
 * LastModified: 10/1/22, 3:34 PM
 *
 */


package com.kim.infoscreen.base.activity

import androidx.databinding.ViewDataBinding
import me.goldze.mvvmhabit.base.BaseActivity

abstract class AppBaseActivity<V : ViewDataBinding?, VM : AppBaseViewModel<*>?> :
    BaseActivity<V, VM>(){

}