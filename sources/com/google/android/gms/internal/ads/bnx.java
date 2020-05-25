package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CryptoInfo;

public final class bnx {

    /* renamed from: a */
    public byte[] f43157a;

    /* renamed from: b */
    byte[] f43158b;

    /* renamed from: c */
    int f43159c;

    /* renamed from: d */
    public int[] f43160d;

    /* renamed from: e */
    public int[] f43161e;

    /* renamed from: f */
    int f43162f;

    /* renamed from: g */
    int f43163g;

    /* renamed from: h */
    int f43164h;

    /* renamed from: i */
    public final CryptoInfo f43165i;

    /* renamed from: j */
    final boa f43166j;

    public bnx() {
        this.f43165i = btw.f43878a >= 16 ? new CryptoInfo() : null;
        this.f43166j = btw.f43878a >= 24 ? new boa(this.f43165i) : null;
    }
}
