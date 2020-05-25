package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class blt extends Exception {

    /* renamed from: a */
    private final int f42871a;

    /* renamed from: b */
    private final int f42872b;

    public static blt zza(Exception exc, int i) {
        return new blt(1, null, exc, i);
    }

    public static blt zza(IOException iOException) {
        return new blt(0, null, iOException, -1);
    }

    /* renamed from: a */
    static blt m36050a(RuntimeException runtimeException) {
        return new blt(2, null, runtimeException, -1);
    }

    private blt(int i, String str, Throwable th, int i2) {
        super(null, th);
        this.f42871a = i;
        this.f42872b = i2;
    }
}
