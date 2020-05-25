package com.p683ss.android.deviceregister.p1155b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.deviceregister.C19034d.C19035a;
import com.p683ss.android.deviceregister.C19037f;
import com.p683ss.android.deviceregister.p1154a.C19002a;
import com.p683ss.android.deviceregister.p1154a.C19003b;
import com.p683ss.android.deviceregister.p1154a.C19004c;
import com.p683ss.android.deviceregister.p1154a.C19005d;
import com.p683ss.android.deviceregister.p1155b.p1156a.C19010a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.deviceregister.b.b */
public final class C19026b {

    /* renamed from: a */
    public static C19003b f52366a;

    /* renamed from: b */
    public static final Object f52367b = new Object();

    /* renamed from: c */
    public static C19004c f52368c;

    /* renamed from: e */
    public static final Bundle f52369e = new Bundle();

    /* renamed from: f */
    public static volatile boolean f52370f = false;

    /* renamed from: g */
    public static volatile boolean f52371g = false;

    /* renamed from: m */
    public static long f52372m = 0;

    /* renamed from: r */
    public static volatile boolean f52373r = false;

    /* renamed from: u */
    static List<WeakReference<C19035a>> f52374u = new ArrayList();

    /* renamed from: v */
    public static final ThreadLocal<Boolean> f52375v = new ThreadLocal<>();

    /* renamed from: w */
    public static boolean f52376w = false;

    /* renamed from: d */
    public final Object f52377d = new Object();

    /* renamed from: h */
    public int f52378h;

    /* renamed from: i */
    public final C19010a f52379i;

    /* renamed from: j */
    public final Context f52380j;

    /* renamed from: k */
    public final SharedPreferences f52381k;

    /* renamed from: l */
    public JSONObject f52382l;

    /* renamed from: n */
    public long f52383n = 0;

    /* renamed from: o */
    public long f52384o = 0;

    /* renamed from: p */
    public long f52385p = 0;

    /* renamed from: q */
    public String f52386q;

    /* renamed from: s */
    public String f52387s;

    /* renamed from: t */
    public C19027a f52388t;

    /* renamed from: com.ss.android.deviceregister.b.b$a */
    public class C19027a extends Thread {

        /* renamed from: a */
        int f52389a;

        /* renamed from: c */
        private final int f52391c;

        /* renamed from: b */
        private boolean m46291b(String str, int i) {
            return C19028c.m46295a(this, str, i);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:37|(3:39|40|(3:42|43|44)(2:45|46))|48|49|(3:64|51|52)) */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00be, code lost:
            mo38888a();
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00b7 */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x00bb A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r14 = this;
                super.run()
                com.ss.android.deviceregister.b.b r0 = com.p683ss.android.deviceregister.p1155b.C19026b.this
                org.json.JSONObject r0 = r0.f52382l
                java.lang.String r1 = "device_id"
                r2 = 0
                java.lang.String r0 = r0.optString(r1, r2)
                boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r0)
                r1 = 1
                r0 = r0 ^ r1
                java.util.List<java.lang.ref.WeakReference<com.ss.android.deviceregister.d$a>> r2 = com.p683ss.android.deviceregister.p1155b.C19026b.f52374u
                int r2 = r2.size()
                r3 = 0
                r4 = 0
            L_0x001c:
                if (r4 >= r2) goto L_0x0036
                java.util.List<java.lang.ref.WeakReference<com.ss.android.deviceregister.d$a>> r5 = com.p683ss.android.deviceregister.p1155b.C19026b.f52374u
                java.lang.Object r5 = r5.get(r4)
                java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
                if (r5 == 0) goto L_0x0033
                java.lang.Object r5 = r5.get()
                com.ss.android.deviceregister.d$a r5 = (com.p683ss.android.deviceregister.C19034d.C19035a) r5
                if (r5 == 0) goto L_0x0033
                r5.onDidLoadLocally(r0)     // Catch:{ Exception -> 0x0033 }
            L_0x0033:
                int r4 = r4 + 1
                goto L_0x001c
            L_0x0036:
                boolean r0 = com.p683ss.android.deviceregister.p1155b.C19026b.f52373r
                if (r0 != 0) goto L_0x00c5
                long r4 = java.lang.System.currentTimeMillis()
                r6 = 21600000(0x1499700, double:1.0671818E-316)
                r8 = 30000(0x7530, double:1.4822E-319)
                com.ss.android.deviceregister.b.b r0 = com.p683ss.android.deviceregister.p1155b.C19026b.this
                int r0 = r0.f52378h
                int r2 = com.p683ss.android.deviceregister.p1154a.C19005d.m46188c()
                if (r0 != r2) goto L_0x004f
                r0 = 1
                goto L_0x0050
            L_0x004f:
                r0 = 0
            L_0x0050:
                boolean r2 = com.p683ss.android.deviceregister.p1155b.C19008a.f52339e
                r10 = 0
                if (r2 != 0) goto L_0x0061
                long r12 = com.p683ss.android.deviceregister.p1155b.C19026b.f52372m
                int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r2 >= 0) goto L_0x0061
                if (r0 == 0) goto L_0x0061
                r6 = 43200000(0x2932e00, double:2.1343636E-316)
            L_0x0061:
                if (r0 == 0) goto L_0x0066
                r8 = 180000(0x2bf20, double:8.8932E-319)
            L_0x0066:
                int r0 = r14.f52389a
                r2 = 2
                if (r0 >= r2) goto L_0x0083
                com.ss.android.deviceregister.b.b r0 = com.p683ss.android.deviceregister.p1155b.C19026b.this
                java.lang.String r0 = r0.mo38883a()
                boolean r0 = com.p683ss.android.common.applog.NetUtil.isBadId(r0)
                if (r0 != 0) goto L_0x0081
                com.ss.android.deviceregister.b.b r0 = com.p683ss.android.deviceregister.p1155b.C19026b.this
                java.lang.String r0 = r0.f52386q
                boolean r0 = com.p683ss.android.common.applog.NetUtil.isBadId(r0)
                if (r0 == 0) goto L_0x0083
            L_0x0081:
                r0 = 1
                goto L_0x0084
            L_0x0083:
                r0 = 0
            L_0x0084:
                int r2 = r14.f52389a
                int r2 = r2 + r1
                r14.f52389a = r2
                if (r0 == 0) goto L_0x008d
                r8 = 15000(0x3a98, double:7.411E-320)
            L_0x008d:
                com.ss.android.deviceregister.b.b r0 = com.p683ss.android.deviceregister.p1155b.C19026b.this
                long r12 = r0.f52383n
                long r12 = r4 - r12
                long r6 = r6 - r12
                com.ss.android.deviceregister.b.b r0 = com.p683ss.android.deviceregister.p1155b.C19026b.this
                long r12 = r0.f52384o
                long r4 = r4 - r12
                long r8 = r8 - r4
                long r4 = java.lang.Math.max(r6, r8)
                com.ss.android.deviceregister.b.b r0 = com.p683ss.android.deviceregister.p1155b.C19026b.this
                java.lang.Object r0 = r0.f52377d
                monitor-enter(r0)
                int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r2 <= 0) goto L_0x00b7
                boolean r2 = com.p683ss.android.deviceregister.p1155b.C19026b.f52373r     // Catch:{ InterruptedException -> 0x00b7 }
                if (r2 == 0) goto L_0x00ad
                monitor-exit(r0)     // Catch:{ all -> 0x00b5 }
                return
            L_0x00ad:
                com.ss.android.deviceregister.b.b r2 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ InterruptedException -> 0x00b7 }
                java.lang.Object r2 = r2.f52377d     // Catch:{ InterruptedException -> 0x00b7 }
                r2.wait(r4)     // Catch:{ InterruptedException -> 0x00b7 }
                goto L_0x00b7
            L_0x00b5:
                r1 = move-exception
                goto L_0x00c3
            L_0x00b7:
                boolean r2 = com.p683ss.android.deviceregister.p1155b.C19026b.f52373r     // Catch:{ all -> 0x00b5 }
                if (r2 == 0) goto L_0x00bd
                monitor-exit(r0)     // Catch:{ all -> 0x00b5 }
                return
            L_0x00bd:
                monitor-exit(r0)     // Catch:{ all -> 0x00b5 }
                r14.mo38888a()
                goto L_0x0036
            L_0x00c3:
                monitor-exit(r0)     // Catch:{ all -> 0x00b5 }
                throw r1
            L_0x00c5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.deviceregister.p1155b.C19026b.C19027a.run():void");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:51|52|53|54|55|56|57) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00e1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0126 */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0130 A[Catch:{ Exception -> 0x0143 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38888a() {
            /*
                r6 = this;
                boolean r0 = com.p683ss.android.deviceregister.p1155b.C19026b.f52371g
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                com.ss.android.deviceregister.b.b r0 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Exception -> 0x0143 }
                long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0143 }
                r0.f52384o = r1     // Catch:{ Exception -> 0x0143 }
                com.ss.android.deviceregister.b.b r0 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Exception -> 0x0143 }
                android.content.Context r0 = r0.f52380j     // Catch:{ Exception -> 0x0143 }
                boolean r0 = com.p683ss.android.deviceregister.p1155b.C19028c.m46294a(r0)     // Catch:{ Exception -> 0x0143 }
                if (r0 != 0) goto L_0x0018
                return
            L_0x0018:
                com.ss.android.deviceregister.b.b r0 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Exception -> 0x0143 }
                android.content.Context r0 = r0.f52380j     // Catch:{ Exception -> 0x0143 }
                java.lang.String r0 = com.p683ss.android.deviceregister.p1154a.C19005d.m46187b(r0)     // Catch:{ Exception -> 0x0143 }
                boolean r1 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ Exception -> 0x0143 }
                if (r1 != 0) goto L_0x002f
                com.ss.android.deviceregister.b.b r1 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Exception -> 0x0143 }
                org.json.JSONObject r1 = r1.f52382l     // Catch:{ Exception -> 0x0143 }
                java.lang.String r2 = "user_agent"
                r1.put(r2, r0)     // Catch:{ Exception -> 0x0143 }
            L_0x002f:
                com.ss.android.deviceregister.b.b r0 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Exception -> 0x0143 }
                java.lang.String r0 = r0.f52387s     // Catch:{ Exception -> 0x0143 }
                boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ Exception -> 0x0143 }
                if (r0 != 0) goto L_0x0046
                com.ss.android.deviceregister.b.b r0 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Exception -> 0x0143 }
                org.json.JSONObject r0 = r0.f52382l     // Catch:{ Exception -> 0x0143 }
                java.lang.String r1 = "app_track"
                com.ss.android.deviceregister.b.b r2 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Exception -> 0x0143 }
                java.lang.String r2 = r2.f52387s     // Catch:{ Exception -> 0x0143 }
                r0.put(r1, r2)     // Catch:{ Exception -> 0x0143 }
            L_0x0046:
                com.ss.android.deviceregister.j r0 = com.p683ss.android.deviceregister.C19047j.m46366a()     // Catch:{ Exception -> 0x0143 }
                int r1 = r6.f52391c     // Catch:{ Exception -> 0x0143 }
                r0.mo38924a(r1)     // Catch:{ Exception -> 0x0143 }
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0143 }
                org.json.JSONTokener r1 = new org.json.JSONTokener     // Catch:{ Exception -> 0x0143 }
                com.ss.android.deviceregister.b.b r2 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Exception -> 0x0143 }
                org.json.JSONObject r2 = r2.f52382l     // Catch:{ Exception -> 0x0143 }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0143 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x0143 }
                r0.<init>(r1)     // Catch:{ Exception -> 0x0143 }
                android.os.Bundle r1 = new android.os.Bundle     // Catch:{ Throwable -> 0x00e1 }
                r1.<init>()     // Catch:{ Throwable -> 0x00e1 }
                android.os.Bundle r2 = com.p683ss.android.deviceregister.p1155b.C19026b.f52369e     // Catch:{ Throwable -> 0x00e1 }
                monitor-enter(r2)     // Catch:{ Throwable -> 0x00e1 }
                android.os.Bundle r3 = com.p683ss.android.deviceregister.p1155b.C19026b.f52369e     // Catch:{ all -> 0x00de }
                r1.putAll(r3)     // Catch:{ all -> 0x00de }
                monitor-exit(r2)     // Catch:{ all -> 0x00de }
                int r2 = r1.size()     // Catch:{ Throwable -> 0x00e1 }
                if (r2 <= 0) goto L_0x009b
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00e1 }
                r2.<init>()     // Catch:{ Throwable -> 0x00e1 }
                java.util.Set r3 = r1.keySet()     // Catch:{ Throwable -> 0x00e1 }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ Throwable -> 0x00e1 }
            L_0x0082:
                boolean r4 = r3.hasNext()     // Catch:{ Throwable -> 0x00e1 }
                if (r4 == 0) goto L_0x0096
                java.lang.Object r4 = r3.next()     // Catch:{ Throwable -> 0x00e1 }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x00e1 }
                java.lang.Object r5 = r1.get(r4)     // Catch:{ Throwable -> 0x00e1 }
                r2.put(r4, r5)     // Catch:{ Throwable -> 0x00e1 }
                goto L_0x0082
            L_0x0096:
                java.lang.String r1 = "custom"
                r0.put(r1, r2)     // Catch:{ Throwable -> 0x00e1 }
            L_0x009b:
                r1 = 0
                boolean r2 = com.p683ss.android.deviceregister.C19034d.m46327f()     // Catch:{ Throwable -> 0x00e1 }
                if (r2 == 0) goto L_0x00aa
                com.ss.android.deviceregister.b.b r1 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Throwable -> 0x00e1 }
                android.content.Context r1 = r1.f52380j     // Catch:{ Throwable -> 0x00e1 }
                java.lang.String r1 = com.p683ss.android.deviceregister.p1158c.C19031b.m46309c(r1)     // Catch:{ Throwable -> 0x00e1 }
            L_0x00aa:
                boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r1)     // Catch:{ Throwable -> 0x00e1 }
                if (r2 == 0) goto L_0x00b4
                java.lang.String r1 = com.p683ss.android.C18841b.m45928a()     // Catch:{ Throwable -> 0x00e1 }
            L_0x00b4:
                java.lang.String r2 = com.p683ss.android.C18841b.m45929b()     // Catch:{ Throwable -> 0x00e1 }
                java.lang.String r3 = com.p683ss.android.C18841b.m45930c()     // Catch:{ Throwable -> 0x00e1 }
                boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r1)     // Catch:{ Throwable -> 0x00e1 }
                if (r4 != 0) goto L_0x00c7
                java.lang.String r4 = "google_aid"
                r0.put(r4, r1)     // Catch:{ Throwable -> 0x00e1 }
            L_0x00c7:
                boolean r1 = com.bytedance.common.utility.C9431p.m18664a(r2)     // Catch:{ Throwable -> 0x00e1 }
                if (r1 != 0) goto L_0x00d2
                java.lang.String r1 = "app_language"
                r0.put(r1, r2)     // Catch:{ Throwable -> 0x00e1 }
            L_0x00d2:
                boolean r1 = com.bytedance.common.utility.C9431p.m18664a(r3)     // Catch:{ Throwable -> 0x00e1 }
                if (r1 != 0) goto L_0x00e1
                java.lang.String r1 = "app_region"
                r0.put(r1, r3)     // Catch:{ Throwable -> 0x00e1 }
                goto L_0x00e1
            L_0x00de:
                r1 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x00de }
                throw r1     // Catch:{ Throwable -> 0x00e1 }
            L_0x00e1:
                com.p683ss.android.deviceregister.p1154a.C19005d.m46182a(r0)     // Catch:{ Exception -> 0x0143 }
                com.ss.android.deviceregister.j r1 = com.p683ss.android.deviceregister.C19047j.m46366a()     // Catch:{ Exception -> 0x0143 }
                int r2 = r6.f52391c     // Catch:{ Exception -> 0x0143 }
                r1.mo38930b(r2)     // Catch:{ Exception -> 0x0143 }
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0143 }
                r1.<init>()     // Catch:{ Exception -> 0x0143 }
                java.lang.String r2 = "magic_tag"
                java.lang.String r3 = "ss_app_log"
                r1.put(r2, r3)     // Catch:{ Exception -> 0x0143 }
                java.lang.String r2 = "header"
                r1.put(r2, r0)     // Catch:{ Exception -> 0x0143 }
                java.lang.String r0 = "_gen_time"
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0143 }
                r1.put(r0, r2)     // Catch:{ Exception -> 0x0143 }
                r0 = 1
                com.p683ss.android.deviceregister.p1155b.C19026b.f52371g = r0     // Catch:{ Exception -> 0x0143 }
                java.lang.ThreadLocal<java.lang.Boolean> r2 = com.p683ss.android.deviceregister.p1155b.C19026b.f52375v     // Catch:{ Exception -> 0x0143 }
                java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0143 }
                r2.set(r3)     // Catch:{ Exception -> 0x0143 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0143 }
                int r2 = r6.f52391c     // Catch:{ Exception -> 0x0143 }
                boolean r1 = r6.m46291b(r1, r2)     // Catch:{ Exception -> 0x0143 }
                java.lang.Object r2 = com.p683ss.android.deviceregister.p1155b.C19026b.f52367b     // Catch:{ Exception -> 0x0143 }
                monitor-enter(r2)     // Catch:{ Exception -> 0x0143 }
                r3 = 0
                com.p683ss.android.deviceregister.p1155b.C19026b.f52371g = r3     // Catch:{ all -> 0x0140 }
                java.lang.Object r4 = com.p683ss.android.deviceregister.p1155b.C19026b.f52367b     // Catch:{ Exception -> 0x0126 }
                r4.notifyAll()     // Catch:{ Exception -> 0x0126 }
            L_0x0126:
                monitor-exit(r2)     // Catch:{ all -> 0x0140 }
                com.p683ss.android.deviceregister.p1155b.C19026b.f52370f = r0     // Catch:{ Exception -> 0x0143 }
                java.lang.ThreadLocal<java.lang.Boolean> r0 = com.p683ss.android.deviceregister.p1155b.C19026b.f52375v     // Catch:{ Exception -> 0x0143 }
                r0.remove()     // Catch:{ Exception -> 0x0143 }
                if (r1 != 0) goto L_0x013f
                com.ss.android.deviceregister.b.b r0 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Exception -> 0x0143 }
                com.ss.android.deviceregister.b.a.a r0 = r0.f52379i     // Catch:{ Exception -> 0x0143 }
                java.lang.String r0 = r0.mo38860e()     // Catch:{ Exception -> 0x0143 }
                boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ Exception -> 0x0143 }
                com.p683ss.android.deviceregister.p1155b.C19026b.m46283a(r3, r0)     // Catch:{ Exception -> 0x0143 }
            L_0x013f:
                return
            L_0x0140:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0140 }
                throw r0     // Catch:{ Exception -> 0x0143 }
            L_0x0143:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.deviceregister.p1155b.C19026b.C19027a.mo38888a():void");
        }

        public C19027a(int i) {
            super("DeviceRegisterThread");
            this.f52391c = i;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(13:106|(1:108)(1:109)|110|(1:113)|(1:123)(3:117|(2:119|120)|121)|(3:125|126|(3:128|(8:130|131|(1:133)|134|(1:136)|137|(2:139|(1:143))|144)|145))|(2:148|149)|150|151|(1:153)|154|155|156) */
        /* JADX WARNING: Code restructure failed: missing block: B:162:0x03f2, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x03f3, code lost:
            com.p683ss.android.deviceregister.C19047j.m46366a().mo38925a(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x03fa, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0135, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0137, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0139, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x013a, code lost:
            r3 = r11;
            r24 = r12;
            r25 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x013f, code lost:
            r10 = r3;
            r20 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0142, code lost:
            r17 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0146, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0147, code lost:
            r3 = r11;
            r24 = r12;
            r25 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x01d8, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x020a, code lost:
            r17 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x020e, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x020f, code lost:
            r10 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x0212, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x0213, code lost:
            r10 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x0215, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x0216, code lost:
            r3 = r11;
            r24 = r12;
            r25 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x021b, code lost:
            r10 = r3;
            r20 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x0220, code lost:
            if (r20 > 0) goto L_0x0222;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
            com.p683ss.android.deviceregister.C19047j.m46366a().mo38926a(r5, java.lang.Long.valueOf(r20), java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis()), r10, r27, r0, r0.getMessage(), java.lang.Integer.valueOf(r24));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x0243, code lost:
            if ((r0 instanceof com.bytedance.common.utility.C9374b) != false) goto L_0x0245;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0245, code lost:
            r3 = ((com.bytedance.common.utility.C9374b) r0).getResponseCode();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0258, code lost:
            r3 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x025a, code lost:
            r3 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x025b, code lost:
            if (r3 == false) goto L_0x025e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x025e, code lost:
            throw r0;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:150:0x03c5 */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x026f A[Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:153:0x03ca A[Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:162:0x03f2 A[ExcHandler: all (r0v6 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:18:0x00b7] */
        /* JADX WARNING: Removed duplicated region for block: B:172:0x025e A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0159 A[SYNTHETIC, Splitter:B:55:0x0159] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0222 A[SYNTHETIC, Splitter:B:84:0x0222] */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0245 A[Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x025d A[Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38889a(java.lang.String r27, int r28) {
            /*
                r26 = this;
                r1 = r26
                java.lang.String[] r0 = com.p683ss.android.deviceregister.p1155b.C19008a.f52335a
                r2 = 0
                r3 = 1
                if (r0 == 0) goto L_0x001a
                java.lang.String[] r0 = com.p683ss.android.deviceregister.p1155b.C19008a.f52335a
                int r0 = r0.length
                if (r0 <= 0) goto L_0x001a
                java.lang.String[] r0 = com.p683ss.android.deviceregister.p1155b.C19008a.f52335a
                r0 = r0[r2]
                boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r0)
                if (r0 != 0) goto L_0x001a
                java.lang.String[] r0 = com.p683ss.android.deviceregister.p1155b.C19008a.f52335a
                goto L_0x004b
            L_0x001a:
                r0 = 2
                java.lang.String[] r0 = new java.lang.String[r0]
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "https://"
                r4.<init>(r5)
                java.lang.String r5 = com.p683ss.android.deviceregister.p1155b.C19008a.f52338d
                r4.append(r5)
                java.lang.String r5 = "/service/2/device_register/"
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r0[r2] = r4
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "https://"
                r4.<init>(r5)
                java.lang.String r5 = com.p683ss.android.deviceregister.p1155b.C19008a.f52338d
                r4.append(r5)
                java.lang.String r5 = "/service/2/device_register/"
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r0[r3] = r4
            L_0x004b:
                r4 = r0
                if (r4 != 0) goto L_0x0050
                r0 = 0
                goto L_0x0051
            L_0x0050:
                int r0 = r4.length
            L_0x0051:
                com.ss.android.deviceregister.j r5 = com.p683ss.android.deviceregister.C19047j.m46366a()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r7 = "maxTryTimes="
                r6.<init>(r7)
                r6.append(r0)
                java.util.Map<java.lang.Integer, com.ss.android.deviceregister.h$b> r6 = r5.f52478f
                java.lang.Integer r7 = java.lang.Integer.valueOf(r28)
                java.lang.Object r6 = r6.get(r7)
                com.ss.android.deviceregister.h$b r6 = (com.p683ss.android.deviceregister.C19039h.C19043b) r6
                if (r6 == 0) goto L_0x00af
                com.ss.android.deviceregister.h$b r0 = r6.mo38904a(r0)
                java.util.concurrent.atomic.AtomicLong r7 = r5.f52473a
                long r7 = r7.get()
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                com.ss.android.deviceregister.h$b r0 = r0.mo38912e(r7)
                java.util.concurrent.atomic.AtomicLong r7 = r5.f52474b
                long r7 = r7.get()
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                com.ss.android.deviceregister.h$b r0 = r0.mo38913f(r7)
                java.util.concurrent.atomic.AtomicReference<java.lang.String> r5 = r5.f52475c
                java.lang.Object r5 = r5.get()
                java.lang.String r5 = (java.lang.String) r5
                r0.mo38906a(r5)
                java.lang.String r0 = r6.f52441a
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x00af
                com.ss.android.deviceregister.o r0 = com.p683ss.android.deviceregister.C19059m.m46390a()
                com.ss.android.deviceregister.h r5 = r6.mo38907a()
                r0.mo38938a(r5)
            L_0x00af:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r28)
                java.lang.String r0 = "UTF-8"
                r15 = r27
                byte[] r16 = r15.getBytes(r0)     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                com.ss.android.deviceregister.b.b r0 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                long r8 = r0.f52385p     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                r0 = 0
                long r8 = r6 - r8
                r10 = 600000(0x927c0, double:2.964394E-318)
                int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r0 >= 0) goto L_0x00cf
                r14 = 1
                goto L_0x00d0
            L_0x00cf:
                r14 = 0
            L_0x00d0:
                com.ss.android.deviceregister.b.b r0 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                r0.f52385p = r6     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                if (r4 == 0) goto L_0x03ea
                r13 = 0
                r17 = r13
                r12 = 0
            L_0x00da:
                int r0 = r4.length     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                if (r12 >= r0) goto L_0x026b
                r0 = r4[r12]     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                java.lang.Object r6 = r16.clone()     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                byte[] r6 = (byte[]) r6     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                boolean r7 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                if (r7 != 0) goto L_0x025f
                com.ss.android.deviceregister.b.b r7 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                android.content.Context r7 = r7.f52380j     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                java.lang.String r0 = com.p683ss.android.p1167g.C19165d.m46728a(r7, r0)     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                java.lang.String r11 = com.p683ss.android.common.applog.NetUtil.addCommonParams(r0, r3)     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                r18 = 0
                boolean r0 = com.p683ss.android.deviceregister.p1155b.C19008a.m46194b()     // Catch:{ Throwable -> 0x0215, all -> 0x03f2 }
                if (r0 == 0) goto L_0x01be
                long r20 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0215, all -> 0x03f2 }
                com.ss.android.deviceregister.b.b r0 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ RuntimeException -> 0x0150 }
                android.content.Context r0 = r0.f52380j     // Catch:{ RuntimeException -> 0x0150 }
                java.lang.String r22 = com.p683ss.android.common.applog.NetUtil.sendEncryptLog(r11, r6, r0, r14)     // Catch:{ RuntimeException -> 0x0150 }
                com.ss.android.deviceregister.j r6 = com.p683ss.android.deviceregister.C19047j.m46366a()     // Catch:{ RuntimeException -> 0x0146, Throwable -> 0x0139, all -> 0x03f2 }
                java.lang.Long r8 = java.lang.Long.valueOf(r20)     // Catch:{ RuntimeException -> 0x0146, Throwable -> 0x0139, all -> 0x03f2 }
                long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ RuntimeException -> 0x0146, Throwable -> 0x0139, all -> 0x03f2 }
                java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ RuntimeException -> 0x0146, Throwable -> 0x0139, all -> 0x03f2 }
                r0 = 0
                r17 = 0
                java.lang.Integer r23 = java.lang.Integer.valueOf(r12)     // Catch:{ RuntimeException -> 0x0146, Throwable -> 0x0139, all -> 0x03f2 }
                r7 = r5
                r10 = r11
                r3 = r11
                r11 = r27
                r24 = r12
                r12 = r0
                r13 = r17
                r25 = r14
                r14 = r23
                r6.mo38926a(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ RuntimeException -> 0x0137, Throwable -> 0x0135, all -> 0x03f2 }
                goto L_0x020a
            L_0x0135:
                r0 = move-exception
                goto L_0x013f
            L_0x0137:
                r0 = move-exception
                goto L_0x014c
            L_0x0139:
                r0 = move-exception
                r3 = r11
                r24 = r12
                r25 = r14
            L_0x013f:
                r10 = r3
                r20 = r18
            L_0x0142:
                r17 = r22
                goto L_0x021e
            L_0x0146:
                r0 = move-exception
                r3 = r11
                r24 = r12
                r25 = r14
            L_0x014c:
                r12 = r0
                r17 = r22
                goto L_0x0157
            L_0x0150:
                r0 = move-exception
                r3 = r11
                r24 = r12
                r25 = r14
                r12 = r0
            L_0x0157:
                if (r25 == 0) goto L_0x016b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01d8, all -> 0x03f2 }
                r0.<init>()     // Catch:{ Throwable -> 0x01d8, all -> 0x03f2 }
                r0.append(r3)     // Catch:{ Throwable -> 0x01d8, all -> 0x03f2 }
                java.lang.String r6 = "&config_retry=b"
                r0.append(r6)     // Catch:{ Throwable -> 0x01d8, all -> 0x03f2 }
                java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x01d8, all -> 0x03f2 }
                r3 = r0
            L_0x016b:
                com.ss.android.deviceregister.j r6 = com.p683ss.android.deviceregister.C19047j.m46366a()     // Catch:{ Throwable -> 0x01d8, all -> 0x03f2 }
                java.lang.Long r8 = java.lang.Long.valueOf(r20)     // Catch:{ Throwable -> 0x01d8, all -> 0x03f2 }
                long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x01d8, all -> 0x03f2 }
                java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ Throwable -> 0x01d8, all -> 0x03f2 }
                java.lang.String r13 = r12.getMessage()     // Catch:{ Throwable -> 0x01d8, all -> 0x03f2 }
                java.lang.Integer r14 = java.lang.Integer.valueOf(r24)     // Catch:{ Throwable -> 0x01d8, all -> 0x03f2 }
                r7 = r5
                r10 = r3
                r11 = r27
                r6.mo38926a(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Throwable -> 0x01d8, all -> 0x03f2 }
                long r20 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x01d8, all -> 0x03f2 }
                com.bytedance.common.utility.k r6 = com.bytedance.common.utility.C9423k.m18637a()     // Catch:{ Throwable -> 0x0212, all -> 0x03f2 }
                r9 = 1
                java.lang.String r10 = "application/json; charset=utf-8"
                r11 = 0
                r7 = r3
                r8 = r16
                java.lang.String r22 = r6.mo17062a(r7, r8, r9, r10, r11)     // Catch:{ Throwable -> 0x0212, all -> 0x03f2 }
                com.ss.android.deviceregister.j r6 = com.p683ss.android.deviceregister.C19047j.m46366a()     // Catch:{ Throwable -> 0x020e, all -> 0x03f2 }
                java.lang.Long r8 = java.lang.Long.valueOf(r20)     // Catch:{ Throwable -> 0x020e, all -> 0x03f2 }
                long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x020e, all -> 0x03f2 }
                java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ Throwable -> 0x020e, all -> 0x03f2 }
                r12 = 0
                r13 = 0
                java.lang.Integer r14 = java.lang.Integer.valueOf(r24)     // Catch:{ Throwable -> 0x020e, all -> 0x03f2 }
                r7 = r5
                r10 = r3
                r11 = r27
                r6.mo38926a(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Throwable -> 0x020e, all -> 0x03f2 }
                r0 = r22
                goto L_0x026d
            L_0x01be:
                r3 = r11
                r24 = r12
                r25 = r14
                if (r25 == 0) goto L_0x01da
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01d8, all -> 0x03f2 }
                r0.<init>()     // Catch:{ Throwable -> 0x01d8, all -> 0x03f2 }
                r0.append(r3)     // Catch:{ Throwable -> 0x01d8, all -> 0x03f2 }
                java.lang.String r6 = "&config_retry=b"
                r0.append(r6)     // Catch:{ Throwable -> 0x01d8, all -> 0x03f2 }
                java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x01d8, all -> 0x03f2 }
                r3 = r0
                goto L_0x01da
            L_0x01d8:
                r0 = move-exception
                goto L_0x021b
            L_0x01da:
                long r20 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x01d8, all -> 0x03f2 }
                com.bytedance.common.utility.k r6 = com.bytedance.common.utility.C9423k.m18637a()     // Catch:{ Throwable -> 0x0212, all -> 0x03f2 }
                r9 = 1
                java.lang.String r10 = "application/json; charset=utf-8"
                r11 = 0
                r7 = r3
                r8 = r16
                java.lang.String r22 = r6.mo17062a(r7, r8, r9, r10, r11)     // Catch:{ Throwable -> 0x0212, all -> 0x03f2 }
                com.ss.android.deviceregister.j r6 = com.p683ss.android.deviceregister.C19047j.m46366a()     // Catch:{ Throwable -> 0x020e, all -> 0x03f2 }
                java.lang.Long r8 = java.lang.Long.valueOf(r20)     // Catch:{ Throwable -> 0x020e, all -> 0x03f2 }
                long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x020e, all -> 0x03f2 }
                java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ Throwable -> 0x020e, all -> 0x03f2 }
                r12 = 0
                r13 = 0
                java.lang.Integer r14 = java.lang.Integer.valueOf(r24)     // Catch:{ Throwable -> 0x020e, all -> 0x03f2 }
                r7 = r5
                r10 = r3
                r11 = r27
                r6.mo38926a(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Throwable -> 0x020e, all -> 0x03f2 }
            L_0x020a:
                r17 = r22
                goto L_0x026b
            L_0x020e:
                r0 = move-exception
                r10 = r3
                goto L_0x0142
            L_0x0212:
                r0 = move-exception
                r10 = r3
                goto L_0x021e
            L_0x0215:
                r0 = move-exception
                r3 = r11
                r24 = r12
                r25 = r14
            L_0x021b:
                r10 = r3
                r20 = r18
            L_0x021e:
                int r3 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
                if (r3 <= 0) goto L_0x0241
                com.ss.android.deviceregister.j r6 = com.p683ss.android.deviceregister.C19047j.m46366a()     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                java.lang.Long r8 = java.lang.Long.valueOf(r20)     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                long r11 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                java.lang.Long r9 = java.lang.Long.valueOf(r11)     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                java.lang.String r13 = r0.getMessage()     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                java.lang.Integer r14 = java.lang.Integer.valueOf(r24)     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                r7 = r5
                r11 = r27
                r12 = r0
                r6.mo38926a(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
            L_0x0241:
                boolean r3 = r0 instanceof com.bytedance.common.utility.C9374b     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                if (r3 == 0) goto L_0x025a
                r3 = r0
                com.bytedance.common.utility.b r3 = (com.bytedance.common.utility.C9374b) r3     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                int r3 = r3.getResponseCode()     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                r6 = 200(0xc8, float:2.8E-43)
                if (r3 < r6) goto L_0x025a
                r6 = 301(0x12d, float:4.22E-43)
                if (r3 == r6) goto L_0x025a
                r6 = 302(0x12e, float:4.23E-43)
                if (r3 == r6) goto L_0x025a
                r3 = 0
                goto L_0x025b
            L_0x025a:
                r3 = 1
            L_0x025b:
                if (r3 == 0) goto L_0x025e
                goto L_0x0263
            L_0x025e:
                throw r0     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
            L_0x025f:
                r24 = r12
                r25 = r14
            L_0x0263:
                int r12 = r24 + 1
                r14 = r25
                r3 = 1
                r13 = 0
                goto L_0x00da
            L_0x026b:
                r0 = r17
            L_0x026d:
                if (r0 == 0) goto L_0x03e2
                int r3 = r0.length()     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                if (r3 != 0) goto L_0x0277
                goto L_0x03e2
            L_0x0277:
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                r3.<init>(r0)     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                com.ss.android.deviceregister.b.b r0 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                int r4 = com.p683ss.android.deviceregister.p1154a.C19005d.m46188c()     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                r0.f52378h = r4     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                java.lang.String r0 = "new_user"
                int r0 = r3.optInt(r0, r2)     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                if (r0 <= 0) goto L_0x028e
                r0 = 1
                goto L_0x028f
            L_0x028e:
                r0 = 0
            L_0x028f:
                com.p683ss.android.deviceregister.p1155b.C19026b.f52376w = r0     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                com.ss.android.deviceregister.b.b r0 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                android.content.SharedPreferences r0 = r0.f52381k     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                java.lang.String r4 = "last_config_version"
                com.ss.android.deviceregister.b.b r6 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                int r6 = r6.f52378h     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                r0.putInt(r4, r6)     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                com.ss.android.deviceregister.b.b r4 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                java.lang.String r4 = r4.f52386q     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                com.ss.android.deviceregister.b.b r6 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                com.ss.android.deviceregister.b.a.a r6 = r6.f52379i     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                java.lang.String r6 = r6.mo38860e()     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                boolean r7 = com.bytedance.common.utility.C9431p.m18664a(r6)     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                java.lang.String r8 = "install_id"
                r9 = 0
                java.lang.String r8 = r3.optString(r8, r9)     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                java.lang.String r10 = "device_id"
                java.lang.String r3 = r3.optString(r10, r9)     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                boolean r9 = com.p683ss.android.common.applog.NetUtil.isBadId(r3)     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                boolean r10 = com.p683ss.android.common.applog.NetUtil.isBadId(r8)     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                if (r9 != 0) goto L_0x02dc
                if (r10 != 0) goto L_0x02dc
                com.ss.android.deviceregister.b.b r11 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                r11.f52383n = r12     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                java.lang.String r11 = "last_config_time"
                com.ss.android.deviceregister.b.b r12 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                long r12 = r12.f52383n     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                r0.putLong(r11, r12)     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
            L_0x02dc:
                if (r10 != 0) goto L_0x0312
                com.ss.android.deviceregister.b.b r10 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                java.lang.String r10 = r10.f52386q     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                boolean r10 = r8.equals(r10)     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                if (r10 != 0) goto L_0x0312
                com.ss.android.deviceregister.b.b r10 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                r10.f52386q = r8     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                boolean r10 = com.bytedance.common.utility.C9431p.m18664a(r4)     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                if (r10 != 0) goto L_0x0310
                org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x0310 }
                r10.<init>()     // Catch:{ Exception -> 0x0310 }
                java.lang.String r11 = "old_id"
                r10.put(r11, r4)     // Catch:{ Exception -> 0x0310 }
                java.lang.String r4 = "new_id"
                r10.put(r4, r8)     // Catch:{ Exception -> 0x0310 }
                r11 = 0
                java.lang.String r12 = "umeng"
                java.lang.String r13 = "iid_change"
                r14 = 0
                r15 = 0
                r17 = 0
                r19 = r10
                com.p683ss.android.deviceregister.p1155b.C19026b.m46279a(r11, r12, r13, r14, r15, r17, r19)     // Catch:{ Exception -> 0x0310 }
            L_0x0310:
                r4 = 1
                goto L_0x0313
            L_0x0312:
                r4 = 0
            L_0x0313:
                if (r9 != 0) goto L_0x039f
                boolean r8 = r3.equals(r6)     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                if (r8 != 0) goto L_0x039f
                boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r6)     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                if (r4 != 0) goto L_0x039e
                com.ss.android.deviceregister.b.b r4 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Exception -> 0x039e }
                com.ss.android.deviceregister.b.a.a r4 = r4.f52379i     // Catch:{ Exception -> 0x039e }
                r8 = 1
                java.lang.String r4 = r4.mo38855a(r8)     // Catch:{ Exception -> 0x039e }
                com.ss.android.deviceregister.b.b r8 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Exception -> 0x039e }
                com.ss.android.deviceregister.b.a.a r8 = r8.f52379i     // Catch:{ Exception -> 0x039e }
                java.lang.String r8 = r8.mo38859d()     // Catch:{ Exception -> 0x039e }
                com.ss.android.deviceregister.b.b r9 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Exception -> 0x039e }
                com.ss.android.deviceregister.b.a.a r9 = r9.f52379i     // Catch:{ Exception -> 0x039e }
                java.lang.String r9 = r9.mo38854a()     // Catch:{ Exception -> 0x039e }
                com.ss.android.deviceregister.b.b r10 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Exception -> 0x039e }
                com.ss.android.deviceregister.b.a.a r10 = r10.f52379i     // Catch:{ Exception -> 0x039e }
                java.lang.String r10 = r10.mo38857b()     // Catch:{ Exception -> 0x039e }
                org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ Exception -> 0x039e }
                r15.<init>()     // Catch:{ Exception -> 0x039e }
                java.lang.String r11 = "old_id"
                r15.put(r11, r6)     // Catch:{ Exception -> 0x039e }
                java.lang.String r6 = "new_id"
                r15.put(r6, r3)     // Catch:{ Exception -> 0x039e }
                java.lang.String r6 = "openudid"
                r15.put(r6, r4)     // Catch:{ Exception -> 0x039e }
                java.lang.String r4 = "clientudid"
                r15.put(r4, r9)     // Catch:{ Exception -> 0x039e }
                boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r8)     // Catch:{ Exception -> 0x039e }
                if (r4 != 0) goto L_0x0366
                java.lang.String r4 = "udid"
                r15.put(r4, r8)     // Catch:{ Exception -> 0x039e }
            L_0x0366:
                boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r10)     // Catch:{ Exception -> 0x039e }
                if (r4 != 0) goto L_0x0371
                java.lang.String r4 = "serial_number"
                r15.put(r4, r10)     // Catch:{ Exception -> 0x039e }
            L_0x0371:
                boolean r4 = com.p683ss.android.deviceregister.p1154a.C19005d.m46191f()     // Catch:{ Exception -> 0x039e }
                if (r4 == 0) goto L_0x038d
                com.ss.android.deviceregister.b.b r4 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Exception -> 0x039e }
                com.ss.android.deviceregister.b.a.a r4 = r4.f52379i     // Catch:{ Exception -> 0x039e }
                java.lang.String[] r4 = r4.mo38858c()     // Catch:{ Exception -> 0x039e }
                if (r4 == 0) goto L_0x038d
                int r6 = r4.length     // Catch:{ Exception -> 0x039e }
                if (r6 <= 0) goto L_0x038d
                java.lang.String r6 = "sim_serial_number"
                java.lang.String r4 = java.util.Arrays.toString(r4)     // Catch:{ Exception -> 0x039e }
                r15.put(r6, r4)     // Catch:{ Exception -> 0x039e }
            L_0x038d:
                r11 = 0
                java.lang.String r12 = "umeng"
                java.lang.String r13 = "did_change"
                r14 = 0
                r8 = 0
                r17 = 0
                r4 = r15
                r15 = r8
                r19 = r4
                com.p683ss.android.deviceregister.p1155b.C19026b.m46279a(r11, r12, r13, r14, r15, r17, r19)     // Catch:{ Exception -> 0x039e }
            L_0x039e:
                r4 = 1
            L_0x039f:
                if (r4 == 0) goto L_0x03c5
                com.ss.android.deviceregister.b.b r6 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Exception -> 0x03c5 }
                org.json.JSONObject r6 = r6.f52382l     // Catch:{ Exception -> 0x03c5 }
                java.lang.String r8 = "install_id"
                com.ss.android.deviceregister.b.b r9 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Exception -> 0x03c5 }
                java.lang.String r9 = r9.f52386q     // Catch:{ Exception -> 0x03c5 }
                r6.put(r8, r9)     // Catch:{ Exception -> 0x03c5 }
                com.ss.android.deviceregister.b.b r6 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Exception -> 0x03c5 }
                org.json.JSONObject r6 = r6.f52382l     // Catch:{ Exception -> 0x03c5 }
                java.lang.String r8 = "device_id"
                r6.put(r8, r3)     // Catch:{ Exception -> 0x03c5 }
                java.lang.String r6 = "install_id"
                com.ss.android.deviceregister.b.b r8 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Exception -> 0x03c5 }
                java.lang.String r8 = r8.f52386q     // Catch:{ Exception -> 0x03c5 }
                r0.putString(r6, r8)     // Catch:{ Exception -> 0x03c5 }
                java.lang.String r6 = "device_id"
                r0.putString(r6, r3)     // Catch:{ Exception -> 0x03c5 }
            L_0x03c5:
                r0.commit()     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                if (r4 == 0) goto L_0x03d6
                com.ss.android.deviceregister.b.b r0 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                com.ss.android.deviceregister.b.a.a r0 = r0.f52379i     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                r0.mo38856a(r3)     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                com.ss.android.deviceregister.b.b r0 = com.p683ss.android.deviceregister.p1155b.C19026b.this     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                r0.mo38887e()     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
            L_0x03d6:
                r3 = 1
                com.p683ss.android.deviceregister.p1155b.C19026b.m46283a(r3, r7)     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                com.ss.android.deviceregister.j r0 = com.p683ss.android.deviceregister.C19047j.m46366a()
                r0.mo38925a(r5)
                return r3
            L_0x03e2:
                com.ss.android.deviceregister.j r0 = com.p683ss.android.deviceregister.C19047j.m46366a()
                r0.mo38925a(r5)
                return r2
            L_0x03ea:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                java.lang.String r3 = "url is null"
                r0.<init>(r3)     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
                throw r0     // Catch:{ Throwable -> 0x03fb, all -> 0x03f2 }
            L_0x03f2:
                r0 = move-exception
                com.ss.android.deviceregister.j r2 = com.p683ss.android.deviceregister.C19047j.m46366a()
                r2.mo38925a(r5)
                throw r0
            L_0x03fb:
                com.ss.android.deviceregister.j r0 = com.p683ss.android.deviceregister.C19047j.m46366a()
                r0.mo38925a(r5)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.deviceregister.p1155b.C19026b.C19027a.mo38889a(java.lang.String, int):boolean");
        }
    }

    /* renamed from: b */
    public static void m46285b() {
        f52372m = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final String mo38883a() {
        return this.f52379i.mo38860e();
    }

    /* renamed from: c */
    public final String mo38885c() {
        return this.f52379i.mo38855a(true);
    }

    /* renamed from: d */
    public final String mo38886d() {
        return this.f52379i.mo38854a();
    }

    /* renamed from: e */
    public final void mo38887e() {
        m46282a("install_id", (Object) this.f52386q);
        m46282a("device_id", (Object) this.f52379i.mo38860e());
        int size = f52374u.size();
        for (int i = 0; i < size; i++) {
            WeakReference weakReference = (WeakReference) f52374u.get(i);
            if (weakReference != null) {
                C19035a aVar = (C19035a) weakReference.get();
                if (aVar != null) {
                    try {
                        aVar.onDeviceRegistrationInfoChanged(this.f52379i.mo38860e(), this.f52386q);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m46281a(C19035a aVar) {
        if (aVar != null) {
            f52374u.add(new WeakReference(aVar));
        }
    }

    /* renamed from: b */
    private static String m46284b(Context context) {
        try {
            return C19037f.m46331a(context).mo38860e();
        } catch (Exception unused) {
            return null;
        }
    }

    public C19026b(Context context) {
        this.f52380j = context;
        this.f52379i = C19037f.m46331a(context);
        this.f52381k = C19002a.m46174a(context);
    }

    /* renamed from: a */
    public static void m46278a(Context context) {
        if (f52375v.get() == null && C9431p.m18664a(m46284b(context))) {
            synchronized (f52367b) {
                if (!f52370f) {
                    if (C9431p.m18664a(m46284b(context))) {
                        long j = 1500;
                        if (f52371g) {
                            j = 4000;
                        }
                        try {
                            f52367b.wait(j);
                        } catch (Exception unused) {
                        }
                        f52370f = true;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m46280a(Bundle bundle) {
        if (bundle != null && bundle.size() > 0) {
            synchronized (f52369e) {
                f52369e.putAll(bundle);
            }
        }
    }

    /* renamed from: a */
    private static void m46282a(String str, Object obj) {
        if (str != null && obj != null) {
            if (C19005d.f52321k == null) {
                C19005d.f52321k = new ConcurrentHashMap<>();
            }
            C19005d.f52321k.put(str, obj);
        }
    }

    /* renamed from: a */
    public static void m46283a(boolean z, boolean z2) {
        int size = f52374u.size();
        for (int i = 0; i < size; i++) {
            WeakReference weakReference = (WeakReference) f52374u.get(i);
            if (weakReference != null) {
                C19035a aVar = (C19035a) weakReference.get();
                if (aVar != null) {
                    try {
                        aVar.onRemoteConfigUpdate(z, z2);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo38884a(Context context, String str) {
        if (!C9431p.m18664a(str)) {
            try {
                this.f52387s = str;
            } catch (Exception unused) {
            }
        }
        C19005d.m46180a(context, str);
    }

    /* renamed from: a */
    public static void m46279a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        if (f52368c != null) {
            f52368c.onDeviceRegisterEvent(null, str, str2, null, 0, 0, jSONObject);
        }
    }
}
