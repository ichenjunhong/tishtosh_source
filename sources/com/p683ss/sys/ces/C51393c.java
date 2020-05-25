package com.p683ss.sys.ces;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import com.p683ss.android.ugc.aweme.feed.monitor.C30514a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.p1096a.p1097a.C18477a;
import com.p683ss.p1096a.p1098b.C18481a;
import com.p683ss.p1096a.p1098b.C18484d;
import com.p683ss.sys.ces.out.IExpendFunctions;
import com.p683ss.sys.ces.out.ISdk;
import com.p683ss.sys.ces.out.ISdkNM;
import com.p683ss.sys.ces.p2581b.C51389a;
import com.p683ss.sys.ces.p2581b.C51391c;
import com.p683ss.sys.ces.p2582c.C51398b;
import com.p683ss.sys.ces.p2582c.C51403f;
import com.p683ss.sys.ces.utils.NetInterface;
import com.p683ss.sys.p2576a.C51372b;
import com.p683ss.sys.p2577b.C51373a;
import com.p683ss.sys.p2577b.p2578a.C51374a;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.sys.ces.c */
public class C51393c extends Thread implements ISdk {

    /* renamed from: b */
    public static boolean f128502b = true;

    /* renamed from: j */
    public static boolean f128503j = false;

    /* renamed from: k */
    public static boolean f128504k = false;

    /* renamed from: m */
    static boolean f128505m = false;

    /* renamed from: o */
    static final /* synthetic */ boolean f128506o = (!C51393c.class.desiredAssertionStatus());

    /* renamed from: p */
    private static volatile ISdkNM f128507p = null;

    /* renamed from: q */
    private static volatile IExpendFunctions f128508q = null;

    /* renamed from: r */
    private static volatile C51393c f128509r = null;

    /* renamed from: s */
    private static volatile C51372b f128510s = null;

    /* renamed from: t */
    private static long f128511t = 0;

    /* renamed from: u */
    private static long f128512u = 0;

    /* renamed from: a */
    public boolean f128513a;

    /* renamed from: c */
    public Context f128514c;

    /* renamed from: d */
    public long f128515d;

    /* renamed from: e */
    public String f128516e = "";

    /* renamed from: f */
    public String f128517f = "";

    /* renamed from: g */
    public String f128518g = "";

    /* renamed from: h */
    public String f128519h = "";

    /* renamed from: i */
    public boolean f128520i;

    /* renamed from: l */
    public boolean f128521l;

    /* renamed from: n */
    public Map<String, Object> f128522n;

    private C51393c(Context context, long j) {
        setName("CZL-MLP");
        this.f128514c = context;
        this.f128515d = j;
    }

    /* renamed from: a */
    public static C51393c m110533a() {
        return f128509r;
    }

    /* renamed from: a */
    public static void m110535a(int i, Object obj) {
        if (obj != null) {
            switch (i) {
                case 3:
                    MotionEvent motionEvent = (MotionEvent) obj;
                    StringBuilder sb = new StringBuilder();
                    sb.append(motionEvent.getToolType(0));
                    C51379a.meta(137, null, sb.toString());
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: b */
    public static long m110536b() {
        return m110533a().f128515d;
    }

    /* renamed from: c */
    public static String m110537c() {
        return m110533a().f128516e;
    }

    /* renamed from: d */
    public static String m110538d() {
        return m110533a().f128518g;
    }

    /* renamed from: e */
    public static String m110539e() {
        return m110533a().f128519h;
    }

    /* renamed from: f */
    public static String m110540f() {
        return m110533a().f128517f;
    }

    /* renamed from: g */
    public static ISdkNM m110541g() {
        return f128507p;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0019 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001a  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m110542h() {
        /*
            r0 = -1
            r1 = 1
            com.ss.sys.ces.out.IExpendFunctions r2 = f128508q     // Catch:{ Throwable -> 0x0013 }
            if (r2 == 0) goto L_0x0013
            com.ss.sys.ces.out.IExpendFunctions r2 = f128508q     // Catch:{ Throwable -> 0x0013 }
            int r2 = r2.checkActivityBackground()     // Catch:{ Throwable -> 0x0013 }
            if (r2 == r1) goto L_0x0012
            if (r2 == 0) goto L_0x0012
            if (r2 != r0) goto L_0x0013
        L_0x0012:
            return r2
        L_0x0013:
            android.app.Activity r2 = com.p683ss.sys.ces.p2580a.C51380a.m110498a()     // Catch:{ Throwable -> 0x001b }
            if (r2 == 0) goto L_0x001a
            return r1
        L_0x001a:
            r0 = 0
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.sys.ces.C51393c.m110542h():int");
    }

    /* renamed from: i */
    private void m110543i() {
        C51373a.m110489a().mo102051a(this.f128514c, m110536b(), new C51374a() {
            /* renamed from: a */
            public final void mo102053a(String str) {
                C51393c.f128505m = true;
            }
        });
    }

    public void InitSelas() {
        m110543i();
    }

    public void SetRegionType(int i) {
        if (i != 255) {
            C18477a.m44712a(i);
            int a = C51388b.m110521a(i);
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            C51379a.meta(BaseNotice.HASHTAG, null, sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo102096a(String str) {
        try {
            if (m110533a().f128513a) {
                Calendar.getInstance().getTimeInMillis();
            }
            byte[] bArr = (byte[]) C51379a.meta(222, this.f128514c, str);
            if (m110533a().f128513a) {
                Calendar.getInstance().getTimeInMillis();
            }
            if (bArr == null || bArr.length <= 0) {
                throw new NullPointerException("NullPointerException");
            }
            if (f128502b) {
                try {
                    new C51403f(this.f128514c, this.f128517f, 0).mo102121a(bArr);
                } catch (Throwable unused) {
                }
            } else {
                new C51398b(this.f128514c, this.f128517f, 0).mo37726a(1, 2, bArr);
            }
            if (m110541g() != null) {
                if (f128502b) {
                    new C51403f(this.f128514c, this.f128517f, 1).mo102121a(bArr);
                    return;
                }
                new C51398b(this.f128514c, this.f128517f, 1).mo37726a(1, 2, bArr);
            }
        } catch (Throwable unused2) {
        }
    }

    public String debugEntry(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        return (String) C51379a.meta(1024768, context, sb.toString());
    }

    public byte[] decodeMillion(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr2.length == 0) {
            return new byte[0];
        }
        if (f128506o || bArr.length == 16) {
            return (byte[]) C51379a.meta(C30514a.f79747n, null, C18481a.m44727a(bArr, bArr2));
        }
        throw new AssertionError();
    }

    public byte[] encode(byte[] bArr) {
        return C51379a.encode(bArr);
    }

    public byte[] encodeMillion(byte[] bArr, byte[] bArr2) {
        return new byte[0];
    }

    public int isUseTTNet(boolean z) {
        f128502b = z;
        return 1;
    }

    public String onEvent() {
        return C51373a.m110489a().mo102052b();
    }

    public String pullSg() {
        return C51409f.m110570a();
    }

    public String pullVer(String str) {
        return C51409f.m110571a(str);
    }

    public void reportNow(final String str) {
        try {
            new Thread("CZL-MRP_T") {
                public final void run() {
                    C51393c.this.mo102096a(str);
                }
            }.start();
        } catch (Throwable unused) {
        }
    }

    public void reportNow(String str, boolean z) {
        if (!z) {
            reportNow(str);
        } else {
            mo102096a(str);
        }
    }

    public void run() {
        this.f128521l = true;
        C51410g.m110572a(this.f128514c, 3);
        m110543i();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("aid", m110536b());
            jSONObject.put("did", m110538d());
            jSONObject.put("iid", m110539e());
            jSONObject.put("load", f128512u);
            jSONObject.put("init", f128511t);
            jSONObject.put("event", C51373a.m110489a().mo102052b());
        } catch (Throwable unused) {
        }
        C51408e.m110567a(5, "start_thread", jSONObject);
        StringBuilder sb = new StringBuilder();
        sb.append(VERSION.SDK_INT);
        C51379a.meta(111, null, sb.toString());
        C51391c.m110527a(this.f128514c).mo102067a();
        C51389a.m110522a(this.f128514c).mo102058a();
        C51408e.m110568a(true);
        int i = 0;
        while (true) {
            i++;
            C18484d.m44731a(60000);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Thread.currentThread().getName());
            sb2.append("-");
            sb2.append(i);
            C51379a.meta(1213, null, sb2.toString());
            if (C51405d.m110561a()) {
                C51410g.m110572a(this.f128514c, 3);
            }
            if (C51405d.m110562b()) {
                reportNow("CZL-MRP_L", true);
            }
            if (C51405d.m110563c()) {
                C51391c.m110527a(this.f128514c).mo102067a();
            }
            if (C51405d.m110564d()) {
                C51389a.m110522a(this.f128514c).mo102058a();
            }
            if (C51405d.m110565e()) {
                C51408e.m110568a(true);
            }
        }
    }

    public void setCustomInfo(HashMap<String, Object> hashMap) {
        if (hashMap != null) {
            this.f128522n = hashMap;
        }
    }

    public void setEfficientDebug(boolean z) {
        this.f128513a = z;
    }

    public void setExpandFuntions(IExpendFunctions iExpendFunctions) {
        f128508q = iExpendFunctions;
    }

    public void setInterface(NetInterface netInterface) {
    }

    public void setNMSdkExpandInstance(ISdkNM iSdkNM) {
        f128507p = iSdkNM;
    }

    public void setNetwork(boolean z) {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:2|3|4|(1:8)|(1:12)|13|(2:17|18)|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0032 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setParams(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.Class<com.ss.sys.ces.c> r0 = com.p683ss.sys.ces.C51393c.class
            monitor-enter(r0)
            r1 = 1
            r3.f128520i = r1     // Catch:{ all -> 0x0034 }
            r1 = 0
            if (r4 == 0) goto L_0x0016
            int r2 = r4.length()     // Catch:{ all -> 0x0034 }
            if (r2 <= 0) goto L_0x0016
            r3.f128518g = r4     // Catch:{ all -> 0x0034 }
            r2 = 103(0x67, float:1.44E-43)
            com.p683ss.sys.ces.C51379a.meta(r2, r1, r4)     // Catch:{ all -> 0x0034 }
        L_0x0016:
            if (r5 == 0) goto L_0x0025
            int r4 = r5.length()     // Catch:{ all -> 0x0034 }
            if (r4 <= 0) goto L_0x0025
            r3.f128519h = r5     // Catch:{ all -> 0x0034 }
            r4 = 104(0x68, float:1.46E-43)
            com.p683ss.sys.ces.C51379a.meta(r4, r1, r5)     // Catch:{ all -> 0x0034 }
        L_0x0025:
            boolean r4 = r3.isAlive()     // Catch:{ all -> 0x0034 }
            if (r4 == 0) goto L_0x002f
            boolean r4 = r3.f128521l     // Catch:{ all -> 0x0034 }
            if (r4 != 0) goto L_0x0032
        L_0x002f:
            r3.start()     // Catch:{ Throwable -> 0x0032 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.sys.ces.C51393c.setParams(java.lang.String, java.lang.String):void");
    }

    public void setSession(String str) {
        if (str != null && str.length() > 0) {
            synchronized (this) {
                if (this.f128517f.length() <= 0 || !str.equals(this.f128517f)) {
                    this.f128517f = str;
                }
            }
        }
    }

    public void setUrlInterface(int i, String str) {
        if (str != null && str.length() > 0) {
            C18477a.m44713a(i, str);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00af */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p683ss.sys.ces.C51393c m110534a(final android.content.Context r9, long r10, int r12, com.p683ss.sys.ces.out.IExpendFunctions r13) {
        /*
            com.ss.sys.ces.c r0 = f128509r
            if (r0 != 0) goto L_0x019d
            java.lang.Class<com.ss.sys.ces.c> r0 = com.p683ss.sys.ces.C51393c.class
            monitor-enter(r0)
            java.util.Calendar r1 = java.util.Calendar.getInstance()     // Catch:{ all -> 0x019a }
            long r1 = r1.getTimeInMillis()     // Catch:{ all -> 0x019a }
            if (r13 == 0) goto L_0x0013
            f128508q = r13     // Catch:{ all -> 0x019a }
        L_0x0013:
            com.ss.sys.ces.c r13 = f128509r     // Catch:{ all -> 0x019a }
            r3 = 0
            if (r13 != 0) goto L_0x002d
            if (r9 != 0) goto L_0x0022
            android.app.Application r9 = com.p683ss.sys.ces.p2580a.C51380a.m110501b()     // Catch:{ all -> 0x019a }
            android.content.Context r9 = r9.getApplicationContext()     // Catch:{ all -> 0x019a }
        L_0x0022:
            if (r9 != 0) goto L_0x0026
            monitor-exit(r0)     // Catch:{ all -> 0x019a }
            return r3
        L_0x0026:
            com.ss.sys.ces.c r13 = new com.ss.sys.ces.c     // Catch:{ all -> 0x019a }
            r13.<init>(r9, r10)     // Catch:{ all -> 0x019a }
            f128509r = r13     // Catch:{ all -> 0x019a }
        L_0x002d:
            com.p683ss.p1096a.p1097a.C18477a.m44712a(r12)     // Catch:{ all -> 0x019a }
            long r10 = m110536b()     // Catch:{ all -> 0x019a }
            int r10 = (int) r10     // Catch:{ all -> 0x019a }
            com.p683ss.p1096a.p1097a.C18477a.m44715b(r10)     // Catch:{ all -> 0x019a }
            com.ss.sys.a.b r10 = com.p683ss.sys.p2576a.C51372b.m110482a(r9)     // Catch:{ all -> 0x019a }
            f128510s = r10     // Catch:{ all -> 0x019a }
            java.util.Calendar r10 = java.util.Calendar.getInstance()     // Catch:{ all -> 0x019a }
            long r10 = r10.getTimeInMillis()     // Catch:{ all -> 0x019a }
            com.ss.sys.ces.out.IExpendFunctions r13 = f128508q     // Catch:{ Throwable -> 0x005a }
            if (r13 == 0) goto L_0x0052
            com.ss.sys.ces.out.IExpendFunctions r13 = f128508q     // Catch:{ Throwable -> 0x005a }
            java.lang.String r4 = "cms"
            r13.loadLibrary(r9, r4)     // Catch:{ Throwable -> 0x005a }
            goto L_0x00b5
        L_0x0052:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException     // Catch:{ Throwable -> 0x005a }
            java.lang.String r4 = "null expend functions"
            r13.<init>(r4)     // Catch:{ Throwable -> 0x005a }
            throw r13     // Catch:{ Throwable -> 0x005a }
        L_0x005a:
            java.lang.String r13 = "cms"
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x019a }
            boolean r6 = com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46144a(r13)     // Catch:{ Throwable -> 0x00af }
            if (r6 == 0) goto L_0x00af
            android.content.Context r6 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ Throwable -> 0x00af }
            long r7 = com.bytedance.ies.ugc.p694a.C11010c.m22286g()     // Catch:{ Throwable -> 0x00af }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Throwable -> 0x00af }
            com.bytedance.android.p161c.C2835a.m8098a(r6, r7)     // Catch:{ Throwable -> 0x00af }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00af }
            r6.<init>()     // Catch:{ Throwable -> 0x00af }
            com.p683ss.android.ugc.aweme.p2391v.C47964c.m103778e()     // Catch:{ Throwable -> 0x00af }
            java.lang.String r7 = com.p683ss.android.ugc.aweme.p2391v.C47964c.m103775a()     // Catch:{ Throwable -> 0x00af }
            r6.append(r7)     // Catch:{ Throwable -> 0x00af }
            java.lang.String r7 = "/lib"
            r6.append(r7)     // Catch:{ Throwable -> 0x00af }
            r6.append(r13)     // Catch:{ Throwable -> 0x00af }
            java.lang.String r7 = ".so"
            r6.append(r7)     // Catch:{ Throwable -> 0x00af }
            java.lang.String r6 = r6.toString()     // Catch:{ Throwable -> 0x00af }
            java.io.File r7 = new java.io.File     // Catch:{ Throwable -> 0x00af }
            r7.<init>(r6)     // Catch:{ Throwable -> 0x00af }
            boolean r7 = r7.exists()     // Catch:{ Throwable -> 0x00af }
            if (r7 == 0) goto L_0x00ab
            r7 = 2
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46142a(r13, r7)     // Catch:{ Throwable -> 0x00af }
            java.lang.System.load(r6)     // Catch:{ Throwable -> 0x00af }
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46141a(r4, r13)     // Catch:{ Throwable -> 0x00af }
            goto L_0x00b5
        L_0x00ab:
            r6 = 3
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46142a(r13, r6)     // Catch:{ Throwable -> 0x00af }
        L_0x00af:
            com.bytedance.p723j.C11511a.m23578a(r13)     // Catch:{ all -> 0x019a }
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46141a(r4, r13)     // Catch:{ all -> 0x019a }
        L_0x00b5:
            java.util.Calendar r13 = java.util.Calendar.getInstance()     // Catch:{ all -> 0x019a }
            long r4 = r13.getTimeInMillis()     // Catch:{ all -> 0x019a }
            r13 = 0
            long r4 = r4 - r10
            f128512u = r4     // Catch:{ all -> 0x019a }
            com.p683ss.sys.ces.p2583gg.C51411tt.init_gorgon()     // Catch:{ all -> 0x019a }
            r10 = 102(0x66, float:1.43E-43)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x019a }
            r11.<init>()     // Catch:{ all -> 0x019a }
            long r4 = m110536b()     // Catch:{ all -> 0x019a }
            int r13 = (int) r4     // Catch:{ all -> 0x019a }
            r11.append(r13)     // Catch:{ all -> 0x019a }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x019a }
            com.p683ss.sys.ces.C51379a.meta(r10, r9, r11)     // Catch:{ all -> 0x019a }
            int r10 = com.p683ss.sys.ces.C51388b.m110521a(r12)     // Catch:{ all -> 0x019a }
            r11 = 101(0x65, float:1.42E-43)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x019a }
            r12.<init>()     // Catch:{ all -> 0x019a }
            r12.append(r10)     // Catch:{ all -> 0x019a }
            java.lang.String r10 = r12.toString()     // Catch:{ all -> 0x019a }
            com.p683ss.sys.ces.C51379a.meta(r11, r3, r10)     // Catch:{ all -> 0x019a }
            r10 = 1020(0x3fc, float:1.43E-42)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x019a }
            r11.<init>()     // Catch:{ all -> 0x019a }
            java.lang.String r12 = m110537c()     // Catch:{ all -> 0x019a }
            r11.append(r12)     // Catch:{ all -> 0x019a }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x019a }
            com.p683ss.sys.ces.C51379a.meta(r10, r3, r11)     // Catch:{ all -> 0x019a }
            r10 = 105(0x69, float:1.47E-43)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x019a }
            r11.<init>()     // Catch:{ all -> 0x019a }
            int r12 = com.p683ss.sys.ces.p2580a.C51380a.m110500b(r9)     // Catch:{ all -> 0x019a }
            r11.append(r12)     // Catch:{ all -> 0x019a }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x019a }
            com.p683ss.sys.ces.C51379a.meta(r10, r3, r11)     // Catch:{ all -> 0x019a }
            r10 = 106(0x6a, float:1.49E-43)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x019a }
            r11.<init>()     // Catch:{ all -> 0x019a }
            java.lang.String r12 = com.p683ss.sys.ces.p2580a.C51380a.m110499a(r9)     // Catch:{ all -> 0x019a }
            r11.append(r12)     // Catch:{ all -> 0x019a }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x019a }
            com.p683ss.sys.ces.C51379a.meta(r10, r3, r11)     // Catch:{ all -> 0x019a }
            r10 = 107(0x6b, float:1.5E-43)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x019a }
            r11.<init>()     // Catch:{ all -> 0x019a }
            java.lang.String r12 = com.p683ss.sys.ces.p2580a.C51380a.m110503c(r9)     // Catch:{ all -> 0x019a }
            r11.append(r12)     // Catch:{ all -> 0x019a }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x019a }
            com.p683ss.sys.ces.C51379a.meta(r10, r3, r11)     // Catch:{ all -> 0x019a }
            r10 = 108(0x6c, float:1.51E-43)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x019a }
            r11.<init>()     // Catch:{ all -> 0x019a }
            java.lang.String r12 = com.p683ss.sys.ces.p2580a.C51380a.m110505d(r9)     // Catch:{ all -> 0x019a }
            r11.append(r12)     // Catch:{ all -> 0x019a }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x019a }
            com.p683ss.sys.ces.C51379a.meta(r10, r3, r11)     // Catch:{ all -> 0x019a }
            r10 = 109(0x6d, float:1.53E-43)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x019a }
            r11.<init>()     // Catch:{ all -> 0x019a }
            java.lang.String r12 = com.p683ss.sys.ces.p2580a.C51380a.m110502c()     // Catch:{ all -> 0x019a }
            r11.append(r12)     // Catch:{ all -> 0x019a }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x019a }
            com.p683ss.sys.ces.C51379a.meta(r10, r3, r11)     // Catch:{ all -> 0x019a }
            r10 = 110(0x6e, float:1.54E-43)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x019a }
            r11.<init>()     // Catch:{ all -> 0x019a }
            java.lang.String r12 = com.p683ss.sys.ces.p2580a.C51380a.m110504d()     // Catch:{ all -> 0x019a }
            r11.append(r12)     // Catch:{ all -> 0x019a }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x019a }
            com.p683ss.sys.ces.C51379a.meta(r10, r3, r11)     // Catch:{ all -> 0x019a }
            com.ss.sys.ces.c$1 r10 = new com.ss.sys.ces.c$1     // Catch:{ all -> 0x019a }
            java.lang.String r11 = "0.6.11.29.02-MT"
            r10.<init>(r11, r9)     // Catch:{ all -> 0x019a }
            r10.start()     // Catch:{ all -> 0x019a }
            java.util.Calendar r9 = java.util.Calendar.getInstance()     // Catch:{ all -> 0x019a }
            long r9 = r9.getTimeInMillis()     // Catch:{ all -> 0x019a }
            r11 = 0
            long r9 = r9 - r1
            f128511t = r9     // Catch:{ all -> 0x019a }
            monitor-exit(r0)     // Catch:{ all -> 0x019a }
            goto L_0x019d
        L_0x019a:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x019a }
            throw r9
        L_0x019d:
            com.ss.sys.ces.c r9 = f128509r
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.sys.ces.C51393c.m110534a(android.content.Context, long, int, com.ss.sys.ces.out.IExpendFunctions):com.ss.sys.ces.c");
    }
}
