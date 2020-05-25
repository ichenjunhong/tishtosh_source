package com.google.android.gms.internal.ads;

final /* synthetic */ class ajp implements Runnable {

    /* renamed from: a */
    private final ajh f40699a;

    /* renamed from: b */
    private final int f40700b;

    /* renamed from: c */
    private final int f40701c;

    ajp(ajh ajh, int i, int i2) {
        this.f40699a = ajh;
        this.f40700b = i;
        this.f40701c = i2;
    }

    public final void run() {
        ajh ajh = this.f40699a;
        int i = this.f40700b;
        int i2 = this.f40701c;
        if (ajh.f40668d != null) {
            ajh.f40668d.mo28877a(i, i2);
        }
    }
}
