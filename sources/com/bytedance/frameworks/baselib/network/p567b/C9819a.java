package com.bytedance.frameworks.baselib.network.p567b;

import com.bytedance.common.utility.C9431p;
import com.bytedance.frameworks.baselib.network.p567b.C9821c.C9822a;

/* renamed from: com.bytedance.frameworks.baselib.network.b.a */
public final class C9819a extends C9820b {

    /* renamed from: a */
    public final boolean f26707a;

    /* renamed from: b */
    public final String f26708b;

    /* renamed from: g */
    private final Runnable f26709g;

    /* renamed from: h */
    private final C9822a f26710h;

    /* renamed from: b */
    public final int mo17660b() {
        return this.f26714f;
    }

    /* renamed from: a */
    public final C9822a mo17659a() {
        return this.f26710h;
    }

    public final void run() {
        if (this.f26709g != null && !mo17663c()) {
            this.f26709g.run();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C9820b mo17658a(int i) {
        this.f26714f = i;
        return this;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C9821c cVar = (C9821c) obj;
        C9822a a = mo17659a();
        C9822a a2 = cVar.mo17659a();
        if (a == null) {
            a = C9822a.NORMAL;
        }
        if (a2 == null) {
            a2 = C9822a.NORMAL;
        }
        if (a == a2) {
            return mo17660b() - cVar.mo17660b();
        }
        return a2.ordinal() - a.ordinal();
    }

    public C9819a(String str, C9822a aVar, int i, Runnable runnable, boolean z) {
        this.f26710h = aVar;
        if (C9431p.m18664a(str)) {
            str = getClass().getSimpleName();
        }
        this.f26713e = i;
        this.f26708b = str;
        this.f26709g = runnable;
        this.f26707a = z;
    }
}
