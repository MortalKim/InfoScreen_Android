/*
 * Copyright (c) 2022 . All rights reserved.
 * ProjectName: InfoScreen
 * FileName: ThreadUtils.java
 * URL: https://github.com/MortalKim/InfoScreen_Android
 * Email: jinhaihan@outlook.com
 * LastModified: 10/1/22, 3:34 PM
 *
 */

package com.kim.infoscreen.utils;

import android.os.Handler;
import android.os.Looper;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//FileName: ThreadUtils
//Description:

public class ThreadUtils {
    private static Handler sHandler = new Handler(Looper.getMainLooper());

    private static ExecutorService sExecutors = Executors.newSingleThreadExecutor();

    public static void runOnSubThread(Runnable runnable){
        sExecutors.execute(runnable);
    }

    public static void runOnMainThread(Runnable runnable){
        sHandler.post(runnable);
    }
}
