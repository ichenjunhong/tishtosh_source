package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.mm */
final class C16079mm extends FilterInputStream {

    /* renamed from: a */
    private final long f45223a;

    /* renamed from: b */
    private long f45224b;

    C16079mm(InputStream inputStream, long j) {
        super(inputStream);
        this.f45223a = j;
    }

    public final int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.f45224b++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f45224b += (long) read;
        }
        return read;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo31179a() {
        return this.f45223a - this.f45224b;
    }
}
