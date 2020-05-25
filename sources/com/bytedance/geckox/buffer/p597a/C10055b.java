package com.bytedance.geckox.buffer.p597a;

import com.bytedance.geckox.buffer.C10053a;
import java.io.IOException;

/* renamed from: com.bytedance.geckox.buffer.a.b */
public final class C10055b extends C10056c {

    /* renamed from: a */
    private C10053a f27337a;

    public final void close() throws IOException {
        flush();
    }

    public final void flush() throws IOException {
    }

    public C10055b(C10053a aVar) {
        this.f27337a = aVar;
    }

    public final void write(int i) throws IOException {
        this.f27337a.mo18036a(i);
    }

    public final void write(byte[] bArr) throws IOException {
        this.f27337a.mo18037a(bArr);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f27337a.mo18033a(bArr, i, i2);
    }
}
