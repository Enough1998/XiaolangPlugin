package com.tencent.common.app;

import android.content.Context;
import android.content.SharedPreferences;

import com.tencent.mqq.shared_file_accessor.SharedPreferencesProxyManager;

import mqq.app.AppRuntime;
import mqq.app.MobileQQ;



public class BaseApplicationImpl extends MobileQQ {

    public static BaseApplicationImpl sApplication;

    public AppRuntime getRuntime() {
        return waitAppRuntime(null);
    }

    @Override
    public void onCreate() {

        super.onCreate();
    }


    @Override
    protected void attachBaseContext(Context base) {

        super.attachBaseContext(base);

    }

    public  SharedPreferences getSharedPreferences(String str, int i) {
        return SharedPreferencesProxyManager.getInstance().getProxy(str, i);
    }

}