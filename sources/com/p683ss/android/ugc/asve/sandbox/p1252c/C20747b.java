package com.p683ss.android.ugc.asve.sandbox.p1252c;

import com.p683ss.android.ugc.asve.recorder.p1244a.C20418b;
import com.p683ss.android.ugc.asve.sandbox.C20752d;
import com.p683ss.android.ugc.asve.sandbox.C20785h;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20664b;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20664b.C20665a;
import java.lang.reflect.Proxy;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.c.b */
public final class C20747b implements C20418b {

    /* renamed from: a */
    private final C20785h f56612a;

    /* renamed from: com.ss.android.ugc.asve.sandbox.c.b$a */
    public static final class C20748a extends C20665a {

        /* renamed from: a */
        final /* synthetic */ Runnable f56613a;

        /* renamed from: a */
        public final void mo43800a() {
            Runnable runnable = this.f56613a;
            if (runnable != null) {
                runnable.run();
            }
        }

        C20748a(Runnable runnable) {
            this.f56613a = runnable;
        }
    }

    /* renamed from: a */
    public final boolean mo43271a() {
        return this.f56612a.mo43926a();
    }

    /* renamed from: a */
    public final void mo43270a(boolean z) {
        this.f56612a.mo43925a(z);
    }

    /* renamed from: b */
    public final void mo43272b(boolean z) {
        this.f56612a.mo43927b(z);
    }

    /* renamed from: c */
    public final void mo43273c(boolean z) {
        this.f56612a.mo43928c(z);
    }

    /* renamed from: d */
    public final void mo43274d(boolean z) {
        this.f56612a.mo43929d(z);
    }

    /* renamed from: a */
    public final void mo43268a(Runnable runnable) {
        this.f56612a.mo43923a((C20664b) new C20748a(runnable));
    }

    public C20747b(C20785h hVar) {
        Object newProxyInstance = Proxy.newProxyInstance(C20785h.class.getClassLoader(), new Class[]{C20785h.class}, new C20752d(hVar));
        if (newProxyInstance != null) {
            this.f56612a = (C20785h) newProxyInstance;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.asve.sandbox.ISandBoxRemoteDuetService");
    }

    /* renamed from: a */
    public final void mo43269a(String str, String str2, float f, float f2, float f3, boolean z, boolean z2) {
        String str3 = str;
        C52711k.m112240b(str, "duetVideoPath");
        this.f56612a.mo43924a(str3, str2, f, f2, f3, z, z2);
    }
}
