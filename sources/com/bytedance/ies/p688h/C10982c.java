package com.bytedance.ies.p688h;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.ies.h.c */
class C10982c extends InputStream {

    /* renamed from: a */
    private InputStream f29491a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19792a(IOException iOException) {
    }

    public boolean markSupported() {
        return this.f29491a.markSupported();
    }

    public int available() throws IOException {
        try {
            return this.f29491a.available();
        } catch (IOException e) {
            mo19792a(e);
            throw e;
        }
    }

    public void close() throws IOException {
        try {
            this.f29491a.close();
        } catch (IOException e) {
            mo19792a(e);
            throw e;
        }
    }

    public int read() throws IOException {
        try {
            return this.f29491a.read();
        } catch (IOException e) {
            mo19792a(e);
            throw e;
        }
    }

    public synchronized void reset() throws IOException {
        try {
            this.f29491a.reset();
        } catch (IOException e) {
            mo19792a(e);
            throw e;
        }
    }

    public C10982c(InputStream inputStream) {
        this.f29491a = inputStream;
    }

    public synchronized void mark(int i) {
        this.f29491a.mark(i);
    }

    public long skip(long j) throws IOException {
        try {
            return this.f29491a.skip(j);
        } catch (IOException e) {
            mo19792a(e);
            throw e;
        }
    }

    public int read(byte[] bArr) throws IOException {
        try {
            return this.f29491a.read(bArr);
        } catch (IOException e) {
            mo19792a(e);
            throw e;
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f29491a.read(bArr, i, i2);
        } catch (IOException e) {
            mo19792a(e);
            throw e;
        }
    }
}
