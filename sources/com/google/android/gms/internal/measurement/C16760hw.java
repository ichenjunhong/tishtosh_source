package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.hw */
final class C16760hw extends C16758hu {

    /* renamed from: a */
    private static final Class<?> f47128a = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C16760hw() {
        super();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <L> List<L> mo32265a(Object obj, long j) {
        return m40350a(obj, j, 10);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo32267b(Object obj, long j) {
        Object obj2;
        List list = (List) C16819ka.m40704f(obj, j);
        if (list instanceof C16757ht) {
            obj2 = ((C16757ht) list).mo32262e();
        } else if (!f47128a.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C16787iw) || !(list instanceof C16747hj)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C16747hj hjVar = (C16747hj) list;
                if (hjVar.mo31993a()) {
                    hjVar.mo31998b();
                }
                return;
            }
        } else {
            return;
        }
        C16819ka.m40684a(obj, j, obj2);
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.Object, com.google.android.gms.internal.measurement.hs, com.google.android.gms.internal.measurement.fo] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.List<L>] */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> m40350a(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = m40351c(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C16757ht
            if (r1 == 0) goto L_0x0014
            com.google.android.gms.internal.measurement.hs r0 = new com.google.android.gms.internal.measurement.hs
            r0.<init>(r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C16787iw
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C16747hj
            if (r1 == 0) goto L_0x0024
            com.google.android.gms.internal.measurement.hj r0 = (com.google.android.gms.internal.measurement.C16747hj) r0
            com.google.android.gms.internal.measurement.hj r6 = r0.mo32008a(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r3, r4, r0)
            goto L_0x007f
        L_0x002d:
            java.lang.Class<?> r1 = f47128a
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r3, r4, r1)
        L_0x0049:
            r0 = r1
            goto L_0x007f
        L_0x004b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C16815jx
            if (r1 == 0) goto L_0x0062
            com.google.android.gms.internal.measurement.hs r1 = new com.google.android.gms.internal.measurement.hs
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            com.google.android.gms.internal.measurement.jx r0 = (com.google.android.gms.internal.measurement.C16815jx) r0
            r1.addAll(r0)
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r3, r4, r1)
            goto L_0x0049
        L_0x0062:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C16787iw
            if (r1 == 0) goto L_0x007f
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C16747hj
            if (r1 == 0) goto L_0x007f
            r1 = r0
            com.google.android.gms.internal.measurement.hj r1 = (com.google.android.gms.internal.measurement.C16747hj) r1
            boolean r2 = r1.mo31993a()
            if (r2 != 0) goto L_0x007f
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.measurement.hj r0 = r1.mo32008a(r0)
            com.google.android.gms.internal.measurement.C16819ka.m40684a(r3, r4, r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16760hw.m40350a(java.lang.Object, long, int):java.util.List");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <E> void mo32266a(Object obj, Object obj2, long j) {
        List c = m40351c(obj2, j);
        List a = m40350a(obj, j, c.size());
        int size = a.size();
        int size2 = c.size();
        if (size > 0 && size2 > 0) {
            a.addAll(c);
        }
        if (size > 0) {
            c = a;
        }
        C16819ka.m40684a(obj, j, (Object) c);
    }

    /* renamed from: c */
    private static <E> List<E> m40351c(Object obj, long j) {
        return (List) C16819ka.m40704f(obj, j);
    }
}
