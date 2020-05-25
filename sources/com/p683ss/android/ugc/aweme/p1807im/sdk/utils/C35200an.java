package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.an */
public final class C35200an {

    /* renamed from: a */
    public static final C35200an f90490a = new C35200an();

    /* renamed from: b */
    private static final int f90491b = f90491b;

    /* renamed from: c */
    private static final WeakHashMap<View, Long> f90492c = new WeakHashMap<>();

    private C35200an() {
    }

    /* renamed from: a */
    public final boolean mo73323a(View view) {
        return m79575a(view, (long) f90491b);
    }

    /* renamed from: a */
    public static void m79574a() {
        f90492c.clear();
    }

    /* renamed from: a */
    public static boolean m79575a(View view, long j) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        Long l = (Long) f90492c.get(view);
        long nanoTime = System.nanoTime() / 1000000;
        if (l == null) {
            f90492c.put(view, Long.valueOf(nanoTime));
            return false;
        }
        if (nanoTime - l.longValue() <= j) {
            z = true;
        }
        if (!z) {
            f90492c.put(view, Long.valueOf(nanoTime));
        }
        return z;
    }
}
