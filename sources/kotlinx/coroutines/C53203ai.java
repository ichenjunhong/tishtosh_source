package kotlinx.coroutines;

import kotlinx.coroutines.internal.C53333v;
import p2628d.C52848o;
import p2628d.C52851p;
import p2628d.p2631c.C52625c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.ai */
public final class C53203ai {

    /* renamed from: a */
    public static final boolean f131777a;

    /* renamed from: b */
    public static final boolean f131778b = C53333v.m113368a("kotlinx.coroutines.stacktrace.recovery", true);

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r0.equals("auto") != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r0.equals("on") != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r0.equals("") != false) goto L_0x0048;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = kotlinx.coroutines.internal.C53333v.m113367a(r0)
            r1 = 1
            if (r0 != 0) goto L_0x000a
            goto L_0x0026
        L_0x000a:
            int r2 = r0.hashCode()
            if (r2 == 0) goto L_0x0040
            r3 = 3551(0xddf, float:4.976E-42)
            if (r2 == r3) goto L_0x0037
            r3 = 109935(0x1ad6f, float:1.54052E-40)
            if (r2 == r3) goto L_0x002d
            r3 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r2 != r3) goto L_0x0054
            java.lang.String r2 = "auto"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0054
        L_0x0026:
            java.lang.Class<kotlinx.coroutines.ac> r0 = kotlinx.coroutines.C53195ac.class
            boolean r0 = r0.desiredAssertionStatus()
            goto L_0x0049
        L_0x002d:
            java.lang.String r2 = "off"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0054
            r0 = 0
            goto L_0x0049
        L_0x0037:
            java.lang.String r2 = "on"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0054
            goto L_0x0048
        L_0x0040:
            java.lang.String r2 = ""
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0054
        L_0x0048:
            r0 = 1
        L_0x0049:
            f131777a = r0
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = kotlinx.coroutines.internal.C53333v.m113368a(r0, r1)
            f131778b = r0
            return
        L_0x0054:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
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
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C53203ai.<clinit>():void");
    }

    /* renamed from: a */
    public static final String m113029a(Object obj) {
        C52711k.m112240b(obj, "receiver$0");
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        C52711k.m112236a((Object) hexString, "Integer.toHexString(System.identityHashCode(this))");
        return hexString;
    }

    /* renamed from: b */
    public static final String m113030b(Object obj) {
        C52711k.m112240b(obj, "receiver$0");
        String simpleName = obj.getClass().getSimpleName();
        C52711k.m112236a((Object) simpleName, "this::class.java.simpleName");
        return simpleName;
    }

    /* renamed from: a */
    public static final String m113028a(C52625c<?> cVar) {
        Object obj;
        C52711k.m112240b(cVar, "receiver$0");
        if (cVar instanceof C53221ar) {
            return cVar.toString();
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(cVar);
            sb.append('@');
            sb.append(m113029a((Object) cVar));
            obj = C52848o.m114620constructorimpl(sb.toString());
        } catch (Throwable th) {
            obj = C52848o.m114620constructorimpl(C52851p.m112464a(th));
        }
        if (C52848o.m114623exceptionOrNullimpl(obj) != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cVar.getClass().getName());
            sb2.append('@');
            sb2.append(m113029a((Object) cVar));
            obj = sb2.toString();
        }
        return (String) obj;
    }
}
