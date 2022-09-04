/*
 * Copyright (c) 2022 . All rights reserved.
 * Created by MortalKim on 9/4/22, 4:43 PM
 * Email: jinhaihan@outlook.com
 * ProjectName: InfoScreen
 * FileName: App.kt
 * LastModified: 9/4/22, 3:24 PM
 *
 */

package com.kim.infoscreen.app

import me.goldze.mvvmhabit.base.BaseApplication
import me.goldze.mvvmhabit.crash.CaocConfig
import me.goldze.mvvmhabit.utils.KLog


class App: BaseApplication() {
    override fun onCreate() {
        super.onCreate()
        //Log
        KLog.init(true)
        //Crash catch
        CaocConfig.Builder.create()
            .backgroundMode(CaocConfig.BACKGROUND_MODE_SILENT)
            .enabled(true)
            .showErrorDetails(true)
            .showRestartButton(true)
            .trackActivities(true)
            .minTimeBetweenCrashesMs(2000)
            //.errorDrawable(R.mipmap.ic_launcher)
            //.restartActivity(LoginActivity::class.java)
            //.errorActivity(YourCustomErrorActivity.class)
            //.eventListener(new YourCustomEventListener())
            .apply()
    }
}