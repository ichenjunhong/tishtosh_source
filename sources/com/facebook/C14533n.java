package com.facebook;

import android.content.Context;
import android.os.AsyncTask;
import com.C2240a;
import com.facebook.internal.C14283ab;
import com.facebook.internal.C14347s;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.login.C27952a;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.facebook.n */
public final class C14533n {

    /* renamed from: a */
    public static volatile String f37753a;

    /* renamed from: b */
    public static Context f37754b;

    /* renamed from: c */
    public static int f37755c = 64206;

    /* renamed from: d */
    private static final String f37756d = C14533n.class.getCanonicalName();

    /* renamed from: e */
    private static final HashSet<C14699w> f37757e = new HashSet<>(Arrays.asList(new C14699w[]{C14699w.DEVELOPER_ERRORS}));

    /* renamed from: f */
    private static Executor f37758f;

    /* renamed from: g */
    private static volatile String f37759g;

    /* renamed from: h */
    private static volatile String f37760h;

    /* renamed from: i */
    private static volatile Boolean f37761i;

    /* renamed from: j */
    private static volatile String f37762j = "facebook.com";

    /* renamed from: k */
    private static AtomicLong f37763k = new AtomicLong(65536);

    /* renamed from: l */
    private static volatile boolean f37764l = false;

    /* renamed from: m */
    private static boolean f37765m = false;

    /* renamed from: n */
    private static C14347s<File> f37766n;

    /* renamed from: o */
    private static final Object f37767o = new Object();

    /* renamed from: p */
    private static String f37768p = "v4.0";

    /* renamed from: q */
    private static Boolean f37769q = Boolean.valueOf(false);

    /* renamed from: r */
    private static Boolean f37770r = Boolean.valueOf(false);

    /* renamed from: com.facebook.n$a */
    public interface C14539a {
    }

    /* renamed from: c */
    public static boolean m29769c() {
        return f37764l;
    }

    /* renamed from: d */
    public static boolean m29770d() {
        return f37765m;
    }

    /* renamed from: f */
    public static String m29772f() {
        return f37762j;
    }

    /* renamed from: i */
    public static String m29775i() {
        return "5.5.2";
    }

    /* renamed from: g */
    public static Context m29773g() {
        C14283ab.m29303a();
        return f37754b;
    }

    /* renamed from: k */
    public static String m29777k() {
        C14283ab.m29303a();
        return f37753a;
    }

    /* renamed from: l */
    public static String m29778l() {
        C14283ab.m29303a();
        return f37759g;
    }

    /* renamed from: m */
    public static String m29779m() {
        C14283ab.m29303a();
        return f37760h;
    }

    /* renamed from: n */
    public static boolean m29780n() {
        return C13600ad.m27449b();
    }

    /* renamed from: o */
    public static boolean m29781o() {
        return C13600ad.m27451c();
    }

    /* renamed from: b */
    public static synchronized boolean m29767b() {
        boolean booleanValue;
        synchronized (C14533n.class) {
            booleanValue = f37770r.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: h */
    public static String m29774h() {
        C2240a.m6772a("getGraphApiVersion: %s", new Object[]{f37768p});
        return f37768p;
    }

    /* renamed from: j */
    public static long m29776j() {
        C14283ab.m29303a();
        return f37763k.get();
    }

    /* renamed from: e */
    public static Executor m29771e() {
        synchronized (f37767o) {
            if (f37758f == null) {
                f37758f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
        }
        return f37758f;
    }

    /* renamed from: a */
    public static synchronized boolean m29764a() {
        boolean booleanValue;
        synchronized (C14533n.class) {
            booleanValue = f37769q.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: a */
    public static void m29762a(String str) {
        f37753a = str;
    }

    /* renamed from: a */
    public static synchronized void m29760a(Context context) {
        synchronized (C14533n.class) {
            m29766b(context, null);
        }
    }

    /* renamed from: a */
    public static void m29763a(Executor executor) {
        C14283ab.m29306a((Object) executor, "executor");
        synchronized (f37767o) {
            f37758f = executor;
        }
    }

    /* renamed from: b */
    public static boolean m29768b(Context context) {
        C14283ab.m29303a();
        return C35807d.m80935a(context, "com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    /* renamed from: a */
    public static boolean m29765a(C14699w wVar) {
        boolean z;
        synchronized (f37757e) {
            if (!m29769c() || !f37757e.contains(wVar)) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    private static synchronized void m29766b(Context context, C14539a aVar) {
        synchronized (C14533n.class) {
            if (C27952a.f73379b.compareAndSet(false, true)) {
                m29763a(C27952a.f73378a);
            }
            m29761a(context, null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0151  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m29761a(final android.content.Context r8, final com.facebook.C14533n.C14539a r9) {
        /*
            java.lang.Class<com.facebook.n> r0 = com.facebook.C14533n.class
            monitor-enter(r0)
            java.lang.Boolean r1 = f37769q     // Catch:{ all -> 0x01c7 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x01c7 }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)
            return
        L_0x000d:
            java.lang.String r1 = "applicationContext"
            com.facebook.internal.C14283ab.m29306a(r8, r1)     // Catch:{ all -> 0x01c7 }
            r1 = 0
            com.facebook.internal.C14283ab.m29310b(r8, r1)     // Catch:{ all -> 0x01c7 }
            com.facebook.internal.C14283ab.m29305a(r8, r1)     // Catch:{ all -> 0x01c7 }
            android.content.Context r2 = r8.getApplicationContext()     // Catch:{ all -> 0x01c7 }
            f37754b = r2     // Catch:{ all -> 0x01c7 }
            com.facebook.p909a.C13581g.m27416b(r8)     // Catch:{ all -> 0x01c7 }
            android.content.Context r2 = f37754b     // Catch:{ all -> 0x01c7 }
            if (r2 == 0) goto L_0x00ce
            android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00ce }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ NameNotFoundException -> 0x00ce }
            android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ NameNotFoundException -> 0x00ce }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x00ce }
            boolean r4 = android.text.TextUtils.equals(r2, r4)     // Catch:{ NameNotFoundException -> 0x00ce }
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x004b
            android.content.pm.ApplicationInfo r4 = com.p683ss.android.ugc.aweme.lancet.p1151a.C18970b.f52271a     // Catch:{ NameNotFoundException -> 0x00ce }
            if (r4 != 0) goto L_0x0048
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r5)     // Catch:{ NameNotFoundException -> 0x00ce }
            com.p683ss.android.ugc.aweme.lancet.p1151a.C18970b.f52271a = r2     // Catch:{ NameNotFoundException -> 0x00ce }
        L_0x0048:
            android.content.pm.ApplicationInfo r2 = com.p683ss.android.ugc.aweme.lancet.p1151a.C18970b.f52271a     // Catch:{ NameNotFoundException -> 0x00ce }
            goto L_0x004f
        L_0x004b:
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r5)     // Catch:{ NameNotFoundException -> 0x00ce }
        L_0x004f:
            if (r2 == 0) goto L_0x00ce
            android.os.Bundle r3 = r2.metaData     // Catch:{ all -> 0x01c7 }
            if (r3 != 0) goto L_0x0057
            goto L_0x00ce
        L_0x0057:
            java.lang.String r3 = f37753a     // Catch:{ all -> 0x01c7 }
            if (r3 != 0) goto L_0x008f
            android.os.Bundle r3 = r2.metaData     // Catch:{ all -> 0x01c7 }
            java.lang.String r4 = "com.facebook.sdk.ApplicationId"
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x01c7 }
            boolean r4 = r3 instanceof java.lang.String     // Catch:{ all -> 0x01c7 }
            if (r4 == 0) goto L_0x0082
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x01c7 }
            java.util.Locale r4 = java.util.Locale.ROOT     // Catch:{ all -> 0x01c7 }
            java.lang.String r4 = r3.toLowerCase(r4)     // Catch:{ all -> 0x01c7 }
            java.lang.String r5 = "fb"
            boolean r4 = r4.startsWith(r5)     // Catch:{ all -> 0x01c7 }
            if (r4 == 0) goto L_0x007f
            r4 = 2
            java.lang.String r3 = r3.substring(r4)     // Catch:{ all -> 0x01c7 }
            f37753a = r3     // Catch:{ all -> 0x01c7 }
            goto L_0x008f
        L_0x007f:
            f37753a = r3     // Catch:{ all -> 0x01c7 }
            goto L_0x008f
        L_0x0082:
            boolean r3 = r3 instanceof java.lang.Integer     // Catch:{ all -> 0x01c7 }
            if (r3 != 0) goto L_0x0087
            goto L_0x008f
        L_0x0087:
            com.facebook.k r8 = new com.facebook.k     // Catch:{ all -> 0x01c7 }
            java.lang.String r9 = "App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file."
            r8.<init>(r9)     // Catch:{ all -> 0x01c7 }
            throw r8     // Catch:{ all -> 0x01c7 }
        L_0x008f:
            java.lang.String r3 = f37759g     // Catch:{ all -> 0x01c7 }
            if (r3 != 0) goto L_0x009d
            android.os.Bundle r3 = r2.metaData     // Catch:{ all -> 0x01c7 }
            java.lang.String r4 = "com.facebook.sdk.ApplicationName"
            java.lang.String r3 = r3.getString(r4)     // Catch:{ all -> 0x01c7 }
            f37759g = r3     // Catch:{ all -> 0x01c7 }
        L_0x009d:
            java.lang.String r3 = f37760h     // Catch:{ all -> 0x01c7 }
            if (r3 != 0) goto L_0x00ab
            android.os.Bundle r3 = r2.metaData     // Catch:{ all -> 0x01c7 }
            java.lang.String r4 = "com.facebook.sdk.ClientToken"
            java.lang.String r3 = r3.getString(r4)     // Catch:{ all -> 0x01c7 }
            f37760h = r3     // Catch:{ all -> 0x01c7 }
        L_0x00ab:
            int r3 = f37755c     // Catch:{ all -> 0x01c7 }
            r4 = 64206(0xface, float:8.9972E-41)
            if (r3 != r4) goto L_0x00bc
            android.os.Bundle r3 = r2.metaData     // Catch:{ all -> 0x01c7 }
            java.lang.String r5 = "com.facebook.sdk.CallbackOffset"
            int r3 = r3.getInt(r5, r4)     // Catch:{ all -> 0x01c7 }
            f37755c = r3     // Catch:{ all -> 0x01c7 }
        L_0x00bc:
            java.lang.Boolean r3 = f37761i     // Catch:{ all -> 0x01c7 }
            if (r3 != 0) goto L_0x00ce
            android.os.Bundle r2 = r2.metaData     // Catch:{ all -> 0x01c7 }
            java.lang.String r3 = "com.facebook.sdk.CodelessDebugLogEnabled"
            boolean r2 = r2.getBoolean(r3, r1)     // Catch:{ all -> 0x01c7 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x01c7 }
            f37761i = r2     // Catch:{ all -> 0x01c7 }
        L_0x00ce:
            java.lang.String r2 = f37753a     // Catch:{ all -> 0x01c7 }
            boolean r2 = com.facebook.internal.C14277aa.m29276a(r2)     // Catch:{ all -> 0x01c7 }
            if (r2 != 0) goto L_0x01bf
            r2 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x01c7 }
            f37769q = r3     // Catch:{ all -> 0x01c7 }
            com.facebook.C13600ad.m27445a()     // Catch:{ all -> 0x01c7 }
            com.facebook.ad$a r3 = com.facebook.C13600ad.f35484b     // Catch:{ all -> 0x01c7 }
            boolean r3 = r3.mo25428a()     // Catch:{ all -> 0x01c7 }
            if (r3 == 0) goto L_0x00ee
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x01c7 }
            f37770r = r3     // Catch:{ all -> 0x01c7 }
        L_0x00ee:
            android.content.Context r3 = f37754b     // Catch:{ all -> 0x01c7 }
            boolean r3 = r3 instanceof android.app.Application     // Catch:{ all -> 0x01c7 }
            if (r3 == 0) goto L_0x0103
            boolean r3 = com.facebook.C13600ad.m27449b()     // Catch:{ all -> 0x01c7 }
            if (r3 == 0) goto L_0x0103
            android.content.Context r3 = f37754b     // Catch:{ all -> 0x01c7 }
            android.app.Application r3 = (android.app.Application) r3     // Catch:{ all -> 0x01c7 }
            java.lang.String r4 = f37753a     // Catch:{ all -> 0x01c7 }
            com.facebook.p909a.p912b.C13544a.m27367a(r3, r4)     // Catch:{ all -> 0x01c7 }
        L_0x0103:
            android.content.Context r3 = m29773g()     // Catch:{ all -> 0x01c7 }
            java.lang.String r4 = m29777k()     // Catch:{ all -> 0x01c7 }
            boolean r5 = com.facebook.internal.C14277aa.m29276a(r4)     // Catch:{ all -> 0x01c7 }
            if (r5 == 0) goto L_0x011c
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.p$a> r1 = com.facebook.internal.C14338p.f37310c     // Catch:{ all -> 0x01c7 }
            com.facebook.internal.p$a r2 = com.facebook.internal.C14338p.C14343a.ERROR     // Catch:{ all -> 0x01c7 }
            r1.set(r2)     // Catch:{ all -> 0x01c7 }
            com.facebook.internal.C14338p.m29401a()     // Catch:{ all -> 0x01c7 }
            goto L_0x0167
        L_0x011c:
            java.util.Map<java.lang.String, com.facebook.internal.o> r5 = com.facebook.internal.C14338p.f37309b     // Catch:{ all -> 0x01c7 }
            boolean r5 = r5.containsKey(r4)     // Catch:{ all -> 0x01c7 }
            if (r5 == 0) goto L_0x012f
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.p$a> r1 = com.facebook.internal.C14338p.f37310c     // Catch:{ all -> 0x01c7 }
            com.facebook.internal.p$a r2 = com.facebook.internal.C14338p.C14343a.SUCCESS     // Catch:{ all -> 0x01c7 }
            r1.set(r2)     // Catch:{ all -> 0x01c7 }
            com.facebook.internal.C14338p.m29401a()     // Catch:{ all -> 0x01c7 }
            goto L_0x0167
        L_0x012f:
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.p$a> r5 = com.facebook.internal.C14338p.f37310c     // Catch:{ all -> 0x01c7 }
            com.facebook.internal.p$a r6 = com.facebook.internal.C14338p.C14343a.NOT_LOADED     // Catch:{ all -> 0x01c7 }
            com.facebook.internal.p$a r7 = com.facebook.internal.C14338p.C14343a.LOADING     // Catch:{ all -> 0x01c7 }
            boolean r5 = r5.compareAndSet(r6, r7)     // Catch:{ all -> 0x01c7 }
            if (r5 != 0) goto L_0x014a
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.p$a> r5 = com.facebook.internal.C14338p.f37310c     // Catch:{ all -> 0x01c7 }
            com.facebook.internal.p$a r6 = com.facebook.internal.C14338p.C14343a.ERROR     // Catch:{ all -> 0x01c7 }
            com.facebook.internal.p$a r7 = com.facebook.internal.C14338p.C14343a.LOADING     // Catch:{ all -> 0x01c7 }
            boolean r5 = r5.compareAndSet(r6, r7)     // Catch:{ all -> 0x01c7 }
            if (r5 == 0) goto L_0x0148
            goto L_0x014a
        L_0x0148:
            r5 = 0
            goto L_0x014b
        L_0x014a:
            r5 = 1
        L_0x014b:
            if (r5 != 0) goto L_0x0151
            com.facebook.internal.C14338p.m29401a()     // Catch:{ all -> 0x01c7 }
            goto L_0x0167
        L_0x0151:
            java.lang.String r5 = "com.facebook.internal.APP_SETTINGS.%s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x01c7 }
            r2[r1] = r4     // Catch:{ all -> 0x01c7 }
            java.lang.String r1 = com.C2240a.m6772a(r5, r2)     // Catch:{ all -> 0x01c7 }
            java.util.concurrent.Executor r2 = m29771e()     // Catch:{ all -> 0x01c7 }
            com.facebook.internal.p$1 r5 = new com.facebook.internal.p$1     // Catch:{ all -> 0x01c7 }
            r5.<init>(r3, r1, r4)     // Catch:{ all -> 0x01c7 }
            r2.execute(r5)     // Catch:{ all -> 0x01c7 }
        L_0x0167:
            com.facebook.internal.C14353v.m29444b()     // Catch:{ all -> 0x01c7 }
            android.content.Context r1 = f37754b     // Catch:{ all -> 0x01c7 }
            com.facebook.internal.BoltsMeasurementEventListener r2 = com.facebook.internal.BoltsMeasurementEventListener.f37169a     // Catch:{ all -> 0x01c7 }
            if (r2 == 0) goto L_0x0173
            com.facebook.internal.BoltsMeasurementEventListener r1 = com.facebook.internal.BoltsMeasurementEventListener.f37169a     // Catch:{ all -> 0x01c7 }
            goto L_0x018c
        L_0x0173:
            com.facebook.internal.BoltsMeasurementEventListener r2 = new com.facebook.internal.BoltsMeasurementEventListener     // Catch:{ all -> 0x01c7 }
            r2.<init>(r1)     // Catch:{ all -> 0x01c7 }
            com.facebook.internal.BoltsMeasurementEventListener.f37169a = r2     // Catch:{ all -> 0x01c7 }
            android.content.Context r1 = r2.f37170b     // Catch:{ all -> 0x01c7 }
            android.support.v4.content.g r1 = android.support.p030v4.content.C0732g.m2130a(r1)     // Catch:{ all -> 0x01c7 }
            android.content.IntentFilter r3 = new android.content.IntentFilter     // Catch:{ all -> 0x01c7 }
            java.lang.String r4 = "com.parse.bolts.measurement_event"
            r3.<init>(r4)     // Catch:{ all -> 0x01c7 }
            r1.mo2403a(r2, r3)     // Catch:{ all -> 0x01c7 }
            com.facebook.internal.BoltsMeasurementEventListener r1 = com.facebook.internal.BoltsMeasurementEventListener.f37169a     // Catch:{ all -> 0x01c7 }
        L_0x018c:
            com.facebook.internal.s r1 = new com.facebook.internal.s     // Catch:{ all -> 0x01c7 }
            com.facebook.n$1 r2 = new com.facebook.n$1     // Catch:{ all -> 0x01c7 }
            r2.<init>()     // Catch:{ all -> 0x01c7 }
            r1.<init>(r2)     // Catch:{ all -> 0x01c7 }
            f37766n = r1     // Catch:{ all -> 0x01c7 }
            com.facebook.internal.m$b r1 = com.facebook.internal.C14327m.C14331b.Instrument     // Catch:{ all -> 0x01c7 }
            com.facebook.n$2 r2 = new com.facebook.n$2     // Catch:{ all -> 0x01c7 }
            r2.<init>()     // Catch:{ all -> 0x01c7 }
            com.facebook.internal.C14327m.m29381a(r1, r2)     // Catch:{ all -> 0x01c7 }
            com.facebook.internal.m$b r1 = com.facebook.internal.C14327m.C14331b.RestrictiveDataFiltering     // Catch:{ all -> 0x01c7 }
            com.facebook.n$3 r2 = new com.facebook.n$3     // Catch:{ all -> 0x01c7 }
            r2.<init>()     // Catch:{ all -> 0x01c7 }
            com.facebook.internal.C14327m.m29381a(r1, r2)     // Catch:{ all -> 0x01c7 }
            java.util.concurrent.FutureTask r1 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x01c7 }
            com.facebook.n$4 r2 = new com.facebook.n$4     // Catch:{ all -> 0x01c7 }
            r2.<init>(r9, r8)     // Catch:{ all -> 0x01c7 }
            r1.<init>(r2)     // Catch:{ all -> 0x01c7 }
            java.util.concurrent.Executor r8 = m29771e()     // Catch:{ all -> 0x01c7 }
            r8.execute(r1)     // Catch:{ all -> 0x01c7 }
            monitor-exit(r0)
            return
        L_0x01bf:
            com.facebook.k r8 = new com.facebook.k     // Catch:{ all -> 0x01c7 }
            java.lang.String r9 = "A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk."
            r8.<init>(r9)     // Catch:{ all -> 0x01c7 }
            throw r8     // Catch:{ all -> 0x01c7 }
        L_0x01c7:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C14533n.m29761a(android.content.Context, com.facebook.n$a):void");
    }
}
