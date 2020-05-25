package com.bytedance.geckox.buffer.impl;

import com.bytedance.geckox.buffer.C10053a;
import com.bytedance.geckox.utils.C10152b;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.geckox.buffer.impl.c */
final class C10059c implements C10053a {

    /* renamed from: a */
    private long f27353a;

    /* renamed from: b */
    private long f27354b;

    /* renamed from: c */
    private RandomAccessFile f27355c;

    /* renamed from: d */
    private AtomicBoolean f27356d = new AtomicBoolean(false);

    /* renamed from: e */
    private File f27357e;

    /* renamed from: b */
    public final long mo18040b() {
        return this.f27353a;
    }

    /* renamed from: f */
    public final File mo18045f() {
        return this.f27357e;
    }

    /* renamed from: d */
    public final int mo18043d() throws IOException {
        byte[] bArr = new byte[1];
        if (mo18038b(bArr) == 0) {
            return -1;
        }
        return bArr[0];
    }

    /* renamed from: e */
    public final void mo18044e() {
        if (!this.f27356d.getAndSet(true)) {
            C10152b.m20477a((Closeable) this.f27355c);
        }
    }

    /* renamed from: a */
    public final void mo18035a() throws IOException {
        if (this.f27356d.get()) {
            throw new IOException("released!");
        }
    }

    /* renamed from: c */
    public final long mo18042c() throws IOException {
        if (!this.f27356d.get()) {
            return this.f27354b;
        }
        throw new IOException("released!");
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
        int skipBytes;
        if (!this.f27356d.get()) {
            int i = (int) j;
            if (((long) i) == j) {
                skipBytes = this.f27355c.skipBytes(i);
                this.f27354b = this.f27355c.getFilePointer();
            } else {
                StringBuilder sb = new StringBuilder("too large:");
                sb.append(j);
                throw new IOException(sb.toString());
            }
        } else {
            throw new IOException("released!");
        }
        return (long) skipBytes;
    }

    /* renamed from: b */
    public final void mo18041b(long j) throws IOException {
        if (!this.f27356d.get()) {
            if (j < 0) {
                j = 0;
            } else if (j > this.f27353a) {
                j = this.f27353a;
            }
            this.f27354b = j;
            this.f27355c.seek(this.f27354b);
            return;
        }
        throw new IOException("released!");
    }

    C10059c(long j, File file) throws IOException {
        this.f27353a = j;
        this.f27357e = file;
        file.getParentFile().mkdirs();
        try {
            this.f27355c = new RandomAccessFile(file, "rw");
            this.f27355c.setLength(j);
        } catch (Exception e) {
            C10152b.m20477a((Closeable) this.f27355c);
            StringBuilder sb = new StringBuilder("create raf swap failed! path: ");
            sb.append(file.getAbsolutePath());
            sb.append(" caused by: ");
            sb.append(e.getMessage());
            throw new IOException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public final int mo18033a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f27356d.get()) {
            throw new IOException("released!");
        } else if (bArr == null || bArr.length == 0 || i2 <= 0 || i < 0 || i >= bArr.length) {
            return 0;
        } else {
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                if (this.f27354b == this.f27353a) {
                    return 0;
                }
                if (this.f27354b + ((long) i2) > this.f27353a) {
                    i2 = (int) (this.f27353a - this.f27354b);
                }
                this.f27355c.write(bArr, i, i2);
                this.f27354b += (long) i2;
                return i2;
            }
        }
    }

    /* renamed from: b */
    public final int mo18039b(byte[] bArr, int i, int i2) throws IOException {
        if (this.f27356d.get()) {
            throw new IOException("released!");
        } else if (bArr == null || i2 <= 0 || i < 0 || i >= bArr.length) {
            return 0;
        } else {
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                if (this.f27354b == this.f27353a) {
                    return -1;
                }
                if (this.f27354b + ((long) i2) > this.f27353a) {
                    i2 = (int) (this.f27353a - this.f27354b);
                }
                int read = this.f27355c.read(bArr, i, i2);
                if (read == -1) {
                    return -1;
                }
                this.f27354b += (long) read;
                return read;
            }
        }
    }
}
