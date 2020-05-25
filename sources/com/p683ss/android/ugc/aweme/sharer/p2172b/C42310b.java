package com.p683ss.android.ugc.aweme.sharer.p2172b;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.ugc.aweme.sharer.b.b */
public final class C42310b {

    /* renamed from: a */
    public static final C42310b f106856a = new C42310b();

    /* renamed from: b */
    private static final WeakHashMap<View, Long> f106857b = new WeakHashMap<>();

    private C42310b() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static boolean m92909a(View view, long j) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        Long l = (Long) f106857b.get(view);
        long nanoTime = System.nanoTime() / 1000000;
        if (l == null) {
            f106857b.put(view, Long.valueOf(nanoTime));
            return false;
        }
        if (nanoTime - l.longValue() <= j) {
            z = true;
        }
        if (!z) {
            f106857b.put(view, Long.valueOf(nanoTime));
        }
        return z;
    }
}
