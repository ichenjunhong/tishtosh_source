package com.bytedance.falconx.statistic;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.falconx.statistic.a */
public class C9769a extends InputStream {

    /* renamed from: a */
    private InputStream f26586a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17587a(IOException iOException) {
    }

    public boolean markSupported() {
        return this.f26586a.markSupported();
    }

    public int available() throws IOException {
        try {
            return this.f26586a.available();
        } catch (IOException e) {
            mo17587a(e);
            throw e;
        }
    }

    public void close() throws IOException {
        try {
            this.f26586a.close();
        } catch (IOException e) {
            mo17587a(e);
            throw e;
        }
    }

    public int read() throws IOException {
        try {
            return this.f26586a.read();
        } catch (IOException e) {
            mo17587a(e);
            throw e;
        }
    }

    public synchronized void reset() throws IOException {
        try {
            this.f26586a.reset();
        } catch (IOException e) {
            mo17587a(e);
            throw e;
        }
    }

    public C9769a(InputStream inputStream) {
        this.f26586a = inputStream;
    }

    public synchronized void mark(int i) {
        this.f26586a.mark(i);
    }

    public long skip(long j) throws IOException {
        try {
            return this.f26586a.skip(j);
        } catch (IOException e) {
            mo17587a(e);
            throw e;
        }
    }

    public int read(byte[] bArr) throws IOException {
        try {
            return this.f26586a.read(bArr);
        } catch (IOException e) {
            mo17587a(e);
            throw e;
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f26586a.read(bArr, i, i2);
        } catch (IOException e) {
            mo17587a(e);
            throw e;
        }
    }
}
