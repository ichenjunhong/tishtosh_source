package com.p683ss.android.ugc.aweme.net;

import android.os.Handler;
import android.os.Looper;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.net.x */
public final class C37815x {

    /* renamed from: a */
    public static final C37815x f96280a = new C37815x();

    /* renamed from: b */
    private static final Handler f96281b;

    /* renamed from: c */
    private static boolean f96282c;

    private C37815x() {
    }

    /* renamed from: a */
    public static void m84417a() {
        f96282c = true;
    }

    /* renamed from: a */
    public final void mo77270a(String str) {
        C52711k.m112240b(str, "url");
    }

    static {
        Handler handler = new Handler(Looper.getMainLooper());
        f96281b = handler;
        handler.postDelayed(C378161.f96283a, 5000);
    }
}
