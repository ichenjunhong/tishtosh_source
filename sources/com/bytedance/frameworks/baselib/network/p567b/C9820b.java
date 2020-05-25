package com.bytedance.frameworks.baselib.network.p567b;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.frameworks.baselib.network.b.b */
public abstract class C9820b implements C9821c, Comparable<C9821c>, Runnable {

    /* renamed from: c */
    protected final AtomicBoolean f26711c = new AtomicBoolean(false);

    /* renamed from: d */
    protected final AtomicBoolean f26712d = new AtomicBoolean(false);

    /* renamed from: e */
    public int f26713e = 0;

    /* renamed from: f */
    protected int f26714f;

    /* renamed from: c */
    public final boolean mo17663c() {
        return this.f26712d.get();
    }

    /* renamed from: a */
    public C9820b mo17658a(int i) {
        this.f26714f = i;
        return this;
    }
}
