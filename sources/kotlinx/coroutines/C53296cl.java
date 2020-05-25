package kotlinx.coroutines;

import p2628d.p2631c.C52628e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.cl */
public final class C53296cl extends C53360z {

    /* renamed from: b */
    public static final C53296cl f131920b = new C53296cl();

    private C53296cl() {
    }

    /* renamed from: a */
    public final boolean mo19709a(C52628e eVar) {
        C52711k.m112240b(eVar, "context");
        return false;
    }

    public final String toString() {
        return "Unconfined";
    }

    /* renamed from: a */
    public final void mo19708a(C52628e eVar, Runnable runnable) {
        C52711k.m112240b(eVar, "context");
        C52711k.m112240b(runnable, "block");
        throw new UnsupportedOperationException();
    }
}
