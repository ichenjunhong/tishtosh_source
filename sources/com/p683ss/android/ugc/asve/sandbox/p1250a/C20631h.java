package com.p683ss.android.ugc.asve.sandbox.p1250a;

import com.p683ss.android.medialib.camera.C19263c;
import com.p683ss.android.ugc.asve.p1241e.C20397h;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20667c.C20668a;
import java.lang.ref.WeakReference;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.h */
public final class C20631h extends C20668a {

    /* renamed from: a */
    public final WeakReference<C19263c> f56479a;

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.h$a */
    static final class C20632a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C20631h f56480a;

        /* renamed from: b */
        final /* synthetic */ int f56481b;

        /* renamed from: c */
        final /* synthetic */ int f56482c;

        /* renamed from: d */
        final /* synthetic */ String f56483d;

        C20632a(C20631h hVar, int i, int i2, String str) {
            this.f56480a = hVar;
            this.f56481b = i;
            this.f56482c = i2;
            this.f56483d = str;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C19263c cVar = (C19263c) this.f56480a.f56479a.get();
            if (cVar != null) {
                cVar.mo39671a(this.f56481b, this.f56482c, this.f56483d);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.h$b */
    static final class C20633b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C20631h f56484a;

        /* renamed from: b */
        final /* synthetic */ int f56485b;

        C20633b(C20631h hVar, int i) {
            this.f56484a = hVar;
            this.f56485b = i;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C19263c cVar = (C19263c) this.f56484a.f56479a.get();
            if (cVar != null) {
                cVar.mo39670a(this.f56485b);
            }
            return C52860x.f131107a;
        }
    }

    public C20631h(C19263c cVar) {
        C52711k.m112240b(cVar, "cameraOpenListener");
        this.f56479a = new WeakReference<>(cVar);
    }

    /* renamed from: a */
    public final void mo43764a(int i) {
        C20397h.m50605a(new C20633b(this, i));
    }

    /* renamed from: a */
    public final void mo43765a(int i, int i2, String str) {
        C20397h.m50605a(new C20632a(this, i, i2, str));
    }
}
