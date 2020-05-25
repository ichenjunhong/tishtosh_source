package p2628d.p2649l;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.l.a */
public final class C52776a<T> implements C52785g<T> {

    /* renamed from: a */
    private final AtomicReference<C52785g<T>> f131006a;

    /* renamed from: a */
    public final Iterator<T> mo110157a() {
        C52785g gVar = (C52785g) this.f131006a.getAndSet(null);
        if (gVar != null) {
            return gVar.mo110157a();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }

    public C52776a(C52785g<? extends T> gVar) {
        C52711k.m112240b(gVar, "sequence");
        this.f131006a = new AtomicReference<>(gVar);
    }
}
