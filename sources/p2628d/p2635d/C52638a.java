package p2628d.p2635d;

import java.lang.reflect.Method;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2645i.C52742b;
import p2628d.p2645i.C52744c;

/* renamed from: d.d.a */
public class C52638a {

    /* renamed from: d.d.a$a */
    static final class C52639a {

        /* renamed from: a */
        public static final Method f130927a;

        /* renamed from: b */
        public static final C52639a f130928b = new C52639a();

        private C52639a() {
        }

        /* JADX WARNING: type inference failed for: r5v0 */
        /* JADX WARNING: type inference failed for: r5v3 */
        /* JADX WARNING: type inference failed for: r5v6 */
        /* JADX WARNING: type inference failed for: r5v8 */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
            if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) (java.lang.Class) r5, (java.lang.Object) r0) != false) goto L_0x0049;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 2 */
        static {
            /*
                d.d.a$a r0 = new d.d.a$a
                r0.<init>()
                f130928b = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableClass.methods"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L_0x0015:
                r5 = 0
                if (r4 >= r2) goto L_0x0050
                r6 = r1[r4]
                java.lang.String r7 = "it"
                p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r8)
                r8 = 1
                if (r7 == 0) goto L_0x0048
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r9 = "it.parameterTypes"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r9)
                java.lang.String r9 = "$this$singleOrNull"
                p2628d.p2639f.p2641b.C52711k.m112240b(r7, r9)
                int r9 = r7.length
                if (r9 != r8) goto L_0x003f
                r5 = r7[r3]
            L_0x003f:
                java.lang.Class r5 = (java.lang.Class) r5
                boolean r5 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r0)
                if (r5 == 0) goto L_0x0048
                goto L_0x0049
            L_0x0048:
                r8 = 0
            L_0x0049:
                if (r8 == 0) goto L_0x004d
                r5 = r6
                goto L_0x0050
            L_0x004d:
                int r4 = r4 + 1
                goto L_0x0015
            L_0x0050:
                f130927a = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p2628d.p2635d.C52638a.C52639a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public C52744c mo110266a() {
        return new C52742b();
    }

    /* renamed from: a */
    public void mo110267a(Throwable th, Throwable th2) {
        C52711k.m112240b(th, "cause");
        C52711k.m112240b(th2, "exception");
        Method method = C52639a.f130927a;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }
}
