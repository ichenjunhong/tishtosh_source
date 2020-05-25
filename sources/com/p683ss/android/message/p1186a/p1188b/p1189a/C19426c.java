package com.p683ss.android.message.p1186a.p1188b.p1189a;

import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.ss.android.message.a.b.a.c */
public final class C19426c extends FilterOutputStream {

    /* renamed from: a */
    protected byte[] f53695a;

    /* renamed from: b */
    protected int f53696b;

    /* renamed from: a */
    private void m47542a() throws IOException {
        if (this.f53695a == null) {
            throw new IOException("BufferedOutputStream is closed");
        }
    }

    /* renamed from: b */
    private void m47543b() throws IOException {
        if (this.f53696b > 0) {
            this.out.write(this.f53695a, 0, this.f53696b);
            this.f53696b = 0;
        }
    }

    public final synchronized void close() throws IOException {
        if (this.f53695a != null) {
            try {
                super.close();
            } finally {
                this.f53695a = null;
            }
        }
    }

    public final synchronized void flush() throws IOException {
        m47542a();
        m47543b();
        this.out.flush();
    }

    public C19426c(OutputStream outputStream) {
        this(outputStream, VideoCacheReadBuffersizeExperiment.DEFAULT);
    }

    public final synchronized void write(int i) throws IOException {
        m47542a();
        if (this.f53696b == this.f53695a.length) {
            this.out.write(this.f53695a, 0, this.f53696b);
            this.f53696b = 0;
        }
        byte[] bArr = this.f53695a;
        int i2 = this.f53696b;
        this.f53696b = i2 + 1;
        bArr[i2] = (byte) i;
    }

    private C19426c(OutputStream outputStream, int i) {
        super(outputStream);
        this.f53695a = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
    }

    public final synchronized void write(byte[] bArr, int i, int i2) throws IOException {
        m47542a();
        if (bArr != null) {
            byte[] bArr2 = this.f53695a;
            if (i2 >= bArr2.length) {
                m47543b();
                this.out.write(bArr, i, i2);
                return;
            }
            C19418a.m47531a(bArr.length, i, i2);
            if (i2 > bArr2.length - this.f53696b) {
                m47543b();
            }
            System.arraycopy(bArr, i, bArr2, this.f53696b, i2);
            this.f53696b += i2;
            return;
        }
        throw new NullPointerException("buffer == null");
    }
}
