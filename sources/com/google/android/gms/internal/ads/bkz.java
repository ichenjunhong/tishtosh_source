package com.google.android.gms.internal.ads;

final class bkz implements Runnable {

    /* renamed from: a */
    private final brw f42829a;

    /* renamed from: b */
    private final bxw f42830b;

    /* renamed from: c */
    private final Runnable f42831c;

    public bkz(brw brw, bxw bxw, Runnable runnable) {
        this.f42829a = brw;
        this.f42830b = bxw;
        this.f42831c = runnable;
    }

    public final void run() {
        byx byx;
        if (this.f42830b.f44530c == null) {
            this.f42829a.mo28741a(this.f42830b.f44528a);
        } else {
            brw brw = this.f42829a;
            C15812cq cqVar = this.f42830b.f44530c;
            synchronized (brw.f43728d) {
                byx = brw.f43729e;
            }
            if (byx != null) {
                byx.mo28740a(cqVar);
            }
        }
        if (this.f42830b.f44531d) {
            this.f42829a.mo30630b("intermediate-response");
        } else {
            this.f42829a.mo30632c("done");
        }
        if (this.f42831c != null) {
            this.f42831c.run();
        }
    }
}
