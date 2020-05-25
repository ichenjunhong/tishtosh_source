package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

final class ayv extends ayt {

    /* renamed from: a */
    private static final Class<?> f41649a = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private ayv() {
        super();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <L> List<L> mo29861a(Object obj, long j) {
        return m34809a(obj, j, 10);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo29863b(Object obj, long j) {
        Object obj2;
        List list = (List) bba.m35174f(obj, j);
        if (list instanceof ays) {
            obj2 = ((ays) list).mo29858e();
        } else if (!f41649a.isAssignableFrom(list.getClass())) {
            if (!(list instanceof azw) || !(list instanceof ayh)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                ayh ayh = (ayh) list;
                if (ayh.mo29588a()) {
                    ayh.mo29593b();
                }
                return;
            }
        } else {
            return;
        }
        bba.m35154a(obj, j, obj2);
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [com.google.android.gms.internal.ads.awh, java.lang.Object, com.google.android.gms.internal.ads.ayr] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.List<L>] */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> m34809a(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = m34810c(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.ays
            if (r1 == 0) goto L_0x0014
            com.google.android.gms.internal.ads.ayr r0 = new com.google.android.gms.internal.ads.ayr
            r0.<init>(r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.azw
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.ayh
            if (r1 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.ayh r0 = (com.google.android.gms.internal.ads.ayh) r0
            com.google.android.gms.internal.ads.ayh r6 = r0.mo29603a(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            com.google.android.gms.internal.ads.bba.m35154a(r3, r4, r0)
            goto L_0x007f
        L_0x002d:
            java.lang.Class<?> r1 = f41649a
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.android.gms.internal.ads.bba.m35154a(r3, r4, r1)
        L_0x0049:
            r0 = r1
            goto L_0x007f
        L_0x004b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.bax
            if (r1 == 0) goto L_0x0062
            com.google.android.gms.internal.ads.ayr r1 = new com.google.android.gms.internal.ads.ayr
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            com.google.android.gms.internal.ads.bax r0 = (com.google.android.gms.internal.ads.bax) r0
            r1.addAll(r0)
            com.google.android.gms.internal.ads.bba.m35154a(r3, r4, r1)
            goto L_0x0049
        L_0x0062:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.azw
            if (r1 == 0) goto L_0x007f
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.ayh
            if (r1 == 0) goto L_0x007f
            r1 = r0
            com.google.android.gms.internal.ads.ayh r1 = (com.google.android.gms.internal.ads.ayh) r1
            boolean r2 = r1.mo29588a()
            if (r2 != 0) goto L_0x007f
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.ads.ayh r0 = r1.mo29603a(r0)
            com.google.android.gms.internal.ads.bba.m35154a(r3, r4, r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ayv.m34809a(java.lang.Object, long, int):java.util.List");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <E> void mo29862a(Object obj, Object obj2, long j) {
        List c = m34810c(obj2, j);
        List a = m34809a(obj, j, c.size());
        int size = a.size();
        int size2 = c.size();
        if (size > 0 && size2 > 0) {
            a.addAll(c);
        }
        if (size > 0) {
            c = a;
        }
        bba.m35154a(obj, j, (Object) c);
    }

    /* renamed from: c */
    private static <E> List<E> m34810c(Object obj, long j) {
        return (List) bba.m35174f(obj, j);
    }
}
