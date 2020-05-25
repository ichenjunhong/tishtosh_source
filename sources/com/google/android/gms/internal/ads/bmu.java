package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class bmu {

    /* renamed from: b */
    private static final bmu f42999b = new bmu(new int[]{2}, 2);

    /* renamed from: a */
    final int[] f43000a;

    /* renamed from: c */
    private final int f43001c = 2;

    private bmu(int[] iArr, int i) {
        this.f43000a = Arrays.copyOf(iArr, 1);
        Arrays.sort(this.f43000a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmu)) {
            return false;
        }
        bmu bmu = (bmu) obj;
        return Arrays.equals(this.f43000a, bmu.f43000a) && this.f43001c == bmu.f43001c;
    }

    public final int hashCode() {
        return this.f43001c + (Arrays.hashCode(this.f43000a) * 31);
    }

    public final String toString() {
        int i = this.f43001c;
        String arrays = Arrays.toString(this.f43000a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
