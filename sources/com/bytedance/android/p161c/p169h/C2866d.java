package com.bytedance.android.p161c.p169h;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.android.c.h.d */
public final class C2866d extends InputStream {

    /* renamed from: a */
    private long f8527a;

    /* renamed from: b */
    private InputStream f8528b;

    /* renamed from: c */
    private long f8529c = this.f8527a;

    public final int available() throws IOException {
        if (this.f8528b != null) {
            return this.f8528b.available();
        }
        return super.available();
    }

    public final void close() throws IOException {
        if (this.f8528b != null) {
            this.f8528b.close();
        }
        super.close();
    }

    public final int read() throws IOException {
        if (this.f8528b != null) {
            return this.f8528b.read();
        }
        return 0;
    }

    public final long skip(long j) throws IOException {
        if (this.f8528b != null) {
            return this.f8528b.skip(j);
        }
        return 0;
    }

    public final int read(byte[] bArr) throws IOException {
        if (this.f8528b != null) {
            return this.f8528b.read(bArr);
        }
        return super.read(bArr);
    }

    public C2866d(long j, InputStream inputStream) {
        this.f8527a = j;
        this.f8528b = inputStream;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int min = (int) Math.min(this.f8529c, (long) i2);
        if (min == 0) {
            return -1;
        }
        if (this.f8528b == null) {
            return super.read(bArr, i, min);
        }
        int read = this.f8528b.read(bArr, i, min);
        if (read != -1) {
            this.f8529c -= (long) read;
        }
        return read;
    }
}
