package com.bytedance.jedi.p725a.p734g.p736b;

import com.bytedance.jedi.p725a.p734g.p735a.C11598a;
import com.bytedance.jedi.p725a.p734g.p735a.C11601b;
import com.bytedance.jedi.p725a.p734g.p735a.C11601b.C11603a;
import com.bytedance.jedi.p725a.p734g.p735a.C11605c;
import com.bytedance.jedi.p725a.p734g.p735a.C11607e;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.bytedance.jedi.a.g.b.b */
public final class C11610b<K, V> {

    /* renamed from: a */
    static final C11607e f30990a = new C11607e() {
        /* renamed from: a */
        public final long mo22328a() {
            return 0;
        }
    };

    /* renamed from: q */
    private static final Logger f30991q = Logger.getLogger(C11610b.class.getName());

    /* renamed from: b */
    boolean f30992b = true;

    /* renamed from: c */
    int f30993c = -1;

    /* renamed from: d */
    int f30994d = -1;

    /* renamed from: e */
    long f30995e = -1;

    /* renamed from: f */
    long f30996f = -1;

    /* renamed from: g */
    C11673h<? super K, ? super V> f30997g;

    /* renamed from: h */
    C11648n f30998h;

    /* renamed from: i */
    C11648n f30999i;

    /* renamed from: j */
    long f31000j = -1;

    /* renamed from: k */
    long f31001k = -1;

    /* renamed from: l */
    long f31002l = -1;

    /* renamed from: m */
    C11598a<Object> f31003m;

    /* renamed from: n */
    C11598a<Object> f31004n;

    /* renamed from: o */
    C11671f<? super K, ? super V> f31005o;

    /* renamed from: p */
    C11607e f31006p;

    /* renamed from: com.bytedance.jedi.a.g.b.b$a */
    enum C11612a implements C11671f<Object, Object> {
        INSTANCE
    }

    /* renamed from: com.bytedance.jedi.a.g.b.b$b */
    enum C11613b implements C11673h<Object, Object> {
        INSTANCE
    }

    /* renamed from: a */
    public static C11610b<Object, Object> m23744a() {
        return new C11610b<>();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C11648n mo22335b() {
        return (C11648n) C11601b.m23725a(this.f30998h, C11648n.STRONG);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C11648n mo22336c() {
        return (C11648n) C11601b.m23725a(this.f30999i, C11648n.STRONG);
    }

    private C11610b() {
    }

    /* renamed from: d */
    public final <K1 extends K, V1 extends V> C11609a<K1, V1> mo22337d() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.f30997g == null) {
            if (this.f30996f == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C11605c.m23733a(z2, "maximumWeight requires weigher");
        } else if (this.f30992b) {
            if (this.f30996f != -1) {
                z = true;
            } else {
                z = false;
            }
            C11605c.m23733a(z, "weigher requires maximumWeight");
        } else if (this.f30996f == -1) {
            f30991q.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
        if (this.f31002l == -1) {
            z3 = true;
        }
        C11605c.m23733a(z3, "refreshAfterWrite requires a LoadingCache");
        return new C11644j(this);
    }

    public final String toString() {
        C11603a aVar = new C11603a(getClass().getSimpleName());
        if (this.f30993c != -1) {
            aVar.mo22324a("initialCapacity", this.f30993c);
        }
        if (this.f30994d != -1) {
            aVar.mo22324a("concurrencyLevel", this.f30994d);
        }
        if (this.f30995e != -1) {
            aVar.mo22325a("maximumSize", this.f30995e);
        }
        if (this.f30996f != -1) {
            aVar.mo22325a("maximumWeight", this.f30996f);
        }
        if (this.f31000j != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f31000j);
            sb.append("ns");
            aVar.mo22326a("expireAfterWrite", (Object) sb.toString());
        }
        if (this.f31001k != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f31001k);
            sb2.append("ns");
            aVar.mo22326a("expireAfterAccess", (Object) sb2.toString());
        }
        if (this.f30998h != null) {
            aVar.mo22326a("keyStrength", (Object) this.f30998h.toString());
        }
        if (this.f30999i != null) {
            aVar.mo22326a("valueStrength", (Object) this.f30999i.toString());
        }
        if (this.f31003m != null) {
            aVar.mo22323a("keyEquivalence");
        }
        if (this.f31004n != null) {
            aVar.mo22323a("valueEquivalence");
        }
        if (this.f31005o != null) {
            aVar.mo22323a("removalListener");
        }
        return aVar.toString();
    }

    /* renamed from: a */
    public final C11610b<K, V> mo22334a(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (this.f30995e == -1) {
            z = true;
        } else {
            z = false;
        }
        C11605c.m23734a(z, "maximum size was already set to %s", this.f30995e);
        if (this.f30996f == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C11605c.m23734a(z2, "maximum weight was already set to %s", this.f30996f);
        if (this.f30997g == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C11605c.m23733a(z3, "maximum size can not be combined with weigher");
        if (j >= 0) {
            z4 = true;
        }
        if (z4) {
            this.f30995e = j;
            return this;
        }
        throw new IllegalArgumentException(String.valueOf("maximum size must not be negative"));
    }
}
