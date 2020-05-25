package com.bytedance.geckox.buffer.p597a;

import com.bytedance.geckox.buffer.C10053a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.geckox.buffer.a.a */
public final class C10054a extends InputStream {

    /* renamed from: a */
    private C10053a f27335a;

    /* renamed from: b */
    private long f27336b;

    public final void close() throws IOException {
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() throws IOException {
        return this.f27335a.mo18043d();
    }

    public final synchronized void reset() throws IOException {
        this.f27335a.mo18041b(this.f27336b);
    }

    public final int available() throws IOException {
        long b = this.f27335a.mo18040b() - this.f27335a.mo18042c();
        if (b > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) b;
    }

    public C10054a(C10053a aVar) {
        this.f27335a = aVar;
    }

    public final long skip(long j) throws IOException {
        return this.f27335a.mo18034a(j);
    }

    public final synchronized void mark(int i) {
        this.f27336b = (long) i;
    }

    public final int read(byte[] bArr) throws IOException {
        return this.f27335a.mo18038b(bArr);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f27335a.mo18039b(bArr, i, i2);
    }
}
