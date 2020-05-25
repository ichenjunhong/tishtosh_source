package com.google.android.gms.p1033b;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.b.o */
final class C15190o<TResult> implements C15198w<TResult> {

    /* renamed from: a */
    final Object f39217a = new Object();

    /* renamed from: b */
    private final Executor f39218b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C15174b f39219c;

    public C15190o(Executor executor, C15174b bVar) {
        this.f39218b = executor;
        this.f39219c = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1.f39218b.execute(new com.google.android.gms.p1033b.C15191p(r1));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28008a(com.google.android.gms.p1033b.C15179g r2) {
        /*
            r1 = this;
            boolean r2 = r2.mo28001c()
            if (r2 == 0) goto L_0x001e
            java.lang.Object r2 = r1.f39217a
            monitor-enter(r2)
            com.google.android.gms.b.b r0 = r1.f39219c     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x000f
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            java.util.concurrent.Executor r2 = r1.f39218b
            com.google.android.gms.b.p r0 = new com.google.android.gms.b.p
            r0.<init>(r1)
            r2.execute(r0)
            goto L_0x001e
        L_0x001b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            throw r0
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.p1033b.C15190o.mo28008a(com.google.android.gms.b.g):void");
    }
}
