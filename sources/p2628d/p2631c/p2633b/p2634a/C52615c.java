package p2628d.p2631c.p2633b.p2634a;

import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52628e;

/* renamed from: d.c.b.a.c */
public final class C52615c implements C52625c<Object> {

    /* renamed from: a */
    public static final C52615c f130909a = new C52615c();

    private C52615c() {
    }

    public final String toString() {
        return "This continuation is already complete";
    }

    public final C52628e getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }
}
