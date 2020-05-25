package p2628d.p2631c.p2633b.p2634a;

import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52628e;
import p2628d.p2631c.C52634f;

/* renamed from: d.c.b.a.j */
public abstract class C52623j extends C52613a {
    public C52628e getContext() {
        return C52634f.INSTANCE;
    }

    public C52623j(C52625c<Object> cVar) {
        boolean z;
        super(cVar);
        if (cVar != null) {
            if (cVar.getContext() == C52634f.INSTANCE) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }
}
