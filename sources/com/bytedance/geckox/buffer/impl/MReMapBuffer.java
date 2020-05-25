package com.bytedance.geckox.buffer.impl;

import com.bytedance.geckox.utils.C10152b;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

public class MReMapBuffer extends MMapBuffer {

    /* renamed from: d */
    private AtomicBoolean f27343d;

    /* renamed from: e */
    private long f27344e;

    private native int nMReMap(long j, long j2, long j3);

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ long mo18042c() throws IOException {
        return super.mo18042c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ int mo18043d() throws IOException {
        return super.mo18043d();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ File mo18045f() {
        return super.mo18045f();
    }

    /* renamed from: e */
    public final void mo18044e() {
        super.mo18044e();
        this.f27343d.set(true);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ long mo18040b() {
        return super.mo18040b();
    }

    /* renamed from: a */
    public final void mo18035a() throws IOException {
        super.mo18035a();
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.f27340c, "rw");
            try {
                randomAccessFile2.setLength(this.f27344e);
                C10152b.m20477a((Closeable) randomAccessFile2);
            } catch (Exception e) {
                RandomAccessFile randomAccessFile3 = randomAccessFile2;
                e = e;
                randomAccessFile = randomAccessFile3;
                try {
                    StringBuilder sb = new StringBuilder("reset swap length failed! path: ");
                    sb.append(this.f27340c.getAbsolutePath());
                    sb.append(" caused by: ");
                    sb.append(e.getMessage());
                    throw new IOException(sb.toString(), e);
                } catch (Throwable th) {
                    th = th;
                    C10152b.m20477a((Closeable) randomAccessFile);
                    throw th;
                }
            } catch (Throwable th2) {
                RandomAccessFile randomAccessFile4 = randomAccessFile2;
                th = th2;
                randomAccessFile = randomAccessFile4;
                C10152b.m20477a((Closeable) randomAccessFile);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            StringBuilder sb2 = new StringBuilder("reset swap length failed! path: ");
            sb2.append(this.f27340c.getAbsolutePath());
            sb2.append(" caused by: ");
            sb2.append(e.getMessage());
            throw new IOException(sb2.toString(), e);
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18041b(long j) throws IOException {
        super.mo18041b(j);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ long mo18034a(long j) throws IOException {
        return super.mo18034a(j);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ int mo18038b(byte[] bArr) throws IOException {
        return super.mo18038b(bArr);
    }

    /* renamed from: a */
    public final void mo18036a(int i) throws IOException {
        if (!this.f27343d.get()) {
            m20240b(1);
            super.mo18036a(i);
            return;
        }
        throw new IOException("released!");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0075, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m20240b(int r10) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            if (r10 > 0) goto L_0x0005
            monitor-exit(r9)
            return
        L_0x0005:
            long r0 = r9.mo18042c()     // Catch:{ all -> 0x0076 }
            long r5 = r9.f27338a     // Catch:{ all -> 0x0076 }
            long r2 = (long) r10     // Catch:{ all -> 0x0076 }
            long r0 = r0 + r2
            long r2 = r9.f27344e     // Catch:{ all -> 0x0076 }
            long r2 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x0076 }
            r9.f27344e = r2     // Catch:{ all -> 0x0076 }
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r10 <= 0) goto L_0x0074
            r2 = 4096(0x1000, double:2.0237E-320)
            long r0 = r0 / r2
            r7 = 1
            long r0 = r0 + r7
            long r0 = r0 * r2
            r10 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0049 }
            java.io.File r3 = r9.f27340c     // Catch:{ Exception -> 0x0049 }
            java.lang.String r4 = "rw"
            r2.<init>(r3, r4)     // Catch:{ Exception -> 0x0049 }
            r2.setLength(r0)     // Catch:{ Exception -> 0x0043, all -> 0x003f }
            com.bytedance.geckox.utils.C10152b.m20477a(r2)     // Catch:{ all -> 0x0076 }
            long r3 = r9.f27339b     // Catch:{ all -> 0x0076 }
            r2 = r9
            r7 = r0
            int r10 = r2.nMReMap(r3, r5, r7)     // Catch:{ all -> 0x0076 }
            long r2 = (long) r10     // Catch:{ all -> 0x0076 }
            r9.f27339b = r2     // Catch:{ all -> 0x0076 }
            r9.f27338a = r0     // Catch:{ all -> 0x0076 }
            goto L_0x0074
        L_0x003f:
            r10 = move-exception
            r0 = r10
            r10 = r2
            goto L_0x0070
        L_0x0043:
            r10 = move-exception
            r0 = r10
            r10 = r2
            goto L_0x004a
        L_0x0047:
            r0 = move-exception
            goto L_0x0070
        L_0x0049:
            r0 = move-exception
        L_0x004a:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0047 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0047 }
            java.lang.String r3 = "create remap swap failed! path: "
            r2.<init>(r3)     // Catch:{ all -> 0x0047 }
            java.io.File r3 = r9.f27340c     // Catch:{ all -> 0x0047 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0047 }
            r2.append(r3)     // Catch:{ all -> 0x0047 }
            java.lang.String r3 = " caused by: "
            r2.append(r3)     // Catch:{ all -> 0x0047 }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x0047 }
            r2.append(r3)     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0047 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0047 }
            throw r1     // Catch:{ all -> 0x0047 }
        L_0x0070:
            com.bytedance.geckox.utils.C10152b.m20477a(r10)     // Catch:{ all -> 0x0076 }
            throw r0     // Catch:{ all -> 0x0076 }
        L_0x0074:
            monitor-exit(r9)
            return
        L_0x0076:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.buffer.impl.MReMapBuffer.m20240b(int):void");
    }

    /* renamed from: a */
    public final void mo18037a(byte[] bArr) throws IOException {
        int i;
        if (!this.f27343d.get()) {
            if (bArr == null) {
                i = 0;
            } else {
                i = bArr.length;
            }
            m20240b(i);
            super.mo18037a(bArr);
            return;
        }
        throw new IOException("released!");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ int mo18039b(byte[] bArr, int i, int i2) throws IOException {
        return super.mo18039b(bArr, i, i2);
    }

    /* renamed from: a */
    public final int mo18033a(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f27343d.get()) {
            m20240b(i2);
            return super.mo18033a(bArr, i, i2);
        }
        throw new IOException("released!");
    }
}
