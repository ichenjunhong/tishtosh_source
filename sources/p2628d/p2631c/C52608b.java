package p2628d.p2631c;

import java.io.Serializable;
import p2628d.C52860x;
import p2628d.p2631c.C52628e.C52629a;
import p2628d.p2631c.C52628e.C52631b;
import p2628d.p2631c.C52628e.C52633c;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52722v.C52725c;

/* renamed from: d.c.b */
public final class C52608b implements C52628e, Serializable {

    /* renamed from: a */
    private final C52628e f130901a;

    /* renamed from: b */
    private final C52631b f130902b;

    /* renamed from: d.c.b$a */
    static final class C52609a implements Serializable {

        /* renamed from: a */
        public static final C52610a f130903a = new C52610a(null);
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        private final C52628e[] f130904b;

        /* renamed from: d.c.b$a$a */
        public static final class C52610a {
            private C52610a() {
            }

            public /* synthetic */ C52610a(C52707g gVar) {
                this();
            }
        }

        private final Object readResolve() {
            C52628e[] eVarArr = this.f130904b;
            C52628e eVar = C52634f.INSTANCE;
            for (C52628e plus : eVarArr) {
                eVar = eVar.plus(plus);
            }
            return eVar;
        }

        public C52609a(C52628e[] eVarArr) {
            C52711k.m112240b(eVarArr, "elements");
            this.f130904b = eVarArr;
        }
    }

    /* renamed from: d.c.b$b */
    static final class C52611b extends C52712l implements C52682m<String, C52631b, String> {

        /* renamed from: a */
        public static final C52611b f130905a = new C52611b();

        C52611b() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            boolean z;
            String str = (String) obj;
            C52631b bVar = (C52631b) obj2;
            C52711k.m112240b(str, "acc");
            C52711k.m112240b(bVar, "element");
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return bVar.toString();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(", ");
            sb.append(bVar);
            return sb.toString();
        }
    }

    /* renamed from: d.c.b$c */
    static final class C52612c extends C52712l implements C52682m<C52860x, C52631b, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52628e[] f130906a;

        /* renamed from: b */
        final /* synthetic */ C52725c f130907b;

        C52612c(C52628e[] eVarArr, C52725c cVar) {
            this.f130906a = eVarArr;
            this.f130907b = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52631b bVar = (C52631b) obj2;
            C52711k.m112240b((C52860x) obj, "<anonymous parameter 0>");
            C52711k.m112240b(bVar, "element");
            C52628e[] eVarArr = this.f130906a;
            C52725c cVar = this.f130907b;
            int i = cVar.element;
            cVar.element = i + 1;
            eVarArr[i] = bVar;
            return C52860x.f131107a;
        }
    }

    public final int hashCode() {
        return this.f130901a.hashCode() + this.f130902b.hashCode();
    }

    /* renamed from: a */
    private final int m112158a() {
        C52608b bVar = this;
        int i = 2;
        while (true) {
            C52628e eVar = bVar.f130901a;
            if (!(eVar instanceof C52608b)) {
                eVar = null;
            }
            bVar = (C52608b) eVar;
            if (bVar == null) {
                return i;
            }
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append((String) fold("", C52611b.f130905a));
        sb.append("]");
        return sb.toString();
    }

    private final Object writeReplace() {
        int a = m112158a();
        C52628e[] eVarArr = new C52628e[a];
        C52725c cVar = new C52725c();
        boolean z = false;
        cVar.element = 0;
        fold(C52860x.f131107a, new C52612c(eVarArr, cVar));
        if (cVar.element == a) {
            z = true;
        }
        if (z) {
            return new C52609a(eVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: a */
    private final boolean m112159a(C52631b bVar) {
        return C52711k.m112239a((Object) get(bVar.getKey()), (Object) bVar);
    }

    public final C52628e plus(C52628e eVar) {
        C52711k.m112240b(eVar, "context");
        return C52629a.m112175a(this, eVar);
    }

    public final <E extends C52631b> E get(C52633c<E> cVar) {
        C52711k.m112240b(cVar, "key");
        C52628e eVar = this;
        while (true) {
            C52608b bVar = (C52608b) eVar;
            E e = bVar.f130902b.get(cVar);
            if (e != null) {
                return e;
            }
            eVar = bVar.f130901a;
            if (!(eVar instanceof C52608b)) {
                return eVar.get(cVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r4 != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r3
            d.c.b r0 = (p2628d.p2631c.C52608b) r0
            if (r0 == r4) goto L_0x003e
            boolean r0 = r4 instanceof p2628d.p2631c.C52608b
            r1 = 0
            if (r0 == 0) goto L_0x003d
            d.c.b r4 = (p2628d.p2631c.C52608b) r4
            int r0 = r4.m112158a()
            int r2 = r3.m112158a()
            if (r0 != r2) goto L_0x003d
            r0 = r3
        L_0x0017:
            d.c.e$b r2 = r0.f130902b
            boolean r2 = r4.m112159a(r2)
            if (r2 != 0) goto L_0x0021
            r4 = 0
            goto L_0x0032
        L_0x0021:
            d.c.e r0 = r0.f130901a
            boolean r2 = r0 instanceof p2628d.p2631c.C52608b
            if (r2 == 0) goto L_0x002a
            d.c.b r0 = (p2628d.p2631c.C52608b) r0
            goto L_0x0017
        L_0x002a:
            if (r0 == 0) goto L_0x0035
            d.c.e$b r0 = (p2628d.p2631c.C52628e.C52631b) r0
            boolean r4 = r4.m112159a(r0)
        L_0x0032:
            if (r4 == 0) goto L_0x003d
            goto L_0x003e
        L_0x0035:
            d.u r4 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element"
            r4.<init>(r0)
            throw r4
        L_0x003d:
            return r1
        L_0x003e:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p2628d.p2631c.C52608b.equals(java.lang.Object):boolean");
    }

    public final C52628e minusKey(C52633c<?> cVar) {
        C52711k.m112240b(cVar, "key");
        if (this.f130902b.get(cVar) != null) {
            return this.f130901a;
        }
        C52628e minusKey = this.f130901a.minusKey(cVar);
        if (minusKey == this.f130901a) {
            return this;
        }
        if (minusKey == C52634f.INSTANCE) {
            return this.f130902b;
        }
        return new C52608b(minusKey, this.f130902b);
    }

    public C52608b(C52628e eVar, C52631b bVar) {
        C52711k.m112240b(eVar, "left");
        C52711k.m112240b(bVar, "element");
        this.f130901a = eVar;
        this.f130902b = bVar;
    }

    public final <R> R fold(R r, C52682m<? super R, ? super C52631b, ? extends R> mVar) {
        C52711k.m112240b(mVar, "operation");
        return mVar.invoke(this.f130901a.fold(r, mVar), this.f130902b);
    }
}
