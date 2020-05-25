package com.facebook.common.p926j;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.common.j.a */
public final class C13723a extends FilterInputStream {

    /* renamed from: a */
    private int f35712a;

    /* renamed from: b */
    private int f35713b;

    public final int available() throws IOException {
        return Math.min(this.in.available(), this.f35712a);
    }

    public final int read() throws IOException {
        if (this.f35712a == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f35712a--;
        }
        return read;
    }

    public final void reset() throws IOException {
        if (!this.in.markSupported()) {
            throw new IOException("mark is not supported");
        } else if (this.f35713b != -1) {
            this.in.reset();
            this.f35712a = this.f35713b;
        } else {
            throw new IOException("mark not set");
        }
    }

    public final void mark(int i) {
        if (this.in.markSupported()) {
            this.in.mark(i);
            this.f35713b = this.f35712a;
        }
    }

    public final long skip(long j) throws IOException {
        long skip = this.in.skip(Math.min(j, (long) this.f35712a));
        this.f35712a = (int) (((long) this.f35712a) - skip);
        return skip;
    }

    public C13723a(InputStream inputStream, int i) {
        super(inputStream);
        if (inputStream == null) {
            throw new NullPointerException();
        } else if (i >= 0) {
            this.f35712a = i;
            this.f35713b = -1;
        } else {
            throw new IllegalArgumentException("limit must be >= 0");
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f35712a == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, Math.min(i2, this.f35712a));
        if (read > 0) {
            this.f35712a -= read;
        }
        return read;
    }
}
