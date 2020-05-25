package com.p683ss.android.ugc.aweme.feed;

import android.app.Activity;
import android.content.SharedPreferences;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;

/* renamed from: com.ss.android.ugc.aweme.feed.o */
public final class C30578o {

    /* renamed from: a */
    public static boolean f79870a;

    /* renamed from: b */
    public static long f79871b = -1;

    /* renamed from: c */
    public static long f79872c = -1;

    /* renamed from: d */
    private static volatile Boolean f79873d;

    /* renamed from: e */
    private static C30579a f79874e;

    /* renamed from: f */
    private static C29988ad f79875f = C29988ad.FEED;

    /* renamed from: com.ss.android.ugc.aweme.feed.o$a */
    public interface C30579a {
        /* renamed from: a */
        void mo60388a(C29988ad adVar);
    }

    /* renamed from: b */
    public static boolean m71568b() {
        return f79870a;
    }

    /* renamed from: c */
    public static String m71569c() {
        return f79875f.name();
    }

    /* renamed from: e */
    public static long m71571e() {
        long j = f79872c;
        f79872c = 0;
        return j;
    }

    /* renamed from: a */
    public static Boolean m71565a() {
        if (f79873d == null) {
            m71572f();
        }
        return f79873d;
    }

    /* renamed from: d */
    public static String m71570d() {
        Activity g = C11016e.m22312g();
        if (g != null) {
            return g.getClass().getSimpleName();
        }
        return null;
    }

    /* renamed from: f */
    private static boolean m71572f() {
        if (C11010c.m22280a() == null) {
            return false;
        }
        SharedPreferences a = C35807d.m80935a(C11010c.m22280a(), "prefs_feed_check", 0);
        boolean z = a.getBoolean("key_first_launch", true);
        if (f79873d == null) {
            f79873d = Boolean.valueOf(z);
        }
        if (f79873d.booleanValue()) {
            C23859b.m58575b().mo49466a(C11010c.m22280a(), "key_new_user", true);
        }
        a.edit().putBoolean("key_first_launch", false).apply();
        return f79873d.booleanValue();
    }

    /* renamed from: a */
    public static void m71567a(C30579a aVar) {
        if (aVar != null) {
            f79874e = aVar;
        }
    }

    /* renamed from: a */
    public static void m71566a(C29988ad adVar) {
        f79875f = adVar;
        if (f79874e != null) {
            f79874e.mo60388a(f79875f);
        }
    }
}
