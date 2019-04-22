package com.tencent.qphone.base.util;

import android.app.Application;


public class BaseApplication extends Application {
    public static BaseApplication context;

    public static BaseApplication getContext() {
        return context;
    }

}
