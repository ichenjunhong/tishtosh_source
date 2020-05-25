package com.facebook.common.p920d;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.facebook.common.d.c */
public final class C13680c extends FilterOutputStream {

    /* renamed from: a */
    public long f35658a;

    public final void close() throws IOException {
        this.out.close();
    }

    public C13680c(OutputStream outputStream) {
        super(outputStream);
    }

    public final void write(int i) throws IOException {
        this.out.write(i);
        this.f35658a++;
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        this.f35658a += (long) i2;
    }
}
