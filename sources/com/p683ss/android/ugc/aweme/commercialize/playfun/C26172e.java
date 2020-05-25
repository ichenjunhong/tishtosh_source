package com.p683ss.android.ugc.aweme.commercialize.playfun;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.e */
public abstract class C26172e {

    /* renamed from: a */
    public Runnable f69110a;

    /* renamed from: b */
    public final C26173f f69111b;

    /* renamed from: a */
    public static void m63447a(String str) {
        C52711k.m112240b(str, "msg");
    }

    /* renamed from: a */
    public abstract void mo53778a();

    /* renamed from: b */
    public void mo53780b() {
    }

    /* renamed from: c */
    public void mo53781c() {
    }

    /* renamed from: e */
    public boolean mo53785e() {
        return false;
    }

    /* renamed from: f */
    public final void mo53797f() {
        this.f69111b.mo53799a(0);
    }

    /* renamed from: d */
    public void mo53782d() {
        Runnable runnable = this.f69110a;
        if (runnable != null) {
            this.f69111b.f69121j.removeCallbacks(runnable);
        }
        this.f69110a = null;
    }

    public C26172e(C26173f fVar) {
        C52711k.m112240b(fVar, "stateContext");
        this.f69111b = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53796a(Runnable runnable) {
        C52711k.m112240b(runnable, "runnable");
        this.f69110a = runnable;
        this.f69111b.f69121j.post(runnable);
    }
}
