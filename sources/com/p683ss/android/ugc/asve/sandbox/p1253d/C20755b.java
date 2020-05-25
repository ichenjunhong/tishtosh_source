package com.p683ss.android.ugc.asve.sandbox.p1253d;

import com.p683ss.android.ugc.asve.recorder.p1244a.C20418b;
import com.p683ss.android.ugc.asve.sandbox.C20785h.C20786a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20664b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.d.b */
public final class C20755b extends C20786a {

    /* renamed from: a */
    private final C20418b f56645a;

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.b$a */
    static final class C20756a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C20664b f56646a;

        C20756a(C20664b bVar) {
            this.f56646a = bVar;
        }

        public final void run() {
            C20664b bVar = this.f56646a;
            if (bVar != null) {
                bVar.mo43800a();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo43926a() {
        return this.f56645a.mo43271a();
    }

    /* renamed from: a */
    public final void mo43925a(boolean z) {
        this.f56645a.mo43270a(z);
    }

    /* renamed from: b */
    public final void mo43927b(boolean z) {
        this.f56645a.mo43272b(z);
    }

    /* renamed from: c */
    public final void mo43928c(boolean z) {
        this.f56645a.mo43273c(z);
    }

    /* renamed from: d */
    public final void mo43929d(boolean z) {
        this.f56645a.mo43274d(z);
    }

    public C20755b(C20418b bVar) {
        C52711k.m112240b(bVar, "duetController");
        this.f56645a = bVar;
    }

    /* renamed from: a */
    public final void mo43923a(C20664b bVar) {
        this.f56645a.mo43268a((Runnable) new C20756a(bVar));
    }

    /* renamed from: a */
    public final void mo43924a(String str, String str2, float f, float f2, float f3, boolean z, boolean z2) {
        String str3 = str;
        C52711k.m112240b(str, "duetVideoPath");
        this.f56645a.mo43269a(str3, str2, f, f2, f3, z, z2);
    }
}
