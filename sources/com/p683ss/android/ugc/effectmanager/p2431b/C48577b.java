package com.p683ss.android.ugc.effectmanager.p2431b;

import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.ss.android.ugc.effectmanager.b.b */
final class C48577b implements Closeable {

    /* renamed from: a */
    public final Charset f122122a;

    /* renamed from: b */
    int f122123b;

    /* renamed from: c */
    private final InputStream f122124c;

    /* renamed from: d */
    private byte[] f122125d;

    /* renamed from: e */
    private int f122126e;

    /* renamed from: b */
    private void m105101b() throws IOException {
        int read = this.f122124c.read(this.f122125d, 0, this.f122125d.length);
        if (read != -1) {
            this.f122126e = 0;
            this.f122123b = read;
            return;
        }
        throw new EOFException();
    }

    public final void close() throws IOException {
        synchronized (this.f122124c) {
            if (this.f122125d != null) {
                this.f122125d = null;
                this.f122124c.close();
            }
        }
    }

    /* renamed from: a */
    public final String mo96130a() throws IOException {
        int i;
        int i2;
        synchronized (this.f122124c) {
            if (this.f122125d != null) {
                if (this.f122126e >= this.f122123b) {
                    m105101b();
                }
                for (int i3 = this.f122126e; i3 != this.f122123b; i3++) {
                    if (this.f122125d[i3] == 10) {
                        if (i3 != this.f122126e) {
                            i2 = i3 - 1;
                            if (this.f122125d[i2] == 13) {
                                String str = new String(this.f122125d, this.f122126e, i2 - this.f122126e, this.f122122a.name());
                                this.f122126e = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f122125d, this.f122126e, i2 - this.f122126e, this.f122122a.name());
                        this.f122126e = i3 + 1;
                        return str2;
                    }
                }
                C485781 r1 = new ByteArrayOutputStream((this.f122123b - this.f122126e) + 80) {
                    public final String toString() {
                        int i;
                        if (this.count <= 0 || this.buf[this.count - 1] != 13) {
                            i = this.count;
                        } else {
                            i = this.count - 1;
                        }
                        try {
                            return new String(this.buf, 0, i, C48577b.this.f122122a.name());
                        } catch (UnsupportedEncodingException e) {
                            throw new AssertionError(e);
                        }
                    }
                };
                loop1:
                while (true) {
                    r1.write(this.f122125d, this.f122126e, this.f122123b - this.f122126e);
                    this.f122123b = -1;
                    m105101b();
                    i = this.f122126e;
                    while (true) {
                        if (i != this.f122123b) {
                            if (this.f122125d[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f122126e) {
                    r1.write(this.f122125d, this.f122126e, i - this.f122126e);
                }
                this.f122126e = i + 1;
                String byteArrayOutputStream = r1.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public C48577b(InputStream inputStream, Charset charset) {
        this(inputStream, VideoCacheReadBuffersizeExperiment.DEFAULT, charset);
    }

    private C48577b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (charset.equals(C48579c.f122128a)) {
            this.f122124c = inputStream;
            this.f122122a = charset;
            this.f122125d = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
