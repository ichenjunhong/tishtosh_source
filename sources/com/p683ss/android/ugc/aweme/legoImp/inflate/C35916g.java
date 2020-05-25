package com.p683ss.android.ugc.aweme.legoImp.inflate;

import android.content.SharedPreferences;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.ugc.aweme.legoImp.inflate.g */
public final class C35916g {

    /* renamed from: a */
    public static SharedPreferences f92140a;

    /* renamed from: b */
    public static int f92141b;

    /* renamed from: a */
    public static int m81077a() {
        return f92141b;
    }

    static {
        SharedPreferences a = C35807d.m80935a(C11010c.m22280a(), "aweme-app", 0);
        f92140a = a;
        f92141b = a.getInt("x2c_switch", 2);
    }
}
