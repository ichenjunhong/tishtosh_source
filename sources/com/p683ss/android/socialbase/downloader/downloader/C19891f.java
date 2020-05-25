package com.p683ss.android.socialbase.downloader.downloader;

import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import com.p683ss.android.socialbase.downloader.depend.C19865t;
import com.p683ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.p683ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.impls.C19950a;
import com.p683ss.android.socialbase.downloader.impls.C19983r;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import com.p683ss.android.socialbase.downloader.p1212b.C19780a;
import com.p683ss.android.socialbase.downloader.p1212b.C19787h;
import com.p683ss.android.socialbase.downloader.p1212b.C19788i;
import com.p683ss.android.socialbase.downloader.p1219h.C19938a;
import com.p683ss.android.socialbase.downloader.p1221j.C19994e;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.ss.android.socialbase.downloader.downloader.f */
public class C19891f {

    /* renamed from: a */
    public static final String f54668a = "f";

    /* renamed from: b */
    public final boolean f54669b;

    /* renamed from: c */
    public DownloadInfo f54670c;

    /* renamed from: d */
    public final C19901k f54671d;

    /* renamed from: e */
    public volatile long f54672e;

    /* renamed from: f */
    public final AtomicLong f54673f = new AtomicLong();

    /* renamed from: g */
    public boolean f54674g = false;

    /* renamed from: h */
    public int f54675h;

    /* renamed from: i */
    public long f54676i;

    /* renamed from: j */
    private final Handler f54677j;

    /* renamed from: k */
    private DownloadTask f54678k;

    /* renamed from: l */
    private SparseArray<IDownloadListener> f54679l;

    /* renamed from: m */
    private SparseArray<IDownloadListener> f54680m;

    /* renamed from: n */
    private SparseArray<IDownloadListener> f54681n;

    /* renamed from: o */
    private boolean f54682o;

    /* renamed from: p */
    private IDownloadDepend f54683p;

    /* renamed from: q */
    private C19865t f54684q;

    /* renamed from: b */
    public final void mo41503b() {
        mo41497a(-4, (BaseException) null);
    }

    /* renamed from: a */
    public final void mo41496a() {
        if (!this.f54670c.canSkipStatusHandler()) {
            this.f54670c.setStatus(1);
            ExecutorService h = C19884b.m48611h();
            if (h != null) {
                h.execute(new Runnable() {
                    public final void run() {
                        C19891f.this.f54671d.mo41265i(C19891f.this.f54670c.getId());
                        C19891f.this.mo41497a(1, (BaseException) null);
                    }
                });
            }
        }
    }

    /* renamed from: c */
    public final void mo41504c() {
        this.f54670c.setStatus(-2);
        try {
            this.f54671d.mo41256d(this.f54670c.getId(), this.f54670c.getCurBytes());
        } catch (SQLiteException unused) {
        }
        mo41497a(-2, (BaseException) null);
    }

    /* renamed from: f */
    public final void mo41507f() {
        this.f54670c.setStatus(8);
        this.f54670c.setAsyncHandleStatus(C19780a.ASYNC_HANDLE_WAITING);
        C19950a q = C19884b.m48620q();
        if (q != null) {
            q.mo41702a(this.f54670c.getId(), 8);
        }
    }

    /* renamed from: g */
    private void m48655g() {
        if (this.f54678k != null) {
            this.f54670c = this.f54678k.getDownloadInfo();
            this.f54679l = this.f54678k.getDownloadListeners(C19787h.MAIN);
            this.f54681n = this.f54678k.getDownloadListeners(C19787h.NOTIFICATION);
            this.f54680m = this.f54678k.getDownloadListeners(C19787h.SUB);
            this.f54683p = this.f54678k.getDepend();
            this.f54684q = this.f54678k.getMonitorDepend();
        }
    }

    /* renamed from: e */
    public final void mo41506e() {
        try {
            C19788i checkMd5Valid = this.f54670c.checkMd5Valid();
            if (checkMd5Valid != C19788i.VALID) {
                String str = "";
                if (checkMd5Valid == C19788i.INVALID_FILE_NO_EXIST) {
                    str = "md5 invalid because of file not exist";
                } else if (checkMd5Valid == C19788i.INVALID_FILE_MD5_EMPTY) {
                    str = "md5 invalid because of file md5 is empty";
                } else if (checkMd5Valid == C19788i.INVALID_MD5_NOT_EQUALS) {
                    str = "md5 invalid because of file md5 is not equals to task md5";
                }
                mo41500a(new BaseException(1034, str));
                C19994e.m49343a(this.f54670c);
                return;
            }
            this.f54670c.setFirstSuccess(false);
            mo41497a(-3, (BaseException) null);
            this.f54671d.mo41252c(this.f54670c.getId(), this.f54670c.getTotalBytes());
            this.f54671d.mo41258d(this.f54670c.getId());
        } catch (Throwable th) {
            mo41500a(new BaseException(1008, C19994e.m49362b(th, "onCompleted")));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0232 A[Catch:{ Throwable -> 0x02f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0258 A[Catch:{ Throwable -> 0x02f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02a8 A[SYNTHETIC, Splitter:B:76:0x02a8] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41505d() {
        /*
            r17 = this;
            r1 = r17
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f54670c
            r2 = 0
            r0.setFirstDownload(r2)
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f54670c
            boolean r0 = r0.isIgnoreDataVerify()
            if (r0 != 0) goto L_0x0044
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f54670c
            long r3 = r0.getCurBytes()
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f54670c
            long r5 = r0.getTotalBytes()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0044
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f54670c
            r0.getErrorBytesLog()
            com.ss.android.socialbase.downloader.exception.DownloadRetryNeedlessException r0 = new com.ss.android.socialbase.downloader.exception.DownloadRetryNeedlessException
            r2 = 1027(0x403, float:1.439E-42)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "current bytes is not equals to total bytes, bytes changed with process : "
            r3.<init>(r4)
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f54670c
            com.ss.android.socialbase.downloader.b.b r4 = r4.getByteInvalidRetryStatus()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r2, r3)
            r1.mo41500a(r0)
            return
        L_0x0044:
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f54670c
            long r3 = r0.getCurBytes()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0074
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f54670c
            r0.getErrorBytesLog()
            com.ss.android.socialbase.downloader.exception.DownloadRetryNeedlessException r0 = new com.ss.android.socialbase.downloader.exception.DownloadRetryNeedlessException
            r2 = 1026(0x402, float:1.438E-42)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "curBytes is 0, bytes changed with process : "
            r3.<init>(r4)
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f54670c
            com.ss.android.socialbase.downloader.b.b r4 = r4.getByteInvalidRetryStatus()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r2, r3)
            r1.mo41500a(r0)
            return
        L_0x0074:
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f54670c
            boolean r0 = r0.isIgnoreDataVerify()
            if (r0 != 0) goto L_0x00aa
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f54670c
            long r3 = r0.getTotalBytes()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x00aa
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f54670c
            r0.getErrorBytesLog()
            com.ss.android.socialbase.downloader.exception.DownloadRetryNeedlessException r0 = new com.ss.android.socialbase.downloader.exception.DownloadRetryNeedlessException
            r2 = 1044(0x414, float:1.463E-42)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "TotalBytes is 0, bytes changed with process : "
            r3.<init>(r4)
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f54670c
            com.ss.android.socialbase.downloader.b.b r4 = r4.getByteInvalidRetryStatus()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r2, r3)
            r1.mo41500a(r0)
            return
        L_0x00aa:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r1.f54670c
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            java.lang.String r3 = " onCompleted start save file as target name"
            r0.append(r3)
            com.ss.android.socialbase.downloader.depend.t r0 = r1.f54684q
            com.ss.android.socialbase.downloader.model.DownloadTask r3 = r1.f54678k
            if (r3 == 0) goto L_0x00c9
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r1.f54678k
            com.ss.android.socialbase.downloader.depend.t r0 = r0.getMonitorDepend()
        L_0x00c9:
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r1.f54670c
            boolean r3 = r3.isNewSaveTempFileEnable()
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 0
            r11 = 1
            if (r3 == 0) goto L_0x0318
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r1.f54670c
            com.ss.android.socialbase.downloader.downloader.f$2 r12 = new com.ss.android.socialbase.downloader.downloader.f$2
            r12.<init>()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "saveFileAsTargetName targetName is "
            r13.<init>(r14)
            java.lang.String r14 = r3.getTargetFilePath()
            r13.append(r14)
            android.util.SparseArray<java.lang.Boolean> r13 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.f54955a     // Catch:{ Throwable -> 0x02f8 }
            monitor-enter(r13)     // Catch:{ Throwable -> 0x02f8 }
            android.util.SparseArray<java.lang.Boolean> r14 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.f54955a     // Catch:{ all -> 0x02f5 }
            int r15 = r3.getId()     // Catch:{ all -> 0x02f5 }
            java.lang.Object r14 = r14.get(r15)     // Catch:{ all -> 0x02f5 }
            java.lang.Boolean r15 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x02f5 }
            if (r14 != r15) goto L_0x00ff
            r14 = 1
            goto L_0x0100
        L_0x00ff:
            r14 = 0
        L_0x0100:
            if (r14 == 0) goto L_0x0124
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.depend.aa>> r0 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.f54956b     // Catch:{ all -> 0x02f5 }
            int r2 = r3.getId()     // Catch:{ all -> 0x02f5 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x02f5 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x02f5 }
            if (r0 != 0) goto L_0x011e
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x02f5 }
            r0.<init>()     // Catch:{ all -> 0x02f5 }
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.depend.aa>> r2 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.f54956b     // Catch:{ all -> 0x02f5 }
            int r3 = r3.getId()     // Catch:{ all -> 0x02f5 }
            r2.put(r3, r0)     // Catch:{ all -> 0x02f5 }
        L_0x011e:
            r0.add(r12)     // Catch:{ all -> 0x02f5 }
            monitor-exit(r13)     // Catch:{ all -> 0x02f5 }
            goto L_0x044d
        L_0x0124:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x02f5 }
            java.lang.String r15 = "saveTempFileStatusMap put id:"
            r14.<init>(r15)     // Catch:{ all -> 0x02f5 }
            int r15 = r3.getId()     // Catch:{ all -> 0x02f5 }
            r14.append(r15)     // Catch:{ all -> 0x02f5 }
            android.util.SparseArray<java.lang.Boolean> r14 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.f54955a     // Catch:{ all -> 0x02f5 }
            int r15 = r3.getId()     // Catch:{ all -> 0x02f5 }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x02f5 }
            r14.put(r15, r4)     // Catch:{ all -> 0x02f5 }
            monitor-exit(r13)     // Catch:{ all -> 0x02f5 }
            java.io.File r4 = new java.io.File     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r13 = r3.getTempPath()     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r14 = r3.getTempName()     // Catch:{ Throwable -> 0x02f8 }
            r4.<init>(r13, r14)     // Catch:{ Throwable -> 0x02f8 }
            java.io.File r13 = new java.io.File     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r14 = r3.getSavePath()     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r15 = r3.getName()     // Catch:{ Throwable -> 0x02f8 }
            r13.<init>(r14, r15)     // Catch:{ Throwable -> 0x02f8 }
            boolean r14 = r13.exists()     // Catch:{ Throwable -> 0x02f8 }
            if (r14 == 0) goto L_0x01f6
            com.ss.android.socialbase.downloader.b.i r14 = r3.checkMd5Valid()     // Catch:{ Throwable -> 0x02f8 }
            com.ss.android.socialbase.downloader.b.i r10 = com.p683ss.android.socialbase.downloader.p1212b.C19788i.VALID     // Catch:{ Throwable -> 0x02f8 }
            if (r14 != r10) goto L_0x0172
            r12.mo41311a()     // Catch:{ Throwable -> 0x02f8 }
            int r10 = r3.getId()     // Catch:{ Throwable -> 0x02f8 }
            com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49341a(r10, r11, r9)     // Catch:{ Throwable -> 0x02f8 }
            goto L_0x022d
        L_0x0172:
            boolean r10 = r4.exists()     // Catch:{ Throwable -> 0x02f8 }
            if (r10 != 0) goto L_0x01b1
            com.ss.android.socialbase.downloader.exception.BaseException r10 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r9 = "Can't save the temp downloaded file(%s/%s) to the target file(%s/%s) because tempFile is not exist and target file is exist but md5 verify invalid :%s"
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r16 = r3.getTempPath()     // Catch:{ Throwable -> 0x02f8 }
            r15[r2] = r16     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r16 = r3.getTempName()     // Catch:{ Throwable -> 0x02f8 }
            r15[r11] = r16     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r16 = r3.getSavePath()     // Catch:{ Throwable -> 0x02f8 }
            r15[r8] = r16     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r16 = r3.getName()     // Catch:{ Throwable -> 0x02f8 }
            r15[r7] = r16     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r16 = r14.name()     // Catch:{ Throwable -> 0x02f8 }
            r15[r6] = r16     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r9 = com.C2240a.m6772a(r9, r15)     // Catch:{ Throwable -> 0x02f8 }
            r15 = 1005(0x3ed, float:1.408E-42)
            r10.<init>(r15, r9)     // Catch:{ Throwable -> 0x02f8 }
            r12.mo41312a(r10)     // Catch:{ Throwable -> 0x02f8 }
            int r9 = r3.getId()     // Catch:{ Throwable -> 0x02f8 }
            com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49341a(r9, r2, r10)     // Catch:{ Throwable -> 0x02f8 }
            r9 = 0
            goto L_0x01b2
        L_0x01b1:
            r9 = 1
        L_0x01b2:
            boolean r10 = r13.delete()     // Catch:{ Throwable -> 0x02f8 }
            if (r10 != 0) goto L_0x0230
            if (r9 != 0) goto L_0x01cd
            if (r0 == 0) goto L_0x0230
            com.ss.android.socialbase.downloader.exception.BaseException r10 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r14 = "tempFile is not exist and target file is exist but md5 verify invalid, delete target file failed"
            r15 = 1038(0x40e, float:1.455E-42)
            r10.<init>(r15, r14)     // Catch:{ Throwable -> 0x02f8 }
            int r14 = r3.getStatus()     // Catch:{ Throwable -> 0x02f8 }
            com.p683ss.android.socialbase.downloader.p1215e.C19911a.m48889a(r0, r3, r10, r14)     // Catch:{ Throwable -> 0x02f8 }
            goto L_0x0230
        L_0x01cd:
            com.ss.android.socialbase.downloader.exception.BaseException r9 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ Throwable -> 0x02f8 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r15 = "delete targetPath file existed with md5 check invalid status:"
            r10.<init>(r15)     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r14 = r14.name()     // Catch:{ Throwable -> 0x02f8 }
            r10.append(r14)     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r14 = " failed!"
            r10.append(r14)     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r10 = r10.toString()     // Catch:{ Throwable -> 0x02f8 }
            r14 = 1037(0x40d, float:1.453E-42)
            r9.<init>(r14, r10)     // Catch:{ Throwable -> 0x02f8 }
            r12.mo41312a(r9)     // Catch:{ Throwable -> 0x02f8 }
            int r10 = r3.getId()     // Catch:{ Throwable -> 0x02f8 }
            com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49341a(r10, r2, r9)     // Catch:{ Throwable -> 0x02f8 }
            goto L_0x022d
        L_0x01f6:
            boolean r9 = r4.exists()     // Catch:{ Throwable -> 0x02f8 }
            if (r9 != 0) goto L_0x022f
            com.ss.android.socialbase.downloader.exception.BaseException r9 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r10 = "Can't save the temp downloaded file(%s/%s) to the target file(%s/%s) because tempFile is not exist"
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r15 = r3.getTempPath()     // Catch:{ Throwable -> 0x02f8 }
            r14[r2] = r15     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r15 = r3.getTempName()     // Catch:{ Throwable -> 0x02f8 }
            r14[r11] = r15     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r15 = r3.getSavePath()     // Catch:{ Throwable -> 0x02f8 }
            r14[r8] = r15     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r15 = r3.getName()     // Catch:{ Throwable -> 0x02f8 }
            r14[r7] = r15     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r10 = com.C2240a.m6772a(r10, r14)     // Catch:{ Throwable -> 0x02f8 }
            r14 = 1005(0x3ed, float:1.408E-42)
            r9.<init>(r14, r10)     // Catch:{ Throwable -> 0x02f8 }
            r12.mo41312a(r9)     // Catch:{ Throwable -> 0x02f8 }
            int r10 = r3.getId()     // Catch:{ Throwable -> 0x02f8 }
            com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49341a(r10, r2, r9)     // Catch:{ Throwable -> 0x02f8 }
        L_0x022d:
            r9 = 0
            goto L_0x0230
        L_0x022f:
            r9 = 1
        L_0x0230:
            if (r9 == 0) goto L_0x044d
            java.lang.String r9 = r3.getMd5()     // Catch:{ Throwable -> 0x02f8 }
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x02f8 }
            if (r10 != 0) goto L_0x0252
            java.lang.String r10 = com.p683ss.android.socialbase.downloader.p1221j.C19990a.m49325a(r4)     // Catch:{ Throwable -> 0x02f8 }
            boolean r14 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Throwable -> 0x02f8 }
            if (r14 == 0) goto L_0x0249
            com.ss.android.socialbase.downloader.b.i r9 = com.p683ss.android.socialbase.downloader.p1212b.C19788i.INVALID_FILE_MD5_EMPTY     // Catch:{ Throwable -> 0x02f8 }
            goto L_0x0254
        L_0x0249:
            boolean r9 = r10.equals(r9)     // Catch:{ Throwable -> 0x02f8 }
            if (r9 != 0) goto L_0x0252
            com.ss.android.socialbase.downloader.b.i r9 = com.p683ss.android.socialbase.downloader.p1212b.C19788i.INVALID_MD5_NOT_EQUALS     // Catch:{ Throwable -> 0x02f8 }
            goto L_0x0254
        L_0x0252:
            com.ss.android.socialbase.downloader.b.i r9 = com.p683ss.android.socialbase.downloader.p1212b.C19788i.VALID     // Catch:{ Throwable -> 0x02f8 }
        L_0x0254:
            com.ss.android.socialbase.downloader.b.i r10 = com.p683ss.android.socialbase.downloader.p1212b.C19788i.VALID     // Catch:{ Throwable -> 0x02f8 }
            if (r9 == r10) goto L_0x02a8
            com.ss.android.socialbase.downloader.exception.BaseException r10 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r13 = "Can't save the temp downloaded file(%s/%s) to the target file(%s/%s) because tempFile md5 is invalid : %s"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r14 = r3.getTempPath()     // Catch:{ Throwable -> 0x02f8 }
            r5[r2] = r14     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r14 = r3.getTempName()     // Catch:{ Throwable -> 0x02f8 }
            r5[r11] = r14     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r11 = r3.getSavePath()     // Catch:{ Throwable -> 0x02f8 }
            r5[r8] = r11     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r8 = r3.getName()     // Catch:{ Throwable -> 0x02f8 }
            r5[r7] = r8     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r7 = r9.name()     // Catch:{ Throwable -> 0x02f8 }
            r5[r6] = r7     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r5 = com.C2240a.m6772a(r13, r5)     // Catch:{ Throwable -> 0x02f8 }
            r6 = 1038(0x40e, float:1.455E-42)
            r10.<init>(r6, r5)     // Catch:{ Throwable -> 0x02f8 }
            r12.mo41312a(r10)     // Catch:{ Throwable -> 0x02f8 }
            int r5 = r3.getId()     // Catch:{ Throwable -> 0x02f8 }
            com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49341a(r5, r2, r10)     // Catch:{ Throwable -> 0x02f8 }
            boolean r2 = r4.delete()     // Catch:{ Throwable -> 0x02f8 }
            if (r2 != 0) goto L_0x0317
            if (r0 == 0) goto L_0x0317
            com.ss.android.socialbase.downloader.exception.BaseException r2 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r4 = "tempFile md5 is invalid ,but delete failed"
            r5 = 1038(0x40e, float:1.455E-42)
            r2.<init>(r5, r4)     // Catch:{ Throwable -> 0x02f8 }
            int r4 = r3.getStatus()     // Catch:{ Throwable -> 0x02f8 }
            com.p683ss.android.socialbase.downloader.p1215e.C19911a.m48889a(r0, r3, r2, r4)     // Catch:{ Throwable -> 0x02f8 }
            goto L_0x0317
        L_0x02a8:
            boolean r0 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49354a(r4, r13)     // Catch:{ BaseException -> 0x02af }
            r0 = r0 ^ r11
            r4 = 0
            goto L_0x02b2
        L_0x02af:
            r0 = move-exception
            r4 = r0
            r0 = 0
        L_0x02b2:
            if (r0 == 0) goto L_0x02e8
            if (r4 != 0) goto L_0x02dd
            com.ss.android.socialbase.downloader.exception.BaseException r4 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r0 = "Can't save the temp downloaded file(%s/%s) to the target file(%s/%s)"
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r6 = r3.getTempPath()     // Catch:{ Throwable -> 0x02f8 }
            r5[r2] = r6     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r6 = r3.getTempName()     // Catch:{ Throwable -> 0x02f8 }
            r5[r11] = r6     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r6 = r3.getSavePath()     // Catch:{ Throwable -> 0x02f8 }
            r5[r8] = r6     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r6 = r3.getName()     // Catch:{ Throwable -> 0x02f8 }
            r5[r7] = r6     // Catch:{ Throwable -> 0x02f8 }
            java.lang.String r0 = com.C2240a.m6772a(r0, r5)     // Catch:{ Throwable -> 0x02f8 }
            r5 = 1038(0x40e, float:1.455E-42)
            r4.<init>(r5, r0)     // Catch:{ Throwable -> 0x02f8 }
        L_0x02dd:
            r12.mo41312a(r4)     // Catch:{ Throwable -> 0x02f8 }
            int r0 = r3.getId()     // Catch:{ Throwable -> 0x02f8 }
            com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49341a(r0, r2, r4)     // Catch:{ Throwable -> 0x02f8 }
            goto L_0x0317
        L_0x02e8:
            r12.mo41311a()     // Catch:{ Throwable -> 0x02f8 }
            int r0 = r3.getId()     // Catch:{ Throwable -> 0x02f8 }
            r2 = 0
            com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49341a(r0, r11, r2)     // Catch:{ Throwable -> 0x02f8 }
            goto L_0x044d
        L_0x02f5:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x02f5 }
            throw r0     // Catch:{ Throwable -> 0x02f8 }
        L_0x02f8:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "saveFileAsTargetName throwable "
            r2.<init>(r3)
            java.lang.String r3 = r0.getMessage()
            r2.append(r3)
            com.ss.android.socialbase.downloader.exception.BaseException r2 = new com.ss.android.socialbase.downloader.exception.BaseException
            java.lang.String r3 = "saveFileAsTargetName"
            java.lang.String r0 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49362b(r0, r3)
            r3 = 1038(0x40e, float:1.455E-42)
            r2.<init>(r3, r0)
            r12.mo41312a(r2)
        L_0x0317:
            return
        L_0x0318:
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r1.f54670c
            com.ss.android.socialbase.downloader.downloader.f$3 r4 = new com.ss.android.socialbase.downloader.downloader.f$3
            r4.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r9 = "saveFileAsTargetName targetName is "
            r0.<init>(r9)
            java.lang.String r9 = r3.getTargetFilePath()
            r0.append(r9)
            java.io.File r9 = new java.io.File     // Catch:{ Throwable -> 0x042e }
            java.lang.String r0 = r3.getTempPath()     // Catch:{ Throwable -> 0x042e }
            java.lang.String r10 = r3.getTempName()     // Catch:{ Throwable -> 0x042e }
            r9.<init>(r0, r10)     // Catch:{ Throwable -> 0x042e }
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x042e }
            java.lang.String r10 = r3.getSavePath()     // Catch:{ Throwable -> 0x042e }
            java.lang.String r12 = r3.getName()     // Catch:{ Throwable -> 0x042e }
            r0.<init>(r10, r12)     // Catch:{ Throwable -> 0x042e }
            android.content.Context r10 = com.p683ss.android.socialbase.downloader.downloader.C19884b.m48627x()     // Catch:{ Throwable -> 0x042e }
            com.ss.android.socialbase.downloader.downloader.Downloader r10 = com.p683ss.android.socialbase.downloader.downloader.Downloader.getInstance(r10)     // Catch:{ Throwable -> 0x042e }
            int r12 = r3.getId()     // Catch:{ Throwable -> 0x042e }
            com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r10.getDownloadInfo(r12)     // Catch:{ Throwable -> 0x042e }
            boolean r12 = r9.exists()     // Catch:{ Throwable -> 0x042e }
            if (r12 != 0) goto L_0x0387
            boolean r12 = r0.exists()     // Catch:{ Throwable -> 0x042e }
            if (r12 == 0) goto L_0x037b
            com.ss.android.socialbase.downloader.b.i r12 = r3.checkMd5Valid()     // Catch:{ Throwable -> 0x042e }
            com.ss.android.socialbase.downloader.b.i r13 = com.p683ss.android.socialbase.downloader.p1212b.C19788i.VALID     // Catch:{ Throwable -> 0x042e }
            if (r12 != r13) goto L_0x036f
            r4.mo41311a()     // Catch:{ Throwable -> 0x042e }
            return
        L_0x036f:
            if (r10 == 0) goto L_0x03d7
            boolean r12 = r10.isSaveTempFile()     // Catch:{ Throwable -> 0x042e }
            if (r12 == 0) goto L_0x03d7
            r10.registerTempFileSaveCallback(r4)     // Catch:{ Throwable -> 0x042e }
            return
        L_0x037b:
            if (r10 == 0) goto L_0x03d7
            boolean r12 = r10.isSaveTempFile()     // Catch:{ Throwable -> 0x042e }
            if (r12 == 0) goto L_0x03d7
            r10.registerTempFileSaveCallback(r4)     // Catch:{ Throwable -> 0x042e }
            return
        L_0x0387:
            boolean r12 = r0.exists()     // Catch:{ Throwable -> 0x042e }
            if (r12 == 0) goto L_0x03d7
            com.ss.android.socialbase.downloader.b.i r12 = r3.checkMd5Valid()     // Catch:{ Throwable -> 0x042e }
            com.ss.android.socialbase.downloader.b.i r13 = com.p683ss.android.socialbase.downloader.p1212b.C19788i.VALID     // Catch:{ Throwable -> 0x042e }
            if (r12 != r13) goto L_0x0399
            r4.mo41311a()     // Catch:{ Throwable -> 0x042e }
            return
        L_0x0399:
            if (r10 == 0) goto L_0x03a5
            boolean r13 = r10.isSaveTempFile()     // Catch:{ Throwable -> 0x042e }
            if (r13 == 0) goto L_0x03a5
            r10.registerTempFileSaveCallback(r4)     // Catch:{ Throwable -> 0x042e }
            return
        L_0x03a5:
            if (r10 == 0) goto L_0x03aa
            r10.setIsSaveTempFile(r11)     // Catch:{ Throwable -> 0x042e }
        L_0x03aa:
            boolean r13 = r0.delete()     // Catch:{ Throwable -> 0x042e }
            if (r13 != 0) goto L_0x03d7
            com.ss.android.socialbase.downloader.exception.BaseException r0 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ Throwable -> 0x042e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x042e }
            java.lang.String r5 = "delete targetPath file existed with md5 check invalid status:"
            r3.<init>(r5)     // Catch:{ Throwable -> 0x042e }
            java.lang.String r5 = r12.name()     // Catch:{ Throwable -> 0x042e }
            r3.append(r5)     // Catch:{ Throwable -> 0x042e }
            java.lang.String r5 = " failed!"
            r3.append(r5)     // Catch:{ Throwable -> 0x042e }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x042e }
            r5 = 1037(0x40d, float:1.453E-42)
            r0.<init>(r5, r3)     // Catch:{ Throwable -> 0x042e }
            r4.mo41312a(r0)     // Catch:{ Throwable -> 0x042e }
            if (r10 == 0) goto L_0x03d6
            r10.handleTempSaveCallback(r2, r0)     // Catch:{ Throwable -> 0x042e }
        L_0x03d6:
            return
        L_0x03d7:
            if (r10 == 0) goto L_0x03dc
            r10.setIsSaveTempFile(r11)     // Catch:{ Throwable -> 0x042e }
        L_0x03dc:
            boolean r0 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49354a(r9, r0)     // Catch:{ BaseException -> 0x03e3 }
            r0 = r0 ^ r11
            r12 = 0
            goto L_0x03e6
        L_0x03e3:
            r0 = move-exception
            r12 = r0
            r0 = 0
        L_0x03e6:
            if (r0 == 0) goto L_0x0424
            if (r12 != 0) goto L_0x041b
            boolean r0 = r9.exists()     // Catch:{ Throwable -> 0x042e }
            com.ss.android.socialbase.downloader.exception.BaseException r12 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ Throwable -> 0x042e }
            java.lang.String r9 = "Can't save the temp downloaded file(%s/%s) to the target file(%s/%s), temp file is exist: %d"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x042e }
            java.lang.String r13 = r3.getTempPath()     // Catch:{ Throwable -> 0x042e }
            r5[r2] = r13     // Catch:{ Throwable -> 0x042e }
            java.lang.String r13 = r3.getTempName()     // Catch:{ Throwable -> 0x042e }
            r5[r11] = r13     // Catch:{ Throwable -> 0x042e }
            java.lang.String r11 = r3.getSavePath()     // Catch:{ Throwable -> 0x042e }
            r5[r8] = r11     // Catch:{ Throwable -> 0x042e }
            java.lang.String r3 = r3.getName()     // Catch:{ Throwable -> 0x042e }
            r5[r7] = r3     // Catch:{ Throwable -> 0x042e }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Throwable -> 0x042e }
            r5[r6] = r0     // Catch:{ Throwable -> 0x042e }
            java.lang.String r0 = com.C2240a.m6772a(r9, r5)     // Catch:{ Throwable -> 0x042e }
            r3 = 1038(0x40e, float:1.455E-42)
            r12.<init>(r3, r0)     // Catch:{ Throwable -> 0x042e }
        L_0x041b:
            r4.mo41312a(r12)     // Catch:{ Throwable -> 0x042e }
            if (r10 == 0) goto L_0x042d
            r10.handleTempSaveCallback(r2, r12)     // Catch:{ Throwable -> 0x042e }
            goto L_0x044d
        L_0x0424:
            r4.mo41311a()     // Catch:{ Throwable -> 0x042e }
            if (r10 == 0) goto L_0x042d
            r2 = 0
            r10.handleTempSaveCallback(r11, r2)     // Catch:{ Throwable -> 0x042e }
        L_0x042d:
            return
        L_0x042e:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "saveFileAsTargetName throwable "
            r2.<init>(r3)
            java.lang.String r3 = r0.getMessage()
            r2.append(r3)
            com.ss.android.socialbase.downloader.exception.BaseException r2 = new com.ss.android.socialbase.downloader.exception.BaseException
            java.lang.String r3 = "saveFileAsTargetName"
            java.lang.String r0 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49362b(r0, r3)
            r3 = 1038(0x40e, float:1.455E-42)
            r2.<init>(r3, r0)
            r4.mo41312a(r2)
        L_0x044d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.downloader.C19891f.mo41505d():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0036 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41500a(com.p683ss.android.socialbase.downloader.exception.BaseException r6) {
        /*
            r5 = this;
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r5.f54670c
            r1 = 0
            r0.setFirstDownload(r1)
            if (r6 == 0) goto L_0x0024
            java.lang.Throwable r0 = r6.getCause()
            if (r0 == 0) goto L_0x0024
            java.lang.Throwable r0 = r6.getCause()
            boolean r0 = r0 instanceof android.database.sqlite.SQLiteFullException
            if (r0 == 0) goto L_0x0024
            com.ss.android.socialbase.downloader.downloader.k r0 = r5.f54671d     // Catch:{ SQLiteException -> 0x0022 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r5.f54670c     // Catch:{ SQLiteException -> 0x0022 }
            int r2 = r2.getId()     // Catch:{ SQLiteException -> 0x0022 }
            r0.mo41262f(r2)     // Catch:{ SQLiteException -> 0x0022 }
            goto L_0x0041
        L_0x0022:
            goto L_0x0041
        L_0x0024:
            com.ss.android.socialbase.downloader.downloader.k r0 = r5.f54671d     // Catch:{ SQLiteException -> 0x0036 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r5.f54670c     // Catch:{ SQLiteException -> 0x0036 }
            int r2 = r2.getId()     // Catch:{ SQLiteException -> 0x0036 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r5.f54670c     // Catch:{ SQLiteException -> 0x0036 }
            long r3 = r3.getCurBytes()     // Catch:{ SQLiteException -> 0x0036 }
            r0.mo41246b(r2, r3)     // Catch:{ SQLiteException -> 0x0036 }
            goto L_0x0041
        L_0x0036:
            com.ss.android.socialbase.downloader.downloader.k r0 = r5.f54671d     // Catch:{ SQLiteException -> 0x0022 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r5.f54670c     // Catch:{ SQLiteException -> 0x0022 }
            int r2 = r2.getId()     // Catch:{ SQLiteException -> 0x0022 }
            r0.mo41262f(r2)     // Catch:{ SQLiteException -> 0x0022 }
        L_0x0041:
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r5.f54670c
            int r0 = r0.getId()
            com.ss.android.socialbase.downloader.h.a r0 = com.p683ss.android.socialbase.downloader.p1219h.C19938a.m48929a(r0)
            java.lang.String r2 = "download_failed_check_net"
            int r0 = r0.mo41658a(r2, r1)
            r2 = 1
            if (r0 != r2) goto L_0x007d
            boolean r0 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49381d(r6)
            if (r0 == 0) goto L_0x007d
            android.content.Context r0 = com.p683ss.android.socialbase.downloader.downloader.C19884b.m48627x()
            if (r0 == 0) goto L_0x007d
            boolean r0 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49368b(r0)
            if (r0 != 0) goto L_0x007d
            com.ss.android.socialbase.downloader.exception.BaseException r0 = new com.ss.android.socialbase.downloader.exception.BaseException
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r5.f54670c
            boolean r2 = r2.isOnlyWifi()
            if (r2 == 0) goto L_0x0073
            r2 = 1013(0x3f5, float:1.42E-42)
            goto L_0x0075
        L_0x0073:
            r2 = 1049(0x419, float:1.47E-42)
        L_0x0075:
            java.lang.String r6 = r6.getErrorMessage()
            r0.<init>(r2, r6)
            r6 = r0
        L_0x007d:
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r5.f54670c
            r0.setFailedException(r6)
            r0 = -1
            r5.mo41497a(r0, r6)
            com.ss.android.socialbase.downloader.model.DownloadInfo r6 = r5.f54670c
            int r6 = r6.getId()
            com.ss.android.socialbase.downloader.h.a r6 = com.p683ss.android.socialbase.downloader.p1219h.C19938a.m48929a(r6)
            java.lang.String r0 = "retry_schedule"
            int r6 = r6.mo41658a(r0, r1)
            if (r6 <= 0) goto L_0x00c2
            com.ss.android.socialbase.downloader.impls.r r6 = com.p683ss.android.socialbase.downloader.impls.C19983r.m49310c()
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r5.f54670c
            if (r0 == 0) goto L_0x00c1
            java.lang.String r1 = com.p683ss.android.socialbase.downloader.p1212b.C19784e.f54482a
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00c1
            java.lang.String r1 = com.p683ss.android.socialbase.downloader.p1212b.C19784e.f54482a
            java.lang.String r2 = r0.getMimeType()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00b5
            goto L_0x00c1
        L_0x00b5:
            boolean r1 = r0.isOnlyWifi()
            int r2 = r6.mo41748e()
            r6.mo41746a(r0, r1, r2)
            goto L_0x00c2
        L_0x00c1:
            return
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.downloader.C19891f.mo41500a(com.ss.android.socialbase.downloader.exception.BaseException):void");
    }

    /* renamed from: a */
    public final void mo41497a(int i, BaseException baseException) {
        mo41498a(i, baseException, true);
    }

    public C19891f(DownloadTask downloadTask, Handler handler) {
        this.f54678k = downloadTask;
        m48655g();
        this.f54677j = handler;
        this.f54671d = C19884b.m48616m();
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo != null) {
            this.f54669b = C19938a.m48929a(downloadInfo.getId()).mo41660a("fix_start_with_file_exist_update_error");
        } else {
            this.f54669b = false;
        }
    }

    /* renamed from: a */
    public final void mo41501a(BaseException baseException, boolean z) {
        int i;
        this.f54670c.setFirstDownload(false);
        this.f54673f.set(0);
        this.f54671d.mo41264h(this.f54670c.getId());
        if (z) {
            i = 7;
        } else {
            i = 5;
        }
        mo41497a(i, baseException);
    }

    /* renamed from: a */
    public boolean mo41502a(long j, boolean z) {
        boolean z2 = false;
        if (this.f54670c.getCurBytes() == this.f54670c.getTotalBytes()) {
            try {
                this.f54671d.mo41233a(this.f54670c.getId(), this.f54670c.getCurBytes());
            } catch (Exception unused) {
            }
            return false;
        }
        if (this.f54682o) {
            this.f54682o = false;
            this.f54670c.setStatus(4);
        }
        if (this.f54670c.isNeedPostProgress() && z) {
            z2 = true;
        }
        mo41498a(4, (BaseException) null, z2);
        return z;
    }

    /* renamed from: a */
    public final void mo41499a(long j, String str, String str2) {
        this.f54670c.setTotalBytes(j);
        this.f54670c.seteTag(str);
        if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(this.f54670c.getName())) {
            this.f54670c.setName(str2);
        }
        try {
            this.f54671d.mo41234a(this.f54670c.getId(), j, str, str2);
        } catch (Exception unused) {
        }
        mo41497a(3, (BaseException) null);
        this.f54676i = this.f54670c.getMinByteIntervalForPostToMainThread(j);
        this.f54675h = this.f54670c.getMinProgressTimeMsInterval();
        this.f54682o = true;
        C19983r.m49310c().mo41745a(5, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x005b A[Catch:{ Throwable -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo41498a(int r8, com.p683ss.android.socialbase.downloader.exception.BaseException r9, boolean r10) {
        /*
            r7 = this;
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f54670c
            int r0 = r0.getStatus()
            r1 = 4
            r2 = -3
            if (r0 != r2) goto L_0x000d
            if (r8 != r1) goto L_0x000d
            return
        L_0x000d:
            r7.m48655g()
            r3 = 0
            if (r8 == r1) goto L_0x0029
            boolean r1 = com.p683ss.android.socialbase.downloader.p1212b.C19785f.m48314d(r8)
            if (r1 == 0) goto L_0x0029
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r7.f54670c
            r1.updateRealDownloadTime(r3)
            boolean r1 = com.p683ss.android.socialbase.downloader.p1212b.C19785f.m48313c(r8)
            if (r1 == 0) goto L_0x0029
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r7.f54670c
            r1.updateDownloadTime()
        L_0x0029:
            com.ss.android.socialbase.downloader.depend.t r1 = r7.f54684q
            r4 = 1
            if (r1 == 0) goto L_0x004e
            com.ss.android.socialbase.downloader.depend.t r1 = r7.f54684q
            boolean r1 = r1 instanceof com.p683ss.android.socialbase.downloader.depend.C19827b
            if (r1 == 0) goto L_0x004e
            com.ss.android.socialbase.downloader.depend.t r1 = r7.f54684q
            com.ss.android.socialbase.downloader.depend.b r1 = (com.p683ss.android.socialbase.downloader.depend.C19827b) r1
            int[] r1 = r1.mo41318a()
            if (r1 == 0) goto L_0x004e
            int r5 = r1.length
            if (r5 <= 0) goto L_0x004e
            r5 = 0
        L_0x0042:
            int r6 = r1.length
            if (r5 >= r6) goto L_0x004e
            r6 = r1[r5]
            if (r8 != r6) goto L_0x004b
            r1 = 1
            goto L_0x004f
        L_0x004b:
            int r5 = r5 + 1
            goto L_0x0042
        L_0x004e:
            r1 = 0
        L_0x004f:
            boolean r5 = com.p683ss.android.socialbase.downloader.p1212b.C19785f.m48312b(r8)
            if (r5 != 0) goto L_0x0057
            if (r1 == 0) goto L_0x0069
        L_0x0057:
            com.ss.android.socialbase.downloader.depend.IDownloadDepend r1 = r7.f54683p     // Catch:{ Throwable -> 0x0062 }
            if (r1 == 0) goto L_0x0062
            com.ss.android.socialbase.downloader.depend.IDownloadDepend r1 = r7.f54683p     // Catch:{ Throwable -> 0x0062 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r7.f54670c     // Catch:{ Throwable -> 0x0062 }
            r1.monitorLogSend(r5, r9, r8)     // Catch:{ Throwable -> 0x0062 }
        L_0x0062:
            com.ss.android.socialbase.downloader.depend.t r1 = r7.f54684q
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r7.f54670c
            com.p683ss.android.socialbase.downloader.p1215e.C19911a.m48889a(r1, r5, r9, r8)
        L_0x0069:
            r1 = 6
            if (r8 != r1) goto L_0x0073
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r7.f54670c
            r5 = 2
            r1.setStatus(r5)
            goto L_0x0081
        L_0x0073:
            r1 = -6
            if (r8 != r1) goto L_0x007c
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r7.f54670c
            r1.setStatus(r2)
            goto L_0x0081
        L_0x007c:
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r7.f54670c
            r1.setStatus(r8)
        L_0x0081:
            if (r0 == r2) goto L_0x0086
            r1 = -1
            if (r0 != r1) goto L_0x00b9
        L_0x0086:
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f54670c
            com.ss.android.socialbase.downloader.b.j r0 = r0.getRetryDelayStatus()
            com.ss.android.socialbase.downloader.b.j r1 = com.p683ss.android.socialbase.downloader.p1212b.C19789j.DELAY_RETRY_DOWNLOADING
            if (r0 != r1) goto L_0x0097
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f54670c
            com.ss.android.socialbase.downloader.b.j r1 = com.p683ss.android.socialbase.downloader.p1212b.C19789j.DELAY_RETRY_DOWNLOADED
            r0.setRetryDelayStatus(r1)
        L_0x0097:
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f54670c
            com.ss.android.socialbase.downloader.b.a r0 = r0.getAsyncHandleStatus()
            com.ss.android.socialbase.downloader.b.a r1 = com.p683ss.android.socialbase.downloader.p1212b.C19780a.ASYNC_HANDLE_DOWNLOADING
            if (r0 != r1) goto L_0x00a8
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f54670c
            com.ss.android.socialbase.downloader.b.a r1 = com.p683ss.android.socialbase.downloader.p1212b.C19780a.ASYNC_HANDLE_DOWNLOADED
            r0.setAsyncHandleStatus(r1)
        L_0x00a8:
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f54670c
            com.ss.android.socialbase.downloader.b.b r0 = r0.getByteInvalidRetryStatus()
            com.ss.android.socialbase.downloader.b.b r1 = com.p683ss.android.socialbase.downloader.p1212b.C19781b.BYTE_INVALID_RETRY_STATUS_DOWNLOADING
            if (r0 != r1) goto L_0x00b9
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f54670c
            com.ss.android.socialbase.downloader.b.b r1 = com.p683ss.android.socialbase.downloader.p1212b.C19781b.BYTE_INVALID_RETRY_STATUS_DOWNLOADED
            r0.setByteInvalidRetryStatus(r1)
        L_0x00b9:
            android.util.SparseArray<com.ss.android.socialbase.downloader.depend.IDownloadListener> r0 = r7.f54680m
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r7.f54670c
            com.p683ss.android.socialbase.downloader.p1221j.C19993d.m49329a(r8, r0, r4, r1, r9)
            r0 = -4
            if (r8 != r0) goto L_0x00c4
            return
        L_0x00c4:
            if (r10 == 0) goto L_0x00fa
            android.util.SparseArray<com.ss.android.socialbase.downloader.depend.IDownloadListener> r10 = r7.f54679l
            if (r10 == 0) goto L_0x00d2
            android.util.SparseArray<com.ss.android.socialbase.downloader.depend.IDownloadListener> r10 = r7.f54679l
            int r10 = r10.size()
            if (r10 > 0) goto L_0x00e6
        L_0x00d2:
            android.util.SparseArray<com.ss.android.socialbase.downloader.depend.IDownloadListener> r10 = r7.f54681n
            if (r10 == 0) goto L_0x00fa
            android.util.SparseArray<com.ss.android.socialbase.downloader.depend.IDownloadListener> r10 = r7.f54681n
            int r10 = r10.size()
            if (r10 <= 0) goto L_0x00fa
            com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r7.f54670c
            boolean r10 = r10.canShowNotification()
            if (r10 == 0) goto L_0x00fa
        L_0x00e6:
            android.os.Handler r10 = r7.f54677j
            if (r10 == 0) goto L_0x00fa
            android.os.Handler r10 = r7.f54677j
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f54670c
            int r0 = r0.getId()
            android.os.Message r8 = r10.obtainMessage(r8, r0, r3, r9)
            r8.sendToTarget()
            return
        L_0x00fa:
            com.ss.android.socialbase.downloader.impls.a r9 = com.p683ss.android.socialbase.downloader.downloader.C19884b.m48620q()
            if (r9 == 0) goto L_0x0109
            com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r7.f54670c
            int r10 = r10.getId()
            r9.mo41702a(r10, r8)
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.downloader.C19891f.mo41498a(int, com.ss.android.socialbase.downloader.exception.BaseException, boolean):void");
    }
}
