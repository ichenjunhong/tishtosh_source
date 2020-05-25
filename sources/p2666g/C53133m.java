package p2666g;

import okhttp3.C53504ad;
import okhttp3.C53506ae;

/* renamed from: g.m */
public final class C53133m<T> {

    /* renamed from: a */
    public final C53504ad f131635a;

    /* renamed from: b */
    public final T f131636b;

    /* renamed from: c */
    public final C53506ae f131637c;

    /* renamed from: a */
    public final int mo110644a() {
        return this.f131635a.f132400c;
    }

    /* renamed from: b */
    public final String mo110645b() {
        return this.f131635a.f132401d;
    }

    /* renamed from: c */
    public final boolean mo110646c() {
        return this.f131635a.mo111275a();
    }

    public final String toString() {
        return this.f131635a.toString();
    }

    /* renamed from: a */
    public static <T> C53133m<T> m112928a(T t, C53504ad adVar) {
        C53139p.m112957a(adVar, "rawResponse == null");
        if (adVar.mo111275a()) {
            return new C53133m<>(adVar, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    C53133m(C53504ad adVar, T t, C53506ae aeVar) {
        this.f131635a = adVar;
        this.f131636b = t;
        this.f131637c = aeVar;
    }
}
