package com.p683ss.android.socialbase.downloader.downloader;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.p683ss.android.socialbase.downloader.depend.C19870w;
import com.p683ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p683ss.android.socialbase.downloader.impls.C19971l;
import com.p683ss.android.socialbase.downloader.impls.DownloadHandleService;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import com.p683ss.android.socialbase.downloader.p1212b.C19787h;
import com.p683ss.android.socialbase.downloader.p1221j.C19994e;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.downloader.c */
public class C19886c {

    /* renamed from: c */
    private static volatile C19886c f54636c;

    /* renamed from: a */
    public Handler f54637a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    volatile List<C19870w> f54638b = new ArrayList();

    /* renamed from: d */
    private volatile SparseArray<Boolean> f54639d = new SparseArray<>();

    /* renamed from: a */
    public static C19886c m48631a() {
        if (f54636c == null) {
            synchronized (C19886c.class) {
                f54636c = new C19886c();
            }
        }
        return f54636c;
    }

    /* renamed from: b */
    public final void mo41485b() {
        synchronized (this.f54638b) {
            Iterator it = this.f54638b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: d */
    public final boolean mo41490d(int i) {
        C19904n c = mo41488c(i);
        if (c == null) {
            return false;
        }
        return c.mo41609g(i);
    }

    /* renamed from: c */
    public final C19904n mo41488c(int i) {
        boolean z = true;
        if (mo41480a(i) != 1 || C19994e.m49377c()) {
            z = false;
        }
        return C19971l.m49132a(z);
    }

    /* renamed from: a */
    public final int mo41480a(int i) {
        if (C19994e.m49377c() || !C19971l.m49132a(true).mo41608g()) {
            return mo41484b(i);
        }
        return C19971l.m49132a(true).mo41615m(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo41484b(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<java.lang.Boolean> r0 = r1.f54639d     // Catch:{ all -> 0x001f }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x001f }
            if (r0 != 0) goto L_0x000c
            r2 = -1
            monitor-exit(r1)
            return r2
        L_0x000c:
            android.util.SparseArray<java.lang.Boolean> r0 = r1.f54639d     // Catch:{ all -> 0x001f }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001f }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x001f }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x001f }
            if (r2 == 0) goto L_0x001d
            r2 = 1
        L_0x001b:
            monitor-exit(r1)
            return r2
        L_0x001d:
            r2 = 0
            goto L_0x001b
        L_0x001f:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.downloader.C19886c.mo41484b(int):int");
    }

    /* renamed from: a */
    public C19904n mo41481a(DownloadTask downloadTask) {
        boolean z;
        if (downloadTask == null) {
            return null;
        }
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo == null) {
            return null;
        }
        boolean isNeedIndependentProcess = downloadInfo.isNeedIndependentProcess();
        boolean z2 = true;
        if (C19994e.m49377c() || !C19994e.m49347a()) {
            isNeedIndependentProcess = true;
        }
        int a = mo41480a(downloadInfo.getId());
        if (a >= 0 && a != isNeedIndependentProcess) {
            if (a == 1) {
                try {
                    if (C19994e.m49347a()) {
                        C19971l.m49132a(true).mo41570a(downloadInfo.getId());
                        DownloadInfo h = C19971l.m49132a(true).mo41610h(downloadInfo.getId());
                        if (h != null) {
                            C19971l.m49132a(false).mo41591b(h);
                        }
                        if (h.getChunkCount() > 1) {
                            List i = C19971l.m49132a(true).mo41611i(downloadInfo.getId());
                            if (i != null) {
                                C19971l.m49132a(false).mo41578a(downloadInfo.getId(), C19994e.m49339a(i));
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            } else if (C19994e.m49347a()) {
                C19971l.m49132a(false).mo41570a(downloadInfo.getId());
                List i2 = C19971l.m49132a(false).mo41611i(downloadInfo.getId());
                if (i2 != null) {
                    C19971l.m49132a(true).mo41578a(downloadInfo.getId(), C19994e.m49339a(i2));
                }
            } else {
                downloadTask.setNeedDelayForCacheSync(true);
                C19971l.m49132a(true).mo41571a(1, downloadInfo.getId());
            }
        }
        int id = downloadInfo.getId();
        if (isNeedIndependentProcess) {
            z = true;
        } else {
            z = false;
        }
        mo41483a(id, z);
        if (!isNeedIndependentProcess) {
            z2 = false;
        }
        return C19971l.m49132a(z2);
    }

    /* renamed from: a */
    public static int m48630a(String str, String str2) {
        return C19884b.m48597a(str, str2);
    }

    /* renamed from: c */
    public final void mo41489c(int i, boolean z) {
        C19904n c = mo41488c(i);
        if (c != null) {
            c.mo41590b(i, z);
        }
    }

    /* renamed from: b */
    public final synchronized void mo41487b(int i, boolean z) {
        Boolean bool;
        SparseArray<Boolean> sparseArray = this.f54639d;
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        sparseArray.put(i, bool);
    }

    /* renamed from: a */
    public final void mo41483a(int i, boolean z) {
        mo41487b(i, z);
        if (!C19994e.m49377c() && C19971l.m49132a(true).mo41608g()) {
            C19971l.m49132a(true).mo41597c(i, z);
        }
        if (!C19884b.m48606c() && !C19994e.m49377c() && !C19994e.m49347a()) {
            try {
                Intent intent = new Intent(C19884b.m48627x(), DownloadHandleService.class);
                intent.setAction("com.ss.android.downloader.action.PROCESS_NOTIFY");
                intent.putExtra("extra_download_id", i);
                Context x = C19884b.m48627x();
                if (x == null || !(x instanceof Context) || !C40895d.m90464a(x, intent)) {
                    x.startService(intent);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    static List<DownloadInfo> m48632a(List<DownloadInfo> list, List<DownloadInfo> list2, SparseArray<DownloadInfo> sparseArray) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (DownloadInfo downloadInfo : list) {
                if (downloadInfo != null && sparseArray.get(downloadInfo.getId()) == null) {
                    sparseArray.put(downloadInfo.getId(), downloadInfo);
                }
            }
        }
        if (list2 != null) {
            for (DownloadInfo downloadInfo2 : list2) {
                if (downloadInfo2 != null && sparseArray.get(downloadInfo2.getId()) == null) {
                    sparseArray.put(downloadInfo2.getId(), downloadInfo2);
                }
            }
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add((DownloadInfo) sparseArray.get(sparseArray.keyAt(i)));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo41486b(int i, IDownloadListener iDownloadListener, C19787h hVar, boolean z) {
        C19904n c = mo41488c(i);
        if (c != null) {
            c.mo41575a(i, iDownloadListener.hashCode(), iDownloadListener, hVar, z);
        }
    }

    /* renamed from: a */
    public final void mo41482a(int i, IDownloadListener iDownloadListener, C19787h hVar, boolean z) {
        int i2;
        C19904n c = mo41488c(i);
        if (c != null) {
            if (iDownloadListener == null) {
                i2 = 0;
            } else {
                i2 = iDownloadListener.hashCode();
            }
            c.mo41588b(i, i2, iDownloadListener, hVar, z);
        }
    }
}
