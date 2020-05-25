package com.facebook.imagepipeline.p956a.p957a;

import android.graphics.Bitmap;
import com.facebook.common.p924h.C13715a;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.imagepipeline.a.a.h */
public final class C13914h {

    /* renamed from: a */
    public final C13911e f36304a;

    /* renamed from: b */
    public C13715a<Bitmap> f36305b;

    /* renamed from: c */
    List<C13715a<Bitmap>> f36306c;

    /* renamed from: d */
    public int f36307d;

    /* renamed from: a */
    public final C13913g mo26088a() {
        try {
            return new C13913g(this);
        } finally {
            C13715a.m27752c(this.f36305b);
            this.f36305b = null;
            C13715a.m27749a((Iterable<? extends C13715a<?>>) this.f36306c);
            this.f36306c = null;
        }
    }

    public C13914h(C13911e eVar) {
        this.f36304a = eVar;
    }

    /* renamed from: a */
    public final C13914h mo26089a(List<C13715a<Bitmap>> list) {
        this.f36306c = C13715a.m27748a((Collection<C13715a<T>>) list);
        return this;
    }
}
