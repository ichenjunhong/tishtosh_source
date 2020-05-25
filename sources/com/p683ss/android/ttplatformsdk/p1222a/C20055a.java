package com.p683ss.android.ttplatformsdk.p1222a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.ttplatformsdk.a.a */
public final class C20055a {

    /* renamed from: b */
    private static C20055a f55119b;

    /* renamed from: a */
    public SharedPreferences f55120a;

    /* renamed from: c */
    private final String f55121c = "ttplatformapi.prefs";

    /* renamed from: a */
    public static C20055a m49537a(Context context) {
        if (f55119b == null) {
            f55119b = new C20055a(context);
        }
        return f55119b;
    }

    private C20055a(Context context) {
        this.f55120a = C35807d.m80935a(context, "ttplatformapi.prefs", 4);
    }

    /* renamed from: b */
    public final String mo42109b(String str, String str2) {
        return this.f55120a.getString(str, str2);
    }

    /* renamed from: a */
    public final void mo42108a(String str, String str2) {
        Editor edit = this.f55120a.edit();
        edit.putString(str, str2);
        edit.commit();
    }
}
