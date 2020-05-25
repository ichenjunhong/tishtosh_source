package com.p683ss.android.socialbase.downloader.downloader;

import android.content.Context;
import android.util.SparseArray;
import com.p683ss.android.socialbase.downloader.depend.C19855n;
import com.p683ss.android.socialbase.downloader.depend.C19869v;
import com.p683ss.android.socialbase.downloader.depend.C19870w;
import com.p683ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p683ss.android.socialbase.downloader.impls.C19971l;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import com.p683ss.android.socialbase.downloader.p1212b.C19787h;
import com.p683ss.android.socialbase.downloader.p1221j.C19991b;
import com.p683ss.android.socialbase.downloader.p1221j.C19994e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.downloader.Downloader */
public class Downloader {
    private static volatile Downloader instance;

    private Downloader() {
    }

    public void destoryDownloader() {
        C19884b.m48600a();
    }

    public boolean isHttpServiceInit() {
        C19886c.m48631a();
        return C19884b.m48628y();
    }

    public boolean isDownloadCacheSyncSuccess() {
        C19886c.m48631a();
        C19904n a = C19971l.m49132a(false);
        if (a != null) {
            return a.mo41605e();
        }
        return false;
    }

    public void pauseAll() {
        C19886c.m48631a();
        C19904n a = C19971l.m49132a(false);
        if (a != null) {
            a.mo41569a();
        }
        C19904n a2 = C19971l.m49132a(true);
        if (a2 != null) {
            a2.mo41569a();
        }
    }

    public void setDownloadInMultiProcess() {
        if (C19991b.m49327a(4194304)) {
            synchronized (this) {
                C19884b.m48605b();
            }
            return;
        }
        C19884b.m48605b();
    }

    Downloader(C19895g gVar) {
        C19884b.m48603a(gVar);
    }

    public void cancel(int i) {
        cancel(i, true);
    }

    public static DownloadTask with(Context context) {
        getInstance(context);
        return new DownloadTask();
    }

    public void clearDownloadData(int i) {
        C19886c.m48631a().mo41489c(i, true);
    }

    public void forceDownloadIngoreRecommendSize(int i) {
        C19904n c = C19886c.m48631a().mo41488c(i);
        if (c != null) {
            c.mo41612j(i);
        }
    }

    public boolean isDownloadServiceForeground(int i) {
        return C19886c.m48631a().mo41488c(i).mo41593b();
    }

    public void pause(int i) {
        C19904n c = C19886c.m48631a().mo41488c(i);
        if (c != null) {
            c.mo41570a(i);
        }
    }

    public void removeTaskMainListener(int i) {
        C19886c.m48631a().mo41482a(i, null, C19787h.MAIN, true);
    }

    public void removeTaskNotificationListener(int i) {
        C19886c.m48631a().mo41482a(i, null, C19787h.NOTIFICATION, true);
    }

    public void removeTaskSubListener(int i) {
        C19886c.m48631a().mo41482a(i, null, C19787h.SUB, true);
    }

    public void restart(int i) {
        C19904n c = C19886c.m48631a().mo41488c(i);
        if (c != null) {
            c.mo41602d(i);
        }
    }

    public void resume(int i) {
        C19904n c = C19886c.m48631a().mo41488c(i);
        if (c != null) {
            c.mo41596c(i);
        }
    }

    public static Downloader getInstance(Context context) {
        if (instance == null) {
            synchronized (Downloader.class) {
                if (instance == null) {
                    C19884b.m48601a(context);
                    instance = new Downloader();
                }
            }
        }
        return instance;
    }

    public static synchronized void init(C19895g gVar) {
        synchronized (Downloader.class) {
            if (gVar != null) {
                if (instance == null) {
                    instance = new Downloader(gVar);
                } else {
                    C19884b.m48603a(gVar);
                }
            }
        }
    }

    public boolean canResume(int i) {
        C19904n c = C19886c.m48631a().mo41488c(i);
        if (c == null) {
            return false;
        }
        return c.mo41594b(i);
    }

    public long getCurBytes(int i) {
        C19904n c = C19886c.m48631a().mo41488c(i);
        if (c == null) {
            return 0;
        }
        return c.mo41603e(i);
    }

    public C19855n getDownloadFileUriProvider(int i) {
        C19904n c = C19886c.m48631a().mo41488c(i);
        if (c == null) {
            return null;
        }
        return c.mo41621s(i);
    }

    public DownloadInfo getDownloadInfo(int i) {
        C19904n c = C19886c.m48631a().mo41488c(i);
        if (c == null) {
            return null;
        }
        return c.mo41610h(i);
    }

    public C19869v getDownloadNotificationEventListener(int i) {
        C19904n c = C19886c.m48631a().mo41488c(i);
        if (c == null) {
            return null;
        }
        return c.mo41619q(i);
    }

    public int getStatus(int i) {
        C19904n c = C19886c.m48631a().mo41488c(i);
        if (c == null) {
            return 0;
        }
        return c.mo41606f(i);
    }

    public boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
        C19886c a = C19886c.m48631a();
        if (downloadInfo == null) {
            return false;
        }
        C19904n c = a.mo41488c(downloadInfo.getId());
        if (c == null) {
            return false;
        }
        return c.mo41585a(downloadInfo);
    }

    public boolean isDownloading(int i) {
        boolean d;
        if (!C19991b.m49327a(4194304)) {
            return C19886c.m48631a().mo41490d(i);
        }
        synchronized (this) {
            d = C19886c.m48631a().mo41490d(i);
        }
        return d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void registerDownloadCacheSyncListener(com.p683ss.android.socialbase.downloader.depend.C19846i r3) {
        /*
            r2 = this;
            com.p683ss.android.socialbase.downloader.downloader.C19886c.m48631a()
            java.util.List<com.ss.android.socialbase.downloader.depend.i> r0 = com.p683ss.android.socialbase.downloader.downloader.C19884b.f54612c
            monitor-enter(r0)
            if (r3 == 0) goto L_0x001a
            java.util.List<com.ss.android.socialbase.downloader.depend.i> r1 = com.p683ss.android.socialbase.downloader.downloader.C19884b.f54612c     // Catch:{ all -> 0x0018 }
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x0011
            goto L_0x001a
        L_0x0011:
            java.util.List<com.ss.android.socialbase.downloader.depend.i> r1 = com.p683ss.android.socialbase.downloader.downloader.C19884b.f54612c     // Catch:{ all -> 0x0018 }
            r1.add(r3)     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return
        L_0x0018:
            r3 = move-exception
            goto L_0x001c
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.downloader.Downloader.registerDownloadCacheSyncListener(com.ss.android.socialbase.downloader.depend.i):void");
    }

    public void restartAllFailedDownloadTasks(List<String> list) {
        C19886c.m48631a();
        C19904n a = C19971l.m49132a(false);
        if (a != null) {
            a.mo41583a(list);
        }
        C19904n a2 = C19971l.m49132a(true);
        if (a2 != null) {
            a2.mo41583a(list);
        }
    }

    public void setLogLevel(int i) {
        C19886c.m48631a();
        C19904n a = C19971l.m49132a(false);
        if (a != null) {
            a.mo41613k(i);
        }
        C19904n a2 = C19971l.m49132a(true);
        if (a2 != null) {
            a2.mo41613k(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void unRegisterDownloadCacheSyncListener(com.p683ss.android.socialbase.downloader.depend.C19846i r3) {
        /*
            r2 = this;
            com.p683ss.android.socialbase.downloader.downloader.C19886c.m48631a()
            java.util.List<com.ss.android.socialbase.downloader.depend.i> r0 = com.p683ss.android.socialbase.downloader.downloader.C19884b.f54612c
            monitor-enter(r0)
            if (r3 == 0) goto L_0x001a
            java.util.List<com.ss.android.socialbase.downloader.depend.i> r1 = com.p683ss.android.socialbase.downloader.downloader.C19884b.f54612c     // Catch:{ all -> 0x0018 }
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x0011
            goto L_0x001a
        L_0x0011:
            java.util.List<com.ss.android.socialbase.downloader.depend.i> r1 = com.p683ss.android.socialbase.downloader.downloader.C19884b.f54612c     // Catch:{ all -> 0x0018 }
            r1.remove(r3)     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return
        L_0x0018:
            r3 = move-exception
            goto L_0x001c
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.downloader.Downloader.unRegisterDownloadCacheSyncListener(com.ss.android.socialbase.downloader.depend.i):void");
    }

    public void unRegisterDownloaderProcessConnectedListener(C19870w wVar) {
        C19886c a = C19886c.m48631a();
        if (wVar != null) {
            synchronized (a.f54638b) {
                if (a.f54638b.contains(wVar)) {
                    a.f54638b.remove(wVar);
                }
            }
        }
    }

    public List<DownloadInfo> getDownloadInfoList(String str) {
        C19886c.m48631a();
        List<DownloadInfo> a = C19971l.m49132a(false).mo41568a(str);
        List<DownloadInfo> a2 = C19971l.m49132a(true).mo41568a(str);
        if (a == null && a2 == null) {
            return null;
        }
        if (a != null && a2 != null) {
            ArrayList arrayList = new ArrayList(a);
            arrayList.addAll(a2);
            return arrayList;
        } else if (a != null) {
            return a;
        } else {
            return a2;
        }
    }

    public List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) {
        List list;
        C19886c.m48631a();
        SparseArray sparseArray = new SparseArray();
        C19904n a = C19971l.m49132a(false);
        List list2 = null;
        if (a != null) {
            list = a.mo41604e(str);
        } else {
            list = null;
        }
        C19904n a2 = C19971l.m49132a(true);
        if (a2 != null) {
            list2 = a2.mo41604e(str);
        }
        return C19886c.m48632a(list, list2, sparseArray);
    }

    public List<DownloadInfo> getFailedDownloadInfosWithMimeType(String str) {
        List list;
        C19886c.m48631a();
        SparseArray sparseArray = new SparseArray();
        C19904n a = C19971l.m49132a(false);
        List list2 = null;
        if (a != null) {
            list = a.mo41587b(str);
        } else {
            list = null;
        }
        C19904n a2 = C19971l.m49132a(true);
        if (a2 != null) {
            list2 = a2.mo41587b(str);
        }
        return C19886c.m48632a(list, list2, sparseArray);
    }

    public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        List list;
        C19886c.m48631a();
        SparseArray sparseArray = new SparseArray();
        C19904n a = C19971l.m49132a(false);
        List list2 = null;
        if (a != null) {
            list = a.mo41595c(str);
        } else {
            list = null;
        }
        C19904n a2 = C19971l.m49132a(true);
        if (a2 != null) {
            list2 = a2.mo41595c(str);
        }
        return C19886c.m48632a(list, list2, sparseArray);
    }

    public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        List list;
        C19886c.m48631a();
        SparseArray sparseArray = new SparseArray();
        C19904n a = C19971l.m49132a(false);
        List list2 = null;
        if (a != null) {
            list = a.mo41600d(str);
        } else {
            list = null;
        }
        C19904n a2 = C19971l.m49132a(true);
        if (a2 != null) {
            list2 = a2.mo41600d(str);
        }
        return C19886c.m48632a(list, list2, sparseArray);
    }

    public void registerDownloaderProcessConnectedListener(C19870w wVar) {
        C19886c a = C19886c.m48631a();
        if (wVar != null && !C19994e.m49377c()) {
            C19971l.m49132a(true);
            synchronized (a.f54638b) {
                if (!a.f54638b.contains(wVar)) {
                    a.f54638b.add(wVar);
                }
            }
        }
    }

    public void clearDownloadData(int i, boolean z) {
        C19886c.m48631a().mo41489c(i, z);
    }

    public int getDownloadId(String str, String str2) {
        C19886c.m48631a();
        return C19886c.m48630a(str, str2);
    }

    public void addMainThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C19886c.m48631a().mo41486b(i, iDownloadListener, C19787h.MAIN, false);
        }
    }

    public void addNotificationListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C19886c.m48631a().mo41486b(i, iDownloadListener, C19787h.NOTIFICATION, false);
        }
    }

    public void addSubThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C19886c.m48631a().mo41486b(i, iDownloadListener, C19787h.SUB, false);
        }
    }

    public void removeMainThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C19886c.m48631a().mo41482a(i, iDownloadListener, C19787h.MAIN, false);
        }
    }

    public void removeNotificationListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C19886c.m48631a().mo41482a(i, iDownloadListener, C19787h.NOTIFICATION, false);
        }
    }

    public void removeSubThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C19886c.m48631a().mo41482a(i, iDownloadListener, C19787h.SUB, false);
        }
    }

    public void setDownloadNotificationEventListener(int i, C19869v vVar) {
        C19904n c = C19886c.m48631a().mo41488c(i);
        if (c != null) {
            c.mo41577a(i, vVar);
        }
    }

    public void setMainThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C19886c.m48631a().mo41486b(i, iDownloadListener, C19787h.MAIN, true);
        }
    }

    public void setNotificationListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C19886c.m48631a().mo41486b(i, iDownloadListener, C19787h.NOTIFICATION, true);
        }
    }

    public void setSubThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C19886c.m48631a().mo41486b(i, iDownloadListener, C19787h.SUB, true);
        }
    }

    public DownloadInfo getDownloadInfo(String str, String str2) {
        C19886c a = C19886c.m48631a();
        int a2 = C19886c.m48630a(str, str2);
        C19904n c = a.mo41488c(a2);
        if (c == null) {
            return null;
        }
        return c.mo41610h(a2);
    }

    public void cancel(int i, boolean z) {
        C19886c a = C19886c.m48631a();
        if (!C19994e.m49347a()) {
            C19904n c = a.mo41488c(i);
            if (c != null) {
                c.mo41579a(i, z);
            }
            C19971l.m49132a(true).mo41571a(2, i);
        } else if (C19991b.m49327a(8388608)) {
            C19904n a2 = C19971l.m49132a(true);
            if (a2 != null) {
                a2.mo41579a(i, z);
            }
            C19904n a3 = C19971l.m49132a(false);
            if (a3 != null) {
                a3.mo41579a(i, z);
            }
        } else {
            C19904n a4 = C19971l.m49132a(false);
            if (a4 != null) {
                a4.mo41579a(i, z);
            }
            C19904n a5 = C19971l.m49132a(true);
            if (a5 != null) {
                a5.mo41579a(i, z);
            }
        }
    }
}
