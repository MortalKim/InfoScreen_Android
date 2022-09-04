/*
 * Copyright (c) 2022 . All rights reserved.
 * Created by MortalKim on 9/4/22, 4:47 PM
 * Email: jinhaihan@outlook.com
 * ProjectName: InfoScreen
 * FileName: AppBaseFragment.kt
 * LastModified: 9/4/22, 4:47 PM
 *
 */

package com.kim.infoscreen.base.fragment

import androidx.databinding.ViewDataBinding
import me.goldze.mvvmhabit.base.BaseFragment

abstract class AppBaseFragment <V : ViewDataBinding?, VM : AppBaseFragmentViewModel<*>?> :
    BaseFragment<V, VM>() {
}