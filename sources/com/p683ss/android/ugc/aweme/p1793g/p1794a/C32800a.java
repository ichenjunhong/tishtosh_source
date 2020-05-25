package com.p683ss.android.ugc.aweme.p1793g.p1794a;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.ugc.aweme.g.a.a */
public final class C32800a {

    /* renamed from: a */
    private static final WeakHashMap<View, Long> f85401a = new WeakHashMap<>();

    /* renamed from: a */
    public static void m75678a() {
        f85401a.clear();
    }

    /* renamed from: a */
    public static boolean m75679a(View view) {
        return m75680a(view, 1200);
    }

    /* renamed from: a */
    public static boolean m75680a(View view, long j) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        Long l = (Long) f85401a.get(view);
        long nanoTime = System.nanoTime() / 1000000;
        if (l == null) {
            f85401a.put(view, Long.valueOf(nanoTime));
            return false;
        }
        if (nanoTime - l.longValue() <= j) {
            z = true;
        }
        if (!z) {
            f85401a.put(view, Long.valueOf(nanoTime));
        }
        return z;
    }
}
