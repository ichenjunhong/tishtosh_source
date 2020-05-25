package com.bytedance.geckox.buffer.impl;

import com.bytedance.geckox.buffer.C10053a;
import com.bytedance.geckox.utils.C10153c;
import com.bytedance.geckox.utils.C10159g;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

class MemoryBuffer implements C10053a {

    /* renamed from: a */
    private long f27345a;

    /* renamed from: b */
    private long f27346b;

    /* renamed from: c */
    private long f27347c;

    /* renamed from: d */
    private AtomicBoolean f27348d;

    /* renamed from: e */
    private File f27349e;

    private native long nCreate(String str, long j) throws IOException;

    private native void nFlush(long j, String str, long j2) throws IOException;

    private native void nRead(long j, long j2, byte[] bArr, int i, int i2);

    private native void nRelease(long j, long j2);

    private native void nWrite(long j, long j2, byte[] bArr, int i, int i2);

    /* renamed from: b */
    public final long mo18040b() {
        return this.f27345a;
    }

    /* renamed from: f */
    public final File mo18045f() {
        return this.f27349e;
    }

    static {
        C10159g.m20484a("buffer");
    }

    /* renamed from: d */
    public final int mo18043d() throws IOException {
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
    public final void mo18035a() throws IOException {
        if (!this.f27348d.get()) {
            nFlush(this.f27346b, this.f27349e.getAbsolutePath(), this.f27345a);
            return;
        }
        throw new IOException("released!");
    }

    /* renamed from: c */
    public final long mo18042c() throws IOException {
        if (!this.f27348d.get()) {
            return this.f27347c;
        }
        throw new IOException("released!");
    }

    /* renamed from: e */
    public final void mo18044e() {
        if (!this.f27348d.getAndSet(true)) {
            nRelease(this.f27346b, this.f27345a);
            this.f27346b = 0;
        }
    }

    /* renamed from: a */
    public final void mo18037a(byte[] bArr) throws IOException {
        mo18033a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public final int mo18038b(byte[] bArr) throws IOException {
        return mo18039b(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public final void mo18036a(int i) throws IOException {
        mo18037a(new byte[]{(byte) i});
    }

    /* renamed from: a */
    public final synchronized long mo18034a(long j) throws IOException {
        if (this.f27348d.get()) {
            throw new IOException("released!");
        } else if (j <= 0) {
            return 0;
        } else {
            long j2 = this.f27347c;
            this.f27347c += j;
            if (this.f27347c < 0) {
                this.f27347c = 0;
            } else if (this.f27347c > this.f27345a) {
                this.f27347c = this.f27345a;
            }
            return this.f27347c - j2;
        }
    }

    /* renamed from: b */
    public final void mo18041b(long j) throws IOException {
        if (!this.f27348d.get()) {
            if (j < 0) {
                j = 0;
            } else if (j > this.f27345a) {
                j = this.f27345a;
            }
            this.f27347c = j;
            return;
        }
        throw new IOException("released!");
    }

    /* renamed from: a */
    public final int mo18033a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f27348d.get()) {
            throw new IOException("released!");
        } else if (bArr == null || bArr.length == 0 || i2 <= 0 || i < 0 || i >= bArr.length) {
            return 0;
        } else {
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                if (this.f27347c == this.f27345a) {
                    return 0;
                }
                if (this.f27347c + ((long) i2) > this.f27345a) {
                    i2 = (int) (this.f27345a - this.f27347c);
                }
                nWrite(this.f27346b, this.f27347c, bArr, i, i2);
                this.f27347c += (long) i2;
                return i2;
            }
        }
    }

    /* renamed from: b */
    public final int mo18039b(byte[] bArr, int i, int i2) throws IOException {
        if (this.f27348d.get()) {
            throw new IOException("released!");
        } else if (bArr == null || i2 <= 0 || i < 0 || i >= bArr.length) {
            return 0;
        } else {
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                if (this.f27347c == this.f27345a) {
                    return -1;
                }
                if (this.f27347c + ((long) i2) > this.f27345a) {
                    i2 = (int) (this.f27345a - this.f27347c);
                }
                nRead(this.f27346b, this.f27347c, bArr, i, i2);
                this.f27347c += (long) i2;
                return i2;
            }
        }
    }
}
