package kotlinx.coroutines;

import p2628d.p2631c.C52599a;
import p2628d.p2631c.C52628e;
import p2628d.p2631c.C52628e.C52631b;
import p2628d.p2631c.C52628e.C52631b.C52632a;
import p2628d.p2631c.C52628e.C52633c;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.ac */
public final class C53195ac extends C52599a implements C53290cf<String> {

    /* renamed from: b */
    public static final C53196a f131770b = new C53196a(null);

    /* renamed from: a */
    public final long f131771a;

    /* renamed from: kotlinx.coroutines.ac$a */
    public static final class C53196a implements C52633c<C53195ac> {
        private C53196a() {
        }

        public /* synthetic */ C53196a(C52707g gVar) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53195ac) {
                if (this.f131771a == ((C53195ac) obj).f131771a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f131771a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoroutineId(");
        sb.append(this.f131771a);
        sb.append(')');
        return sb.toString();
    }

    public C53195ac(long j) {
        super(f131770b);
        this.f131771a = j;
    }

    public final <E extends C52631b> E get(C52633c<E> cVar) {
        C52711k.m112240b(cVar, "key");
        C52711k.m112240b(cVar, "key");
        return C52632a.m112176a((C52631b) this, cVar);
    }

    public final C52628e minusKey(C52633c<?> cVar) {
        C52711k.m112240b(cVar, "key");
        C52711k.m112240b(cVar, "key");
        return C52632a.m112179b(this, cVar);
    }

    public final C52628e plus(C52628e eVar) {
        C52711k.m112240b(eVar, "context");
        C52711k.m112240b(eVar, "context");
        return C52632a.m112177a((C52631b) this, eVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r10 == null) goto L_0x0015;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo110761a(p2628d.p2631c.C52628e r10) {
        /*
            r9 = this;
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            kotlinx.coroutines.ad$a r0 = kotlinx.coroutines.C53197ad.f131772b
            d.c.e$c r0 = (p2628d.p2631c.C52628e.C52633c) r0
            d.c.e$b r10 = r10.get(r0)
            kotlinx.coroutines.ad r10 = (kotlinx.coroutines.C53197ad) r10
            if (r10 == 0) goto L_0x0015
            java.lang.String r10 = r10.f131773a
            if (r10 != 0) goto L_0x0017
        L_0x0015:
            java.lang.String r10 = "coroutine"
        L_0x0017:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "currentThread"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = "oldName"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r4 = " @"
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            int r2 = p2628d.p2650m.C52830p.m112446b(r3, r4, r5, r6, r7, r8)
            if (r2 >= 0) goto L_0x003c
            int r2 = r1.length()
        L_0x003c:
            int r3 = r10.length()
            int r3 = r3 + r2
            int r3 = r3 + 10
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r3 = 0
            java.lang.String r2 = r1.substring(r3, r2)
            java.lang.String r3 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r4.append(r2)
            java.lang.String r2 = " @"
            r4.append(r2)
            r4.append(r10)
            r10 = 35
            r4.append(r10)
            long r2 = r9.f131771a
            r4.append(r2)
            java.lang.String r10 = r4.toString()
            java.lang.String r2 = "StringBuilder(capacity).…builderAction).toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r2)
            r0.setName(r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C53195ac.mo110761a(d.c.e):java.lang.Object");
    }

    /* renamed from: a */
    public final /* synthetic */ void mo110762a(C52628e eVar, Object obj) {
        String str = (String) obj;
        C52711k.m112240b(eVar, "context");
        C52711k.m112240b(str, "oldState");
        Thread currentThread = Thread.currentThread();
        C52711k.m112236a((Object) currentThread, "Thread.currentThread()");
        currentThread.setName(str);
    }

    public final <R> R fold(R r, C52682m<? super R, ? super C52631b, ? extends R> mVar) {
        C52711k.m112240b(mVar, "operation");
        C52711k.m112240b(mVar, "operation");
        return C52632a.m112178a(this, r, mVar);
    }
}
