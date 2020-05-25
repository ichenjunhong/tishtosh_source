package com.p683ss.android.ugc.aweme.detail.p1621c;

import android.content.SharedPreferences;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.c.a */
public final class C27326a {

    /* renamed from: a */
    public static final C27326a f72074a = new C27326a();

    private C27326a() {
    }

    /* renamed from: a */
    public static SharedPreferences m65854a() {
        SharedPreferences a = C35807d.m80935a(C11010c.m22280a(), "MainTabPreferences", 0);
        C52711k.m112236a((Object) a, "AppContextManager.getApp…ME, Context.MODE_PRIVATE)");
        return a;
    }

    /* renamed from: a */
    public static final boolean m65855a(boolean z) {
        return m65854a().getBoolean("shouldShowHotVideoSwipeUpGuide", true);
    }

    /* renamed from: b */
    public static final void m65856b(boolean z) {
        m65854a().edit().putBoolean("shouldShowHotVideoSwipeUpGuide", false).apply();
    }
}
