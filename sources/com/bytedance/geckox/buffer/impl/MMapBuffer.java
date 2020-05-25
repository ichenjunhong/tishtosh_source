package com.bytedance.geckox.buffer.impl;

import com.bytedance.geckox.buffer.C10053a;
import com.bytedance.geckox.utils.C10153c;
import com.bytedance.geckox.utils.C10159g;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

class MMapBuffer implements C10053a {

    /* renamed from: a */
    public long f27338a;

    /* renamed from: b */
    public long f27339b;

    /* renamed from: c */
    public File f27340c;

    /* renamed from: d */
    private long f27341d;

    /* renamed from: e */
    private AtomicBoolean f27342e = new AtomicBoolean(false);

    private native long nCreate(String str, long j) throws IOException;

    private native int nFlush(long j, long j2) throws IOException;

    private native void nRead(long j, long j2, byte[] bArr, int i, int i2);

    private native int nRelease(long j, long j2);

    private native void nWrite(long j, long j2, byte[] bArr, int i, int i2);

    /* renamed from: b */
    public long mo18040b() {
        return this.f27338a;
    }

    /* renamed from: f */
    public File mo18045f() {
        return this.f27340c;
    }

    static {
        C10159g.m20484a("buffer");
    }

    /* renamed from: d */
    public int mo18043d() throws IOException {
        byte[] bArr = new byte[1];
        if (mo18038b(bArr) <= 0) {
            return -1;
        }
        return bArr[0];
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        try {
            mo18044e();
        } catch (Exception e) {
            C10153c.m20478a(e);
        }
    }

    /* renamed from: a */
    public void mo18035a() throws IOException {
        if (!this.f27342e.get()) {
            nFlush(this.f27339b, this.f27338a);
            return;
        }
        throw new IOException("released!");
    }

    /* renamed from: c */
    public long mo18042c() throws IOException {
        if (!this.f27342e.get()) {
            return this.f27341d;
        }
        throw new IOException("released!");
    }

    /* renamed from: e */
    public void mo18044e() {
        if (!this.f27342e.getAndSet(true)) {
            nRelease(this.f27339b, this.f27338a);
            this.f27339b = 0;
        }
    }

    /* renamed from: a */
    public void mo18037a(byte[] bArr) throws IOException {
        mo18033a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public int mo18038b(byte[] bArr) throws IOException {
        return mo18039b(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public void mo18036a(int i) throws IOException {
        mo18037a(new byte[]{(byte) i});
    }

    /* renamed from: a */
    public synchronized long mo18034a(long j) throws IOException {
        if (this.f27342e.get()) {
            throw new IOException("released!");
        } else if (j <= 0) {
            return 0;
        } else {
            long j2 = this.f27341d;
            this.f27341d += j;
            if (this.f27341d < 0) {
                this.f27341d = 0;
            } else if (this.f27341d > this.f27338a) {
                this.f27341d = this.f27338a;
            }
            return this.f27341d - j2;
        }
    }

    /* renamed from: b */
    public void mo18041b(long j) throws IOException {
        if (!this.f27342e.get()) {
            if (j < 0) {
                j = 0;
            } else if (j > this.f27338a) {
                j = this.f27338a;
            }
            this.f27341d = j;
            return;
        }
        throw new IOException("released!");
    }

    MMapBuffer(long j, File file) throws IOException {
        this.f27338a = j;
        this.f27340c = file;
        file.getParentFile().mkdirs();
        this.f27339b = nCreate(file.getAbsolutePath(), j);
    }

    /* renamed from: a */
    public int mo18033a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f27342e.get()) {
            throw new IOException("released!");
        } else if (bArr == null || bArr.length == 0 || i2 <= 0 || i < 0 || i >= bArr.length) {
            return 0;
        } else {
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                if (this.f27341d == this.f27338a) {
                    return 0;
                }
                if (this.f27341d + ((long) i2) > this.f27338a) {
                    i2 = (int) (this.f27338a - this.f27341d);
                }
                nWrite(this.f27339b, this.f27341d, bArr, i, i2);
                this.f27341d += (long) i2;
                return i2;
            }
        }
    }

    /* renamed from: b */
    public int mo18039b(byte[] bArr, int i, int i2) throws IOException {
        if (this.f27342e.get()) {
            throw new IOException("released!");
        } else if (bArr == null || i2 <= 0 || i < 0 || i >= bArr.length) {
            return 0;
        } else {
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                if (this.f27341d == this.f27338a) {
                    return -1;
                }
                if (this.f27341d + ((long) i2) > this.f27338a) {
                    i2 = (int) (this.f27338a - this.f27341d);
                }
                nRead(this.f27339b, this.f27341d, bArr, i, i2);
                this.f27341d += (long) i2;
                return i2;
            }
        }
    }
}
