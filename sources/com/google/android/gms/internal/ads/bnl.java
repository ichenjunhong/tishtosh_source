package com.google.android.gms.internal.ads;

public final class bnl extends Exception {

    /* renamed from: a */
    private final int f43092a;

    public bnl(int i, int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder(82);
        sb.append("AudioTrack init failed: ");
        sb.append(i);
        sb.append(", Config(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(")");
        super(sb.toString());
        this.f43092a = i;
    }
}
