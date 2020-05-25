package kotlinx.coroutines;

import kotlinx.coroutines.p2678a.C53191a;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52628e;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.bu */
final class C53278bu<T> extends C53208an<T> {

    /* renamed from: b */
    private C52682m<? super C53199ae, ? super C52625c<? super T>, ? extends Object> f131908b;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo110757d() {
        C52682m<? super C53199ae, ? super C52625c<? super T>, ? extends Object> mVar = this.f131908b;
        if (mVar != null) {
            this.f131908b = null;
            C53191a.m113016a(mVar, this, this);
            return;
        }
        throw new IllegalStateException("Already started".toString());
    }

    public C53278bu(C52628e eVar, C52682m<? super C53199ae, ? super C52625c<? super T>, ? extends Object> mVar) {
        C52711k.m112240b(eVar, "parentContext");
        C52711k.m112240b(mVar, "block");
        super(eVar, false);
        this.f131908b = mVar;
    }
}
