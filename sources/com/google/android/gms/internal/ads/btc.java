package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public final class btc {
    /* access modifiers changed from: 0000 */

    /* renamed from: a */
    public final ExecutorService f43831a;
    /* access modifiers changed from: 0000 */

    /* renamed from: b */
    public bte<? extends btf> f43832b;

    /* renamed from: c */
    IOException f43833c;

    public btc(String str) {
        this.f43831a = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49846a((ThreadFactory) new btx(str)).mo49847a());
    }

    /* renamed from: a */
    public final <T extends btf> long mo30677a(T t, btd<T> btd, int i) {
        Looper myLooper = Looper.myLooper();
        bti.m36701b(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bte bte = new bte(this, myLooper, t, btd, i, elapsedRealtime);
        bte.mo30680a(0);
        return elapsedRealtime;
    }

    /* renamed from: a */
    public final boolean mo30678a() {
        return this.f43832b != null;
    }

    /* renamed from: b */
    public final void mo30679b() {
        this.f43832b.mo30681a(false);
    }
}
