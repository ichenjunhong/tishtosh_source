package com.bytedance.android.live.core.rxutils.autodispose.p243b;

import java.util.Comparator;
import p064c.p065a.p071d.C1715j;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.b.f */
final /* synthetic */ class C4012f implements C1715j {

    /* renamed from: a */
    private final Comparator f11144a;

    /* renamed from: b */
    private final Object f11145b;

    C4012f(Comparator comparator, Object obj) {
        this.f11144a = comparator;
        this.f11145b = obj;
    }

    /* renamed from: a */
    public final boolean mo6207a(Object obj) {
        return this.f11144a.compare(obj, this.f11145b) >= 0;
    }
}
