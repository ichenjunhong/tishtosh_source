package com.google.android.gms.p1033b;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.b.u */
final class C15196u<TResult> implements C15198w<TResult> {

    /* renamed from: a */
    final Object f39231a = new Object();

    /* renamed from: b */
    private final Executor f39232b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C15177e<? super TResult> f39233c;

    public C15196u(Executor executor, C15177e<? super TResult> eVar) {
        this.f39232b = executor;
        this.f39233c = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r2.f39232b.execute(new com.google.android.gms.p1033b.C15197v(r2, r3));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28008a(com.google.android.gms.p1033b.C15179g<TResult> r3) {
        /*
            r2 = this;
            boolean r0 = r3.mo28000b()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r2.f39231a
            monitor-enter(r0)
            com.google.android.gms.b.e<? super TResult> r1 = r2.f39233c     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            java.util.concurrent.Executor r0 = r2.f39232b
            com.google.android.gms.b.v r1 = new com.google.android.gms.b.v
            r1.<init>(r2, r3)
            r0.execute(r1)
            goto L_0x001e
        L_0x001b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r3
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.p1033b.C15196u.mo28008a(com.google.android.gms.b.g):void");
    }
}
