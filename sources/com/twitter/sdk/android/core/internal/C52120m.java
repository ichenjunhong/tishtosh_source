package com.twitter.sdk.android.core.internal;

import com.twitter.sdk.android.core.C52188j;
import com.twitter.sdk.android.core.C52189k;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;

/* renamed from: com.twitter.sdk.android.core.internal.m */
public final class C52120m<T extends C52188j> {

    /* renamed from: a */
    protected final C52122a f129739a;

    /* renamed from: b */
    private final C52135p f129740b;

    /* renamed from: c */
    private final C52189k<T> f129741c;

    /* renamed from: d */
    private final ExecutorService f129742d;

    /* renamed from: e */
    private final C52124o f129743e;

    /* renamed from: com.twitter.sdk.android.core.internal.m$a */
    protected static class C52122a {

        /* renamed from: a */
        public boolean f129745a;

        /* renamed from: b */
        public long f129746b;

        /* renamed from: c */
        private final Calendar f129747c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));

        /* renamed from: b */
        public final synchronized void mo108824b(long j) {
            this.f129745a = false;
            this.f129746b = j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
            return false;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized boolean mo108823a(long r8) {
            /*
                r7 = this;
                monitor-enter(r7)
                long r0 = r7.f129746b     // Catch:{ all -> 0x004d }
                r2 = 0
                long r0 = r8 - r0
                r2 = 21600000(0x1499700, double:1.0671818E-316)
                r4 = 0
                r5 = 1
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 <= 0) goto L_0x0011
                r0 = 1
                goto L_0x0012
            L_0x0011:
                r0 = 0
            L_0x0012:
                long r1 = r7.f129746b     // Catch:{ all -> 0x004d }
                java.util.Calendar r3 = r7.f129747c     // Catch:{ all -> 0x004d }
                r3.setTimeInMillis(r8)     // Catch:{ all -> 0x004d }
                java.util.Calendar r8 = r7.f129747c     // Catch:{ all -> 0x004d }
                r9 = 6
                int r8 = r8.get(r9)     // Catch:{ all -> 0x004d }
                java.util.Calendar r3 = r7.f129747c     // Catch:{ all -> 0x004d }
                int r3 = r3.get(r5)     // Catch:{ all -> 0x004d }
                java.util.Calendar r6 = r7.f129747c     // Catch:{ all -> 0x004d }
                r6.setTimeInMillis(r1)     // Catch:{ all -> 0x004d }
                java.util.Calendar r1 = r7.f129747c     // Catch:{ all -> 0x004d }
                int r9 = r1.get(r9)     // Catch:{ all -> 0x004d }
                java.util.Calendar r1 = r7.f129747c     // Catch:{ all -> 0x004d }
                int r1 = r1.get(r5)     // Catch:{ all -> 0x004d }
                if (r8 != r9) goto L_0x003d
                if (r3 != r1) goto L_0x003d
                r8 = 1
                goto L_0x003e
            L_0x003d:
                r8 = 0
            L_0x003e:
                r8 = r8 ^ r5
                boolean r9 = r7.f129745a     // Catch:{ all -> 0x004d }
                if (r9 != 0) goto L_0x004b
                if (r0 != 0) goto L_0x0047
                if (r8 == 0) goto L_0x004b
            L_0x0047:
                r7.f129745a = r5     // Catch:{ all -> 0x004d }
                monitor-exit(r7)
                return r5
            L_0x004b:
                monitor-exit(r7)
                return r4
            L_0x004d:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.twitter.sdk.android.core.internal.C52120m.C52122a.mo108823a(long):boolean");
        }
    }

    /* renamed from: a */
    public final void mo108821a() {
        boolean z;
        C52188j a = this.f129741c.mo108768a();
        long a2 = this.f129740b.mo108816a();
        if (a == null || !this.f129739a.mo108823a(a2)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f129742d.submit(new C52123n(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo108822b() {
        for (C52188j a : this.f129741c.mo108771b().values()) {
            this.f129743e.mo108826a(a);
        }
        this.f129739a.mo108824b(this.f129740b.mo108816a());
    }

    public C52120m(C52189k<T> kVar, ExecutorService executorService, C52124o<T> oVar) {
        this(kVar, new C52135p(), executorService, new C52122a(), oVar);
    }

    private C52120m(C52189k<T> kVar, C52135p pVar, ExecutorService executorService, C52122a aVar, C52124o oVar) {
        this.f129740b = pVar;
        this.f129741c = kVar;
        this.f129742d = executorService;
        this.f129739a = aVar;
        this.f129743e = oVar;
    }
}
