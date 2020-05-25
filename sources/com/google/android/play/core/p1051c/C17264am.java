package com.google.android.play.core.p1051c;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.play.core.c.am */
final class C17264am {

    /* renamed from: a */
    private final ConcurrentHashMap<C17263al, List<Throwable>> f48733a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f48734b = new ReferenceQueue<>();

    C17264am() {
    }

    /* renamed from: a */
    public final List<Throwable> mo33548a(Throwable th, boolean z) {
        while (true) {
            Reference poll = this.f48734b.poll();
            if (poll == null) {
                break;
            }
            this.f48733a.remove(poll);
        }
        List<Throwable> list = (List) this.f48733a.get(new C17263al(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> list2 = (List) this.f48733a.putIfAbsent(new C17263al(th, this.f48734b), vector);
        return list2 == null ? vector : list2;
    }
}
