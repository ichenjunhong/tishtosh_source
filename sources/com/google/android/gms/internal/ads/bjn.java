package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class bjn extends bjm {

    /* renamed from: N */
    public final long f42675N;

    /* renamed from: O */
    public final List<bjo> f42676O = new ArrayList();

    /* renamed from: P */
    public final List<bjn> f42677P = new ArrayList();

    public bjn(int i, long j) {
        super(i);
        this.f42675N = j;
    }

    /* renamed from: c */
    public final bjo mo30291c(int i) {
        int size = this.f42676O.size();
        for (int i2 = 0; i2 < size; i2++) {
            bjo bjo = (bjo) this.f42676O.get(i2);
            if (bjo.f42674M == i) {
                return bjo;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final bjn mo30292d(int i) {
        int size = this.f42677P.size();
        for (int i2 = 0; i2 < size; i2++) {
            bjn bjn = (bjn) this.f42677P.get(i2);
            if (bjn.f42674M == i) {
                return bjn;
            }
        }
        return null;
    }

    public final String toString() {
        String b = m35905b(this.f42674M);
        String valueOf = String.valueOf(Arrays.toString(this.f42676O.toArray(new bjo[0])));
        String valueOf2 = String.valueOf(Arrays.toString(this.f42677P.toArray(new bjn[0])));
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 22 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append(b);
        sb.append(" leaves: ");
        sb.append(valueOf);
        sb.append(" containers: ");
        sb.append(valueOf2);
        return sb.toString();
    }
}
