package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CryptoException;
import android.view.Surface;

final class ajc implements bic {

    /* renamed from: a */
    private final /* synthetic */ ain f40656a;

    ajc(ain ain) {
        this.f40656a = ain;
    }

    /* renamed from: a */
    public final void mo28981a(Surface surface) {
    }

    /* renamed from: a */
    public final void mo28974a(String str, long j, long j2) {
    }

    /* renamed from: a */
    public final void mo28980a(int i, long j) {
        StringBuilder sb = new StringBuilder(64);
        sb.append("Dropped frames. Count: ");
        sb.append(i);
        sb.append(" Elapsed: ");
        sb.append(j);
        abv.m32792b(sb.toString());
    }

    /* renamed from: a */
    public final void mo28979a(int i, int i2, float f) {
        this.f40656a.f40610f = i;
        this.f40656a.f40611g = i2;
        this.f40656a.f40612h = f;
        this.f40656a.mo28982a(this.f40656a.f40610f, this.f40656a.f40611g, this.f40656a.f40612h);
    }

    /* renamed from: a */
    public final void mo28971a(bhp bhp) {
        this.f40656a.m33023a("DecoderInitializationError", bhp.getMessage());
    }

    /* renamed from: a */
    public final void mo28970a(CryptoException cryptoException) {
        this.f40656a.m33023a("CryptoError", cryptoException.getMessage());
    }
}
