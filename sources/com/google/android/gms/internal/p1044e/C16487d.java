package com.google.android.gms.internal.p1044e;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.e.d */
final class C16487d {

    /* renamed from: a */
    private final ConcurrentHashMap<C16488e, List<Throwable>> f46386a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f46387b = new ReferenceQueue<>();

    C16487d() {
    }

    /* renamed from: a */
    public final List<Throwable> mo31695a(Throwable th, boolean z) {
        Reference poll = this.f46387b.poll();
        while (poll != null) {
            this.f46386a.remove(poll);
            poll = this.f46387b.poll();
        }
        List<Throwable> list = (List) this.f46386a.get(new C16488e(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> list2 = (List) this.f46386a.putIfAbsent(new C16488e(th, this.f46387b), vector);
        return list2 == null ? vector : list2;
    }
}
