package com.bytedance.ttnet.p883a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.common.utility.p525e.C9402b;
import com.bytedance.frameworks.baselib.network.http.p574e.C9912g;
import com.bytedance.frameworks.baselib.network.p567b.C9819a;
import com.bytedance.frameworks.baselib.network.p567b.C9821c.C9822a;
import com.bytedance.frameworks.baselib.network.p567b.C9827f;
import com.bytedance.ttnet.C13303d;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.a.e */
public class C13273e implements C9382a {

    /* renamed from: j */
    private static volatile C13273e f34609j;

    /* renamed from: o */
    private static final Queue<Pair<String, JSONObject>> f34610o = new LinkedBlockingQueue();

    /* renamed from: p */
    private static boolean f34611p = true;

    /* renamed from: a */
    int f34612a = 1800;

    /* renamed from: b */
    public int f34613b = 2;

    /* renamed from: c */
    long f34614c;

    /* renamed from: d */
    public Map<String, C13275a> f34615d = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: e */
    public C13275a f34616e;

    /* renamed from: f */
    C13275a f34617f;

    /* renamed from: g */
    String f34618g = null;

    /* renamed from: h */
    int f34619h = -1;

    /* renamed from: i */
    AtomicBoolean f34620i = new AtomicBoolean(false);

    /* renamed from: k */
    private final Context f34621k;

    /* renamed from: l */
    private final C9381g f34622l = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: m */
    private int f34623m = 60;

    /* renamed from: n */
    private AtomicLong f34624n = new AtomicLong(-1);

    /* renamed from: com.bytedance.ttnet.a.e$a */
    class C13275a {

        /* renamed from: a */
        String f34629a;

        /* renamed from: b */
        int f34630b;

        /* renamed from: c */
        int f34631c;

        /* renamed from: d */
        int f34632d = -1;

        /* renamed from: e */
        long f34633e = -1;

        /* renamed from: f */
        int f34634f = -1;

        /* renamed from: g */
        int f34635g = -1;

        /* renamed from: h */
        long f34636h = -1;

        /* renamed from: i */
        int f34637i = -1;

        /* renamed from: j */
        String f34638j = "";

        /* renamed from: b */
        public final int mo24887b() {
            if (this.f34632d != -1) {
                return this.f34632d + this.f34631c;
            }
            if (this.f34635g != -1) {
                return this.f34635g + this.f34631c;
            }
            return Integer.MAX_VALUE;
        }

        /* renamed from: a */
        public final boolean mo24886a() {
            if (this.f34632d != -1) {
                if (this.f34632d <= this.f34630b) {
                    return true;
                }
            } else if (this.f34635g != -1 && this.f34635g <= this.f34630b) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final JSONObject mo24888c() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("host", this.f34629a);
            jSONObject.put("max_time", this.f34630b);
            jSONObject.put("weight_time", this.f34631c);
            jSONObject.put("https_select_cost", this.f34632d);
            jSONObject.put("https_select_time", this.f34633e);
            jSONObject.put("https_status", this.f34634f);
            jSONObject.put("http_select_cost", this.f34635g);
            jSONObject.put("http_select_time", this.f34636h);
            jSONObject.put("http_status", this.f34637i);
            jSONObject.put("scheme", this.f34638j);
            return jSONObject;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NetChannel{host='");
            sb.append(this.f34629a);
            sb.append('\'');
            sb.append(", maxTime=");
            sb.append(this.f34630b);
            sb.append(", weightTime=");
            sb.append(this.f34631c);
            sb.append(", httpsSelectCost=");
            sb.append(this.f34632d);
            sb.append(", httpsSelectTime=");
            sb.append(this.f34633e);
            sb.append(", httpsStatus=");
            sb.append(this.f34634f);
            sb.append(", httpSelectCost=");
            sb.append(this.f34635g);
            sb.append(", httpSelectTime=");
            sb.append(this.f34636h);
            sb.append(", httpStatus=");
            sb.append(this.f34637i);
            sb.append(", scheme='");
            sb.append(this.f34638j);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }

        C13275a() {
        }

        /* renamed from: a */
        public final void mo24885a(C13275a aVar) {
            if (aVar != null) {
                this.f34632d = aVar.f34632d;
                this.f34633e = aVar.f34633e;
                this.f34634f = aVar.f34634f;
                this.f34635g = aVar.f34635g;
                this.f34636h = aVar.f34636h;
                this.f34637i = aVar.f34637i;
                this.f34638j = aVar.f34638j;
            }
        }
    }

    /* renamed from: a */
    public final void mo24880a(C13275a aVar) {
        C13275a aVar2;
        this.f34616e = aVar;
        if (aVar == null) {
            aVar2 = null;
        } else {
            C13275a aVar3 = new C13275a();
            aVar3.f34629a = aVar.f34629a;
            aVar3.f34630b = aVar.f34630b;
            aVar3.f34631c = aVar.f34631c;
            aVar3.mo24885a(aVar);
            aVar2 = aVar3;
        }
        this.f34617f = aVar2;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=org.json.JSONObject, code=java.lang.Object, for r6v0, types: [org.json.JSONObject, java.lang.Object] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24881a(java.lang.String r3, android.content.Context r4, boolean r5, java.lang.Object r6, org.json.JSONObject r7) {
        /*
            r2 = this;
            if (r7 == 0) goto L_0x000d
            java.lang.String r5 = "from"
            r7.put(r5, r3)     // Catch:{ Throwable -> 0x006f }
            java.lang.String r3 = "ss_net_channel_select"
            m26717a(r4, r3, r7)     // Catch:{ Throwable -> 0x006f }
            goto L_0x006f
        L_0x000d:
            if (r5 == 0) goto L_0x0042
            com.bytedance.ttnet.a.e$a r5 = r2.f34616e     // Catch:{ Throwable -> 0x006f }
            if (r5 == 0) goto L_0x0042
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Throwable -> 0x006f }
            r5.<init>()     // Catch:{ Throwable -> 0x006f }
            java.lang.String r7 = "id"
            java.util.concurrent.atomic.AtomicLong r0 = r2.f34624n     // Catch:{ Throwable -> 0x006f }
            long r0 = r0.get()     // Catch:{ Throwable -> 0x006f }
            r5.put(r7, r0)     // Catch:{ Throwable -> 0x006f }
            java.lang.String r7 = "pre"
            if (r6 != 0) goto L_0x0029
            java.lang.String r6 = ""
        L_0x0029:
            r5.put(r7, r6)     // Catch:{ Throwable -> 0x006f }
            java.lang.String r6 = "cur"
            com.bytedance.ttnet.a.e$a r7 = r2.f34616e     // Catch:{ Throwable -> 0x006f }
            org.json.JSONObject r7 = r7.mo24888c()     // Catch:{ Throwable -> 0x006f }
            r5.put(r6, r7)     // Catch:{ Throwable -> 0x006f }
            java.lang.String r6 = "from"
            r5.put(r6, r3)     // Catch:{ Throwable -> 0x006f }
            java.lang.String r3 = "ss_net_channel_select"
            m26717a(r4, r3, r5)     // Catch:{ Throwable -> 0x006f }
            goto L_0x006f
        L_0x0042:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Throwable -> 0x006f }
            r5.<init>()     // Catch:{ Throwable -> 0x006f }
            java.lang.String r7 = "id"
            java.util.concurrent.atomic.AtomicLong r0 = r2.f34624n     // Catch:{ Throwable -> 0x006f }
            long r0 = r0.get()     // Catch:{ Throwable -> 0x006f }
            r5.put(r7, r0)     // Catch:{ Throwable -> 0x006f }
            java.lang.String r7 = "pre"
            if (r6 != 0) goto L_0x0058
            java.lang.String r6 = ""
        L_0x0058:
            r5.put(r7, r6)     // Catch:{ Throwable -> 0x006f }
            java.lang.String r6 = "all"
            org.json.JSONObject r7 = r2.m26719b()     // Catch:{ Throwable -> 0x006f }
            r5.put(r6, r7)     // Catch:{ Throwable -> 0x006f }
            java.lang.String r6 = "from"
            r5.put(r6, r3)     // Catch:{ Throwable -> 0x006f }
            java.lang.String r3 = "ss_net_channel_select"
            m26717a(r4, r3, r5)     // Catch:{ Throwable -> 0x006f }
            return
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p883a.C13273e.mo24881a(java.lang.String, android.content.Context, boolean, org.json.JSONObject, org.json.JSONObject):void");
    }

    /* renamed from: a */
    public final void mo24879a(Editor editor) {
        if (editor != null) {
            try {
                JSONObject b = m26719b();
                if (b != null) {
                    editor.putString("i_host_select", b.toString());
                    if (this.f34616e != null) {
                        editor.putString("i_host_select_netchannel_host", this.f34616e.f34629a);
                    } else {
                        editor.putString("i_host_select_netchannel_host", "");
                    }
                    editor.putInt("i_host_select_interval", this.f34612a);
                    editor.putInt("i_host_select_interval_http_timeout", this.f34623m);
                    editor.putInt("i_host_max_fail", this.f34613b);
                    editor.putLong("i_host_last_select_time", this.f34614c);
                    editor.putLong("i_host_atomic_long", this.f34624n.longValue());
                    editor.putString("i_host_last_bssid", this.f34618g);
                    editor.putInt("i_host_last_net_type", this.f34619h);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private JSONObject m26719b() {
        if (this.f34615d == null || this.f34615d.size() <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        synchronized (C13273e.class) {
            for (Entry entry : this.f34615d.entrySet()) {
                if (entry != null) {
                    try {
                        jSONArray.put(((C13275a) entry.getValue()).mo24888c());
                    } catch (Exception unused) {
                    }
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("i_host_list", jSONArray);
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final Pair<String, String> mo24875a() {
        synchronized (C13273e.class) {
            if (this.f34616e == null) {
                return null;
            }
            Pair<String, String> pair = new Pair<>(this.f34616e.f34638j, this.f34616e.f34629a);
            return pair;
        }
    }

    /* renamed from: a */
    public static C13273e m26716a(Context context) {
        if (f34609j == null) {
            synchronized (C13273e.class) {
                if (f34609j == null) {
                    f34609j = new C13273e(context);
                }
            }
        }
        return f34609j;
    }

    /* renamed from: d */
    public static int m26720d(Context context) {
        try {
            C13303d.m26799b();
            NetworkInfo a = C13277g.m26736a((ConnectivityManager) context.getSystemService("connectivity"));
            if (a == null || !a.isAvailable()) {
                return -1;
            }
            return a.getType();
        } catch (Throwable unused) {
            return -2;
        }
    }

    /* renamed from: e */
    static String m26721e(Context context) {
        try {
            C13303d.m26799b();
            return ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getBSSID();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo24882b(Context context) {
        if (context != null) {
            try {
                if (System.currentTimeMillis() - this.f34614c > ((long) (this.f34612a * 1000))) {
                    mo24877a(context, "onActivityResume");
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    public final void mo24883c(Context context) {
        if (context != null) {
            try {
                synchronized (C13258a.class) {
                    Editor edit = C35807d.m80935a(context, "ss_app_config", 0).edit();
                    mo24879a(edit);
                    C9402b.m18594a(edit);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void handleMsg(Message message) {
        if (message != null) {
            try {
                if (message.what == 105) {
                    mo24882b(this.f34621k);
                    this.f34622l.sendEmptyMessageDelayed(105, (long) (this.f34612a * 1000));
                }
            } catch (Throwable unused) {
            }
        }
    }

    private C13273e(Context context) {
        this.f34621k = context;
    }

    /* renamed from: a */
    private void m26718a(Context context, JSONObject jSONObject) {
        if (context != null) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("i_host_list");
                if (jSONObject.has("i_host_last_select_time")) {
                    this.f34614c = jSONObject.optLong("i_host_last_select_time");
                }
                this.f34612a = jSONObject.optInt("i_host_select_interval", 1800);
                this.f34623m = jSONObject.optInt("i_host_select_interval_http_timeout", 60);
                this.f34613b = jSONObject.optInt("i_host_max_fail", 2);
                int length = optJSONArray.length();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (int i = 0; i < length; i++) {
                    try {
                        C13275a aVar = new C13275a();
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            aVar.f34629a = optJSONObject.optString("host");
                            aVar.f34630b = optJSONObject.optInt("max_time");
                            aVar.f34631c = optJSONObject.optInt("weight_time");
                            aVar.f34632d = optJSONObject.optInt("https_select_cost", -1);
                            aVar.f34633e = optJSONObject.optLong("https_select_time", -1);
                            aVar.f34634f = optJSONObject.optInt("https_status", -1);
                            aVar.f34635g = optJSONObject.optInt("http_select_cost", -1);
                            aVar.f34636h = optJSONObject.optLong("http_select_time", -1);
                            aVar.f34637i = optJSONObject.optInt("http_status", -1);
                            aVar.f34638j = optJSONObject.optString("scheme");
                        }
                        C13275a aVar2 = (C13275a) this.f34615d.get(aVar.f34629a);
                        if (aVar2 != null) {
                            aVar.mo24885a(aVar2);
                        }
                        linkedHashMap.put(aVar.f34629a, aVar);
                    } catch (Exception unused) {
                    }
                }
                synchronized (C13273e.class) {
                    this.f34615d.clear();
                    this.f34615d.putAll(linkedHashMap);
                    if (this.f34616e != null) {
                        if (!this.f34615d.containsKey(this.f34616e.f34629a)) {
                            mo24877a(context, "onUpdate");
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    public final void mo24876a(Context context, SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                String string = sharedPreferences.getString("i_host_select", null);
                this.f34612a = sharedPreferences.getInt("i_host_select_interval", 1800);
                this.f34623m = sharedPreferences.getInt("i_host_select_interval_http_timeout", 60);
                this.f34613b = sharedPreferences.getInt("i_host_max_fail", 2);
                this.f34614c = sharedPreferences.getLong("i_host_last_select_time", 0);
                long j = -1;
                long j2 = sharedPreferences.getLong("i_host_atomic_long", -1);
                this.f34618g = sharedPreferences.getString("i_host_last_bssid", null);
                this.f34619h = sharedPreferences.getInt("i_host_last_net_type", -1);
                if (j2 < Long.MAX_VALUE) {
                    j = j2;
                }
                if (this.f34624n != null) {
                    this.f34624n.getAndSet(j);
                }
                if (!C9431p.m18664a(string)) {
                    try {
                        m26718a(context, new JSONObject(string));
                    } catch (Throwable unused) {
                    }
                    String string2 = sharedPreferences.getString("i_host_select_netchannel_host", "");
                    if (!C9431p.m18664a(string2)) {
                        synchronized (C13273e.class) {
                            mo24880a((C13275a) this.f34615d.get(string2));
                        }
                    }
                    if (C13258a.m26660a(context).mo24862o()) {
                        mo24877a(context, "onInit");
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    public final void mo24877a(final Context context, final String str) {
        boolean z;
        if (!this.f34620i.get() && this.f34615d != null && this.f34615d.size() > 0 && context != null) {
            try {
                if (C9912g.m19864a(context) && C13258a.m26660a(context).mo24862o() && C13277g.m26737a(context)) {
                    C13258a a = C13258a.m26660a(context);
                    if (a.f34570j == null || !a.f34570j.mo24964a(a.f34571k)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        final LinkedList linkedList = new LinkedList();
                        synchronized (C13273e.class) {
                            for (Entry value : this.f34615d.entrySet()) {
                                linkedList.add(value.getValue());
                            }
                        }
                        this.f34620i.getAndSet(true);
                        this.f34614c = System.currentTimeMillis();
                        this.f34622l.removeMessages(105);
                        this.f34622l.sendEmptyMessageDelayed(105, (long) (this.f34612a * 1000));
                        this.f34619h = m26720d(context);
                        if (this.f34619h == 1) {
                            this.f34618g = m26721e(context);
                        }
                        if (this.f34624n.get() >= Long.MAX_VALUE) {
                            this.f34624n.getAndSet(-1);
                        }
                        this.f34624n.getAndIncrement();
                        C9819a aVar = new C9819a("SelectThread", C9822a.NORMAL, 0, new Runnable() {
                            /* JADX WARNING: Can't wrap try/catch for region: R(5:147|148|(1:150)(3:151|152|153)|154|155) */
                            /* JADX WARNING: Can't wrap try/catch for region: R(5:69|70|(1:72)(3:73|74|75)|76|77) */
                            /* JADX WARNING: Missing exception handler attribute for start block: B:154:0x02d3 */
                            /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x0194 */
                            /* JADX WARNING: Removed duplicated region for block: B:100:0x01bb A[Catch:{ Throwable -> 0x032c }] */
                            /* JADX WARNING: Removed duplicated region for block: B:108:0x01f4 A[SYNTHETIC] */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final void run() {
                                /*
                                    r24 = this;
                                    r1 = r24
                                    java.util.List r0 = r0     // Catch:{ Throwable -> 0x032c }
                                    if (r0 == 0) goto L_0x031c
                                    java.util.List r0 = r0     // Catch:{ Throwable -> 0x032c }
                                    int r0 = r0.size()     // Catch:{ Throwable -> 0x032c }
                                    if (r0 > 0) goto L_0x0010
                                    goto L_0x031c
                                L_0x0010:
                                    r3 = 0
                                L_0x0011:
                                    if (r3 > 0) goto L_0x02eb
                                    java.lang.String r5 = "https"
                                    java.util.List r0 = r0     // Catch:{ Throwable -> 0x032c }
                                    java.util.Iterator r6 = r0.iterator()     // Catch:{ Throwable -> 0x032c }
                                    r7 = 0
                                    r12 = 0
                                L_0x001d:
                                    boolean r0 = r6.hasNext()     // Catch:{ Throwable -> 0x032c }
                                    if (r0 == 0) goto L_0x0247
                                    java.lang.Object r0 = r6.next()     // Catch:{ Throwable -> 0x032c }
                                    r8 = r0
                                    com.bytedance.ttnet.a.e$a r8 = (com.bytedance.ttnet.p883a.C13273e.C13275a) r8     // Catch:{ Throwable -> 0x032c }
                                    java.lang.String r0 = r8.f34629a     // Catch:{ Throwable -> 0x032c }
                                    java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x032c }
                                    r9.<init>()     // Catch:{ Throwable -> 0x032c }
                                    r9.append(r5)     // Catch:{ Throwable -> 0x032c }
                                    java.lang.String r10 = "://"
                                    r9.append(r10)     // Catch:{ Throwable -> 0x032c }
                                    r9.append(r0)     // Catch:{ Throwable -> 0x032c }
                                    java.lang.String r10 = "/network/get_network/"
                                    r9.append(r10)     // Catch:{ Throwable -> 0x032c }
                                    java.lang.String r9 = r9.toString()     // Catch:{ Throwable -> 0x032c }
                                    long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x032c }
                                    r13 = -1
                                    java.lang.String r14 = "onErr"
                                    java.lang.String r15 = r10     // Catch:{ Throwable -> 0x01b2 }
                                    boolean r14 = r14.equals(r15)     // Catch:{ Throwable -> 0x01b2 }
                                    if (r14 == 0) goto L_0x007f
                                    com.bytedance.ttnet.a.e r14 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ Throwable -> 0x01b2 }
                                    com.bytedance.ttnet.a.e$a r14 = r14.f34616e     // Catch:{ Throwable -> 0x01b2 }
                                    if (r14 == 0) goto L_0x007f
                                    com.bytedance.ttnet.a.e r14 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ Throwable -> 0x01b2 }
                                    com.bytedance.ttnet.a.e$a r14 = r14.f34616e     // Catch:{ Throwable -> 0x01b2 }
                                    java.lang.String r14 = r14.f34629a     // Catch:{ Throwable -> 0x01b2 }
                                    boolean r0 = r0.equals(r14)     // Catch:{ Throwable -> 0x01b2 }
                                    if (r0 == 0) goto L_0x007f
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ Throwable -> 0x01b2 }
                                    com.bytedance.ttnet.a.e$a r0 = r0.f34616e     // Catch:{ Throwable -> 0x01b2 }
                                    java.lang.String r0 = r0.f34638j     // Catch:{ Throwable -> 0x01b2 }
                                    boolean r0 = r5.equals(r0)     // Catch:{ Throwable -> 0x01b2 }
                                    if (r0 == 0) goto L_0x007f
                                    r8.f34632d = r13     // Catch:{ Throwable -> 0x01b2 }
                                    r14 = -1
                                    r8.f34633e = r14     // Catch:{ Throwable -> 0x01b2 }
                                    r8.f34634f = r13     // Catch:{ Throwable -> 0x01b2 }
                                    java.lang.String r0 = "https"
                                    r8.f34638j = r0     // Catch:{ Throwable -> 0x01b2 }
                                    goto L_0x001d
                                L_0x007f:
                                    android.content.Context r0 = r9     // Catch:{ Throwable -> 0x01b2 }
                                    boolean r0 = com.bytedance.ttnet.p883a.C13276f.m26735a(r0)     // Catch:{ Throwable -> 0x01b2 }
                                    if (r0 != 0) goto L_0x0089
                                    goto L_0x0247
                                L_0x0089:
                                    com.bytedance.ttnet.c r0 = com.bytedance.ttnet.C13303d.m26799b()     // Catch:{ Throwable -> 0x01b2 }
                                    r0.mo24898a(r13, r9)     // Catch:{ Throwable -> 0x01b2 }
                                    long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x01b2 }
                                    r0 = 0
                                    long r14 = r14 - r10
                                    int r0 = (int) r14     // Catch:{ Throwable -> 0x01b2 }
                                    com.bytedance.ttnet.a.e r9 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ Throwable -> 0x01b2 }
                                    com.bytedance.ttnet.a.e$a r9 = r9.f34616e     // Catch:{ Throwable -> 0x01b2 }
                                    if (r9 == 0) goto L_0x00a6
                                    com.bytedance.ttnet.a.e r9 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ Throwable -> 0x01b2 }
                                    com.bytedance.ttnet.a.e$a r9 = r9.f34616e     // Catch:{ Throwable -> 0x01b2 }
                                    org.json.JSONObject r9 = r9.mo24888c()     // Catch:{ Throwable -> 0x01b2 }
                                    goto L_0x00a7
                                L_0x00a6:
                                    r9 = r12
                                L_0x00a7:
                                    r8.f34632d = r0     // Catch:{ Throwable -> 0x01ad }
                                    r8.f34633e = r10     // Catch:{ Throwable -> 0x01ad }
                                    r0 = 200(0xc8, float:2.8E-43)
                                    r8.f34634f = r0     // Catch:{ Throwable -> 0x01ad }
                                    long r14 = r8.f34633e     // Catch:{ Throwable -> 0x00d1 }
                                    java.lang.String r0 = r8.f34629a     // Catch:{ Throwable -> 0x00d1 }
                                    int r12 = r8.f34632d     // Catch:{ Throwable -> 0x00d1 }
                                    java.lang.String r21 = "https"
                                    int r13 = r8.f34634f     // Catch:{ Throwable -> 0x00d1 }
                                    com.bytedance.ttnet.a.e r2 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ Throwable -> 0x00d1 }
                                    android.content.Context r4 = r9     // Catch:{ Throwable -> 0x00d1 }
                                    r23 = r5
                                    java.lang.String r5 = r10     // Catch:{ Throwable -> 0x00d3 }
                                    r17 = r14
                                    r14 = r2
                                    r15 = r4
                                    r16 = r5
                                    r19 = r0
                                    r20 = r12
                                    r22 = r13
                                    r14.mo24878a(r15, r16, r17, r19, r20, r21, r22)     // Catch:{ Throwable -> 0x00d3 }
                                    goto L_0x00d3
                                L_0x00d1:
                                    r23 = r5
                                L_0x00d3:
                                    java.lang.Class<com.bytedance.ttnet.a.e> r2 = com.bytedance.ttnet.p883a.C13273e.class
                                    monitor-enter(r2)     // Catch:{ Throwable -> 0x01ab }
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x01a8 }
                                    com.bytedance.ttnet.a.e$a r0 = r0.f34616e     // Catch:{ all -> 0x01a8 }
                                    if (r0 == 0) goto L_0x0102
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x01a8 }
                                    com.bytedance.ttnet.a.e$a r0 = r0.f34616e     // Catch:{ all -> 0x01a8 }
                                    java.lang.String r0 = r0.f34629a     // Catch:{ all -> 0x01a8 }
                                    if (r0 == 0) goto L_0x0102
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x01a8 }
                                    com.bytedance.ttnet.a.e$a r0 = r0.f34616e     // Catch:{ all -> 0x01a8 }
                                    java.lang.String r0 = r0.f34629a     // Catch:{ all -> 0x01a8 }
                                    java.lang.String r4 = r8.f34629a     // Catch:{ all -> 0x01a8 }
                                    boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x01a8 }
                                    if (r0 == 0) goto L_0x0102
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x01a8 }
                                    com.bytedance.ttnet.a.e$a r0 = r0.f34616e     // Catch:{ all -> 0x01a8 }
                                    boolean r0 = r0.mo24886a()     // Catch:{ all -> 0x01a8 }
                                    if (r0 != 0) goto L_0x0102
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x01a8 }
                                    r4 = 0
                                    r0.mo24880a(r4)     // Catch:{ all -> 0x01a8 }
                                L_0x0102:
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x01a8 }
                                    java.util.Map<java.lang.String, com.bytedance.ttnet.a.e$a> r0 = r0.f34615d     // Catch:{ all -> 0x01a8 }
                                    java.lang.String r4 = r8.f34629a     // Catch:{ all -> 0x01a8 }
                                    boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x01a8 }
                                    if (r0 == 0) goto L_0x011f
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x01a8 }
                                    java.util.Map<java.lang.String, com.bytedance.ttnet.a.e$a> r0 = r0.f34615d     // Catch:{ all -> 0x01a8 }
                                    java.lang.String r4 = r8.f34629a     // Catch:{ all -> 0x01a8 }
                                    java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x01a8 }
                                    com.bytedance.ttnet.a.e$a r0 = (com.bytedance.ttnet.p883a.C13273e.C13275a) r0     // Catch:{ all -> 0x01a8 }
                                    if (r0 == r8) goto L_0x011f
                                    r0.mo24885a(r8)     // Catch:{ all -> 0x01a8 }
                                L_0x011f:
                                    monitor-exit(r2)     // Catch:{ all -> 0x01a8 }
                                    android.content.Context r0 = r9     // Catch:{ Throwable -> 0x01ab }
                                    boolean r0 = com.bytedance.common.utility.C9425l.m18649a(r0)     // Catch:{ Throwable -> 0x01ab }
                                    if (r0 != 0) goto L_0x0132
                                    boolean r0 = r8.mo24886a()     // Catch:{ Throwable -> 0x01ab }
                                    if (r0 == 0) goto L_0x012f
                                    goto L_0x0132
                                L_0x012f:
                                    r12 = r9
                                    goto L_0x0240
                                L_0x0132:
                                    java.lang.Class<com.bytedance.ttnet.a.e> r2 = com.bytedance.ttnet.p883a.C13273e.class
                                    monitor-enter(r2)     // Catch:{ Throwable -> 0x01ab }
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x01a5 }
                                    java.util.Map<java.lang.String, com.bytedance.ttnet.a.e$a> r0 = r0.f34615d     // Catch:{ all -> 0x01a5 }
                                    java.lang.String r4 = r8.f34629a     // Catch:{ all -> 0x01a5 }
                                    boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x01a5 }
                                    if (r0 == 0) goto L_0x0168
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x01a5 }
                                    java.util.Map<java.lang.String, com.bytedance.ttnet.a.e$a> r0 = r0.f34615d     // Catch:{ all -> 0x01a5 }
                                    java.lang.String r4 = r8.f34629a     // Catch:{ all -> 0x01a5 }
                                    java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x01a5 }
                                    com.bytedance.ttnet.a.e$a r0 = (com.bytedance.ttnet.p883a.C13273e.C13275a) r0     // Catch:{ all -> 0x01a5 }
                                    java.lang.String r4 = "https"
                                    r0.f34638j = r4     // Catch:{ all -> 0x01a5 }
                                    com.bytedance.ttnet.a.e r4 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x01a5 }
                                    r4.mo24880a(r0)     // Catch:{ all -> 0x01a5 }
                                    com.bytedance.ttnet.a.e r14 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x01a5 }
                                    java.lang.String r15 = r10     // Catch:{ all -> 0x01a5 }
                                    android.content.Context r0 = r9     // Catch:{ all -> 0x01a5 }
                                    r17 = 1
                                    r19 = 0
                                    r16 = r0
                                    r18 = r9
                                    r14.mo24881a(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01a5 }
                                    goto L_0x0194
                                L_0x0168:
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x01a5 }
                                    r4 = 0
                                    r0.mo24880a(r4)     // Catch:{ all -> 0x01a5 }
                                    org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0194 }
                                    r0.<init>()     // Catch:{ Throwable -> 0x0194 }
                                    java.lang.String r4 = "net_channel"
                                    org.json.JSONObject r5 = r8.mo24888c()     // Catch:{ Throwable -> 0x0194 }
                                    r0.put(r4, r5)     // Catch:{ Throwable -> 0x0194 }
                                    java.lang.String r4 = "map_net_channel"
                                    java.lang.String r5 = "null"
                                    r0.put(r4, r5)     // Catch:{ Throwable -> 0x0194 }
                                    com.bytedance.ttnet.a.e r14 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ Throwable -> 0x0194 }
                                    java.lang.String r15 = r10     // Catch:{ Throwable -> 0x0194 }
                                    android.content.Context r4 = r9     // Catch:{ Throwable -> 0x0194 }
                                    r17 = 0
                                    r16 = r4
                                    r18 = r9
                                    r19 = r0
                                    r14.mo24881a(r15, r16, r17, r18, r19)     // Catch:{ Throwable -> 0x0194 }
                                L_0x0194:
                                    monitor-exit(r2)     // Catch:{ all -> 0x01a5 }
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ Throwable -> 0x01ab }
                                    android.content.Context r2 = r9     // Catch:{ Throwable -> 0x01ab }
                                    r0.mo24883c(r2)     // Catch:{ Throwable -> 0x01ab }
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ Throwable -> 0x01ab }
                                    java.util.concurrent.atomic.AtomicBoolean r0 = r0.f34620i     // Catch:{ Throwable -> 0x01ab }
                                    r2 = 0
                                    r0.getAndSet(r2)     // Catch:{ Throwable -> 0x01ab }
                                    return
                                L_0x01a5:
                                    r0 = move-exception
                                    monitor-exit(r2)     // Catch:{ all -> 0x01a5 }
                                    throw r0     // Catch:{ Throwable -> 0x01ab }
                                L_0x01a8:
                                    r0 = move-exception
                                    monitor-exit(r2)     // Catch:{ all -> 0x01a8 }
                                    throw r0     // Catch:{ Throwable -> 0x01ab }
                                L_0x01ab:
                                    r0 = move-exception
                                    goto L_0x01b0
                                L_0x01ad:
                                    r0 = move-exception
                                    r23 = r5
                                L_0x01b0:
                                    r12 = r9
                                    goto L_0x01b5
                                L_0x01b2:
                                    r0 = move-exception
                                    r23 = r5
                                L_0x01b5:
                                    com.bytedance.ttnet.a.e r2 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ Throwable -> 0x032c }
                                    com.bytedance.ttnet.a.e$a r2 = r2.f34616e     // Catch:{ Throwable -> 0x032c }
                                    if (r2 == 0) goto L_0x01c4
                                    com.bytedance.ttnet.a.e r2 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ Throwable -> 0x032c }
                                    com.bytedance.ttnet.a.e$a r2 = r2.f34616e     // Catch:{ Throwable -> 0x032c }
                                    org.json.JSONObject r2 = r2.mo24888c()     // Catch:{ Throwable -> 0x032c }
                                    r12 = r2
                                L_0x01c4:
                                    com.bytedance.ttnet.c r2 = com.bytedance.ttnet.C13303d.m26799b()     // Catch:{ Throwable -> 0x032c }
                                    r4 = 0
                                    int r0 = r2.mo24895a(r0, r4)     // Catch:{ Throwable -> 0x032c }
                                    r2 = -1
                                    r8.f34632d = r2     // Catch:{ Throwable -> 0x032c }
                                    r8.f34633e = r10     // Catch:{ Throwable -> 0x032c }
                                    r8.f34634f = r0     // Catch:{ Throwable -> 0x032c }
                                    java.lang.String r2 = "https"
                                    r8.f34638j = r2     // Catch:{ Throwable -> 0x032c }
                                    long r4 = r8.f34633e     // Catch:{ Throwable -> 0x01f1 }
                                    java.lang.String r2 = r8.f34629a     // Catch:{ Throwable -> 0x01f1 }
                                    int r9 = r8.f34632d     // Catch:{ Throwable -> 0x01f1 }
                                    java.lang.String r20 = "https"
                                    com.bytedance.ttnet.a.e r13 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ Throwable -> 0x01f1 }
                                    android.content.Context r14 = r9     // Catch:{ Throwable -> 0x01f1 }
                                    java.lang.String r15 = r10     // Catch:{ Throwable -> 0x01f1 }
                                    r16 = r4
                                    r18 = r2
                                    r19 = r9
                                    r21 = r0
                                    r13.mo24878a(r14, r15, r16, r18, r19, r20, r21)     // Catch:{ Throwable -> 0x01f1 }
                                L_0x01f1:
                                    java.lang.Class<com.bytedance.ttnet.a.e> r2 = com.bytedance.ttnet.p883a.C13273e.class
                                    monitor-enter(r2)     // Catch:{ Throwable -> 0x032c }
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x0244 }
                                    com.bytedance.ttnet.a.e$a r0 = r0.f34616e     // Catch:{ all -> 0x0244 }
                                    if (r0 == 0) goto L_0x0220
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x0244 }
                                    com.bytedance.ttnet.a.e$a r0 = r0.f34616e     // Catch:{ all -> 0x0244 }
                                    java.lang.String r0 = r0.f34629a     // Catch:{ all -> 0x0244 }
                                    if (r0 == 0) goto L_0x0220
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x0244 }
                                    com.bytedance.ttnet.a.e$a r0 = r0.f34616e     // Catch:{ all -> 0x0244 }
                                    java.lang.String r0 = r0.f34629a     // Catch:{ all -> 0x0244 }
                                    java.lang.String r4 = r8.f34629a     // Catch:{ all -> 0x0244 }
                                    boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x0244 }
                                    if (r0 == 0) goto L_0x0220
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x0244 }
                                    com.bytedance.ttnet.a.e$a r0 = r0.f34616e     // Catch:{ all -> 0x0244 }
                                    boolean r0 = r0.mo24886a()     // Catch:{ all -> 0x0244 }
                                    if (r0 != 0) goto L_0x0220
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x0244 }
                                    r4 = 0
                                    r0.mo24880a(r4)     // Catch:{ all -> 0x0244 }
                                L_0x0220:
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x0244 }
                                    java.util.Map<java.lang.String, com.bytedance.ttnet.a.e$a> r0 = r0.f34615d     // Catch:{ all -> 0x0244 }
                                    java.lang.String r4 = r8.f34629a     // Catch:{ all -> 0x0244 }
                                    boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x0244 }
                                    if (r0 == 0) goto L_0x023d
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x0244 }
                                    java.util.Map<java.lang.String, com.bytedance.ttnet.a.e$a> r0 = r0.f34615d     // Catch:{ all -> 0x0244 }
                                    java.lang.String r4 = r8.f34629a     // Catch:{ all -> 0x0244 }
                                    java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0244 }
                                    com.bytedance.ttnet.a.e$a r0 = (com.bytedance.ttnet.p883a.C13273e.C13275a) r0     // Catch:{ all -> 0x0244 }
                                    if (r0 == r8) goto L_0x023d
                                    r0.mo24885a(r8)     // Catch:{ all -> 0x0244 }
                                L_0x023d:
                                    monitor-exit(r2)     // Catch:{ all -> 0x0244 }
                                    int r7 = r7 + 1
                                L_0x0240:
                                    r5 = r23
                                    goto L_0x001d
                                L_0x0244:
                                    r0 = move-exception
                                    monitor-exit(r2)     // Catch:{ all -> 0x0244 }
                                    throw r0     // Catch:{ Throwable -> 0x032c }
                                L_0x0247:
                                    java.util.List r0 = r0     // Catch:{ Throwable -> 0x032c }
                                    int r0 = r0.size()     // Catch:{ Throwable -> 0x032c }
                                    if (r7 == r0) goto L_0x02e7
                                    java.util.List r0 = r0     // Catch:{ Throwable -> 0x032c }
                                    java.util.Iterator r0 = r0.iterator()     // Catch:{ Throwable -> 0x032c }
                                    r2 = 0
                                L_0x0256:
                                    boolean r4 = r0.hasNext()     // Catch:{ Throwable -> 0x032c }
                                    if (r4 == 0) goto L_0x027c
                                    java.lang.Object r4 = r0.next()     // Catch:{ Throwable -> 0x032c }
                                    com.bytedance.ttnet.a.e$a r4 = (com.bytedance.ttnet.p883a.C13273e.C13275a) r4     // Catch:{ Throwable -> 0x032c }
                                    if (r2 != 0) goto L_0x026f
                                    int r5 = r4.mo24887b()     // Catch:{ Throwable -> 0x032c }
                                    r6 = 2147483647(0x7fffffff, float:NaN)
                                    if (r5 >= r6) goto L_0x026f
                                L_0x026d:
                                    r2 = r4
                                    goto L_0x0256
                                L_0x026f:
                                    if (r2 == 0) goto L_0x0256
                                    int r5 = r4.mo24887b()     // Catch:{ Throwable -> 0x032c }
                                    int r6 = r2.mo24887b()     // Catch:{ Throwable -> 0x032c }
                                    if (r5 >= r6) goto L_0x0256
                                    goto L_0x026d
                                L_0x027c:
                                    if (r2 == 0) goto L_0x02e7
                                    java.lang.Class<com.bytedance.ttnet.a.e> r3 = com.bytedance.ttnet.p883a.C13273e.class
                                    monitor-enter(r3)     // Catch:{ Throwable -> 0x032c }
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x02e4 }
                                    java.util.Map<java.lang.String, com.bytedance.ttnet.a.e$a> r0 = r0.f34615d     // Catch:{ all -> 0x02e4 }
                                    java.lang.String r4 = r2.f34629a     // Catch:{ all -> 0x02e4 }
                                    boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x02e4 }
                                    if (r0 == 0) goto L_0x02ae
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x02e4 }
                                    java.util.Map<java.lang.String, com.bytedance.ttnet.a.e$a> r0 = r0.f34615d     // Catch:{ all -> 0x02e4 }
                                    java.lang.String r2 = r2.f34629a     // Catch:{ all -> 0x02e4 }
                                    java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x02e4 }
                                    com.bytedance.ttnet.a.e$a r0 = (com.bytedance.ttnet.p883a.C13273e.C13275a) r0     // Catch:{ all -> 0x02e4 }
                                    java.lang.String r2 = "https"
                                    r0.f34638j = r2     // Catch:{ all -> 0x02e4 }
                                    com.bytedance.ttnet.a.e r2 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x02e4 }
                                    r2.mo24880a(r0)     // Catch:{ all -> 0x02e4 }
                                    com.bytedance.ttnet.a.e r8 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x02e4 }
                                    java.lang.String r9 = r10     // Catch:{ all -> 0x02e4 }
                                    android.content.Context r10 = r9     // Catch:{ all -> 0x02e4 }
                                    r11 = 1
                                    r13 = 0
                                    r8.mo24881a(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x02e4 }
                                    goto L_0x02d3
                                L_0x02ae:
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x02e4 }
                                    r4 = 0
                                    r0.mo24880a(r4)     // Catch:{ all -> 0x02e4 }
                                    org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ Throwable -> 0x02d3 }
                                    r13.<init>()     // Catch:{ Throwable -> 0x02d3 }
                                    java.lang.String r0 = "net_channel"
                                    org.json.JSONObject r2 = r2.mo24888c()     // Catch:{ Throwable -> 0x02d3 }
                                    r13.put(r0, r2)     // Catch:{ Throwable -> 0x02d3 }
                                    java.lang.String r0 = "map_net_channel"
                                    java.lang.String r2 = "null"
                                    r13.put(r0, r2)     // Catch:{ Throwable -> 0x02d3 }
                                    com.bytedance.ttnet.a.e r8 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ Throwable -> 0x02d3 }
                                    java.lang.String r9 = r10     // Catch:{ Throwable -> 0x02d3 }
                                    android.content.Context r10 = r9     // Catch:{ Throwable -> 0x02d3 }
                                    r11 = 0
                                    r8.mo24881a(r9, r10, r11, r12, r13)     // Catch:{ Throwable -> 0x02d3 }
                                L_0x02d3:
                                    monitor-exit(r3)     // Catch:{ all -> 0x02e4 }
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ Throwable -> 0x032c }
                                    android.content.Context r2 = r9     // Catch:{ Throwable -> 0x032c }
                                    r0.mo24883c(r2)     // Catch:{ Throwable -> 0x032c }
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ Throwable -> 0x032c }
                                    java.util.concurrent.atomic.AtomicBoolean r0 = r0.f34620i     // Catch:{ Throwable -> 0x032c }
                                    r2 = 0
                                    r0.getAndSet(r2)     // Catch:{ Throwable -> 0x032c }
                                    return
                                L_0x02e4:
                                    r0 = move-exception
                                    monitor-exit(r3)     // Catch:{ all -> 0x02e4 }
                                    throw r0     // Catch:{ Throwable -> 0x032c }
                                L_0x02e7:
                                    int r3 = r3 + 1
                                    goto L_0x0011
                                L_0x02eb:
                                    java.lang.Class<com.bytedance.ttnet.a.e> r2 = com.bytedance.ttnet.p883a.C13273e.class
                                    monitor-enter(r2)     // Catch:{ Throwable -> 0x032c }
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x0319 }
                                    com.bytedance.ttnet.a.e$a r0 = r0.f34616e     // Catch:{ all -> 0x0319 }
                                    if (r0 == 0) goto L_0x02fe
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x0319 }
                                    com.bytedance.ttnet.a.e$a r0 = r0.f34616e     // Catch:{ all -> 0x0319 }
                                    org.json.JSONObject r4 = r0.mo24888c()     // Catch:{ all -> 0x0319 }
                                    r9 = r4
                                    goto L_0x02ff
                                L_0x02fe:
                                    r9 = 0
                                L_0x02ff:
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x0319 }
                                    r3 = 0
                                    r0.mo24880a(r3)     // Catch:{ all -> 0x0319 }
                                    com.bytedance.ttnet.a.e r5 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ all -> 0x0319 }
                                    java.lang.String r6 = r10     // Catch:{ all -> 0x0319 }
                                    android.content.Context r7 = r9     // Catch:{ all -> 0x0319 }
                                    r8 = 0
                                    r10 = 0
                                    r5.mo24881a(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0319 }
                                    monitor-exit(r2)     // Catch:{ all -> 0x0319 }
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ Throwable -> 0x032c }
                                    android.content.Context r2 = r9     // Catch:{ Throwable -> 0x032c }
                                    r0.mo24883c(r2)     // Catch:{ Throwable -> 0x032c }
                                    goto L_0x032c
                                L_0x0319:
                                    r0 = move-exception
                                    monitor-exit(r2)     // Catch:{ all -> 0x0319 }
                                    throw r0     // Catch:{ Throwable -> 0x032c }
                                L_0x031c:
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ Throwable -> 0x032c }
                                    android.content.Context r2 = r9     // Catch:{ Throwable -> 0x032c }
                                    r0.mo24883c(r2)     // Catch:{ Throwable -> 0x032c }
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this     // Catch:{ Throwable -> 0x032c }
                                    java.util.concurrent.atomic.AtomicBoolean r0 = r0.f34620i     // Catch:{ Throwable -> 0x032c }
                                    r2 = 0
                                    r0.getAndSet(r2)     // Catch:{ Throwable -> 0x032c }
                                    return
                                L_0x032c:
                                    com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p883a.C13273e.this
                                    java.util.concurrent.atomic.AtomicBoolean r0 = r0.f34620i
                                    r2 = 0
                                    r0.getAndSet(r2)
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p883a.C13273e.C132741.run():void");
                            }
                        }, false);
                        C9827f.m19663b().mo17665b(aVar);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m26717a(Context context, String str, JSONObject jSONObject) {
        if (context != null && !C9431p.m18664a(str) && jSONObject != null) {
            try {
                if (f34611p) {
                    C13303d.m26799b().mo24903a(str, jSONObject);
                } else {
                    f34610o.offer(new Pair(str, jSONObject));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo24878a(Context context, String str, long j, String str2, int i, String str3, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.f34624n.get());
            jSONObject.put("from", str);
            jSONObject.put("time", j);
            jSONObject.put("host", str2);
            jSONObject.put("cost", i);
            jSONObject.put("scheme", str3);
            jSONObject.put("status", i2);
            m26717a(context, "ss_net_channel_select_result", jSONObject);
        } catch (Throwable unused) {
        }
    }
}
