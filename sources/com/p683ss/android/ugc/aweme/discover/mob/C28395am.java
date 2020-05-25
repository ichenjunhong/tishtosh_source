package com.p683ss.android.ugc.aweme.discover.mob;

import android.util.SparseArray;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.am */
public final class C28395am {

    /* renamed from: a */
    static long f74565a = -1;

    /* renamed from: b */
    public static final C28395am f74566b = new C28395am();

    /* renamed from: c */
    private static volatile boolean f74567c = true;

    /* renamed from: d */
    private static final long f74568d = C22574a.m55738f().f60707h;

    /* renamed from: e */
    private static final SparseArray<Long> f74569e = new SparseArray<>();

    /* renamed from: f */
    private static final SparseArray<Long> f74570f = new SparseArray<>();

    private C28395am() {
    }

    /* renamed from: a */
    public static boolean m67393a() {
        return f74567c;
    }

    /* renamed from: b */
    public static void m67394b() {
        if (f74567c) {
            f74565a = System.currentTimeMillis() - f74568d;
        }
    }

    /* renamed from: a */
    public static void m67392a(boolean z) {
        f74567c = false;
    }

    /* renamed from: a */
    public static void m67391a(int i) {
        if (i >= 0) {
            f74569e.put(i, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: c */
    public static long m67396c(int i) {
        Long l = (Long) f74570f.get(i);
        if (l != null) {
            return l.longValue();
        }
        return -1;
    }

    /* renamed from: b */
    public static void m67395b(int i) {
        if (i >= 0) {
            Long l = (Long) f74569e.get(i);
            if (l != null && l.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis() - l.longValue();
                f74569e.put(i, Long.valueOf(-1));
                f74570f.put(i, Long.valueOf(currentTimeMillis));
            }
        }
    }
}
