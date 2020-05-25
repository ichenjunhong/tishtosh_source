package com.p683ss.android.socialbase.downloader.p1220i;

import android.os.Process;
import com.p683ss.android.socialbase.downloader.downloader.C19884b;
import com.p683ss.android.socialbase.downloader.downloader.C19889e;
import com.p683ss.android.socialbase.downloader.downloader.C19901k;
import com.p683ss.android.socialbase.downloader.model.DownloadChunk;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import com.p683ss.android.socialbase.downloader.p1216f.C19926e;

/* renamed from: com.ss.android.socialbase.downloader.i.b */
public class C19940b implements Runnable {

    /* renamed from: b */
    private static final String f54799b = "b";

    /* renamed from: a */
    public C19889e f54800a;

    /* renamed from: c */
    private DownloadChunk f54801c;

    /* renamed from: d */
    private DownloadChunk f54802d;

    /* renamed from: e */
    private final DownloadTask f54803e;

    /* renamed from: f */
    private DownloadInfo f54804f;

    /* renamed from: g */
    private final C19946e f54805g;

    /* renamed from: h */
    private C19926e f54806h;

    /* renamed from: i */
    private C19901k f54807i;

    /* renamed from: j */
    private volatile boolean f54808j;

    /* renamed from: k */
    private volatile boolean f54809k;

    /* renamed from: l */
    private boolean f54810l;

    /* renamed from: c */
    private void m48944c() {
        if (this.f54806h != null) {
            this.f54806h.mo13395d();
            this.f54806h = null;
        }
    }

    /* renamed from: d */
    private boolean m48945d() {
        if (this.f54808j || this.f54809k) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo41664a() {
        this.f54808j = true;
        if (this.f54800a != null) {
            this.f54800a.mo41492a();
        }
    }

    /* renamed from: b */
    public final void mo41665b() {
        this.f54809k = true;
        if (this.f54800a != null) {
            this.f54800a.mo41493b();
        }
    }

    /* JADX INFO: finally extract failed */
    public void run() {
        Process.setThreadPriority(10);
        this.f54801c = this.f54802d;
        while (true) {
            try {
                this.f54801c.mo41788a(this);
                if (m48943a(this.f54801c)) {
                    this.f54801c.mo41790a(false);
                    if (m48945d()) {
                        break;
                    }
                    this.f54801c = this.f54805g.mo41669a(this.f54801c.f55028e);
                    if (m48945d() || this.f54801c == null) {
                        break;
                    }
                    try {
                        Thread.sleep(50);
                    } catch (Throwable unused) {
                    }
                } else {
                    this.f54801c.mo41790a(false);
                    break;
                }
            } catch (Throwable th) {
                if (this.f54801c != null) {
                    this.f54801c.mo41790a(false);
                }
                m48944c();
                this.f54805g.mo41673a(this);
                throw th;
            }
        }
        if (this.f54801c != null) {
            this.f54801c.mo41790a(false);
        }
        m48944c();
        this.f54805g.mo41673a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0132, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01a5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01a7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x01c9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x01ca, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x01cb, code lost:
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x01d3, code lost:
        m48944c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x01d7, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x01dc, code lost:
        if (com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49369b(r0) != false) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x01de, code lost:
        r1.f54805g.mo41671a(r0, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x01e3, code lost:
        m48944c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x01e6, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x01ed, code lost:
        if (r1.f54805g.mo41675a(r0) != false) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x01f3, code lost:
        if (com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49352a(r0) != false) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x01f5, code lost:
        r1.f54805g.mo41671a(r0, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x01fb, code lost:
        m48944c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x01fe, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x01ff, code lost:
        if (r19 != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0203, code lost:
        if (r1.f54800a != null) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x020b, code lost:
        if (com.p683ss.android.socialbase.downloader.p1221j.C19991b.m49327a(32) != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x020d, code lost:
        r3 = r1.f54800a.f54645b - r1.f54800a.f54649f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0219, code lost:
        if (r3 > 0) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x021b, code lost:
        m48942a(r2, r1.f54800a.f54649f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0225, code lost:
        if (r3 < 0) goto L_0x0227;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0228, code lost:
        r17 = r1.f54800a.f54645b - r9;
        m48942a(r2, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0233, code lost:
        r1.f54805g.mo41677b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0238, code lost:
        m48944c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x023b, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x023c, code lost:
        r3 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0244, code lost:
        if (com.p683ss.android.socialbase.downloader.p1221j.C19991b.m49327a(16) == false) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0246, code lost:
        r0 = r1.f54805g.mo41668a(r2, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x024d, code lost:
        r0 = r1.f54805g.mo41667a(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0255, code lost:
        if (r0 != com.p683ss.android.socialbase.downloader.exception.C19913a.RETURN) goto L_0x025b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0257, code lost:
        m48944c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x025a, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:?, code lost:
        r2.f55033j = r12;
        m48944c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0275, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x027c, code lost:
        if (r1.f54804f.getChunkCount() > 1) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x027e, code lost:
        r2 = r1.f54804f;
        r4 = r0.getErrorCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x02a6, code lost:
        if (r4 == 1020) goto L_0x02a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x02ab, code lost:
        if (r4 == 1049) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x02c3, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x02c4, code lost:
        if (r3 != false) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x02c6, code lost:
        r1.f54805g.mo41679c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x02cb, code lost:
        m48944c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x02ce, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        r1.f54805g.mo41677b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x02d4, code lost:
        m48944c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x02d7, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r3.f55028e == r2.f55028e) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x012a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49346a(r0, "ChunkRunnableGetResponseCode");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0131, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:135:0x01a4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x00ec */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a5 A[ExcHandler: Throwable (th java.lang.Throwable), PHI: r12 
      PHI: (r12v6 boolean) = (r12v7 boolean), (r12v7 boolean), (r12v7 boolean), (r12v10 boolean), (r12v10 boolean), (r12v10 boolean), (r12v10 boolean), (r12v10 boolean), (r12v10 boolean) binds: [B:125:0x018b, B:135:0x01a4, B:136:?, B:79:0x00f8, B:115:0x0171, B:109:0x0163, B:110:?, B:84:0x0100, B:97:0x012d] A[DONT_GENERATE, DONT_INLINE], Splitter:B:109:0x0163] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01a7 A[ExcHandler: BaseException (e com.ss.android.socialbase.downloader.exception.BaseException), PHI: r12 
      PHI: (r12v5 boolean) = (r12v7 boolean), (r12v7 boolean), (r12v7 boolean), (r12v7 boolean), (r12v10 boolean), (r12v10 boolean), (r12v10 boolean), (r12v10 boolean) binds: [B:125:0x018b, B:135:0x01a4, B:136:?, B:130:0x0193, B:79:0x00f8, B:115:0x0171, B:84:0x0100, B:97:0x012d] A[DONT_GENERATE, DONT_INLINE], Splitter:B:79:0x00f8] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x01c9 A[ExcHandler: BaseException (e com.ss.android.socialbase.downloader.exception.BaseException), Splitter:B:19:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x01d8 A[SYNTHETIC, Splitter:B:163:0x01d8] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0246 A[Catch:{ BaseException -> 0x01bf, all -> 0x01a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x024d A[Catch:{ BaseException -> 0x01bf, all -> 0x01a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x025b A[SYNTHETIC, Splitter:B:204:0x025b] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0113 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0257 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x01d3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x00f2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0112 A[Catch:{ BaseException -> 0x0131, Throwable -> 0x012a, BaseException -> 0x01a7, Throwable -> 0x01a5 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m48943a(com.p683ss.android.socialbase.downloader.model.DownloadChunk r21) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
        L_0x0004:
            r0 = 0
            boolean r3 = r21.mo41792b()
            if (r3 == 0) goto L_0x001e
            boolean r3 = r21.mo41794d()
            if (r3 == 0) goto L_0x001e
            com.ss.android.socialbase.downloader.model.DownloadChunk r3 = r21.mo41793c()
            if (r3 == 0) goto L_0x001e
            int r4 = r3.f55028e
            int r5 = r2.f55028e
            if (r4 != r5) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r3 = r0
        L_0x001f:
            r4 = 1
            if (r3 == 0) goto L_0x0029
            boolean r0 = r3.mo41797f()
            if (r0 == 0) goto L_0x0029
            return r4
        L_0x0029:
            long r5 = r21.mo41800i()
            long r7 = r2.f55026c
            long r9 = r21.mo41800i()
            if (r3 == 0) goto L_0x003f
            long r9 = r3.mo41800i()
            long r5 = r3.mo41800i()
            long r7 = r3.f55026c
        L_0x003f:
            r17 = 0
            r15 = 0
            boolean r0 = r20.m48945d()     // Catch:{ BaseException -> 0x01c9, Throwable -> 0x01ac }
            if (r0 == 0) goto L_0x004c
            r20.m48944c()
            return r15
        L_0x004c:
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f54804f     // Catch:{ BaseException -> 0x01c9, Throwable -> 0x01ac }
            java.lang.String r0 = r0.getConnectionUrl()     // Catch:{ BaseException -> 0x01c9, Throwable -> 0x01ac }
            com.ss.android.socialbase.downloader.f.e r11 = r1.f54806h     // Catch:{ BaseException -> 0x01c9, Throwable -> 0x01ac }
            if (r11 == 0) goto L_0x0058
            r11 = 1
            goto L_0x0059
        L_0x0058:
            r11 = 0
        L_0x0059:
            r1.f54810l = r11     // Catch:{ BaseException -> 0x01c9, Throwable -> 0x01ac }
            boolean r11 = r1.f54810l     // Catch:{ BaseException -> 0x01c9, Throwable -> 0x01ac }
            r2.f55033j = r11     // Catch:{ BaseException -> 0x01c9, Throwable -> 0x01ac }
            r13 = 300(0x12c, float:4.2E-43)
            r14 = 200(0xc8, float:2.8E-43)
            boolean r11 = r1.f54810l     // Catch:{ BaseException -> 0x0183, Throwable -> 0x00cb, all -> 0x00c3 }
            if (r11 != 0) goto L_0x00a5
            com.ss.android.socialbase.downloader.model.DownloadInfo r11 = r1.f54804f     // Catch:{ BaseException -> 0x0183, Throwable -> 0x00cb, all -> 0x00c3 }
            java.util.List r11 = r11.getExtraHeaders()     // Catch:{ BaseException -> 0x0183, Throwable -> 0x00cb, all -> 0x00c3 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r12 = r1.f54804f     // Catch:{ BaseException -> 0x0183, Throwable -> 0x00cb, all -> 0x00c3 }
            java.lang.String r12 = r12.geteTag()     // Catch:{ BaseException -> 0x0183, Throwable -> 0x00cb, all -> 0x00c3 }
            r4 = 200(0xc8, float:2.8E-43)
            r13 = r5
            r15 = r7
            java.util.List r11 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49340a(r11, r12, r13, r15)     // Catch:{ BaseException -> 0x00a2, Throwable -> 0x00a0, all -> 0x009e }
            com.ss.android.socialbase.downloader.model.HttpHeader r12 = new com.ss.android.socialbase.downloader.model.HttpHeader     // Catch:{ BaseException -> 0x00a2, Throwable -> 0x00a0, all -> 0x009e }
            java.lang.String r13 = "Chunk-Index"
            int r14 = r2.f55028e     // Catch:{ BaseException -> 0x00a2, Throwable -> 0x00a0, all -> 0x009e }
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ BaseException -> 0x00a2, Throwable -> 0x00a0, all -> 0x009e }
            r12.<init>(r13, r14)     // Catch:{ BaseException -> 0x00a2, Throwable -> 0x00a0, all -> 0x009e }
            r11.add(r12)     // Catch:{ BaseException -> 0x00a2, Throwable -> 0x00a0, all -> 0x009e }
            com.ss.android.socialbase.downloader.model.DownloadInfo r12 = r1.f54804f     // Catch:{ BaseException -> 0x00a2, Throwable -> 0x00a0, all -> 0x009e }
            boolean r12 = r12.isNeedDefaultHttpServiceBackUp()     // Catch:{ BaseException -> 0x00a2, Throwable -> 0x00a0, all -> 0x009e }
            com.ss.android.socialbase.downloader.model.DownloadInfo r13 = r1.f54804f     // Catch:{ BaseException -> 0x00a2, Throwable -> 0x00a0, all -> 0x009e }
            int r13 = r13.getMaxBytes()     // Catch:{ BaseException -> 0x00a2, Throwable -> 0x00a0, all -> 0x009e }
            com.ss.android.socialbase.downloader.f.e r0 = com.p683ss.android.socialbase.downloader.downloader.C19884b.m48599a(r12, r13, r0, r11)     // Catch:{ BaseException -> 0x00a2, Throwable -> 0x00a0, all -> 0x009e }
            r1.f54806h = r0     // Catch:{ BaseException -> 0x00a2, Throwable -> 0x00a0, all -> 0x009e }
            goto L_0x00a7
        L_0x009e:
            r0 = move-exception
            goto L_0x00c6
        L_0x00a0:
            r0 = move-exception
            goto L_0x00ce
        L_0x00a2:
            r0 = move-exception
            goto L_0x0186
        L_0x00a5:
            r4 = 200(0xc8, float:2.8E-43)
        L_0x00a7:
            com.ss.android.socialbase.downloader.f.e r0 = r1.f54806h     // Catch:{ BaseException -> 0x01c9, Throwable -> 0x01ac }
            if (r0 == 0) goto L_0x00ec
            com.ss.android.socialbase.downloader.i.e r0 = r1.f54805g     // Catch:{ BaseException -> 0x01c9, Throwable -> 0x01ac }
            if (r0 == 0) goto L_0x00ec
            com.ss.android.socialbase.downloader.f.e r0 = r1.f54806h     // Catch:{ Throwable -> 0x00ec, BaseException -> 0x01c9 }
            int r0 = r0.mo13393b()     // Catch:{ Throwable -> 0x00ec, BaseException -> 0x01c9 }
            if (r0 < r4) goto L_0x00bb
            r11 = 300(0x12c, float:4.2E-43)
            if (r0 < r11) goto L_0x00ec
        L_0x00bb:
            com.ss.android.socialbase.downloader.i.e r0 = r1.f54805g     // Catch:{ Throwable -> 0x00ec, BaseException -> 0x01c9 }
            com.ss.android.socialbase.downloader.f.e r11 = r1.f54806h     // Catch:{ Throwable -> 0x00ec, BaseException -> 0x01c9 }
        L_0x00bf:
            r0.mo41672a(r11)     // Catch:{ Throwable -> 0x00ec, BaseException -> 0x01c9 }
            goto L_0x00ec
        L_0x00c3:
            r0 = move-exception
            r4 = 200(0xc8, float:2.8E-43)
        L_0x00c6:
            r11 = 300(0x12c, float:4.2E-43)
        L_0x00c8:
            r12 = 0
            goto L_0x018b
        L_0x00cb:
            r0 = move-exception
            r4 = 200(0xc8, float:2.8E-43)
        L_0x00ce:
            r11 = 300(0x12c, float:4.2E-43)
            java.lang.String r12 = "ChunkRunnableConnection"
            com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49346a(r0, r12)     // Catch:{ all -> 0x0180 }
            com.ss.android.socialbase.downloader.f.e r0 = r1.f54806h     // Catch:{ BaseException -> 0x01c9, Throwable -> 0x01ac }
            if (r0 == 0) goto L_0x00ec
            com.ss.android.socialbase.downloader.i.e r0 = r1.f54805g     // Catch:{ BaseException -> 0x01c9, Throwable -> 0x01ac }
            if (r0 == 0) goto L_0x00ec
            com.ss.android.socialbase.downloader.f.e r0 = r1.f54806h     // Catch:{ Throwable -> 0x00ec, BaseException -> 0x01c9 }
            int r0 = r0.mo13393b()     // Catch:{ Throwable -> 0x00ec, BaseException -> 0x01c9 }
            if (r0 < r4) goto L_0x00e7
            if (r0 < r11) goto L_0x00ec
        L_0x00e7:
            com.ss.android.socialbase.downloader.i.e r0 = r1.f54805g     // Catch:{ Throwable -> 0x00ec, BaseException -> 0x01c9 }
            com.ss.android.socialbase.downloader.f.e r11 = r1.f54806h     // Catch:{ Throwable -> 0x00ec, BaseException -> 0x01c9 }
            goto L_0x00bf
        L_0x00ec:
            boolean r0 = r20.m48945d()     // Catch:{ BaseException -> 0x01c9, Throwable -> 0x01ac }
            if (r0 == 0) goto L_0x00f7
            r20.m48944c()
            r12 = 0
            return r12
        L_0x00f7:
            r12 = 0
            com.ss.android.socialbase.downloader.f.e r0 = r1.f54806h     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
            if (r0 == 0) goto L_0x0171
            boolean r0 = r1.f54810l     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
            if (r0 != 0) goto L_0x0133
            com.ss.android.socialbase.downloader.f.e r0 = r1.f54806h     // Catch:{ BaseException -> 0x0131, Throwable -> 0x012a }
            int r0 = r0.mo13393b()     // Catch:{ BaseException -> 0x0131, Throwable -> 0x012a }
            r11 = 206(0xce, float:2.89E-43)
            if (r0 == r11) goto L_0x010f
            if (r0 != r4) goto L_0x010d
            goto L_0x010f
        L_0x010d:
            r4 = 0
            goto L_0x0110
        L_0x010f:
            r4 = 1
        L_0x0110:
            if (r4 == 0) goto L_0x0113
            goto L_0x0133
        L_0x0113:
            com.ss.android.socialbase.downloader.exception.BaseException r4 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x0131, Throwable -> 0x012a }
            r11 = 1002(0x3ea, float:1.404E-42)
            java.lang.String r13 = "Http response error , code is : %s "
            r14 = 1
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ BaseException -> 0x0131, Throwable -> 0x012a }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ BaseException -> 0x0131, Throwable -> 0x012a }
            r15[r12] = r0     // Catch:{ BaseException -> 0x0131, Throwable -> 0x012a }
            java.lang.String r0 = com.C2240a.m6772a(r13, r15)     // Catch:{ BaseException -> 0x0131, Throwable -> 0x012a }
            r4.<init>(r11, r0)     // Catch:{ BaseException -> 0x0131, Throwable -> 0x012a }
            throw r4     // Catch:{ BaseException -> 0x0131, Throwable -> 0x012a }
        L_0x012a:
            r0 = move-exception
            java.lang.String r4 = "ChunkRunnableGetResponseCode"
            com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49346a(r0, r4)     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
            goto L_0x0133
        L_0x0131:
            r0 = move-exception
            throw r0     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
        L_0x0133:
            com.ss.android.socialbase.downloader.downloader.e r0 = new com.ss.android.socialbase.downloader.downloader.e     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f54804f     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
            com.ss.android.socialbase.downloader.f.e r11 = r1.f54806h     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
            com.ss.android.socialbase.downloader.i.e r13 = r1.f54805g     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
            r0.<init>(r4, r11, r2, r13)     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
            r1.f54800a = r0     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
            if (r3 == 0) goto L_0x0163
            long r13 = r3.mo41791b(r12)     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
            int r0 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0153
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0153
            long r7 = r7 - r5
            r4 = 1
            long r13 = r7 + r4
        L_0x0153:
            com.ss.android.socialbase.downloader.downloader.e r0 = r1.f54800a     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
            long r4 = r3.mo41800i()     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
            long r6 = r3.f55026c     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
            r0.f54645b = r4     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
            r0.f54646c = r4     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
            r0.f54647d = r6     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
            r0.f54648e = r13     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
        L_0x0163:
            com.ss.android.socialbase.downloader.downloader.e r0 = r1.f54800a     // Catch:{ BaseException -> 0x016d, Throwable -> 0x01a5 }
            r0.mo41494c()     // Catch:{ BaseException -> 0x016d, Throwable -> 0x01a5 }
            r20.m48944c()
            r2 = 1
            return r2
        L_0x016d:
            r0 = move-exception
            r19 = 1
            goto L_0x01cd
        L_0x0171:
            com.ss.android.socialbase.downloader.exception.BaseException r0 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
            r3 = 1022(0x3fe, float:1.432E-42)
            java.io.IOException r4 = new java.io.IOException     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
            java.lang.String r5 = "download can't continue, chunk connection is null"
            r4.<init>(r5)     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
            r0.<init>(r3, r4)     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
            throw r0     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
        L_0x0180:
            r0 = move-exception
            goto L_0x00c8
        L_0x0183:
            r0 = move-exception
            r4 = 200(0xc8, float:2.8E-43)
        L_0x0186:
            r11 = 300(0x12c, float:4.2E-43)
            r12 = 0
            throw r0     // Catch:{ all -> 0x018a }
        L_0x018a:
            r0 = move-exception
        L_0x018b:
            com.ss.android.socialbase.downloader.f.e r3 = r1.f54806h     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
            if (r3 == 0) goto L_0x01a4
            com.ss.android.socialbase.downloader.i.e r3 = r1.f54805g     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
            if (r3 == 0) goto L_0x01a4
            com.ss.android.socialbase.downloader.f.e r3 = r1.f54806h     // Catch:{ Throwable -> 0x01a4, BaseException -> 0x01a7 }
            int r3 = r3.mo13393b()     // Catch:{ Throwable -> 0x01a4, BaseException -> 0x01a7 }
            if (r3 < r4) goto L_0x019d
            if (r3 < r11) goto L_0x01a4
        L_0x019d:
            com.ss.android.socialbase.downloader.i.e r3 = r1.f54805g     // Catch:{ Throwable -> 0x01a4, BaseException -> 0x01a7 }
            com.ss.android.socialbase.downloader.f.e r4 = r1.f54806h     // Catch:{ Throwable -> 0x01a4, BaseException -> 0x01a7 }
            r3.mo41672a(r4)     // Catch:{ Throwable -> 0x01a4, BaseException -> 0x01a7 }
        L_0x01a4:
            throw r0     // Catch:{ BaseException -> 0x01a7, Throwable -> 0x01a5 }
        L_0x01a5:
            r0 = move-exception
            goto L_0x01ae
        L_0x01a7:
            r0 = move-exception
            goto L_0x01cb
        L_0x01a9:
            r0 = move-exception
            goto L_0x02d8
        L_0x01ac:
            r0 = move-exception
            r12 = 0
        L_0x01ae:
            boolean r2 = r20.m48945d()     // Catch:{ all -> 0x01a9 }
            if (r2 == 0) goto L_0x01b9
            r20.m48944c()
            r2 = 1
            return r2
        L_0x01b9:
            java.lang.String r2 = "downloadChunkInner"
            com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49346a(r0, r2)     // Catch:{ BaseException -> 0x01bf }
            goto L_0x01c5
        L_0x01bf:
            r0 = move-exception
            com.ss.android.socialbase.downloader.i.e r2 = r1.f54805g     // Catch:{ all -> 0x01a9 }
            r2.mo41677b(r0)     // Catch:{ all -> 0x01a9 }
        L_0x01c5:
            r20.m48944c()
            return r12
        L_0x01c9:
            r0 = move-exception
            r12 = 0
        L_0x01cb:
            r19 = 0
        L_0x01cd:
            boolean r3 = r20.m48945d()     // Catch:{ all -> 0x01a9 }
            if (r3 == 0) goto L_0x01d8
            r20.m48944c()
            r2 = 1
            return r2
        L_0x01d8:
            boolean r3 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49369b(r0)     // Catch:{ all -> 0x01a9 }
            if (r3 == 0) goto L_0x01e7
            com.ss.android.socialbase.downloader.i.e r2 = r1.f54805g     // Catch:{ all -> 0x01a9 }
            r2.mo41671a(r0, r12)     // Catch:{ all -> 0x01a9 }
            r20.m48944c()
            return r12
        L_0x01e7:
            com.ss.android.socialbase.downloader.i.e r3 = r1.f54805g     // Catch:{ all -> 0x01a9 }
            boolean r3 = r3.mo41675a(r0)     // Catch:{ all -> 0x01a9 }
            if (r3 == 0) goto L_0x0265
            boolean r3 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49352a(r0)     // Catch:{ all -> 0x01a9 }
            if (r3 == 0) goto L_0x01ff
            com.ss.android.socialbase.downloader.i.e r2 = r1.f54805g     // Catch:{ all -> 0x01a9 }
            r3 = 1
            r2.mo41671a(r0, r3)     // Catch:{ all -> 0x01a9 }
            r20.m48944c()
            return r12
        L_0x01ff:
            if (r19 == 0) goto L_0x023c
            com.ss.android.socialbase.downloader.downloader.e r3 = r1.f54800a     // Catch:{ all -> 0x01a9 }
            if (r3 == 0) goto L_0x0233
            r3 = 32
            boolean r3 = com.p683ss.android.socialbase.downloader.p1221j.C19991b.m49327a(r3)     // Catch:{ all -> 0x01a9 }
            if (r3 == 0) goto L_0x0228
            com.ss.android.socialbase.downloader.downloader.e r3 = r1.f54800a     // Catch:{ all -> 0x01a9 }
            long r3 = r3.f54645b     // Catch:{ all -> 0x01a9 }
            com.ss.android.socialbase.downloader.downloader.e r5 = r1.f54800a     // Catch:{ all -> 0x01a9 }
            long r5 = r5.f54649f     // Catch:{ all -> 0x01a9 }
            r7 = 0
            long r3 = r3 - r5
            int r5 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r5 <= 0) goto L_0x0223
            com.ss.android.socialbase.downloader.downloader.e r5 = r1.f54800a     // Catch:{ all -> 0x01a9 }
            long r5 = r5.f54649f     // Catch:{ all -> 0x01a9 }
            r1.m48942a(r2, r5)     // Catch:{ all -> 0x01a9 }
            goto L_0x023e
        L_0x0223:
            int r5 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r5 >= 0) goto L_0x023e
            goto L_0x023c
        L_0x0228:
            com.ss.android.socialbase.downloader.downloader.e r3 = r1.f54800a     // Catch:{ all -> 0x01a9 }
            long r3 = r3.f54645b     // Catch:{ all -> 0x01a9 }
            r5 = 0
            long r17 = r3 - r9
            r1.m48942a(r2, r9)     // Catch:{ all -> 0x01a9 }
            goto L_0x023c
        L_0x0233:
            com.ss.android.socialbase.downloader.i.e r2 = r1.f54805g     // Catch:{ all -> 0x01a9 }
            r2.mo41677b(r0)     // Catch:{ all -> 0x01a9 }
            r20.m48944c()
            return r12
        L_0x023c:
            r3 = r17
        L_0x023e:
            r5 = 16
            boolean r5 = com.p683ss.android.socialbase.downloader.p1221j.C19991b.m49327a(r5)     // Catch:{ all -> 0x01a9 }
            if (r5 == 0) goto L_0x024d
            com.ss.android.socialbase.downloader.i.e r5 = r1.f54805g     // Catch:{ all -> 0x01a9 }
            com.ss.android.socialbase.downloader.exception.a r0 = r5.mo41668a(r2, r0, r3)     // Catch:{ all -> 0x01a9 }
            goto L_0x0253
        L_0x024d:
            com.ss.android.socialbase.downloader.i.e r5 = r1.f54805g     // Catch:{ all -> 0x01a9 }
            com.ss.android.socialbase.downloader.exception.a r0 = r5.mo41667a(r0, r3)     // Catch:{ all -> 0x01a9 }
        L_0x0253:
            com.ss.android.socialbase.downloader.exception.a r3 = com.p683ss.android.socialbase.downloader.exception.C19913a.RETURN     // Catch:{ all -> 0x01a9 }
            if (r0 != r3) goto L_0x025b
            r20.m48944c()
            return r12
        L_0x025b:
            r2.f55033j = r12     // Catch:{ all -> 0x01a9 }
            r20.m48944c()     // Catch:{ all -> 0x01a9 }
            r20.m48944c()
            goto L_0x0004
        L_0x0265:
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f54804f     // Catch:{ all -> 0x01a9 }
            boolean r2 = r2.isNeedChunkDowngradeRetry()     // Catch:{ all -> 0x01a9 }
            if (r2 == 0) goto L_0x02cf
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f54804f     // Catch:{ all -> 0x01a9 }
            boolean r2 = r2.isChunkDowngradeRetryUsed()     // Catch:{ all -> 0x01a9 }
            if (r2 != 0) goto L_0x02cf
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f54804f     // Catch:{ all -> 0x01a9 }
            int r2 = r2.getChunkCount()     // Catch:{ all -> 0x01a9 }
            r3 = 1
            if (r2 <= r3) goto L_0x02cf
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f54804f     // Catch:{ all -> 0x01a9 }
            int r4 = r0.getErrorCode()     // Catch:{ all -> 0x01a9 }
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r4 == r5) goto L_0x02c4
            r5 = 1032(0x408, float:1.446E-42)
            if (r4 == r5) goto L_0x02c4
            r5 = 1033(0x409, float:1.448E-42)
            if (r4 == r5) goto L_0x02c4
            r5 = 1034(0x40a, float:1.449E-42)
            if (r4 == r5) goto L_0x02c4
            r5 = 1008(0x3f0, float:1.413E-42)
            if (r4 == r5) goto L_0x02c4
            r5 = 1026(0x402, float:1.438E-42)
            if (r4 == r5) goto L_0x02c4
            r5 = 1027(0x403, float:1.439E-42)
            if (r4 == r5) goto L_0x02c4
            r5 = 1044(0x414, float:1.463E-42)
            if (r4 == r5) goto L_0x02c4
            r5 = 1020(0x3fc, float:1.43E-42)
            if (r4 != r5) goto L_0x02a9
            goto L_0x02c4
        L_0x02a9:
            r5 = 1049(0x419, float:1.47E-42)
            if (r4 == r5) goto L_0x02c3
            r5 = 1055(0x41f, float:1.478E-42)
            if (r4 == r5) goto L_0x02c3
            r5 = 1006(0x3ee, float:1.41E-42)
            if (r4 == r5) goto L_0x02c3
            if (r2 == 0) goto L_0x02c3
            long r4 = r2.getCurBytes()     // Catch:{ all -> 0x01a9 }
            r6 = 8388608(0x800000, double:4.144523E-317)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x02c3
            goto L_0x02c4
        L_0x02c3:
            r3 = 0
        L_0x02c4:
            if (r3 == 0) goto L_0x02cf
            com.ss.android.socialbase.downloader.i.e r2 = r1.f54805g     // Catch:{ all -> 0x01a9 }
            r2.mo41679c(r0)     // Catch:{ all -> 0x01a9 }
            r20.m48944c()
            return r12
        L_0x02cf:
            com.ss.android.socialbase.downloader.i.e r2 = r1.f54805g     // Catch:{ all -> 0x01a9 }
            r2.mo41677b(r0)     // Catch:{ all -> 0x01a9 }
            r20.m48944c()
            return r12
        L_0x02d8:
            r20.m48944c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.p1220i.C19940b.m48943a(com.ss.android.socialbase.downloader.model.DownloadChunk):boolean");
    }

    /* renamed from: a */
    private void m48942a(DownloadChunk downloadChunk, long j) {
        DownloadChunk downloadChunk2;
        if (downloadChunk.mo41792b()) {
            downloadChunk2 = downloadChunk.mo41793c();
        } else {
            downloadChunk2 = downloadChunk;
        }
        if (downloadChunk2 != null) {
            if (downloadChunk2.mo41796e()) {
                this.f54807i.mo41239a(downloadChunk2.f55024a, downloadChunk2.mo41785a(), j);
            }
            downloadChunk2.mo41787a(j);
            this.f54807i.mo41238a(downloadChunk2.f55024a, downloadChunk2.f55028e, downloadChunk2.mo41785a(), j);
            return;
        }
        if (downloadChunk.mo41792b()) {
            this.f54807i.mo41239a(downloadChunk.f55024a, downloadChunk.f55028e, j);
        }
    }

    public C19940b(DownloadChunk downloadChunk, DownloadTask downloadTask, C19946e eVar) {
        this.f54802d = downloadChunk;
        this.f54803e = downloadTask;
        if (downloadTask != null) {
            this.f54804f = downloadTask.getDownloadInfo();
        }
        this.f54805g = eVar;
        this.f54807i = C19884b.m48616m();
        this.f54802d.mo41788a(this);
    }

    public C19940b(DownloadChunk downloadChunk, DownloadTask downloadTask, C19926e eVar, C19946e eVar2) {
        this(downloadChunk, downloadTask, eVar2);
        this.f54806h = eVar;
    }
}
