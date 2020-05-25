package com.p683ss.android.socialbase.downloader.impls;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest.Builder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.p683ss.android.socialbase.downloader.downloader.C19884b;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.p1211a.C19776a;
import com.p683ss.android.socialbase.downloader.p1211a.C19776a.C19778a;
import com.p683ss.android.socialbase.downloader.p1214d.C19819a;
import com.p683ss.android.socialbase.downloader.p1219h.C19938a;
import com.p683ss.android.socialbase.downloader.p1221j.C19994e;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.impls.r */
public class C19983r implements Callback, C19778a {

    /* renamed from: e */
    private static volatile C19983r f54927e;

    /* renamed from: a */
    public final Context f54928a = C19884b.m48627x();

    /* renamed from: b */
    public final SparseArray<C19988a> f54929b = new SparseArray<>();

    /* renamed from: c */
    public int f54930c = 0;

    /* renamed from: d */
    public ConnectivityManager f54931d;

    /* renamed from: f */
    private final Handler f54932f = new Handler(Looper.getMainLooper(), this);

    /* renamed from: g */
    private final boolean f54933g;

    /* renamed from: h */
    private long f54934h;

    /* renamed from: com.ss.android.socialbase.downloader.impls.r$a */
    static class C19988a {

        /* renamed from: a */
        final int f54942a;

        /* renamed from: b */
        final int f54943b;

        /* renamed from: c */
        final int f54944c;

        /* renamed from: d */
        final int f54945d;

        /* renamed from: e */
        final int f54946e;

        /* renamed from: f */
        final boolean f54947f;

        /* renamed from: g */
        final int[] f54948g;

        /* renamed from: h */
        public int f54949h;

        /* renamed from: i */
        public int f54950i;

        /* renamed from: j */
        public boolean f54951j;

        /* renamed from: k */
        long f54952k;

        /* renamed from: l */
        public boolean f54953l;

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo41757c() {
            this.f54949h = this.f54945d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final synchronized void mo41754a() {
            this.f54949h += this.f54946e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final synchronized void mo41756b() {
            this.f54950i++;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final synchronized void mo41755a(long j) {
            this.f54952k = j;
        }

        C19988a(int i, int i2, int i3, int i4, int i5, boolean z, int[] iArr) {
            if (i4 < 20000) {
                i4 = 20000;
            }
            if (i5 < 20000) {
                i5 = 20000;
            }
            this.f54942a = i;
            this.f54943b = i2;
            this.f54944c = i3;
            this.f54945d = i4;
            this.f54946e = i5;
            this.f54947f = z;
            this.f54948g = iArr;
            this.f54949h = i4;
        }
    }

    /* renamed from: a */
    public final void mo41222a() {
        mo41745a(4, false);
    }

    /* renamed from: b */
    public final void mo41223b() {
        mo41745a(3, false);
    }

    /* renamed from: d */
    public final void mo41747d() {
        mo41745a(2, false);
    }

    /* renamed from: c */
    public static C19983r m49310c() {
        if (f54927e == null) {
            synchronized (C19983r.class) {
                if (f54927e == null) {
                    f54927e = new C19983r();
                }
            }
        }
        return f54927e;
    }

    /* renamed from: e */
    public final int mo41748e() {
        try {
            if (this.f54931d == null) {
                this.f54931d = (ConnectivityManager) this.f54928a.getApplicationContext().getSystemService("connectivity");
            }
            NetworkInfo a = C19989s.m49324a(this.f54931d);
            if (a != null) {
                if (a.isConnected()) {
                    if (a.getType() == 1) {
                        return 2;
                    }
                    return 1;
                }
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    private C19983r() {
        if (C19938a.m48933b().mo41658a("use_network_callback", 0) == 1) {
            C19884b.m48611h().execute(new Runnable() {
                public final void run() {
                    try {
                        if (C19983r.this.f54928a != null && VERSION.SDK_INT >= 21) {
                            C19983r.this.f54931d = (ConnectivityManager) C19983r.this.f54928a.getApplicationContext().getSystemService("connectivity");
                            C19983r.this.f54931d.registerNetworkCallback(new Builder().build(), new NetworkCallback() {
                                public final void onAvailable(Network network) {
                                    C19983r.this.mo41745a(1, true);
                                }
                            });
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
        this.f54933g = C19994e.m49377c();
        C19776a a = C19776a.m48304a();
        synchronized (a.f54469b) {
            if (!a.f54469b.contains(this)) {
                a.f54469b.add(this);
            }
        }
    }

    /* renamed from: c */
    private void m49311c(int i) {
        synchronized (this.f54929b) {
            this.f54929b.remove(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo41743a(final int i) {
        C19884b.m48611h().execute(new Runnable() {
            public final void run() {
                try {
                    C19983r.this.mo41744a(i, C19983r.this.mo41748e(), true);
                } catch (Exception unused) {
                }
            }
        });
    }

    /* renamed from: a */
    private static int[] m49308a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split(",");
            if (split.length <= 0) {
                return null;
            }
            int[] iArr = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                iArr[i] = Integer.parseInt(split[i]);
            }
            return iArr;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean handleMessage(Message message) {
        final boolean z;
        if (message.what == 0) {
            final int i = message.arg1;
            if (message.arg2 == 1) {
                z = true;
            } else {
                z = false;
            }
            C19884b.m48611h().execute(new Runnable() {
                /* JADX WARNING: Removed duplicated region for block: B:35:0x0084 A[Catch:{ Exception -> 0x00b4 }] */
                /* JADX WARNING: Removed duplicated region for block: B:59:0x008e A[SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r13 = this;
                        com.ss.android.socialbase.downloader.impls.r r0 = com.p683ss.android.socialbase.downloader.impls.C19983r.this     // Catch:{ Exception -> 0x00b4 }
                        int r0 = r0.f54930c     // Catch:{ Exception -> 0x00b4 }
                        if (r0 > 0) goto L_0x0007
                        return
                    L_0x0007:
                        com.ss.android.socialbase.downloader.impls.r r0 = com.p683ss.android.socialbase.downloader.impls.C19983r.this     // Catch:{ Exception -> 0x00b4 }
                        int r0 = r0.mo41748e()     // Catch:{ Exception -> 0x00b4 }
                        if (r0 != 0) goto L_0x0010
                        return
                    L_0x0010:
                        java.lang.String r1 = "RetryScheduler"
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b4 }
                        java.lang.String r3 = "doScheduleAllTaskRetry: mWaitingRetryTasksCount = "
                        r2.<init>(r3)     // Catch:{ Exception -> 0x00b4 }
                        com.ss.android.socialbase.downloader.impls.r r3 = com.p683ss.android.socialbase.downloader.impls.C19983r.this     // Catch:{ Exception -> 0x00b4 }
                        int r3 = r3.f54930c     // Catch:{ Exception -> 0x00b4 }
                        r2.append(r3)     // Catch:{ Exception -> 0x00b4 }
                        java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00b4 }
                        com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48484a(r1, r2)     // Catch:{ Exception -> 0x00b4 }
                        long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00b4 }
                        java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00b4 }
                        r3.<init>()     // Catch:{ Exception -> 0x00b4 }
                        com.ss.android.socialbase.downloader.impls.r r4 = com.p683ss.android.socialbase.downloader.impls.C19983r.this     // Catch:{ Exception -> 0x00b4 }
                        android.util.SparseArray<com.ss.android.socialbase.downloader.impls.r$a> r4 = r4.f54929b     // Catch:{ Exception -> 0x00b4 }
                        monitor-enter(r4)     // Catch:{ Exception -> 0x00b4 }
                        r5 = 0
                        r6 = 0
                    L_0x0037:
                        com.ss.android.socialbase.downloader.impls.r r7 = com.p683ss.android.socialbase.downloader.impls.C19983r.this     // Catch:{ all -> 0x00b1 }
                        android.util.SparseArray<com.ss.android.socialbase.downloader.impls.r$a> r7 = r7.f54929b     // Catch:{ all -> 0x00b1 }
                        int r7 = r7.size()     // Catch:{ all -> 0x00b1 }
                        if (r6 >= r7) goto L_0x0091
                        com.ss.android.socialbase.downloader.impls.r r7 = com.p683ss.android.socialbase.downloader.impls.C19983r.this     // Catch:{ all -> 0x00b1 }
                        android.util.SparseArray<com.ss.android.socialbase.downloader.impls.r$a> r7 = r7.f54929b     // Catch:{ all -> 0x00b1 }
                        java.lang.Object r7 = r7.valueAt(r6)     // Catch:{ all -> 0x00b1 }
                        com.ss.android.socialbase.downloader.impls.r$a r7 = (com.p683ss.android.socialbase.downloader.impls.C19983r.C19988a) r7     // Catch:{ all -> 0x00b1 }
                        if (r7 == 0) goto L_0x008e
                        int r8 = r0     // Catch:{ all -> 0x00b1 }
                        boolean r9 = r5     // Catch:{ all -> 0x00b1 }
                        boolean r10 = r7.f54953l     // Catch:{ all -> 0x00b1 }
                        if (r10 != 0) goto L_0x005d
                        java.lang.String r8 = "RetryScheduler"
                        java.lang.String r9 = "canRetry: mIsWaitingRetry is false, return false!!!"
                        com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48484a(r8, r9)     // Catch:{ all -> 0x00b1 }
                        goto L_0x0061
                    L_0x005d:
                        int r10 = r7.f54943b     // Catch:{ all -> 0x00b1 }
                        if (r10 >= r8) goto L_0x0063
                    L_0x0061:
                        r8 = 0
                        goto L_0x0082
                    L_0x0063:
                        int r8 = r7.f54950i     // Catch:{ all -> 0x00b1 }
                        int r10 = r7.f54944c     // Catch:{ all -> 0x00b1 }
                        if (r8 < r10) goto L_0x006a
                        goto L_0x0061
                    L_0x006a:
                        boolean r8 = r7.f54951j     // Catch:{ all -> 0x00b1 }
                        if (r8 == 0) goto L_0x0072
                        r8 = 2
                        if (r0 == r8) goto L_0x0072
                        goto L_0x0061
                    L_0x0072:
                        if (r9 != 0) goto L_0x0081
                        long r8 = r7.f54952k     // Catch:{ all -> 0x00b1 }
                        r10 = 0
                        long r8 = r1 - r8
                        int r10 = r7.f54945d     // Catch:{ all -> 0x00b1 }
                        long r10 = (long) r10     // Catch:{ all -> 0x00b1 }
                        int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                        if (r12 >= 0) goto L_0x0081
                        goto L_0x0061
                    L_0x0081:
                        r8 = 1
                    L_0x0082:
                        if (r8 == 0) goto L_0x008e
                        boolean r8 = r5     // Catch:{ all -> 0x00b1 }
                        if (r8 == 0) goto L_0x008b
                        r7.mo41757c()     // Catch:{ all -> 0x00b1 }
                    L_0x008b:
                        r3.add(r7)     // Catch:{ all -> 0x00b1 }
                    L_0x008e:
                        int r6 = r6 + 1
                        goto L_0x0037
                    L_0x0091:
                        monitor-exit(r4)     // Catch:{ all -> 0x00b1 }
                        int r1 = r3.size()     // Catch:{ Exception -> 0x00b4 }
                        if (r1 <= 0) goto L_0x00b0
                        java.util.Iterator r1 = r3.iterator()     // Catch:{ Exception -> 0x00b4 }
                    L_0x009c:
                        boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x00b4 }
                        if (r2 == 0) goto L_0x00b0
                        java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x00b4 }
                        com.ss.android.socialbase.downloader.impls.r$a r2 = (com.p683ss.android.socialbase.downloader.impls.C19983r.C19988a) r2     // Catch:{ Exception -> 0x00b4 }
                        com.ss.android.socialbase.downloader.impls.r r3 = com.p683ss.android.socialbase.downloader.impls.C19983r.this     // Catch:{ Exception -> 0x00b4 }
                        int r2 = r2.f54942a     // Catch:{ Exception -> 0x00b4 }
                        r3.mo41744a(r2, r0, r5)     // Catch:{ Exception -> 0x00b4 }
                        goto L_0x009c
                    L_0x00b0:
                        return
                    L_0x00b1:
                        r0 = move-exception
                        monitor-exit(r4)     // Catch:{ all -> 0x00b1 }
                        throw r0     // Catch:{ Exception -> 0x00b4 }
                    L_0x00b4:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.impls.C19983r.C199862.run():void");
                }
            });
        } else {
            StringBuilder sb = new StringBuilder("handleMessage, doSchedulerRetry, id = ");
            sb.append(message.what);
            C19819a.m48484a("RetryScheduler", sb.toString());
            mo41743a(message.what);
        }
        return true;
    }

    /* renamed from: b */
    private C19988a m49309b(int i) {
        int[] iArr;
        boolean z;
        int i2;
        int i3;
        C19988a aVar = (C19988a) this.f54929b.get(i);
        if (aVar == null) {
            synchronized (this.f54929b) {
                aVar = (C19988a) this.f54929b.get(i);
                if (aVar == null) {
                    C19938a a = C19938a.m48929a(i);
                    boolean z2 = false;
                    int a2 = a.mo41658a("retry_schedule", 0);
                    JSONObject b = a.mo41662b("retry_schedule_config");
                    int i4 = 60;
                    if (b != null) {
                        int optInt = b.optInt("max_count", 60);
                        int optInt2 = b.optInt("interval_sec", 60);
                        int optInt3 = b.optInt("interval_sec_acceleration", 60);
                        if (VERSION.SDK_INT >= 21 && b.optInt("use_job_scheduler", 0) == 1) {
                            z2 = true;
                        }
                        iArr = m49308a(b.optString("white_error_code"));
                        i3 = optInt3;
                        z = z2;
                        i2 = optInt;
                        i4 = optInt2;
                    } else {
                        iArr = null;
                        i3 = 60;
                        i2 = 60;
                        z = false;
                    }
                    C19988a aVar2 = new C19988a(i, a2, i2, i4 * 1000, i3 * 1000, z, iArr);
                    aVar = aVar2;
                }
                this.f54929b.put(i, aVar);
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private static boolean m49306a(C19988a aVar, int i) {
        int[] iArr = aVar.f54948g;
        if (iArr == null || iArr.length == 0) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
        r1 = new java.lang.StringBuilder("scheduleAllTaskRetry, level = [");
        r1.append(r8);
        r1.append("], force = [");
        r1.append(r9);
        r1.append("]");
        com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48484a("RetryScheduler", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r9 == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r7.f54932f.removeMessages(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        r1 = android.os.Message.obtain();
        r1.what = 0;
        r1.arg1 = r8;
        r1.arg2 = r9 ? 1 : 0;
        r7.f54932f.sendMessageDelayed(r1, 2000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41745a(int r8, boolean r9) {
        /*
            r7 = this;
            int r0 = r7.f54930c
            if (r0 > 0) goto L_0x0005
            return
        L_0x0005:
            long r0 = java.lang.System.currentTimeMillis()
            monitor-enter(r7)
            if (r9 != 0) goto L_0x001b
            long r2 = r7.f54934h     // Catch:{ all -> 0x0019 }
            r4 = 0
            long r2 = r0 - r2
            r4 = 20000(0x4e20, double:9.8813E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x001b
            monitor-exit(r7)     // Catch:{ all -> 0x0019 }
            return
        L_0x0019:
            r8 = move-exception
            goto L_0x0058
        L_0x001b:
            r7.f54934h = r0     // Catch:{ all -> 0x0019 }
            monitor-exit(r7)     // Catch:{ all -> 0x0019 }
            java.lang.String r0 = "RetryScheduler"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "scheduleAllTaskRetry, level = ["
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r2 = "], force = ["
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48484a(r0, r1)
            r0 = 0
            if (r9 == 0) goto L_0x0046
            android.os.Handler r1 = r7.f54932f
            r1.removeMessages(r0)
        L_0x0046:
            android.os.Message r1 = android.os.Message.obtain()
            r1.what = r0
            r1.arg1 = r8
            r1.arg2 = r9
            android.os.Handler r8 = r7.f54932f
            r2 = 2000(0x7d0, double:9.88E-321)
            r8.sendMessageDelayed(r1, r2)
            return
        L_0x0058:
            monitor-exit(r7)     // Catch:{ all -> 0x0019 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.impls.C19983r.mo41745a(int, boolean):void");
    }

    /* renamed from: a */
    private static boolean m49307a(DownloadInfo downloadInfo, BaseException baseException) {
        long j;
        long j2;
        try {
            j = C19994e.m49359b(downloadInfo.getTempPath());
        } catch (BaseException unused) {
            j = 0;
        }
        if (baseException instanceof DownloadOutOfSpaceException) {
            j2 = ((DownloadOutOfSpaceException) baseException).getRequiredSpaceBytes();
        } else {
            j2 = downloadInfo.getTotalBytes() - downloadInfo.getCurBytes();
        }
        if (j < j2) {
            C19938a a = C19938a.m48929a(downloadInfo.getId());
            if (a.mo41658a("space_fill_part_download", 0) != 1) {
                return false;
            }
            if (j > 0) {
                int a2 = a.mo41658a("space_fill_min_keep_mb", 100);
                if (a2 > 0) {
                    long j3 = j - (((long) a2) * 1048576);
                    StringBuilder sb = new StringBuilder("retry schedule: available = ");
                    sb.append(C19994e.m49330a(j));
                    sb.append("MB, minKeep = ");
                    sb.append(a2);
                    sb.append("MB, canDownload = ");
                    sb.append(C19994e.m49330a(j3));
                    sb.append("MB");
                    C19819a.m48484a("RetryScheduler", sb.toString());
                    if (j3 <= 0) {
                        C19819a.m48486b("RetryScheduler", "doSchedulerRetryInSubThread: canDownload <= 0 , canRetry = false !!!!");
                        return false;
                    }
                }
            } else if (a.mo41658a("download_when_space_negative", 0) != 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r3 = new java.lang.StringBuilder("doSchedulerRetryInSubThread: downloadId = ");
        r3.append(r8);
        r3.append(", retryCount = ");
        r3.append(r2.f54950i);
        r3.append(", mWaitingRetryTasksCount = ");
        r3.append(r7.f54930c);
        com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48484a("RetryScheduler", r3.toString());
        r1 = com.p683ss.android.socialbase.downloader.downloader.Downloader.getInstance(r0).getDownloadInfo(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        if (r1 != null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        m49311c(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        r3 = r1.getRealStatus();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (r3 == -3) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (r3 != -4) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (r3 != -5) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
        if (com.p683ss.android.socialbase.downloader.downloader.C19884b.m48615l() == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        java.util.Collections.singletonList(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0075, code lost:
        m49311c(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007a, code lost:
        if (r3 == -1) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007d, code lost:
        if (r9 != 0) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        if (r2.f54947f == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0083, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0085, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0086, code lost:
        r3 = r1.getFailedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008a, code lost:
        if (r4 == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0090, code lost:
        if (com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49378c((java.lang.Throwable) r3) == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0092, code lost:
        r4 = m49307a(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0096, code lost:
        r2.mo41756b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0099, code lost:
        if (r4 == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009b, code lost:
        r3 = new java.lang.StringBuilder("doSchedulerRetry: restart task, ****** id = ");
        r3.append(r2.f54942a);
        com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48484a("RetryScheduler", r3.toString());
        r2.mo41755a(java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b7, code lost:
        if (r10 == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b9, code lost:
        r2.mo41754a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bc, code lost:
        r1.setRetryScheduleCount(r2.f54950i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c5, code lost:
        if (r1.getStatus() != -1) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c7, code lost:
        com.p683ss.android.socialbase.downloader.downloader.Downloader.getInstance(r0).restart(r1.getId());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d3, code lost:
        if (r10 == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d5, code lost:
        r2.mo41754a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d8, code lost:
        mo41746a(r1, r1.isOnlyWifi(), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00df, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e0, code lost:
        m49311c(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e3, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41744a(int r8, int r9, boolean r10) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f54928a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.util.SparseArray<com.ss.android.socialbase.downloader.impls.r$a> r1 = r7.f54929b
            monitor-enter(r1)
            android.util.SparseArray<com.ss.android.socialbase.downloader.impls.r$a> r2 = r7.f54929b     // Catch:{ all -> 0x00e4 }
            java.lang.Object r2 = r2.get(r8)     // Catch:{ all -> 0x00e4 }
            com.ss.android.socialbase.downloader.impls.r$a r2 = (com.p683ss.android.socialbase.downloader.impls.C19983r.C19988a) r2     // Catch:{ all -> 0x00e4 }
            if (r2 != 0) goto L_0x0014
            monitor-exit(r1)     // Catch:{ all -> 0x00e4 }
            return
        L_0x0014:
            boolean r3 = r2.f54953l     // Catch:{ all -> 0x00e4 }
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0027
            r2.f54953l = r5     // Catch:{ all -> 0x00e4 }
            int r3 = r7.f54930c     // Catch:{ all -> 0x00e4 }
            int r3 = r3 - r4
            r7.f54930c = r3     // Catch:{ all -> 0x00e4 }
            int r3 = r7.f54930c     // Catch:{ all -> 0x00e4 }
            if (r3 >= 0) goto L_0x0027
            r7.f54930c = r5     // Catch:{ all -> 0x00e4 }
        L_0x0027:
            monitor-exit(r1)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "RetryScheduler"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "doSchedulerRetryInSubThread: downloadId = "
            r3.<init>(r6)
            r3.append(r8)
            java.lang.String r6 = ", retryCount = "
            r3.append(r6)
            int r6 = r2.f54950i
            r3.append(r6)
            java.lang.String r6 = ", mWaitingRetryTasksCount = "
            r3.append(r6)
            int r6 = r7.f54930c
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48484a(r1, r3)
            com.ss.android.socialbase.downloader.downloader.Downloader r1 = com.p683ss.android.socialbase.downloader.downloader.Downloader.getInstance(r0)
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r1.getDownloadInfo(r8)
            if (r1 != 0) goto L_0x005d
            r7.m49311c(r8)
            return
        L_0x005d:
            int r3 = r1.getRealStatus()
            r6 = -3
            if (r3 == r6) goto L_0x00e0
            r6 = -4
            if (r3 != r6) goto L_0x0069
            goto L_0x00e0
        L_0x0069:
            r6 = -5
            if (r3 != r6) goto L_0x0079
            com.ss.android.socialbase.downloader.downloader.m r9 = com.p683ss.android.socialbase.downloader.downloader.C19884b.m48615l()
            if (r9 == 0) goto L_0x0075
            java.util.Collections.singletonList(r1)
        L_0x0075:
            r7.m49311c(r8)
            return
        L_0x0079:
            r8 = -1
            if (r3 == r8) goto L_0x007d
            return
        L_0x007d:
            if (r9 != 0) goto L_0x0086
            boolean r3 = r2.f54947f
            if (r3 == 0) goto L_0x0085
            r4 = 0
            goto L_0x0086
        L_0x0085:
            return
        L_0x0086:
            com.ss.android.socialbase.downloader.exception.BaseException r3 = r1.getFailedException()
            if (r4 == 0) goto L_0x0096
            boolean r5 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49378c(r3)
            if (r5 == 0) goto L_0x0096
            boolean r4 = m49307a(r1, r3)
        L_0x0096:
            r2.mo41756b()
            if (r4 == 0) goto L_0x00d3
            java.lang.String r9 = "RetryScheduler"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "doSchedulerRetry: restart task, ****** id = "
            r3.<init>(r4)
            int r4 = r2.f54942a
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48484a(r9, r3)
            long r3 = java.lang.System.currentTimeMillis()
            r2.mo41755a(r3)
            if (r10 == 0) goto L_0x00bc
            r2.mo41754a()
        L_0x00bc:
            int r9 = r2.f54950i
            r1.setRetryScheduleCount(r9)
            int r9 = r1.getStatus()
            if (r9 != r8) goto L_0x00df
            com.ss.android.socialbase.downloader.downloader.Downloader r8 = com.p683ss.android.socialbase.downloader.downloader.Downloader.getInstance(r0)
            int r9 = r1.getId()
            r8.restart(r9)
            return
        L_0x00d3:
            if (r10 == 0) goto L_0x00d8
            r2.mo41754a()
        L_0x00d8:
            boolean r8 = r1.isOnlyWifi()
            r7.mo41746a(r1, r8, r9)
        L_0x00df:
            return
        L_0x00e0:
            r7.m49311c(r8)
            return
        L_0x00e4:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e4 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.impls.C19983r.mo41744a(int, int, boolean):void");
    }

    /* renamed from: a */
    public void mo41746a(DownloadInfo downloadInfo, boolean z, int i) {
        BaseException failedException = downloadInfo.getFailedException();
        if (failedException != null) {
            C19988a b = m49309b(downloadInfo.getId());
            if (b.f54950i > b.f54944c) {
                StringBuilder sb = new StringBuilder("tryStartScheduleRetry, id = ");
                sb.append(b.f54942a);
                sb.append(", mRetryCount = ");
                sb.append(b.f54950i);
                sb.append(", maxCount = ");
                sb.append(b.f54944c);
                C19819a.m48486b("RetryScheduler", sb.toString());
                return;
            }
            int errorCode = failedException.getErrorCode();
            if (!C19994e.m49378c((Throwable) failedException) && !C19994e.m49381d((Throwable) failedException)) {
                if (m49306a(b, errorCode)) {
                    StringBuilder sb2 = new StringBuilder("white error code, id = ");
                    sb2.append(b.f54942a);
                    sb2.append(", error code = ");
                    sb2.append(errorCode);
                    C19819a.m48484a("RetryScheduler", sb2.toString());
                } else {
                    return;
                }
            }
            b.f54951j = z;
            synchronized (this.f54929b) {
                if (!b.f54953l) {
                    b.f54953l = true;
                    this.f54930c++;
                }
            }
            int i2 = b.f54949h;
            StringBuilder sb3 = new StringBuilder("tryStartScheduleRetry: id = ");
            sb3.append(b.f54942a);
            sb3.append(", delayTimeMills = ");
            sb3.append(i2);
            sb3.append(", mWaitingRetryTasks = ");
            sb3.append(this.f54930c);
            C19819a.m48484a("RetryScheduler", sb3.toString());
            if (b.f54947f) {
                if (i == 0) {
                    b.mo41757c();
                }
                RetryJobSchedulerService.m49003a(downloadInfo, (long) i2, z, i);
                if (this.f54933g) {
                    b.mo41755a(System.currentTimeMillis());
                    b.mo41756b();
                    b.mo41754a();
                }
            } else if (!z) {
                this.f54932f.removeMessages(downloadInfo.getId());
                this.f54932f.sendEmptyMessageDelayed(downloadInfo.getId(), (long) i2);
            }
        }
    }
}
