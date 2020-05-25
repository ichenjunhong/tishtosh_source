package com.google.p1057b.p1059b;

import com.google.p1057b.p1058a.C17405c;
import com.google.p1057b.p1058a.C17406d;
import com.google.p1057b.p1058a.C17413h;
import com.google.p1057b.p1058a.C17413h.C17415a;
import com.google.p1057b.p1058a.C17421k;
import com.google.p1057b.p1058a.C17432q;
import com.google.p1057b.p1058a.C17433r.C17436c;
import com.google.p1057b.p1058a.C17438t;
import com.google.p1057b.p1059b.C17440a.C17441a;
import com.google.p1057b.p1059b.C17440a.C17442b;
import com.google.p1057b.p1059b.C17454g.C17495p;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.b.b.c */
public final class C17444c<K, V> {

    /* renamed from: a */
    static final C17432q<? extends C17442b> f48986a = new C17436c(new C17442b() {
        /* renamed from: a */
        public final void mo33766a() {
        }

        /* renamed from: a */
        public final void mo33767a(int i) {
        }

        /* renamed from: a */
        public final void mo33768a(long j) {
        }

        /* renamed from: b */
        public final void mo33769b(int i) {
        }

        /* renamed from: b */
        public final void mo33770b(long j) {
        }
    });

    /* renamed from: b */
    static final C17452e f48987b;

    /* renamed from: c */
    static final C17432q<C17442b> f48988c = new C17432q<C17442b>() {
        public final /* synthetic */ Object get() {
            return new C17441a();
        }
    };

    /* renamed from: d */
    static final C17438t f48989d = new C17438t() {
        /* renamed from: a */
        public final long mo33765a() {
            return 0;
        }
    };

    /* renamed from: u */
    private static final Logger f48990u = Logger.getLogger(C17444c.class.getName());

    /* renamed from: e */
    boolean f48991e = true;

    /* renamed from: f */
    int f48992f = -1;

    /* renamed from: g */
    int f48993g = -1;

    /* renamed from: h */
    long f48994h = -1;

    /* renamed from: i */
    long f48995i = -1;

    /* renamed from: j */
    C17527p<? super K, ? super V> f48996j;

    /* renamed from: k */
    C17495p f48997k;

    /* renamed from: l */
    C17495p f48998l;

    /* renamed from: m */
    long f48999m = -1;

    /* renamed from: n */
    long f49000n = -1;

    /* renamed from: o */
    long f49001o = -1;

    /* renamed from: p */
    C17406d<Object> f49002p;

    /* renamed from: q */
    C17406d<Object> f49003q;

    /* renamed from: r */
    C17522m<? super K, ? super V> f49004r;

    /* renamed from: s */
    C17438t f49005s;

    /* renamed from: t */
    public C17432q<? extends C17442b> f49006t = f48986a;

    /* renamed from: com.google.b.b.c$a */
    enum C17448a implements C17522m<Object, Object> {
        INSTANCE;

        /* renamed from: a */
        public final void mo33783a(C17523n<Object, Object> nVar) {
        }
    }

    /* renamed from: com.google.b.b.c$b */
    enum C17449b implements C17527p<Object, Object> {
        INSTANCE
    }

    /* renamed from: a */
    public static C17444c<Object, Object> m42708a() {
        return new C17444c<>();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C17495p mo33779b() {
        return (C17495p) C17413h.m42638a(this.f48997k, C17495p.STRONG);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C17495p mo33780c() {
        return (C17495p) C17413h.m42638a(this.f48998l, C17495p.STRONG);
    }

    private C17444c() {
    }

    static {
        C17452e eVar = new C17452e(0, 0, 0, 0, 0, 0);
        f48987b = eVar;
    }

    /* renamed from: d */
    public final <K1 extends K, V1 extends V> C17443b<K1, V1> mo33781d() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.f48996j == null) {
            if (this.f48995i == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C17421k.m42668b(z2, (Object) "maximumWeight requires weigher");
        } else if (this.f48991e) {
            if (this.f48995i != -1) {
                z = true;
            } else {
                z = false;
            }
            C17421k.m42668b(z, (Object) "weigher requires maximumWeight");
        } else if (this.f48995i == -1) {
            f48990u.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
        if (this.f49001o == -1) {
            z3 = true;
        }
        C17421k.m42668b(z3, (Object) "refreshAfterWrite requires a LoadingCache");
        return new C17488k(this);
    }

    public final String toString() {
        C17415a a = C17413h.m42637a(this);
        if (this.f48992f != -1) {
            a.mo33741a("initialCapacity", this.f48992f);
        }
        if (this.f48993g != -1) {
            a.mo33741a("concurrencyLevel", this.f48993g);
        }
        if (this.f48994h != -1) {
            a.mo33742a("maximumSize", this.f48994h);
        }
        if (this.f48995i != -1) {
            a.mo33742a("maximumWeight", this.f48995i);
        }
        if (this.f48999m != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f48999m);
            sb.append("ns");
            a.mo33743a("expireAfterWrite", (Object) sb.toString());
        }
        if (this.f49000n != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f49000n);
            sb2.append("ns");
            a.mo33743a("expireAfterAccess", (Object) sb2.toString());
        }
        if (this.f48997k != null) {
            a.mo33743a("keyStrength", (Object) C17405c.m42620a(this.f48997k.toString()));
        }
        if (this.f48998l != null) {
            a.mo33743a("valueStrength", (Object) C17405c.m42620a(this.f48998l.toString()));
        }
        if (this.f49002p != null) {
            a.mo33740a("keyEquivalence");
        }
        if (this.f49003q != null) {
            a.mo33740a("valueEquivalence");
        }
        if (this.f49004r != null) {
            a.mo33740a("removalListener");
        }
        return a.toString();
    }

    /* renamed from: a */
    public final C17444c<K, V> mo33777a(C17495p pVar) {
        boolean z;
        if (this.f48998l == null) {
            z = true;
        } else {
            z = false;
        }
        C17421k.m42669b(z, "Value strength was already set to %s", this.f48998l);
        this.f48998l = (C17495p) C17421k.m42653a(pVar);
        return this;
    }

    /* renamed from: a */
    public final C17444c<K, V> mo33776a(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (this.f48994h == -1) {
            z = true;
        } else {
            z = false;
        }
        C17421k.m42662a(z, "maximum size was already set to %s", this.f48994h);
        if (this.f48995i == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C17421k.m42662a(z2, "maximum weight was already set to %s", this.f48995i);
        if (this.f48996j == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C17421k.m42668b(z3, (Object) "maximum size can not be combined with weigher");
        if (j >= 0) {
            z4 = true;
        }
        C17421k.m42660a(z4, (Object) "maximum size must not be negative");
        this.f48994h = j;
        return this;
    }

    /* renamed from: a */
    public final <K1 extends K, V1 extends V> C17444c<K1, V1> mo33778a(C17522m<? super K1, ? super V1> mVar) {
        boolean z;
        if (this.f49004r == null) {
            z = true;
        } else {
            z = false;
        }
        C17421k.m42667b(z);
        this.f49004r = (C17522m) C17421k.m42653a(mVar);
        return this;
    }
}
