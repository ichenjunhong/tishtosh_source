package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicLong;
import p2628d.p2631c.C52626d;
import p2628d.p2631c.C52628e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.y */
public final class C53359y {

    /* renamed from: a */
    static final boolean f131989a;

    /* renamed from: b */
    private static final AtomicLong f131990b = new AtomicLong();

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r0.equals("on") != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (r0.equals("") != false) goto L_0x003a;
     */
    static {
        /*
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            f131990b = r0
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = kotlinx.coroutines.internal.C53333v.m113367a(r0)
            if (r0 != 0) goto L_0x0010
            goto L_0x003a
        L_0x0010:
            int r1 = r0.hashCode()
            if (r1 == 0) goto L_0x0032
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L_0x0029
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L_0x003e
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003e
            r0 = 0
            goto L_0x003b
        L_0x0029:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003e
            goto L_0x003a
        L_0x0032:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003e
        L_0x003a:
            r0 = 1
        L_0x003b:
            f131989a = r0
            return
        L_0x003e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.<init>(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C53359y.<clinit>():void");
    }

    /* renamed from: a */
    public static final C52628e m113423a(C53199ae aeVar, C52628e eVar) {
        C52628e eVar2;
        C52711k.m112240b(aeVar, "receiver$0");
        C52711k.m112240b(eVar, "context");
        C52628e plus = aeVar.mo65786a().plus(eVar);
        if (C53203ai.f131777a) {
            eVar2 = plus.plus(new C53195ac(f131990b.incrementAndGet()));
        } else {
            eVar2 = plus;
        }
        if (plus == C53225av.m113073a() || plus.get(C52626d.f130919a) != null) {
            return eVar2;
        }
        return eVar2.plus(C53225av.m113073a());
    }
}
