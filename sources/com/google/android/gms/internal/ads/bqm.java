package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;

final class bqm implements bqk {

    /* renamed from: a */
    private final int f43591a;

    /* renamed from: b */
    private MediaCodecInfo[] f43592b;

    public bqm(boolean z) {
        this.f43591a = z ? 1 : 0;
    }

    /* renamed from: b */
    public final boolean mo30562b() {
        return true;
    }

    /* renamed from: a */
    public final int mo30559a() {
        m36482c();
        return this.f43592b.length;
    }

    /* renamed from: a */
    public final MediaCodecInfo mo30560a(int i) {
        m36482c();
        return this.f43592b[i];
    }

    /* renamed from: a */
    public final boolean mo30561a(String str, CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: c */
    private final void m36482c() {
        if (this.f43592b == null) {
            this.f43592b = new MediaCodecList(this.f43591a).getCodecInfos();
        }
    }
}
