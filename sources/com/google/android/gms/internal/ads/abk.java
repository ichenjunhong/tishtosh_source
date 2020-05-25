package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14963ax;

public final class abk {

    /* renamed from: a */
    public volatile int f40178a;

    /* renamed from: b */
    private final Object f40179b;

    /* renamed from: c */
    private volatile long f40180c;

    private abk() {
        this.f40179b = new Object();
        this.f40178a = abl.f40181a;
        this.f40180c = 0;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28599a(int r5, int r6) {
        /*
            r4 = this;
            r4.mo28598a()
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.C14963ax.m30837g()
            long r0 = r0.mo28523a()
            java.lang.Object r2 = r4.f40179b
            monitor-enter(r2)
            int r3 = r4.f40178a     // Catch:{ all -> 0x0020 }
            if (r3 == r5) goto L_0x0014
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            return
        L_0x0014:
            r4.f40178a = r6     // Catch:{ all -> 0x0020 }
            int r5 = r4.f40178a     // Catch:{ all -> 0x0020 }
            int r6 = com.google.android.gms.internal.ads.abl.f40183c     // Catch:{ all -> 0x0020 }
            if (r5 != r6) goto L_0x001e
            r4.f40180c = r0     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.abk.mo28599a(int, int):void");
    }

    /* renamed from: a */
    public final void mo28598a() {
        long a = C14963ax.m30837g().mo28523a();
        synchronized (this.f40179b) {
            if (this.f40178a == abl.f40183c) {
                if (this.f40180c + ((Long) caf.m37099d().mo30717a(C15740bx.f44340cU)).longValue() <= a) {
                    this.f40178a = abl.f40181a;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo28600a(boolean z) {
        if (z) {
            mo28599a(abl.f40181a, abl.f40182b);
        } else {
            mo28599a(abl.f40182b, abl.f40181a);
        }
    }

    /* synthetic */ abk(abj abj) {
        this();
    }
}
