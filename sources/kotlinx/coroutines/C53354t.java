package kotlinx.coroutines;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.t */
public class C53354t {

    /* renamed from: b */
    public final Throwable f131987b;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C53203ai.m113030b(this));
        sb.append('[');
        sb.append(this.f131987b);
        sb.append(']');
        return sb.toString();
    }

    public C53354t(Throwable th) {
        C52711k.m112240b(th, "cause");
        this.f131987b = th;
    }
}
