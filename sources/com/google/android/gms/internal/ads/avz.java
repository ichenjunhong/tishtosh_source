package com.google.android.gms.internal.ads;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

final class avz {

    /* renamed from: a */
    private final ConcurrentHashMap<awa, List<Throwable>> f41450a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f41451b = new ReferenceQueue<>();

    avz() {
    }

    /* renamed from: a */
    public final List<Throwable> mo29574a(Throwable th, boolean z) {
        Reference poll = this.f41451b.poll();
        while (poll != null) {
            this.f41450a.remove(poll);
            poll = this.f41451b.poll();
        }
        return (List) this.f41450a.get(new awa(th, null));
    }
}
