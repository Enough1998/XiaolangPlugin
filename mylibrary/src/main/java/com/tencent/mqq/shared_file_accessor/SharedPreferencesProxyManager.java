package com.tencent.mqq.shared_file_accessor;

import android.content.Context;
import android.content.SharedPreferences;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SharedPreferencesProxyManager {
    static boolean a = false;
    static boolean b = false;
    private static SharedPreferencesProxyManager c = null;

    public static String sSystemSpExceptionMsg = null;
    private Map d = new ConcurrentHashMap(5);
    private Map e = new ConcurrentHashMap(5);
    private WeakReference f = null;

    private SharedPreferencesProxyManager() {
    }



    public static SharedPreferencesProxyManager getInstance() {
        if (c != null) {
            return c;
        }
        synchronized (SharedPreferencesProxyManager.class) {
            if (c == null) {
                c = new SharedPreferencesProxyManager();
            }
        }
        return c;
    }



    final SharedPreferences a(String str, int i, boolean z) {
        Map map = ((i & 4) != 4 ) ? this.d : this.e;
        SharedPreferences sharedPreferences = (SharedPreferences) map.get(str);
        return sharedPreferences;
    }

    public SharedPreferences getProxy(String str, int i) {
        return a(str, i, true);
    }





}