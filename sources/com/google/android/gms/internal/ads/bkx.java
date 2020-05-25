package com.google.android.gms.internal.ads;

import android.os.Looper;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public final class bkx {

    /* renamed from: a */
    final ExecutorService f42826a;

    /* renamed from: b */
    bla f42827b;

    /* renamed from: c */
    public boolean f42828c;

    public bkx(String str) {
        this.f42826a = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49846a((ThreadFactory) new blq(str)).mo49847a());
    }

    /* renamed from: a */
    public final void mo30316a(blb blb, bky bky) {
        Looper myLooper = Looper.myLooper();
        blg.m36001b(myLooper != null);
        blg.m36001b(!this.f42828c);
        this.f42828c = true;
        bla bla = new bla(this, myLooper, blb, bky, 0);
        this.f42827b = bla;
        this.f42826a.submit(this.f42827b);
    }

    /* renamed from: a */
    public final void mo30315a() {
        blg.m36001b(this.f42828c);
        this.f42827b.mo30322a();
    }
}
