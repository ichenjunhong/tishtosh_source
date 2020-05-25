package com.p683ss.android.socialbase.downloader.downloader;

import android.app.AlarmManager;
import android.content.Context;
import com.p683ss.android.socialbase.downloader.depend.C19826ac;
import com.p683ss.android.socialbase.downloader.depend.C19846i;
import com.p683ss.android.socialbase.downloader.depend.C19874y;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.impls.C19950a;
import com.p683ss.android.socialbase.downloader.impls.C19955b;
import com.p683ss.android.socialbase.downloader.impls.C19956c;
import com.p683ss.android.socialbase.downloader.impls.C19957d;
import com.p683ss.android.socialbase.downloader.impls.C19962e;
import com.p683ss.android.socialbase.downloader.impls.C19963f;
import com.p683ss.android.socialbase.downloader.impls.C19965g;
import com.p683ss.android.socialbase.downloader.impls.C19967h;
import com.p683ss.android.socialbase.downloader.impls.C19968i;
import com.p683ss.android.socialbase.downloader.impls.C19969j;
import com.p683ss.android.socialbase.downloader.impls.C19974n;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.HttpHeader;
import com.p683ss.android.socialbase.downloader.p1212b.C19783d;
import com.p683ss.android.socialbase.downloader.p1216f.C19924c;
import com.p683ss.android.socialbase.downloader.p1216f.C19925d;
import com.p683ss.android.socialbase.downloader.p1216f.C19926e;
import com.p683ss.android.socialbase.downloader.p1216f.C19927f;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.C53661n;
import okhttp3.C53682y;
import okhttp3.C53682y.C53684a;
import okhttp3.C53685z;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.downloader.b */
public class C19884b {

    /* renamed from: A */
    private static volatile AlarmManager f54599A;

    /* renamed from: B */
    private static boolean f54600B = false;

    /* renamed from: C */
    private static int f54601C;

    /* renamed from: D */
    private static final int f54602D = (Runtime.getRuntime().availableProcessors() + 1);

    /* renamed from: E */
    private static final int f54603E = ((Runtime.getRuntime().availableProcessors() * 2) + 1);

    /* renamed from: F */
    private static final int f54604F = (Runtime.getRuntime().availableProcessors() + 1);

    /* renamed from: G */
    private static int f54605G = VideoCacheReadBuffersizeExperiment.DEFAULT;

    /* renamed from: H */
    private static boolean f54606H;

    /* renamed from: I */
    private static int f54607I;

    /* renamed from: J */
    private static JSONObject f54608J;

    /* renamed from: K */
    private static volatile boolean f54609K = false;

    /* renamed from: a */
    public static volatile C19874y f54610a;

    /* renamed from: b */
    public static volatile List<C19826ac> f54611b = new ArrayList();

    /* renamed from: c */
    static volatile List<C19846i> f54612c = new ArrayList();

    /* renamed from: d */
    static boolean f54613d = true;

    /* renamed from: e */
    private static volatile Context f54614e;

    /* renamed from: f */
    private static volatile C19901k f54615f;

    /* renamed from: g */
    private static volatile C19902l f54616g;

    /* renamed from: h */
    private static volatile C19897i f54617h;

    /* renamed from: i */
    private static volatile C19950a f54618i;

    /* renamed from: j */
    private static volatile C19906p f54619j;

    /* renamed from: k */
    private static volatile C19906p f54620k;

    /* renamed from: l */
    private static volatile C19927f f54621l;

    /* renamed from: m */
    private static volatile C19925d f54622m;

    /* renamed from: n */
    private static volatile C19927f f54623n;

    /* renamed from: o */
    private static volatile C19925d f54624o;

    /* renamed from: p */
    private static volatile C19903m f54625p;

    /* renamed from: q */
    private static volatile ExecutorService f54626q;

    /* renamed from: r */
    private static volatile ExecutorService f54627r;

    /* renamed from: s */
    private static volatile ExecutorService f54628s;

    /* renamed from: t */
    private static volatile ExecutorService f54629t;

    /* renamed from: u */
    private static volatile C19896h f54630u;

    /* renamed from: v */
    private static volatile DownloadReceiver f54631v;

    /* renamed from: w */
    private static volatile C19908r f54632w;

    /* renamed from: x */
    private static volatile C19907q f54633x;

    /* renamed from: y */
    private static volatile boolean f54634y = false;

    /* renamed from: z */
    private static volatile C53682y f54635z = null;

    private C19884b() {
    }

    /* renamed from: r */
    public static int m48621r() {
        return f54607I;
    }

    /* renamed from: a */
    private static synchronized void m48604a(C19903m mVar) {
        synchronized (C19884b.class) {
            if (mVar != null) {
                f54625p = mVar;
                if (f54615f instanceof C19957d) {
                    ((C19957d) f54615f).mo41732a();
                }
            }
        }
    }

    /* renamed from: c */
    public static synchronized boolean m48606c() {
        boolean z;
        synchronized (C19884b.class) {
            z = f54634y;
        }
        return z;
    }

    /* renamed from: d */
    public static List<C19826ac> m48607d() {
        List<C19826ac> list;
        synchronized (f54611b) {
            list = f54611b;
        }
        return list;
    }

    /* renamed from: f */
    public static synchronized C19907q m48609f() {
        C19907q qVar;
        synchronized (C19884b.class) {
            qVar = f54633x;
        }
        return qVar;
    }

    /* renamed from: l */
    public static synchronized C19903m m48615l() {
        C19903m mVar;
        synchronized (C19884b.class) {
            mVar = f54625p;
        }
        return mVar;
    }

    /* renamed from: s */
    public static JSONObject m48622s() {
        if (f54608J == null) {
            f54608J = new JSONObject();
        }
        return f54608J;
    }

    /* renamed from: t */
    public static synchronized int m48623t() {
        int i;
        synchronized (C19884b.class) {
            i = f54605G;
        }
        return i;
    }

    /* renamed from: x */
    public static synchronized Context m48627x() {
        Context context;
        synchronized (C19884b.class) {
            context = f54614e;
        }
        return context;
    }

    /* renamed from: y */
    public static synchronized boolean m48628y() {
        boolean z;
        synchronized (C19884b.class) {
            z = f54606H;
        }
        return z;
    }

    /* renamed from: A */
    private static C19925d m48593A() {
        if (f54622m == null) {
            synchronized (C19884b.class) {
                if (f54622m == null) {
                    f54622m = new C19963f();
                }
            }
        }
        return f54622m;
    }

    /* renamed from: B */
    private static C19927f m48594B() {
        if (f54623n == null) {
            synchronized (C19884b.class) {
                if (f54623n == null) {
                    f54623n = new C19965g();
                }
            }
        }
        return f54623n;
    }

    /* renamed from: C */
    private static C19925d m48595C() {
        if (f54624o == null) {
            synchronized (C19884b.class) {
                if (f54624o == null) {
                    f54624o = new C19963f();
                }
            }
        }
        return f54624o;
    }

    /* renamed from: m */
    public static C19901k m48616m() {
        if (f54615f == null) {
            synchronized (C19884b.class) {
                if (f54615f == null) {
                    f54615f = new C19957d();
                }
            }
        }
        return f54615f;
    }

    /* renamed from: n */
    public static C19906p m48617n() {
        if (f54619j == null) {
            synchronized (C19884b.class) {
                if (f54619j == null) {
                    f54619j = new C19967h();
                }
            }
        }
        return f54619j;
    }

    /* renamed from: o */
    public static C19906p m48618o() {
        if (f54620k == null) {
            synchronized (C19884b.class) {
                if (f54620k == null) {
                    f54620k = new C19974n();
                }
            }
        }
        return f54620k;
    }

    /* renamed from: p */
    public static C19902l m48619p() {
        if (f54616g == null) {
            synchronized (C19884b.class) {
                if (f54616g == null) {
                    f54616g = new C19968i();
                }
            }
        }
        return f54616g;
    }

    /* renamed from: q */
    public static C19950a m48620q() {
        if (f54618i == null) {
            synchronized (C19884b.class) {
                if (f54618i == null) {
                    f54618i = new C19962e();
                }
            }
        }
        return f54618i;
    }

    /* renamed from: u */
    public static C19897i m48624u() {
        if (f54617h == null) {
            synchronized (C19884b.class) {
                if (f54617h == null) {
                    f54617h = new C19956c();
                }
            }
        }
        return f54617h;
    }

    /* renamed from: v */
    public static C19896h m48625v() {
        if (f54630u == null) {
            synchronized (C19884b.class) {
                if (f54630u == null) {
                    f54630u = new C19955b();
                }
            }
        }
        return f54630u;
    }

    /* renamed from: w */
    public static C19908r m48626w() {
        if (f54632w == null) {
            synchronized (C19884b.class) {
                if (f54632w == null) {
                    f54632w = new C19969j();
                }
            }
        }
        return f54632w;
    }

    /* renamed from: z */
    private static C19927f m48629z() {
        if (f54621l == null) {
            synchronized (C19884b.class) {
                if (f54621l == null) {
                    f54621l = new C19965g();
                }
            }
        }
        return f54621l;
    }

    /* renamed from: e */
    public static AlarmManager m48608e() {
        if (f54599A == null) {
            synchronized (C19884b.class) {
                if (f54599A == null && f54614e != null) {
                    f54599A = (AlarmManager) f54614e.getSystemService("alarm");
                }
            }
        }
        return f54599A;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:7|(1:11)|12|13|14|15|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0036 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.concurrent.ExecutorService m48610g() {
        /*
            java.util.concurrent.ExecutorService r0 = f54626q
            if (r0 != 0) goto L_0x003d
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.b> r0 = com.p683ss.android.socialbase.downloader.downloader.C19884b.class
            monitor-enter(r0)
            java.util.concurrent.ExecutorService r1 = f54626q     // Catch:{ all -> 0x003a }
            if (r1 != 0) goto L_0x0038
            int r1 = f54601C     // Catch:{ all -> 0x003a }
            if (r1 <= 0) goto L_0x0015
            int r1 = f54601C     // Catch:{ all -> 0x003a }
            int r2 = f54602D     // Catch:{ all -> 0x003a }
            if (r1 <= r2) goto L_0x0019
        L_0x0015:
            int r1 = f54602D     // Catch:{ all -> 0x003a }
            f54601C = r1     // Catch:{ all -> 0x003a }
        L_0x0019:
            int r4 = f54601C     // Catch:{ all -> 0x003a }
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x003a }
            r5 = 15
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x003a }
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue     // Catch:{ all -> 0x003a }
            r8.<init>()     // Catch:{ all -> 0x003a }
            com.ss.android.socialbase.downloader.i.a r9 = new com.ss.android.socialbase.downloader.i.a     // Catch:{ all -> 0x003a }
            java.lang.String r2 = "DownloadThreadPool-cpu-fixed"
            r10 = 1
            r9.<init>(r2, r10)     // Catch:{ all -> 0x003a }
            r2 = r1
            r3 = r4
            r2.<init>(r3, r4, r5, r7, r8, r9)     // Catch:{ all -> 0x003a }
            r1.allowCoreThreadTimeOut(r10)     // Catch:{ Throwable -> 0x0036 }
        L_0x0036:
            f54626q = r1     // Catch:{ all -> 0x003a }
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            goto L_0x003d
        L_0x003a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r1
        L_0x003d:
            java.util.concurrent.ExecutorService r0 = f54626q
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.downloader.C19884b.m48610g():java.util.concurrent.ExecutorService");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0028 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.concurrent.ExecutorService m48611h() {
        /*
            java.util.concurrent.ExecutorService r0 = f54627r
            if (r0 != 0) goto L_0x002f
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.b> r0 = com.p683ss.android.socialbase.downloader.downloader.C19884b.class
            monitor-enter(r0)
            java.util.concurrent.ExecutorService r1 = f54627r     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x002a
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x002c }
            int r4 = f54603E     // Catch:{ all -> 0x002c }
            r5 = 15
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x002c }
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue     // Catch:{ all -> 0x002c }
            r8.<init>()     // Catch:{ all -> 0x002c }
            com.ss.android.socialbase.downloader.i.a r9 = new com.ss.android.socialbase.downloader.i.a     // Catch:{ all -> 0x002c }
            java.lang.String r2 = "DownloadThreadPool-io-fixed"
            r10 = 1
            r9.<init>(r2, r10)     // Catch:{ all -> 0x002c }
            r2 = r1
            r3 = r4
            r2.<init>(r3, r4, r5, r7, r8, r9)     // Catch:{ all -> 0x002c }
            r1.allowCoreThreadTimeOut(r10)     // Catch:{ Throwable -> 0x0028 }
        L_0x0028:
            f54627r = r1     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            goto L_0x002f
        L_0x002c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r1
        L_0x002f:
            java.util.concurrent.ExecutorService r0 = f54627r
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.downloader.C19884b.m48611h():java.util.concurrent.ExecutorService");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0028 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.concurrent.ExecutorService m48612i() {
        /*
            java.util.concurrent.ExecutorService r0 = f54629t
            if (r0 != 0) goto L_0x002f
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.b> r0 = com.p683ss.android.socialbase.downloader.downloader.C19884b.class
            monitor-enter(r0)
            java.util.concurrent.ExecutorService r1 = f54629t     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x002a
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x002c }
            int r4 = f54603E     // Catch:{ all -> 0x002c }
            r5 = 15
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x002c }
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue     // Catch:{ all -> 0x002c }
            r8.<init>()     // Catch:{ all -> 0x002c }
            com.ss.android.socialbase.downloader.i.a r9 = new com.ss.android.socialbase.downloader.i.a     // Catch:{ all -> 0x002c }
            java.lang.String r2 = "DownloadThreadPool-chunk-fixed"
            r10 = 1
            r9.<init>(r2, r10)     // Catch:{ all -> 0x002c }
            r2 = r1
            r3 = r4
            r2.<init>(r3, r4, r5, r7, r8, r9)     // Catch:{ all -> 0x002c }
            r1.allowCoreThreadTimeOut(r10)     // Catch:{ Throwable -> 0x0028 }
        L_0x0028:
            f54629t = r1     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            goto L_0x002f
        L_0x002c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r1
        L_0x002f:
            java.util.concurrent.ExecutorService r0 = f54629t
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.downloader.C19884b.m48612i():java.util.concurrent.ExecutorService");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0028 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.concurrent.ExecutorService m48613j() {
        /*
            java.util.concurrent.ExecutorService r0 = f54628s
            if (r0 != 0) goto L_0x002f
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.b> r0 = com.p683ss.android.socialbase.downloader.downloader.C19884b.class
            monitor-enter(r0)
            java.util.concurrent.ExecutorService r1 = f54628s     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x002a
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x002c }
            int r4 = f54604F     // Catch:{ all -> 0x002c }
            r5 = 15
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x002c }
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue     // Catch:{ all -> 0x002c }
            r8.<init>()     // Catch:{ all -> 0x002c }
            com.ss.android.socialbase.downloader.i.a r9 = new com.ss.android.socialbase.downloader.i.a     // Catch:{ all -> 0x002c }
            java.lang.String r2 = "DownloadThreadPool-db-fixed"
            r10 = 1
            r9.<init>(r2, r10)     // Catch:{ all -> 0x002c }
            r2 = r1
            r3 = r4
            r2.<init>(r3, r4, r5, r7, r8, r9)     // Catch:{ all -> 0x002c }
            r1.allowCoreThreadTimeOut(r10)     // Catch:{ Throwable -> 0x0028 }
        L_0x0028:
            f54628s = r1     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            goto L_0x002f
        L_0x002c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r1
        L_0x002f:
            java.util.concurrent.ExecutorService r0 = f54628s
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.downloader.C19884b.m48613j():java.util.concurrent.ExecutorService");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m48605b() {
        /*
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.b> r0 = com.p683ss.android.socialbase.downloader.downloader.C19884b.class
            monitor-enter(r0)
            boolean r1 = f54634y     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            r1 = 1
            f54634y = r1     // Catch:{ all -> 0x0047 }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Throwable -> 0x0042 }
            android.content.Context r3 = m48627x()     // Catch:{ Throwable -> 0x0042 }
            java.lang.Class<com.ss.android.socialbase.downloader.impls.DownloadHandleService> r4 = com.p683ss.android.socialbase.downloader.impls.DownloadHandleService.class
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x0042 }
            java.lang.String r3 = "com.ss.android.downloader.action.MULTI_PROCESS_NOTIFY"
            r2.setAction(r3)     // Catch:{ Throwable -> 0x0042 }
            android.content.Context r3 = m48627x()     // Catch:{ Throwable -> 0x0042 }
            if (r3 == 0) goto L_0x0030
            boolean r4 = r3 instanceof android.content.Context     // Catch:{ Throwable -> 0x0042 }
            if (r4 == 0) goto L_0x0030
            r4 = r3
            android.content.Context r4 = (android.content.Context) r4     // Catch:{ Throwable -> 0x0042 }
            boolean r4 = com.p683ss.android.ugc.aweme.push.downgrade.C40895d.m90464a(r4, r2)     // Catch:{ Throwable -> 0x0042 }
            if (r4 == 0) goto L_0x0030
            goto L_0x0033
        L_0x0030:
            r3.startService(r2)     // Catch:{ Throwable -> 0x0042 }
        L_0x0033:
            boolean r2 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49377c()     // Catch:{ Throwable -> 0x0042 }
            if (r2 != 0) goto L_0x0040
            com.ss.android.socialbase.downloader.downloader.n r1 = com.p683ss.android.socialbase.downloader.impls.C19971l.m49132a(r1)     // Catch:{ Throwable -> 0x0042 }
            r1.mo41601d()     // Catch:{ Throwable -> 0x0042 }
        L_0x0040:
            monitor-exit(r0)
            return
        L_0x0042:
            r1 = 0
            f54634y = r1     // Catch:{ all -> 0x0047 }
            monitor-exit(r0)
            return
        L_0x0047:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.downloader.C19884b.m48605b():void");
    }

    /* renamed from: k */
    public static C53682y m48614k() {
        if (f54635z == null) {
            synchronized (C19884b.class) {
                if (f54635z == null) {
                    C53684a aVar = new C53684a();
                    aVar.mo111654a(30000, TimeUnit.MILLISECONDS).mo111668b(30000, TimeUnit.MILLISECONDS).mo111672c(30000, TimeUnit.MILLISECONDS).mo111671b(true).mo111661a(new C53661n(m48611h())).mo111666a(true).mo111655a(Collections.singletonList(C53685z.HTTP_1_1));
                    f54635z = aVar.mo111667a();
                }
            }
        }
        return f54635z;
    }

    /* renamed from: a */
    static synchronized void m48600a() {
        synchronized (C19884b.class) {
            try {
                if (!(!f54600B || f54631v == null || f54614e == null)) {
                    f54614e.unregisterReceiver(f54631v);
                    f54600B = false;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static int m48596a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return 0;
        }
        return m48597a(downloadInfo.getUrl(), downloadInfo.getSavePath());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0037, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m48601a(android.content.Context r3) {
        /*
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.b> r0 = com.p683ss.android.socialbase.downloader.downloader.C19884b.class
            monitor-enter(r0)
            if (r3 == 0) goto L_0x0036
            android.content.Context r1 = f54614e     // Catch:{ all -> 0x0033 }
            if (r1 != 0) goto L_0x0036
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0033 }
            f54614e = r3     // Catch:{ all -> 0x0033 }
            com.ss.android.socialbase.downloader.a.a r3 = com.p683ss.android.socialbase.downloader.p1211a.C19776a.m48304a()     // Catch:{ all -> 0x0033 }
            android.content.Context r1 = f54614e     // Catch:{ all -> 0x0033 }
            android.app.Application r2 = r3.f54468a     // Catch:{ all -> 0x0033 }
            if (r2 != 0) goto L_0x0036
            boolean r2 = r1 instanceof android.app.Application     // Catch:{ all -> 0x0033 }
            if (r2 == 0) goto L_0x0036
            monitor-enter(r3)     // Catch:{ all -> 0x0033 }
            android.app.Application r2 = r3.f54468a     // Catch:{ all -> 0x0030 }
            if (r2 != 0) goto L_0x002d
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x0030 }
            r3.f54468a = r1     // Catch:{ all -> 0x0030 }
            android.app.Application r1 = r3.f54468a     // Catch:{ all -> 0x0030 }
            android.app.Application$ActivityLifecycleCallbacks r2 = r3.f54472e     // Catch:{ all -> 0x0030 }
            r1.registerActivityLifecycleCallbacks(r2)     // Catch:{ all -> 0x0030 }
        L_0x002d:
            monitor-exit(r3)     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)
            return
        L_0x0030:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0030 }
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L_0x0036:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.downloader.C19884b.m48601a(android.content.Context):void");
    }

    /* renamed from: a */
    public static void m48602a(C19783d dVar) {
        synchronized (f54612c) {
            if (f54612c != null) {
                Iterator it = f54612c.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                f54612c.clear();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(31:8|9|(35:11|(1:13)|14|(1:16)|17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(1:31)(1:32)|33|(1:35)|36|(1:38)|39|(1:41)|42|(1:44)|45|(1:47)|48|(1:50)|51|(1:53)|54|(1:56)|57|(1:59)|60|(2:(1:63)|64)|65)|66|(1:68)|69|(1:71)|72|(1:74)|75|(1:77)|78|(1:80)|81|(1:83)|84|(1:86)|87|(1:89)|90|(1:94)|95|(1:97)|98|(2:100|101)|102|103|(2:109|(2:111|(1:113))(2:114|(1:116)))(1:108)|117|118|119) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:102:0x012a */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0153  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void m48603a(com.p683ss.android.socialbase.downloader.downloader.C19895g r7) {
        /*
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.b> r0 = com.p683ss.android.socialbase.downloader.downloader.C19884b.class
            monitor-enter(r0)
            boolean r1 = f54609K     // Catch:{ all -> 0x018c }
            if (r1 == 0) goto L_0x0010
            java.lang.String r7 = "DownloadComponentManager"
            java.lang.String r1 = "component has init"
            com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48487c(r7, r1)     // Catch:{ all -> 0x018c }
            monitor-exit(r0)
            return
        L_0x0010:
            boolean r1 = f54634y     // Catch:{ all -> 0x018c }
            r2 = 1
            if (r7 == 0) goto L_0x00a2
            android.content.Context r3 = r7.f54688a     // Catch:{ all -> 0x018c }
            m48601a(r3)     // Catch:{ all -> 0x018c }
            com.ss.android.socialbase.downloader.downloader.k r3 = r7.f54689b     // Catch:{ all -> 0x018c }
            if (r3 == 0) goto L_0x0020
            f54615f = r3     // Catch:{ all -> 0x018c }
        L_0x0020:
            com.ss.android.socialbase.downloader.downloader.l r3 = r7.f54690c     // Catch:{ all -> 0x018c }
            if (r3 == 0) goto L_0x0026
            f54616g = r3     // Catch:{ all -> 0x018c }
        L_0x0026:
            com.ss.android.socialbase.downloader.downloader.i r3 = r7.f54692e     // Catch:{ all -> 0x018c }
            if (r3 == 0) goto L_0x002c
            f54617h = r3     // Catch:{ all -> 0x018c }
        L_0x002c:
            com.ss.android.socialbase.downloader.depend.y r3 = r7.f54693f     // Catch:{ all -> 0x018c }
            if (r3 == 0) goto L_0x0032
            f54610a = r3     // Catch:{ all -> 0x018c }
        L_0x0032:
            int r3 = r7.f54691d     // Catch:{ all -> 0x018c }
            if (r3 <= 0) goto L_0x0038
            f54601C = r3     // Catch:{ all -> 0x018c }
        L_0x0038:
            com.ss.android.socialbase.downloader.f.f r3 = r7.f54694g     // Catch:{ all -> 0x018c }
            if (r3 == 0) goto L_0x003e
            f54621l = r3     // Catch:{ all -> 0x018c }
        L_0x003e:
            com.ss.android.socialbase.downloader.f.f r3 = f54621l     // Catch:{ all -> 0x018c }
            if (r3 == 0) goto L_0x0044
            r3 = 1
            goto L_0x0045
        L_0x0044:
            r3 = 0
        L_0x0045:
            f54606H = r3     // Catch:{ all -> 0x018c }
            com.ss.android.socialbase.downloader.f.d r3 = r7.f54695h     // Catch:{ all -> 0x018c }
            if (r3 == 0) goto L_0x004d
            f54622m = r3     // Catch:{ all -> 0x018c }
        L_0x004d:
            com.ss.android.socialbase.downloader.downloader.m r3 = r7.f54696i     // Catch:{ all -> 0x018c }
            m48604a(r3)     // Catch:{ all -> 0x018c }
            java.util.concurrent.ExecutorService r3 = r7.f54697j     // Catch:{ all -> 0x018c }
            if (r3 == 0) goto L_0x0058
            f54626q = r3     // Catch:{ all -> 0x018c }
        L_0x0058:
            java.util.concurrent.ExecutorService r3 = r7.f54698k     // Catch:{ all -> 0x018c }
            if (r3 == 0) goto L_0x005e
            f54627r = r3     // Catch:{ all -> 0x018c }
        L_0x005e:
            java.util.concurrent.ExecutorService r3 = r7.f54699l     // Catch:{ all -> 0x018c }
            if (r3 == 0) goto L_0x0064
            f54628s = r3     // Catch:{ all -> 0x018c }
        L_0x0064:
            java.util.concurrent.ExecutorService r3 = r7.f54700m     // Catch:{ all -> 0x018c }
            if (r3 == 0) goto L_0x006a
            f54629t = r3     // Catch:{ all -> 0x018c }
        L_0x006a:
            com.ss.android.socialbase.downloader.downloader.q r3 = r7.f54704q     // Catch:{ all -> 0x018c }
            if (r3 == 0) goto L_0x0072
            com.ss.android.socialbase.downloader.downloader.q r3 = r7.f54704q     // Catch:{ all -> 0x018c }
            f54633x = r3     // Catch:{ all -> 0x018c }
        L_0x0072:
            int r3 = r7.f54701n     // Catch:{ all -> 0x018c }
            r4 = 1024(0x400, float:1.435E-42)
            if (r3 <= r4) goto L_0x007c
            int r3 = r7.f54701n     // Catch:{ all -> 0x018c }
            f54605G = r3     // Catch:{ all -> 0x018c }
        L_0x007c:
            com.ss.android.socialbase.downloader.downloader.h r3 = r7.f54702o     // Catch:{ all -> 0x018c }
            if (r3 == 0) goto L_0x0082
            f54630u = r3     // Catch:{ all -> 0x018c }
        L_0x0082:
            boolean r3 = r7.f54703p     // Catch:{ all -> 0x018c }
            if (r3 == 0) goto L_0x0088
            f54634y = r2     // Catch:{ all -> 0x018c }
        L_0x0088:
            int r3 = r7.f54706s     // Catch:{ all -> 0x018c }
            f54607I = r3     // Catch:{ all -> 0x018c }
            org.json.JSONObject r3 = r7.f54707t     // Catch:{ all -> 0x018c }
            org.json.JSONObject r4 = f54608J     // Catch:{ all -> 0x018c }
            if (r4 == r3) goto L_0x009e
            if (r3 != 0) goto L_0x0099
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x018c }
            r3.<init>()     // Catch:{ all -> 0x018c }
        L_0x0099:
            f54608J = r3     // Catch:{ all -> 0x018c }
            com.p683ss.android.socialbase.downloader.p1219h.C19938a.m48932a()     // Catch:{ all -> 0x018c }
        L_0x009e:
            boolean r7 = r7.f54705r     // Catch:{ all -> 0x018c }
            f54613d = r7     // Catch:{ all -> 0x018c }
        L_0x00a2:
            com.ss.android.socialbase.downloader.downloader.k r7 = f54615f     // Catch:{ all -> 0x018c }
            if (r7 != 0) goto L_0x00ad
            com.ss.android.socialbase.downloader.impls.d r7 = new com.ss.android.socialbase.downloader.impls.d     // Catch:{ all -> 0x018c }
            r7.<init>()     // Catch:{ all -> 0x018c }
            f54615f = r7     // Catch:{ all -> 0x018c }
        L_0x00ad:
            com.ss.android.socialbase.downloader.downloader.p r7 = f54619j     // Catch:{ all -> 0x018c }
            if (r7 != 0) goto L_0x00b8
            com.ss.android.socialbase.downloader.impls.h r7 = new com.ss.android.socialbase.downloader.impls.h     // Catch:{ all -> 0x018c }
            r7.<init>()     // Catch:{ all -> 0x018c }
            f54619j = r7     // Catch:{ all -> 0x018c }
        L_0x00b8:
            com.ss.android.socialbase.downloader.downloader.p r7 = f54620k     // Catch:{ all -> 0x018c }
            if (r7 != 0) goto L_0x00c3
            com.ss.android.socialbase.downloader.impls.n r7 = new com.ss.android.socialbase.downloader.impls.n     // Catch:{ all -> 0x018c }
            r7.<init>()     // Catch:{ all -> 0x018c }
            f54620k = r7     // Catch:{ all -> 0x018c }
        L_0x00c3:
            com.ss.android.socialbase.downloader.downloader.l r7 = f54616g     // Catch:{ all -> 0x018c }
            if (r7 != 0) goto L_0x00ce
            com.ss.android.socialbase.downloader.impls.i r7 = new com.ss.android.socialbase.downloader.impls.i     // Catch:{ all -> 0x018c }
            r7.<init>()     // Catch:{ all -> 0x018c }
            f54616g = r7     // Catch:{ all -> 0x018c }
        L_0x00ce:
            com.ss.android.socialbase.downloader.impls.a r7 = f54618i     // Catch:{ all -> 0x018c }
            if (r7 != 0) goto L_0x00d9
            com.ss.android.socialbase.downloader.impls.e r7 = new com.ss.android.socialbase.downloader.impls.e     // Catch:{ all -> 0x018c }
            r7.<init>()     // Catch:{ all -> 0x018c }
            f54618i = r7     // Catch:{ all -> 0x018c }
        L_0x00d9:
            com.ss.android.socialbase.downloader.downloader.i r7 = f54617h     // Catch:{ all -> 0x018c }
            if (r7 != 0) goto L_0x00e4
            com.ss.android.socialbase.downloader.impls.c r7 = new com.ss.android.socialbase.downloader.impls.c     // Catch:{ all -> 0x018c }
            r7.<init>()     // Catch:{ all -> 0x018c }
            f54617h = r7     // Catch:{ all -> 0x018c }
        L_0x00e4:
            com.ss.android.socialbase.downloader.downloader.h r7 = f54630u     // Catch:{ all -> 0x018c }
            if (r7 != 0) goto L_0x00ef
            com.ss.android.socialbase.downloader.impls.b r7 = new com.ss.android.socialbase.downloader.impls.b     // Catch:{ all -> 0x018c }
            r7.<init>()     // Catch:{ all -> 0x018c }
            f54630u = r7     // Catch:{ all -> 0x018c }
        L_0x00ef:
            com.ss.android.socialbase.downloader.downloader.r r7 = f54632w     // Catch:{ all -> 0x018c }
            if (r7 != 0) goto L_0x00fa
            com.ss.android.socialbase.downloader.impls.j r7 = new com.ss.android.socialbase.downloader.impls.j     // Catch:{ all -> 0x018c }
            r7.<init>()     // Catch:{ all -> 0x018c }
            f54632w = r7     // Catch:{ all -> 0x018c }
        L_0x00fa:
            int r7 = f54601C     // Catch:{ all -> 0x018c }
            if (r7 <= 0) goto L_0x0104
            int r7 = f54601C     // Catch:{ all -> 0x018c }
            int r3 = f54602D     // Catch:{ all -> 0x018c }
            if (r7 <= r3) goto L_0x0108
        L_0x0104:
            int r7 = f54602D     // Catch:{ all -> 0x018c }
            f54601C = r7     // Catch:{ all -> 0x018c }
        L_0x0108:
            com.ss.android.socialbase.downloader.downloader.DownloadReceiver r7 = f54631v     // Catch:{ all -> 0x018c }
            if (r7 != 0) goto L_0x0113
            com.ss.android.socialbase.downloader.downloader.DownloadReceiver r7 = new com.ss.android.socialbase.downloader.downloader.DownloadReceiver     // Catch:{ all -> 0x018c }
            r7.<init>()     // Catch:{ all -> 0x018c }
            f54631v = r7     // Catch:{ all -> 0x018c }
        L_0x0113:
            boolean r7 = f54600B     // Catch:{ all -> 0x018c }
            if (r7 != 0) goto L_0x012a
            android.content.IntentFilter r7 = new android.content.IntentFilter     // Catch:{ Throwable -> 0x012a }
            r7.<init>()     // Catch:{ Throwable -> 0x012a }
            java.lang.String r3 = "android.net.conn.CONNECTIVITY_CHANGE"
            r7.addAction(r3)     // Catch:{ Throwable -> 0x012a }
            android.content.Context r3 = f54614e     // Catch:{ Throwable -> 0x012a }
            com.ss.android.socialbase.downloader.downloader.DownloadReceiver r4 = f54631v     // Catch:{ Throwable -> 0x012a }
            r3.registerReceiver(r4, r7)     // Catch:{ Throwable -> 0x012a }
            f54600B = r2     // Catch:{ Throwable -> 0x012a }
        L_0x012a:
            boolean r7 = f54634y     // Catch:{ all -> 0x018c }
            if (r7 == 0) goto L_0x013e
            if (r1 != 0) goto L_0x013e
            boolean r7 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49377c()     // Catch:{ all -> 0x018c }
            if (r7 != 0) goto L_0x013e
            com.ss.android.socialbase.downloader.downloader.n r7 = com.p683ss.android.socialbase.downloader.impls.C19971l.m49132a(r2)     // Catch:{ all -> 0x018c }
            r7.mo41601d()     // Catch:{ all -> 0x018c }
            goto L_0x015c
        L_0x013e:
            boolean r7 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49380d()     // Catch:{ all -> 0x018c }
            if (r7 == 0) goto L_0x0153
            java.util.concurrent.ExecutorService r7 = m48611h()     // Catch:{ all -> 0x018c }
            if (r7 == 0) goto L_0x015c
            com.ss.android.socialbase.downloader.downloader.b$1 r1 = new com.ss.android.socialbase.downloader.downloader.b$1     // Catch:{ all -> 0x018c }
            r1.<init>()     // Catch:{ all -> 0x018c }
            r7.execute(r1)     // Catch:{ all -> 0x018c }
            goto L_0x015c
        L_0x0153:
            android.content.Context r7 = m48627x()     // Catch:{ all -> 0x018c }
            if (r7 == 0) goto L_0x015c
            com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49375c(r7)     // Catch:{ all -> 0x018c }
        L_0x015c:
            com.ss.android.socialbase.downloader.h.a r7 = com.p683ss.android.socialbase.downloader.p1219h.C19938a.m48933b()     // Catch:{ all -> 0x018c }
            java.lang.String r1 = "preconnect_connection_outdate_time"
            r3 = 300000(0x493e0, double:1.482197E-318)
            long r5 = r7.mo41659a(r1, r3)     // Catch:{ all -> 0x018c }
            com.p683ss.android.socialbase.downloader.p1216f.p1217a.C19919b.f54729b = r5     // Catch:{ all -> 0x018c }
            com.ss.android.socialbase.downloader.h.a r7 = com.p683ss.android.socialbase.downloader.p1219h.C19938a.m48933b()     // Catch:{ all -> 0x018c }
            java.lang.String r1 = "preconnect_head_info_outdate_time"
            long r3 = r7.mo41659a(r1, r3)     // Catch:{ all -> 0x018c }
            com.p683ss.android.socialbase.downloader.p1216f.p1217a.C19919b.f54730c = r3     // Catch:{ all -> 0x018c }
            com.ss.android.socialbase.downloader.f.a.a r7 = com.p683ss.android.socialbase.downloader.p1216f.p1217a.C19916a.m48893a()     // Catch:{ all -> 0x018c }
            com.ss.android.socialbase.downloader.h.a r1 = com.p683ss.android.socialbase.downloader.p1219h.C19938a.m48933b()     // Catch:{ all -> 0x018c }
            java.lang.String r3 = "preconnect_max_cache_size"
            r4 = 3
            int r1 = r1.mo41658a(r3, r4)     // Catch:{ all -> 0x018c }
            r7.f54724a = r1     // Catch:{ all -> 0x018c }
            f54609K = r2     // Catch:{ all -> 0x018c }
            monitor-exit(r0)
            return
        L_0x018c:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.downloader.C19884b.m48603a(com.ss.android.socialbase.downloader.downloader.g):void");
    }

    /* renamed from: a */
    public static int m48597a(String str, String str2) {
        C19902l p = m48619p();
        if (p == null) {
            return 0;
        }
        return p.mo41565a(str, str2);
    }

    /* renamed from: a */
    public static C19924c m48598a(String str, List<HttpHeader> list) throws BaseException, IOException {
        Throwable e;
        C19925d A = m48593A();
        C19924c cVar = null;
        if (A != null) {
            try {
                cVar = A.mo41650a(str, list);
                e = null;
            } catch (IOException e2) {
                e = e2;
            }
        } else {
            e = null;
        }
        if (cVar == null) {
            C19925d C = m48595C();
            if (C != null) {
                cVar = C.mo41650a(str, list);
            }
        }
        if (cVar != null || e == null) {
            return cVar;
        }
        throw e;
    }

    /* renamed from: a */
    public static C19926e m48599a(boolean z, int i, String str, List<HttpHeader> list) throws BaseException, IOException {
        Throwable e;
        C19927f z2 = m48629z();
        if (z2 != null || z) {
            C19926e eVar = null;
            if (z2 != null) {
                try {
                    e = null;
                    eVar = z2.mo13390a(i, str, list);
                } catch (IOException e2) {
                    e = e2;
                }
            } else {
                e = null;
            }
            if (z && eVar == null && (z2 == null || z2.getClass() != C19965g.class)) {
                C19927f B = m48594B();
                if (B != null) {
                    eVar = B.mo13390a(i, str, list);
                }
            }
            if (eVar != null || e == null) {
                return eVar;
            }
            throw e;
        }
        throw new BaseException(1022, (Throwable) new IOException("download can't continue, because httpService not exist"));
    }
}
