package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.io.IOException;

final /* synthetic */ class bxx implements Runnable {

    /* renamed from: a */
    private final bxv f44532a;

    /* renamed from: b */
    private final bxn f44533b;

    /* renamed from: c */
    private final zzwr f44534c;

    /* renamed from: d */
    private final agl f44535d;

    bxx(bxv bxv, bxn bxn, zzwr zzwr, agl agl) {
        this.f44532a = bxv;
        this.f44533b = bxn;
        this.f44534c = zzwr;
        this.f44535d = agl;
    }

    public final void run() {
        bxv bxv = this.f44532a;
        bxn bxn = this.f44533b;
        zzwr zzwr = this.f44534c;
        agl agl = this.f44535d;
        try {
            zzwo a = bxn.mo29433s().mo30854a(zzwr);
            if (!a.mo31638a()) {
                agl.mo28822a(new RuntimeException("No entry contents."));
                bxt.m36971a(bxv.f44525a);
                return;
            }
            bxz bxz = new bxz(bxv, a.mo31639b(), 1);
            int read = bxz.read();
            if (read != -1) {
                bxz.unread(read);
                agl.mo28823b(bxz);
                return;
            }
            throw new IOException("Unable to read from cache.");
        } catch (RemoteException | IOException e) {
            abv.m32793b("Unable to obtain a cache service instance.", e);
            agl.mo28822a(e);
            bxt.m36971a(bxv.f44525a);
        }
    }
}
