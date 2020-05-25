package kotlinx.coroutines;

import p2628d.p2631c.C52599a;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52626d;
import p2628d.p2631c.C52628e;
import p2628d.p2631c.C52628e.C52631b;
import p2628d.p2631c.C52628e.C52633c;
import p2628d.p2631c.C52634f;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.z */
public abstract class C53360z extends C52599a implements C52626d {
    /* renamed from: a */
    public abstract void mo19708a(C52628e eVar, Runnable runnable);

    /* renamed from: a */
    public boolean mo19709a(C52628e eVar) {
        C52711k.m112240b(eVar, "context");
        return true;
    }

    public C53360z() {
        super(C52626d.f130919a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C53203ai.m113030b(this));
        sb.append('@');
        sb.append(C53203ai.m113029a((Object) this));
        return sb.toString();
    }

    /* renamed from: a */
    public final <T> C52625c<T> mo110259a(C52625c<? super T> cVar) {
        C52711k.m112240b(cVar, "continuation");
        return new C53221ar<>(this, cVar);
    }

    /* renamed from: b */
    public final void mo110260b(C52625c<?> cVar) {
        C52711k.m112240b(cVar, "continuation");
        C52711k.m112240b(cVar, "continuation");
    }

    public <E extends C52631b> E get(C52633c<E> cVar) {
        C52711k.m112240b(cVar, "key");
        C52711k.m112240b(cVar, "key");
        if (cVar == C52626d.f130919a) {
            return this;
        }
        return null;
    }

    public C52628e minusKey(C52633c<?> cVar) {
        C52711k.m112240b(cVar, "key");
        C52711k.m112240b(cVar, "key");
        if (cVar == C52626d.f130919a) {
            return C52634f.INSTANCE;
        }
        return this;
    }
}
