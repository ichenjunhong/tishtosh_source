package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

final /* synthetic */ class afs implements Runnable {

    /* renamed from: a */
    private final agl f40406a;

    /* renamed from: b */
    private final afk f40407b;

    /* renamed from: c */
    private final aga f40408c;

    afs(agl agl, afk afk, aga aga) {
        this.f40406a = agl;
        this.f40407b = afk;
        this.f40408c = aga;
    }

    public final void run() {
        agl agl = this.f40406a;
        afk afk = this.f40407b;
        aga aga = this.f40408c;
        if (!agl.isCancelled()) {
            try {
                afp.m32828a(afk.mo27633a(aga.get()), agl);
            } catch (CancellationException unused) {
                agl.cancel(true);
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
}
