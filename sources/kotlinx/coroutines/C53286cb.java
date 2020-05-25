package kotlinx.coroutines;

import p2628d.C52848o;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.cb */
final class C53286cb<T> extends C53271br<C53272bs> {

    /* renamed from: a */
    private final C53343k<T> f131913a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResumeAwaitOnCompletion[");
        sb.append(this.f131913a);
        sb.append(']');
        return sb.toString();
    }

    public final /* synthetic */ Object invoke(Object obj) {
        mo110797a((Throwable) obj);
        return C52860x.f131107a;
    }

    /* renamed from: a */
    public final void mo110797a(Throwable th) {
        boolean z;
        Object n = ((C53272bs) this.f131894b).mo110883n();
        if (!(n instanceof C53258bg)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (n instanceof C53354t) {
            this.f131913a.mo110935a(((C53354t) n).f131987b, 0);
        } else {
            this.f131913a.resumeWith(C52848o.m114620constructorimpl(C53277bt.m113248b(n)));
        }
    }

    public C53286cb(C53272bs bsVar, C53343k<? super T> kVar) {
        C52711k.m112240b(bsVar, "job");
        C52711k.m112240b(kVar, "continuation");
        super(bsVar);
        this.f131913a = kVar;
    }
}
