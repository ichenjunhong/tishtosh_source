package com.bytedance.frameworks.baselib.network.http;

import com.bytedance.retrofit2.p830a.C12689e;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d */
public final class C9889d extends InputStream {

    /* renamed from: a */
    private InputStream f26948a;

    /* renamed from: b */
    private C12689e f26949b;

    public C9889d() {
    }

    public final int available() throws IOException {
        if (this.f26948a != null) {
            return this.f26948a.available();
        }
        return super.available();
    }

    public final boolean markSupported() {
        if (this.f26948a != null) {
            return this.f26948a.markSupported();
        }
        return super.markSupported();
    }

    public final int read() throws IOException {
        if (this.f26948a != null) {
            return this.f26948a.read();
        }
        return -1;
    }

    public final void close() throws IOException {
        try {
            if (this.f26948a != null) {
                this.f26948a.close();
            }
            if (this.f26949b != null) {
                this.f26949b.mo9560b();
            }
        } catch (Throwable unused) {
        }
        super.close();
    }

    public final synchronized void reset() throws IOException {
        if (this.f26948a != null) {
            this.f26948a.reset();
        } else {
            super.reset();
        }
    }

    public final long skip(long j) throws IOException {
        if (this.f26948a != null) {
            return this.f26948a.skip(j);
        }
        return super.skip(j);
    }

    public final synchronized void mark(int i) {
        if (this.f26948a != null) {
            this.f26948a.mark(i);
        } else {
            super.mark(i);
        }
    }

    public final int read(byte[] bArr) throws IOException {
        if (this.f26948a != null) {
            return this.f26948a.read(bArr);
        }
        return super.read(bArr);
    }

    public C9889d(InputStream inputStream, C12689e eVar) {
        this.f26948a = inputStream;
        this.f26949b = eVar;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f26948a != null) {
            return this.f26948a.read(bArr, i, i2);
        }
        return super.read(bArr, i, i2);
    }
}
