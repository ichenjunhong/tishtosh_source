package com.p683ss.android.ugc.effectmanager.common.p2434b;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.effectmanager.common.b.d */
public final class C48621d extends FilterOutputStream {

    /* renamed from: a */
    public long f122253a;

    public final void close() {
        this.out.close();
    }

    public C48621d(OutputStream outputStream) {
        C52711k.m112240b(outputStream, "outStream");
        super(outputStream);
    }

    public final void write(int i) {
        this.out.write(i);
        this.f122253a++;
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        this.f122253a += (long) i2;
    }
}
