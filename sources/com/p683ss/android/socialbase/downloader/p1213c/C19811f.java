package com.p683ss.android.socialbase.downloader.p1213c;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.SparseArray;
import com.p683ss.android.socialbase.downloader.downloader.C19884b;
import com.p683ss.android.socialbase.downloader.downloader.C19909s;
import com.p683ss.android.socialbase.downloader.downloader.SqlDownloadCacheService;
import com.p683ss.android.socialbase.downloader.model.DownloadChunk;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.p1214d.C19819a;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.ss.android.socialbase.downloader.c.f */
public final class C19811f implements ServiceConnection, C19909s {

    /* renamed from: b */
    public static boolean f54532b;

    /* renamed from: c */
    static int f54533c;

    /* renamed from: d */
    static long f54534d;

    /* renamed from: a */
    C19795c f54535a;

    /* renamed from: e */
    public Handler f54536e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    CountDownLatch f54537f = new CountDownLatch(1);

    /* renamed from: g */
    public C19817a f54538g;

    /* renamed from: h */
    public Runnable f54539h = new Runnable() {
        public final void run() {
            if (!C19811f.f54532b && C19811f.this.f54538g != null) {
                C19811f.this.f54538g.mo41295a();
            }
        }
    };

    /* renamed from: i */
    private C19792b f54540i = null;

    /* renamed from: com.ss.android.socialbase.downloader.c.f$a */
    public interface C19817a {
        /* renamed from: a */
        void mo41295a();
    }

    /* renamed from: a */
    public final void mo41272a(final SparseArray<DownloadInfo> sparseArray, final SparseArray<List<DownloadChunk>> sparseArray2, final C19798d dVar) {
        C19884b.m48611h().submit(new Runnable() {
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0015 */
            /* JADX WARNING: Removed duplicated region for block: B:6:0x0019 A[Catch:{ RemoteException -> 0x001f }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r5 = this;
                    com.ss.android.socialbase.downloader.c.f r0 = com.p683ss.android.socialbase.downloader.p1213c.C19811f.this
                    com.ss.android.socialbase.downloader.c.f$4$1 r1 = new com.ss.android.socialbase.downloader.c.f$4$1
                    r1.<init>()
                    r0.mo41288a(r1)
                    com.ss.android.socialbase.downloader.c.f r0 = com.p683ss.android.socialbase.downloader.p1213c.C19811f.this
                    java.util.concurrent.CountDownLatch r1 = r0.f54537f     // Catch:{ InterruptedException -> 0x0015 }
                    r2 = 5000(0x1388, double:2.4703E-320)
                    java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0015 }
                    r1.await(r2, r4)     // Catch:{ InterruptedException -> 0x0015 }
                L_0x0015:
                    com.ss.android.socialbase.downloader.c.c r1 = r0.f54535a     // Catch:{ RemoteException -> 0x001f }
                    if (r1 == 0) goto L_0x001e
                    com.ss.android.socialbase.downloader.c.c r0 = r0.f54535a     // Catch:{ RemoteException -> 0x001f }
                    r0.mo41236a()     // Catch:{ RemoteException -> 0x001f }
                L_0x001e:
                    return
                L_0x001f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.p1213c.C19811f.C198154.run():void");
            }
        });
    }

    /* renamed from: a */
    public final void mo41288a(C19792b bVar) {
        synchronized (this) {
            if (this.f54535a != null) {
                try {
                    this.f54535a.mo41241a(bVar);
                } catch (RemoteException unused) {
                }
            } else {
                this.f54540i = bVar;
            }
        }
    }

    /* renamed from: a */
    public final void mo41242a(DownloadChunk downloadChunk) {
        try {
            if (this.f54535a != null) {
                this.f54535a.mo41242a(downloadChunk);
            }
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo41244a(DownloadInfo downloadInfo) {
        try {
            if (this.f54535a != null) {
                return this.f54535a.mo41244a(downloadInfo);
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public C19811f() {
        SqlDownloadCacheService.m48575a(C19884b.m48627x(), this);
    }

    /* renamed from: b */
    public final void mo41248b() {
        try {
            if (this.f54535a != null) {
                this.f54535a.mo41248b();
            }
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: c */
    public final boolean mo41255c() {
        try {
            if (this.f54535a != null) {
                return this.f54535a.mo41255c();
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo41259d() {
        try {
            if (this.f54535a != null) {
                return this.f54535a.mo41259d();
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f54535a = null;
        f54532b = false;
    }

    /* renamed from: b */
    public final DownloadInfo mo41245b(int i) {
        try {
            if (this.f54535a != null) {
                return this.f54535a.mo41245b(i);
            }
        } catch (RemoteException unused) {
        }
        return null;
    }

    /* renamed from: e */
    public final boolean mo41261e(int i) {
        try {
            if (this.f54535a != null) {
                return this.f54535a.mo41261e(i);
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo41262f(int i) {
        try {
            if (this.f54535a != null) {
                return this.f54535a.mo41262f(i);
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    /* renamed from: g */
    public final DownloadInfo mo41263g(int i) {
        try {
            if (this.f54535a != null) {
                return this.f54535a.mo41263g(i);
            }
        } catch (RemoteException unused) {
        }
        return null;
    }

    /* renamed from: h */
    public final DownloadInfo mo41264h(int i) {
        try {
            if (this.f54535a != null) {
                return this.f54535a.mo41264h(i);
            }
        } catch (RemoteException unused) {
        }
        return null;
    }

    /* renamed from: i */
    public final DownloadInfo mo41265i(int i) {
        try {
            if (this.f54535a != null) {
                return this.f54535a.mo41265i(i);
            }
        } catch (RemoteException unused) {
        }
        return null;
    }

    /* renamed from: j */
    public final DownloadInfo mo41266j(int i) {
        try {
            if (this.f54535a != null) {
                return this.f54535a.mo41266j(i);
            }
        } catch (RemoteException unused) {
        }
        return null;
    }

    /* renamed from: c */
    public final List<DownloadChunk> mo41253c(int i) {
        try {
            if (this.f54535a != null) {
                return this.f54535a.mo41253c(i);
            }
        } catch (RemoteException unused) {
        }
        return null;
    }

    /* renamed from: d */
    public final List<DownloadInfo> mo41257d(String str) {
        try {
            if (this.f54535a != null) {
                return this.f54535a.mo41257d(str);
            }
        } catch (RemoteException unused) {
        }
        return null;
    }

    /* renamed from: b */
    public final List<DownloadInfo> mo41247b(String str) {
        try {
            if (this.f54535a != null) {
                return this.f54535a.mo41247b(str);
            }
        } catch (RemoteException unused) {
        }
        return null;
    }

    /* renamed from: c */
    public final List<DownloadInfo> mo41254c(String str) {
        try {
            if (this.f54535a != null) {
                return this.f54535a.mo41254c(str);
            }
        } catch (RemoteException unused) {
        }
        return null;
    }

    /* renamed from: d */
    public final void mo41258d(int i) {
        try {
            if (this.f54535a != null) {
                this.f54535a.mo41258d(i);
            }
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public final List<DownloadInfo> mo41235a(String str) {
        try {
            if (this.f54535a != null) {
                return this.f54535a.mo41235a(str);
            }
        } catch (RemoteException unused) {
        }
        return null;
    }

    /* renamed from: b */
    public final void mo41250b(DownloadChunk downloadChunk) {
        try {
            if (this.f54535a != null) {
                this.f54535a.mo41250b(downloadChunk);
            }
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: b */
    public final void mo41251b(DownloadInfo downloadInfo) {
        try {
            if (this.f54535a != null) {
                this.f54535a.mo41251b(downloadInfo);
            }
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public final DownloadInfo mo41232a(int i, int i2) {
        try {
            if (this.f54535a != null) {
                return this.f54535a.mo41232a(i, i2);
            }
        } catch (RemoteException unused) {
        }
        return null;
    }

    /* renamed from: c */
    public final DownloadInfo mo41252c(int i, long j) {
        try {
            if (this.f54535a != null) {
                return this.f54535a.mo41252c(i, j);
            }
        } catch (RemoteException unused) {
        }
        return null;
    }

    /* renamed from: d */
    public final DownloadInfo mo41256d(int i, long j) {
        try {
            if (this.f54535a != null) {
                return this.f54535a.mo41256d(i, j);
            }
        } catch (RemoteException unused) {
        }
        return null;
    }

    /* renamed from: a */
    public final DownloadInfo mo41233a(int i, long j) {
        try {
            if (this.f54535a != null) {
                return this.f54535a.mo41233a(i, j);
            }
        } catch (RemoteException unused) {
        }
        return null;
    }

    /* renamed from: b */
    public final DownloadInfo mo41246b(int i, long j) {
        try {
            if (this.f54535a != null) {
                return this.f54535a.mo41246b(i, j);
            }
        } catch (RemoteException unused) {
        }
        return null;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        CountDownLatch countDownLatch;
        C19795c cVar;
        f54532b = true;
        this.f54536e.removeCallbacks(this.f54539h);
        synchronized (this) {
            if (iBinder == null) {
                cVar = null;
            } else {
                try {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof C19795c)) {
                        cVar = new C19797a(iBinder);
                    } else {
                        cVar = (C19795c) queryLocalInterface;
                    }
                } catch (Throwable unused) {
                    String str = "SqlDownloadCacheAidlWra";
                    try {
                        if (C19819a.f54556a != null) {
                            C19819a.m48482a(str);
                        }
                        if (this.f54538g != null) {
                            this.f54538g.mo41295a();
                        }
                        countDownLatch = this.f54537f;
                    } catch (Throwable th) {
                        this.f54537f.countDown();
                        throw th;
                    }
                }
            }
            this.f54535a = cVar;
            if (!(this.f54540i == null || this.f54535a == null)) {
                this.f54535a.mo41241a(this.f54540i);
            }
            iBinder.linkToDeath(new DeathRecipient() {
                public final void binderDied() {
                    boolean z = false;
                    C19811f.f54532b = false;
                    C19811f fVar = C19811f.this;
                    if (VERSION.SDK_INT < 26 && !C19811f.f54532b) {
                        if (C19811f.f54533c > 5) {
                            C19819a.m48486b("SqlDownloadCacheAidlWra", "bindMainProcess: bind too many times!!! ");
                        } else {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (currentTimeMillis - C19811f.f54534d < 15000) {
                                C19819a.m48486b("SqlDownloadCacheAidlWra", "bindMainProcess: time too short since last bind!!! ");
                            } else {
                                C19811f.f54533c++;
                                C19811f.f54534d = currentTimeMillis;
                                fVar.f54536e.postDelayed(new Runnable() {
                                    public final void run() {
                                        SqlDownloadCacheService.m48575a(C19884b.m48627x(), C19811f.this);
                                    }
                                }, 1000);
                                z = true;
                            }
                        }
                    }
                    if (!z && C19811f.this.f54538g != null) {
                        C19811f.this.f54536e.postDelayed(C19811f.this.f54539h, 2000);
                    }
                }
            }, 0);
            countDownLatch = this.f54537f;
            countDownLatch.countDown();
        }
    }

    /* renamed from: b */
    public final void mo41249b(int i, List<DownloadChunk> list) {
        try {
            if (this.f54535a != null) {
                this.f54535a.mo41249b(i, list);
            }
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public final void mo41240a(int i, List<DownloadChunk> list) {
        try {
            if (this.f54535a != null) {
                this.f54535a.mo41240a(i, list);
            }
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public final void mo41239a(int i, int i2, long j) {
        try {
            if (this.f54535a != null) {
                this.f54535a.mo41239a(i, i2, j);
            }
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public final DownloadInfo mo41234a(int i, long j, String str, String str2) {
        try {
            if (this.f54535a != null) {
                return this.f54535a.mo41234a(i, j, str, str2);
            }
        } catch (RemoteException unused) {
        }
        return null;
    }

    /* renamed from: a */
    public final void mo41237a(int i, int i2, int i3, int i4) {
        try {
            if (this.f54535a != null) {
                this.f54535a.mo41237a(i, i2, i3, i4);
            }
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public final void mo41238a(int i, int i2, int i3, long j) {
        try {
            if (this.f54535a != null) {
                this.f54535a.mo41238a(i, i2, i3, j);
            }
        } catch (RemoteException unused) {
        }
    }
}
