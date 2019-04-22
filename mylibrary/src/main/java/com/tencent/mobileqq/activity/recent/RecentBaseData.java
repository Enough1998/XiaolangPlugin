package com.tencent.mobileqq.activity.recent;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.mobileqq.app.QQAppInterface;


/* compiled from: ProGuard */
public abstract class RecentBaseData {
    public static int a;
    public volatile long f0a;
    public CharSequence f2a;
    public boolean f3a;
    public int b = 1;
    public CharSequence f4b;
    public String f5b;
    public boolean f6b;
    public int c;
    public CharSequence f7c;
    public String f8c;
    public int d;
    public CharSequence f9d;
    public String f10d;
    public int e;
    public String f11e;
    public int f = 0;
    public String f12f;
    public int g;
    public int h;
    public int i;

    public RecentBaseData() {
        this.f |= 1;
    }

    public abstract int a();

    public abstract long m0a();



    public abstract String m2a();

    public void m3a() {

            StringBuilder stringBuilder = new StringBuilder(1024);
            String str = "null";
            String str2 = "null";
            if (!TextUtils.isEmpty(this.f5b)) {
                str2 = "lenth=" + this.f5b.length();
            }
            if (!TextUtils.isEmpty(this.f7c)) {
                str = "lenth=" + this.f7c.length();
            }
            stringBuilder.append("[").append("type:").append(a()).append(", uin:").append(a()).append(", unreadNum:").append(this.c).append(", titleName:").append(str2).append(", mMenuFlag:").append(this.f).append(", status:").append(this.a).append(", authenIcon:").append(this.d).append(", showTime:").append(this.f8c).append(", lastmsg:").append(str).append(", extrainfo:").append(this.f4b).append(", lastmsgtime:").append(a()).append(", lastdrafttime:").append(b()).append("]");

    }



    public abstract void a(QQAppInterface qQAppInterface, Context context);




    public boolean m4a() {
        return true;
    }

    public final int b() {
        return this.c;
    }

    public abstract long m5b();

    public final String m6b() {
        return this.f5b;
    }

    public final void m7b() {
        this.c = 0;
    }

    public long c() {
        return 5;
    }

    public final void m8c() {
        this.c = 0;
    }

    public void d() {
    }

    public boolean equals(Object obj) {
        boolean z = obj == this;
        return z;
    }
}