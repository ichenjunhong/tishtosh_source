package com.p683ss.android.ugc.asve.recorder.p1244a;

import com.p683ss.android.vesdk.C50601ah;
import com.p683ss.android.vesdk.C50719n;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.recorder.a.c */
public final class C20419c implements C20418b {

    /* renamed from: a */
    private final C50601ah f55977a;

    /* renamed from: a */
    public final boolean mo43271a() {
        return this.f55977a.mo98818a();
    }

    /* renamed from: a */
    public final void mo43268a(Runnable runnable) {
        this.f55977a.mo98808a(runnable);
    }

    /* renamed from: b */
    public final void mo43272b(boolean z) {
        this.f55977a.mo98857e(z);
    }

    /* renamed from: c */
    public final void mo43273c(boolean z) {
        this.f55977a.mo98861f(z);
    }

    /* renamed from: d */
    public final void mo43274d(boolean z) {
        this.f55977a.mo98896w(z);
    }

    public C20419c(C50601ah ahVar) {
        C52711k.m112240b(ahVar, "recoder");
        this.f55977a = ahVar;
    }

    /* renamed from: a */
    public final void mo43270a(boolean z) {
        this.f55977a.mo98846c(z);
    }

    /* renamed from: a */
    public final void mo43269a(String str, String str2, float f, float f2, float f3, boolean z, boolean z2) {
        C52711k.m112240b(str, "duetVideoPath");
        C50601ah ahVar = this.f55977a;
        if (str2 == null) {
            str2 = "";
        }
        C50719n nVar = new C50719n(str, str2, f, f2, f3, z);
        ahVar.mo98806a(nVar);
    }
}
