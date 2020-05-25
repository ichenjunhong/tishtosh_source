package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CryptoException;

final class ajd implements bhk {

    /* renamed from: a */
    private final /* synthetic */ ain f40657a;

    ajd(ain ain) {
        this.f40657a = ain;
    }

    /* renamed from: a */
    public final void mo28974a(String str, long j, long j2) {
    }

    /* renamed from: a */
    public final void mo28972a(bip bip) {
        this.f40657a.m33023a("AudioTrackInitializationError", bip.getMessage());
    }

    /* renamed from: a */
    public final void mo28973a(biq biq) {
        this.f40657a.m33023a("AudioTrackWriteError", biq.getMessage());
    }

    /* renamed from: a */
    public final void mo28971a(bhp bhp) {
        this.f40657a.m33023a("DecoderInitializationError", bhp.getMessage());
    }

    /* renamed from: a */
    public final void mo28970a(CryptoException cryptoException) {
        this.f40657a.m33023a("CryptoError", cryptoException.getMessage());
    }
}
