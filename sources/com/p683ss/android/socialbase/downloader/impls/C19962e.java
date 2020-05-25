package com.p683ss.android.socialbase.downloader.impls;

import com.p683ss.android.socialbase.downloader.depend.C19865t;
import com.p683ss.android.socialbase.downloader.downloader.C19884b;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import com.p683ss.android.socialbase.downloader.p1212b.C19785f;
import com.p683ss.android.socialbase.downloader.p1214d.C19819a;
import com.p683ss.android.socialbase.downloader.p1215e.C19911a;
import com.p683ss.android.socialbase.downloader.p1219h.C19938a;
import com.p683ss.android.socialbase.downloader.p1220i.C19941c;
import com.p683ss.android.socialbase.downloader.p1220i.C19945d;
import com.p683ss.android.socialbase.downloader.p1221j.C19994e;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.ss.android.socialbase.downloader.impls.e */
public final class C19962e extends C19950a {

    /* renamed from: c */
    private static C19945d f54887c;

    /* renamed from: a */
    public final List<Integer> mo41700a() {
        return f54887c.mo41689b();
    }

    public C19962e() {
        f54887c = new C19945d();
    }

    /* renamed from: b */
    public final void mo41712b(int i) {
        if (f54887c != null) {
            f54887c.mo41690c(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C19941c mo41715c(int i) {
        if (f54887c == null) {
            return null;
        }
        return f54887c.mo41688b(i);
    }

    /* renamed from: b */
    public static List<Future> m49078b(List<Runnable> list) {
        ExecutorService i = C19884b.m48612i();
        ArrayList arrayList = new ArrayList(list.size());
        for (Runnable submit : list) {
            arrayList.add(i.submit(submit));
        }
        return arrayList;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41705a(com.p683ss.android.socialbase.downloader.p1220i.C19941c r4) {
        /*
            r3 = this;
            com.ss.android.socialbase.downloader.i.d r0 = f54887c
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.ss.android.socialbase.downloader.i.d r0 = f54887c
            if (r4 == 0) goto L_0x0032
            java.lang.Class<com.ss.android.socialbase.downloader.i.d> r1 = com.p683ss.android.socialbase.downloader.p1220i.C19945d.class
            monitor-enter(r1)
            r2 = 524288(0x80000, float:7.34684E-40)
            boolean r2 = com.p683ss.android.socialbase.downloader.p1221j.C19991b.m49327a(r2)     // Catch:{ Throwable -> 0x002e }
            if (r2 == 0) goto L_0x0022
            android.util.SparseArray<com.ss.android.socialbase.downloader.i.c> r2 = r0.f54849a     // Catch:{ Throwable -> 0x002e }
            int r4 = r2.indexOfValue(r4)     // Catch:{ Throwable -> 0x002e }
            if (r4 < 0) goto L_0x002e
            android.util.SparseArray<com.ss.android.socialbase.downloader.i.c> r0 = r0.f54849a     // Catch:{ Throwable -> 0x002e }
            r0.removeAt(r4)     // Catch:{ Throwable -> 0x002e }
            goto L_0x002e
        L_0x0022:
            android.util.SparseArray<com.ss.android.socialbase.downloader.i.c> r0 = r0.f54849a     // Catch:{ Throwable -> 0x002e }
            int r4 = r4.mo41682f()     // Catch:{ Throwable -> 0x002e }
            r0.remove(r4)     // Catch:{ Throwable -> 0x002e }
            goto L_0x002e
        L_0x002c:
            r4 = move-exception
            goto L_0x0030
        L_0x002e:
            monitor-exit(r1)     // Catch:{ all -> 0x002c }
            return
        L_0x0030:
            monitor-exit(r1)     // Catch:{ all -> 0x002c }
            throw r4
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.impls.C19962e.mo41705a(com.ss.android.socialbase.downloader.i.c):void");
    }

    /* renamed from: c */
    public static Runnable m49079c(List<Future> list) {
        Runnable runnable;
        if (list == null || list.isEmpty()) {
            return null;
        }
        try {
            ExecutorService i = C19884b.m48612i();
            if (i instanceof ThreadPoolExecutor) {
                BlockingQueue queue = ((ThreadPoolExecutor) i).getQueue();
                if (queue != null && !queue.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            runnable = null;
                            break;
                        }
                        Future future = (Future) it.next();
                        if ((future instanceof Runnable) && queue.remove(future)) {
                            runnable = (Runnable) future;
                            break;
                        }
                    }
                    if (runnable != null) {
                        list.remove(runnable);
                        return runnable;
                    }
                }
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("getUnstartedTask() error: ");
            sb.append(th.toString());
            C19819a.m48486b("DefaultDownloadEngine", sb.toString());
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo41708a(int i) {
        if (f54887c == null || !f54887c.mo41687a(i)) {
            return false;
        }
        DownloadInfo d = mo41717d(i);
        if (d == null) {
            return false;
        }
        if (C19785f.m48311a(d.getStatus())) {
            return true;
        }
        mo41712b(i);
        return false;
    }

    /* renamed from: a */
    public final void mo41704a(int i, DownloadTask downloadTask) {
        int i2;
        int i3;
        if (downloadTask != null) {
            new StringBuilder("start doDownload for task : ").append(i);
            C19941c cVar = new C19941c(downloadTask, this.f54856b);
            C19945d dVar = f54887c;
            cVar.f54824f.mo41496a();
            synchronized (C19945d.class) {
                i2 = 0;
                if (dVar.f54850b >= 500) {
                    dVar.mo41686a();
                    dVar.f54850b = 0;
                } else {
                    dVar.f54850b++;
                }
                dVar.f54849a.put(cVar.mo41682f(), cVar);
            }
            DownloadTask downloadTask2 = cVar.f54820b;
            try {
                ExecutorService g = C19884b.m48610g();
                if (g == null) {
                    C19865t monitorDepend = downloadTask2.getMonitorDepend();
                    DownloadInfo downloadInfo = downloadTask2.getDownloadInfo();
                    BaseException baseException = new BaseException((int) BaseNotice.COMMENT_REPLY_WITH_VIDEO, "execute failed cpu thread executor service is null");
                    if (downloadTask2.getDownloadInfo() != null) {
                        i3 = downloadTask2.getDownloadInfo().getStatus();
                    } else {
                        i3 = 0;
                    }
                    C19911a.m48889a(monitorDepend, downloadInfo, baseException, i3);
                } else if (C19938a.m48929a(cVar.mo41682f()).mo41661a("pause_with_interrupt", false)) {
                    cVar.f54819a = g.submit(cVar);
                } else {
                    g.execute(cVar);
                }
            } catch (Exception e) {
                if (downloadTask2 != null) {
                    C19865t monitorDepend2 = downloadTask2.getMonitorDepend();
                    DownloadInfo downloadInfo2 = downloadTask2.getDownloadInfo();
                    BaseException baseException2 = new BaseException((int) BaseNotice.COMMENT_REPLY_WITH_VIDEO, C19994e.m49362b((Throwable) e, "DownloadThreadPoolExecute"));
                    if (downloadTask2.getDownloadInfo() != null) {
                        i2 = downloadTask2.getDownloadInfo().getStatus();
                    }
                    C19911a.m48889a(monitorDepend2, downloadInfo2, baseException2, i2);
                }
            } catch (OutOfMemoryError unused) {
                if (downloadTask2 != null) {
                    C19865t monitorDepend3 = downloadTask2.getMonitorDepend();
                    DownloadInfo downloadInfo3 = downloadTask2.getDownloadInfo();
                    BaseException baseException3 = new BaseException((int) BaseNotice.COMMENT_REPLY_WITH_VIDEO, "execute OOM");
                    if (downloadTask2.getDownloadInfo() != null) {
                        i2 = downloadTask2.getDownloadInfo().getStatus();
                    }
                    C19911a.m48889a(monitorDepend3, downloadInfo3, baseException3, i2);
                }
            }
        }
    }
}
