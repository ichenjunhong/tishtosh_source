package com.p683ss.android.ugc.network.observer;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.network.observer.d */
public final class C50099d {

    /* renamed from: a */
    static long f125493a = -1;

    /* renamed from: b */
    static long f125494b = -1;

    /* renamed from: c */
    static int f125495c;

    /* renamed from: d */
    static AtomicBoolean f125496d = new AtomicBoolean(true);

    /* renamed from: e */
    static Thread f125497e;

    /* renamed from: f */
    static C50081a f125498f;

    /* renamed from: g */
    public static final C50099d f125499g = new C50099d();

    /* renamed from: h */
    private static C50088b f125500h = C50088b.UNKNOWN_STATUS;

    private C50099d() {
    }

    /* renamed from: a */
    public static void m108055a(long j) {
        C50081a aVar = f125498f;
        if (aVar != null && aVar.f125434b.contains(Long.valueOf(j))) {
            Thread thread = f125497e;
            if (thread != null) {
                thread.interrupt();
            }
        }
    }
}
