package kotlinx.coroutines;

import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.ax */
final class C53227ax extends C53302h {

    /* renamed from: a */
    private final C53226aw f131811a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisposeOnCancel[");
        sb.append(this.f131811a);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo110795a(Throwable th) {
        this.f131811a.mo110788a();
    }

    public final /* synthetic */ Object invoke(Object obj) {
        mo110795a((Throwable) obj);
        return C52860x.f131107a;
    }

    public C53227ax(C53226aw awVar) {
        C52711k.m112240b(awVar, "handle");
        this.f131811a = awVar;
    }
}
