package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;

final class bql implements bqk {
    private bql() {
    }

    /* renamed from: b */
    public final boolean mo30562b() {
        return false;
    }

    /* renamed from: a */
    public final int mo30559a() {
        return MediaCodecList.getCodecCount();
    }

    /* renamed from: a */
    public final MediaCodecInfo mo30560a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    /* renamed from: a */
    public final boolean mo30561a(String str, CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }
}
