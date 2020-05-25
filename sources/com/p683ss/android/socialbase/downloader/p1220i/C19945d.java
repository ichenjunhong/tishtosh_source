package com.p683ss.android.socialbase.downloader.p1220i;

import android.util.SparseArray;
import com.p683ss.android.socialbase.downloader.downloader.C19884b;
import com.p683ss.android.socialbase.downloader.p1212b.C19790k;
import com.p683ss.android.socialbase.downloader.p1219h.C19938a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.ss.android.socialbase.downloader.i.d */
public class C19945d {

    /* renamed from: a */
    public volatile SparseArray<C19941c> f54849a = new SparseArray<>();

    /* renamed from: b */
    public int f54850b;

    /* renamed from: a */
    public void mo41686a() {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f54849a.size(); i++) {
                int keyAt = this.f54849a.keyAt(i);
                if (!((C19941c) this.f54849a.get(keyAt)).mo41681e()) {
                    arrayList.add(Integer.valueOf(keyAt));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                try {
                    Integer num = (Integer) arrayList.get(i2);
                    if (num != null) {
                        this.f54849a.remove(num.intValue());
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: b */
    public final List<Integer> mo41689b() {
        ArrayList arrayList;
        synchronized (C19945d.class) {
            mo41686a();
            arrayList = new ArrayList();
            for (int i = 0; i < this.f54849a.size(); i++) {
                C19941c cVar = (C19941c) this.f54849a.get(this.f54849a.keyAt(i));
                if (cVar != null) {
                    arrayList.add(Integer.valueOf(cVar.mo41682f()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final void mo41690c(int i) {
        synchronized (C19945d.class) {
            mo41686a();
            C19941c cVar = (C19941c) this.f54849a.get(i);
            if (cVar != null) {
                cVar.mo41670a();
                m48986a(cVar);
                this.f54849a.remove(i);
            }
        }
    }

    /* renamed from: a */
    private static void m48986a(C19941c cVar) {
        try {
            ExecutorService g = C19884b.m48610g();
            if (g != null && (g instanceof ThreadPoolExecutor)) {
                ((ThreadPoolExecutor) g).remove(cVar);
                if (cVar != null && C19938a.m48929a(cVar.mo41682f()).mo41661a("pause_with_interrupt", false)) {
                    Future future = cVar.f54819a;
                    if (future != null) {
                        future.cancel(true);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final C19941c mo41688b(int i) {
        synchronized (C19945d.class) {
            mo41686a();
            C19941c cVar = (C19941c) this.f54849a.get(i);
            if (cVar == null) {
                return null;
            }
            cVar.f54822d = C19790k.RUN_STATUS_CANCELED;
            if (cVar.f54821c != null) {
                cVar.f54821c.mo41493b();
            } else {
                cVar.mo41678c();
                cVar.f54822d = C19790k.RUN_STATUS_CANCELED;
                cVar.mo41676b();
            }
            cVar.mo41683g();
            m48986a(cVar);
            this.f54849a.remove(i);
            return cVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo41687a(int r4) {
        /*
            r3 = this;
            java.lang.Class<com.ss.android.socialbase.downloader.i.d> r0 = com.p683ss.android.socialbase.downloader.p1220i.C19945d.class
            monitor-enter(r0)
            android.util.SparseArray<com.ss.android.socialbase.downloader.i.c> r1 = r3.f54849a     // Catch:{ all -> 0x0026 }
            r2 = 0
            if (r1 == 0) goto L_0x0024
            android.util.SparseArray<com.ss.android.socialbase.downloader.i.c> r1 = r3.f54849a     // Catch:{ all -> 0x0026 }
            int r1 = r1.size()     // Catch:{ all -> 0x0026 }
            if (r1 > 0) goto L_0x0011
            goto L_0x0024
        L_0x0011:
            android.util.SparseArray<com.ss.android.socialbase.downloader.i.c> r1 = r3.f54849a     // Catch:{ all -> 0x0026 }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x0026 }
            com.ss.android.socialbase.downloader.i.c r4 = (com.p683ss.android.socialbase.downloader.p1220i.C19941c) r4     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x0022
            boolean r4 = r4.mo41681e()     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x0022
            r2 = 1
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return r2
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return r2
        L_0x0026:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.p1220i.C19945d.mo41687a(int):boolean");
    }
}
