package com.p683ss.android.ugc.aweme.feed.preload;

import android.util.SparseArray;

/* renamed from: com.ss.android.ugc.aweme.feed.preload.e */
public final class C30679e {

    /* renamed from: a */
    private static final C30679e f80292a = new C30679e();

    /* renamed from: b */
    private SparseArray<C30678d> f80293b = new SparseArray<>();

    /* renamed from: a */
    public static C30679e m71957a() {
        return f80292a;
    }

    private C30679e() {
        this.f80293b.put(4, new C30680f());
    }

    /* renamed from: a */
    public final C30678d mo63255a(int i) {
        C30678d dVar = (C30678d) this.f80293b.get(4);
        if (dVar == null) {
            return null;
        }
        return dVar;
    }
}
