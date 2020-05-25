package com.p683ss.android.ugc.aweme.feed;

import android.content.SharedPreferences;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.aj */
public final class C30133aj {

    /* renamed from: a */
    public static final C30133aj f78651a = new C30133aj();

    private C30133aj() {
    }

    /* renamed from: b */
    public static final int m70708b() {
        return m70706a().getInt("diggUnloginCount", 0);
    }

    /* renamed from: d */
    public static final boolean m70710d() {
        return m70706a().getBoolean("deviceHasDigged", false);
    }

    /* renamed from: a */
    public static SharedPreferences m70706a() {
        SharedPreferences a = C35807d.m80935a(C11010c.m22280a(), "MainTabPreferences", 0);
        C52711k.m112236a((Object) a, "AppContextManager.getApp…ME, Context.MODE_PRIVATE)");
        return a;
    }

    /* renamed from: c */
    public static final void m70709c() {
        m70706a().edit().putBoolean("deviceHasDigged", true).apply();
    }

    /* renamed from: a */
    public static final void m70707a(int i) {
        m70706a().edit().putInt("diggUnloginCount", i).apply();
    }
}
