package com.facebook.common.p926j;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.common.j.b */
public final class C13724b extends FilterInputStream {

    /* renamed from: a */
    private final byte[] f35714a;

    /* renamed from: b */
    private int f35715b;

    /* renamed from: c */
    private int f35716c;

    public final int read() throws IOException {
        int read = this.in.read();
        if (read != -1) {
            return read;
        }
        return m27771a();
    }

    /* renamed from: a */
    private int m27771a() {
        if (this.f35715b >= this.f35714a.length) {
            return -1;
        }
        byte[] bArr = this.f35714a;
        int i = this.f35715b;
        this.f35715b = i + 1;
        return bArr[i] & 255;
    }

    public final void reset() throws IOException {
        if (this.in.markSupported()) {
            this.in.reset();
            this.f35715b = this.f35716c;
            return;
        }
        throw new IOException("mark is not supported");
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final void mark(int i) {
        if (this.in.markSupported()) {
            super.mark(i);
            this.f35716c = this.f35715b;
        }
    }

    public C13724b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        if (inputStream == null) {
            throw new NullPointerException();
        } else if (bArr != null) {
            this.f35714a = bArr;
        } else {
            throw new NullPointerException();
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i3 < i2) {
            int a = m27771a();
            if (a == -1) {
                break;
            }
            bArr[i + i3] = (byte) a;
            i3++;
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }
}
