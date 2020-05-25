package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final class bxf implements Comparator<bwt> {
    public bxf(bxe bxe) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        bwt bwt = (bwt) obj;
        bwt bwt2 = (bwt) obj2;
        if (bwt.f44174b < bwt2.f44174b) {
            return -1;
        }
        if (bwt.f44174b > bwt2.f44174b) {
            return 1;
        }
        if (bwt.f44173a < bwt2.f44173a) {
            return -1;
        }
        if (bwt.f44173a > bwt2.f44173a) {
            return 1;
        }
        float f = (bwt.f44176d - bwt.f44174b) * (bwt.f44175c - bwt.f44173a);
        float f2 = (bwt2.f44176d - bwt2.f44174b) * (bwt2.f44175c - bwt2.f44173a);
        if (f > f2) {
            return -1;
        }
        if (f < f2) {
            return 1;
        }
        return 0;
    }
}
