package p2628d.p2639f.p2641b;

import p2628d.p2648k.C52759b;
import p2628d.p2648k.C52771j;
import p2628d.p2648k.C52771j.C52772a;

/* renamed from: d.f.b.t */
public abstract class C52720t extends C52717q implements C52771j {
    public C52720t() {
    }

    /* access modifiers changed from: protected */
    public C52759b computeReflected() {
        return C52728w.m112249a(this);
    }

    public C52772a getGetter() {
        return ((C52771j) getReflected()).getGetter();
    }

    public C52720t(Object obj) {
        super(obj);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public Object getDelegate(Object obj) {
        return ((C52771j) getReflected()).getDelegate(obj);
    }
}
