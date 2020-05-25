package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

final /* synthetic */ class afq implements Runnable {

    /* renamed from: a */
    private final afm f40401a;

    /* renamed from: b */
    private final aga f40402b;

    afq(afm afm, aga aga) {
        this.f40401a = afm;
        this.f40402b = aga;
    }

    public final void run() {
        Throwable e;
        afm afm = this.f40401a;
        try {
            afm.mo28787a(this.f40402b.get());
        } catch (ExecutionException e2) {
            e = e2.getCause();
            afm.mo28788a(e);
        } catch (InterruptedException e3) {
            e = e3;
            Thread.currentThread().interrupt();
            afm.mo28788a(e);
        } catch (Exception e4) {
            e = e4;
            afm.mo28788a(e);
        }
    }
}
