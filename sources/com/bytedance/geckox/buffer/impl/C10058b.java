package com.bytedance.geckox.buffer.impl;

import com.bytedance.geckox.buffer.C10053a;
import com.bytedance.geckox.utils.C10152b;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.geckox.buffer.impl.b */
final class C10058b implements C10053a {

    /* renamed from: a */
    private RandomAccessFile f27350a;

    /* renamed from: b */
    private AtomicBoolean f27351b = new AtomicBoolean(false);

    /* renamed from: c */
    private File f27352c;

    /* renamed from: f */
    public final File mo18045f() {
        return this.f27352c;
    }

    /* renamed from: b */
    public final long mo18040b() throws IOException {
        return this.f27350a.length();
    }

    /* renamed from: d */
    public final int mo18043d() throws IOException {
        byte[] bArr = new byte[1];
        if (mo18038b(bArr) <= 0) {
            return -1;
        }
        return bArr[0];
    }

    /* renamed from: e */
    public final void mo18044e() {
        if (!this.f27351b.getAndSet(true)) {
            C10152b.m20477a((Closeable) this.f27350a);
        }
    }

    /* renamed from: a */
    public final void mo18035a() throws IOException {
        if (this.f27351b.get()) {
            throw new IOException("released!");
        }
    }

    /* renamed from: c */
    public final long mo18042c() throws IOException {
        if (!this.f27351b.get()) {
            return this.f27350a.getFilePointer();
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

    /* renamed from: b */
    public final void mo18041b(long j) throws IOException {
        if (!this.f27351b.get()) {
            if (j < 0) {
                j = 0;
            }
            this.f27350a.seek(j);
            return;
        }
        throw new IOException("released!");
    }

    C10058b(File file) throws IOException {
        this.f27352c = file;
        file.getParentFile().mkdirs();
        try {
            this.f27350a = new RandomAccessFile(file, "rw");
        } catch (Exception e) {
            C10152b.m20477a((Closeable) this.f27350a);
            StringBuilder sb = new StringBuilder("create raf mSwap failed! path: ");
            sb.append(file.getAbsolutePath());
            sb.append(" caused by: ");
            sb.append(e.getMessage());
            throw new IOException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public final synchronized long mo18034a(long j) throws IOException {
        int i;
        if (!this.f27351b.get()) {
            i = (int) j;
            if (((long) i) == j) {
            } else {
                StringBuilder sb = new StringBuilder("too large:");
                sb.append(j);
                throw new IOException(sb.toString());
            }
        } else {
            throw new IOException("released!");
        }
        return (long) this.f27350a.skipBytes(i);
    }

    /* renamed from: a */
    public final int mo18033a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f27351b.get()) {
            throw new IOException("released!");
        } else if (bArr == null || bArr.length == 0 || i2 <= 0 || i < 0 || i >= bArr.length) {
            return 0;
        } else {
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                this.f27350a.write(bArr, i, i2);
            }
            return i2;
        }
    }

    /* renamed from: b */
    public final int mo18039b(byte[] bArr, int i, int i2) throws IOException {
        int read;
        if (this.f27351b.get()) {
            throw new IOException("released!");
        } else if (bArr == null || i2 <= 0 || i < 0 || i >= bArr.length) {
            return 0;
        } else {
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                read = this.f27350a.read(bArr, i, i2);
            }
            return read;
        }
    }
}
