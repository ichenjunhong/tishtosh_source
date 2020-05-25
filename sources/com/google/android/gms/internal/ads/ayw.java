package com.google.android.gms.internal.ads;

import java.util.List;

final class ayw extends ayt {
    private ayw() {
        super();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <L> List<L> mo29861a(Object obj, long j) {
        ayh c = m34814c(obj, j);
        if (c.mo29588a()) {
            return c;
        }
        int size = c.size();
        ayh a = c.mo29603a(size == 0 ? 10 : size << 1);
        bba.m35154a(obj, j, (Object) a);
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo29863b(Object obj, long j) {
        m34814c(obj, j).mo29593b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <E> void mo29862a(Object obj, Object obj2, long j) {
        ayh c = m34814c(obj, j);
        ayh c2 = m34814c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.mo29588a()) {
                c = c.mo29603a(size2 + size);
            }
            c.addAll(c2);
        }
        if (size > 0) {
            c2 = c;
        }
        bba.m35154a(obj, j, (Object) c2);
    }

    /* renamed from: c */
    private static <E> ayh<E> m34814c(Object obj, long j) {
        return (ayh) bba.m35174f(obj, j);
    }
}
