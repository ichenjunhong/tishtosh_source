package com.google.android.gms.internal.ads;

public final class bno extends Exception {

    /* renamed from: a */
    private final int f43096a;

    public bno(int i) {
        StringBuilder sb = new StringBuilder(36);
        sb.append("AudioTrack write failed: ");
        sb.append(i);
        super(sb.toString());
        this.f43096a = i;
    }
}
