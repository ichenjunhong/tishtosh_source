package com.squareup.p1094a;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.a.p */
final class C18388p extends InputStream {

    /* renamed from: a */
    private final InputStream f50774a;

    /* renamed from: b */
    private long f50775b;

    /* renamed from: c */
    private long f50776c;

    /* renamed from: d */
    private long f50777d;

    /* renamed from: e */
    private long f50778e;

    public final int available() throws IOException {
        return this.f50774a.available();
    }

    public final void close() throws IOException {
        this.f50774a.close();
    }

    public final boolean markSupported() {
        return this.f50774a.markSupported();
    }

    public final void reset() throws IOException {
        mo36837a(this.f50778e);
    }

    public final int read() throws IOException {
        int read = this.f50774a.read();
        if (read != -1) {
            this.f50775b++;
        }
        return read;
    }

    public C18388p(InputStream inputStream) {
        this(inputStream, 4096);
    }

    public final void mark(int i) {
        this.f50778e = mo36836a(i);
    }

    /* renamed from: a */
    public final long mo36836a(int i) {
        long j = this.f50775b + ((long) i);
        if (this.f50777d < j) {
            m44660b(j);
        }
        return this.f50775b;
    }

    public final int read(byte[] bArr) throws IOException {
        int read = this.f50774a.read(bArr);
        if (read != -1) {
            this.f50775b += (long) read;
        }
        return read;
    }

    public final long skip(long j) throws IOException {
        long skip = this.f50774a.skip(j);
        this.f50775b += skip;
        return skip;
    }

    /* renamed from: a */
    public final void mo36837a(long j) throws IOException {
        if (this.f50775b > this.f50777d || j < this.f50776c) {
            throw new IOException("Cannot reset");
        }
        this.f50774a.reset();
        m44659a(this.f50776c, j);
        this.f50775b = j;
    }

    /* renamed from: b */
    private void m44660b(long j) {
        try {
            if (this.f50776c >= this.f50775b || this.f50775b > this.f50777d) {
                this.f50776c = this.f50775b;
                this.f50774a.mark((int) (j - this.f50775b));
            } else {
                this.f50774a.reset();
                this.f50774a.mark((int) (j - this.f50776c));
                m44659a(this.f50776c, this.f50775b);
            }
            this.f50777d = j;
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder("Unable to mark: ");
            sb.append(e);
            throw new IllegalStateException(sb.toString());
        }
    }

    private C18388p(InputStream inputStream, int i) {
        this.f50778e = -1;
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream, 4096);
        }
        this.f50774a = inputStream;
    }

    /* renamed from: a */
    private void m44659a(long j, long j2) throws IOException {
        while (j < j2) {
            long skip = this.f50774a.skip(j2 - j);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j += skip;
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f50774a.read(bArr, i, i2);
        if (read != -1) {
            this.f50775b += (long) read;
        }
        return read;
    }
}
