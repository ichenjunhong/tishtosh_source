package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCodec.OnFrameRenderedListener;
import android.os.Handler;

final class buh implements OnFrameRenderedListener {

    /* renamed from: a */
    private final /* synthetic */ bue f43945a;

    private buh(bue bue, MediaCodec mediaCodec) {
        this.f43945a = bue;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        if (this == this.f43945a.f43926g) {
            this.f43945a.mo30471r();
        }
    }
}
