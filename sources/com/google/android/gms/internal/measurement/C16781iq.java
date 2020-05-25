package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.iq */
final class C16781iq<T> implements C16793jb<T> {

    /* renamed from: a */
    private final C16775ik f47165a;

    /* renamed from: b */
    private final C16812ju<?, ?> f47166b;

    /* renamed from: c */
    private final boolean f47167c;

    /* renamed from: d */
    private final C16723gr<?> f47168d;

    private C16781iq(C16812ju<?, ?> juVar, C16723gr<?> grVar, C16775ik ikVar) {
        this.f47166b = juVar;
        this.f47167c = grVar.mo32199a(ikVar);
        this.f47168d = grVar;
        this.f47165a = ikVar;
    }

    /* renamed from: a */
    static <T> C16781iq<T> m40455a(C16812ju<?, ?> juVar, C16723gr<?> grVar, C16775ik ikVar) {
        return new C16781iq<>(juVar, grVar, ikVar);
    }

    /* renamed from: a */
    public final T mo32298a() {
        return this.f47165a.mo32233i().mo32238c();
    }

    /* renamed from: a */
    public final boolean mo32301a(T t, T t2) {
        if (!this.f47166b.mo32365b(t).equals(this.f47166b.mo32365b(t2))) {
            return false;
        }
        if (this.f47167c) {
            return this.f47168d.mo32193a((Object) t).equals(this.f47168d.mo32193a((Object) t2));
        }
        return true;
    }

    /* renamed from: a */
    public final int mo32297a(T t) {
        int hashCode = this.f47166b.mo32365b(t).hashCode();
        return this.f47167c ? (hashCode * 53) + this.f47168d.mo32193a((Object) t).hashCode() : hashCode;
    }

    /* renamed from: b */
    public final void mo32303b(T t, T t2) {
        C16795jd.m40545a(this.f47166b, t, t2);
        if (this.f47167c) {
            C16795jd.m40544a(this.f47168d, t, t2);
        }
    }

    /* renamed from: a */
    public final void mo32300a(T t, C16838kp kpVar) throws IOException {
        Iterator c = this.f47168d.mo32193a((Object) t).mo32205c();
        while (c.hasNext()) {
            Entry entry = (Entry) c.next();
            C16728gw gwVar = (C16728gw) entry.getKey();
            if (gwVar.mo32214c() != C16837ko.zzcek || gwVar.mo32215d() || gwVar.mo32216e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof C16753hp) {
                kpVar.mo32152a(gwVar.mo32210a(), (Object) ((C16751hn) ((C16753hp) entry).f47117a.getValue()).mo32258c());
            } else {
                kpVar.mo32152a(gwVar.mo32210a(), entry.getValue());
            }
        }
        C16812ju<?, ?> juVar = this.f47166b;
        juVar.mo32367b(juVar.mo32365b(t), kpVar);
    }

    /* renamed from: a */
    public final void mo32299a(T t, C16792ja jaVar, C16721gq gqVar) throws IOException {
        boolean z;
        C16812ju<?, ?> juVar = this.f47166b;
        C16723gr<?> grVar = this.f47168d;
        Object c = juVar.mo32369c(t);
        C16726gu b = grVar.mo32200b(t);
        do {
            try {
                if (jaVar.mo32065a() == Integer.MAX_VALUE) {
                    juVar.mo32368b((Object) t, c);
                    return;
                }
                int b2 = jaVar.mo32070b();
                if (b2 == 11) {
                    Object obj = null;
                    C16691fs fsVar = null;
                    int i = 0;
                    while (jaVar.mo32065a() != Integer.MAX_VALUE) {
                        int b3 = jaVar.mo32070b();
                        if (b3 == 16) {
                            i = jaVar.mo32098o();
                            obj = grVar.mo32194a(gqVar, this.f47165a, i);
                        } else if (b3 == 26) {
                            if (obj != null) {
                                grVar.mo32197a(jaVar, obj, gqVar, b);
                            } else {
                                fsVar = jaVar.mo32096n();
                            }
                        } else if (!jaVar.mo32075c()) {
                            break;
                        }
                    }
                    if (jaVar.mo32070b() != 12) {
                        throw C16748hk.m40325d();
                    } else if (fsVar != null) {
                        if (obj != null) {
                            grVar.mo32196a(fsVar, obj, gqVar, b);
                        } else {
                            juVar.mo32360a(c, i, fsVar);
                        }
                    }
                } else if ((b2 & 7) == 2) {
                    Object a = grVar.mo32194a(gqVar, this.f47165a, b2 >>> 3);
                    if (a != null) {
                        grVar.mo32197a(jaVar, a, gqVar, b);
                    } else {
                        z = juVar.mo32364a(c, jaVar);
                        continue;
                    }
                } else {
                    z = jaVar.mo32075c();
                    continue;
                }
                z = true;
                continue;
            } finally {
                juVar.mo32368b((Object) t, c);
            }
        } while (z);
    }

    /* renamed from: c */
    public final void mo32304c(T t) {
        this.f47166b.mo32371d(t);
        this.f47168d.mo32201c(t);
    }

    /* renamed from: d */
    public final boolean mo32305d(T t) {
        return this.f47168d.mo32193a((Object) t).mo32207d();
    }

    /* renamed from: b */
    public final int mo32302b(T t) {
        C16812ju<?, ?> juVar = this.f47166b;
        int e = juVar.mo32372e(juVar.mo32365b(t)) + 0;
        if (!this.f47167c) {
            return e;
        }
        C16726gu a = this.f47168d.mo32193a((Object) t);
        int i = 0;
        for (int i2 = 0; i2 < a.f47003a.mo32315b(); i2++) {
            i += C16726gu.m40244a(a.f47003a.mo32316b(i2));
        }
        for (Entry a2 : a.f47003a.mo32317c()) {
            i += C16726gu.m40244a(a2);
        }
        return e + i;
    }
}
