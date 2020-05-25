package com.p683ss.android.ugc.aweme.shortvideo.videocategory.repository.p2257a.p2258a;

import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.a.a.a */
public abstract class C45498a<T> implements C45499b<T> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo91774b(T t);

    /* renamed from: a */
    public final boolean mo91773a(T t) {
        boolean z;
        try {
            z = mo91774b(t);
        } catch (Exception e) {
            C52711k.m112240b(e, "exception");
            C32458a.m75148a((Throwable) e);
            z = false;
        }
        if (!z) {
            return z;
        }
        mo91776b();
        int a = mo91775a();
        if (a > 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder("illegal capacity <= 0, capacity is ");
        sb.append(a);
        throw new IllegalArgumentException(sb.toString());
    }
}
