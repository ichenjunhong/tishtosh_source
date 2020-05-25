package p2628d.p2639f.p2641b;

import p2628d.p2648k.C52761d;

/* renamed from: d.f.b.o */
public final class C52715o extends C52714n {

    /* renamed from: a */
    private final C52761d f130973a;

    /* renamed from: b */
    private final String f130974b;

    /* renamed from: c */
    private final String f130975c;

    public final String getName() {
        return this.f130974b;
    }

    public final C52761d getOwner() {
        return this.f130973a;
    }

    public final String getSignature() {
        return this.f130975c;
    }

    public final Object get(Object obj) {
        return getGetter().call(obj);
    }

    public final void set(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }

    public C52715o(C52761d dVar, String str, String str2) {
        this.f130973a = dVar;
        this.f130974b = str;
        this.f130975c = str2;
    }
}
