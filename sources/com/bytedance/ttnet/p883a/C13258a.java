package com.bytedance.ttnet.p883a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Looper;
import android.os.Message;
import android.webkit.CookieManager;
import com.bytedance.common.p518a.C9342e;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9415i;
import com.bytedance.common.utility.C9425l;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.common.utility.p523c.C9389c;
import com.bytedance.common.utility.p523c.C9393e;
import com.bytedance.common.utility.p525e.C9402b;
import com.bytedance.frameworks.baselib.network.http.C9841b;
import com.bytedance.frameworks.baselib.network.http.C9894e.C9897c;
import com.bytedance.frameworks.baselib.network.http.C9894e.C9899e;
import com.bytedance.frameworks.baselib.network.http.C9894e.C9901g;
import com.bytedance.frameworks.baselib.network.http.C9894e.C9902h;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.C9877b;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.C9878c;
import com.bytedance.frameworks.baselib.network.http.p568a.C9839f;
import com.bytedance.frameworks.baselib.network.http.p569b.C9842a;
import com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9865e;
import com.bytedance.frameworks.baselib.network.http.p574e.C9908c;
import com.bytedance.frameworks.baselib.network.http.p574e.C9910e;
import com.bytedance.frameworks.baselib.network.http.p574e.C9912g;
import com.bytedance.frameworks.baselib.network.http.p574e.C9915j;
import com.bytedance.frameworks.core.p577a.C9923a.C9924a;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.retrofit2.SsHttpCall.C12672a;
import com.bytedance.ttnet.C13257a;
import com.bytedance.ttnet.C13281b;
import com.bytedance.ttnet.C13281b.C13284b;
import com.bytedance.ttnet.C13303d;
import com.bytedance.ttnet.encrypt.C13343c.C13344a;
import com.bytedance.ttnet.hostmonitor.C13348c;
import com.bytedance.ttnet.hostmonitor.C13350e;
import com.bytedance.ttnet.hostmonitor.C13351f;
import com.bytedance.ttnet.hostmonitor.C13356g;
import com.bytedance.ttnet.hostmonitor.ConnectivityReceiver;
import com.bytedance.ttnet.hostmonitor.HostMonitor;
import com.bytedance.ttnet.hostmonitor.HostMonitorBroadcastReceiver;
import com.bytedance.ttnet.p885c.C13302e;
import com.bytedance.ttnet.p887e.C13337i;
import com.bytedance.ttnet.retrofit.C13357a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.a.a */
public class C13258a implements C9382a, C9877b, C9878c, C9897c, C9899e, C9901g, C9902h, C9924a, C12672a, C13284b, C13344a {

    /* renamed from: a */
    public static boolean f34507a = false;

    /* renamed from: al */
    private static int f34508al = 1;

    /* renamed from: am */
    private static int f34509am = 1;

    /* renamed from: an */
    private static int f34510an = 1;

    /* renamed from: ao */
    private static int f34511ao = 1;

    /* renamed from: ap */
    private static int f34512ap = 1;

    /* renamed from: aq */
    private static int f34513aq = -1;

    /* renamed from: ar */
    private static int f34514ar = -1;

    /* renamed from: au */
    private static int f34515au = -1;

    /* renamed from: av */
    private static boolean f34516av = false;

    /* renamed from: aw */
    private static boolean f34517aw = false;

    /* renamed from: f */
    public static int f34518f = 3;

    /* renamed from: n */
    static boolean f34519n;

    /* renamed from: o */
    static boolean f34520o;

    /* renamed from: p */
    private static C13258a f34521p;

    /* renamed from: q */
    private static int f34522q;

    /* renamed from: r */
    private static int f34523r;

    /* renamed from: A */
    private Map<String, String> f34524A = new HashMap();

    /* renamed from: B */
    private HashMap<String, InetAddress[]> f34525B;

    /* renamed from: C */
    private HashMap<C13267a, C13267a> f34526C;

    /* renamed from: D */
    private HashMap<String, String> f34527D = new HashMap<>();

    /* renamed from: E */
    private HashMap<String, String> f34528E = new HashMap<>();

    /* renamed from: F */
    private String f34529F = "";

    /* renamed from: G */
    private int f34530G = 0;

    /* renamed from: H */
    private int f34531H = 0;

    /* renamed from: I */
    private int f34532I = 0;

    /* renamed from: J */
    private int f34533J = 0;

    /* renamed from: K */
    private long f34534K = 0;

    /* renamed from: L */
    private int f34535L = 0;

    /* renamed from: M */
    private int f34536M = 0;

    /* renamed from: N */
    private int f34537N = 1;

    /* renamed from: O */
    private int f34538O = 1;

    /* renamed from: P */
    private int f34539P = 0;

    /* renamed from: Q */
    private int f34540Q = 1;

    /* renamed from: R */
    private int f34541R = 1;

    /* renamed from: S */
    private int f34542S = 0;

    /* renamed from: T */
    private int f34543T = 0;

    /* renamed from: U */
    private int f34544U = 1;

    /* renamed from: V */
    private int f34545V = 1;

    /* renamed from: W */
    private int f34546W = 1;

    /* renamed from: X */
    private int f34547X = 1;

    /* renamed from: Y */
    private int f34548Y = 1;

    /* renamed from: Z */
    private int f34549Z = 1;

    /* renamed from: aa */
    private int f34550aa = 1;

    /* renamed from: ab */
    private int f34551ab = 0;

    /* renamed from: ac */
    private Set<String> f34552ac;

    /* renamed from: ad */
    private int f34553ad = 600000;

    /* renamed from: ae */
    private String f34554ae = "";

    /* renamed from: af */
    private String f34555af = "";

    /* renamed from: ag */
    private Set<String> f34556ag = new HashSet();

    /* renamed from: ah */
    private List<String> f34557ah = new CopyOnWriteArrayList();

    /* renamed from: ai */
    private int f34558ai = 0;

    /* renamed from: aj */
    private List<String> f34559aj = new CopyOnWriteArrayList();

    /* renamed from: ak */
    private int f34560ak = 0;

    /* renamed from: as */
    private volatile int f34561as;

    /* renamed from: at */
    private volatile C9342e f34562at = null;

    /* renamed from: b */
    boolean f34563b;

    /* renamed from: c */
    AtomicBoolean f34564c = new AtomicBoolean(false);

    /* renamed from: d */
    public final Context f34565d;

    /* renamed from: e */
    public Map<C13267a, C13267a> f34566e;

    /* renamed from: g */
    public int f34567g = 0;

    /* renamed from: h */
    public volatile C13273e f34568h = null;

    /* renamed from: i */
    public final C9381g f34569i = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: j */
    C13350e f34570j;

    /* renamed from: k */
    C13348c f34571k;

    /* renamed from: l */
    public int f34572l;

    /* renamed from: m */
    final HostMonitorBroadcastReceiver f34573m = new HostMonitorBroadcastReceiver() {
        /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|(7:12|13|(2:15|(1:19))|20|(1:22)|23|(1:25)))|26|27|(1:29)(1:30)|(1:32)) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x005f */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0065 A[Catch:{ Throwable -> 0x006f }] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0066 A[Catch:{ Throwable -> 0x006f }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0069 A[Catch:{ Throwable -> 0x006f }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo24864a(com.bytedance.ttnet.hostmonitor.HostStatus r9) {
            /*
                r8 = this;
                if (r9 != 0) goto L_0x0003
                return
            L_0x0003:
                com.bytedance.ttnet.a.a r0 = com.bytedance.ttnet.p883a.C13258a.this     // Catch:{ Throwable -> 0x006f }
                android.content.Context r0 = r0.f34565d     // Catch:{ Throwable -> 0x006f }
                boolean r0 = com.bytedance.frameworks.baselib.network.http.p574e.C9912g.m19864a(r0)     // Catch:{ Throwable -> 0x006f }
                if (r0 != 0) goto L_0x000e
                return
            L_0x000e:
                super.mo24864a(r9)     // Catch:{ Throwable -> 0x006f }
                boolean r0 = r9.f34822d     // Catch:{ Throwable -> 0x006f }
                if (r0 == 0) goto L_0x006e
                com.bytedance.ttnet.a.a r0 = com.bytedance.ttnet.p883a.C13258a.this     // Catch:{ Throwable -> 0x006f }
                com.bytedance.ttnet.a.e r0 = r0.f34568h     // Catch:{ Throwable -> 0x006f }
                r1 = 1
                if (r0 == 0) goto L_0x005f
                com.bytedance.ttnet.a.a r0 = com.bytedance.ttnet.p883a.C13258a.this     // Catch:{ Throwable -> 0x006f }
                com.bytedance.ttnet.a.e r0 = r0.f34568h     // Catch:{ Throwable -> 0x006f }
                com.bytedance.ttnet.a.a r2 = com.bytedance.ttnet.p883a.C13258a.this     // Catch:{ Throwable -> 0x006f }
                android.content.Context r2 = r2.f34565d     // Catch:{ Throwable -> 0x006f }
                if (r2 == 0) goto L_0x005f
                int r3 = com.bytedance.ttnet.p883a.C13273e.m26720d(r2)     // Catch:{ Throwable -> 0x005f }
                if (r3 != r1) goto L_0x0040
                java.lang.String r4 = com.bytedance.ttnet.p883a.C13273e.m26721e(r2)     // Catch:{ Throwable -> 0x005f }
                if (r4 == 0) goto L_0x0040
                java.lang.String r5 = r0.f34618g     // Catch:{ Throwable -> 0x005f }
                boolean r4 = r4.equals(r5)     // Catch:{ Throwable -> 0x005f }
                if (r4 != 0) goto L_0x0040
                java.lang.String r3 = "onConnectivityChange"
                r0.mo24877a(r2, r3)     // Catch:{ Throwable -> 0x005f }
                goto L_0x005f
            L_0x0040:
                int r4 = r0.f34619h     // Catch:{ Throwable -> 0x005f }
                if (r4 == r3) goto L_0x0049
                java.lang.String r3 = "onConnectivityChange"
                r0.mo24877a(r2, r3)     // Catch:{ Throwable -> 0x005f }
            L_0x0049:
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x005f }
                long r5 = r0.f34614c     // Catch:{ Throwable -> 0x005f }
                r7 = 0
                long r3 = r3 - r5
                int r5 = r0.f34612a     // Catch:{ Throwable -> 0x005f }
                int r5 = r5 * 1000
                long r5 = (long) r5     // Catch:{ Throwable -> 0x005f }
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 <= 0) goto L_0x005f
                java.lang.String r3 = "onConnectivityChange"
                r0.mo24877a(r2, r3)     // Catch:{ Throwable -> 0x005f }
            L_0x005f:
                com.bytedance.ttnet.hostmonitor.a r0 = r9.f34823e     // Catch:{ Throwable -> 0x006f }
                com.bytedance.ttnet.hostmonitor.a r9 = r9.f34824f     // Catch:{ Throwable -> 0x006f }
                if (r0 == r9) goto L_0x0066
                goto L_0x0067
            L_0x0066:
                r1 = 0
            L_0x0067:
                if (r1 == 0) goto L_0x006e
                com.bytedance.ttnet.a.a r9 = com.bytedance.ttnet.p883a.C13258a.this     // Catch:{ Throwable -> 0x006f }
                r9.mo24863q()     // Catch:{ Throwable -> 0x006f }
            L_0x006e:
                return
            L_0x006f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p883a.C13258a.C132591.mo24864a(com.bytedance.ttnet.hostmonitor.HostStatus):void");
        }
    };

    /* renamed from: s */
    private final boolean f34574s;

    /* renamed from: t */
    private volatile boolean f34575t;

    /* renamed from: u */
    private boolean f34576u = true;

    /* renamed from: v */
    private long f34577v;

    /* renamed from: w */
    private long f34578w;

    /* renamed from: x */
    private volatile boolean f34579x = false;

    /* renamed from: y */
    private HashMap<String, String> f34580y = new HashMap<>();

    /* renamed from: z */
    private HashMap<String, String> f34581z = new HashMap<>();

    /* renamed from: com.bytedance.ttnet.a.a$a */
    static class C13267a {

        /* renamed from: a */
        static String f34593a = "url_regex";

        /* renamed from: b */
        static String f34594b = "err_count";

        /* renamed from: c */
        String f34595c;

        /* renamed from: d */
        Matcher f34596d;

        /* renamed from: e */
        int f34597e;

        C13267a() {
        }

        public final int hashCode() {
            return this.f34595c.hashCode();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo24866a(String str) {
            if (!C9431p.m18664a(str)) {
                this.f34595c = str;
                this.f34596d = Pattern.compile(str).matcher("");
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f34595c.equals(((C13267a) obj).f34595c);
        }
    }

    /* renamed from: com.bytedance.ttnet.a.a$b */
    static final class C13268b extends BroadcastReceiver {
        C13268b() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && "com.bytedance.ttnet.config.appconfig.SYNC_MAIN_PROCESS_CONFIG".equals(intent.getAction())) {
                new C9393e("SyncMainProcessConfig") {
                    public final void run() {
                        C13280i.m26742i().mo24890j();
                    }
                }.start();
            }
        }
    }

    /* renamed from: l */
    public static boolean m26676l() {
        return false;
    }

    /* renamed from: n */
    public final Set<String> mo24861n() {
        return this.f34552ac;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return m26675i(r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.net.InetAddress> mo17823a(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r3)
            r1 = 0
            if (r0 != 0) goto L_0x0040
            boolean r0 = r2.f34574s
            if (r0 != 0) goto L_0x000c
            goto L_0x0040
        L_0x000c:
            r2.mo24859k()
            monitor-enter(r2)
            java.util.HashMap<java.lang.String, java.net.InetAddress[]> r0 = r2.f34525B     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x001d
            java.util.HashMap<java.lang.String, java.net.InetAddress[]> r0 = r2.f34525B     // Catch:{ all -> 0x003d }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x003d }
            r1 = r0
            java.net.InetAddress[] r1 = (java.net.InetAddress[]) r1     // Catch:{ all -> 0x003d }
        L_0x001d:
            if (r1 == 0) goto L_0x0037
            int r0 = r1.length     // Catch:{ all -> 0x003d }
            if (r0 <= 0) goto L_0x0037
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x003d }
            r3.<init>()     // Catch:{ all -> 0x003d }
            java.util.List r0 = java.util.Arrays.asList(r1)     // Catch:{ all -> 0x003d }
            r3.addAll(r0)     // Catch:{ all -> 0x003d }
            int r0 = f34515au     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0035
            java.util.Collections.shuffle(r3)     // Catch:{ all -> 0x003d }
        L_0x0035:
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            return r3
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            java.util.List r3 = r2.m26675i(r3)
            return r3
        L_0x003d:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            throw r3
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p883a.C13258a.mo17823a(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:15|16|(1:18)(1:19)|(1:24)(1:23)|25|26|(2:33|(5:35|36|37|38|39))|41|42) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x008f */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096 A[Catch:{ Throwable -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d3 A[Catch:{ Throwable -> 0x00e0 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo17822a(java.lang.String r10, com.bytedance.frameworks.baselib.network.http.C9841b r11) {
        /*
            r9 = this;
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r10)
            if (r0 == 0) goto L_0x0007
            return r10
        L_0x0007:
            java.net.URI r0 = com.bytedance.frameworks.baselib.network.http.p574e.C9915j.m19868a(r10)     // Catch:{ Throwable -> 0x00e0 }
            r1 = 0
            java.net.URI r0 = r9.m26663a(r0, r1)     // Catch:{ Throwable -> 0x00e0 }
            java.lang.String r2 = r0.getHost()     // Catch:{ Throwable -> 0x00e0 }
            int r3 = r0.getPort()     // Catch:{ Throwable -> 0x00e0 }
            java.lang.String r4 = r0.getScheme()     // Catch:{ Throwable -> 0x00e0 }
            java.lang.String[] r5 = m26677p()     // Catch:{ Throwable -> 0x00e0 }
            int r6 = r5.length     // Catch:{ Throwable -> 0x00e0 }
            r7 = 0
        L_0x0022:
            if (r7 >= r6) goto L_0x0030
            r8 = r5[r7]     // Catch:{ Throwable -> 0x00e0 }
            boolean r8 = r8.equals(r2)     // Catch:{ Throwable -> 0x00e0 }
            if (r8 == 0) goto L_0x002d
            return r10
        L_0x002d:
            int r7 = r7 + 1
            goto L_0x0022
        L_0x0030:
            boolean r5 = r9.f34574s     // Catch:{ Throwable -> 0x00e0 }
            if (r5 == 0) goto L_0x0038
            r9.mo24859k()     // Catch:{ Throwable -> 0x00e0 }
            goto L_0x003b
        L_0x0038:
            r9.mo24858j()     // Catch:{ Throwable -> 0x00e0 }
        L_0x003b:
            monitor-enter(r9)     // Catch:{ Throwable -> 0x00e0 }
            java.util.Map<java.lang.String, java.lang.String> r5 = r9.f34524A     // Catch:{ all -> 0x00dd }
            r6 = 0
            if (r5 == 0) goto L_0x004a
            java.util.Map<java.lang.String, java.lang.String> r5 = r9.f34524A     // Catch:{ all -> 0x00dd }
            java.lang.Object r5 = r5.get(r2)     // Catch:{ all -> 0x00dd }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00dd }
            goto L_0x004b
        L_0x004a:
            r5 = r6
        L_0x004b:
            if (r5 == 0) goto L_0x005a
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r9.f34580y     // Catch:{ all -> 0x00dd }
            if (r7 == 0) goto L_0x005a
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r9.f34580y     // Catch:{ all -> 0x00dd }
            java.lang.Object r5 = r7.get(r5)     // Catch:{ all -> 0x00dd }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00dd }
            goto L_0x005b
        L_0x005a:
            r5 = r6
        L_0x005b:
            java.lang.String r7 = com.bytedance.ttnet.C13257a.m26657a()     // Catch:{ Throwable -> 0x008f }
            java.lang.String r7 = com.bytedance.ttnet.C13257a.m26658a(r7)     // Catch:{ Throwable -> 0x008f }
            boolean r2 = r7.equals(r2)     // Catch:{ Throwable -> 0x008f }
            if (r2 != 0) goto L_0x0079
            if (r5 == 0) goto L_0x008f
            java.lang.String r2 = com.bytedance.ttnet.C13257a.m26657a()     // Catch:{ Throwable -> 0x008f }
            java.lang.String r2 = com.bytedance.ttnet.C13257a.m26658a(r2)     // Catch:{ Throwable -> 0x008f }
            boolean r2 = r2.equals(r5)     // Catch:{ Throwable -> 0x008f }
            if (r2 == 0) goto L_0x008f
        L_0x0079:
            com.bytedance.ttnet.a.e r2 = r9.f34568h     // Catch:{ Throwable -> 0x008f }
            if (r2 == 0) goto L_0x008f
            com.bytedance.ttnet.a.e r2 = r9.f34568h     // Catch:{ Throwable -> 0x008f }
            android.util.Pair r2 = r2.mo24875a()     // Catch:{ Throwable -> 0x008f }
            if (r2 == 0) goto L_0x008f
            java.lang.Object r7 = r2.first     // Catch:{ Throwable -> 0x008f }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Throwable -> 0x008f }
            java.lang.Object r2 = r2.second     // Catch:{ Throwable -> 0x008e }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x008e }
            r5 = r2
        L_0x008e:
            r6 = r7
        L_0x008f:
            monitor-exit(r9)     // Catch:{ all -> 0x00dd }
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r5)     // Catch:{ Throwable -> 0x00e0 }
            if (r2 != 0) goto L_0x009f
            com.bytedance.frameworks.baselib.network.http.e.c r2 = new com.bytedance.frameworks.baselib.network.http.e.c     // Catch:{ Throwable -> 0x00e0 }
            r2.<init>(r5, r3, r4)     // Catch:{ Throwable -> 0x00e0 }
            java.net.URI r0 = com.bytedance.frameworks.baselib.network.http.p574e.C9915j.m19870a(r0, r2)     // Catch:{ Throwable -> 0x00e0 }
        L_0x009f:
            java.lang.String r11 = r9.m26661a(r0, r11, r6, r1)     // Catch:{ Throwable -> 0x00e0 }
            java.lang.String r0 = "?"
            boolean r0 = r11.contains(r0)     // Catch:{ Throwable -> 0x00e0 }
            if (r0 != 0) goto L_0x00cc
            java.lang.String r0 = "?"
            boolean r0 = r10.contains(r0)     // Catch:{ Throwable -> 0x00e0 }
            if (r0 == 0) goto L_0x00cc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00e0 }
            r0.<init>()     // Catch:{ Throwable -> 0x00e0 }
            r0.append(r11)     // Catch:{ Throwable -> 0x00e0 }
            java.lang.String r11 = "?"
            int r11 = r10.indexOf(r11)     // Catch:{ Throwable -> 0x00e0 }
            java.lang.String r11 = r10.substring(r11)     // Catch:{ Throwable -> 0x00e0 }
            r0.append(r11)     // Catch:{ Throwable -> 0x00e0 }
            java.lang.String r11 = r0.toString()     // Catch:{ Throwable -> 0x00e0 }
        L_0x00cc:
            r10 = r11
            boolean r11 = com.bytedance.ttnet.C13281b.m26758a()     // Catch:{ Throwable -> 0x00e0 }
            if (r11 != 0) goto L_0x00e0
            com.bytedance.ttnet.d.c r11 = com.bytedance.ttnet.p886d.C13314c.m26812a()     // Catch:{ Throwable -> 0x00e0 }
            java.lang.String r11 = r11.mo24923a(r10)     // Catch:{ Throwable -> 0x00e0 }
            r10 = r11
            goto L_0x00e0
        L_0x00dd:
            r11 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00dd }
            throw r11     // Catch:{ Throwable -> 0x00e0 }
        L_0x00e0:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p883a.C13258a.mo17822a(java.lang.String, com.bytedance.frameworks.baselib.network.http.b):java.lang.String");
    }

    /* renamed from: a */
    private static boolean m26666a(HashMap<String, String> hashMap, JSONObject jSONObject) throws JSONException {
        Matcher matcher = Pattern.compile("^([0-9a-zA-Z-]{1,40}\\.){1,5}[0-9a-zA-Z]{1,20}$").matcher("");
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            String string = jSONObject.getString(str);
            if (C9431p.m18664a(str) || !matcher.reset(string).matches()) {
                return false;
            }
            hashMap.put(str, string);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo17824a(String str, String str2, boolean z) throws IOException {
        if (!this.f34559aj.isEmpty()) {
            Iterator it = this.f34559aj.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                if (!C9431p.m18664a(str3) && str.endsWith(str3)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(str2);
                        jSONObject.put("url", sb.toString());
                        jSONObject.put("replace", z);
                        String str4 = "api_http";
                        if (C13303d.f34698a != null) {
                            C13303d.f34698a.mo24903a(str4, jSONObject);
                        }
                    } catch (Throwable unused) {
                    }
                    if (C13303d.f34701d && !z) {
                        throw new C9839f("Api http request is not allowed to be executed");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo17792a() {
        SharedPreferences a = C35807d.m80935a(this.f34565d, "ss_app_config", 0);
        this.f34533J = a.getInt("chromium_boot_failures", 0);
        this.f34534K = a.getLong("chromium_boot_failures_timestamp", 0);
        if (this.f34533J > 3 && System.currentTimeMillis() - this.f34534K > TimeUnit.DAYS.toMillis(1)) {
            this.f34533J = 3;
        }
        if (!mo24856h()) {
            return false;
        }
        Editor edit = a.edit();
        edit.putInt("chromium_boot_failures", this.f34533J + 1);
        edit.putLong("chromium_boot_failures_timestamp", System.currentTimeMillis());
        C9402b.m18594a(edit);
        C9389c.m18569b().schedule(new Runnable() {
            public final void run() {
                try {
                    synchronized (C13258a.this) {
                        Editor edit = C35807d.m80935a(C13258a.this.f34565d, "ss_app_config", 0).edit();
                        edit.putInt("chromium_boot_failures", 0);
                        C9402b.m18594a(edit);
                    }
                } catch (Throwable unused) {
                }
            }
        }, 10, TimeUnit.SECONDS);
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(25:134|135|(1:137)(1:138)|139|(1:141)|142|(1:144)|145|(3:147|(2:149|(2:151|239)(1:238))(2:152|237)|153)|236|154|(1:158)|159|(3:161|(2:163|(2:165|243)(1:242))(2:166|241)|167)|240|168|169|170|(1:174)|175|176|177|178|181|182) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:181:0x0644 */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x033a A[SYNTHETIC, Splitter:B:129:0x033a] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x035b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x064b  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0667  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x06d7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x023c A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24852a(java.lang.Object r69) throws java.lang.Exception {
        /*
            r68 = this;
            r1 = r68
            r0 = r69
            boolean r2 = r0 instanceof java.lang.String
            r3 = 0
            if (r2 == 0) goto L_0x0026
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r0)
            if (r2 == 0) goto L_0x0012
            return r3
        L_0x0012:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>(r0)
            java.lang.String r0 = "message"
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r4 = "success"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x002f
            return r3
        L_0x0026:
            boolean r2 = r0 instanceof org.json.JSONObject
            if (r2 == 0) goto L_0x002e
            r2 = r0
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            if (r2 != 0) goto L_0x0032
            return r3
        L_0x0032:
            java.lang.String r0 = "data"
            org.json.JSONObject r2 = r2.getJSONObject(r0)
            java.lang.String r0 = "mapping"
            org.json.JSONObject r0 = r2.optJSONObject(r0)
            if (r0 != 0) goto L_0x0045
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L_0x0045:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            boolean r5 = m26666a(r4, r0)
            r6 = 1
            if (r5 == 0) goto L_0x0064
            monitor-enter(r68)
            r1.f34580y = r4     // Catch:{ all -> 0x0061 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x0061 }
            r5.<init>()     // Catch:{ all -> 0x0061 }
            r5.putAll(r4)     // Catch:{ all -> 0x0061 }
            r1.f34581z = r5     // Catch:{ all -> 0x0061 }
            monitor-exit(r68)     // Catch:{ all -> 0x0061 }
            r4 = 1
            goto L_0x0065
        L_0x0061:
            r0 = move-exception
            monitor-exit(r68)     // Catch:{ all -> 0x0061 }
            throw r0
        L_0x0064:
            r4 = 0
        L_0x0065:
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "dns_mapping"
            org.json.JSONArray r0 = r2.optJSONArray(r0)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            m26668b(r7, r0)
            java.lang.String r8 = ""
            if (r0 == 0) goto L_0x0085
            int r9 = r7.size()
            if (r9 <= 0) goto L_0x0085
            java.lang.String r8 = r0.toString()
        L_0x0085:
            java.lang.String r0 = "shuffle_dns"
            int r0 = r2.optInt(r0)
            f34515au = r0
            java.lang.String r0 = "use_dns_mapping"
            r9 = -1
            int r0 = r2.optInt(r0, r9)
            com.bytedance.frameworks.baselib.network.http.C9894e.m19817a(r0)
            java.lang.String r0 = "use_http_dns"
            int r0 = r2.optInt(r0, r9)
            f34513aq = r0
            java.lang.String r0 = "collect_recent_page_info_enable"
            int r0 = r2.optInt(r0, r9)
            f34514ar = r0
            monitor-enter(r68)
            r1.f34525B = r7     // Catch:{ all -> 0x06f3 }
            monitor-exit(r68)     // Catch:{ all -> 0x06f3 }
            java.lang.String r0 = "https_dns_err_max"
            r7 = 3
            int r7 = r2.optInt(r0, r7)
            java.lang.String r0 = "https_dns_err_policy"
            int r10 = r2.optInt(r0, r3)
            java.lang.String r0 = "hs_open"
            int r11 = r2.optInt(r0, r3)
            java.lang.String r0 = "ok_http_open"
            int r12 = r2.optInt(r0, r3)
            java.lang.String r0 = "ok_http3_open"
            int r13 = r2.optInt(r0, r3)
            java.lang.String r0 = "chromium_open"
            int r14 = r2.optInt(r0, r3)
            java.lang.String r0 = "cronet_version"
            int r15 = r2.optInt(r0, r3)
            java.lang.String r0 = "http_dns_enabled"
            int r9 = r2.optInt(r0, r3)
            java.lang.String r0 = "detect_open"
            r17 = r8
            int r8 = r2.optInt(r0, r3)
            java.lang.String r0 = "detect_native_page"
            int r3 = r2.optInt(r0, r6)
            java.lang.String r0 = "collect_recent_page_info_enable"
            r18 = r5
            int r5 = r2.optInt(r0, r6)
            java.lang.String r0 = "i_host_select_open"
            r19 = r4
            r6 = 0
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "i_host_select_open_v2"
            r21 = r4
            r6 = 1
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "replace_url_open"
            r22 = r4
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "add_ss_queries_open"
            r23 = r4
            r6 = 0
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "add_ss_queries_header_open"
            r24 = r4
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "add_ss_queries_plaintext_open"
            r25 = r4
            r6 = 1
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "add_device_fingerprint_open"
            r26 = r4
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "image_ttnet_enabled"
            r27 = r4
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "sample_band_width_enabled"
            int r0 = r2.optInt(r0, r6)
            r28 = r0
            java.lang.String r0 = "cdn_sample_band_width_enabled"
            int r0 = r2.optInt(r0, r6)
            r29 = r0
            java.lang.String r0 = "dynamic_timeout_enabled"
            int r0 = r2.optInt(r0, r6)
            r30 = r0
            java.lang.String r0 = "dynamic_adjust_threadpool_size_open"
            r31 = r4
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "ttnet_token_enabled"
            r32 = r4
            r6 = 0
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "ttnet_token_api"
            java.lang.String r6 = "[]"
            java.lang.String r6 = r2.optString(r0, r6)
            java.lang.String r0 = "send_api_exception_sample"
            r33 = r6
            r6 = 1
            int r0 = r2.optInt(r0, r6)
            f34522q = r0
            java.lang.String r0 = "send_ss_etag_sample"
            int r0 = r2.optInt(r0, r6)
            f34523r = r0
            monitor-enter(r68)
            f34518f = r7     // Catch:{ all -> 0x06f0 }
            r1.f34560ak = r10     // Catch:{ all -> 0x06f0 }
            r1.f34530G = r11     // Catch:{ all -> 0x06f0 }
            r1.f34531H = r12     // Catch:{ all -> 0x06f0 }
            r1.f34532I = r13     // Catch:{ all -> 0x06f0 }
            r1.f34567g = r14     // Catch:{ all -> 0x06f0 }
            r1.f34558ai = r15     // Catch:{ all -> 0x06f0 }
            r1.f34535L = r9     // Catch:{ all -> 0x06f0 }
            r1.f34536M = r8     // Catch:{ all -> 0x06f0 }
            r1.f34537N = r3     // Catch:{ all -> 0x06f0 }
            r1.f34538O = r5     // Catch:{ all -> 0x06f0 }
            r6 = r21
            r1.f34539P = r6     // Catch:{ all -> 0x06f0 }
            r34 = r6
            r6 = r22
            r1.f34540Q = r6     // Catch:{ all -> 0x06f0 }
            r35 = r6
            r6 = r23
            r1.f34541R = r6     // Catch:{ all -> 0x06f0 }
            r36 = r6
            r6 = r24
            r1.f34542S = r6     // Catch:{ all -> 0x06f0 }
            r37 = r6
            r6 = r25
            r1.f34543T = r6     // Catch:{ all -> 0x06f0 }
            r38 = r6
            r6 = r26
            r1.f34544U = r6     // Catch:{ all -> 0x06f0 }
            r39 = r6
            r6 = r27
            r1.f34549Z = r6     // Catch:{ all -> 0x06f0 }
            r40 = r6
            r6 = r32
            r1.f34550aa = r6     // Catch:{ all -> 0x06f0 }
            r1.f34551ab = r4     // Catch:{ all -> 0x06f0 }
            r41 = r4
            r4 = r31
            r1.f34545V = r4     // Catch:{ all -> 0x06f0 }
            r0 = r28
            r1.f34546W = r0     // Catch:{ all -> 0x06f0 }
            r0 = r29
            r1.f34547X = r0     // Catch:{ all -> 0x06f0 }
            r0 = r30
            r1.f34548Y = r0     // Catch:{ all -> 0x06f0 }
            monitor-exit(r68)     // Catch:{ all -> 0x06f0 }
            int r0 = r1.f34550aa
            if (r0 <= 0) goto L_0x01da
            r0 = 1
            goto L_0x01db
        L_0x01da:
            r0 = 0
        L_0x01db:
            com.bytedance.frameworks.baselib.network.p567b.C9827f.m19662a(r0)
            int r0 = r1.f34548Y
            if (r0 <= 0) goto L_0x01e4
            r0 = 1
            goto L_0x01e5
        L_0x01e4:
            r0 = 0
        L_0x01e5:
            com.bytedance.frameworks.baselib.network.http.C9894e.m19826a(r0)
            java.lang.String r0 = ""
            r42 = r0
            java.lang.String r0 = "https_dns"
            org.json.JSONArray r0 = r2.optJSONArray(r0)     // Catch:{ Throwable -> 0x0215 }
            r43 = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch:{ Throwable -> 0x0217 }
            r4.<init>()     // Catch:{ Throwable -> 0x0217 }
            r44 = r6
            r6 = 0
            r1.m26665a(r4, r0, r6)     // Catch:{ Throwable -> 0x0219 }
            java.lang.String r6 = m26662a(r4)     // Catch:{ Throwable -> 0x0219 }
            monitor-enter(r68)     // Catch:{ Throwable -> 0x021b }
            r1.f34566e = r4     // Catch:{ all -> 0x0212 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0212 }
            r0.<init>()     // Catch:{ all -> 0x0212 }
            r0.putAll(r4)     // Catch:{ all -> 0x0212 }
            r1.f34526C = r0     // Catch:{ all -> 0x0212 }
            monitor-exit(r68)     // Catch:{ all -> 0x0212 }
            goto L_0x021b
        L_0x0212:
            r0 = move-exception
            monitor-exit(r68)     // Catch:{ all -> 0x0212 }
            throw r0     // Catch:{ Throwable -> 0x021b }
        L_0x0215:
            r43 = r4
        L_0x0217:
            r44 = r6
        L_0x0219:
            r6 = r42
        L_0x021b:
            java.lang.String r0 = ""
            java.lang.String r4 = "url_replace_mapping"
            org.json.JSONArray r4 = r2.optJSONArray(r4)     // Catch:{ Throwable -> 0x024d }
            r45 = r0
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Throwable -> 0x024f }
            r0.<init>()     // Catch:{ Throwable -> 0x024f }
            m26664a(r0, r4)     // Catch:{ Throwable -> 0x024f }
            if (r4 == 0) goto L_0x023b
            int r20 = r0.size()     // Catch:{ Throwable -> 0x024f }
            if (r20 <= 0) goto L_0x023b
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x024f }
            r45 = r4
        L_0x023b:
            monitor-enter(r68)     // Catch:{ Throwable -> 0x024f }
            r1.f34527D = r0     // Catch:{ all -> 0x024a }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x024a }
            r4.<init>()     // Catch:{ all -> 0x024a }
            r4.putAll(r0)     // Catch:{ all -> 0x024a }
            r1.f34528E = r4     // Catch:{ all -> 0x024a }
            monitor-exit(r68)     // Catch:{ all -> 0x024a }
            goto L_0x024f
        L_0x024a:
            r0 = move-exception
            monitor-exit(r68)     // Catch:{ all -> 0x024a }
            throw r0     // Catch:{ Throwable -> 0x024f }
        L_0x024d:
            r45 = r0
        L_0x024f:
            r0 = r45
            java.util.Set r4 = m26673f(r33)
            r1.f34552ac = r4
            java.lang.String r4 = "https_to_http"
            r46 = r5
            r5 = 1
            int r4 = r2.optInt(r4, r5)
            r47 = r3
            java.lang.String r3 = "http_to_https"
            int r3 = r2.optInt(r3, r5)
            r48 = r8
            java.lang.String r8 = "https_retry_http"
            int r8 = r2.optInt(r8, r5)
            r49 = r9
            java.lang.String r9 = "http_show_hijack"
            int r9 = r2.optInt(r9, r5)
            r50 = r15
            java.lang.String r15 = "http_verify_sign"
            int r15 = r2.optInt(r15, r5)
            monitor-enter(r68)
            f34508al = r4     // Catch:{ all -> 0x06ed }
            f34509am = r3     // Catch:{ all -> 0x06ed }
            f34510an = r8     // Catch:{ all -> 0x06ed }
            f34511ao = r9     // Catch:{ all -> 0x06ed }
            f34512ap = r15     // Catch:{ all -> 0x06ed }
            monitor-exit(r68)     // Catch:{ all -> 0x06ed }
            java.lang.String r5 = "enable_req_ticket"
            r51 = r15
            r15 = 1
            int r5 = r2.optInt(r5, r15)
            if (r5 <= 0) goto L_0x0299
            r5 = 1
            goto L_0x029a
        L_0x0299:
            r5 = 0
        L_0x029a:
            com.bytedance.ttnet.p887e.C13331f.f34791b = r5
            java.lang.String r5 = "ttnet_response_verify_enabled"
            r15 = -1
            int r5 = r2.optInt(r5, r15)
            java.lang.String r15 = "ttnet_response_verify"
            org.json.JSONArray r15 = r2.optJSONArray(r15)
            java.lang.String r16 = ""
            if (r15 == 0) goto L_0x02b1
            java.lang.String r16 = r15.toString()
        L_0x02b1:
            r52 = r9
            r9 = r16
            com.bytedance.ttnet.p887e.C13322a.m26828a(r5, r15)
            com.bytedance.ttnet.e.a$a r15 = new com.bytedance.ttnet.e.a$a
            r15.<init>()
            r15.f34765a = r5
            r15.f34766b = r9
            int r5 = r1.f34542S
            if (r5 > 0) goto L_0x02c9
            int r5 = r1.f34543T
            if (r5 <= 0) goto L_0x02cd
        L_0x02c9:
            r5 = 1
            com.bytedance.ttnet.retrofit.SsInterceptor.m26928a(r5)
        L_0x02cd:
            java.lang.String r5 = "read_response_buff_init_size"
            r9 = 0
            int r5 = r2.optInt(r5, r9)
            com.bytedance.frameworks.baselib.network.http.p573d.C9893d.f26954a = r5
            java.lang.String r5 = "read_response_buff_increase_size"
            int r5 = r2.optInt(r5, r9)
            com.bytedance.frameworks.baselib.network.http.p573d.C9893d.f26955b = r5
            java.lang.String r5 = "cronet_inputstream_buff_size"
            int r5 = r2.optInt(r5, r9)
            com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.f26874d = r5
            java.lang.String r5 = "frontier_urls"
            java.lang.String r9 = ""
            java.lang.String r5 = r2.optString(r5, r9)
            java.lang.String r9 = "share_cookie_host_list"
            r53 = r5
            java.lang.String r5 = ""
            java.lang.String r5 = r2.optString(r9, r5)
            java.lang.String r9 = "api_http_host_list"
            r54 = r5
            java.lang.String r5 = ""
            java.lang.String r5 = r2.optString(r9, r5)
            java.lang.String r9 = "disable_encrypt_switch"
            r55 = r5
            r5 = 0
            int r9 = r2.optInt(r9, r5)
            r1.f34561as = r9
            int r9 = r1.f34561as
            r5 = 2
            if (r9 != r5) goto L_0x032f
            monitor-enter(r68)
            android.content.Context r9 = r1.f34565d     // Catch:{ all -> 0x032c }
            java.lang.String r5 = "app_log_encrypt_switch_count"
            r56 = r8
            r8 = 0
            android.content.SharedPreferences r5 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r9, r5, r8)     // Catch:{ all -> 0x032c }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x032c }
            java.lang.String r9 = "app_log_encrypt_faild_count"
            r5.putInt(r9, r8)     // Catch:{ all -> 0x032c }
            com.bytedance.common.utility.p525e.C9402b.m18594a(r5)     // Catch:{ all -> 0x032c }
            monitor-exit(r68)     // Catch:{ all -> 0x032c }
            goto L_0x0331
        L_0x032c:
            r0 = move-exception
            monitor-exit(r68)     // Catch:{ all -> 0x032c }
            throw r0
        L_0x032f:
            r56 = r8
        L_0x0331:
            java.lang.String r5 = "disable_framed_transport"
            r8 = 0
            int r5 = r2.optInt(r5, r8)
            if (r5 <= 0) goto L_0x033d
            com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9860b.m19723a(r5)     // Catch:{ Throwable -> 0x033d }
        L_0x033d:
            java.lang.String r8 = "request_max_delay_time"
            r9 = 600000(0x927c0, float:8.40779E-40)
            int r8 = r2.optInt(r8, r9)
            java.lang.String r9 = "request_random_delay_apis"
            r57 = r5
            java.lang.String r5 = ""
            java.lang.String r5 = r2.optString(r9, r5)
            java.lang.String r9 = "request_delay_time_range"
            r58 = r3
            java.lang.String r3 = ""
            java.lang.String r3 = r2.optString(r9, r3)
            monitor-enter(r68)
            android.content.Context r9 = r1.f34565d     // Catch:{ all -> 0x06ea }
            r59 = r2
            java.lang.String r2 = "ss_app_config"
            r60 = r4
            r4 = 0
            android.content.SharedPreferences r2 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r9, r2, r4)     // Catch:{ all -> 0x06ea }
            java.util.List<java.lang.String> r4 = r1.f34557ah     // Catch:{ all -> 0x06ea }
            r4.clear()     // Catch:{ all -> 0x06ea }
            java.lang.String r4 = "share_cookie_host_list"
            java.lang.String r9 = ""
            java.lang.String r4 = r2.getString(r4, r9)     // Catch:{ all -> 0x06ea }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x06ea }
            if (r19 == 0) goto L_0x0385
            java.lang.String r9 = "config_mapping"
            r61 = r4
            r4 = r18
            r2.putString(r9, r4)     // Catch:{ all -> 0x06ea }
            goto L_0x0389
        L_0x0385:
            r61 = r4
            r4 = r18
        L_0x0389:
            java.lang.String r9 = "static_dns_mapping"
            r62 = r4
            r4 = r17
            r2.putString(r9, r4)     // Catch:{ all -> 0x06ea }
            java.lang.String r4 = "https_dns"
            r2.putString(r4, r6)     // Catch:{ all -> 0x06ea }
            java.lang.String r4 = "url_replace_mapping"
            r2.putString(r4, r0)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "ttnet_response_verify"
            java.lang.String r4 = r15.f34766b     // Catch:{ all -> 0x06ea }
            r2.putString(r0, r4)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "ttnet_response_verify_enabled"
            int r4 = r15.f34765a     // Catch:{ all -> 0x06ea }
            r2.putInt(r0, r4)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "read_response_buff_init_size"
            int r4 = com.bytedance.frameworks.baselib.network.http.p573d.C9893d.f26954a     // Catch:{ all -> 0x06ea }
            r2.putInt(r0, r4)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "read_response_buff_increase_size"
            int r4 = com.bytedance.frameworks.baselib.network.http.p573d.C9893d.f26955b     // Catch:{ all -> 0x06ea }
            r2.putInt(r0, r4)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "cronet_inputstream_buff_size"
            int r4 = com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.f26874d     // Catch:{ all -> 0x06ea }
            r2.putInt(r0, r4)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "https_dns_err_max"
            r2.putInt(r0, r7)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "https_dns_err_policy"
            r2.putInt(r0, r10)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "hs_open"
            r2.putInt(r0, r11)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "ok_http_open"
            r2.putInt(r0, r12)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "ok_http3_open"
            r2.putInt(r0, r13)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "chromium_open"
            r2.putInt(r0, r14)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "cronet_version"
            r4 = r50
            r2.putInt(r0, r4)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "http_dns_enabled"
            r4 = r49
            r2.putInt(r0, r4)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "detect_open"
            r6 = r48
            r2.putInt(r0, r6)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "detect_native_page"
            r6 = r47
            r2.putInt(r0, r6)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "collect_recent_page_info_enable"
            r6 = r46
            r2.putInt(r0, r6)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "i_host_select_open"
            r6 = r34
            r2.putInt(r0, r6)     // Catch:{ all -> 0x06ea }
            com.bytedance.ttnet.a.e r0 = r1.f34568h     // Catch:{ all -> 0x06ea }
            if (r0 == 0) goto L_0x0410
            com.bytedance.ttnet.a.e r0 = r1.f34568h     // Catch:{ all -> 0x06ea }
            r0.mo24879a(r2)     // Catch:{ all -> 0x06ea }
        L_0x0410:
            java.lang.String r0 = "i_host_select_open_v2"
            r6 = r35
            r2.putInt(r0, r6)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "replace_url_open"
            r6 = r36
            r2.putInt(r0, r6)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "add_ss_queries_open"
            r6 = r37
            r2.putInt(r0, r6)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "add_ss_queries_header_open"
            r7 = r38
            r2.putInt(r0, r7)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "add_ss_queries_plaintext_open"
            r9 = r39
            r2.putInt(r0, r9)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "add_device_fingerprint_open"
            r10 = r40
            r2.putInt(r0, r10)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "dynamic_adjust_threadpool_size_open"
            r10 = r44
            r2.putInt(r0, r10)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "ttnet_token_enabled"
            r10 = r41
            r2.putInt(r0, r10)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "ttnet_token_api"
            r11 = r33
            r2.putString(r0, r11)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "request_max_delay_time"
            r2.putInt(r0, r8)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "request_random_delay_apis"
            r2.putString(r0, r5)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "request_delay_time_range"
            r2.putString(r0, r3)     // Catch:{ all -> 0x06ea }
            r1.f34553ad = r8     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = ","
            java.lang.String[] r0 = r5.split(r0)     // Catch:{ all -> 0x06ea }
            com.bytedance.ttnet.a.a$8 r12 = new com.bytedance.ttnet.a.a$8     // Catch:{ all -> 0x06ea }
            r12.<init>(r0)     // Catch:{ all -> 0x06ea }
            r1.f34556ag = r12     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = ","
            java.lang.String[] r0 = r3.split(r0)     // Catch:{ all -> 0x06ea }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x06ea }
            int r12 = r0.size()     // Catch:{ all -> 0x06ea }
            r13 = 2
            if (r12 != r13) goto L_0x0490
            r12 = 0
            java.lang.Object r13 = r0.get(r12)     // Catch:{ all -> 0x06ea }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x06ea }
            r1.f34554ae = r13     // Catch:{ all -> 0x06ea }
            r12 = 1
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x06ea }
            r1.f34555af = r0     // Catch:{ all -> 0x06ea }
        L_0x0490:
            java.lang.String r0 = "image_ttnet_enabled"
            r12 = r43
            r2.putInt(r0, r12)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "send_api_exception_sample"
            int r12 = f34522q     // Catch:{ all -> 0x06ea }
            r2.putInt(r0, r12)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "send_ss_etag_sample"
            int r12 = f34523r     // Catch:{ all -> 0x06ea }
            r2.putInt(r0, r12)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "shuffle_dns"
            int r12 = f34515au     // Catch:{ all -> 0x06ea }
            r2.putInt(r0, r12)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "use_http_dns"
            int r12 = f34513aq     // Catch:{ all -> 0x06ea }
            r2.putInt(r0, r12)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "use_http_dns_refetch_on_expire"
            int r12 = f34514ar     // Catch:{ all -> 0x06ea }
            r2.putInt(r0, r12)     // Catch:{ all -> 0x06ea }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "last_refresh_time"
            r2.putLong(r0, r12)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "https_to_http"
            r12 = r60
            r2.putInt(r0, r12)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "http_to_https"
            r12 = r58
            r2.putInt(r0, r12)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "https_retry_http"
            r12 = r56
            r2.putInt(r0, r12)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "http_show_hijack"
            r12 = r52
            r2.putInt(r0, r12)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "http_verify_sign"
            r12 = r51
            r2.putInt(r0, r12)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "frontier_urls"
            r12 = r53
            r2.putString(r0, r12)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "share_cookie_host_list"
            r13 = r54
            r2.putString(r0, r13)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = ","
            java.lang.String[] r0 = r13.split(r0)     // Catch:{ all -> 0x06ea }
            int r15 = r0.length     // Catch:{ all -> 0x06ea }
            r63 = r13
            r13 = 0
        L_0x04fe:
            if (r13 >= r15) goto L_0x0527
            r64 = r15
            r15 = r0[r13]     // Catch:{ all -> 0x06ea }
            boolean r16 = com.bytedance.common.utility.C9431p.m18664a(r15)     // Catch:{ all -> 0x06ea }
            if (r16 != 0) goto L_0x051e
            r65 = r0
            java.util.List<java.lang.String> r0 = r1.f34557ah     // Catch:{ all -> 0x06ea }
            boolean r0 = com.bytedance.ttnet.p887e.C13337i.m26875a(r15, r0)     // Catch:{ all -> 0x06ea }
            if (r0 != 0) goto L_0x0520
            java.lang.String r0 = r15.trim()     // Catch:{ all -> 0x06ea }
            java.util.List<java.lang.String> r15 = r1.f34557ah     // Catch:{ all -> 0x06ea }
            r15.add(r0)     // Catch:{ all -> 0x06ea }
            goto L_0x0520
        L_0x051e:
            r65 = r0
        L_0x0520:
            int r13 = r13 + 1
            r15 = r64
            r0 = r65
            goto L_0x04fe
        L_0x0527:
            com.bytedance.ttnet.c r0 = com.bytedance.ttnet.C13303d.m26799b()     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = r0.mo24908f()     // Catch:{ all -> 0x06ea }
            boolean r13 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ all -> 0x06ea }
            if (r13 != 0) goto L_0x0542
            java.util.List<java.lang.String> r13 = r1.f34557ah     // Catch:{ all -> 0x06ea }
            boolean r13 = com.bytedance.ttnet.p887e.C13337i.m26875a(r0, r13)     // Catch:{ all -> 0x06ea }
            if (r13 != 0) goto L_0x0542
            java.util.List<java.lang.String> r13 = r1.f34557ah     // Catch:{ all -> 0x06ea }
            r13.add(r0)     // Catch:{ all -> 0x06ea }
        L_0x0542:
            java.lang.String r0 = "api_http_host_list"
            r13 = r55
            r2.putString(r0, r13)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = ","
            java.lang.String[] r0 = r13.split(r0)     // Catch:{ all -> 0x06ea }
            int r13 = r0.length     // Catch:{ all -> 0x06ea }
            r15 = 0
        L_0x0551:
            if (r15 >= r13) goto L_0x057a
            r66 = r13
            r13 = r0[r15]     // Catch:{ all -> 0x06ea }
            boolean r16 = com.bytedance.common.utility.C9431p.m18664a(r13)     // Catch:{ all -> 0x06ea }
            if (r16 != 0) goto L_0x0571
            r67 = r0
            java.util.List<java.lang.String> r0 = r1.f34559aj     // Catch:{ all -> 0x06ea }
            boolean r0 = com.bytedance.ttnet.p887e.C13337i.m26875a(r13, r0)     // Catch:{ all -> 0x06ea }
            if (r0 != 0) goto L_0x0573
            java.lang.String r0 = r13.trim()     // Catch:{ all -> 0x06ea }
            java.util.List<java.lang.String> r13 = r1.f34559aj     // Catch:{ all -> 0x06ea }
            r13.add(r0)     // Catch:{ all -> 0x06ea }
            goto L_0x0573
        L_0x0571:
            r67 = r0
        L_0x0573:
            int r15 = r15 + 1
            r13 = r66
            r0 = r67
            goto L_0x0551
        L_0x057a:
            java.lang.String r0 = "android_log_encrypt_switch"
            int r13 = r1.f34561as     // Catch:{ all -> 0x06ea }
            r2.putInt(r0, r13)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "image_ttnet_enabled"
            int r13 = r1.f34545V     // Catch:{ all -> 0x06ea }
            r2.putInt(r0, r13)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "sample_band_width_enabled"
            int r13 = r1.f34546W     // Catch:{ all -> 0x06ea }
            r2.putInt(r0, r13)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "cdn_sample_band_width_enabled"
            int r13 = r1.f34547X     // Catch:{ all -> 0x06ea }
            r2.putInt(r0, r13)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "dynamic_timeout_enabled"
            int r13 = r1.f34548Y     // Catch:{ all -> 0x06ea }
            r2.putInt(r0, r13)     // Catch:{ all -> 0x06ea }
            java.lang.String r0 = "disable_framed_transport"
            r13 = r57
            r2.putInt(r0, r13)     // Catch:{ all -> 0x06ea }
            com.bytedance.common.utility.p525e.C9402b.m18594a(r2)     // Catch:{ all -> 0x06ea }
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ Throwable -> 0x0642 }
            r0.<init>()     // Catch:{ Throwable -> 0x0642 }
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r12)     // Catch:{ Throwable -> 0x0642 }
            if (r2 != 0) goto L_0x05c1
            java.lang.String r2 = r1.f34529F     // Catch:{ Throwable -> 0x0642 }
            boolean r2 = r12.equals(r2)     // Catch:{ Throwable -> 0x0642 }
            if (r2 != 0) goto L_0x05c1
            r1.f34529F = r12     // Catch:{ Throwable -> 0x0642 }
            java.lang.String r2 = "frontier_urls"
            r0.put(r2, r12)     // Catch:{ Throwable -> 0x0642 }
        L_0x05c1:
            java.lang.String r2 = "chromium_open"
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)     // Catch:{ Throwable -> 0x0642 }
            r0.put(r2, r12)     // Catch:{ Throwable -> 0x0642 }
            java.lang.String r2 = "http_dns_enabled"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x0642 }
            r0.put(r2, r4)     // Catch:{ Throwable -> 0x0642 }
            java.lang.String r2 = "add_ss_queries_open"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)     // Catch:{ Throwable -> 0x0642 }
            r0.put(r2, r4)     // Catch:{ Throwable -> 0x0642 }
            java.lang.String r2 = "add_ss_queries_header_open"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ Throwable -> 0x0642 }
            r0.put(r2, r4)     // Catch:{ Throwable -> 0x0642 }
            java.lang.String r2 = "add_ss_queries_plaintext_open"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ Throwable -> 0x0642 }
            r0.put(r2, r4)     // Catch:{ Throwable -> 0x0642 }
            java.lang.String r2 = "ttnet_token_enabled"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x0642 }
            r0.put(r2, r4)     // Catch:{ Throwable -> 0x0642 }
            java.lang.String r2 = "ttnet_token_api"
            r0.put(r2, r11)     // Catch:{ Throwable -> 0x0642 }
            java.lang.String r2 = "ttnet_token_config_time"
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0642 }
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x0642 }
            r0.put(r2, r4)     // Catch:{ Throwable -> 0x0642 }
            java.lang.String r2 = "request_max_delay_time"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ Throwable -> 0x0642 }
            r0.put(r2, r4)     // Catch:{ Throwable -> 0x0642 }
            java.lang.String r2 = "request_random_delay_apis"
            r0.put(r2, r5)     // Catch:{ Throwable -> 0x0642 }
            java.lang.String r2 = "request_delay_time_range"
            r0.put(r2, r3)     // Catch:{ Throwable -> 0x0642 }
            java.lang.String r2 = "share_cookie_host_list"
            r3 = r63
            r0.put(r2, r3)     // Catch:{ Throwable -> 0x0644 }
            java.lang.String r2 = "disable_framed_transport"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)     // Catch:{ Throwable -> 0x0644 }
            r0.put(r2, r4)     // Catch:{ Throwable -> 0x0644 }
            com.bytedance.ttnet.c r2 = com.bytedance.ttnet.C13303d.m26799b()     // Catch:{ Throwable -> 0x0644 }
            android.content.Context r4 = r1.f34565d     // Catch:{ Throwable -> 0x0644 }
            r2.mo24901a(r4, r0)     // Catch:{ Throwable -> 0x0644 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Throwable -> 0x0644 }
            java.lang.String r2 = "com.bytedance.ttnet.config.appconfig.SYNC_MAIN_PROCESS_CONFIG"
            r0.<init>(r2)     // Catch:{ Throwable -> 0x0644 }
            android.content.Context r2 = r1.f34565d     // Catch:{ Throwable -> 0x0644 }
            r2.sendBroadcast(r0)     // Catch:{ Throwable -> 0x0644 }
            goto L_0x0644
        L_0x0642:
            r3 = r63
        L_0x0644:
            monitor-exit(r68)     // Catch:{ all -> 0x06ea }
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r3)
            if (r0 != 0) goto L_0x0661
            com.bytedance.ttnet.a.h r0 = com.bytedance.ttnet.p883a.C13278h.m26738a()
            r2 = r61
            boolean r4 = r3.equals(r2)
            if (r4 != 0) goto L_0x0661
            com.bytedance.ttnet.a.h$1 r4 = new com.bytedance.ttnet.a.h$1
            java.lang.String r5 = "Sync-Cookie"
            r4.<init>(r5, r2, r3)
            r4.start()
        L_0x0661:
            com.bytedance.ttnet.a.d r0 = com.bytedance.ttnet.p883a.C13272d.m26709a()
            if (r0 == 0) goto L_0x06cd
            com.bytedance.ttnet.a.d r0 = com.bytedance.ttnet.p883a.C13272d.m26709a()
            if (r59 == 0) goto L_0x06cd
            int r2 = r59.length()     // Catch:{ Throwable -> 0x06cd }
            if (r2 > 0) goto L_0x0674
            goto L_0x06cd
        L_0x0674:
            java.lang.String r2 = "image_opt_switch"
            r3 = r59
            r4 = 0
            int r2 = r3.optInt(r2, r4)     // Catch:{ Throwable -> 0x06cb }
            java.lang.String r5 = "image_opt_black_interval"
            r6 = 0
            long r5 = r3.optLong(r5, r6)     // Catch:{ Throwable -> 0x06cb }
            java.lang.String r7 = "image_opt_failed_times"
            int r7 = r3.optInt(r7, r4)     // Catch:{ Throwable -> 0x06cb }
            java.lang.String r8 = "image_opt_limit_count"
            int r4 = r3.optInt(r8, r4)     // Catch:{ Throwable -> 0x06cb }
            android.content.SharedPreferences r8 = r0.mo24870b()     // Catch:{ Throwable -> 0x06cb }
            android.content.SharedPreferences$Editor r8 = r8.edit()     // Catch:{ Throwable -> 0x06cb }
            int r9 = r0.f34604a     // Catch:{ Throwable -> 0x06cb }
            if (r2 == r9) goto L_0x06a2
            java.lang.String r9 = "image_opt_switch"
            r8.putInt(r9, r2)     // Catch:{ Throwable -> 0x06cb }
        L_0x06a2:
            long r9 = r0.f34605b     // Catch:{ Throwable -> 0x06cb }
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x06ad
            java.lang.String r9 = "image_opt_black_interval"
            r8.putLong(r9, r5)     // Catch:{ Throwable -> 0x06cb }
        L_0x06ad:
            int r9 = r0.f34606c     // Catch:{ Throwable -> 0x06cb }
            if (r7 == r9) goto L_0x06b6
            java.lang.String r9 = "image_opt_failed_times"
            r8.putInt(r9, r7)     // Catch:{ Throwable -> 0x06cb }
        L_0x06b6:
            int r9 = r0.f34607d     // Catch:{ Throwable -> 0x06cb }
            if (r4 == r9) goto L_0x06bf
            java.lang.String r9 = "image_opt_limit_count"
            r8.putInt(r9, r4)     // Catch:{ Throwable -> 0x06cb }
        L_0x06bf:
            r8.apply()     // Catch:{ Throwable -> 0x06cb }
            r0.f34604a = r2     // Catch:{ Throwable -> 0x06cb }
            r0.f34605b = r5     // Catch:{ Throwable -> 0x06cb }
            r0.f34606c = r7     // Catch:{ Throwable -> 0x06cb }
            r0.f34607d = r4     // Catch:{ Throwable -> 0x06cb }
            goto L_0x06cf
        L_0x06cb:
            goto L_0x06cf
        L_0x06cd:
            r3 = r59
        L_0x06cf:
            com.bytedance.ttnet.d.c r0 = com.bytedance.ttnet.p886d.C13314c.m26812a()
            com.bytedance.ttnet.d.b r0 = r0.f34739c
            if (r0 == 0) goto L_0x06e0
            com.bytedance.ttnet.d.c r0 = com.bytedance.ttnet.p886d.C13314c.m26812a()
            com.bytedance.ttnet.d.b r0 = r0.f34739c
            r0.mo24922a(r3)
        L_0x06e0:
            android.content.Context r0 = r1.f34565d
            r2 = r62
            r3 = 2
            com.bytedance.ttnet.p887e.C13330e.m26851a(r0, r3, r2)
            r2 = 1
            return r2
        L_0x06ea:
            r0 = move-exception
            monitor-exit(r68)     // Catch:{ all -> 0x06ea }
            throw r0
        L_0x06ed:
            r0 = move-exception
            monitor-exit(r68)     // Catch:{ all -> 0x06ed }
            throw r0
        L_0x06f0:
            r0 = move-exception
            monitor-exit(r68)     // Catch:{ all -> 0x06f0 }
            throw r0
        L_0x06f3:
            r0 = move-exception
            monitor-exit(r68)     // Catch:{ all -> 0x06f3 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p883a.C13258a.mo24852a(java.lang.Object):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:3|4|5|6|7|(2:13|(1:15))|16|(3:18|(1:20)|21)|22|23|(1:25)(1:26)|27|28|29|(1:31)(2:32|(3:45|35|36))|34|47) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x009e */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c1 A[Catch:{ Throwable -> 0x00db }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c2 A[Catch:{ Throwable -> 0x00db }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fc A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24853a(org.json.JSONArray r13) throws org.json.JSONException {
        /*
            r12 = this;
            java.lang.String[] r0 = m26677p()
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r5 = r3
            r4 = 0
        L_0x0009:
            if (r4 >= r1) goto L_0x0101
            r6 = r0[r4]
            com.bytedance.ttnet.c.a r7 = new com.bytedance.ttnet.c.a     // Catch:{ Throwable -> 0x00dd }
            r7.<init>()     // Catch:{ Throwable -> 0x00dd }
            r5 = 1
            r7.f34687h = r5     // Catch:{ Throwable -> 0x00db }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00db }
            r5.<init>()     // Catch:{ Throwable -> 0x00db }
            java.lang.String r8 = "https://"
            r5.append(r8)     // Catch:{ Throwable -> 0x00db }
            r5.append(r6)     // Catch:{ Throwable -> 0x00db }
            java.lang.String r6 = "/get_domains/v4/"
            r5.append(r6)     // Catch:{ Throwable -> 0x00db }
            com.bytedance.ttnet.c r6 = com.bytedance.ttnet.C13303d.m26799b()     // Catch:{ Throwable -> 0x00db }
            android.content.Context r8 = r12.f34565d     // Catch:{ Throwable -> 0x00db }
            android.location.Address r6 = r6.mo24897a(r8)     // Catch:{ Throwable -> 0x00db }
            com.bytedance.frameworks.baselib.network.http.e.k r8 = new com.bytedance.frameworks.baselib.network.http.e.k     // Catch:{ Throwable -> 0x00db }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x00db }
            r8.<init>(r5)     // Catch:{ Throwable -> 0x00db }
            if (r6 == 0) goto L_0x006d
            boolean r5 = r6.hasLatitude()     // Catch:{ Throwable -> 0x00db }
            if (r5 == 0) goto L_0x006d
            boolean r5 = r6.hasLongitude()     // Catch:{ Throwable -> 0x00db }
            if (r5 == 0) goto L_0x006d
            java.lang.String r5 = "latitude"
            double r9 = r6.getLatitude()     // Catch:{ Throwable -> 0x00db }
            r8.mo17850a(r5, r9)     // Catch:{ Throwable -> 0x00db }
            java.lang.String r5 = "longitude"
            double r9 = r6.getLongitude()     // Catch:{ Throwable -> 0x00db }
            r8.mo17850a(r5, r9)     // Catch:{ Throwable -> 0x00db }
            java.lang.String r5 = r6.getLocality()     // Catch:{ Throwable -> 0x00db }
            boolean r6 = com.bytedance.common.utility.C9431p.m18664a(r5)     // Catch:{ Throwable -> 0x00db }
            if (r6 != 0) goto L_0x006d
            java.lang.String r6 = "city"
            java.lang.String r5 = android.net.Uri.encode(r5)     // Catch:{ Throwable -> 0x00db }
            r8.mo17852a(r6, r5)     // Catch:{ Throwable -> 0x00db }
        L_0x006d:
            boolean r5 = r12.f34575t     // Catch:{ Throwable -> 0x00db }
            if (r5 == 0) goto L_0x008c
            java.lang.String r5 = "force"
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r6 = r8.f26986a     // Catch:{ Throwable -> 0x00db }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ Throwable -> 0x00db }
            java.util.List r6 = (java.util.List) r6     // Catch:{ Throwable -> 0x00db }
            if (r6 != 0) goto L_0x0082
            java.util.LinkedList r6 = new java.util.LinkedList     // Catch:{ Throwable -> 0x00db }
            r6.<init>()     // Catch:{ Throwable -> 0x00db }
        L_0x0082:
            java.lang.String r9 = "1"
            r6.add(r9)     // Catch:{ Throwable -> 0x00db }
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r9 = r8.f26986a     // Catch:{ Throwable -> 0x00db }
            r9.put(r5, r6)     // Catch:{ Throwable -> 0x00db }
        L_0x008c:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x009e }
            r6 = 21
            if (r5 >= r6) goto L_0x0095
            java.lang.String r5 = android.os.Build.CPU_ABI     // Catch:{ Throwable -> 0x009e }
            goto L_0x0099
        L_0x0095:
            java.lang.String[] r5 = android.os.Build.SUPPORTED_ABIS     // Catch:{ Throwable -> 0x009e }
            r5 = r5[r2]     // Catch:{ Throwable -> 0x009e }
        L_0x0099:
            java.lang.String r6 = "abi"
            r8.mo17852a(r6, r5)     // Catch:{ Throwable -> 0x009e }
        L_0x009e:
            java.lang.String r5 = r8.toString()     // Catch:{ Throwable -> 0x00db }
            r7.f34681b = r5     // Catch:{ Throwable -> 0x00db }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00db }
            java.lang.String r5 = com.bytedance.ttnet.p885c.C13299c.m26783a(r5, r3, r3, r7)     // Catch:{ Throwable -> 0x00db }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00db }
            r6 = 0
            long r10 = r10 - r8
            r7.f34682c = r10     // Catch:{ Throwable -> 0x00db }
            org.json.JSONObject r6 = r7.mo24909a()     // Catch:{ Throwable -> 0x00db }
            r13.put(r6)     // Catch:{ Throwable -> 0x00db }
            boolean r6 = com.bytedance.common.utility.C9431p.m18664a(r5)     // Catch:{ Throwable -> 0x00db }
            if (r6 == 0) goto L_0x00c2
            goto L_0x00d5
        L_0x00c2:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00db }
            r6.<init>(r5)     // Catch:{ Throwable -> 0x00db }
            java.lang.String r5 = "message"
            java.lang.String r5 = r6.getString(r5)     // Catch:{ Throwable -> 0x00db }
            java.lang.String r8 = "success"
            boolean r5 = r8.equals(r5)     // Catch:{ Throwable -> 0x00db }
            if (r5 != 0) goto L_0x00d6
        L_0x00d5:
            goto L_0x00fc
        L_0x00d6:
            boolean r5 = r12.mo24852a(r6)     // Catch:{ Throwable -> 0x00db }
            return r5
        L_0x00db:
            r5 = move-exception
            goto L_0x00e0
        L_0x00dd:
            r6 = move-exception
            r7 = r5
            r5 = r6
        L_0x00e0:
            if (r7 == 0) goto L_0x00fc
            java.io.StringWriter r6 = new java.io.StringWriter
            r6.<init>()
            java.io.PrintWriter r8 = new java.io.PrintWriter
            r8.<init>(r6)
            com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43751a(r5, r8)
            java.lang.String r5 = r6.toString()
            r7.f34683d = r5
            org.json.JSONObject r5 = r7.mo24909a()
            r13.put(r5)
        L_0x00fc:
            r5 = r7
            int r4 = r4 + 1
            goto L_0x0009
        L_0x0101:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p883a.C13258a.mo24853a(org.json.JSONArray):boolean");
    }

    /* renamed from: a */
    public final List<String> mo17829a(CookieManager cookieManager, C9842a aVar, URI uri) {
        String str;
        if (uri == null || (cookieManager == null && aVar == null)) {
            return null;
        }
        try {
            str = uri.getHost();
        } catch (Exception unused) {
            str = null;
        }
        if (C9431p.m18664a(str) || !C13337i.m26875a(str, this.f34557ah) || C9431p.m18664a(C13303d.m26799b().mo24908f())) {
            return null;
        }
        List<String> arrayList = new ArrayList<>();
        if (cookieManager != null) {
            String cookie = cookieManager.getCookie(C13303d.m26799b().mo24908f());
            if (!C9431p.m18664a(cookie)) {
                arrayList.add(cookie);
                return arrayList;
            }
        }
        if (C9414h.m18630a(arrayList) && aVar != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(uri.getScheme());
                sb.append("://");
                sb.append(C13303d.m26799b().mo24908f());
                Map map = aVar.get(URI.create(sb.toString()), new LinkedHashMap());
                if (map != null && !map.isEmpty()) {
                    arrayList = (List) map.get("Cookie");
                }
            } catch (Throwable unused2) {
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public final int mo23849g() {
        return C13357a.m26931a(this.f34553ad);
    }

    /* renamed from: i */
    public final void mo24857i() {
        m26671d(false);
    }

    /* renamed from: m */
    public final boolean mo24860m() {
        if (this.f34551ab > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean mo24862o() {
        if (this.f34539P > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo17793b() {
        if (!f34516av && this.f34535L > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo17861c() {
        if (!f34517aw && this.f34542S <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo17863e() {
        if (!f34517aw && this.f34544U <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo23848f() {
        return C13357a.m26932a(this.f34554ae, this.f34555af);
    }

    /* renamed from: p */
    public static String[] m26677p() {
        String[] b = C13303d.m26799b().mo24904b();
        if (b == null || b.length <= 0) {
            return new String[0];
        }
        return b;
    }

    /* renamed from: d */
    public final boolean mo17862d() {
        if (!f34517aw && this.f34543T > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo24856h() {
        if (f34519n) {
            C9865e.m19737a(0);
            return false;
        } else if (m26676l()) {
            return false;
        } else {
            if (this.f34533J > 3) {
                C9865e.m19737a(3);
                return false;
            } else if (C9415i.m18635b() || f34520o) {
                C13303d.m26799b();
                return true;
            } else {
                if (this.f34567g <= 0) {
                    C9865e.m19737a(4);
                }
                if (this.f34567g > 0) {
                    return true;
                }
                return false;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:4|5|6|(2:8|9)|10|11|(4:13|14|15|(1:17)(3:18|(3:20|(1:22)(1:23)|24)|(1:26)))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0032 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a A[Catch:{ Exception -> 0x0077 }] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo24858j() {
        /*
            r5 = this;
            monitor-enter(r5)
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0079 }
            long r2 = r5.f34577v     // Catch:{ all -> 0x0079 }
            r4 = 0
            long r0 = r0 - r2
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0077
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0079 }
            r5.f34577v = r0     // Catch:{ all -> 0x0079 }
            android.content.Context r0 = r5.f34565d     // Catch:{ Exception -> 0x0077 }
            r1 = 2
            java.lang.String r0 = com.bytedance.ttnet.p887e.C13330e.m26850a(r0, r1)     // Catch:{ Exception -> 0x0077 }
            r5.m26674h(r0)     // Catch:{ Exception -> 0x0077 }
            com.bytedance.ttnet.c r0 = com.bytedance.ttnet.C13303d.m26799b()     // Catch:{ Exception -> 0x0077 }
            android.content.Context r1 = r5.f34565d     // Catch:{ Exception -> 0x0077 }
            java.lang.String r2 = "disable_framed_transport"
            r3 = 0
            int r0 = r0.mo24894a(r1, r2, r3)     // Catch:{ Exception -> 0x0077 }
            if (r0 <= 0) goto L_0x0032
            com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9860b.m19723a(r0)     // Catch:{ Throwable -> 0x0032 }
        L_0x0032:
            com.bytedance.ttnet.d.c r0 = com.bytedance.ttnet.p886d.C13314c.m26812a()     // Catch:{ Exception -> 0x0077 }
            com.bytedance.ttnet.d.b r0 = r0.f34739c     // Catch:{ Exception -> 0x0077 }
            if (r0 == 0) goto L_0x0075
            com.bytedance.ttnet.d.c r0 = com.bytedance.ttnet.p886d.C13314c.m26812a()     // Catch:{ Exception -> 0x0077 }
            com.bytedance.ttnet.d.b r0 = r0.f34739c     // Catch:{ Exception -> 0x0077 }
            android.content.Context r1 = r0.f34733a     // Catch:{ Throwable -> 0x0075 }
            r2 = 4
            java.lang.String r1 = com.bytedance.ttnet.p887e.C13330e.m26850a(r1, r2)     // Catch:{ Throwable -> 0x0075 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x0075 }
            if (r2 == 0) goto L_0x004e
            goto L_0x0077
        L_0x004e:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0075 }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x0075 }
            com.bytedance.ttnet.d.a r1 = com.bytedance.ttnet.p886d.C13313b.m26809b(r2)     // Catch:{ Throwable -> 0x0075 }
            boolean r2 = com.bytedance.common.utility.C9415i.m18635b()     // Catch:{ Throwable -> 0x0075 }
            if (r2 == 0) goto L_0x0070
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0075 }
            java.lang.String r3 = "loadLocalConfigForOtherProcess, config: "
            r2.<init>(r3)     // Catch:{ Throwable -> 0x0075 }
            if (r1 != 0) goto L_0x0069
            java.lang.String r3 = "null"
            goto L_0x006d
        L_0x0069:
            java.lang.String r3 = r1.toString()     // Catch:{ Throwable -> 0x0075 }
        L_0x006d:
            r2.append(r3)     // Catch:{ Throwable -> 0x0075 }
        L_0x0070:
            if (r1 == 0) goto L_0x0077
            r0.f34734b = r1     // Catch:{ Throwable -> 0x0075 }
            goto L_0x0077
        L_0x0075:
            monitor-exit(r5)
            return
        L_0x0077:
            monitor-exit(r5)
            return
        L_0x0079:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p883a.C13258a.mo24858j():void");
    }

    /* renamed from: q */
    public final void mo24863q() {
        try {
            if (f34513aq > 0 && !C13281b.m26758a()) {
                if (this.f34524A != null) {
                    for (Entry entry : this.f34524A.entrySet()) {
                        if (entry != null) {
                            m26675i((String) entry.getKey());
                        }
                    }
                }
                if (this.f34568h != null) {
                    Map<String, C13275a> map = this.f34568h.f34615d;
                    if (map != null) {
                        for (Entry entry2 : map.entrySet()) {
                            if (entry2 != null) {
                                m26675i((String) entry2.getKey());
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: used method not loaded: com.bytedance.ttnet.a.e.a(android.content.Context):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.bytedance.ttnet.a.e.a(android.content.Context, android.content.SharedPreferences):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.bytedance.frameworks.baselib.network.b.f.a(boolean):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.bytedance.frameworks.baselib.network.http.e.a(boolean):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.bytedance.frameworks.baselib.network.http.e.a(int):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.bytedance.frameworks.baselib.network.http.d.d.a(android.content.SharedPreferences):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.bytedance.frameworks.baselib.network.http.cronet.a.c.a(android.content.SharedPreferences):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.bytedance.ttnet.e.a.a(android.content.SharedPreferences):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.bytedance.ttnet.retrofit.SsInterceptor.a(boolean):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        r13.f34577v = r5;
        m26674h(r2);
        r2 = r1.getString("static_dns_mapping", null);
        r5 = r1.getString("https_dns", null);
        r4 = r1.getString("url_replace_mapping", null);
        f34518f = r1.getInt("https_dns_err_max", 3);
        r13.f34560ak = r1.getInt("https_dns_err_policy", 0);
        r13.f34530G = r1.getInt("hs_open", 0);
        r13.f34531H = r1.getInt("ok_http_open", 0);
        r13.f34532I = r1.getInt("ok_http3_open", 0);
        r13.f34567g = r1.getInt("chromium_open", 0);
        r13.f34558ai = r1.getInt("cronet_version", 0);
        r13.f34535L = r1.getInt("http_dns_enabled", 0);
        r13.f34536M = r1.getInt("detect_open", 0);
        r13.f34537N = r1.getInt("detect_native_page", 1);
        r13.f34538O = r1.getInt("collect_recent_page_info_enable", 1);
        r13.f34539P = r1.getInt("i_host_select_open", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a8, code lost:
        if (mo24862o() == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00aa, code lost:
        r13.f34568h = com.bytedance.ttnet.p883a.C13273e.m26716a(r13.f34565d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b2, code lost:
        com.bytedance.ttnet.p883a.C13273e.m26716a(r13.f34565d).mo24876a(r13.f34565d, r1);
        r13.f34540Q = r1.getInt("i_host_select_open_v2", 1);
        r13.f34541R = r1.getInt("replace_url_open", 1);
        r13.f34542S = r1.getInt("add_ss_queries_open", 0);
        r13.f34543T = r1.getInt("add_ss_queries_header_open", 0);
        r13.f34544U = r1.getInt("add_ss_queries_plaintext_open", 1);
        r13.f34549Z = r1.getInt("add_device_fingerprint_open", 1);
        r13.f34550aa = r1.getInt("dynamic_adjust_threadpool_size_open", 1);
        r13.f34551ab = r1.getInt("ttnet_token_enabled", 0);
        r6 = r1.getString("ttnet_token_api", "[]");
        r13.f34553ad = r1.getInt("request_max_delay_time", 600000);
        r7 = r1.getString("request_random_delay_apis", "");
        r8 = r7.split(",");
        r13.f34556ag = new java.util.HashSet();
        r9 = r8.length;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0127, code lost:
        if (r10 >= r9) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0129, code lost:
        r13.f34556ag.add(r8[r10]);
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0133, code lost:
        r8 = r1.getString("request_delay_time_range", "");
        r9 = java.util.Arrays.asList(r8.split(","));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x014a, code lost:
        if (r9.size() != 2) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x014c, code lost:
        r13.f34554ae = (java.lang.String) r9.get(0);
        r13.f34555af = (java.lang.String) r9.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x015e, code lost:
        if (r13.f34550aa <= 0) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0160, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0162, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0163, code lost:
        com.bytedance.frameworks.baselib.network.p567b.C9827f.m19662a(r9);
        r13.f34545V = r1.getInt("image_ttnet_enabled", 1);
        r13.f34546W = r1.getInt("sample_band_width_enabled", 1);
        r13.f34547X = r1.getInt("cdn_sample_band_width_enabled", 1);
        r13.f34548Y = r1.getInt("dynamic_timeout_enabled", 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0188, code lost:
        if (r13.f34548Y <= 0) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x018a, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x018c, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x018d, code lost:
        com.bytedance.frameworks.baselib.network.http.C9894e.m19826a(r9);
        f34522q = r1.getInt("send_api_exception_sample", 1);
        f34523r = r1.getInt("send_ss_etag_sample", 1);
        f34515au = r1.getInt("shuffle_dns", -1);
        com.bytedance.frameworks.baselib.network.http.C9894e.m19817a(r1.getInt("use_dns_mapping", -1));
        f34513aq = r1.getInt("use_http_dns", -1);
        f34514ar = r1.getInt("use_http_dns_refetch_on_expire", -1);
        com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19803a(r1);
        com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.m19761a(r1);
        com.bytedance.ttnet.p887e.C13322a.m26829a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x01cd, code lost:
        if (r13.f34542S > 0) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01d1, code lost:
        if (r13.f34543T <= 0) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x01d3, code lost:
        com.bytedance.ttnet.retrofit.SsInterceptor.m26928a(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01d6, code lost:
        r9 = new java.util.HashMap<>();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01df, code lost:
        if (com.bytedance.common.utility.C9431p.m18664a(r2) != false) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        m26668b(r9, new org.json.JSONArray(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01e9, code lost:
        monitor-enter(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r13.f34525B = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01ec, code lost:
        monitor-exit(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
        r1 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r13.f34565d, "ss_app_config", 0);
        r2 = r1.getString("config_mapping", null);
        r5 = r1.getLong("last_refresh_time", 0);
        r7 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r5 <= r7) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0305 A[SYNTHETIC, Splitter:B:104:0x0305] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0223 A[SYNTHETIC, Splitter:B:63:0x0223] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02fc A[SYNTHETIC, Splitter:B:99:0x02fc] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24859k() {
        /*
            r13 = this;
            monitor-enter(r13)
            boolean r0 = r13.f34579x     // Catch:{ all -> 0x039c }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r13)     // Catch:{ all -> 0x039c }
            return
        L_0x0007:
            r0 = 1
            r13.f34579x = r0     // Catch:{ all -> 0x039c }
            monitor-exit(r13)     // Catch:{ all -> 0x039c }
            android.content.Context r1 = r13.f34565d
            java.lang.String r2 = "ss_app_config"
            r3 = 0
            android.content.SharedPreferences r1 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r1, r2, r3)
            java.lang.String r2 = "config_mapping"
            r4 = 0
            java.lang.String r2 = r1.getString(r2, r4)
            java.lang.String r5 = "last_refresh_time"
            r6 = 0
            long r5 = r1.getLong(r5, r6)
            long r7 = java.lang.System.currentTimeMillis()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x002c
            r5 = r7
        L_0x002c:
            r13.f34577v = r5
            r13.m26674h(r2)
            java.lang.String r2 = "static_dns_mapping"
            java.lang.String r2 = r1.getString(r2, r4)
            java.lang.String r5 = "https_dns"
            java.lang.String r5 = r1.getString(r5, r4)
            java.lang.String r6 = "url_replace_mapping"
            java.lang.String r4 = r1.getString(r6, r4)
            java.lang.String r6 = "https_dns_err_max"
            r7 = 3
            int r6 = r1.getInt(r6, r7)
            f34518f = r6
            java.lang.String r6 = "https_dns_err_policy"
            int r6 = r1.getInt(r6, r3)
            r13.f34560ak = r6
            java.lang.String r6 = "hs_open"
            int r6 = r1.getInt(r6, r3)
            r13.f34530G = r6
            java.lang.String r6 = "ok_http_open"
            int r6 = r1.getInt(r6, r3)
            r13.f34531H = r6
            java.lang.String r6 = "ok_http3_open"
            int r6 = r1.getInt(r6, r3)
            r13.f34532I = r6
            java.lang.String r6 = "chromium_open"
            int r6 = r1.getInt(r6, r3)
            r13.f34567g = r6
            java.lang.String r6 = "cronet_version"
            int r6 = r1.getInt(r6, r3)
            r13.f34558ai = r6
            java.lang.String r6 = "http_dns_enabled"
            int r6 = r1.getInt(r6, r3)
            r13.f34535L = r6
            java.lang.String r6 = "detect_open"
            int r6 = r1.getInt(r6, r3)
            r13.f34536M = r6
            java.lang.String r6 = "detect_native_page"
            int r6 = r1.getInt(r6, r0)
            r13.f34537N = r6
            java.lang.String r6 = "collect_recent_page_info_enable"
            int r6 = r1.getInt(r6, r0)
            r13.f34538O = r6
            java.lang.String r6 = "i_host_select_open"
            int r6 = r1.getInt(r6, r3)
            r13.f34539P = r6
            boolean r6 = r13.mo24862o()
            if (r6 == 0) goto L_0x00b2
            android.content.Context r6 = r13.f34565d
            com.bytedance.ttnet.a.e r6 = com.bytedance.ttnet.p883a.C13273e.m26716a(r6)
            r13.f34568h = r6
        L_0x00b2:
            android.content.Context r6 = r13.f34565d
            com.bytedance.ttnet.a.e r6 = com.bytedance.ttnet.p883a.C13273e.m26716a(r6)
            android.content.Context r7 = r13.f34565d
            r6.mo24876a(r7, r1)
            java.lang.String r6 = "i_host_select_open_v2"
            int r6 = r1.getInt(r6, r0)
            r13.f34540Q = r6
            java.lang.String r6 = "replace_url_open"
            int r6 = r1.getInt(r6, r0)
            r13.f34541R = r6
            java.lang.String r6 = "add_ss_queries_open"
            int r6 = r1.getInt(r6, r3)
            r13.f34542S = r6
            java.lang.String r6 = "add_ss_queries_header_open"
            int r6 = r1.getInt(r6, r3)
            r13.f34543T = r6
            java.lang.String r6 = "add_ss_queries_plaintext_open"
            int r6 = r1.getInt(r6, r0)
            r13.f34544U = r6
            java.lang.String r6 = "add_device_fingerprint_open"
            int r6 = r1.getInt(r6, r0)
            r13.f34549Z = r6
            java.lang.String r6 = "dynamic_adjust_threadpool_size_open"
            int r6 = r1.getInt(r6, r0)
            r13.f34550aa = r6
            java.lang.String r6 = "ttnet_token_enabled"
            int r6 = r1.getInt(r6, r3)
            r13.f34551ab = r6
            java.lang.String r6 = "ttnet_token_api"
            java.lang.String r7 = "[]"
            java.lang.String r6 = r1.getString(r6, r7)
            java.lang.String r7 = "request_max_delay_time"
            r8 = 600000(0x927c0, float:8.40779E-40)
            int r7 = r1.getInt(r7, r8)
            r13.f34553ad = r7
            java.lang.String r7 = "request_random_delay_apis"
            java.lang.String r8 = ""
            java.lang.String r7 = r1.getString(r7, r8)
            java.lang.String r8 = ","
            java.lang.String[] r8 = r7.split(r8)
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            r13.f34556ag = r9
            int r9 = r8.length
            r10 = 0
        L_0x0127:
            if (r10 >= r9) goto L_0x0133
            r11 = r8[r10]
            java.util.Set<java.lang.String> r12 = r13.f34556ag
            r12.add(r11)
            int r10 = r10 + 1
            goto L_0x0127
        L_0x0133:
            java.lang.String r8 = "request_delay_time_range"
            java.lang.String r9 = ""
            java.lang.String r8 = r1.getString(r8, r9)
            java.lang.String r9 = ","
            java.lang.String[] r9 = r8.split(r9)
            java.util.List r9 = java.util.Arrays.asList(r9)
            int r10 = r9.size()
            r11 = 2
            if (r10 != r11) goto L_0x015c
            java.lang.Object r10 = r9.get(r3)
            java.lang.String r10 = (java.lang.String) r10
            r13.f34554ae = r10
            java.lang.Object r9 = r9.get(r0)
            java.lang.String r9 = (java.lang.String) r9
            r13.f34555af = r9
        L_0x015c:
            int r9 = r13.f34550aa
            if (r9 <= 0) goto L_0x0162
            r9 = 1
            goto L_0x0163
        L_0x0162:
            r9 = 0
        L_0x0163:
            com.bytedance.frameworks.baselib.network.p567b.C9827f.m19662a(r9)
            java.lang.String r9 = "image_ttnet_enabled"
            int r9 = r1.getInt(r9, r0)
            r13.f34545V = r9
            java.lang.String r9 = "sample_band_width_enabled"
            int r9 = r1.getInt(r9, r0)
            r13.f34546W = r9
            java.lang.String r9 = "cdn_sample_band_width_enabled"
            int r9 = r1.getInt(r9, r0)
            r13.f34547X = r9
            java.lang.String r9 = "dynamic_timeout_enabled"
            int r9 = r1.getInt(r9, r0)
            r13.f34548Y = r9
            int r9 = r13.f34548Y
            if (r9 <= 0) goto L_0x018c
            r9 = 1
            goto L_0x018d
        L_0x018c:
            r9 = 0
        L_0x018d:
            com.bytedance.frameworks.baselib.network.http.C9894e.m19826a(r9)
            java.lang.String r9 = "send_api_exception_sample"
            int r9 = r1.getInt(r9, r0)
            f34522q = r9
            java.lang.String r9 = "send_ss_etag_sample"
            int r9 = r1.getInt(r9, r0)
            f34523r = r9
            java.lang.String r9 = "shuffle_dns"
            r10 = -1
            int r9 = r1.getInt(r9, r10)
            f34515au = r9
            java.lang.String r9 = "use_dns_mapping"
            int r9 = r1.getInt(r9, r10)
            com.bytedance.frameworks.baselib.network.http.C9894e.m19817a(r9)
            java.lang.String r9 = "use_http_dns"
            int r9 = r1.getInt(r9, r10)
            f34513aq = r9
            java.lang.String r9 = "use_http_dns_refetch_on_expire"
            int r9 = r1.getInt(r9, r10)
            f34514ar = r9
            com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19803a(r1)
            com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.m19761a(r1)
            com.bytedance.ttnet.p887e.C13322a.m26829a(r1)
            int r9 = r13.f34542S
            if (r9 > 0) goto L_0x01d3
            int r9 = r13.f34543T
            if (r9 <= 0) goto L_0x01d6
        L_0x01d3:
            com.bytedance.ttnet.retrofit.SsInterceptor.m26928a(r0)
        L_0x01d6:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            boolean r10 = com.bytedance.common.utility.C9431p.m18664a(r2)
            if (r10 != 0) goto L_0x01f2
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ Exception -> 0x01f1 }
            r10.<init>(r2)     // Catch:{ Exception -> 0x01f1 }
            m26668b(r9, r10)     // Catch:{ Exception -> 0x01f1 }
            monitor-enter(r13)     // Catch:{ Exception -> 0x01f1 }
            r13.f34525B = r9     // Catch:{ all -> 0x01ee }
            monitor-exit(r13)     // Catch:{ all -> 0x01ee }
            goto L_0x01f2
        L_0x01ee:
            r2 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x01ee }
            throw r2     // Catch:{ Exception -> 0x01f1 }
        L_0x01f1:
        L_0x01f2:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            boolean r9 = com.bytedance.common.utility.C9431p.m18664a(r4)
            if (r9 != 0) goto L_0x0218
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ Exception -> 0x0217 }
            r9.<init>(r4)     // Catch:{ Exception -> 0x0217 }
            m26664a(r2, r9)     // Catch:{ Exception -> 0x0217 }
            monitor-enter(r13)     // Catch:{ Exception -> 0x0217 }
            r13.f34527D = r2     // Catch:{ all -> 0x0214 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0214 }
            r4.<init>()     // Catch:{ all -> 0x0214 }
            r4.putAll(r2)     // Catch:{ all -> 0x0214 }
            r13.f34528E = r4     // Catch:{ all -> 0x0214 }
            monitor-exit(r13)     // Catch:{ all -> 0x0214 }
            goto L_0x0218
        L_0x0214:
            r2 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0214 }
            throw r2     // Catch:{ Exception -> 0x0217 }
        L_0x0217:
        L_0x0218:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r5)
            if (r4 != 0) goto L_0x023e
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ Exception -> 0x023d }
            r4.<init>(r5)     // Catch:{ Exception -> 0x023d }
            r13.m26665a(r2, r4, r0)     // Catch:{ Exception -> 0x023d }
            monitor-enter(r13)     // Catch:{ Exception -> 0x023d }
            r13.f34566e = r2     // Catch:{ all -> 0x023a }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x023a }
            r4.<init>()     // Catch:{ all -> 0x023a }
            r4.putAll(r2)     // Catch:{ all -> 0x023a }
            r13.f34526C = r4     // Catch:{ all -> 0x023a }
            monitor-exit(r13)     // Catch:{ all -> 0x023a }
            goto L_0x023e
        L_0x023a:
            r2 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x023a }
            throw r2     // Catch:{ Exception -> 0x023d }
        L_0x023d:
        L_0x023e:
            java.util.Set r2 = m26673f(r6)
            r13.f34552ac = r2
            java.lang.String r2 = "https_to_http"
            int r2 = r1.getInt(r2, r0)
            f34508al = r2
            java.lang.String r2 = "http_to_https"
            int r2 = r1.getInt(r2, r0)
            f34509am = r2
            java.lang.String r2 = "https_retry_http"
            int r2 = r1.getInt(r2, r0)
            f34510an = r2
            java.lang.String r2 = "http_show_hijack"
            int r2 = r1.getInt(r2, r0)
            f34511ao = r2
            java.lang.String r2 = "http_verify_sign"
            int r0 = r1.getInt(r2, r0)
            f34512ap = r0
            java.lang.String r0 = "frontier_urls"
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getString(r0, r2)
            r13.f34529F = r0
            java.lang.String r0 = "api_http_host_list"
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getString(r0, r2)
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r0)
            if (r2 != 0) goto L_0x02a2
            java.lang.String r2 = ","
            java.lang.String[] r0 = r0.split(r2)
            int r2 = r0.length
            r4 = 0
        L_0x028c:
            if (r4 >= r2) goto L_0x02a2
            r5 = r0[r4]
            boolean r9 = com.bytedance.common.utility.C9431p.m18664a(r5)
            if (r9 != 0) goto L_0x029f
            java.lang.String r5 = r5.trim()
            java.util.List<java.lang.String> r9 = r13.f34559aj
            r9.add(r5)
        L_0x029f:
            int r4 = r4 + 1
            goto L_0x028c
        L_0x02a2:
            java.lang.String r0 = "share_cookie_host_list"
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getString(r0, r2)
            java.lang.String r2 = ","
            java.lang.String[] r2 = r0.split(r2)
            int r4 = r2.length
            r5 = 0
        L_0x02b2:
            if (r5 >= r4) goto L_0x02c8
            r9 = r2[r5]
            boolean r10 = com.bytedance.common.utility.C9431p.m18664a(r9)
            if (r10 != 0) goto L_0x02c5
            java.lang.String r9 = r9.trim()
            java.util.List<java.lang.String> r10 = r13.f34557ah
            r10.add(r9)
        L_0x02c5:
            int r5 = r5 + 1
            goto L_0x02b2
        L_0x02c8:
            com.bytedance.ttnet.c r2 = com.bytedance.ttnet.C13303d.m26799b()
            java.lang.String r2 = r2.mo24908f()
            boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r2)
            if (r4 != 0) goto L_0x02e3
            java.util.List<java.lang.String> r4 = r13.f34557ah
            boolean r4 = com.bytedance.ttnet.p887e.C13337i.m26875a(r2, r4)
            if (r4 != 0) goto L_0x02e3
            java.util.List<java.lang.String> r4 = r13.f34557ah
            r4.add(r2)
        L_0x02e3:
            com.bytedance.ttnet.d.c r2 = com.bytedance.ttnet.p886d.C13314c.m26812a()
            com.bytedance.ttnet.d.b r2 = r2.f34739c
            if (r2 == 0) goto L_0x02f4
            com.bytedance.ttnet.d.c r2 = com.bytedance.ttnet.p886d.C13314c.m26812a()
            com.bytedance.ttnet.d.b r2 = r2.f34739c
            r2.mo24921a()
        L_0x02f4:
            java.lang.String r2 = "disable_framed_transport"
            int r1 = r1.getInt(r2, r3)
            if (r1 <= 0) goto L_0x0301
            com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9860b.m19723a(r1)     // Catch:{ Throwable -> 0x0300 }
            goto L_0x0301
        L_0x0300:
        L_0x0301:
            boolean r2 = r13.f34574s
            if (r2 == 0) goto L_0x039b
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch:{ Throwable -> 0x039b }
            r2.<init>()     // Catch:{ Throwable -> 0x039b }
            java.lang.String r3 = r13.f34529F     // Catch:{ Throwable -> 0x039b }
            boolean r3 = com.bytedance.common.utility.C9431p.m18664a(r3)     // Catch:{ Throwable -> 0x039b }
            if (r3 != 0) goto L_0x0319
            java.lang.String r3 = "frontier_urls"
            java.lang.String r4 = r13.f34529F     // Catch:{ Throwable -> 0x039b }
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x039b }
        L_0x0319:
            java.lang.String r3 = "chromium_open"
            int r4 = r13.f34567g     // Catch:{ Throwable -> 0x039b }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x039b }
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x039b }
            java.lang.String r3 = "http_dns_enabled"
            int r4 = r13.f34535L     // Catch:{ Throwable -> 0x039b }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x039b }
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x039b }
            java.lang.String r3 = "add_ss_queries_open"
            int r4 = r13.f34542S     // Catch:{ Throwable -> 0x039b }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x039b }
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x039b }
            java.lang.String r3 = "add_ss_queries_header_open"
            int r4 = r13.f34543T     // Catch:{ Throwable -> 0x039b }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x039b }
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x039b }
            java.lang.String r3 = "add_ss_queries_plaintext_open"
            int r4 = r13.f34544U     // Catch:{ Throwable -> 0x039b }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x039b }
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x039b }
            java.lang.String r3 = "ttnet_token_enabled"
            int r4 = r13.f34551ab     // Catch:{ Throwable -> 0x039b }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x039b }
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x039b }
            java.lang.String r3 = "ttnet_token_api"
            r2.put(r3, r6)     // Catch:{ Throwable -> 0x039b }
            java.lang.String r3 = "ttnet_token_config_time"
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x039b }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x039b }
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x039b }
            java.lang.String r3 = "request_max_delay_time"
            int r4 = r13.f34553ad     // Catch:{ Throwable -> 0x039b }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x039b }
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x039b }
            java.lang.String r3 = "request_random_delay_apis"
            r2.put(r3, r7)     // Catch:{ Throwable -> 0x039b }
            java.lang.String r3 = "request_delay_time_range"
            r2.put(r3, r8)     // Catch:{ Throwable -> 0x039b }
            java.lang.String r3 = "share_cookie_host_list"
            r2.put(r3, r0)     // Catch:{ Throwable -> 0x039b }
            java.lang.String r0 = "disable_framed_transport"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Throwable -> 0x039b }
            r2.put(r0, r1)     // Catch:{ Throwable -> 0x039b }
            com.bytedance.ttnet.a.a$5 r0 = new com.bytedance.ttnet.a.a$5     // Catch:{ Throwable -> 0x039b }
            java.lang.String r1 = "SaveMapToProvider-Thread"
            r0.<init>(r1, r2)     // Catch:{ Throwable -> 0x039b }
            r0.start()     // Catch:{ Throwable -> 0x039b }
            return
        L_0x039b:
            return
        L_0x039c:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x039c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p883a.C13258a.mo24859k():void");
    }

    /* renamed from: b */
    public static void m26669b(boolean z) {
        f34519n = true;
    }

    /* renamed from: c */
    public static void m26670c(boolean z) {
        f34520o = true;
    }

    /* renamed from: e */
    public final boolean mo23847e(String str) {
        return C13357a.m26933a(str, this.f34556ag);
    }

    /* renamed from: d */
    public final List<String> mo17830d(String str) {
        if (C13337i.m26875a(str, this.f34557ah)) {
            return this.f34557ah;
        }
        return null;
    }

    /* renamed from: b */
    public static void m26667b(Context context) {
        C13258a aVar = f34521p;
        if (aVar != null) {
            if (C9912g.m19864a(context)) {
                aVar.m26671d(true);
                return;
            }
            aVar.mo24857i();
        }
    }

    /* renamed from: a */
    public final boolean mo24854a(final boolean z) {
        if (!this.f34564c.compareAndSet(false, true)) {
            return false;
        }
        if (z) {
            this.f34578w = System.currentTimeMillis();
        }
        new C9393e("AppConfigThread") {
            public final void run() {
                C13258a aVar = C13258a.this;
                boolean z = z;
                aVar.mo24859k();
                if (aVar.mo24856h()) {
                    aVar.f34564c.set(false);
                    return;
                }
                int i = 1;
                aVar.f34563b = true;
                int i2 = 102;
                if (!z) {
                    aVar.f34569i.sendEmptyMessage(102);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    if (aVar.mo24853a(jSONArray)) {
                        i2 = BaseNotice.HASHTAG;
                    } else {
                        i = 0;
                    }
                    jSONObject.put(WebKitApi.SCHEME_HTTPS, jSONArray);
                    jSONObject.put("from", "app");
                    jSONObject.put("available_state", i);
                } catch (JSONException unused) {
                    aVar.f34564c.set(false);
                }
                C13303d.m26799b().mo24902a(aVar.f34565d, jSONObject);
                aVar.f34569i.sendEmptyMessage(i2);
            }
        }.start();
        return true;
    }

    /* renamed from: a */
    private static String m26662a(Map<C13267a, C13267a> map) {
        try {
            JSONArray jSONArray = new JSONArray();
            if (map.size() > 0) {
                for (C13267a aVar : map.keySet()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C13267a.f34593a, aVar.f34595c);
                    jSONObject.put(C13267a.f34594b, aVar.f34597e);
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: d */
    private void m26671d(boolean z) {
        if (this.f34574s) {
            m26672e(z);
            if (this.f34568h != null) {
                this.f34568h.mo24882b(this.f34565d);
            }
        } else if (this.f34577v <= 0) {
            try {
                new C9393e("LoadDomainConfig4Other-Thread") {
                    public final void run() {
                        C13258a.this.mo24858j();
                    }
                }.start();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: f */
    static Set<String> m26673f(String str) {
        Set set;
        if (C9431p.m18664a(str)) {
            return Collections.emptySet();
        }
        Set emptySet = Collections.emptySet();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                set = new LinkedHashSet();
                int i = 0;
                while (i < jSONArray.length()) {
                    try {
                        set.add(jSONArray.getString(i));
                        i++;
                    } catch (Throwable unused) {
                    }
                }
                return set;
            }
        } catch (Throwable unused2) {
        }
        set = emptySet;
        return set;
    }

    /* renamed from: h */
    private void m26674h(String str) {
        if (!C9431p.m18664a(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                HashMap<String, String> hashMap = new HashMap<>();
                if (m26666a(hashMap, jSONObject)) {
                    this.f34580y = hashMap;
                    HashMap<String, String> hashMap2 = new HashMap<>();
                    hashMap2.putAll(hashMap);
                    this.f34581z = hashMap2;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final boolean mo17826b(String str) {
        if (C9431p.m18664a(str) || this.f34547X <= 0) {
            return false;
        }
        try {
            URI a = C9915j.m19868a(str);
            if (a == null || C9431p.m18664a(a.getHost())) {
                return false;
            }
            C13303d.m26799b();
            throw new IllegalArgumentException("cdnHostSuffix is not init !!!");
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo17828c(String str) {
        if (C9431p.m18664a(str) || this.f34546W <= 0) {
            return false;
        }
        try {
            URI a = C9915j.m19868a(str);
            if (a == null) {
                return false;
            }
            String host = a.getHost();
            if (!C9431p.m18664a(host) && host.endsWith(C13257a.m26659b())) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    private void m26672e(boolean z) {
        long j;
        if (!this.f34563b) {
            if (this.f34576u) {
                this.f34576u = false;
                this.f34577v = 0;
                this.f34578w = 0;
            }
            if (z) {
                j = 10800000;
            } else {
                j = 43200000;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f34577v > j && currentTimeMillis - this.f34578w > 120000) {
                boolean a = C13270b.m26707a(this.f34565d);
                if (!this.f34579x || a) {
                    mo24854a(a);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003d A[SYNTHETIC, Splitter:B:23:0x003d] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<java.net.InetAddress> m26675i(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            int r1 = f34513aq     // Catch:{ Throwable -> 0x0067 }
            if (r1 > 0) goto L_0x000e
            boolean r1 = com.bytedance.common.utility.C9415i.m18635b()     // Catch:{ Throwable -> 0x0067 }
            if (r1 == 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            r1 = r0
            goto L_0x003a
        L_0x000e:
            monitor-enter(r7)     // Catch:{ Throwable -> 0x0067 }
            com.bytedance.common.a.e r1 = r7.f34562at     // Catch:{ all -> 0x0064 }
            if (r1 != 0) goto L_0x0037
            android.content.Context r1 = r7.f34565d     // Catch:{ all -> 0x0064 }
            java.lang.String r2 = "131950"
            r3 = 300(0x12c, double:1.48E-321)
            int r5 = f34514ar     // Catch:{ all -> 0x0064 }
            r6 = 1
            if (r5 <= 0) goto L_0x0020
            r5 = 1
            goto L_0x0021
        L_0x0020:
            r5 = 0
        L_0x0021:
            com.bytedance.common.a.e r1 = com.bytedance.common.p518a.C9341d.m18502a(r1, r2, r3, r5)     // Catch:{ all -> 0x0064 }
            r7.f34562at = r1     // Catch:{ all -> 0x0064 }
            com.bytedance.common.a.e r1 = r7.f34562at     // Catch:{ all -> 0x0064 }
            r1.mo16968b(r6)     // Catch:{ all -> 0x0064 }
            boolean r1 = com.bytedance.common.utility.C9415i.m18635b()     // Catch:{ all -> 0x0064 }
            if (r1 == 0) goto L_0x0037
            com.bytedance.common.a.e r1 = r7.f34562at     // Catch:{ all -> 0x0064 }
            r1.mo16966a(r6)     // Catch:{ all -> 0x0064 }
        L_0x0037:
            com.bytedance.common.a.e r1 = r7.f34562at     // Catch:{ all -> 0x0064 }
            monitor-exit(r7)     // Catch:{ all -> 0x0064 }
        L_0x003a:
            if (r1 != 0) goto L_0x003d
            return r0
        L_0x003d:
            java.lang.String r2 = com.bytedance.ttnet.C13257a.m26659b()     // Catch:{ Throwable -> 0x0067 }
            boolean r2 = r8.endsWith(r2)     // Catch:{ Throwable -> 0x0067 }
            if (r2 != 0) goto L_0x0057
            java.lang.String r2 = ".pstatp.com"
            boolean r2 = r8.endsWith(r2)     // Catch:{ Throwable -> 0x0067 }
            if (r2 != 0) goto L_0x0057
            java.lang.String r2 = ".bytecdn.com"
            boolean r2 = r8.endsWith(r2)     // Catch:{ Throwable -> 0x0067 }
            if (r2 == 0) goto L_0x0067
        L_0x0057:
            java.util.List r8 = r1.mo16965a(r8)     // Catch:{ Throwable -> 0x0067 }
            if (r8 == 0) goto L_0x0067
            int r1 = r8.size()     // Catch:{ Throwable -> 0x0067 }
            if (r1 <= 0) goto L_0x0067
            return r8
        L_0x0064:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0064 }
            throw r8     // Catch:{ Throwable -> 0x0067 }
        L_0x0067:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p883a.C13258a.m26675i(java.lang.String):java.util.List");
    }

    public void handleMsg(Message message) {
        switch (message.what) {
            case BaseNotice.HASHTAG /*101*/:
                this.f34563b = false;
                this.f34577v = System.currentTimeMillis();
                if (this.f34576u) {
                    mo24857i();
                }
                try {
                    mo24863q();
                    if (f34513aq <= 0 && this.f34562at != null) {
                        this.f34562at.mo16967b();
                    }
                } catch (Throwable unused) {
                }
                this.f34564c.set(false);
                return;
            case 102:
                this.f34563b = false;
                if (this.f34576u) {
                    mo24857i();
                }
                this.f34564c.set(false);
                break;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:13|14|15|16|17|(1:19)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0071 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.ttnet.p883a.C13258a m26660a(android.content.Context r4) {
        /*
            java.lang.Class<com.bytedance.ttnet.a.a> r0 = com.bytedance.ttnet.p883a.C13258a.class
            monitor-enter(r0)
            com.bytedance.ttnet.a.a r1 = f34521p     // Catch:{ all -> 0x009b }
            if (r1 != 0) goto L_0x0097
            boolean r1 = com.bytedance.frameworks.baselib.network.http.p574e.C9912g.m19864a(r4)     // Catch:{ all -> 0x009b }
            com.bytedance.ttnet.a.a r2 = new com.bytedance.ttnet.a.a     // Catch:{ all -> 0x009b }
            android.content.Context r3 = r4.getApplicationContext()     // Catch:{ all -> 0x009b }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x009b }
            f34521p = r2     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x005f
            com.bytedance.ttnet.a.a r1 = f34521p     // Catch:{ all -> 0x009b }
            com.bytedance.frameworks.core.p577a.C9923a.m19901a(r1)     // Catch:{ all -> 0x009b }
            com.bytedance.ttnet.a.a r1 = f34521p     // Catch:{ all -> 0x009b }
            com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.m19763a(r1)     // Catch:{ all -> 0x009b }
            com.bytedance.ttnet.a.a r1 = f34521p     // Catch:{ all -> 0x009b }
            com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.m19762a(r1)     // Catch:{ all -> 0x009b }
            com.bytedance.ttnet.a.a r1 = f34521p     // Catch:{ all -> 0x009b }
            com.bytedance.ttnet.C13281b.m26757a(r1)     // Catch:{ all -> 0x009b }
            com.bytedance.frameworks.baselib.network.a.c r1 = com.bytedance.frameworks.baselib.network.p566a.C9812c.m19639b()     // Catch:{ all -> 0x009b }
            com.bytedance.ttnet.a.a r2 = f34521p     // Catch:{ all -> 0x009b }
            if (r2 == 0) goto L_0x0039
            java.util.ArrayList<java.lang.Object> r3 = r1.f26687b     // Catch:{ all -> 0x009b }
            r3.add(r2)     // Catch:{ all -> 0x009b }
        L_0x0039:
            java.util.concurrent.atomic.AtomicReference<com.bytedance.frameworks.baselib.network.a.d> r1 = r1.f26686a     // Catch:{ all -> 0x009b }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x009b }
            com.bytedance.frameworks.baselib.network.a.d r1 = (com.bytedance.frameworks.baselib.network.p566a.C9814d) r1     // Catch:{ all -> 0x009b }
            com.bytedance.ttnet.a.a r1 = f34521p     // Catch:{ all -> 0x009b }
            com.bytedance.frameworks.baselib.network.http.C9894e.f26957b = r1     // Catch:{ all -> 0x009b }
            com.bytedance.ttnet.a.a r1 = f34521p     // Catch:{ all -> 0x009b }
            com.bytedance.frameworks.baselib.network.http.C9894e.f26958c = r1     // Catch:{ all -> 0x009b }
            com.bytedance.ttnet.a.a r1 = f34521p     // Catch:{ all -> 0x009b }
            com.bytedance.ttnet.encrypt.C13343c.m26892a(r1)     // Catch:{ all -> 0x009b }
            com.bytedance.ttnet.a.a r1 = f34521p     // Catch:{ all -> 0x009b }
            com.bytedance.retrofit2.SsHttpCall.setThrottleControl(r1)     // Catch:{ all -> 0x009b }
            com.bytedance.frameworks.baselib.network.http.e$h r1 = com.bytedance.frameworks.baselib.network.http.C9894e.m19835i()     // Catch:{ all -> 0x009b }
            if (r1 != 0) goto L_0x0090
            com.bytedance.ttnet.a.a r1 = f34521p     // Catch:{ all -> 0x009b }
            com.bytedance.frameworks.baselib.network.http.C9894e.m19820a(r1)     // Catch:{ all -> 0x009b }
            goto L_0x0090
        L_0x005f:
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch:{ all -> 0x009b }
            r1.<init>()     // Catch:{ all -> 0x009b }
            java.lang.String r2 = "com.bytedance.ttnet.config.appconfig.SYNC_MAIN_PROCESS_CONFIG"
            r1.addAction(r2)     // Catch:{ all -> 0x009b }
            com.bytedance.ttnet.a.a$b r2 = new com.bytedance.ttnet.a.a$b     // Catch:{ Throwable -> 0x0071 }
            r2.<init>()     // Catch:{ Throwable -> 0x0071 }
            r4.registerReceiver(r2, r1)     // Catch:{ Throwable -> 0x0071 }
        L_0x0071:
            com.bytedance.ttnet.a.i r1 = com.bytedance.ttnet.p883a.C13280i.m26742i()     // Catch:{ all -> 0x009b }
            com.bytedance.frameworks.core.p577a.C9923a.m19901a(r1)     // Catch:{ all -> 0x009b }
            com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.m19763a(r1)     // Catch:{ all -> 0x009b }
            com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.m19762a(r1)     // Catch:{ all -> 0x009b }
            com.bytedance.ttnet.C13281b.m26757a(r1)     // Catch:{ all -> 0x009b }
            com.bytedance.ttnet.encrypt.C13343c.m26892a(r1)     // Catch:{ all -> 0x009b }
            com.bytedance.retrofit2.SsHttpCall.setThrottleControl(r1)     // Catch:{ all -> 0x009b }
            com.bytedance.frameworks.baselib.network.http.e$h r2 = com.bytedance.frameworks.baselib.network.http.C9894e.m19835i()     // Catch:{ all -> 0x009b }
            if (r2 != 0) goto L_0x0090
            com.bytedance.frameworks.baselib.network.http.C9894e.m19820a(r1)     // Catch:{ all -> 0x009b }
        L_0x0090:
            com.bytedance.ttnet.a.a r1 = f34521p     // Catch:{ all -> 0x009b }
            com.bytedance.frameworks.baselib.network.http.C9894e.f26963h = r1     // Catch:{ all -> 0x009b }
            com.bytedance.ttnet.p883a.C13272d.m26710a(r4)     // Catch:{ all -> 0x009b }
        L_0x0097:
            com.bytedance.ttnet.a.a r4 = f34521p     // Catch:{ all -> 0x009b }
            monitor-exit(r0)     // Catch:{ all -> 0x009b }
            return r4
        L_0x009b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p883a.C13258a.m26660a(android.content.Context):com.bytedance.ttnet.a.a");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(18:3|4|(2:6|(2:49|8)(1:9))|48|10|(1:15)(1:14)|16|17|(3:24|(1:26)(1:27)|(11:29|30|31|32|35|36|(1:38)|39|(1:43)|44|47))|33|35|36|(0)|39|41|43|44|47) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008d */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0093 A[Catch:{ Throwable -> 0x00d3 }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo24855g(java.lang.String r10) {
        /*
            r9 = this;
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r10)
            if (r0 == 0) goto L_0x0007
            return r10
        L_0x0007:
            java.net.URI r0 = com.bytedance.frameworks.baselib.network.http.p574e.C9915j.m19868a(r10)     // Catch:{ Throwable -> 0x00d3 }
            r1 = 1
            java.net.URI r0 = r9.m26663a(r0, r1)     // Catch:{ Throwable -> 0x00d3 }
            java.lang.String r2 = r0.getHost()     // Catch:{ Throwable -> 0x00d3 }
            int r3 = r0.getPort()     // Catch:{ Throwable -> 0x00d3 }
            java.lang.String r4 = r0.getScheme()     // Catch:{ Throwable -> 0x00d3 }
            java.lang.String[] r5 = m26677p()     // Catch:{ Throwable -> 0x00d3 }
            int r6 = r5.length     // Catch:{ Throwable -> 0x00d3 }
            r7 = 0
        L_0x0022:
            if (r7 >= r6) goto L_0x0030
            r8 = r5[r7]     // Catch:{ Throwable -> 0x00d3 }
            boolean r8 = r8.equals(r2)     // Catch:{ Throwable -> 0x00d3 }
            if (r8 == 0) goto L_0x002d
            return r10
        L_0x002d:
            int r7 = r7 + 1
            goto L_0x0022
        L_0x0030:
            java.util.Map<java.lang.String, java.lang.String> r5 = r9.f34524A     // Catch:{ Throwable -> 0x00d3 }
            java.lang.Object r5 = r5.get(r2)     // Catch:{ Throwable -> 0x00d3 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x00d3 }
            r6 = 0
            if (r5 == 0) goto L_0x0048
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r9.f34581z     // Catch:{ Throwable -> 0x00d3 }
            if (r7 == 0) goto L_0x0048
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r9.f34581z     // Catch:{ Throwable -> 0x00d3 }
            java.lang.Object r5 = r7.get(r5)     // Catch:{ Throwable -> 0x00d3 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x00d3 }
            goto L_0x0049
        L_0x0048:
            r5 = r6
        L_0x0049:
            java.lang.String r7 = com.bytedance.ttnet.C13257a.m26657a()     // Catch:{ Throwable -> 0x008c }
            java.lang.String r7 = com.bytedance.ttnet.C13257a.m26658a(r7)     // Catch:{ Throwable -> 0x008c }
            boolean r2 = r7.equals(r2)     // Catch:{ Throwable -> 0x008c }
            if (r2 != 0) goto L_0x0067
            if (r5 == 0) goto L_0x008c
            java.lang.String r2 = com.bytedance.ttnet.C13257a.m26657a()     // Catch:{ Throwable -> 0x008c }
            java.lang.String r2 = com.bytedance.ttnet.C13257a.m26658a(r2)     // Catch:{ Throwable -> 0x008c }
            boolean r2 = r2.equals(r5)     // Catch:{ Throwable -> 0x008c }
            if (r2 == 0) goto L_0x008c
        L_0x0067:
            com.bytedance.ttnet.a.e r2 = r9.f34568h     // Catch:{ Throwable -> 0x008c }
            if (r2 == 0) goto L_0x008c
            com.bytedance.ttnet.a.e r2 = r9.f34568h     // Catch:{ Throwable -> 0x008c }
            com.bytedance.ttnet.a.e$a r7 = r2.f34617f     // Catch:{ Throwable -> 0x008c }
            if (r7 == 0) goto L_0x007f
            android.util.Pair r7 = new android.util.Pair     // Catch:{ Throwable -> 0x008c }
            com.bytedance.ttnet.a.e$a r8 = r2.f34617f     // Catch:{ Throwable -> 0x008c }
            java.lang.String r8 = r8.f34638j     // Catch:{ Throwable -> 0x008c }
            com.bytedance.ttnet.a.e$a r2 = r2.f34617f     // Catch:{ Throwable -> 0x008c }
            java.lang.String r2 = r2.f34629a     // Catch:{ Throwable -> 0x008c }
            r7.<init>(r8, r2)     // Catch:{ Throwable -> 0x008c }
            goto L_0x0080
        L_0x007f:
            r7 = r6
        L_0x0080:
            if (r7 == 0) goto L_0x008c
            java.lang.Object r2 = r7.first     // Catch:{ Throwable -> 0x008c }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x008c }
            java.lang.Object r7 = r7.second     // Catch:{ Throwable -> 0x008d }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Throwable -> 0x008d }
            r5 = r7
            goto L_0x008d
        L_0x008c:
            r2 = r6
        L_0x008d:
            boolean r7 = com.bytedance.common.utility.C9431p.m18664a(r5)     // Catch:{ Throwable -> 0x00d3 }
            if (r7 != 0) goto L_0x009c
            com.bytedance.frameworks.baselib.network.http.e.c r7 = new com.bytedance.frameworks.baselib.network.http.e.c     // Catch:{ Throwable -> 0x00d3 }
            r7.<init>(r5, r3, r4)     // Catch:{ Throwable -> 0x00d3 }
            java.net.URI r0 = com.bytedance.frameworks.baselib.network.http.p574e.C9915j.m19870a(r0, r7)     // Catch:{ Throwable -> 0x00d3 }
        L_0x009c:
            java.lang.String r0 = r9.m26661a(r0, r6, r2, r1)     // Catch:{ Throwable -> 0x00d3 }
            java.lang.String r1 = "?"
            boolean r1 = r0.contains(r1)     // Catch:{ Throwable -> 0x00d3 }
            if (r1 != 0) goto L_0x00c9
            java.lang.String r1 = "?"
            boolean r1 = r10.contains(r1)     // Catch:{ Throwable -> 0x00d3 }
            if (r1 == 0) goto L_0x00c9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00d3 }
            r1.<init>()     // Catch:{ Throwable -> 0x00d3 }
            r1.append(r0)     // Catch:{ Throwable -> 0x00d3 }
            java.lang.String r0 = "?"
            int r0 = r10.indexOf(r0)     // Catch:{ Throwable -> 0x00d3 }
            java.lang.String r0 = r10.substring(r0)     // Catch:{ Throwable -> 0x00d3 }
            r1.append(r0)     // Catch:{ Throwable -> 0x00d3 }
            java.lang.String r0 = r1.toString()     // Catch:{ Throwable -> 0x00d3 }
        L_0x00c9:
            r10 = r0
            com.bytedance.ttnet.d.c r0 = com.bytedance.ttnet.p886d.C13314c.m26812a()     // Catch:{ Throwable -> 0x00d3 }
            java.lang.String r0 = r0.mo24923a(r10)     // Catch:{ Throwable -> 0x00d3 }
            goto L_0x00d4
        L_0x00d3:
            r0 = r10
        L_0x00d4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p883a.C13258a.mo24855g(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static void m26664a(HashMap<String, String> hashMap, JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    String optString = optJSONObject.optString("origin");
                    if (!C9431p.m18664a(optString)) {
                        String optString2 = optJSONObject.optString("target");
                        if (!C9431p.m18664a(optString2)) {
                            hashMap.put(optString, optString2);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private static void m26668b(HashMap<String, InetAddress[]> hashMap, JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                int length = jSONArray.length();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < length; i++) {
                    try {
                        arrayList.clear();
                        JSONObject optJSONObject = jSONArray.optJSONObject(i);
                        String string = optJSONObject.getString("host");
                        if (!C9431p.m18664a(string)) {
                            JSONArray optJSONArray = optJSONObject.optJSONArray("ip");
                            int min = Math.min(optJSONArray.length(), 3);
                            for (int i2 = 0; i2 < min; i2++) {
                                String string2 = optJSONArray.getString(i2);
                                if (C9910e.f26981a.matcher(string2).matches()) {
                                    InetAddress byAddress = InetAddress.getByAddress(string, InetAddress.getByName(string2).getAddress());
                                    if (byAddress != null) {
                                        arrayList.add(byAddress);
                                    }
                                }
                            }
                            if (arrayList.size() > 0) {
                                InetAddress[] inetAddressArr = new InetAddress[arrayList.size()];
                                arrayList.toArray(inetAddressArr);
                                hashMap.put(string, inetAddressArr);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    private C13258a(Context context, boolean z) {
        this.f34565d = context;
        this.f34524A = C13303d.m26799b().mo24907e();
        String a = C13257a.m26658a(C13257a.m26657a());
        this.f34574s = z;
        if (this.f34574s) {
            new C9393e("AppConfig-WaitConfigTimesTask") {
                public final void run() {
                    SharedPreferences a = C35807d.m80935a(C13258a.this.f34565d, "ss_app_config", 0);
                    C13258a.this.f34572l = a.getInt("wait_config_times", 0);
                    C13258a.this.f34567g = a.getInt("chromium_open", 0);
                    if (C13258a.this.f34567g <= 0) {
                        C13258a.this.f34572l = 0;
                    } else {
                        if (C13258a.this.f34572l >= 3) {
                            C13258a.this.f34567g = 0;
                            C13258a.this.f34572l = 0;
                        }
                        C13258a.this.f34572l++;
                    }
                    synchronized (C13258a.this) {
                        Editor edit = a.edit();
                        edit.putInt("chromium_open", C13258a.this.f34567g);
                        edit.putInt("wait_config_times", C13258a.this.f34572l);
                        C9402b.m18594a(edit);
                    }
                }
            }.start();
            try {
                this.f34571k = new C13348c(a, 80);
                C13350e eVar = new C13350e(this.f34565d);
                eVar.f34832e = 1800000;
                C13348c cVar = this.f34571k;
                if (cVar != null) {
                    if (!eVar.mo24965b().keySet().contains(cVar)) {
                        eVar.f34829b.put(cVar, new C13356g());
                    }
                }
                this.f34570j = eVar;
                this.f34573m.mo24948a(this.f34565d);
                C13350e eVar2 = this.f34570j;
                try {
                    C13351f.m26926b("HostMonitor", "saving configuration");
                    Editor edit = eVar2.mo24963a().edit();
                    if (eVar2.f34829b != null && !eVar2.f34829b.isEmpty()) {
                        edit.putString("host_status", C13350e.m26918a(eVar2.f34829b).toString());
                    }
                    if (eVar2.f34830c != null && !eVar2.f34830c.isEmpty()) {
                        edit.putString("broadcastAction", eVar2.f34830c);
                    }
                    if (eVar2.f34831d > 0) {
                        edit.putInt("socketTimeout", eVar2.f34831d);
                    }
                    if (eVar2.f34832e >= 0) {
                        edit.putInt("checkInterval", eVar2.f34832e);
                    }
                    if (eVar2.f34833f > 0) {
                        edit.putInt("maxAttempts", eVar2.f34833f);
                    }
                    edit.apply();
                    boolean z2 = !eVar2.mo24965b().isEmpty();
                    C13337i.m26873a(eVar2.f34828a, ConnectivityReceiver.class, z2);
                    AlarmManager alarmManager = (AlarmManager) eVar2.f34828a.getSystemService("alarm");
                    Context context2 = eVar2.f34828a;
                    Intent intent = new Intent(context2, HostMonitor.class);
                    intent.setAction("com.bytedance.ttnet.hostmonitor.check");
                    PendingIntent broadcast = PendingIntent.getBroadcast(context2, 0, intent, 0);
                    C13351f.m26926b("HostMonitor", "cancelling scheduled checks");
                    alarmManager.cancel(broadcast);
                    if (z2) {
                        if (eVar2.mo24967d() > 0) {
                            StringBuilder sb = new StringBuilder("scheduling periodic checks every ");
                            sb.append(eVar2.mo24967d() / 1000);
                            sb.append(" seconds");
                            C13351f.m26926b("HostMonitor", sb.toString());
                            C13303d.m26799b();
                            alarmManager.setRepeating(1, ((long) eVar2.mo24967d()) + System.currentTimeMillis(), (long) eVar2.mo24967d(), broadcast);
                        }
                        C13351f.m26926b("HostMonitor", "triggering reachability check");
                    }
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    private URI m26663a(URI uri, boolean z) {
        if (this.f34541R <= 0 || uri == null) {
            return uri;
        }
        try {
            HashMap<String, String> hashMap = this.f34527D;
            if (z) {
                hashMap = this.f34528E;
            }
            if (hashMap != null) {
                if (!hashMap.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    String host = uri.getHost();
                    int port = uri.getPort();
                    String rawPath = uri.getRawPath();
                    if (host != null) {
                        sb.append(host);
                        if (port > 0) {
                            sb.append(':');
                            sb.append(port);
                        }
                    }
                    if (rawPath == null || !rawPath.startsWith("/")) {
                        sb.append('/');
                    }
                    if (rawPath != null) {
                        sb.append(rawPath);
                    }
                    String sb2 = sb.toString();
                    String str = (String) hashMap.get(sb2);
                    if (C9431p.m18664a(str)) {
                        Iterator it = hashMap.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Entry entry = (Entry) it.next();
                            if (entry != null) {
                                String str2 = (String) entry.getKey();
                                String str3 = (String) entry.getValue();
                                if (sb2.startsWith(str2)) {
                                    str = sb2.replaceFirst(str2, str3);
                                    break;
                                }
                            }
                        }
                    }
                    if (!C9431p.m18664a(str)) {
                        StringBuilder sb3 = new StringBuilder();
                        if (uri.getScheme() != null) {
                            sb3.append(uri.getScheme());
                            sb3.append("://");
                        }
                        sb3.append(str);
                        URI uri2 = new URI(sb3.toString());
                        return C9915j.m19869a(uri2.getScheme(), uri2.getHost(), uri2.getPort(), uri2.getRawPath(), uri.getRawQuery(), uri.getRawFragment());
                    }
                    return uri;
                }
            }
            return uri;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m26665a(Map<C13267a, C13267a> map, JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            try {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    try {
                        C13267a aVar = new C13267a();
                        if (z) {
                            JSONObject optJSONObject = jSONArray.optJSONObject(i);
                            aVar.mo24866a(optJSONObject.optString(C13267a.f34593a));
                            int optInt = optJSONObject.optInt(C13267a.f34594b);
                            if (this.f34560ak > 0) {
                                aVar.f34597e = optInt;
                            } else {
                                aVar.f34597e = 0;
                            }
                        } else {
                            aVar.mo24866a(jSONArray.optString(i));
                            aVar.f34597e = 0;
                        }
                        map.put(aVar, aVar);
                    } catch (Exception unused) {
                    }
                }
                synchronized (this) {
                    if (this.f34566e != null && this.f34566e.size() > 0) {
                        for (C13267a aVar2 : this.f34566e.keySet()) {
                            if (map.containsKey(aVar2)) {
                                map.remove(aVar2);
                                map.put(aVar2, aVar2);
                            }
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    private String m26661a(URI uri, C9841b bVar, String str, boolean z) {
        boolean z2;
        String str2;
        boolean z3;
        boolean z4;
        int i;
        boolean z5;
        boolean z6;
        C13302e eVar = null;
        if (uri == null) {
            return null;
        }
        if (bVar instanceof C13302e) {
            eVar = (C13302e) bVar;
        }
        if (eVar != null && eVar.f34694o) {
            return uri.toString();
        }
        boolean z7 = false;
        if (f34507a || this.f34530G <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            return uri.toString();
        }
        String uri2 = uri.toString();
        try {
            if (C9425l.m18649a(this.f34565d)) {
                return uri2;
            }
            if (this.f34540Q > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3 || C9431p.m18664a(str)) {
                C13267a[] aVarArr = new C13267a[1];
                if (!C9431p.m18664a(uri2)) {
                    Map map = this.f34566e;
                    if (z) {
                        map = this.f34526C;
                    }
                    if (map != null && map.size() > 0) {
                        Iterator it = map.keySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C13267a aVar = (C13267a) it.next();
                            if (C9431p.m18664a(uri2) || aVar.f34596d == null) {
                                z6 = false;
                                continue;
                            } else {
                                z6 = aVar.f34596d.reset(uri2).matches();
                                continue;
                            }
                            if (z6) {
                                aVarArr[0] = aVar;
                                z4 = true;
                                break;
                            }
                        }
                    }
                }
                z4 = false;
                if (z4) {
                    C13267a aVar2 = aVarArr[0];
                    if (aVar2 != null) {
                        if (aVar2.f34597e <= f34518f) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            z7 = true;
                        }
                    }
                    if (eVar != null) {
                        if (aVar2 == null) {
                            i = -1;
                        } else {
                            i = aVar2.f34597e;
                        }
                        eVar.f34696q = i;
                    }
                    if (uri2.startsWith(WebKitApi.SCHEME_HTTP) && z7 && (C9431p.m18664a(str) || !WebKitApi.SCHEME_HTTP.equals(str))) {
                        str2 = uri2.replaceFirst(WebKitApi.SCHEME_HTTP, WebKitApi.SCHEME_HTTPS);
                        if (eVar != null) {
                            eVar.f34695p = true;
                        }
                        return str2;
                    }
                }
                str2 = uri2;
                return str2;
            }
            str2 = C9915j.m19870a(uri, new C9908c(uri.getHost(), uri.getPort(), str)).toString();
            if (eVar != null) {
                try {
                    if (str.equals(WebKitApi.SCHEME_HTTPS)) {
                        eVar.f34695p = true;
                    }
                } catch (Throwable unused) {
                }
            }
            return str2;
        } catch (Throwable unused2) {
        }
    }
}
