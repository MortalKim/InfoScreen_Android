/*
 * Copyright (c) 2022 . All rights reserved.
 * ProjectName: InfoScreen
 * FileName: AppBaseFragment.kt
 * URL: https://github.com/MortalKim/InfoScreen_Android
 * Email: jinhaihan@outlook.com
 * LastModified: 10/1/22, 3:34 PM
 *
 */

package com.kim.infoscreen.base.fragment

import androidx.databinding.ViewDataBinding
import me.goldze.mvvmhabit.base.BaseFragment

abstract class AppBaseFragment <V : ViewDataBinding?, VM : AppBaseFragmentViewModel<*>?> :
    BaseFragment<V, VM>() {
}