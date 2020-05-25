package kotlinx.coroutines;

import kotlinx.coroutines.p2678a.C53191a;
import p2628d.C52860x;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52628e;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.bv */
final class C53279bv extends C53289ce {

    /* renamed from: b */
    private C52682m<? super C53199ae, ? super C52625c<? super C52860x>, ? extends Object> f131909b;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo110757d() {
        C52682m<? super C53199ae, ? super C52625c<? super C52860x>, ? extends Object> mVar = this.f131909b;
        if (mVar != null) {
            this.f131909b = null;
            C53191a.m113016a(mVar, this, this);
            return;
        }
        throw new IllegalStateException("Already started".toString());
    }

    public C53279bv(C52628e eVar, C52682m<? super C53199ae, ? super C52625c<? super C52860x>, ? extends Object> mVar) {
        C52711k.m112240b(eVar, "parentContext");
        C52711k.m112240b(mVar, "block");
        super(eVar, false);
        this.f131909b = mVar;
    }
}
