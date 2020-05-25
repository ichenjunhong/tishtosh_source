package com.google.android.gms.internal.ads;

public final class biq extends Exception {

    /* renamed from: a */
    private final int f42536a;

    public biq(int i) {
        StringBuilder sb = new StringBuilder(36);
        sb.append("AudioTrack write failed: ");
        sb.append(i);
        super(sb.toString());
        this.f42536a = i;
    }
}
