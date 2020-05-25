package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.hx */
final class C16761hx extends C16758hu {
    private C16761hx() {
        super();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <L> List<L> mo32265a(Object obj, long j) {
        C16747hj c = m40355c(obj, j);
        if (c.mo31993a()) {
            return c;
        }
        int size = c.size();
        C16747hj a = c.mo32008a(size == 0 ? 10 : size << 1);
        C16819ka.m40684a(obj, j, (Object) a);
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo32267b(Object obj, long j) {
        m40355c(obj, j).mo31998b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <E> void mo32266a(Object obj, Object obj2, long j) {
        C16747hj c = m40355c(obj, j);
        C16747hj c2 = m40355c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.mo31993a()) {
                c = c.mo32008a(size2 + size);
            }
            c.addAll(c2);
        }
        if (size > 0) {
            c2 = c;
        }
        C16819ka.m40684a(obj, j, (Object) c2);
    }

    /* renamed from: c */
    private static <E> C16747hj<E> m40355c(Object obj, long j) {
        return (C16747hj) C16819ka.m40704f(obj, j);
    }
}
