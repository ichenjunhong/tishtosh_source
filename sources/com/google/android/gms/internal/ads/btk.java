package com.google.android.gms.internal.ads;

public final class btk {

    /* renamed from: a */
    private boolean f43846a;

    /* renamed from: a */
    public final synchronized boolean mo30684a() {
        if (this.f43846a) {
            return false;
        }
        this.f43846a = true;
        notifyAll();
        return true;
    }

    /* renamed from: b */
    public final synchronized boolean mo30685b() {
        boolean z;
        z = this.f43846a;
        this.f43846a = false;
        return z;
    }

    /* renamed from: c */
    public final synchronized void mo30686c() throws InterruptedException {
        while (!this.f43846a) {
            wait();
        }
    }
}
