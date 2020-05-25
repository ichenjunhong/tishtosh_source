package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CryptoException;
import android.view.Surface;
import java.lang.ref.WeakReference;

final class aim implements bic {

    /* renamed from: a */
    WeakReference<bic> f40601a;

    /* renamed from: b */
    private final /* synthetic */ aig f40602b;

    private aim(aig aig) {
        this.f40602b = aig;
        this.f40601a = new WeakReference<>(null);
    }

    /* renamed from: a */
    public final void mo28980a(int i, long j) {
        bic bic = (bic) this.f40601a.get();
        if (bic != null) {
            bic.mo28980a(i, j);
        }
    }

    /* renamed from: a */
    public final void mo28979a(int i, int i2, float f) {
        bic bic = (bic) this.f40601a.get();
        if (bic != null) {
            bic.mo28979a(i, i2, f);
        }
    }

    /* renamed from: a */
    public final void mo28981a(Surface surface) {
        bic bic = (bic) this.f40601a.get();
        if (bic != null) {
            bic.mo28981a(surface);
        }
    }

    /* renamed from: a */
    public final void mo28971a(bhp bhp) {
        this.f40602b.m32998a("DecoderInitializationError", bhp.getMessage());
        bic bic = (bic) this.f40601a.get();
        if (bic != null) {
            bic.mo28971a(bhp);
        }
    }

    /* renamed from: a */
    public final void mo28970a(CryptoException cryptoException) {
        this.f40602b.m32998a("CryptoError", cryptoException.getMessage());
        bic bic = (bic) this.f40601a.get();
        if (bic != null) {
            bic.mo28970a(cryptoException);
        }
    }

    /* renamed from: a */
    public final void mo28974a(String str, long j, long j2) {
        bic bic = (bic) this.f40601a.get();
        if (bic != null) {
            bic.mo28974a(str, j, j2);
        }
    }
}
