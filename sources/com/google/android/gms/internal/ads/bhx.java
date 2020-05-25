package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;

final class bhx implements bhu {

    /* renamed from: a */
    private final int f42444a;

    /* renamed from: b */
    private MediaCodecInfo[] f42445b;

    public bhx(boolean z) {
        this.f42444a = z ? 1 : 0;
    }

    /* renamed from: b */
    public final boolean mo30214b() {
        return true;
    }

    /* renamed from: a */
    public final int mo30211a() {
        m35740c();
        return this.f42445b.length;
    }

    /* renamed from: a */
    public final MediaCodecInfo mo30212a(int i) {
        m35740c();
        return this.f42445b[i];
    }

    /* renamed from: a */
    public final boolean mo30213a(String str, CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: c */
    private final void m35740c() {
        if (this.f42445b == null) {
            this.f42445b = new MediaCodecList(this.f42444a).getCodecInfos();
        }
    }
}
