package com.p683ss.android.ugc.aweme.feed.guide;

import android.content.SharedPreferences;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.j */
public final class C30289j {

    /* renamed from: a */
    public static final C30289j f79124a = new C30289j();

    private C30289j() {
    }

    /* renamed from: a */
    private static SharedPreferences m71205a() {
        SharedPreferences a = C35807d.m80935a(C11010c.m22280a(), "MainTabPreferences", 0);
        C52711k.m112236a((Object) a, "AppContextManager.getApp…ME, Context.MODE_PRIVATE)");
        return a;
    }

    /* renamed from: a */
    public static final boolean m71207a(boolean z) {
        return m71205a().getBoolean("hasShowedSwipeUpGuideAfterVideoPlay", false);
    }

    /* renamed from: b */
    public static final boolean m71208b(boolean z) {
        return m71205a().getBoolean("shouldShowSwipeUpGuide1", true);
    }

    /* renamed from: c */
    public static final void m71209c(boolean z) {
        m71205a().edit().putBoolean("shouldShowSwipeUpGuide1", false).apply();
    }
}
