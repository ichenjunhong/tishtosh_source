package com.google.android.gms.p1033b;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.b.s */
final class C15194s<TResult> implements C15198w<TResult> {

    /* renamed from: a */
    final Object f39226a = new Object();

    /* renamed from: b */
    private final Executor f39227b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C15176d f39228c;

    public C15194s(Executor executor, C15176d dVar) {
        this.f39227b = executor;
        this.f39228c = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        r2.f39227b.execute(new com.google.android.gms.p1033b.C15195t(r2, r3));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28008a(com.google.android.gms.p1033b.C15179g<TResult> r3) {
        /*
            r2 = this;
            boolean r0 = r3.mo28000b()
            if (r0 != 0) goto L_0x0024
            boolean r0 = r3.mo28001c()
            if (r0 != 0) goto L_0x0024
            java.lang.Object r0 = r2.f39226a
            monitor-enter(r0)
            com.google.android.gms.b.d r1 = r2.f39228c     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            java.util.concurrent.Executor r0 = r2.f39227b
            com.google.android.gms.b.t r1 = new com.google.android.gms.b.t
            r1.<init>(r2, r3)
            r0.execute(r1)
            goto L_0x0024
        L_0x0021:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r3
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.p1033b.C15194s.mo28008a(com.google.android.gms.b.g):void");
    }
}
