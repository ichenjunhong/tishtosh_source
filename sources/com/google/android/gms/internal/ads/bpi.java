package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class bpi extends bph {

    /* renamed from: aA */
    public final List<bpj> f43413aA = new ArrayList();

    /* renamed from: aB */
    public final List<bpi> f43414aB = new ArrayList();

    /* renamed from: az */
    public final long f43415az;

    public bpi(int i, long j) {
        super(i);
        this.f43415az = j;
    }

    /* renamed from: c */
    public final bpj mo30540c(int i) {
        int size = this.f43413aA.size();
        for (int i2 = 0; i2 < size; i2++) {
            bpj bpj = (bpj) this.f43413aA.get(i2);
            if (bpj.f43412ay == i) {
                return bpj;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final bpi mo30541d(int i) {
        int size = this.f43414aB.size();
        for (int i2 = 0; i2 < size; i2++) {
            bpi bpi = (bpi) this.f43414aB.get(i2);
            if (bpi.f43412ay == i) {
                return bpi;
            }
        }
        return null;
    }

    public final String toString() {
        String b = m36393b(this.f43412ay);
        String arrays = Arrays.toString(this.f43413aA.toArray());
        String arrays2 = Arrays.toString(this.f43414aB.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append(b);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
