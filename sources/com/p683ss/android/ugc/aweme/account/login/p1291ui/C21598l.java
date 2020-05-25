package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.os.Handler;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.l */
public final class C21598l implements C9382a {

    /* renamed from: a */
    private final long f58570a;

    /* renamed from: b */
    private final long f58571b;

    /* renamed from: c */
    private long f58572c;

    /* renamed from: d */
    private long f58573d;

    /* renamed from: e */
    private boolean f58574e;

    /* renamed from: f */
    private boolean f58575f;

    /* renamed from: g */
    private boolean f58576g;

    /* renamed from: h */
    private Handler f58577h = new C9381g(this);

    /* renamed from: i */
    private C21599a f58578i;

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.l$a */
    public interface C21599a {
        /* renamed from: a */
        void mo45694a();

        /* renamed from: a */
        void mo45869a(long j);

        /* renamed from: b */
        void mo45695b();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.l$b */
    public static class C21600b implements C21599a {
        /* renamed from: a */
        public void mo45694a() {
        }

        /* renamed from: a */
        public void mo45869a(long j) {
        }

        /* renamed from: b */
        public void mo45695b() {
        }
    }

    /* renamed from: c */
    public final synchronized long mo45881c() {
        return this.f58572c;
    }

    /* renamed from: d */
    public final synchronized boolean mo45882d() {
        return this.f58575f;
    }

    /* renamed from: e */
    public final synchronized boolean mo45883e() {
        return this.f58576g;
    }

    /* renamed from: a */
    public final synchronized void mo45878a() {
        this.f58574e = true;
        this.f58576g = false;
        this.f58577h.removeMessages(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        return r7;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.p683ss.android.ugc.aweme.account.login.p1291ui.C21598l mo45880b() {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            r7.f58574e = r0     // Catch:{ all -> 0x0044 }
            r7.f58575f = r0     // Catch:{ all -> 0x0044 }
            r1 = 1
            r7.f58576g = r1     // Catch:{ all -> 0x0044 }
            long r2 = r7.f58570a     // Catch:{ all -> 0x0044 }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0020
            r7.f58575f = r1     // Catch:{ all -> 0x0044 }
            r7.f58576g = r0     // Catch:{ all -> 0x0044 }
            com.ss.android.ugc.aweme.account.login.ui.l$a r0 = r7.f58578i     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x001e
            com.ss.android.ugc.aweme.account.login.ui.l$a r0 = r7.f58578i     // Catch:{ all -> 0x0044 }
            r0.mo45695b()     // Catch:{ all -> 0x0044 }
        L_0x001e:
            monitor-exit(r7)
            return r7
        L_0x0020:
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0044 }
            long r4 = r7.f58570a     // Catch:{ all -> 0x0044 }
            r0 = 0
            long r2 = r2 + r4
            r7.f58573d = r2     // Catch:{ all -> 0x0044 }
            long r2 = r7.f58570a     // Catch:{ all -> 0x0044 }
            r7.f58572c = r2     // Catch:{ all -> 0x0044 }
            com.ss.android.ugc.aweme.account.login.ui.l$a r0 = r7.f58578i     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0037
            com.ss.android.ugc.aweme.account.login.ui.l$a r0 = r7.f58578i     // Catch:{ all -> 0x0044 }
            r0.mo45694a()     // Catch:{ all -> 0x0044 }
        L_0x0037:
            android.os.Handler r0 = r7.f58577h     // Catch:{ all -> 0x0044 }
            android.os.Handler r2 = r7.f58577h     // Catch:{ all -> 0x0044 }
            android.os.Message r1 = r2.obtainMessage(r1)     // Catch:{ all -> 0x0044 }
            r0.sendMessage(r1)     // Catch:{ all -> 0x0044 }
            monitor-exit(r7)
            return r7
        L_0x0044:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1291ui.C21598l.mo45880b():com.ss.android.ugc.aweme.account.login.ui.l");
    }

    /* renamed from: a */
    public final void mo45879a(C21599a aVar) {
        this.f58578i = aVar;
        if (this.f58575f && this.f58578i != null) {
            this.f58578i.mo45695b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMsg(android.os.Message r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r10 = r9.f58574e     // Catch:{ all -> 0x006a }
            if (r10 == 0) goto L_0x0007
            monitor-exit(r9)     // Catch:{ all -> 0x006a }
            return
        L_0x0007:
            long r0 = r9.f58573d     // Catch:{ all -> 0x006a }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x006a }
            r10 = 0
            long r0 = r0 - r2
            r9.f58572c = r0     // Catch:{ all -> 0x006a }
            long r0 = r9.f58572c     // Catch:{ all -> 0x006a }
            r10 = 1
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0029
            r9.f58575f = r10     // Catch:{ all -> 0x006a }
            r10 = 0
            r9.f58576g = r10     // Catch:{ all -> 0x006a }
            com.ss.android.ugc.aweme.account.login.ui.l$a r10 = r9.f58578i     // Catch:{ all -> 0x006a }
            if (r10 == 0) goto L_0x0068
            com.ss.android.ugc.aweme.account.login.ui.l$a r10 = r9.f58578i     // Catch:{ all -> 0x006a }
            r10.mo45695b()     // Catch:{ all -> 0x006a }
            goto L_0x0068
        L_0x0029:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x006a }
            com.ss.android.ugc.aweme.account.login.ui.l$a r4 = r9.f58578i     // Catch:{ all -> 0x006a }
            if (r4 == 0) goto L_0x0038
            com.ss.android.ugc.aweme.account.login.ui.l$a r4 = r9.f58578i     // Catch:{ all -> 0x006a }
            long r5 = r9.f58572c     // Catch:{ all -> 0x006a }
            r4.mo45869a(r5)     // Catch:{ all -> 0x006a }
        L_0x0038:
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x006a }
            r6 = 0
            long r4 = r4 - r0
            long r0 = r9.f58572c     // Catch:{ all -> 0x006a }
            long r6 = r9.f58571b     // Catch:{ all -> 0x006a }
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0050
            long r0 = r9.f58572c     // Catch:{ all -> 0x006a }
            r6 = 0
            long r0 = r0 - r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x005d
            r0 = r2
            goto L_0x005d
        L_0x0050:
            long r0 = r9.f58571b     // Catch:{ all -> 0x006a }
            r6 = 0
            long r0 = r0 - r4
        L_0x0054:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x005d
            long r4 = r9.f58571b     // Catch:{ all -> 0x006a }
            r6 = 0
            long r0 = r0 + r4
            goto L_0x0054
        L_0x005d:
            android.os.Handler r2 = r9.f58577h     // Catch:{ all -> 0x006a }
            android.os.Handler r3 = r9.f58577h     // Catch:{ all -> 0x006a }
            android.os.Message r10 = r3.obtainMessage(r10)     // Catch:{ all -> 0x006a }
            r2.sendMessageDelayed(r10, r0)     // Catch:{ all -> 0x006a }
        L_0x0068:
            monitor-exit(r9)     // Catch:{ all -> 0x006a }
            return
        L_0x006a:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x006a }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1291ui.C21598l.handleMsg(android.os.Message):void");
    }

    public C21598l(long j, long j2, C21599a aVar) {
        this.f58570a = j;
        this.f58571b = j2;
        this.f58578i = aVar;
    }
}
