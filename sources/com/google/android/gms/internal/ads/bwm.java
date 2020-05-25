package com.google.android.gms.internal.ads;

final class bwm implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bwl f44148a;

    bwm(bwl bwl) {
        this.f44148a = bwl;
    }

    public final void run() {
        synchronized (this.f44148a.f44140c) {
            if (!this.f44148a.f44141d || !this.f44148a.f44142e) {
                abv.m32792b("App is still foreground");
            } else {
                this.f44148a.f44141d = false;
                abv.m32792b("App went background");
                for (bwn a : this.f44148a.f44143f) {
                    try {
                        a.mo28615a(false);
                    } catch (Exception e) {
                        afc.m32793b("", e);
                    }
                }
            }
        }
    }
}
