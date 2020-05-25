package com.p683ss.android.socialbase.downloader.impls;

import android.text.TextUtils;
import android.util.SparseArray;
import com.p683ss.android.socialbase.downloader.downloader.C19901k;
import com.p683ss.android.socialbase.downloader.model.DownloadChunk;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.p1212b.C19785f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.impls.k */
public final class C19970k implements C19901k {

    /* renamed from: a */
    public final SparseArray<DownloadInfo> f54897a = new SparseArray<>();

    /* renamed from: b */
    public final SparseArray<List<DownloadChunk>> f54898b = new SparseArray<>();

    /* renamed from: a */
    public final void mo41237a(int i, int i2, int i3, int i4) {
    }

    /* renamed from: b */
    public final void mo41249b(int i, List<DownloadChunk> list) {
    }

    /* renamed from: b */
    public final void mo41250b(DownloadChunk downloadChunk) {
    }

    /* renamed from: c */
    public final boolean mo41255c() {
        return false;
    }

    /* renamed from: d */
    public final boolean mo41259d() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo41244a(DownloadInfo downloadInfo) {
        boolean z = true;
        if (downloadInfo == null) {
            return true;
        }
        synchronized (this.f54897a) {
            if (this.f54897a.get(downloadInfo.getId()) == null) {
                z = false;
            }
            this.f54897a.put(downloadInfo.getId(), downloadInfo);
        }
        return z;
    }

    /* renamed from: b */
    public final void mo41248b() {
        synchronized (this.f54897a) {
            this.f54897a.clear();
            this.f54898b.clear();
        }
    }

    /* renamed from: f */
    public final boolean mo41262f(int i) {
        mo41261e(i);
        mo41258d(i);
        return true;
    }

    /* renamed from: b */
    public final void mo41251b(DownloadInfo downloadInfo) {
        mo41244a(downloadInfo);
    }

    /* renamed from: c */
    public final List<DownloadChunk> mo41253c(int i) {
        return (List) this.f54898b.get(i);
    }

    /* renamed from: e */
    public final boolean mo41261e(int i) {
        synchronized (this.f54897a) {
            this.f54897a.remove(i);
        }
        return true;
    }

    /* renamed from: g */
    public final DownloadInfo mo41263g(int i) {
        DownloadInfo b = mo41245b(i);
        if (b != null) {
            b.setStatus(2);
        }
        return b;
    }

    /* renamed from: h */
    public final DownloadInfo mo41264h(int i) {
        DownloadInfo b = mo41245b(i);
        if (b != null) {
            b.setStatus(5);
            b.setFirstDownload(false);
        }
        return b;
    }

    /* renamed from: i */
    public final DownloadInfo mo41265i(int i) {
        DownloadInfo b = mo41245b(i);
        if (b != null) {
            b.setStatus(1);
        }
        return b;
    }

    /* renamed from: j */
    public final DownloadInfo mo41266j(int i) {
        DownloadInfo b = mo41245b(i);
        if (b != null) {
            b.setStatus(-7);
        }
        return b;
    }

    /* renamed from: a */
    public final synchronized void mo41242a(DownloadChunk downloadChunk) {
        int i = downloadChunk.f55024a;
        List list = (List) this.f54898b.get(i);
        if (list == null) {
            list = new ArrayList();
            this.f54898b.put(i, list);
        }
        list.add(downloadChunk);
    }

    /* renamed from: b */
    public final DownloadInfo mo41245b(int i) {
        DownloadInfo downloadInfo;
        synchronized (this.f54897a) {
            try {
                downloadInfo = (DownloadInfo) this.f54897a.get(i);
            } catch (Exception unused) {
                downloadInfo = null;
            }
        }
        return downloadInfo;
    }

    /* renamed from: d */
    public final synchronized void mo41258d(int i) {
        this.f54898b.remove(i);
    }

    /* renamed from: b */
    public final List<DownloadInfo> mo41247b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f54897a) {
            if (this.f54897a.size() == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f54897a.size(); i++) {
                DownloadInfo downloadInfo = (DownloadInfo) this.f54897a.get(this.f54897a.keyAt(i));
                if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str) && C19785f.m48315e(downloadInfo.getStatus())) {
                    arrayList.add(downloadInfo);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: c */
    public final List<DownloadInfo> mo41254c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f54897a) {
            if (this.f54897a.size() == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f54897a.size(); i++) {
                DownloadInfo downloadInfo = (DownloadInfo) this.f54897a.get(this.f54897a.keyAt(i));
                if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str) && downloadInfo.getStatus() == -3) {
                    arrayList.add(downloadInfo);
                }
            }
            return arrayList;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0064 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p683ss.android.socialbase.downloader.model.DownloadInfo> mo41257d(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadInfo> r0 = r7.f54897a
            monitor-enter(r0)
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadInfo> r2 = r7.f54897a     // Catch:{ all -> 0x0069 }
            int r2 = r2.size()     // Catch:{ all -> 0x0069 }
            if (r2 != 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            return r1
        L_0x0015:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0069 }
            r1.<init>()     // Catch:{ all -> 0x0069 }
            r2 = 0
            r3 = 0
        L_0x001c:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadInfo> r4 = r7.f54897a     // Catch:{ all -> 0x0069 }
            int r4 = r4.size()     // Catch:{ all -> 0x0069 }
            if (r3 >= r4) goto L_0x0067
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadInfo> r4 = r7.f54897a     // Catch:{ all -> 0x0069 }
            int r4 = r4.keyAt(r3)     // Catch:{ all -> 0x0069 }
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadInfo> r5 = r7.f54897a     // Catch:{ all -> 0x0069 }
            java.lang.Object r4 = r5.get(r4)     // Catch:{ all -> 0x0069 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = (com.p683ss.android.socialbase.downloader.model.DownloadInfo) r4     // Catch:{ all -> 0x0069 }
            if (r4 == 0) goto L_0x0064
            java.lang.String r5 = r4.getMimeType()     // Catch:{ all -> 0x0069 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0069 }
            if (r5 != 0) goto L_0x0064
            java.lang.String r5 = r4.getMimeType()     // Catch:{ all -> 0x0069 }
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x0069 }
            if (r5 == 0) goto L_0x0064
            int r5 = r4.getStatus()     // Catch:{ all -> 0x0069 }
            r6 = -1
            if (r5 == r6) goto L_0x005e
            r6 = -2
            if (r5 == r6) goto L_0x005e
            r6 = -7
            if (r5 == r6) goto L_0x005e
            r6 = -4
            if (r5 == r6) goto L_0x005e
            r6 = -5
            if (r5 != r6) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r5 = 0
            goto L_0x005f
        L_0x005e:
            r5 = 1
        L_0x005f:
            if (r5 == 0) goto L_0x0064
            r1.add(r4)     // Catch:{ all -> 0x0069 }
        L_0x0064:
            int r3 = r3 + 1
            goto L_0x001c
        L_0x0067:
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            return r1
        L_0x0069:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.impls.C19970k.mo41257d(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p683ss.android.socialbase.downloader.model.DownloadInfo> mo41235a(java.lang.String r7) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadInfo> r1 = r6.f54897a
            monitor-enter(r1)
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadInfo> r2 = r6.f54897a     // Catch:{ Exception -> 0x002d }
            int r2 = r2.size()     // Catch:{ Exception -> 0x002d }
            r3 = 0
        L_0x000f:
            if (r3 >= r2) goto L_0x002d
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadInfo> r4 = r6.f54897a     // Catch:{ Exception -> 0x002d }
            java.lang.Object r4 = r4.valueAt(r3)     // Catch:{ Exception -> 0x002d }
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = (com.p683ss.android.socialbase.downloader.model.DownloadInfo) r4     // Catch:{ Exception -> 0x002d }
            if (r7 == 0) goto L_0x0028
            java.lang.String r5 = r4.getUrl()     // Catch:{ Exception -> 0x002d }
            boolean r5 = r7.equals(r5)     // Catch:{ Exception -> 0x002d }
            if (r5 == 0) goto L_0x0028
            r0.add(r4)     // Catch:{ Exception -> 0x002d }
        L_0x0028:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x002b:
            r7 = move-exception
            goto L_0x002f
        L_0x002d:
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            return r0
        L_0x002f:
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.impls.C19970k.mo41235a(java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public final DownloadInfo mo41232a(int i, int i2) {
        DownloadInfo b = mo41245b(i);
        if (b != null) {
            b.setChunkCount(i2);
        }
        return b;
    }

    /* renamed from: d */
    public final DownloadInfo mo41256d(int i, long j) {
        DownloadInfo b = mo41245b(i);
        if (b != null) {
            b.setCurBytes(j, false);
            b.setStatus(-2);
        }
        return b;
    }

    /* renamed from: c */
    public final DownloadInfo mo41252c(int i, long j) {
        DownloadInfo b = mo41245b(i);
        if (b != null) {
            b.setCurBytes(j, false);
            b.setStatus(-3);
            b.setFirstDownload(false);
            b.setFirstSuccess(false);
        }
        return b;
    }

    /* renamed from: a */
    public final DownloadInfo mo41233a(int i, long j) {
        DownloadInfo b = mo41245b(i);
        if (b != null) {
            b.setCurBytes(j, false);
            if (!(b.getStatus() == -3 || b.getStatus() == -2 || C19785f.m48315e(b.getStatus()) || b.getStatus() == -4)) {
                b.setStatus(4);
            }
        }
        return b;
    }

    /* renamed from: b */
    public final DownloadInfo mo41246b(int i, long j) {
        DownloadInfo b = mo41245b(i);
        if (b != null) {
            b.setCurBytes(j, false);
            b.setStatus(-1);
            b.setFirstDownload(false);
        }
        return b;
    }

    /* renamed from: a */
    public final void mo41240a(int i, List<DownloadChunk> list) {
        if (list != null) {
            mo41258d(i);
            for (DownloadChunk downloadChunk : list) {
                if (downloadChunk != null) {
                    mo41242a(downloadChunk);
                    if (downloadChunk.mo41794d()) {
                        for (DownloadChunk a : downloadChunk.f55030g) {
                            mo41242a(a);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo41239a(int i, int i2, long j) {
        List<DownloadChunk> c = mo41253c(i);
        if (c != null) {
            for (DownloadChunk downloadChunk : c) {
                if (downloadChunk != null && downloadChunk.f55028e == i2) {
                    downloadChunk.mo41787a(j);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final DownloadInfo mo41234a(int i, long j, String str, String str2) {
        DownloadInfo b = mo41245b(i);
        if (b != null) {
            b.setTotalBytes(j);
            b.seteTag(str);
            if (TextUtils.isEmpty(b.getName()) && !TextUtils.isEmpty(str2)) {
                b.setName(str2);
            }
            b.setStatus(3);
        }
        return b;
    }

    /* renamed from: a */
    public final void mo41238a(int i, int i2, int i3, long j) {
        List c = mo41253c(i);
        if (c != null) {
            Iterator it = c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DownloadChunk downloadChunk = (DownloadChunk) it.next();
                if (downloadChunk != null && downloadChunk.f55028e == i3 && !downloadChunk.mo41794d()) {
                    if (downloadChunk.f55030g != null) {
                        for (DownloadChunk downloadChunk2 : downloadChunk.f55030g) {
                            if (downloadChunk2 != null && downloadChunk2.f55028e == i2) {
                                downloadChunk2.mo41787a(j);
                            }
                        }
                        return;
                    }
                }
            }
        }
    }
}
