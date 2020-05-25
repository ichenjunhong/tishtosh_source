package p2628d.p2631c.p2633b.p2634a;

import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52626d;
import p2628d.p2631c.C52628e;
import p2628d.p2631c.C52628e.C52631b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.c.b.a.d */
public abstract class C52616d extends C52613a {

    /* renamed from: a */
    private transient C52625c<Object> f130910a;

    /* renamed from: b */
    private final C52628e f130911b;

    public C52628e getContext() {
        C52628e eVar = this.f130911b;
        if (eVar == null) {
            C52711k.m112234a();
        }
        return eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo110245a() {
        C52625c<Object> cVar = this.f130910a;
        if (!(cVar == null || cVar == this)) {
            C52631b bVar = getContext().get(C52626d.f130919a);
            if (bVar == null) {
                C52711k.m112234a();
            }
            ((C52626d) bVar).mo110260b(cVar);
        }
        this.f130910a = C52615c.f130909a;
    }

    public final C52625c<Object> intercepted() {
        C52625c<Object> cVar = this.f130910a;
        if (cVar == null) {
            C52626d dVar = (C52626d) getContext().get(C52626d.f130919a);
            if (dVar != null) {
                cVar = dVar.mo110259a(this);
            } else {
                cVar = this;
            }
            this.f130910a = cVar;
        }
        return cVar;
    }

    public C52616d(C52625c<Object> cVar) {
        C52628e eVar;
        if (cVar != null) {
            eVar = cVar.getContext();
        } else {
            eVar = null;
        }
        this(cVar, eVar);
    }

    public C52616d(C52625c<Object> cVar, C52628e eVar) {
        super(cVar);
        this.f130911b = eVar;
    }
}
