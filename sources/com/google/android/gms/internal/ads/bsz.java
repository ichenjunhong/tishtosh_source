package com.google.android.gms.internal.ads;

import java.io.IOException;

public class bsz extends IOException {

    /* renamed from: a */
    private final int f43825a;

    /* renamed from: b */
    private final bsu f43826b;

    public bsz(String str, bsu bsu, int i) {
        super(str);
        this.f43826b = bsu;
        this.f43825a = 1;
    }

    public bsz(IOException iOException, bsu bsu, int i) {
        super(iOException);
        this.f43826b = bsu;
        this.f43825a = i;
    }

    public bsz(String str, IOException iOException, bsu bsu, int i) {
        super(str, iOException);
        this.f43826b = bsu;
        this.f43825a = 1;
    }
}
