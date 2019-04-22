package com.tencent.mobileqq.app;

import android.content.SharedPreferences;

import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.qphone.base.util.BaseApplication;

import mqq.app.AppRuntime;
import mqq.app.MobileQQ;


public abstract class QQAppInterface extends AppRuntime {
    public BaseApplicationImpl app;
    public String getCurrentAccountUin() {
        return "1036046880";
    }

    public MobileQQ getApplication() {
        return new MobileQQ();
    }

    public BaseApplication getApp()
    {
        return this.app;
    }

    public String getAccount() {
        return ";";
    }


    public Object getManager(int i) {
        return i;
    }

    public abstract SharedPreferences getPreferences();
}
