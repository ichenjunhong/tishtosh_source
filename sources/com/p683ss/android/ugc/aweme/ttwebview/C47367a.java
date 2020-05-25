package com.p683ss.android.ugc.aweme.ttwebview;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.ugc.aweme.ttwebview.a */
public final class C47367a {
    /* renamed from: a */
    public static String m102734a() {
        return "SystemWebView";
    }

    /* renamed from: b */
    public static boolean m102736b() {
        SharedPreferences a = C35807d.m80935a(C11010c.m22280a(), "sp_ttwebview_switch", 0);
        if (a != null) {
            return a.getBoolean("sp_ttwebview_switch_key", false);
        }
        return false;
    }

    /* renamed from: a */
    public static void m102735a(boolean z) {
        Editor edit = C35807d.m80935a(C11010c.m22280a(), "sp_ttwebview_switch", 0).edit();
        edit.putBoolean("sp_ttwebview_switch_key", z);
        edit.apply();
    }
}
