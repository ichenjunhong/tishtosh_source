package com.p683ss.android.socialbase.downloader.impls;

import android.database.sqlite.SQLiteException;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.p683ss.android.socialbase.downloader.downloader.C19884b;
import com.p683ss.android.socialbase.downloader.downloader.C19901k;
import com.p683ss.android.socialbase.downloader.downloader.C19903m;
import com.p683ss.android.socialbase.downloader.downloader.C19904n;
import com.p683ss.android.socialbase.downloader.downloader.C19909s;
import com.p683ss.android.socialbase.downloader.model.DownloadChunk;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.p1212b.C19783d;
import com.p683ss.android.socialbase.downloader.p1213c.C19798d;
import com.p683ss.android.socialbase.downloader.p1213c.C19799e;
import com.p683ss.android.socialbase.downloader.p1213c.C19811f;
import com.p683ss.android.socialbase.downloader.p1213c.C19811f.C19817a;
import com.p683ss.android.socialbase.downloader.p1214d.C19819a;
import com.p683ss.android.socialbase.downloader.p1219h.C19938a;
import com.p683ss.android.socialbase.downloader.p1220i.C19947f;
import com.p683ss.android.socialbase.downloader.p1220i.C19947f.C19948a;
import com.p683ss.android.socialbase.downloader.p1221j.C19994e;
import com.p683ss.android.socialbase.downloader.p1221j.C20039j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.impls.d */
public final class C19957d implements C19901k {

    /* renamed from: a */
    public final C19970k f54877a = new C19970k();

    /* renamed from: b */
    public C19909s f54878b;

    /* renamed from: c */
    volatile boolean f54879c;

    /* renamed from: d */
    private volatile boolean f54880d;

    /* renamed from: e */
    private C19948a f54881e = new C19948a() {
        /* renamed from: a */
        public final void mo41692a(Message message) {
            if (message.what == 1) {
                C19884b.m48611h().execute(new Runnable() {
                    public final void run() {
                        try {
                            C20039j.m49469a();
                            C19957d.this.mo41733e();
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        }
    };

    /* renamed from: f */
    private C19947f f54882f = null;

    /* renamed from: c */
    public final boolean mo41255c() {
        return this.f54879c;
    }

    /* renamed from: a */
    public final void mo41242a(DownloadChunk downloadChunk) {
        this.f54877a.mo41242a(downloadChunk);
        if (C19994e.m49366b()) {
            C19904n a = C19971l.m49132a(true);
            if (a != null) {
                a.mo41581a(downloadChunk);
            } else {
                this.f54878b.mo41242a(downloadChunk);
            }
        } else {
            this.f54878b.mo41242a(downloadChunk);
        }
    }

    /* renamed from: a */
    public final boolean mo41244a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return false;
        }
        boolean a = this.f54877a.mo41244a(downloadInfo);
        m49041c(downloadInfo);
        return a;
    }

    /* renamed from: a */
    public final void mo41240a(int i, List<DownloadChunk> list) {
        if (list != null && list.size() != 0) {
            this.f54877a.mo41240a(i, list);
            if (C19994e.m49377c()) {
                this.f54878b.mo41249b(i, list);
            }
        }
    }

    /* renamed from: b */
    public final void mo41248b() {
        try {
            this.f54877a.mo41248b();
        } catch (SQLiteException unused) {
        }
        if (C19994e.m49366b()) {
            C19904n a = C19971l.m49132a(true);
            if (a != null) {
                a.mo41607f();
            } else {
                this.f54878b.mo41248b();
            }
        } else {
            this.f54878b.mo41248b();
        }
    }

    public C19957d() {
        if (!C19938a.m48933b().mo41660a("fix_sigbus_downloader_db")) {
            this.f54878b = new C19799e();
        } else if (C19994e.m49347a()) {
            this.f54878b = new C19799e();
        } else {
            C19811f fVar = new C19811f();
            fVar.f54538g = new C19817a() {
                /* renamed from: a */
                public final void mo41295a() {
                    C19957d.this.f54878b = new C19799e();
                }
            };
            this.f54878b = fVar;
        }
        this.f54879c = false;
        this.f54882f = new C19947f(Looper.getMainLooper(), this.f54881e);
        C19884b.m48602a(C19783d.SYNC_START);
        this.f54878b.mo41272a(this.f54877a.f54897a, this.f54877a.f54898b, new C19798d() {
            /* renamed from: a */
            public final void mo41270a() {
                C19957d dVar = C19957d.this;
                synchronized (dVar) {
                    dVar.f54879c = true;
                    dVar.notifyAll();
                }
                C19957d.this.mo41732a();
                C19884b.m48602a(C19783d.SYNC_SUCCESS);
            }
        });
    }

    /* renamed from: d */
    public final boolean mo41259d() {
        if (this.f54879c) {
            return true;
        }
        synchronized (this) {
            if (!this.f54879c) {
                C19819a.m48486b("DefaultDownloadCache", "ensureDownloadCacheSyncSuccess: waiting start!!!!");
                try {
                    wait(5000);
                } catch (InterruptedException unused) {
                }
                C19819a.m48486b("DefaultDownloadCache", "ensureDownloadCacheSyncSuccess: waiting end!!!!");
            }
        }
        return this.f54879c;
    }

    /* renamed from: e */
    public final void mo41733e() {
        if (this.f54879c && !this.f54880d) {
            this.f54880d = true;
            if (C19994e.m49347a()) {
                C19903m l = C19884b.m48615l();
                if (l != null) {
                    List a = l.mo41566a();
                    if (a != null && !a.isEmpty()) {
                        SparseArray<DownloadInfo> sparseArray = this.f54877a.f54897a;
                        if (sparseArray != null) {
                            ArrayList arrayList = new ArrayList();
                            synchronized (sparseArray) {
                                for (int i = 0; i < sparseArray.size(); i++) {
                                    int keyAt = sparseArray.keyAt(i);
                                    if (keyAt != 0) {
                                        DownloadInfo downloadInfo = (DownloadInfo) sparseArray.get(keyAt);
                                        if (!(downloadInfo == null || !a.contains(downloadInfo.getMimeType()) || downloadInfo.getRealStatus() == -2)) {
                                            arrayList.add(downloadInfo);
                                        }
                                    }
                                }
                            }
                            arrayList.isEmpty();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo41732a() {
        long j;
        if (C19938a.m48933b().mo41660a("task_resume_delay")) {
            j = 4000;
        } else if (VERSION.SDK_INT >= 23) {
            j = 1000;
        } else {
            j = 5000;
        }
        this.f54882f.sendMessageDelayed(this.f54882f.obtainMessage(1), j);
    }

    /* renamed from: c */
    private void m49041c(DownloadInfo downloadInfo) {
        m49040a(downloadInfo, true);
    }

    /* renamed from: a */
    public final List<DownloadInfo> mo41235a(String str) {
        return this.f54877a.mo41235a(str);
    }

    /* renamed from: b */
    public final DownloadInfo mo41245b(int i) {
        return this.f54877a.mo41245b(i);
    }

    /* renamed from: d */
    public final List<DownloadInfo> mo41257d(String str) {
        return this.f54877a.mo41257d(str);
    }

    /* renamed from: g */
    public final DownloadInfo mo41263g(int i) {
        DownloadInfo g = this.f54877a.mo41263g(i);
        m49041c(g);
        return g;
    }

    /* renamed from: h */
    public final DownloadInfo mo41264h(int i) {
        DownloadInfo h = this.f54877a.mo41264h(i);
        m49041c(h);
        return h;
    }

    /* renamed from: i */
    public final DownloadInfo mo41265i(int i) {
        DownloadInfo i2 = this.f54877a.mo41265i(i);
        m49041c(i2);
        return i2;
    }

    /* renamed from: j */
    public final DownloadInfo mo41266j(int i) {
        DownloadInfo j = this.f54877a.mo41266j(i);
        m49041c(j);
        return j;
    }

    /* renamed from: b */
    public final List<DownloadInfo> mo41247b(String str) {
        return this.f54877a.mo41247b(str);
    }

    /* renamed from: c */
    public final List<DownloadChunk> mo41253c(int i) {
        return this.f54877a.mo41253c(i);
    }

    /* renamed from: c */
    public final List<DownloadInfo> mo41254c(String str) {
        return this.f54877a.mo41254c(str);
    }

    /* renamed from: d */
    public final void mo41258d(int i) {
        this.f54877a.mo41258d(i);
        if (C19994e.m49366b()) {
            C19904n a = C19971l.m49132a(true);
            if (a != null) {
                a.mo41617o(i);
            } else {
                this.f54878b.mo41258d(i);
            }
        } else {
            this.f54878b.mo41258d(i);
        }
    }

    /* renamed from: e */
    public final boolean mo41261e(int i) {
        try {
            if (C19994e.m49366b()) {
                C19904n a = C19971l.m49132a(true);
                if (a != null) {
                    a.mo41616n(i);
                } else {
                    this.f54878b.mo41261e(i);
                }
            } else {
                this.f54878b.mo41261e(i);
            }
        } catch (SQLiteException unused) {
        }
        return this.f54877a.mo41261e(i);
    }

    /* renamed from: f */
    public final boolean mo41262f(int i) {
        if (C19994e.m49366b()) {
            C19904n a = C19971l.m49132a(true);
            if (a != null) {
                a.mo41618p(i);
            } else {
                this.f54878b.mo41262f(i);
            }
        } else {
            this.f54878b.mo41262f(i);
        }
        return this.f54877a.mo41262f(i);
    }

    /* renamed from: b */
    public final void mo41250b(DownloadChunk downloadChunk) {
        if (C19994e.m49366b()) {
            C19904n a = C19971l.m49132a(true);
            if (a != null) {
                a.mo41581a(downloadChunk);
            } else {
                this.f54878b.mo41242a(downloadChunk);
            }
        } else {
            this.f54878b.mo41242a(downloadChunk);
        }
    }

    /* renamed from: b */
    public final void mo41251b(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            this.f54877a.mo41244a(downloadInfo);
        }
    }

    /* renamed from: a */
    public final DownloadInfo mo41232a(int i, int i2) {
        DownloadInfo a = this.f54877a.mo41232a(i, i2);
        m49041c(a);
        return a;
    }

    /* renamed from: b */
    public final DownloadInfo mo41246b(int i, long j) {
        DownloadInfo b = this.f54877a.mo41246b(i, j);
        mo41249b(i, null);
        return b;
    }

    /* renamed from: c */
    public final DownloadInfo mo41252c(int i, long j) {
        DownloadInfo c = this.f54877a.mo41252c(i, j);
        mo41249b(i, null);
        return c;
    }

    /* renamed from: d */
    public final DownloadInfo mo41256d(int i, long j) {
        DownloadInfo d = this.f54877a.mo41256d(i, j);
        mo41249b(i, null);
        return d;
    }

    /* renamed from: a */
    public final DownloadInfo mo41233a(int i, long j) {
        DownloadInfo a = this.f54877a.mo41233a(i, j);
        m49040a(a, false);
        return a;
    }

    /* renamed from: a */
    private void m49040a(DownloadInfo downloadInfo, boolean z) {
        if (downloadInfo != null) {
            if (!C19994e.m49366b()) {
                this.f54878b.mo41244a(downloadInfo);
            } else if (z) {
                C19904n a = C19971l.m49132a(true);
                if (a != null) {
                    a.mo41599c(downloadInfo);
                } else {
                    this.f54878b.mo41244a(downloadInfo);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo41249b(int i, List<DownloadChunk> list) {
        try {
            mo41244a(this.f54877a.mo41245b(i));
            if (list == null) {
                list = this.f54877a.mo41253c(i);
            }
            if (C19994e.m49366b()) {
                C19904n a = C19971l.m49132a(true);
                if (a != null) {
                    a.mo41589b(i, list);
                } else {
                    this.f54878b.mo41249b(i, list);
                }
            } else {
                this.f54878b.mo41249b(i, list);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo41239a(int i, int i2, long j) {
        this.f54877a.mo41239a(i, i2, j);
        if (C19994e.m49366b()) {
            C19904n a = C19971l.m49132a(true);
            if (a != null) {
                a.mo41574a(i, i2, j);
            } else {
                this.f54878b.mo41239a(i, i2, j);
            }
        } else {
            this.f54878b.mo41239a(i, i2, j);
        }
    }

    /* renamed from: a */
    public final DownloadInfo mo41234a(int i, long j, String str, String str2) {
        DownloadInfo a = this.f54877a.mo41234a(i, j, str, str2);
        m49041c(a);
        return a;
    }

    /* renamed from: a */
    public final void mo41237a(int i, int i2, int i3, int i4) {
        if (C19994e.m49366b()) {
            C19904n a = C19971l.m49132a(true);
            if (a != null) {
                a.mo41572a(i, i2, i3, i4);
            } else {
                this.f54878b.mo41237a(i, i2, i3, i4);
            }
        } else {
            this.f54878b.mo41237a(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public final void mo41238a(int i, int i2, int i3, long j) {
        if (C19994e.m49366b()) {
            C19904n a = C19971l.m49132a(true);
            if (a != null) {
                a.mo41573a(i, i2, i3, j);
            } else {
                this.f54878b.mo41238a(i, i2, i3, j);
            }
        } else {
            this.f54878b.mo41238a(i, i2, i3, j);
        }
    }
}
