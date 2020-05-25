package p2628d.p2631c.p2633b.p2634a;

import java.io.Serializable;
import p2628d.C52848o;
import p2628d.C52851p;
import p2628d.C52860x;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.p2632a.C52601b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.c.b.a.a */
public abstract class C52613a implements C52617e, C52625c<Object>, Serializable {

    /* renamed from: a */
    private final C52625c<Object> f130908a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo110245a() {
    }

    public final C52625c<Object> getCompletion() {
        return this.f130908a;
    }

    /* access modifiers changed from: protected */
    public abstract Object invokeSuspend(Object obj);

    public C52617e getCallerFrame() {
        C52625c<Object> cVar = this.f130908a;
        if (!(cVar instanceof C52617e)) {
            cVar = null;
        }
        return (C52617e) cVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Serializable stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.StackTraceElement getStackTraceElement() {
        /*
            r8 = this;
            java.lang.String r0 = "$this$getStackTraceElementImpl"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            java.lang.Class r0 = r8.getClass()
            java.lang.Class<d.c.b.a.f> r1 = p2628d.p2631c.p2633b.p2634a.C52618f.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            d.c.b.a.f r0 = (p2628d.p2631c.p2633b.p2634a.C52618f) r0
            r1 = 0
            if (r0 != 0) goto L_0x0015
            return r1
        L_0x0015:
            int r2 = r0.mo110253a()
            r3 = 1
            if (r2 > r3) goto L_0x009e
            int r2 = p2628d.p2631c.p2633b.p2634a.C52619g.m112169a(r8)
            if (r2 >= 0) goto L_0x0024
            r2 = -1
            goto L_0x002a
        L_0x0024:
            int[] r3 = r0.mo110255c()
            r2 = r3[r2]
        L_0x002a:
            d.c.b.a.i r3 = p2628d.p2631c.p2633b.p2634a.C52621i.f130914c
            java.lang.String r3 = "continuation"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r3)
            d.c.b.a.i$a r3 = p2628d.p2631c.p2633b.p2634a.C52621i.f130913b
            if (r3 != 0) goto L_0x0039
            d.c.b.a.i$a r3 = p2628d.p2631c.p2633b.p2634a.C52621i.m112172a(r8)
        L_0x0039:
            d.c.b.a.i$a r4 = p2628d.p2631c.p2633b.p2634a.C52621i.f130912a
            if (r3 != r4) goto L_0x003e
            goto L_0x0071
        L_0x003e:
            java.lang.reflect.Method r4 = r3.f130915a
            if (r4 == 0) goto L_0x0071
            java.lang.Class r5 = r8.getClass()
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Object r4 = r4.invoke(r5, r7)
            if (r4 != 0) goto L_0x0050
            goto L_0x0071
        L_0x0050:
            java.lang.reflect.Method r5 = r3.f130916b
            if (r5 == 0) goto L_0x0071
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Object r4 = r5.invoke(r4, r7)
            if (r4 != 0) goto L_0x005d
            goto L_0x0071
        L_0x005d:
            java.lang.reflect.Method r3 = r3.f130917c
            if (r3 == 0) goto L_0x0068
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.Object r3 = r3.invoke(r4, r5)
            goto L_0x0069
        L_0x0068:
            r3 = r1
        L_0x0069:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 != 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r1 = r3
        L_0x006f:
            java.lang.String r1 = (java.lang.String) r1
        L_0x0071:
            if (r1 != 0) goto L_0x0078
            java.lang.String r1 = r0.mo110257e()
            goto L_0x0090
        L_0x0078:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r1 = 47
            r3.append(r1)
            java.lang.String r1 = r0.mo110257e()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L_0x0090:
            java.lang.StackTraceElement r3 = new java.lang.StackTraceElement
            java.lang.String r4 = r0.mo110256d()
            java.lang.String r0 = r0.mo110254b()
            r3.<init>(r1, r4, r0, r2)
            return r3
        L_0x009e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Debug metadata version mismatch. Expected: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ", got "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ". Please update the Kotlin standard library."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p2628d.p2631c.p2633b.p2634a.C52613a.getStackTraceElement():java.lang.StackTraceElement");
    }

    public C52613a(C52625c<Object> cVar) {
        this.f130908a = cVar;
    }

    public C52625c<C52860x> create(C52625c<?> cVar) {
        C52711k.m112240b(cVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public final void resumeWith(Object obj) {
        C52625c cVar = this;
        while (true) {
            C52613a aVar = (C52613a) cVar;
            C52711k.m112240b(aVar, "frame");
            C52625c cVar2 = aVar.f130908a;
            if (cVar2 == null) {
                C52711k.m112234a();
            }
            try {
                Object invokeSuspend = aVar.invokeSuspend(obj);
                if (invokeSuspend != C52601b.m112157a()) {
                    obj = C52848o.m114620constructorimpl(invokeSuspend);
                    aVar.mo110245a();
                    if (cVar2 instanceof C52613a) {
                        cVar = cVar2;
                    } else {
                        cVar2.resumeWith(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                obj = C52848o.m114620constructorimpl(C52851p.m112464a(th));
            }
        }
    }

    public C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
        C52711k.m112240b(cVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
