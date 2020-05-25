package com.p683ss.android.socialbase.downloader.downloader;

import android.os.SystemClock;
import com.p683ss.android.socialbase.downloader.impls.C19957d;
import com.p683ss.android.socialbase.downloader.impls.C19970k;
import com.p683ss.android.socialbase.downloader.impls.C19971l;
import com.p683ss.android.socialbase.downloader.model.C20048b;
import com.p683ss.android.socialbase.downloader.model.DownloadChunk;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.p1211a.C19776a;
import com.p683ss.android.socialbase.downloader.p1213c.C19799e;
import com.p683ss.android.socialbase.downloader.p1216f.C19926e;
import com.p683ss.android.socialbase.downloader.p1218g.C19932a;
import com.p683ss.android.socialbase.downloader.p1218g.C19935c;
import com.p683ss.android.socialbase.downloader.p1218g.C19937e;
import com.p683ss.android.socialbase.downloader.p1219h.C19938a;
import com.p683ss.android.socialbase.downloader.p1220i.C19946e;
import com.p683ss.android.socialbase.downloader.p1221j.C19991b;
import com.p683ss.android.socialbase.downloader.p1221j.C19994e;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.socialbase.downloader.downloader.e */
public final class C19889e {

    /* renamed from: g */
    private static String f54643g = "ResponseHandler";

    /* renamed from: a */
    public final C19926e f54644a;

    /* renamed from: b */
    public long f54645b;

    /* renamed from: c */
    public long f54646c;

    /* renamed from: d */
    public volatile long f54647d;

    /* renamed from: e */
    public volatile long f54648e;

    /* renamed from: f */
    public volatile long f54649f;

    /* renamed from: h */
    private final DownloadInfo f54650h;

    /* renamed from: i */
    private final DownloadChunk f54651i;

    /* renamed from: j */
    private C19901k f54652j = C19884b.m48616m();

    /* renamed from: k */
    private C19970k f54653k;

    /* renamed from: l */
    private C19909s f54654l;

    /* renamed from: m */
    private C20048b f54655m;

    /* renamed from: n */
    private volatile boolean f54656n;

    /* renamed from: o */
    private volatile boolean f54657o;

    /* renamed from: p */
    private final C19946e f54658p;

    /* renamed from: q */
    private final boolean f54659q;

    /* renamed from: r */
    private final C19938a f54660r;

    /* renamed from: s */
    private final C19776a f54661s;

    /* renamed from: t */
    private final boolean f54662t;

    /* renamed from: u */
    private final long f54663u;

    /* renamed from: v */
    private final long f54664v;

    /* renamed from: w */
    private boolean f54665w;

    /* renamed from: x */
    private volatile long f54666x;

    /* renamed from: a */
    private static boolean m48648a(long j, long j2) {
        return j > 65536 && j2 > 500;
    }

    /* renamed from: d */
    private boolean m48649d() {
        if (this.f54656n || this.f54657o) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo41492a() {
        if (!this.f54656n) {
            this.f54656n = true;
            m48650e();
        }
    }

    /* renamed from: e */
    private void m48650e() {
        if (this.f54644a != null) {
            ExecutorService h = C19884b.m48611h();
            if (h != null) {
                h.execute(new Runnable() {
                    public final void run() {
                        try {
                            C19889e.this.f54644a.mo13395d();
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
        }
    }

    /* renamed from: b */
    public final void mo41493b() {
        if (!this.f54657o) {
            synchronized (this.f54658p) {
                this.f54657o = true;
            }
            m48650e();
        }
    }

    /* renamed from: f */
    private void m48651f() {
        boolean z;
        boolean z2 = false;
        try {
            this.f54655m.mo42093a();
            z = true;
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            this.f54650h.updateRealDownloadTime(true);
            if (this.f54650h.getChunkCount() > 1) {
                z2 = true;
            }
            C19904n a = C19971l.m49132a(C19994e.m49366b());
            if (z2) {
                m48646a((C19901k) this.f54654l);
                if (a != null) {
                    a.mo41599c(this.f54650h);
                } else {
                    this.f54654l.mo41233a(this.f54650h.getId(), this.f54650h.getCurBytes());
                }
            } else if (a != null) {
                a.mo41599c(this.f54650h);
            } else {
                this.f54654l.mo41233a(this.f54651i.f55024a, this.f54645b);
            }
            this.f54649f = this.f54645b;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:141:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x023f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0240  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:138:0x01a1=Splitter:B:138:0x01a1, B:267:0x0314=Splitter:B:267:0x0314, B:226:0x02ae=Splitter:B:226:0x02ae} */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41494c() throws com.p683ss.android.socialbase.downloader.exception.BaseException {
        /*
            r17 = this;
            r1 = r17
            boolean r0 = r17.m48649d()
            if (r0 != 0) goto L_0x0361
            com.ss.android.socialbase.downloader.model.DownloadChunk r0 = r1.f54651i
            if (r0 != 0) goto L_0x000e
            goto L_0x0361
        L_0x000e:
            com.ss.android.socialbase.downloader.f.e r0 = r1.f54644a
            long r2 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49331a(r0)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0357
            com.ss.android.socialbase.downloader.model.DownloadChunk r0 = r1.f54651i
            long r6 = r0.f55025b
            r8 = 0
            r9 = 0
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f54650h     // Catch:{ BaseException -> 0x02ad, Throwable -> 0x01a0 }
            java.lang.String r0 = r0.getTempPath()     // Catch:{ BaseException -> 0x02ad, Throwable -> 0x01a0 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r1.f54650h     // Catch:{ BaseException -> 0x02ad, Throwable -> 0x01a0 }
            java.lang.String r10 = r10.getTempName()     // Catch:{ BaseException -> 0x02ad, Throwable -> 0x01a0 }
            com.ss.android.socialbase.downloader.h.a r11 = r1.f54660r     // Catch:{ BaseException -> 0x02ad, Throwable -> 0x01a0 }
            java.lang.String r12 = "flush_buffer_size_byte"
            r13 = -1
            int r11 = r11.mo41658a(r12, r13)     // Catch:{ BaseException -> 0x02ad, Throwable -> 0x01a0 }
            com.ss.android.socialbase.downloader.model.b r0 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49334a(r0, r10, r11)     // Catch:{ BaseException -> 0x02ad, Throwable -> 0x01a0 }
            r1.f54655m = r0     // Catch:{ BaseException -> 0x02ad, Throwable -> 0x01a0 }
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54655m     // Catch:{ IOException -> 0x0194 }
            long r10 = r1.f54645b     // Catch:{ IOException -> 0x0194 }
            java.io.RandomAccessFile r0 = r0.f55089b     // Catch:{ IOException -> 0x0194 }
            r0.seek(r10)     // Catch:{ IOException -> 0x0194 }
            com.ss.android.socialbase.downloader.f.e r0 = r1.f54644a     // Catch:{ BaseException -> 0x02ad, Throwable -> 0x01a0 }
            java.io.InputStream r0 = r0.mo13391a()     // Catch:{ BaseException -> 0x02ad, Throwable -> 0x01a0 }
            if (r0 == 0) goto L_0x0185
            com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r1.f54650h     // Catch:{ BaseException -> 0x02ad, Throwable -> 0x01a0 }
            r10.updateRealStartDownloadTime()     // Catch:{ BaseException -> 0x02ad, Throwable -> 0x01a0 }
            com.ss.android.socialbase.downloader.g.c r10 = r1.m48645a(r0)     // Catch:{ BaseException -> 0x02ad, Throwable -> 0x01a0 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f54650h     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            boolean r8 = r1.f54665w     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            r0.setIsRwConcurrent(r8)     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
        L_0x005c:
            boolean r0 = r17.m48649d()     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            if (r0 == 0) goto L_0x00a3
            r10.mo41655b()
            boolean r0 = r1.f54659q     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0081
            com.ss.android.socialbase.downloader.i.e r2 = r1.f54658p     // Catch:{ all -> 0x0098 }
            monitor-enter(r2)     // Catch:{ all -> 0x0098 }
            boolean r0 = r1.f54657o     // Catch:{ all -> 0x007e }
            if (r0 != 0) goto L_0x007c
            com.ss.android.socialbase.downloader.impls.k r0 = r1.f54653k     // Catch:{ all -> 0x007e }
            r1.m48646a(r0)     // Catch:{ all -> 0x007e }
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54655m     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x007c
            r17.m48651f()     // Catch:{ all -> 0x007e }
        L_0x007c:
            monitor-exit(r2)     // Catch:{ all -> 0x007e }
            goto L_0x008d
        L_0x007e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007e }
            throw r0     // Catch:{ all -> 0x0098 }
        L_0x0081:
            com.ss.android.socialbase.downloader.impls.k r0 = r1.f54653k     // Catch:{ all -> 0x0098 }
            r1.m48646a(r0)     // Catch:{ all -> 0x0098 }
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54655m     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x008d
            r17.m48651f()     // Catch:{ all -> 0x0098 }
        L_0x008d:
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54655m
            if (r0 == 0) goto L_0x0097
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54655m     // Catch:{ IOException -> 0x0096 }
            r0.mo42095b()     // Catch:{ IOException -> 0x0096 }
        L_0x0096:
            return
        L_0x0097:
            return
        L_0x0098:
            r0 = move-exception
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54655m
            if (r2 == 0) goto L_0x00a2
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54655m     // Catch:{ IOException -> 0x00a2 }
            r2.mo42095b()     // Catch:{ IOException -> 0x00a2 }
        L_0x00a2:
            throw r0
        L_0x00a3:
            com.ss.android.socialbase.downloader.g.b r0 = r10.mo41653a()     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            int r8 = r0.f54780b     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            if (r8 == r13) goto L_0x0136
            com.ss.android.socialbase.downloader.model.DownloadInfo r11 = r1.f54650h     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            boolean r11 = r11.isIgnoreDataVerify()     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            if (r11 != 0) goto L_0x00d9
            long r11 = r1.f54648e     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            long r14 = r1.f54645b     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            long r4 = r1.f54646c     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            r16 = 0
            long r14 = r14 - r4
            int r4 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x00d9
            long r4 = r1.f54648e     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            long r11 = r1.f54645b     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            long r14 = r1.f54646c     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            r16 = 0
            long r11 = r11 - r14
            long r14 = (long) r8     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            long r11 = r11 + r14
            int r14 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r14 >= 0) goto L_0x00d9
            long r4 = r1.f54648e     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            long r11 = r1.f54645b     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            long r14 = r1.f54646c     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            r8 = 0
            long r11 = r11 - r14
            long r4 = r4 - r11
            int r8 = (int) r4     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
        L_0x00d9:
            com.ss.android.socialbase.downloader.model.b r4 = r1.f54655m     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            byte[] r5 = r0.f54779a     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            java.io.BufferedOutputStream r4 = r4.f55088a     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            r4.write(r5, r9, r8)     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            r10.mo41654a(r0)     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            long r4 = r1.f54645b     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            long r11 = (long) r8     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            long r4 = r4 + r11
            r1.f54645b = r4     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            com.ss.android.socialbase.downloader.i.e r4 = r1.f54658p     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            monitor-enter(r4)     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            boolean r0 = r1.f54659q     // Catch:{ all -> 0x0133 }
            if (r0 == 0) goto L_0x00f6
            boolean r0 = r1.f54657o     // Catch:{ all -> 0x0133 }
            if (r0 != 0) goto L_0x0104
        L_0x00f6:
            com.ss.android.socialbase.downloader.i.e r0 = r1.f54658p     // Catch:{ all -> 0x0133 }
            boolean r0 = r0.mo41674a(r11)     // Catch:{ all -> 0x0133 }
            com.ss.android.socialbase.downloader.impls.k r5 = r1.f54653k     // Catch:{ all -> 0x0133 }
            r1.m48646a(r5)     // Catch:{ all -> 0x0133 }
            r1.m48647a(r0)     // Catch:{ all -> 0x0133 }
        L_0x0104:
            monitor-exit(r4)     // Catch:{ all -> 0x0133 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f54650h     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            boolean r0 = r0.isDownloadWithWifiValid()     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            if (r0 == 0) goto L_0x012d
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f54650h     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            boolean r0 = r0.isIgnoreDataVerify()     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            if (r0 != 0) goto L_0x0129
            long r4 = r1.f54648e     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            r11 = 0
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0129
            long r4 = r1.f54648e     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            long r11 = r1.f54645b     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            long r14 = r1.f54646c     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            r0 = 0
            long r11 = r11 - r14
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0136
        L_0x0129:
            r4 = 0
            goto L_0x005c
        L_0x012d:
            com.ss.android.socialbase.downloader.exception.DownloadOnlyWifiException r0 = new com.ss.android.socialbase.downloader.exception.DownloadOnlyWifiException     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            r0.<init>()     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
            throw r0     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
        L_0x0133:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0133 }
            throw r0     // Catch:{ BaseException -> 0x0181, Throwable -> 0x017e, all -> 0x017a }
        L_0x0136:
            r10.mo41655b()
            boolean r0 = r1.f54659q     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x0155
            com.ss.android.socialbase.downloader.i.e r4 = r1.f54658p     // Catch:{ all -> 0x016f }
            monitor-enter(r4)     // Catch:{ all -> 0x016f }
            boolean r0 = r1.f54657o     // Catch:{ all -> 0x0152 }
            if (r0 != 0) goto L_0x0150
            com.ss.android.socialbase.downloader.impls.k r0 = r1.f54653k     // Catch:{ all -> 0x0152 }
            r1.m48646a(r0)     // Catch:{ all -> 0x0152 }
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54655m     // Catch:{ all -> 0x0152 }
            if (r0 == 0) goto L_0x0150
            r17.m48651f()     // Catch:{ all -> 0x0152 }
        L_0x0150:
            monitor-exit(r4)     // Catch:{ all -> 0x0152 }
            goto L_0x0161
        L_0x0152:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0152 }
            throw r0     // Catch:{ all -> 0x016f }
        L_0x0155:
            com.ss.android.socialbase.downloader.impls.k r0 = r1.f54653k     // Catch:{ all -> 0x016f }
            r1.m48646a(r0)     // Catch:{ all -> 0x016f }
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54655m     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x0161
            r17.m48651f()     // Catch:{ all -> 0x016f }
        L_0x0161:
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54655m
            if (r0 == 0) goto L_0x0237
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54655m     // Catch:{ IOException -> 0x016c }
        L_0x0167:
            r0.mo42095b()     // Catch:{ IOException -> 0x016c }
            goto L_0x0237
        L_0x016c:
            goto L_0x0237
        L_0x016f:
            r0 = move-exception
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54655m
            if (r2 == 0) goto L_0x0179
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54655m     // Catch:{ IOException -> 0x0179 }
            r2.mo42095b()     // Catch:{ IOException -> 0x0179 }
        L_0x0179:
            throw r0
        L_0x017a:
            r0 = move-exception
            r8 = r10
            goto L_0x0315
        L_0x017e:
            r0 = move-exception
            r8 = r10
            goto L_0x01a1
        L_0x0181:
            r0 = move-exception
            r8 = r10
            goto L_0x02ae
        L_0x0185:
            com.ss.android.socialbase.downloader.exception.BaseException r0 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x02ad, Throwable -> 0x01a0 }
            r4 = 1042(0x412, float:1.46E-42)
            java.io.IOException r5 = new java.io.IOException     // Catch:{ BaseException -> 0x02ad, Throwable -> 0x01a0 }
            java.lang.String r10 = "inputStream is null"
            r5.<init>(r10)     // Catch:{ BaseException -> 0x02ad, Throwable -> 0x01a0 }
            r0.<init>(r4, r5)     // Catch:{ BaseException -> 0x02ad, Throwable -> 0x01a0 }
            throw r0     // Catch:{ BaseException -> 0x02ad, Throwable -> 0x01a0 }
        L_0x0194:
            r0 = move-exception
            com.ss.android.socialbase.downloader.exception.BaseException r4 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x02ad, Throwable -> 0x01a0 }
            r5 = 1054(0x41e, float:1.477E-42)
            r4.<init>(r5, r0)     // Catch:{ BaseException -> 0x02ad, Throwable -> 0x01a0 }
            throw r4     // Catch:{ BaseException -> 0x02ad, Throwable -> 0x01a0 }
        L_0x019d:
            r0 = move-exception
            goto L_0x0315
        L_0x01a0:
            r0 = move-exception
        L_0x01a1:
            java.lang.String r4 = f54643g     // Catch:{ all -> 0x019d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x019d }
            java.lang.String r10 = "handleResponse: e = "
            r5.<init>(r10)     // Catch:{ all -> 0x019d }
            r5.append(r0)     // Catch:{ all -> 0x019d }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x019d }
            com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48486b(r4, r5)     // Catch:{ all -> 0x019d }
            boolean r4 = r17.m48649d()     // Catch:{ all -> 0x019d }
            if (r4 == 0) goto L_0x01fd
            if (r8 == 0) goto L_0x01bf
            r8.mo41655b()
        L_0x01bf:
            boolean r0 = r1.f54659q     // Catch:{ all -> 0x01f2 }
            if (r0 == 0) goto L_0x01db
            com.ss.android.socialbase.downloader.i.e r2 = r1.f54658p     // Catch:{ all -> 0x01f2 }
            monitor-enter(r2)     // Catch:{ all -> 0x01f2 }
            boolean r0 = r1.f54657o     // Catch:{ all -> 0x01d8 }
            if (r0 != 0) goto L_0x01d6
            com.ss.android.socialbase.downloader.impls.k r0 = r1.f54653k     // Catch:{ all -> 0x01d8 }
            r1.m48646a(r0)     // Catch:{ all -> 0x01d8 }
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54655m     // Catch:{ all -> 0x01d8 }
            if (r0 == 0) goto L_0x01d6
            r17.m48651f()     // Catch:{ all -> 0x01d8 }
        L_0x01d6:
            monitor-exit(r2)     // Catch:{ all -> 0x01d8 }
            goto L_0x01e7
        L_0x01d8:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01d8 }
            throw r0     // Catch:{ all -> 0x01f2 }
        L_0x01db:
            com.ss.android.socialbase.downloader.impls.k r0 = r1.f54653k     // Catch:{ all -> 0x01f2 }
            r1.m48646a(r0)     // Catch:{ all -> 0x01f2 }
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54655m     // Catch:{ all -> 0x01f2 }
            if (r0 == 0) goto L_0x01e7
            r17.m48651f()     // Catch:{ all -> 0x01f2 }
        L_0x01e7:
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54655m
            if (r0 == 0) goto L_0x01f1
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54655m     // Catch:{ IOException -> 0x01f0 }
            r0.mo42095b()     // Catch:{ IOException -> 0x01f0 }
        L_0x01f0:
            return
        L_0x01f1:
            return
        L_0x01f2:
            r0 = move-exception
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54655m
            if (r2 == 0) goto L_0x01fc
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54655m     // Catch:{ IOException -> 0x01fc }
            r2.mo42095b()     // Catch:{ IOException -> 0x01fc }
        L_0x01fc:
            throw r0
        L_0x01fd:
            java.lang.String r4 = "DownloadResponseHandler"
            com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49346a(r0, r4)     // Catch:{ all -> 0x019d }
            if (r8 == 0) goto L_0x0207
            r8.mo41655b()
        L_0x0207:
            boolean r0 = r1.f54659q     // Catch:{ all -> 0x02a2 }
            if (r0 == 0) goto L_0x0223
            com.ss.android.socialbase.downloader.i.e r4 = r1.f54658p     // Catch:{ all -> 0x02a2 }
            monitor-enter(r4)     // Catch:{ all -> 0x02a2 }
            boolean r0 = r1.f54657o     // Catch:{ all -> 0x0220 }
            if (r0 != 0) goto L_0x021e
            com.ss.android.socialbase.downloader.impls.k r0 = r1.f54653k     // Catch:{ all -> 0x0220 }
            r1.m48646a(r0)     // Catch:{ all -> 0x0220 }
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54655m     // Catch:{ all -> 0x0220 }
            if (r0 == 0) goto L_0x021e
            r17.m48651f()     // Catch:{ all -> 0x0220 }
        L_0x021e:
            monitor-exit(r4)     // Catch:{ all -> 0x0220 }
            goto L_0x022f
        L_0x0220:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0220 }
            throw r0     // Catch:{ all -> 0x02a2 }
        L_0x0223:
            com.ss.android.socialbase.downloader.impls.k r0 = r1.f54653k     // Catch:{ all -> 0x02a2 }
            r1.m48646a(r0)     // Catch:{ all -> 0x02a2 }
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54655m     // Catch:{ all -> 0x02a2 }
            if (r0 == 0) goto L_0x022f
            r17.m48651f()     // Catch:{ all -> 0x02a2 }
        L_0x022f:
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54655m
            if (r0 == 0) goto L_0x0237
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54655m     // Catch:{ IOException -> 0x016c }
            goto L_0x0167
        L_0x0237:
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f54650h
            boolean r0 = r0.isIgnoreDataVerify()
            if (r0 == 0) goto L_0x0240
            return
        L_0x0240:
            long r4 = r1.f54645b
            long r10 = r1.f54646c
            long r4 = r4 - r10
            r10 = 0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x02a1
            long r12 = r1.f54648e
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x02a1
            long r10 = r1.f54648e
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0258
            goto L_0x02a1
        L_0x0258:
            com.ss.android.socialbase.downloader.exception.BaseException r0 = new com.ss.android.socialbase.downloader.exception.BaseException
            r8 = 1051(0x41b, float:1.473E-42)
            r10 = 7
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r10[r9] = r4
            r4 = 1
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r10[r4] = r2
            r2 = 2
            long r3 = r1.f54648e
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r10[r2] = r3
            r2 = 3
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r10[r2] = r3
            r2 = 4
            long r3 = r1.f54647d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r10[r2] = r3
            r2 = 5
            long r3 = r1.f54645b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r10[r2] = r3
            r2 = 6
            long r3 = r1.f54646c
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r10[r2] = r3
            java.lang.String r2 = "handle data length[%d] != content length[%d] downloadChunkContentLen[%d], range[%d, %d) , current offset[%d] , handle start from %d"
            java.lang.String r2 = com.C2240a.m6772a(r2, r10)
            r0.<init>(r8, r2)
            throw r0
        L_0x02a1:
            return
        L_0x02a2:
            r0 = move-exception
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54655m
            if (r2 == 0) goto L_0x02ac
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54655m     // Catch:{ IOException -> 0x02ac }
            r2.mo42095b()     // Catch:{ IOException -> 0x02ac }
        L_0x02ac:
            throw r0
        L_0x02ad:
            r0 = move-exception
        L_0x02ae:
            java.lang.String r2 = f54643g     // Catch:{ all -> 0x019d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x019d }
            java.lang.String r4 = "handleResponse: BaseException e = "
            r3.<init>(r4)     // Catch:{ all -> 0x019d }
            r3.append(r0)     // Catch:{ all -> 0x019d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x019d }
            com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48486b(r2, r3)     // Catch:{ all -> 0x019d }
            com.ss.android.socialbase.downloader.h.a r2 = r1.f54660r     // Catch:{ all -> 0x019d }
            java.lang.String r3 = "ignore_base_ex_on_stop_status"
            boolean r2 = r2.mo41660a(r3)     // Catch:{ all -> 0x019d }
            if (r2 == 0) goto L_0x0314
            boolean r2 = r17.m48649d()     // Catch:{ all -> 0x019d }
            if (r2 == 0) goto L_0x0314
            if (r8 == 0) goto L_0x02d6
            r8.mo41655b()
        L_0x02d6:
            boolean r0 = r1.f54659q     // Catch:{ all -> 0x0309 }
            if (r0 == 0) goto L_0x02f2
            com.ss.android.socialbase.downloader.i.e r2 = r1.f54658p     // Catch:{ all -> 0x0309 }
            monitor-enter(r2)     // Catch:{ all -> 0x0309 }
            boolean r0 = r1.f54657o     // Catch:{ all -> 0x02ef }
            if (r0 != 0) goto L_0x02ed
            com.ss.android.socialbase.downloader.impls.k r0 = r1.f54653k     // Catch:{ all -> 0x02ef }
            r1.m48646a(r0)     // Catch:{ all -> 0x02ef }
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54655m     // Catch:{ all -> 0x02ef }
            if (r0 == 0) goto L_0x02ed
            r17.m48651f()     // Catch:{ all -> 0x02ef }
        L_0x02ed:
            monitor-exit(r2)     // Catch:{ all -> 0x02ef }
            goto L_0x02fe
        L_0x02ef:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02ef }
            throw r0     // Catch:{ all -> 0x0309 }
        L_0x02f2:
            com.ss.android.socialbase.downloader.impls.k r0 = r1.f54653k     // Catch:{ all -> 0x0309 }
            r1.m48646a(r0)     // Catch:{ all -> 0x0309 }
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54655m     // Catch:{ all -> 0x0309 }
            if (r0 == 0) goto L_0x02fe
            r17.m48651f()     // Catch:{ all -> 0x0309 }
        L_0x02fe:
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54655m
            if (r0 == 0) goto L_0x0308
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54655m     // Catch:{ IOException -> 0x0307 }
            r0.mo42095b()     // Catch:{ IOException -> 0x0307 }
        L_0x0307:
            return
        L_0x0308:
            return
        L_0x0309:
            r0 = move-exception
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54655m
            if (r2 == 0) goto L_0x0313
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54655m     // Catch:{ IOException -> 0x0313 }
            r2.mo42095b()     // Catch:{ IOException -> 0x0313 }
        L_0x0313:
            throw r0
        L_0x0314:
            throw r0     // Catch:{ all -> 0x019d }
        L_0x0315:
            if (r8 == 0) goto L_0x031a
            r8.mo41655b()
        L_0x031a:
            boolean r2 = r1.f54659q     // Catch:{ all -> 0x034c }
            if (r2 == 0) goto L_0x0336
            com.ss.android.socialbase.downloader.i.e r2 = r1.f54658p     // Catch:{ all -> 0x034c }
            monitor-enter(r2)     // Catch:{ all -> 0x034c }
            boolean r3 = r1.f54657o     // Catch:{ all -> 0x0333 }
            if (r3 != 0) goto L_0x0331
            com.ss.android.socialbase.downloader.impls.k r3 = r1.f54653k     // Catch:{ all -> 0x0333 }
            r1.m48646a(r3)     // Catch:{ all -> 0x0333 }
            com.ss.android.socialbase.downloader.model.b r3 = r1.f54655m     // Catch:{ all -> 0x0333 }
            if (r3 == 0) goto L_0x0331
            r17.m48651f()     // Catch:{ all -> 0x0333 }
        L_0x0331:
            monitor-exit(r2)     // Catch:{ all -> 0x0333 }
            goto L_0x0342
        L_0x0333:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0333 }
            throw r0     // Catch:{ all -> 0x034c }
        L_0x0336:
            com.ss.android.socialbase.downloader.impls.k r2 = r1.f54653k     // Catch:{ all -> 0x034c }
            r1.m48646a(r2)     // Catch:{ all -> 0x034c }
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54655m     // Catch:{ all -> 0x034c }
            if (r2 == 0) goto L_0x0342
            r17.m48651f()     // Catch:{ all -> 0x034c }
        L_0x0342:
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54655m
            if (r2 == 0) goto L_0x034b
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54655m     // Catch:{ IOException -> 0x034b }
            r2.mo42095b()     // Catch:{ IOException -> 0x034b }
        L_0x034b:
            throw r0
        L_0x034c:
            r0 = move-exception
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54655m
            if (r2 == 0) goto L_0x0356
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54655m     // Catch:{ IOException -> 0x0356 }
            r2.mo42095b()     // Catch:{ IOException -> 0x0356 }
        L_0x0356:
            throw r0
        L_0x0357:
            com.ss.android.socialbase.downloader.exception.DownloadRetryNeedlessException r0 = new com.ss.android.socialbase.downloader.exception.DownloadRetryNeedlessException
            r2 = 1004(0x3ec, float:1.407E-42)
            java.lang.String r3 = "the content-length is 0"
            r0.<init>(r2, r3)
            throw r0
        L_0x0361:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.downloader.C19889e.mo41494c():void");
    }

    /* renamed from: a */
    private C19935c m48645a(InputStream inputStream) {
        int t = C19884b.m48623t();
        if (this.f54660r.mo41658a("rw_concurrent", 0) == 1 && this.f54650h.getChunkCount() == 1 && this.f54650h.getTotalBytes() > 20971520) {
            try {
                C19932a aVar = new C19932a(inputStream, t, this.f54660r.mo41658a("rw_concurrent_max_buffer_count", 4));
                this.f54665w = true;
                return aVar;
            } catch (Throwable unused) {
            }
        }
        C19937e eVar = new C19937e(inputStream, t);
        this.f54665w = false;
        return eVar;
    }

    /* renamed from: a */
    private void m48647a(boolean z) {
        long j;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j2 = uptimeMillis - this.f54666x;
        if (this.f54662t) {
            if (this.f54661s.mo41212b()) {
                j = this.f54663u;
            } else {
                j = this.f54664v;
            }
            if (j2 <= j) {
                return;
            }
        } else {
            long j3 = this.f54645b - this.f54649f;
            if (!z && !m48648a(j3, j2)) {
                return;
            }
        }
        m48651f();
        this.f54666x = uptimeMillis;
    }

    /* renamed from: a */
    private void m48646a(C19901k kVar) {
        DownloadChunk downloadChunk;
        DownloadChunk downloadChunk2;
        C19901k kVar2 = kVar;
        if (kVar2 != null) {
            C19904n nVar = null;
            boolean z = kVar2 instanceof C19799e;
            if (z) {
                nVar = C19971l.m49132a(C19994e.m49366b());
                if (nVar == null) {
                    return;
                }
            }
            C19904n nVar2 = nVar;
            if (this.f54651i.mo41792b()) {
                downloadChunk = this.f54651i.mo41793c();
            } else {
                downloadChunk = this.f54651i;
            }
            DownloadChunk downloadChunk3 = downloadChunk;
            if (downloadChunk3 != null) {
                downloadChunk3.mo41787a(this.f54645b);
                if (!z || nVar2 == null) {
                    downloadChunk2 = downloadChunk3;
                    kVar.mo41238a(downloadChunk3.f55024a, downloadChunk3.f55028e, downloadChunk3.mo41785a(), this.f54645b);
                } else {
                    nVar2.mo41573a(downloadChunk3.f55024a, downloadChunk3.f55028e, downloadChunk3.mo41785a(), this.f54645b);
                    downloadChunk2 = downloadChunk3;
                }
                if (downloadChunk2.mo41796e()) {
                    boolean z2 = false;
                    if (downloadChunk2.mo41797f()) {
                        long g = downloadChunk2.mo41798g();
                        if (g > this.f54645b) {
                            if (!z || nVar2 == null) {
                                kVar2.mo41239a(downloadChunk2.f55024a, downloadChunk2.mo41785a(), g);
                            } else {
                                nVar2.mo41574a(downloadChunk2.f55024a, downloadChunk2.mo41785a(), g);
                            }
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        if (!z || nVar2 == null) {
                            kVar2.mo41239a(downloadChunk2.f55024a, downloadChunk2.mo41785a(), this.f54645b);
                        } else {
                            nVar2.mo41574a(downloadChunk2.f55024a, downloadChunk2.mo41785a(), this.f54645b);
                        }
                    }
                }
            } else if (this.f54651i.mo41792b()) {
                if (!z || nVar2 == null) {
                    kVar2.mo41239a(this.f54651i.f55024a, this.f54651i.f55028e, this.f54645b);
                } else {
                    nVar2.mo41574a(this.f54651i.f55024a, this.f54651i.f55028e, this.f54645b);
                }
            }
        }
    }

    public C19889e(DownloadInfo downloadInfo, C19926e eVar, DownloadChunk downloadChunk, C19946e eVar2) {
        this.f54650h = downloadInfo;
        if (this.f54652j instanceof C19957d) {
            C19957d dVar = (C19957d) this.f54652j;
            this.f54653k = dVar.f54877a;
            this.f54654l = dVar.f54878b;
        }
        this.f54644a = eVar;
        this.f54651i = downloadChunk;
        this.f54658p = eVar2;
        this.f54645b = downloadChunk.mo41800i();
        this.f54646c = this.f54645b;
        if (downloadChunk.mo41792b()) {
            this.f54648e = downloadChunk.f55027d;
        } else {
            this.f54648e = downloadChunk.mo41791b(false);
        }
        this.f54647d = downloadChunk.f55026c;
        this.f54661s = C19776a.m48304a();
        this.f54660r = C19938a.m48929a(downloadInfo.getId());
        boolean z = true;
        if (this.f54660r.mo41658a("sync_strategy", 0) != 1) {
            z = false;
        }
        this.f54662t = z;
        if (this.f54662t) {
            long a = (long) this.f54660r.mo41658a("sync_interval_ms_fg", 5000);
            long a2 = (long) this.f54660r.mo41658a("sync_interval_ms_bg", 1000);
            if (a < 500) {
                a = 500;
            }
            this.f54663u = a;
            if (a2 < 500) {
                a2 = 500;
            }
            this.f54664v = a2;
        } else {
            this.f54663u = 0;
            this.f54664v = 0;
        }
        this.f54659q = C19991b.m49327a(65536);
    }
}
