package com.facebook.imagepipeline.p956a.p957a;

import android.graphics.Bitmap;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p924h.C13715a;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.imagepipeline.a.a.g */
public final class C13913g {

    /* renamed from: a */
    public final C13911e f36300a;

    /* renamed from: b */
    public final int f36301b;

    /* renamed from: c */
    private C13715a<Bitmap> f36302c;

    /* renamed from: d */
    private List<C13715a<Bitmap>> f36303d;

    /* renamed from: a */
    public final synchronized C13715a<Bitmap> mo26083a() {
        return C13715a.m27751b(this.f36302c);
    }

    /* renamed from: b */
    public final synchronized void mo26085b() {
        C13715a.m27752c(this.f36302c);
        this.f36302c = null;
        C13715a.m27749a((Iterable<? extends C13715a<?>>) this.f36303d);
        this.f36303d = null;
    }

    /* renamed from: c */
    public final synchronized int mo26087c() {
        if (this.f36303d == null) {
            return 0;
        }
        return this.f36303d.size();
    }

    /* renamed from: a */
    public static C13913g m28341a(C13911e eVar) {
        return new C13913g(eVar);
    }

    private C13913g(C13911e eVar) {
        this.f36300a = (C13911e) C13689i.m27652a(eVar);
        this.f36301b = 0;
    }

    /* renamed from: a */
    public final synchronized C13715a<Bitmap> mo26084a(int i) {
        if (this.f36303d == null) {
            return null;
        }
        return C13715a.m27751b((C13715a) this.f36303d.get(i));
    }

    C13913g(C13914h hVar) {
        this.f36300a = (C13911e) C13689i.m27652a(hVar.f36304a);
        this.f36301b = hVar.f36307d;
        this.f36302c = C13715a.m27751b(hVar.f36305b);
        this.f36303d = C13715a.m27748a((Collection<C13715a<T>>) hVar.f36306c);
    }

    /* renamed from: b */
    public final synchronized boolean mo26086b(int i) {
        boolean z;
        if (this.f36303d == null || this.f36303d.get(i) == null) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }
}
