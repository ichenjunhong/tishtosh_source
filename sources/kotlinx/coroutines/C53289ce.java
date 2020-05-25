package kotlinx.coroutines;

import p2628d.C52860x;
import p2628d.p2631c.C52628e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.ce */
class C53289ce extends C53190a<C52860x> {
    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo110780h() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo110882d(Throwable th) {
        C52711k.m112240b(th, "exception");
        C53194ab.m113021a(this.f131767a, th);
    }

    public C53289ce(C52628e eVar, boolean z) {
        C52711k.m112240b(eVar, "parentContext");
        super(eVar, z);
    }
}
