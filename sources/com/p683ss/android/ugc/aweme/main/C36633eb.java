package com.p683ss.android.ugc.aweme.main;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.main.eb */
public final class C36633eb {

    /* renamed from: a */
    public static final C36633eb f93747a = new C36633eb();

    private C36633eb() {
    }

    /* renamed from: a */
    public static Keva m82523a() {
        Keva repoFromSp = Keva.getRepoFromSp(C11010c.m22280a(), "NotificationSharePreferences", 0);
        C52711k.m112236a((Object) repoFromSp, "Keva.getRepoFromSp(AppCo…ants.MODE_SINGLE_PROCESS)");
        return repoFromSp;
    }

    /* renamed from: a */
    public static final int m82521a(int i) {
        return m82523a().getInt("launch_show_times", 0);
    }

    /* renamed from: b */
    public static final int m82525b(int i) {
        return m82523a().getInt("publish_show_times", 0);
    }

    /* renamed from: a */
    public static final long m82522a(long j) {
        return m82523a().getLong("permission_deny_time", 0);
    }

    /* renamed from: b */
    public static final long m82526b(long j) {
        return m82523a().getLong("show_last_time", 0);
    }

    /* renamed from: a */
    public static final void m82524a(boolean z) {
        m82523a().storeBoolean("noticeGuideShown", true);
    }
}
