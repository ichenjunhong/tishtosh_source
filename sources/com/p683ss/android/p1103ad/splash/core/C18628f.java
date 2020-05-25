package com.p683ss.android.p1103ad.splash.core;

import com.p683ss.android.p1103ad.splash.core.p1114c.C18602b;

/* renamed from: com.ss.android.ad.splash.core.f */
public class C18628f {

    /* renamed from: c */
    private static volatile C18628f f51440c;

    /* renamed from: a */
    volatile C18602b f51441a;

    /* renamed from: b */
    long f51442b;

    private C18628f() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo38032c() {
        this.f51441a = null;
        this.f51442b = 0;
    }

    /* renamed from: a */
    public static C18628f m45128a() {
        if (f51440c == null) {
            synchronized (C18628f.class) {
                if (f51440c == null) {
                    f51440c = new C18628f();
                }
            }
        }
        return f51440c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C18602b mo38031b() {
        if (Math.abs(System.currentTimeMillis() - this.f51442b) <= 10000) {
            return this.f51441a;
        }
        this.f51441a = null;
        return null;
    }
}
