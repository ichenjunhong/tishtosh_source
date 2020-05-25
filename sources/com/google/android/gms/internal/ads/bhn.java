package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CryptoException;

final class bhn implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ CryptoException f42429a;

    /* renamed from: b */
    private final /* synthetic */ bhl f42430b;

    bhn(bhl bhl, CryptoException cryptoException) {
        this.f42430b = bhl;
        this.f42429a = cryptoException;
    }

    public final void run() {
        this.f42430b.f42413m.mo28970a(this.f42429a);
    }
}
