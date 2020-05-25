package com.p683ss.android.ugc.aweme.main;

import android.content.SharedPreferences;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.main.dw */
public final class C36605dw {

    /* renamed from: a */
    public static final C36605dw f93708a = new C36605dw();

    private C36605dw() {
    }

    /* renamed from: a */
    public static SharedPreferences m82471a() {
        SharedPreferences a = C35807d.m80935a(C11010c.m22280a(), "MainTabPreferences", 0);
        C52711k.m112236a((Object) a, "AppContextManager.getApp…ME, Context.MODE_PRIVATE)");
        return a;
    }

    /* renamed from: a */
    public static final boolean m82472a(boolean z) {
        return m82471a().getBoolean("hasSwipedUp", false);
    }

    /* renamed from: b */
    public static final void m82473b(boolean z) {
        m82471a().edit().putBoolean("shouldShowScrollToFeedFollowGuideMT", false).apply();
    }
}
