package com.p683ss.android.p1103ad.splash.core;

import android.text.TextUtils;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18602b;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18610h;
import java.util.List;

/* renamed from: com.ss.android.ad.splash.core.k */
public final class C18654k {

    /* renamed from: k */
    private static volatile C18654k f51553k;

    /* renamed from: a */
    public volatile List<C18602b> f51554a;

    /* renamed from: b */
    public volatile List<C18602b> f51555b;

    /* renamed from: c */
    public volatile C18610h f51556c;

    /* renamed from: d */
    public long f51557d = 1800000;

    /* renamed from: e */
    public long f51558e = 300000;

    /* renamed from: f */
    public volatile long f51559f = -1;

    /* renamed from: g */
    public volatile long f51560g = -1;

    /* renamed from: h */
    public boolean f51561h;

    /* renamed from: i */
    public int f51562i;

    /* renamed from: j */
    public String f51563j = "{}";

    private C18654k() {
    }

    /* renamed from: a */
    public static C18654k m45259a() {
        if (f51553k == null) {
            synchronized (C18654k.class) {
                if (f51553k == null) {
                    f51553k = new C18654k();
                }
            }
        }
        return f51553k;
    }

    /* renamed from: a */
    public final void mo38071a(long j) {
        if (j > 0) {
            this.f51559f = j;
        }
    }

    /* renamed from: b */
    public final void mo38072b(long j) {
        if (j > 0) {
            this.f51560g = j;
        }
    }

    /* renamed from: a */
    public static void m45260a(String str, String str2) {
        C18656m a = C18656m.m45265a();
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            a.f51565a.put(str2, str);
        }
    }
}
