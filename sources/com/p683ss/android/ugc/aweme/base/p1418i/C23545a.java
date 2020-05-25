package com.p683ss.android.ugc.aweme.base.p1418i;

import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.base.i.a */
public class C23545a<T> {

    /* renamed from: a */
    private boolean f62668a;

    /* renamed from: b */
    private final ArrayList<C23546b<T>> f62669b = new ArrayList<>();

    /* renamed from: c */
    private synchronized boolean m57738c() {
        return this.f62668a;
    }

    /* renamed from: b */
    private synchronized void mo93588b() {
        this.f62668a = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo48712a() {
        this.f62668a = true;
    }

    /* renamed from: a */
    public final synchronized void mo48713a(C23546b bVar) {
        if (!this.f62669b.contains(bVar)) {
            this.f62669b.add(bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r0[r1].mo48715a(r3, r4);
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r1 = r0.length - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r1 < 0) goto L_0x002a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48714a(T r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.m57738c()     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            return
        L_0x0009:
            java.util.ArrayList<com.ss.android.ugc.aweme.base.i.b<T>> r0 = r3.f62669b     // Catch:{ all -> 0x002b }
            java.util.ArrayList<com.ss.android.ugc.aweme.base.i.b<T>> r1 = r3.f62669b     // Catch:{ all -> 0x002b }
            int r1 = r1.size()     // Catch:{ all -> 0x002b }
            com.ss.android.ugc.aweme.base.i.b[] r1 = new com.p683ss.android.ugc.aweme.base.p1418i.C23546b[r1]     // Catch:{ all -> 0x002b }
            java.lang.Object[] r0 = r0.toArray(r1)     // Catch:{ all -> 0x002b }
            com.ss.android.ugc.aweme.base.i.b[] r0 = (com.p683ss.android.ugc.aweme.base.p1418i.C23546b[]) r0     // Catch:{ all -> 0x002b }
            r3.mo93588b()     // Catch:{ all -> 0x002b }
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            int r1 = r0.length
            int r1 = r1 + -1
        L_0x0020:
            if (r1 < 0) goto L_0x002a
            r2 = r0[r1]
            r2.mo48715a(r3, r4)
            int r1 = r1 + -1
            goto L_0x0020
        L_0x002a:
            return
        L_0x002b:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1418i.C23545a.mo48714a(java.lang.Object):void");
    }
}
