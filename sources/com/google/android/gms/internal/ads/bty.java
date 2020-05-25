package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class bty {

    /* renamed from: a */
    public final List<byte[]> f43888a;

    /* renamed from: b */
    public final int f43889b;

    /* renamed from: c */
    public final float f43890c;

    /* renamed from: d */
    private final int f43891d;

    /* renamed from: e */
    private final int f43892e;

    /* renamed from: a */
    public static bty m36767a(btr btr) throws bmk {
        float f;
        int i;
        int i2;
        try {
            btr.mo30699d(4);
            int d = (btr.mo30698d() & 3) + 1;
            if (d != 3) {
                ArrayList arrayList = new ArrayList();
                int d2 = btr.mo30698d() & 31;
                for (int i3 = 0; i3 < d2; i3++) {
                    arrayList.add(m36768b(btr));
                }
                int d3 = btr.mo30698d();
                for (int i4 = 0; i4 < d3; i4++) {
                    arrayList.add(m36768b(btr));
                }
                if (d2 > 0) {
                    btp a = bto.m36717a((byte[]) arrayList.get(0), d, ((byte[]) arrayList.get(0)).length);
                    int i5 = a.f43853a;
                    int i6 = a.f43854b;
                    f = a.f43855c;
                    i2 = i5;
                    i = i6;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                bty bty = new bty(arrayList, d, i2, i, f);
                return bty;
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new bmk("Error parsing AVC config", e);
        }
    }

    private bty(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f43888a = list;
        this.f43889b = i;
        this.f43891d = i2;
        this.f43892e = i3;
        this.f43890c = f;
    }

    /* renamed from: b */
    private static byte[] m36768b(btr btr) {
        int e = btr.mo30700e();
        int i = btr.f43868b;
        btr.mo30699d(e);
        return btj.m36704a(btr.f43867a, i, e);
    }
}
