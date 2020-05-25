package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class apw<P> {

    /* renamed from: a */
    public final P f41205a;

    /* renamed from: b */
    public final atz f41206b;

    /* renamed from: c */
    private final byte[] f41207c;

    /* renamed from: d */
    private final ath f41208d;

    public apw(P p, byte[] bArr, ath ath, atz atz) {
        this.f41205a = p;
        this.f41207c = Arrays.copyOf(bArr, bArr.length);
        this.f41208d = ath;
        this.f41206b = atz;
    }

    /* renamed from: a */
    public final byte[] mo29461a() {
        if (this.f41207c == null) {
            return null;
        }
        return Arrays.copyOf(this.f41207c, this.f41207c.length);
    }
}
