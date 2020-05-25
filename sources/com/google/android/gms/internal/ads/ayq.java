package com.google.android.gms.internal.ads;

public class ayq {

    /* renamed from: d */
    private static final axm f41640d = axm.m34646a();

    /* renamed from: a */
    awo f41641a;

    /* renamed from: b */
    volatile azj f41642b;

    /* renamed from: c */
    volatile awo f41643c;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayq)) {
            return false;
        }
        ayq ayq = (ayq) obj;
        azj azj = this.f41642b;
        azj azj2 = ayq.f41642b;
        if (azj == null && azj2 == null) {
            return mo29854c().equals(ayq.mo29854c());
        }
        if (azj != null && azj2 != null) {
            return azj.equals(azj2);
        }
        if (azj != null) {
            return azj.equals(ayq.m34790a(azj.mo29827n()));
        }
        return m34790a(azj2.mo29827n()).equals(azj2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.azj m34790a(com.google.android.gms.internal.ads.azj r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.azj r0 = r1.f41642b
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.gms.internal.ads.azj r0 = r1.f41642b     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.f41642b = r2     // Catch:{ ayi -> 0x0012 }
            com.google.android.gms.internal.ads.awo r0 = com.google.android.gms.internal.ads.awo.zzfuo     // Catch:{ ayi -> 0x0012 }
            r1.f41643c = r0     // Catch:{ ayi -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.f41642b = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.ads.awo r2 = com.google.android.gms.internal.ads.awo.zzfuo     // Catch:{ all -> 0x001a }
            r1.f41643c = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            com.google.android.gms.internal.ads.azj r2 = r1.f41642b
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ayq.m34790a(com.google.android.gms.internal.ads.azj):com.google.android.gms.internal.ads.azj");
    }

    /* renamed from: b */
    public final int mo29853b() {
        if (this.f41643c != null) {
            return this.f41643c.size();
        }
        if (this.f41642b != null) {
            return this.f41642b.mo29824i();
        }
        return 0;
    }

    /* renamed from: c */
    public final awo mo29854c() {
        if (this.f41643c != null) {
            return this.f41643c;
        }
        synchronized (this) {
            if (this.f41643c != null) {
                awo awo = this.f41643c;
                return awo;
            }
            if (this.f41642b == null) {
                this.f41643c = awo.zzfuo;
            } else {
                this.f41643c = this.f41642b.mo29579e();
            }
            awo awo2 = this.f41643c;
            return awo2;
        }
    }
}
