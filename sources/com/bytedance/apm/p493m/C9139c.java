package com.bytedance.apm.p493m;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.text.TextUtils;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p465a.p467b.C8914a;
import com.bytedance.apm.p478d.C9004c;
import com.bytedance.apm.p479e.C9011a;
import com.bytedance.apm.p480f.C9029e;
import com.bytedance.apm.p485h.C9042d;
import com.bytedance.apm.p485h.C9049k;
import com.bytedance.apm.p488k.C9074a;
import com.bytedance.apm.p488k.C9079d;
import com.bytedance.apm.p493m.p494a.C9129b;
import com.bytedance.apm.p493m.p494a.C9130c;
import com.bytedance.apm.p493m.p495b.C9132a;
import com.bytedance.apm.p493m.p495b.C9136b;
import com.bytedance.apm.p493m.p495b.C9137c;
import com.bytedance.apm.p497o.C9149b;
import com.bytedance.apm.p497o.C9149b.C9153b;
import com.bytedance.apm.p501q.C9185g;
import com.bytedance.apm.p501q.C9190h;
import com.bytedance.apm.p501q.C9193j;
import com.bytedance.frameworks.baselib.p565a.C9801d;
import com.bytedance.frameworks.core.apm.C9926a;
import com.bytedance.frameworks.core.apm.C9937b;
import com.bytedance.frameworks.core.apm.C9941c;
import com.bytedance.frameworks.core.apm.p578a.p579a.C9932a;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.bytedance.services.apm.api.C13220c;
import com.bytedance.services.apm.api.C13225h;
import com.bytedance.services.slardar.config.C13226a;
import com.bytedance.services.slardar.config.C13227b;
import com.p683ss.ttm.player.MediaPlayer;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.m.c */
public final class C9139c implements C9129b, C9136b, C9153b, C13220c, C13226a {

    /* renamed from: E */
    private static final List<String> f25011E = Arrays.asList(new String[]{"timer", "count", "disk", "memory", "cpu", "fps", "traffic", "start", "page_load", "image_monitor", "api_all", "api_error", "common_log", "service_monitor", "performance_monitor", "ui_action"});

    /* renamed from: F */
    private static final List<String> f25012F = Arrays.asList(new String[]{"block_monitor", "serious_block_monitor", "memory_object_monitor", "drop_frame_stack", "cpu_trace", "battery_trace"});

    /* renamed from: H */
    private static final List<String> f25013H = Arrays.asList(new String[]{"tracing"});

    /* renamed from: A */
    private C9132a f25014A;

    /* renamed from: B */
    private long f25015B;

    /* renamed from: C */
    private boolean f25016C;

    /* renamed from: D */
    private final List<String> f25017D;

    /* renamed from: G */
    private C9004c f25018G;

    /* renamed from: a */
    public List<String> f25019a;

    /* renamed from: b */
    public List<String> f25020b;

    /* renamed from: c */
    public long f25021c;

    /* renamed from: d */
    public List<C13227b> f25022d;

    /* renamed from: e */
    private long f25023e;

    /* renamed from: f */
    private long f25024f;

    /* renamed from: g */
    private long f25025g;

    /* renamed from: h */
    private volatile boolean f25026h;

    /* renamed from: i */
    private long f25027i;

    /* renamed from: j */
    private int f25028j;

    /* renamed from: k */
    private List<C9932a<? extends C9042d>> f25029k;

    /* renamed from: l */
    private volatile boolean f25030l;

    /* renamed from: m */
    private List<String> f25031m;

    /* renamed from: n */
    private int f25032n;

    /* renamed from: o */
    private long f25033o;

    /* renamed from: p */
    private boolean f25034p;

    /* renamed from: q */
    private boolean f25035q;

    /* renamed from: r */
    private long f25036r;

    /* renamed from: s */
    private long f25037s;

    /* renamed from: t */
    private int f25038t;

    /* renamed from: u */
    private int f25039u;

    /* renamed from: v */
    private volatile int f25040v;

    /* renamed from: w */
    private int f25041w;

    /* renamed from: x */
    private int f25042x;

    /* renamed from: y */
    private C9132a f25043y;

    /* renamed from: z */
    private C9132a f25044z;

    /* renamed from: com.bytedance.apm.m.c$a */
    static final class C9143a {

        /* renamed from: a */
        public static final C9139c f25050a = new C9139c();
    }

    /* renamed from: a */
    public static C9139c m18134a() {
        return C9143a.f25050a;
    }

    /* renamed from: b */
    public final int mo16494b() {
        return this.f25041w;
    }

    /* renamed from: c */
    public final int mo16495c() {
        return this.f25042x;
    }

    /* renamed from: c */
    public final void mo16273c(Activity activity) {
    }

    /* renamed from: d */
    public final long mo16496d() {
        return this.f25033o;
    }

    /* renamed from: d */
    public final void mo16274d(Activity activity) {
    }

    /* renamed from: a */
    public final void mo16358a(long j) {
        if (this.f25037s > 0 && j - this.f25036r > this.f25037s) {
            this.f25030l = false;
            C9029e.m17898a().f24628a = false;
            mo16511a(true, 0);
        }
        mo16510a(false);
    }

    /* renamed from: a */
    public final List<String> mo16493a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "monitor")) {
            return this.f25019a;
        }
        if (TextUtils.equals(str, "exception")) {
            return this.f25020b;
        }
        if (TextUtils.equals(str, "tracing")) {
            return this.f25031m;
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    public final void mo16510a(boolean z) {
        if (this.f25026h && this.f25032n == 1 && this.f25040v >= 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f25021c <= 0 || currentTimeMillis - C8976c.m17756l() >= this.f25021c * 1000) {
                this.f25015B = m18145i();
                if (this.f25015B > 0) {
                    if (z || this.f25015B > ((long) this.f25028j) || currentTimeMillis - this.f25027i > ((long) (this.f25040v * 1000))) {
                        if (C8976c.m17751g()) {
                            StringBuilder sb = new StringBuilder("packAndSendLog, case: count > threshold ? count -> ");
                            sb.append(this.f25015B);
                            sb.append(" threshold-> ");
                            sb.append(this.f25028j);
                            sb.append(" , passedTime: ");
                            sb.append((currentTimeMillis - this.f25027i) / 1000);
                            sb.append(" 秒，interval: ");
                            sb.append(this.f25040v);
                            String[] strArr = {sb.toString()};
                        }
                        this.f25027i = currentTimeMillis;
                        m18143g();
                        for (String str : this.f25017D) {
                            m18137a(str, m18141b(str), this.f25028j);
                        }
                    }
                    return;
                }
                return;
            }
            this.f25021c = -1;
        }
    }

    /* renamed from: a */
    public final boolean mo16512a(C9042d dVar) {
        try {
            String c = m18142c(dVar.f24682g);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            if (dVar.f24682g.equals("timer")) {
                jSONArray.put(dVar.f24684i);
            } else {
                jSONArray2.put(dVar.f24684i);
            }
            return m18140a(c, jSONArray2, jSONArray, dVar.f24685j, false, true);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo16509a(C9049k kVar) {
        int i;
        int i2;
        JSONArray jSONArray;
        C9042d dVar;
        C9049k kVar2 = kVar;
        if (ApmDelegate.m17947a().f24750j) {
            try {
                long j = kVar2.f24717a;
                long j2 = kVar2.f24718b;
                List<String> list = kVar2.f24719c;
                HashMap hashMap = new HashMap(2);
                if (!C9190h.m18253a(list)) {
                    for (String str : list) {
                        String c = m18142c(str);
                        if (!TextUtils.isEmpty(c)) {
                            if (hashMap.containsKey(c)) {
                                List list2 = (List) hashMap.get(c);
                                if (list2 != null) {
                                    list2.add(str);
                                }
                                hashMap.put(c, list2);
                            } else {
                                ArrayList arrayList = new ArrayList(8);
                                arrayList.add(str);
                                hashMap.put(c, arrayList);
                            }
                        }
                    }
                } else if (this.f25017D != null) {
                    for (String str2 : this.f25017D) {
                        hashMap.put(str2, m18141b(str2));
                    }
                } else {
                    return;
                }
                int i3 = 0;
                for (Entry entry : hashMap.entrySet()) {
                    List list3 = (List) entry.getValue();
                    String str3 = (String) entry.getKey();
                    int i4 = i3;
                    while (true) {
                        i = i4;
                        List<C9042d> a = m18135a(j, j2, list3, i4, (int) MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL);
                        if (!C9190h.m18253a(a)) {
                            i2 = a.size();
                            JSONArray jSONArray2 = new JSONArray();
                            LinkedList linkedList = new LinkedList();
                            JSONArray jSONArray3 = jSONArray2;
                            long j3 = -1;
                            for (C9042d dVar2 : a) {
                                try {
                                    if (j3 == -1) {
                                        j3 = dVar2.f24685j;
                                    } else if (dVar2.f24685j != j3) {
                                        C9042d dVar3 = dVar2;
                                        LinkedList linkedList2 = linkedList;
                                        try {
                                            if (m18139a(str3, jSONArray3, (JSONArray) null, j3, true)) {
                                                m18133a((List<? extends C9042d>) linkedList2);
                                                linkedList2.clear();
                                            }
                                            dVar = dVar3;
                                            long j4 = dVar.f24685j;
                                            try {
                                                jSONArray = new JSONArray();
                                                j3 = j4;
                                                linkedList = linkedList2;
                                                linkedList.add(dVar);
                                                jSONArray.put(dVar.f24684i);
                                                jSONArray3 = jSONArray;
                                            } catch (Exception unused) {
                                                j3 = j4;
                                                linkedList = linkedList2;
                                            }
                                        } catch (Exception unused2) {
                                            linkedList = linkedList2;
                                        }
                                    }
                                    dVar = dVar2;
                                    jSONArray = jSONArray3;
                                    try {
                                        linkedList.add(dVar);
                                        jSONArray.put(dVar.f24684i);
                                    } catch (Exception unused3) {
                                    }
                                    jSONArray3 = jSONArray;
                                } catch (Exception unused4) {
                                }
                            }
                            LinkedList linkedList3 = linkedList;
                            boolean z = true;
                            if (m18139a(str3, jSONArray3, (JSONArray) null, j3, true) && m18133a((List<? extends C9042d>) linkedList3) > 0) {
                                z = false;
                            }
                            if (z) {
                                i += MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;
                            }
                        } else {
                            i2 = 0;
                        }
                        if (i2 != 400) {
                            break;
                        }
                        i4 = i;
                    }
                    i3 = i;
                }
            } catch (Throwable unused5) {
            }
        }
    }

    /* renamed from: a */
    public final void mo16511a(boolean z, long j) {
        this.f25026h = z;
        if (!z) {
            this.f25036r = System.currentTimeMillis();
            this.f25037s = j;
        }
    }

    /* renamed from: a */
    public final void mo16218a(Activity activity) {
        this.f25040v = this.f25039u;
        C9149b.m18170a().mo16524a((Runnable) new Runnable() {
            public final void run() {
                C9139c.this.mo16510a(true);
            }
        });
    }

    /* renamed from: a */
    public final void mo16270a(JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2;
        String str = "report_setting";
        JSONObject a = C9185g.m18234a(jSONObject, "general", "slardar_api_settings");
        if (a == null) {
            jSONObject2 = null;
        } else {
            jSONObject2 = a.optJSONObject(str);
        }
        if (jSONObject2 != null) {
            List<String> a2 = m18136a(jSONObject2.optJSONArray("hosts"));
            if (!C9190h.m18253a(a2)) {
                this.f25019a.clear();
                this.f25020b.clear();
                for (String str2 : a2) {
                    List<String> list = this.f25019a;
                    StringBuilder sb = new StringBuilder("https://");
                    sb.append(str2);
                    sb.append("/monitor/collect/");
                    list.add(sb.toString());
                    List<String> list2 = this.f25020b;
                    StringBuilder sb2 = new StringBuilder("https://");
                    sb2.append(str2);
                    sb2.append("/monitor/collect/c/exception");
                    list2.add(sb2.toString());
                    List<String> list3 = this.f25031m;
                    StringBuilder sb3 = new StringBuilder("https://");
                    sb3.append(str2);
                    sb3.append("/monitor/collect/c/trace_collect");
                    list3.add(sb3.toString());
                }
                C13225h hVar = new C13225h();
                hVar.f34491a = this.f25019a;
                ApmDelegate.m17947a().mo16429a(hVar);
                try {
                    String host = new URL((String) this.f25019a.get(0)).getHost();
                    C9126a.m18106a(host);
                    C8914a.m17637a(host);
                } catch (MalformedURLException unused) {
                }
                C9220a.m18314b((String) this.f25020b.get(0));
            }
            this.f25035q = jSONObject2.optBoolean("enable_encrypt", true);
            this.f25034p = jSONObject2.optBoolean("log_remove_switch", false);
            this.f25041w = jSONObject2.optInt("max_retry_count", 4);
            this.f25033o = jSONObject2.optLong("more_channel_stop_interval", 600);
            this.f25042x = jSONObject2.optInt("report_fail_base_time", 15);
            int optInt = jSONObject2.optInt("uploading_interval", 120);
            if (optInt <= 0) {
                optInt = 120;
            }
            this.f25038t = optInt;
            this.f25039u = jSONObject2.optInt("uploading_interval_background", this.f25038t);
            this.f25040v = this.f25038t;
            int optInt2 = jSONObject2.optInt("once_max_count", 100);
            if (optInt2 <= 0) {
                optInt2 = 100;
            }
            this.f25028j = optInt2;
            this.f25032n = jSONObject2.optInt("log_send_switch", 1);
            this.f25024f = jSONObject2.optLong("low_memory_threshold_kb", 20480) * 1024;
            this.f25024f = Math.min(this.f25024f, 134217728);
            long optLong = jSONObject2.optLong("once_max_size_kb", -1) * 1024;
            if (optLong < 0) {
                optLong = this.f25018G.f24516b;
            }
            this.f25023e = optLong;
            this.f25025g = jSONObject2.optLong("base_polling_interval_seconds", C9149b.f25064c / 1000) * 1000;
        }
    }

    /* renamed from: f */
    public final boolean mo16497f() {
        if (this.f25030l) {
            return this.f25030l;
        }
        return this.f25034p;
    }

    /* renamed from: h */
    private boolean m18144h() {
        if (this.f25018G == null || (this.f25018G.f24515a != 1 && this.f25018G.f24515a != 2)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private long m18145i() {
        Iterator it = this.f25029k.iterator();
        long j = 0;
        if (it == null) {
            return 0;
        }
        while (it.hasNext()) {
            C9932a aVar = (C9932a) it.next();
            if (aVar != null) {
                j += aVar.mo17897f();
            }
        }
        if (C8976c.m17751g()) {
            StringBuilder sb = new StringBuilder("getLogSampledCount: ");
            sb.append(j);
            String[] strArr = {sb.toString()};
        }
        return j;
    }

    private C9139c() {
        this.f25026h = true;
        this.f25028j = 100;
        this.f25019a = C9011a.f24570c;
        this.f25031m = C9011a.f24571d;
        this.f25020b = C9011a.f24573f;
        this.f25032n = 1;
        this.f25035q = true;
        this.f25017D = Arrays.asList(new String[]{"monitor", "exception", "tracing"});
        this.f25018G = C9004c.m17805a().mo16330a();
        try {
            this.f25029k = C9937b.m19972a().f27019a;
        } catch (SQLiteDatabaseLockedException e) {
            C9220a.m18312a((Throwable) e, "apm_LogReportManager");
        }
    }

    /* renamed from: e */
    public final void mo16224e() {
        C9137c.f25008b = this;
        this.f25043y = new C9132a("monitor");
        this.f25044z = new C9132a("exception");
        this.f25014A = new C9132a("tracing");
        C9137c.m18132a("monitor", this.f25043y);
        C9137c.m18132a("exception", this.f25044z);
        C9137c.m18132a("tracing", this.f25014A);
        C9149b a = C9149b.m18170a();
        try {
            if (a.f25067b) {
                a.f25071h.add(this);
                a.f25066a.mo16531b(a.f25069f);
                a.f25066a.mo16530a(a.f25069f, C9149b.f25065d);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00df A[SYNTHETIC, Splitter:B:56:0x00df] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e6 A[SYNTHETIC, Splitter:B:60:0x00e6] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ed A[SYNTHETIC, Splitter:B:67:0x00ed] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f4 A[SYNTHETIC, Splitter:B:71:0x00f4] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00fb A[SYNTHETIC, Splitter:B:78:0x00fb] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0102 A[SYNTHETIC, Splitter:B:82:0x0102] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m18143g() {
        /*
            r10 = this;
            boolean r0 = r10.f25016C
            if (r0 != 0) goto L_0x0106
            r0 = 1
            r10.f25016C = r0
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r3 = com.bytedance.apm.C8976c.f24423a
            if (r3 != 0) goto L_0x0018
            java.lang.String r3 = ""
            goto L_0x001e
        L_0x0018:
            android.content.Context r3 = com.bytedance.apm.C8976c.f24423a
            java.lang.String r3 = r3.getPackageName()
        L_0x001e:
            r2.append(r3)
            java.lang.String r3 = ".BuildConfig"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.util.List<java.lang.String> r3 = com.bytedance.apm.p487j.C9072a.f24791k
            java.util.Iterator r3 = r3.iterator()
        L_0x0030:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x005a
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            com.bytedance.common.utility.f.b r6 = com.bytedance.common.utility.p526f.C9409b.m18610a(r2)     // Catch:{ Exception | IllegalAccessException | NoSuchFieldError -> 0x0058 }
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ Exception | IllegalAccessException | NoSuchFieldError -> 0x0058 }
            r8 = 0
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r7[r8] = r9     // Catch:{ Exception | IllegalAccessException | NoSuchFieldError -> 0x0058 }
            java.lang.reflect.Field r6 = r6.mo17055b(r4, r7)     // Catch:{ Exception | IllegalAccessException | NoSuchFieldError -> 0x0058 }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ Exception | IllegalAccessException | NoSuchFieldError -> 0x0058 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception | IllegalAccessException | NoSuchFieldError -> 0x0058 }
            r1.put(r4, r5)     // Catch:{ Exception | IllegalAccessException | NoSuchFieldError -> 0x0058 }
            goto L_0x0030
        L_0x0058:
            goto L_0x0030
        L_0x005a:
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x006b
            org.json.JSONObject r0 = com.bytedance.apm.C8976c.m17753i()     // Catch:{ JSONException -> 0x006a }
            java.lang.String r2 = "test_build"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x006a }
            goto L_0x006b
        L_0x006a:
        L_0x006b:
            java.lang.String r0 = com.bytedance.apm.p487j.C9073b.m17972a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0076
            return
        L_0x0076:
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x00f8, Exception -> 0x00ea, all -> 0x00db }
            java.lang.String r1 = com.bytedance.apm.p487j.C9073b.m17972a()     // Catch:{ IOException -> 0x00f8, Exception -> 0x00ea, all -> 0x00db }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00f8, Exception -> 0x00ea, all -> 0x00db }
            boolean r1 = r0.exists()     // Catch:{ IOException -> 0x00f8, Exception -> 0x00ea, all -> 0x00db }
            if (r1 == 0) goto L_0x00cc
            long r1 = r0.length()     // Catch:{ IOException -> 0x00f8, Exception -> 0x00ea, all -> 0x00db }
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x00cc
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00f8, Exception -> 0x00ea, all -> 0x00db }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00f8, Exception -> 0x00ea, all -> 0x00db }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ca, Exception -> 0x00c8, all -> 0x00c6 }
            r0.<init>()     // Catch:{ IOException -> 0x00ca, Exception -> 0x00c8, all -> 0x00c6 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00ca, Exception -> 0x00c8, all -> 0x00c6 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00ca, Exception -> 0x00c8, all -> 0x00c6 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x00ca, Exception -> 0x00c8, all -> 0x00c6 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x00ca, Exception -> 0x00c8, all -> 0x00c6 }
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x00c4, Exception -> 0x00c2, all -> 0x00bf }
        L_0x00a7:
            if (r3 == 0) goto L_0x00b1
            r0.append(r3)     // Catch:{ IOException -> 0x00c4, Exception -> 0x00c2, all -> 0x00bf }
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x00c4, Exception -> 0x00c2, all -> 0x00bf }
            goto L_0x00a7
        L_0x00b1:
            org.json.JSONObject r3 = com.bytedance.apm.C8976c.m17753i()     // Catch:{ IOException -> 0x00c4, Exception -> 0x00c2, all -> 0x00bf }
            java.lang.String r4 = "test_runtime"
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x00c4, Exception -> 0x00c2, all -> 0x00bf }
            r3.put(r4, r0)     // Catch:{ IOException -> 0x00c4, Exception -> 0x00c2, all -> 0x00bf }
            goto L_0x00ce
        L_0x00bf:
            r0 = move-exception
            r5 = r2
            goto L_0x00dd
        L_0x00c2:
            r5 = r2
            goto L_0x00eb
        L_0x00c4:
            r5 = r2
            goto L_0x00f9
        L_0x00c6:
            r0 = move-exception
            goto L_0x00dd
        L_0x00c8:
            goto L_0x00eb
        L_0x00ca:
            goto L_0x00f9
        L_0x00cc:
            r1 = r5
            r2 = r1
        L_0x00ce:
            if (r2 == 0) goto L_0x00d5
            r2.close()     // Catch:{ IOException -> 0x00d4 }
            goto L_0x00d5
        L_0x00d4:
        L_0x00d5:
            if (r1 == 0) goto L_0x0106
            r1.close()     // Catch:{ IOException -> 0x00da }
        L_0x00da:
            return
        L_0x00db:
            r0 = move-exception
            r1 = r5
        L_0x00dd:
            if (r5 == 0) goto L_0x00e4
            r5.close()     // Catch:{ IOException -> 0x00e3 }
            goto L_0x00e4
        L_0x00e3:
        L_0x00e4:
            if (r1 == 0) goto L_0x00e9
            r1.close()     // Catch:{ IOException -> 0x00e9 }
        L_0x00e9:
            throw r0
        L_0x00ea:
            r1 = r5
        L_0x00eb:
            if (r5 == 0) goto L_0x00f2
            r5.close()     // Catch:{ IOException -> 0x00f1 }
            goto L_0x00f2
        L_0x00f1:
        L_0x00f2:
            if (r1 == 0) goto L_0x0106
            r1.close()     // Catch:{ IOException -> 0x00f7 }
        L_0x00f7:
            return
        L_0x00f8:
            r1 = r5
        L_0x00f9:
            if (r5 == 0) goto L_0x0100
            r5.close()     // Catch:{ IOException -> 0x00ff }
            goto L_0x0100
        L_0x00ff:
        L_0x0100:
            if (r1 == 0) goto L_0x0106
            r1.close()     // Catch:{ IOException -> 0x0105 }
        L_0x0105:
            return
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p493m.C9139c.m18143g():void");
    }

    /* renamed from: b */
    public final void mo16221b(Activity activity) {
        this.f25040v = this.f25038t;
    }

    /* renamed from: a */
    private void m18138a(JSONObject jSONObject) {
        if (this.f25022d != null) {
            Iterator it = this.f25022d.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: c */
    private static String m18142c(String str) {
        if (f25012F.contains(str)) {
            return "exception";
        }
        if (f25013H.contains(str)) {
            return "tracing";
        }
        return "monitor";
    }

    /* renamed from: a */
    private static List<String> m18136a(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList(2);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String host = new URL(jSONArray.getString(i)).getHost();
                        if (!TextUtils.isEmpty(host) && host.indexOf(46) > 0) {
                            arrayList.add(host);
                        }
                    }
                    return arrayList;
                }
            } catch (MalformedURLException | JSONException unused) {
            }
        }
        return Collections.emptyList();
    }

    /* renamed from: b */
    private static List<String> m18141b(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "monitor")) {
            return f25011E;
        }
        if (TextUtils.equals(str, "exception")) {
            return f25012F;
        }
        if (TextUtils.equals(str, "tracing")) {
            return f25013H;
        }
        return null;
    }

    /* renamed from: a */
    private static int m18133a(List<? extends C9042d> list) {
        int i;
        if (C9190h.m18253a(list)) {
            return -1;
        }
        if (C8976c.m17751g()) {
            StringBuilder sb = new StringBuilder("need deleteUploadedLogs count: ");
            sb.append(list.size());
            String[] strArr = {sb.toString()};
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        for (C9042d dVar : list) {
            if (dVar != null) {
                if (TextUtils.equals(dVar.f24682g, "api_all")) {
                    linkedList.add(Long.valueOf(dVar.f24681f));
                } else {
                    linkedList2.add(Long.valueOf(dVar.f24681f));
                }
            }
        }
        if (!linkedList2.isEmpty()) {
            i = C9937b.m19972a().mo17903a("", linkedList2) + 0;
        } else {
            i = 0;
        }
        if (!linkedList.isEmpty()) {
            i += C9937b.m19972a().mo17903a("api_all", linkedList);
        }
        if (C8976c.m17751g()) {
            StringBuilder sb2 = new StringBuilder("finish deleteUploadedLogs count: ");
            sb2.append(i);
            String[] strArr2 = {sb2.toString()};
        }
        C9941c.m19976a();
        return i;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[ExcHandler: IOException | Throwable | JSONException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:26:0x010b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.apm.p493m.p495b.C9138d mo16508a(java.lang.String r5, byte[] r6) {
        /*
            r4 = this;
            com.bytedance.apm.m.b.d r0 = new com.bytedance.apm.m.b.d
            r0.<init>()
            if (r6 == 0) goto L_0x013c
            int r1 = r6.length
            if (r1 != 0) goto L_0x000c
            goto L_0x013c
        L_0x000c:
            com.bytedance.apm.m.d r1 = new com.bytedance.apm.m.d     // Catch:{  }
            r1.<init>(r5, r6)     // Catch:{  }
            boolean r5 = r4.f25035q     // Catch:{  }
            java.lang.String r6 = r1.f25051a     // Catch:{  }
            java.util.Map r2 = com.bytedance.apm.C8976c.m17752h()     // Catch:{  }
            java.lang.String r6 = com.bytedance.apm.p501q.C9202r.m18286a(r6, r2)     // Catch:{  }
            r1.f25051a = r6     // Catch:{  }
            java.lang.String r6 = r1.f25051a     // Catch:{  }
            byte[] r2 = r1.f25052b     // Catch:{  }
            java.lang.String r6 = com.bytedance.p582g.p583a.p584a.C9946b.m19986a(r6, r2)     // Catch:{  }
            r1.f25051a = r6     // Catch:{  }
            r1.mo16516a()     // Catch:{  }
            java.lang.String r6 = "application/json; charset=utf-8"
            if (r5 == 0) goto L_0x00c0
            com.bytedance.apm.internal.ApmDelegate r5 = com.bytedance.apm.internal.ApmDelegate.m17947a()     // Catch:{  }
            com.bytedance.services.apm.api.d r5 = r5.f24746f     // Catch:{  }
            byte[] r2 = r1.f25052b     // Catch:{  }
            byte[] r5 = r5.mo16335a(r2)     // Catch:{  }
            r1.f25052b = r5     // Catch:{  }
            byte[] r5 = r1.f25052b     // Catch:{  }
            if (r5 == 0) goto L_0x00aa
            java.net.URL r5 = new java.net.URL     // Catch:{  }
            java.lang.String r6 = r1.f25051a     // Catch:{  }
            r5.<init>(r6)     // Catch:{  }
            java.lang.String r5 = r5.getQuery()     // Catch:{  }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{  }
            if (r5 == 0) goto L_0x0073
            java.lang.String r5 = r1.f25051a     // Catch:{  }
            java.lang.String r6 = "?"
            boolean r5 = r5.endsWith(r6)     // Catch:{  }
            if (r5 != 0) goto L_0x0092
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{  }
            r5.<init>()     // Catch:{  }
            java.lang.String r6 = r1.f25051a     // Catch:{  }
            r5.append(r6)     // Catch:{  }
            java.lang.String r6 = "?"
            r5.append(r6)     // Catch:{  }
            java.lang.String r5 = r5.toString()     // Catch:{  }
            r1.f25051a = r5     // Catch:{  }
            goto L_0x0092
        L_0x0073:
            java.lang.String r5 = r1.f25051a     // Catch:{  }
            java.lang.String r6 = "&"
            boolean r5 = r5.endsWith(r6)     // Catch:{  }
            if (r5 != 0) goto L_0x0092
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{  }
            r5.<init>()     // Catch:{  }
            java.lang.String r6 = r1.f25051a     // Catch:{  }
            r5.append(r6)     // Catch:{  }
            java.lang.String r6 = "&"
            r5.append(r6)     // Catch:{  }
            java.lang.String r5 = r5.toString()     // Catch:{  }
            r1.f25051a = r5     // Catch:{  }
        L_0x0092:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{  }
            r5.<init>()     // Catch:{  }
            java.lang.String r6 = r1.f25051a     // Catch:{  }
            r5.append(r6)     // Catch:{  }
            java.lang.String r6 = "tt_data=a"
            r5.append(r6)     // Catch:{  }
            java.lang.String r5 = r5.toString()     // Catch:{  }
            r1.f25051a = r5     // Catch:{  }
            java.lang.String r5 = "application/octet-stream;tt-data=a"
            r6 = r5
        L_0x00aa:
            java.util.LinkedList r5 = new java.util.LinkedList     // Catch:{  }
            r5.<init>()     // Catch:{  }
            java.lang.String r2 = r1.f25051a     // Catch:{  }
            java.lang.String r2 = com.bytedance.frameworks.core.p577a.C9923a.m19898a(r2, r5)     // Catch:{  }
            r1.f25051a = r2     // Catch:{  }
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.f25053c     // Catch:{  }
            java.util.Map r5 = com.bytedance.apm.p501q.C9190h.m18255b(r5)     // Catch:{  }
            r2.putAll(r5)     // Catch:{  }
        L_0x00c0:
            java.util.Map<java.lang.String, java.lang.String> r5 = r1.f25053c     // Catch:{  }
            java.lang.String r2 = "Version-Code"
            java.lang.String r3 = "1"
            r5.put(r2, r3)     // Catch:{  }
            java.util.Map<java.lang.String, java.lang.String> r5 = r1.f25053c     // Catch:{  }
            java.lang.String r2 = "Content-Type"
            r5.put(r2, r6)     // Catch:{  }
            java.util.Map<java.lang.String, java.lang.String> r5 = r1.f25053c     // Catch:{  }
            java.lang.String r6 = "Accept-Encoding"
            java.lang.String r2 = "gzip"
            r5.put(r6, r2)     // Catch:{  }
            com.bytedance.apm.impl.a r5 = new com.bytedance.apm.impl.a     // Catch:{  }
            java.lang.String r6 = r1.f25051a     // Catch:{  }
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.f25053c     // Catch:{  }
            byte[] r1 = r1.f25052b     // Catch:{  }
            r5.<init>(r6, r2, r1)     // Catch:{  }
            java.lang.String r6 = r5.f24720a     // Catch:{  }
            byte[] r1 = r5.f24722c     // Catch:{  }
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f24721b     // Catch:{  }
            com.bytedance.services.apm.api.IHttpService r2 = com.bytedance.apm.C8976c.f24426d     // Catch:{  }
            com.bytedance.services.apm.api.b r5 = r2.doPost(r6, r1, r5)     // Catch:{  }
            if (r5 != 0) goto L_0x00f3
            return r0
        L_0x00f3:
            int r6 = r5.f34489a     // Catch:{  }
            r0.f25009a = r6     // Catch:{  }
            int r6 = r5.f34489a     // Catch:{  }
            r1 = 200(0xc8, float:2.8E-43)
            if (r6 != r1) goto L_0x013a
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{  }
            java.lang.String r1 = new java.lang.String     // Catch:{  }
            byte[] r5 = r5.f34490b     // Catch:{  }
            r1.<init>(r5)     // Catch:{  }
            r6.<init>(r1)     // Catch:{  }
            java.lang.String r5 = "data"
            java.lang.String r5 = r6.optString(r5)     // Catch:{ IOException | Throwable | JSONException -> 0x013b, IOException | Throwable | JSONException -> 0x013b }
            boolean r1 = r5.isEmpty()     // Catch:{ IOException | Throwable | JSONException -> 0x013b, IOException | Throwable | JSONException -> 0x013b }
            if (r1 != 0) goto L_0x0122
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ IOException | Throwable | JSONException -> 0x013b, IOException | Throwable | JSONException -> 0x013b }
            byte[] r5 = r5.getBytes()     // Catch:{ IOException | Throwable | JSONException -> 0x013b, IOException | Throwable | JSONException -> 0x013b }
            java.lang.String r5 = com.bytedance.apm.p501q.C9181c.m18226a(r5)     // Catch:{ IOException | Throwable | JSONException -> 0x013b, IOException | Throwable | JSONException -> 0x013b }
            r6.<init>(r5)     // Catch:{ IOException | Throwable | JSONException -> 0x013b, IOException | Throwable | JSONException -> 0x013b }
        L_0x0122:
            boolean r5 = com.bytedance.apm.p501q.C9185g.m18238c(r6)     // Catch:{ IOException | Throwable | JSONException -> 0x013b, IOException | Throwable | JSONException -> 0x013b }
            if (r5 != 0) goto L_0x0137
            java.lang.String r5 = "configs"
            org.json.JSONObject r5 = r6.optJSONObject(r5)     // Catch:{ IOException | Throwable | JSONException -> 0x013b, IOException | Throwable | JSONException -> 0x013b }
            boolean r1 = com.bytedance.apm.p501q.C9185g.m18238c(r5)     // Catch:{ IOException | Throwable | JSONException -> 0x013b, IOException | Throwable | JSONException -> 0x013b }
            if (r1 != 0) goto L_0x0137
            r4.m18138a(r5)     // Catch:{ IOException | Throwable | JSONException -> 0x013b, IOException | Throwable | JSONException -> 0x013b }
        L_0x0137:
            r0.f25010b = r6     // Catch:{ IOException | Throwable | JSONException -> 0x013b, IOException | Throwable | JSONException -> 0x013b }
            goto L_0x013b
        L_0x013a:
            return r0
        L_0x013b:
            return r0
        L_0x013c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p493m.C9139c.mo16508a(java.lang.String, byte[]):com.bytedance.apm.m.b.d");
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x011e A[Catch:{ JSONException -> 0x017f }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011f A[Catch:{ JSONException -> 0x017f }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012e A[Catch:{ JSONException -> 0x017f }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0140 A[Catch:{ JSONException -> 0x017f }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0149 A[Catch:{ JSONException -> 0x017f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m18137a(java.lang.String r25, java.util.List<java.lang.String> r26, int r27) {
        /*
            r24 = this;
            r7 = r24
            r0 = r27
            java.util.List<com.bytedance.frameworks.core.apm.a.a.a<? extends com.bytedance.apm.h.d>> r1 = r7.f25029k
            if (r1 != 0) goto L_0x0012
            java.lang.String r0 = "apm_getLogSampled"
            com.bytedance.p502b.p503a.p506b.p508b.C9220a.m18310a(r0)
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x0053
        L_0x0012:
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.List<com.bytedance.frameworks.core.apm.a.a.a<? extends com.bytedance.apm.h.d>> r2 = r7.f25029k
            java.util.Iterator r2 = r2.iterator()
            if (r2 != 0) goto L_0x0024
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x0053
        L_0x0024:
            r3 = r0
        L_0x0025:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0052
            java.lang.Object r4 = r2.next()
            com.bytedance.frameworks.core.apm.a.a.a r4 = (com.bytedance.frameworks.core.apm.p578a.p579a.C9932a) r4
            if (r4 == 0) goto L_0x004f
            r5 = r26
            java.util.List r4 = r4.mo17894a(r5, r3)
            boolean r6 = com.bytedance.apm.p501q.C9190h.m18253a(r4)
            if (r6 != 0) goto L_0x0025
            r1.addAll(r4)
            int r3 = r1.size()
            if (r3 >= r0) goto L_0x0052
            int r3 = r1.size()
            int r3 = r0 - r3
            goto L_0x0025
        L_0x004f:
            r5 = r26
            goto L_0x0025
        L_0x0052:
            r0 = r1
        L_0x0053:
            boolean r1 = com.bytedance.apm.p501q.C9190h.m18253a(r0)
            if (r1 == 0) goto L_0x005a
            return
        L_0x005a:
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            long r1 = r1.maxMemory()
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()
            long r3 = r3.totalMemory()
            long r1 = r1 - r3
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()
            long r3 = r3.freeMemory()
            long r1 = r1 + r3
            long r3 = r7.f25024f
            r8 = 1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x007d
            r1 = 1
            goto L_0x007e
        L_0x007d:
            r1 = 0
        L_0x007e:
            r10 = 2
            if (r1 == 0) goto L_0x00a5
            com.bytedance.apm.d.c$a r1 = com.bytedance.apm.p478d.C9004c.m17805a()
            r1.f24517a = r10
            r2 = 512000(0x7d000, double:2.529616E-318)
            r1.f24518b = r2
            com.bytedance.apm.d.c r1 = r1.mo16330a()
            com.bytedance.apm.d.c r2 = r7.f25018G
            int r2 = r2.f24515a
            if (r2 != 0) goto L_0x00a3
            int r2 = r1.f24515a
            if (r2 != 0) goto L_0x00a3
            int r2 = r7.f25038t
            r7.f25040v = r2
            long r2 = com.bytedance.apm.p497o.C9149b.f25064c
            com.bytedance.apm.p497o.C9149b.m18171a(r2)
        L_0x00a3:
            r7.f25018G = r1
        L_0x00a5:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Throwable -> 0x01cb }
            r1.<init>()     // Catch:{ Throwable -> 0x01cb }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Throwable -> 0x01cb }
            r2.<init>()     // Catch:{ Throwable -> 0x01cb }
            java.util.LinkedList r11 = new java.util.LinkedList     // Catch:{ Throwable -> 0x01cb }
            r11.<init>()     // Catch:{ Throwable -> 0x01cb }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ Throwable -> 0x01cb }
            r13 = -1
            r15 = 0
            r3 = r2
            r4 = r13
            r17 = r15
            r2 = r1
        L_0x00c1:
            boolean r0 = r12.hasNext()     // Catch:{ Throwable -> 0x01cb }
            if (r0 == 0) goto L_0x018b
            java.lang.Object r0 = r12.next()     // Catch:{ Throwable -> 0x01cb }
            r6 = r0
            com.bytedance.apm.h.d r6 = (com.bytedance.apm.p485h.C9042d) r6     // Catch:{ Throwable -> 0x01cb }
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x00da
            long r0 = r6.f24685j     // Catch:{ Throwable -> 0x01cb }
            r21 = r0
            r4 = r2
            r9 = r6
        L_0x00d8:
            r6 = r3
            goto L_0x010c
        L_0x00da:
            long r0 = r6.f24685j     // Catch:{ Throwable -> 0x01cb }
            int r19 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r19 == 0) goto L_0x0107
            r19 = 0
            r0 = r24
            r1 = r25
            r9 = r6
            r6 = r19
            boolean r0 = r0.m18139a(r1, r2, r3, r4, r6)     // Catch:{ Throwable -> 0x01cb }
            if (r0 == 0) goto L_0x00f7
            m18133a(r11)     // Catch:{ Throwable -> 0x01cb }
            r11.clear()     // Catch:{ Throwable -> 0x01cb }
            r17 = r15
        L_0x00f7:
            long r0 = r9.f24685j     // Catch:{ Throwable -> 0x01cb }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Throwable -> 0x01cb }
            r2.<init>()     // Catch:{ Throwable -> 0x01cb }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Throwable -> 0x01cb }
            r3.<init>()     // Catch:{ Throwable -> 0x01cb }
            r21 = r0
            r4 = r2
            goto L_0x00d8
        L_0x0107:
            r9 = r6
            r6 = r3
            r21 = r4
            r4 = r2
        L_0x010c:
            long r0 = r9.f24681f     // Catch:{ Throwable -> 0x01cb }
            java.lang.String r2 = r9.f24682g     // Catch:{ Throwable -> 0x01cb }
            r11.add(r9)     // Catch:{ Throwable -> 0x01cb }
            org.json.JSONObject r3 = r9.f24684i     // Catch:{ JSONException -> 0x017f }
            int r5 = r2.hashCode()     // Catch:{ JSONException -> 0x017f }
            r9 = 110364485(0x6940745, float:5.5682094E-35)
            if (r5 == r9) goto L_0x011f
            goto L_0x012a
        L_0x011f:
            java.lang.String r5 = "timer"
            boolean r2 = r2.equals(r5)     // Catch:{ JSONException -> 0x017f }
            if (r2 == 0) goto L_0x012a
            r23 = 0
            goto L_0x012c
        L_0x012a:
            r23 = -1
        L_0x012c:
            if (r23 == 0) goto L_0x0140
            java.lang.String r2 = "log_id"
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x017f }
            java.lang.String r0 = "d_s_t"
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x017f }
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x017f }
            r4.put(r3)     // Catch:{ JSONException -> 0x017f }
            goto L_0x0143
        L_0x0140:
            r6.put(r3)     // Catch:{ JSONException -> 0x017f }
        L_0x0143:
            boolean r0 = r24.m18144h()     // Catch:{ JSONException -> 0x017f }
            if (r0 == 0) goto L_0x017f
            int r0 = com.bytedance.apm.p501q.C9185g.m18239d(r3)     // Catch:{ JSONException -> 0x017f }
            long r0 = (long) r0     // Catch:{ JSONException -> 0x017f }
            long r17 = r17 + r0
            long r0 = r7.f25023e     // Catch:{ JSONException -> 0x017f }
            int r2 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x017f
            r9 = 0
            r0 = r24
            r1 = r25
            r2 = r4
            r3 = r6
            r19 = r4
            r4 = r21
            r23 = r6
            r6 = r9
            boolean r0 = r0.m18139a(r1, r2, r3, r4, r6)     // Catch:{ JSONException -> 0x0183 }
            if (r0 == 0) goto L_0x0183
            m18133a(r11)     // Catch:{ JSONException -> 0x0183 }
            com.bytedance.apm.d.c r0 = r7.f25018G     // Catch:{ JSONException -> 0x017c }
            int r0 = r0.f24515a     // Catch:{ JSONException -> 0x017c }
            if (r0 != r8) goto L_0x017c
            r2 = r19
            r4 = r21
            r3 = r23
            r20 = 1
            goto L_0x018d
        L_0x017c:
            r17 = r15
            goto L_0x0183
        L_0x017f:
            r19 = r4
            r23 = r6
        L_0x0183:
            r2 = r19
            r4 = r21
            r3 = r23
            goto L_0x00c1
        L_0x018b:
            r20 = 0
        L_0x018d:
            if (r20 != 0) goto L_0x019d
            r6 = 0
            r0 = r24
            r1 = r25
            boolean r0 = r0.m18139a(r1, r2, r3, r4, r6)     // Catch:{ Throwable -> 0x01cb }
            if (r0 == 0) goto L_0x019d
            m18133a(r11)     // Catch:{ Throwable -> 0x01cb }
        L_0x019d:
            boolean r0 = r24.m18144h()     // Catch:{ Throwable -> 0x01cb }
            if (r0 == 0) goto L_0x01ca
            int r0 = r11.size()     // Catch:{ Throwable -> 0x01cb }
            int r0 = r0 * 2
            long r0 = (long) r0     // Catch:{ Throwable -> 0x01cb }
            long r2 = r7.f25015B     // Catch:{ Throwable -> 0x01cb }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x01c1
            int r0 = r7.f25040v     // Catch:{ Throwable -> 0x01cb }
            int r0 = r0 / r10
            r1 = 30
            int r0 = java.lang.Math.max(r0, r1)     // Catch:{ Throwable -> 0x01cb }
            r7.f25040v = r0     // Catch:{ Throwable -> 0x01cb }
            long r0 = r7.f25025g     // Catch:{ Throwable -> 0x01cb }
            com.bytedance.apm.p497o.C9149b.m18171a(r0)     // Catch:{ Throwable -> 0x01cb }
            goto L_0x01cb
        L_0x01c1:
            int r0 = r7.f25038t     // Catch:{ Throwable -> 0x01cb }
            r7.f25040v = r0     // Catch:{ Throwable -> 0x01cb }
            long r0 = com.bytedance.apm.p497o.C9149b.f25064c     // Catch:{ Throwable -> 0x01cb }
            com.bytedance.apm.p497o.C9149b.m18171a(r0)     // Catch:{ Throwable -> 0x01cb }
        L_0x01ca:
            return
        L_0x01cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p493m.C9139c.m18137a(java.lang.String, java.util.List, int):void");
    }

    /* renamed from: a */
    private boolean m18139a(String str, JSONArray jSONArray, JSONArray jSONArray2, long j, boolean z) {
        return m18140a(str, jSONArray, jSONArray2, j, z, false);
    }

    /* renamed from: a */
    private List<C9042d> m18135a(long j, long j2, List<String> list, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        Iterator it = this.f25029k.iterator();
        if (it == null) {
            return Collections.emptyList();
        }
        int i3 = MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;
        while (it.hasNext()) {
            C9932a aVar = (C9932a) it.next();
            if (aVar != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(",");
                sb.append(i3);
                List a = aVar.mo17893a(j, j2, list, sb.toString());
                if (!C9190h.m18253a(a)) {
                    linkedList.addAll(a);
                    if (linkedList.size() >= 400) {
                        return linkedList;
                    }
                    i3 = 400 - linkedList.size();
                } else {
                    continue;
                }
            } else {
                int i4 = i;
            }
        }
        return linkedList;
    }

    /* renamed from: a */
    private boolean m18140a(String str, JSONArray jSONArray, JSONArray jSONArray2, long j, boolean z, boolean z2) {
        boolean z3;
        try {
            JSONObject jSONObject = new JSONObject();
            if (C9185g.m18236a(jSONArray)) {
                jSONObject.put("data", jSONArray);
            }
            if (C9185g.m18236a(jSONArray2)) {
                jSONObject.put("timer", jSONArray2);
            }
            if (C9185g.m18238c(jSONObject) || C8976c.m17753i() == null) {
                return false;
            }
            JSONObject a = C9131b.m18119a(new JSONObject(C8976c.m17753i().toString()), C9926a.m19912a().mo17871a(j));
            a.put("current_update_version_code", C8976c.m17753i().optString("update_version_code"));
            a.put("debug_fetch", z ? 1 : 0);
            if (C8976c.m17754j() != null) {
                a.put("uid", C8976c.m17754j().mo16303c());
            }
            a.put("sdk_report_mode", this.f25018G.f24515a);
            jSONObject.put("header", a);
            if (C8976c.m17751g()) {
                C9079d.m17981a(C9074a.f24801i, "report", jSONObject.toString());
            }
            if (z2) {
                final String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(str)) {
                    if (!TextUtils.isEmpty(jSONObject2)) {
                        if (!C9193j.m18259b(C8976c.m17736a())) {
                            return false;
                        }
                        List a2 = C9130c.m18118a(str);
                        if (a2 != null && a2.size() > 0) {
                            final String str2 = (String) a2.get(0);
                            if (!TextUtils.isEmpty(str2)) {
                                ApmDelegate.m17947a().mo16430a((Runnable) new Runnable() {
                                    public final void run() {
                                        try {
                                            C9139c.this.mo16508a(str2, C9801d.m19625a(jSONObject2));
                                        } catch (Exception unused) {
                                        }
                                    }
                                });
                                return true;
                            }
                        }
                        return false;
                    }
                }
                return false;
            }
            String jSONObject3 = jSONObject.toString();
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(jSONObject3)) {
                    C9132a aVar = (C9132a) C9137c.f25007a.get(str);
                    if (aVar != null) {
                        if (aVar.f24999b == 1800000) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            if (C8976c.m17751g()) {
                                new String[1][0] = jSONObject3;
                            }
                            return aVar.f24998a.mo17646a(C9801d.m19625a(jSONObject3));
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
