package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.google.android.gms.tagmanager.az */
final class C17188az {
    /* renamed from: a */
    static void m42124a(Context context, String str, String str2, String str3) {
        Editor edit = C35807d.m80935a(context, str, 0).edit();
        edit.putString(str2, str3);
        edit.apply();
    }
}
