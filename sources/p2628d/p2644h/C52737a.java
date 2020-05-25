package p2628d.p2644h;

import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2648k.C52767h;

/* renamed from: d.h.a */
public abstract class C52737a<T> implements C52738b<Object, T> {

    /* renamed from: a */
    private T f130988a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo52013a(C52767h<?> hVar, T t, T t2) {
        C52711k.m112240b(hVar, "property");
    }

    public C52737a(T t) {
        this.f130988a = t;
    }

    /* renamed from: a */
    public final T mo110333a(Object obj, C52767h<?> hVar) {
        C52711k.m112240b(hVar, "property");
        return this.f130988a;
    }

    /* renamed from: a */
    public final void mo110334a(Object obj, C52767h<?> hVar, T t) {
        C52711k.m112240b(hVar, "property");
        T t2 = this.f130988a;
        C52711k.m112240b(hVar, "property");
        this.f130988a = t;
        mo52013a(hVar, t2, t);
    }
}
