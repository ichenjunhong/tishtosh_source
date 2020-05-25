package com.bytedance.jedi.ext.adapter.p747b;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.p747b.C11959h.C11960a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.jedi.ext.adapter.b.f */
public abstract class C11952f<T> extends C11947c<C11949e<T>> {

    /* renamed from: com.bytedance.jedi.ext.adapter.b.f$a */
    static final class C11953a extends C52712l implements C52671b<ViewGroup, C11949e<T>> {

        /* renamed from: a */
        final /* synthetic */ C11952f f31646a;

        C11953a(C11952f fVar) {
            this.f31646a = fVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "it");
            return this.f31646a.mo22692a(viewGroup);
        }
    }

    /* renamed from: a */
    public abstract C11949e<T> mo22692a(ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo22688a(C11959h<C11949e<T>> hVar) {
        C52711k.m112240b(hVar, "registry");
        C11960a.m24344a((C11959h) hVar, (C52671b) null, (C52682m) null, (C52671b) new C11953a(this), 3, (Object) null);
    }
}
