package com.p683ss.android.p1103ad.splash.p1120d;

/* renamed from: com.ss.android.ad.splash.d.b */
public class C18723b {

    /* renamed from: b */
    private static volatile C18723b f51798b;

    /* renamed from: a */
    public long f51799a;

    private C18723b() {
    }

    /* renamed from: a */
    public static C18723b m45628a() {
        if (f51798b == null) {
            synchronized (C18723b.class) {
                if (f51798b == null) {
                    f51798b = new C18723b();
                }
            }
        }
        return f51798b;
    }
}
