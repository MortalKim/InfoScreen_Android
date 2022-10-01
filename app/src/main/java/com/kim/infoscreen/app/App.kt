/*
 * Copyright (c) 2022 . All rights reserved.
 * ProjectName: InfoScreen
 * FileName: App.kt
 * URL: https://github.com/MortalKim/InfoScreen_Android
 * Email: jinhaihan@outlook.com
 * LastModified: 10/1/22, 3:34 PM
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