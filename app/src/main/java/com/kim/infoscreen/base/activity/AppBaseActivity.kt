/*
 * Copyright (c) 2022 . All rights reserved.
 * Created by MortalKim on 9/4/22, 4:42 PM
 * Email: jinhaihan@outlook.com
 * ProjectName: InfoScreen
 * FileName: AppBaseActivity.kt
 * LastModified: 9/4/22, 4:38 PM
 *
 */


package com.kim.infoscreen.base.activity

import androidx.databinding.ViewDataBinding
import me.goldze.mvvmhabit.base.BaseActivity

abstract class AppBaseActivity<V : ViewDataBinding?, VM : AppBaseViewModel<*>?> :
    BaseActivity<V, VM>(){

}