package com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a;

import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.ss.android.ugc.effectmanager.common.b.a.c */
public final class C48616c implements Closeable {

    /* renamed from: a */
    public final Charset f122244a;

    /* renamed from: b */
    private final InputStream f122245b;

    /* renamed from: c */
    private byte[] f122246c;

    /* renamed from: d */
    private int f122247d;

    /* renamed from: e */
    private int f122248e;

    /* renamed from: b */
    public final boolean mo96197b() {
        if (this.f122248e == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m105210c() throws IOException {
        int read = this.f122245b.read(this.f122246c, 0, this.f122246c.length);
        if (read != -1) {
            this.f122247d = 0;
            this.f122248e = read;
            return;
        }
        throw new EOFException();
    }

    public final void close() throws IOException {
        synchronized (this.f122245b) {
            if (this.f122246c != null) {
                this.f122246c = null;
                this.f122245b.close();
            }
        }
    }

    /* renamed from: a */
    public final String mo96196a() throws IOException {
        int i;
        int i2;
        synchronized (this.f122245b) {
            if (this.f122246c != null) {
                if (this.f122247d >= this.f122248e) {
                    m105210c();
                }
                for (int i3 = this.f122247d; i3 != this.f122248e; i3++) {
                    if (this.f122246c[i3] == 10) {
                        if (i3 != this.f122247d) {
                            i2 = i3 - 1;
                            if (this.f122246c[i2] == 13) {
                                String str = new String(this.f122246c, this.f122247d, i2 - this.f122247d, this.f122244a.name());
                                this.f122247d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f122246c, this.f122247d, i2 - this.f122247d, this.f122244a.name());
                        this.f122247d = i3 + 1;
                        return str2;
                    }
                }
                C486171 r1 = new ByteArrayOutputStream((this.f122248e - this.f122247d) + 80) {
                    public final String toString() {
                        int i;
                        if (this.count <= 0 || this.buf[this.count - 1] != 13) {
                            i = this.count;
                        } else {
                            i = this.count - 1;
                        }
                        try {
                            return new String(this.buf, 0, i, C48616c.this.f122244a.name());
                        } catch (UnsupportedEncodingException e) {
                            throw new AssertionError(e);
                        }
                    }
                };
                loop1:
                while (true) {
                    r1.write(this.f122246c, this.f122247d, this.f122248e - this.f122247d);
                    this.f122248e = -1;
                    m105210c();
                    i = this.f122247d;
                    while (true) {
                        if (i != this.f122248e) {
                            if (this.f122246c[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f122247d) {
                    r1.write(this.f122246c, this.f122247d, i - this.f122247d);
                }
                this.f122247d = i + 1;
                String byteArrayOutputStream = r1.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public C48616c(InputStream inputStream, Charset charset) {
        this(inputStream, VideoCacheReadBuffersizeExperiment.DEFAULT, charset);
    }

    private C48616c(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (charset.equals(C48671i.m105322a())) {
            this.f122245b = inputStream;
            this.f122244a = charset;
            this.f122246c = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
