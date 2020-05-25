package com.p683ss.base.p2547b;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.base.b.b */
public final class C51159b {
    /* renamed from: a */
    public static String m110042a(Context context, String str, String str2) {
        return C35807d.m80935a(context, str, 0).getString(str2, "");
    }

    /* renamed from: b */
    public static void m110044b(Context context, String str, String str2) {
        Editor edit = C35807d.m80935a(context, str, 0).edit();
        edit.remove(str2);
        edit.apply();
    }

    /* renamed from: c */
    public static boolean m110045c(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(m110042a(context, str, str2))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m110043a(Context context, String str, String str2, String str3) {
        Editor edit = C35807d.m80935a(context, str, 0).edit();
        edit.putString(str2, str3);
        edit.apply();
    }
}
