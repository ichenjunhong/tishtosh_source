package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class biw implements C15678b {

    /* renamed from: a */
    private final Executor f42545a;

    public biw(Handler handler) {
        this.f42545a = new bjx(this, handler);
    }

    /* renamed from: a */
    public final void mo29909a(brw<?> brw, bxw<?> bxw) {
        mo29910a(brw, bxw, null);
    }

    /* renamed from: a */
    public final void mo29910a(brw<?> brw, bxw<?> bxw, Runnable runnable) {
        brw.mo30635e();
        brw.mo30630b("post-response");
        this.f42545a.execute(new bkz(brw, bxw, runnable));
    }

    /* renamed from: a */
    public final void mo29911a(brw<?> brw, C15812cq cqVar) {
        brw.mo30630b("post-error");
        this.f42545a.execute(new bkz(brw, new bxw(cqVar), null));
    }
}
