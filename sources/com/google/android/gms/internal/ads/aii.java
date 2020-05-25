package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CryptoException;
import java.lang.ref.WeakReference;

final class aii implements bhk {

    /* renamed from: a */
    WeakReference<bhk> f40596a;

    /* renamed from: b */
    private final /* synthetic */ aig f40597b;

    private aii(aig aig) {
        this.f40597b = aig;
        this.f40596a = new WeakReference<>(null);
    }

    /* renamed from: a */
    public final void mo28972a(bip bip) {
        this.f40597b.m32998a("AudioTrackInitializationError", bip.getMessage());
        bhk bhk = (bhk) this.f40596a.get();
        if (bhk != null) {
            bhk.mo28972a(bip);
        }
    }

    /* renamed from: a */
    public final void mo28973a(biq biq) {
        this.f40597b.m32998a("AudioTrackWriteError", biq.getMessage());
        bhk bhk = (bhk) this.f40596a.get();
        if (bhk != null) {
            bhk.mo28973a(biq);
        }
    }

    /* renamed from: a */
    public final void mo28971a(bhp bhp) {
        this.f40597b.m32998a("DecoderInitializationError", bhp.getMessage());
        bhk bhk = (bhk) this.f40596a.get();
        if (bhk != null) {
            bhk.mo28971a(bhp);
        }
    }

    /* renamed from: a */
    public final void mo28970a(CryptoException cryptoException) {
        this.f40597b.m32998a("CryptoError", cryptoException.getMessage());
        bhk bhk = (bhk) this.f40596a.get();
        if (bhk != null) {
            bhk.mo28970a(cryptoException);
        }
    }

    /* renamed from: a */
    public final void mo28974a(String str, long j, long j2) {
        bhk bhk = (bhk) this.f40596a.get();
        if (bhk != null) {
            bhk.mo28974a(str, j, j2);
        }
    }
}
