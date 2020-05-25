package com.p683ss.android.vesdk;

import com.p683ss.android.ttve.nativePort.TEVideoUtils;

/* renamed from: com.ss.android.vesdk.ae */
public final class C50598ae {

    /* renamed from: a */
    private long f126869a;

    /* renamed from: b */
    private final int f126870b;

    /* renamed from: c */
    private final int f126871c;

    C50598ae(int i, int i2, int i3, float f, int i4) {
        this.f126869a = TEVideoUtils.createRTAudioWaveformMgr(i2, i3, f, i4);
        this.f126870b = i2;
        this.f126871c = i;
    }
}
