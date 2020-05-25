package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

final class bxz extends PushbackInputStream {

    /* renamed from: a */
    private final /* synthetic */ bxv f44538a;

    bxz(bxv bxv, InputStream inputStream, int i) {
        this.f44538a = bxv;
        super(inputStream, 1);
    }

    public final synchronized void close() throws IOException {
        bxt.m36971a(this.f44538a.f44525a);
        super.close();
    }
}
