package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

final /* synthetic */ class afw implements Runnable {

    /* renamed from: a */
    private final agl f40416a;

    /* renamed from: b */
    private final aga f40417b;

    afw(agl agl, aga aga) {
        this.f40416a = agl;
        this.f40417b = aga;
    }

    public final void run() {
        agl agl = this.f40416a;
        try {
            agl.mo28823b(this.f40417b.get());
        } catch (ExecutionException e) {
            agl.mo28822a(e.getCause());
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            agl.mo28822a(e2);
        } catch (Exception e3) {
            agl.mo28822a(e3);
        }
    }
}
