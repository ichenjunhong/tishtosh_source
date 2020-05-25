package com.p683ss.android.linkselector.p1175a;

/* renamed from: com.ss.android.linkselector.a.a */
public final class C19199a {

    /* renamed from: a */
    private long f52914a = 2;

    /* renamed from: a */
    public long mo39186a(int i) {
        long j = this.f52914a;
        if (i > 5) {
            i = 5;
        }
        if (i == 1) {
            return 60000;
        }
        return ((long) Math.pow((double) j, (double) (i - 1))) * 60 * 1000;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo39187a(com.p683ss.android.linkselector.p1176b.C19201a r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            if (r6 != 0) goto L_0x0005
            monitor-exit(r5)
            return
        L_0x0005:
            boolean r0 = r6.mo39189b()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0042
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = "lock "
            r0.<init>(r1)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = r6.mo39194g()     // Catch:{ all -> 0x0044 }
            r0.append(r1)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = " "
            r0.append(r1)     // Catch:{ all -> 0x0044 }
            int r1 = r6.mo39192e()     // Catch:{ all -> 0x0044 }
            r0.append(r1)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = " time for "
            r0.append(r1)     // Catch:{ all -> 0x0044 }
            int r1 = r6.mo39192e()     // Catch:{ all -> 0x0044 }
            long r1 = r5.mo39186a(r1)     // Catch:{ all -> 0x0044 }
            r3 = 60000(0xea60, double:2.9644E-319)
            long r1 = r1 / r3
            r0.append(r1)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = " min"
            r0.append(r1)     // Catch:{ all -> 0x0044 }
            r0 = 1
            com.p683ss.android.linkselector.p1177c.C19204b.m46821a(r0, r6)     // Catch:{ all -> 0x0044 }
        L_0x0042:
            monitor-exit(r5)
            return
        L_0x0044:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.linkselector.p1175a.C19199a.mo39187a(com.ss.android.linkselector.b.a):void");
    }
}
