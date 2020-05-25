package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;

final class bhw implements bhu {
    private bhw() {
    }

    /* renamed from: b */
    public final boolean mo30214b() {
        return false;
    }

    /* renamed from: a */
    public final int mo30211a() {
        return MediaCodecList.getCodecCount();
    }

    /* renamed from: a */
    public final MediaCodecInfo mo30212a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    /* renamed from: a */
    public final boolean mo30213a(String str, CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }
}
