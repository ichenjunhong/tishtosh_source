package p2628d.p2631c;

import p2628d.p2631c.C52628e.C52631b;
import p2628d.p2631c.C52628e.C52631b.C52632a;
import p2628d.p2631c.C52628e.C52633c;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.c.a */
public abstract class C52599a implements C52631b {
    private final C52633c<?> key;

    public C52633c<?> getKey() {
        return this.key;
    }

    public C52599a(C52633c<?> cVar) {
        C52711k.m112240b(cVar, "key");
        this.key = cVar;
    }

    public <E extends C52631b> E get(C52633c<E> cVar) {
        C52711k.m112240b(cVar, "key");
        return C52632a.m112176a((C52631b) this, cVar);
    }

    public C52628e minusKey(C52633c<?> cVar) {
        C52711k.m112240b(cVar, "key");
        return C52632a.m112179b(this, cVar);
    }

    public C52628e plus(C52628e eVar) {
        C52711k.m112240b(eVar, "context");
        return C52632a.m112177a((C52631b) this, eVar);
    }

    public <R> R fold(R r, C52682m<? super R, ? super C52631b, ? extends R> mVar) {
        C52711k.m112240b(mVar, "operation");
        return C52632a.m112178a(this, r, mVar);
    }
}
