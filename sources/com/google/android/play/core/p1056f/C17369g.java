package com.google.android.play.core.p1056f;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.f.g */
final class C17369g<ResultT> implements C17373k<ResultT> {

    /* renamed from: a */
    final Object f48879a = new Object();

    /* renamed from: b */
    private final Executor f48880b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C17362a f48881c;

    public C17369g(Executor executor, C17362a aVar) {
        this.f48880b = executor;
        this.f48881c = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r2.f48880b.execute(new com.google.android.play.core.p1056f.C17370h(r2, r3));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33663a(com.google.android.play.core.p1056f.C17365d<ResultT> r3) {
        /*
            r2 = this;
            boolean r0 = r3.mo33659b()
            if (r0 != 0) goto L_0x001e
            java.lang.Object r0 = r2.f48879a
            monitor-enter(r0)
            com.google.android.play.core.f.a r1 = r2.f48881c     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            java.util.concurrent.Executor r0 = r2.f48880b
            com.google.android.play.core.f.h r1 = new com.google.android.play.core.f.h
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.p1056f.C17369g.mo33663a(com.google.android.play.core.f.d):void");
    }
}
