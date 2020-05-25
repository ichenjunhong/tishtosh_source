package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

public final class bud {

    /* renamed from: a */
    public final List<byte[]> f43907a;

    /* renamed from: b */
    public final int f43908b;

    /* renamed from: a */
    public static bud m36774a(btr btr) throws bmk {
        List list;
        try {
            btr.mo30699d(21);
            int d = btr.mo30698d() & 3;
            int d2 = btr.mo30698d();
            int i = btr.f43868b;
            int i2 = 0;
            int i3 = 0;
            while (i2 < d2) {
                btr.mo30699d(1);
                int e = btr.mo30700e();
                int i4 = i3;
                for (int i5 = 0; i5 < e; i5++) {
                    int e2 = btr.mo30700e();
                    i4 += e2 + 4;
                    btr.mo30699d(e2);
                }
                i2++;
                i3 = i4;
            }
            btr.mo30697c(i);
            byte[] bArr = new byte[i3];
            int i6 = 0;
            int i7 = 0;
            while (i6 < d2) {
                btr.mo30699d(1);
                int e3 = btr.mo30700e();
                int i8 = i7;
                for (int i9 = 0; i9 < e3; i9++) {
                    int e4 = btr.mo30700e();
                    System.arraycopy(bto.f43849a, 0, bArr, i8, bto.f43849a.length);
                    int length = i8 + bto.f43849a.length;
                    System.arraycopy(btr.f43867a, btr.f43868b, bArr, length, e4);
                    i8 = length + e4;
                    btr.mo30699d(e4);
                }
                i6++;
                i7 = i8;
            }
            if (i3 == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new bud(list, d + 1);
        } catch (ArrayIndexOutOfBoundsException e5) {
            throw new bmk("Error parsing HEVC config", e5);
        }
    }

    private bud(List<byte[]> list, int i) {
        this.f43907a = list;
        this.f43908b = i;
    }
}
