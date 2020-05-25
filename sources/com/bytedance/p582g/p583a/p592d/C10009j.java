package com.bytedance.p582g.p583a.p592d;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.p582g.p583a.p585b.C9956b;
import com.bytedance.p582g.p583a.p585b.C9967d;
import com.bytedance.p582g.p583a.p585b.p586a.C9954b;
import com.bytedance.p582g.p583a.p585b.p588c.C9964c;
import com.bytedance.p582g.p583a.p585b.p589d.C9968a;
import com.bytedance.p582g.p583a.p585b.p589d.C9968a.C9971b;
import com.bytedance.p582g.p583a.p585b.p590e.C9981c;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.g.a.d.j */
public class C10009j implements C9954b, C9964c, C9971b {

    /* renamed from: A */
    private volatile List<Pattern> f27165A;

    /* renamed from: B */
    private volatile int f27166B = 1;

    /* renamed from: C */
    private volatile long f27167C;

    /* renamed from: D */
    private volatile boolean f27168D;

    /* renamed from: E */
    private volatile long f27169E = 0;

    /* renamed from: F */
    private volatile long f27170F = 0;

    /* renamed from: G */
    private volatile int f27171G = 0;

    /* renamed from: H */
    private volatile boolean f27172H;

    /* renamed from: I */
    private volatile long f27173I;

    /* renamed from: a */
    Context f27174a;

    /* renamed from: b */
    JSONObject f27175b;

    /* renamed from: c */
    public C9967d f27176c;

    /* renamed from: d */
    public C9956b f27177d;

    /* renamed from: e */
    volatile long f27178e;

    /* renamed from: f */
    volatile int f27179f;

    /* renamed from: g */
    C10019b f27180g;

    /* renamed from: h */
    public Map<String, String> f27181h;

    /* renamed from: i */
    public List<String> f27182i = new LinkedList();

    /* renamed from: j */
    public volatile boolean f27183j = true;

    /* renamed from: k */
    public volatile boolean f27184k;

    /* renamed from: l */
    public volatile boolean f27185l;

    /* renamed from: m */
    List<String> f27186m = new LinkedList();

    /* renamed from: n */
    public C9997b f27187n;

    /* renamed from: o */
    String f27188o;

    /* renamed from: p */
    private volatile long f27189p;

    /* renamed from: q */
    private volatile int f27190q;

    /* renamed from: r */
    private volatile int f27191r;

    /* renamed from: s */
    private volatile int f27192s;

    /* renamed from: t */
    private volatile int f27193t;

    /* renamed from: u */
    private volatile JSONObject f27194u;

    /* renamed from: v */
    private volatile JSONObject f27195v;

    /* renamed from: w */
    private volatile int f27196w;

    /* renamed from: x */
    private volatile List<String> f27197x;

    /* renamed from: y */
    private volatile List<Pattern> f27198y;

    /* renamed from: z */
    private volatile List<String> f27199z;

    /* renamed from: com.bytedance.g.a.d.j$a */
    public interface C10018a {
        /* renamed from: a */
        String mo7396a();
    }

    /* renamed from: com.bytedance.g.a.d.j$b */
    public interface C10019b {
        /* renamed from: a */
        String mo17990a();
    }

    /* renamed from: c */
    public final JSONObject mo17915c() {
        return this.f27175b;
    }

    /* renamed from: a */
    public final boolean mo17986a(final Context context, final JSONObject jSONObject, final C10019b bVar) {
        this.f27184k = true;
        C9968a.m20054a().mo17941a(new Runnable() {
            /* JADX WARNING: Can't wrap try/catch for region: R(19:4|5|(1:7)|8|(1:10)(1:11)|12|(2:(1:15)|16)|17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)(1:29)|30|(4:32|33|(1:35)|36)|37|38) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x01bd */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r9 = this;
                    com.bytedance.g.a.d.j r0 = com.bytedance.p582g.p583a.p592d.C10009j.this
                    android.content.Context r1 = r4
                    org.json.JSONObject r2 = r5
                    com.bytedance.g.a.d.j$b r3 = r6
                    if (r1 == 0) goto L_0x01c2
                    if (r2 != 0) goto L_0x000e
                    goto L_0x01c2
                L_0x000e:
                    r4 = 1
                    r0.f27184k = r4
                    android.content.Context r5 = r1.getApplicationContext()
                    r0.f27174a = r5
                    r0.f27175b = r2
                    org.json.JSONObject r2 = r0.f27175b     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r5 = "aid"
                    java.lang.String r6 = r0.f27188o     // Catch:{ Exception -> 0x01c1 }
                    r2.put(r5, r6)     // Catch:{ Exception -> 0x01c1 }
                    org.json.JSONObject r2 = r0.f27175b     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r5 = "os"
                    java.lang.String r6 = "Android"
                    r2.put(r5, r6)     // Catch:{ Exception -> 0x01c1 }
                    org.json.JSONObject r2 = r0.f27175b     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r5 = "device_platform"
                    java.lang.String r6 = "android"
                    r2.put(r5, r6)     // Catch:{ Exception -> 0x01c1 }
                    org.json.JSONObject r2 = r0.f27175b     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r5 = "os_version"
                    java.lang.String r6 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x01c1 }
                    r2.put(r5, r6)     // Catch:{ Exception -> 0x01c1 }
                    org.json.JSONObject r2 = r0.f27175b     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r5 = "os_api"
                    int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01c1 }
                    r2.put(r5, r6)     // Catch:{ Exception -> 0x01c1 }
                    org.json.JSONObject r2 = r0.f27175b     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r5 = "device_model"
                    java.lang.String r6 = android.os.Build.MODEL     // Catch:{ Exception -> 0x01c1 }
                    r2.put(r5, r6)     // Catch:{ Exception -> 0x01c1 }
                    org.json.JSONObject r2 = r0.f27175b     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r5 = "device_brand"
                    java.lang.String r6 = android.os.Build.BRAND     // Catch:{ Exception -> 0x01c1 }
                    r2.put(r5, r6)     // Catch:{ Exception -> 0x01c1 }
                    org.json.JSONObject r2 = r0.f27175b     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r5 = "device_manufacturer"
                    java.lang.String r6 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x01c1 }
                    r2.put(r5, r6)     // Catch:{ Exception -> 0x01c1 }
                    org.json.JSONObject r2 = r0.f27175b     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r5 = "sdkmonitor_version"
                    java.lang.String r6 = "2.0.20-oversea"
                    r2.put(r5, r6)     // Catch:{ Exception -> 0x01c1 }
                    org.json.JSONObject r2 = r0.f27175b     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r5 = "monitor_from"
                    java.lang.String r6 = "sdk"
                    r2.put(r5, r6)     // Catch:{ Exception -> 0x01c1 }
                    org.json.JSONObject r2 = r0.f27175b     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r5 = "package_name"
                    java.lang.String r2 = r2.optString(r5)     // Catch:{ Exception -> 0x01c1 }
                    boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x01c1 }
                    if (r2 == 0) goto L_0x008c
                    org.json.JSONObject r2 = r0.f27175b     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r5 = "package_name"
                    java.lang.String r1 = r1.getPackageName()     // Catch:{ Exception -> 0x01c1 }
                    r2.put(r5, r1)     // Catch:{ Exception -> 0x01c1 }
                L_0x008c:
                    org.json.JSONObject r1 = r0.f27175b     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r2 = "version_name"
                    java.lang.String r1 = r1.optString(r2)     // Catch:{ Exception -> 0x01c1 }
                    boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x01c1 }
                    r2 = 0
                    r5 = 0
                    if (r1 == 0) goto L_0x00b6
                    android.content.Context r1 = r0.f27174a     // Catch:{ Exception -> 0x01c1 }
                    android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ Exception -> 0x01c1 }
                    android.content.Context r6 = r0.f27174a     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r6 = r6.getPackageName()     // Catch:{ Exception -> 0x01c1 }
                    android.content.pm.PackageInfo r1 = r1.getPackageInfo(r6, r5)     // Catch:{ Exception -> 0x01c1 }
                    org.json.JSONObject r6 = r0.f27175b     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r7 = "version_name"
                    java.lang.String r8 = r1.versionName     // Catch:{ Exception -> 0x01c1 }
                    r6.put(r7, r8)     // Catch:{ Exception -> 0x01c1 }
                    goto L_0x00b7
                L_0x00b6:
                    r1 = r2
                L_0x00b7:
                    org.json.JSONObject r6 = r0.f27175b     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r7 = "version_code"
                    java.lang.String r6 = r6.optString(r7)     // Catch:{ Exception -> 0x01c1 }
                    boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x01c1 }
                    if (r6 == 0) goto L_0x00e0
                    if (r1 != 0) goto L_0x00d7
                    android.content.Context r1 = r0.f27174a     // Catch:{ Exception -> 0x01c1 }
                    android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ Exception -> 0x01c1 }
                    android.content.Context r6 = r0.f27174a     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r6 = r6.getPackageName()     // Catch:{ Exception -> 0x01c1 }
                    android.content.pm.PackageInfo r1 = r1.getPackageInfo(r6, r5)     // Catch:{ Exception -> 0x01c1 }
                L_0x00d7:
                    org.json.JSONObject r6 = r0.f27175b     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r7 = "version_code"
                    int r1 = r1.versionCode     // Catch:{ Exception -> 0x01c1 }
                    r6.put(r7, r1)     // Catch:{ Exception -> 0x01c1 }
                L_0x00e0:
                    r0.f27180g = r3     // Catch:{ Exception -> 0x01c1 }
                    com.bytedance.g.a.d.j$b r1 = r0.f27180g     // Catch:{ Exception -> 0x01c1 }
                    if (r1 != 0) goto L_0x00ed
                    com.bytedance.g.a.d.j$5 r1 = new com.bytedance.g.a.d.j$5     // Catch:{ Exception -> 0x01c1 }
                    r1.<init>()     // Catch:{ Exception -> 0x01c1 }
                    r0.f27180g = r1     // Catch:{ Exception -> 0x01c1 }
                L_0x00ed:
                    r0.f27181h = r2     // Catch:{ Exception -> 0x01c1 }
                    java.util.Map<java.lang.String, java.lang.String> r1 = r0.f27181h     // Catch:{ Exception -> 0x01c1 }
                    if (r1 != 0) goto L_0x00fa
                    java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Exception -> 0x01c1 }
                    r1.<init>()     // Catch:{ Exception -> 0x01c1 }
                    r0.f27181h = r1     // Catch:{ Exception -> 0x01c1 }
                L_0x00fa:
                    java.util.Map<java.lang.String, java.lang.String> r1 = r0.f27181h     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r3 = "aid"
                    java.lang.String r6 = r0.f27188o     // Catch:{ Exception -> 0x01c1 }
                    r1.put(r3, r6)     // Catch:{ Exception -> 0x01c1 }
                    java.util.Map<java.lang.String, java.lang.String> r1 = r0.f27181h     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r3 = "device_id"
                    org.json.JSONObject r6 = r0.f27175b     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r7 = "device_id"
                    java.lang.String r6 = r6.optString(r7)     // Catch:{ Exception -> 0x01c1 }
                    r1.put(r3, r6)     // Catch:{ Exception -> 0x01c1 }
                    java.util.Map<java.lang.String, java.lang.String> r1 = r0.f27181h     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r3 = "device_platform"
                    java.lang.String r6 = "android"
                    r1.put(r3, r6)     // Catch:{ Exception -> 0x01c1 }
                    java.util.Map<java.lang.String, java.lang.String> r1 = r0.f27181h     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r3 = "package_name"
                    org.json.JSONObject r6 = r0.f27175b     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r7 = "package_name"
                    java.lang.String r6 = r6.optString(r7)     // Catch:{ Exception -> 0x01c1 }
                    r1.put(r3, r6)     // Catch:{ Exception -> 0x01c1 }
                    java.util.Map<java.lang.String, java.lang.String> r1 = r0.f27181h     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r3 = "channel"
                    org.json.JSONObject r6 = r0.f27175b     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r7 = "channel"
                    java.lang.String r6 = r6.optString(r7)     // Catch:{ Exception -> 0x01c1 }
                    r1.put(r3, r6)     // Catch:{ Exception -> 0x01c1 }
                    java.util.Map<java.lang.String, java.lang.String> r1 = r0.f27181h     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r3 = "app_version"
                    org.json.JSONObject r6 = r0.f27175b     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r7 = "app_version"
                    java.lang.String r6 = r6.optString(r7)     // Catch:{ Exception -> 0x01c1 }
                    r1.put(r3, r6)     // Catch:{ Exception -> 0x01c1 }
                    java.util.Map<java.lang.String, java.lang.String> r1 = r0.f27181h     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r3 = "sdkmonitor_version"
                    java.lang.String r6 = "2.0.20-oversea"
                    r1.put(r3, r6)     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r1 = r0.f27188o     // Catch:{ Exception -> 0x01c1 }
                    java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.g.a.b.a.b> r3 = com.bytedance.p582g.p583a.p585b.p586a.C9955c.f27036b     // Catch:{ Exception -> 0x01c1 }
                    r3.put(r1, r0)     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r1 = r0.f27188o     // Catch:{ Exception -> 0x01c1 }
                    java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.g.a.b.c.c> r3 = com.bytedance.p582g.p583a.p585b.p588c.C9965d.f27075a     // Catch:{ Exception -> 0x01c1 }
                    r3.put(r1, r0)     // Catch:{ Exception -> 0x01c1 }
                    com.bytedance.g.a.d.j$7 r1 = new com.bytedance.g.a.d.j$7     // Catch:{ Exception -> 0x01c1 }
                    r1.<init>()     // Catch:{ Exception -> 0x01c1 }
                    boolean r3 = com.bytedance.p582g.p583a.p591c.C9990c.f27122b     // Catch:{ Exception -> 0x01c1 }
                    if (r3 != 0) goto L_0x016c
                    com.bytedance.p582g.p583a.p591c.C9990c.f27121a = r1     // Catch:{ Exception -> 0x01c1 }
                    com.bytedance.p582g.p583a.p591c.C9990c.f27122b = r4     // Catch:{ Exception -> 0x01c1 }
                L_0x016c:
                    com.bytedance.g.a.b.d r1 = new com.bytedance.g.a.b.d     // Catch:{ Exception -> 0x01c1 }
                    android.content.Context r3 = r0.f27174a     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r6 = r0.f27188o     // Catch:{ Exception -> 0x01c1 }
                    r1.<init>(r3, r6)     // Catch:{ Exception -> 0x01c1 }
                    r0.f27176c = r1     // Catch:{ Exception -> 0x01c1 }
                    com.bytedance.g.a.b.d r1 = r0.f27176c     // Catch:{ Exception -> 0x01c1 }
                    com.bytedance.g.a.b.d.a r3 = com.bytedance.p582g.p583a.p585b.p589d.C9968a.m20054a()     // Catch:{ Exception -> 0x01c1 }
                    r3.mo17939a(r1)     // Catch:{ Exception -> 0x01c1 }
                    android.content.SharedPreferences r1 = r0.mo17989h()     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r3 = "monitor_net_config"
                    java.lang.String r2 = r1.getString(r3, r2)     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r3 = "monitor_configure_refresh_time"
                    r6 = 0
                    long r6 = r1.getLong(r3, r6)     // Catch:{ Exception -> 0x01c1 }
                    r0.f27178e = r6     // Catch:{ Exception -> 0x01c1 }
                    java.lang.String r3 = "monitor_config_update"
                    int r1 = r1.getInt(r3, r5)     // Catch:{ Exception -> 0x01c1 }
                    if (r1 != r4) goto L_0x019e
                    r1 = 1
                    goto L_0x019f
                L_0x019e:
                    r1 = 0
                L_0x019f:
                    com.bytedance.g.a.b.d.a r3 = com.bytedance.p582g.p583a.p585b.p589d.C9968a.m20054a()     // Catch:{ Exception -> 0x01c1 }
                    r3.mo17939a(r0)     // Catch:{ Exception -> 0x01c1 }
                    boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x01c1 }
                    if (r3 != 0) goto L_0x01bd
                    r0.f27185l = r4     // Catch:{ Exception -> 0x01bd }
                    org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x01bd }
                    r3.<init>(r2)     // Catch:{ Exception -> 0x01bd }
                    if (r1 != 0) goto L_0x01ba
                    java.lang.String r1 = "report_host_new"
                    r3.remove(r1)     // Catch:{ Exception -> 0x01bd }
                L_0x01ba:
                    r0.mo17984a(r3)     // Catch:{ Exception -> 0x01bd }
                L_0x01bd:
                    r0.mo17985a(r5)     // Catch:{ Exception -> 0x01c1 }
                    goto L_0x01c2
                L_0x01c1:
                L_0x01c2:
                    com.bytedance.g.a.d.j r0 = com.bytedance.p582g.p583a.p592d.C10009j.this
                    boolean r0 = r0.f27185l
                    if (r0 == 0) goto L_0x01d1
                    com.bytedance.g.a.d.j r0 = com.bytedance.p582g.p583a.p592d.C10009j.this
                    com.bytedance.g.a.d.b r0 = r0.f27187n
                    com.bytedance.g.a.d.j r1 = com.bytedance.p582g.p583a.p592d.C10009j.this
                    r0.mo17968a(r1)
                L_0x01d1:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p582g.p583a.p592d.C10009j.C100134.run():void");
            }
        }, 5000);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17985a(boolean z) {
        if (this.f27189p < 600) {
            this.f27189p = 600;
        }
        if (m20132i() && C10004h.m20120b(this.f27174a)) {
            synchronized (C10009j.class) {
                this.f27178e = System.currentTimeMillis();
            }
            try {
                C9968a.m20054a().mo17940a((Runnable) new Runnable() {
                    public final void run() {
                        byte[] bArr;
                        try {
                            if (C10009j.this.f27181h != null) {
                                Iterator it = C10009j.this.f27182i.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    StringBuilder b = C10009j.this.mo17987b((String) it.next());
                                    b.append("&oversea=1&encrypt=close");
                                    String sb = b.toString();
                                    try {
                                        boolean z = C10009j.this.f27183j;
                                        if (TextUtils.isDigitsOnly(sb)) {
                                            bArr = null;
                                        } else {
                                            bArr = C10004h.m20119a(sb, null, null, null, "GET", false, z);
                                        }
                                        if (bArr != null) {
                                            C10009j jVar = C10009j.this;
                                            JSONObject jSONObject = new JSONObject(new String(bArr));
                                            if (jSONObject.length() > 0) {
                                                try {
                                                    jVar.mo17984a(jSONObject.getJSONObject("data"));
                                                    Editor edit = jVar.mo17989h().edit();
                                                    edit.putLong("monitor_configure_refresh_time", System.currentTimeMillis());
                                                    edit.putInt("monitor_config_update", 1);
                                                    edit.putString("monitor_net_config", jSONObject.getJSONObject("data").toString());
                                                    edit.apply();
                                                    if (!jVar.f27185l) {
                                                        jVar.f27185l = true;
                                                        jVar.f27187n.mo17968a(jVar);
                                                    }
                                                } catch (Throwable unused) {
                                                }
                                            }
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }
                        } catch (Throwable unused3) {
                            if (!C10009j.this.f27185l) {
                                C10009j.this.f27185l = true;
                                C10009j.this.f27187n.mo17968a(C10009j.this);
                            }
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(25:19|20|21|22|23|(3:27|(1:(2:29|(1:86)(2:31|(2:87|33)(3:34|(2:38|88)|39)))(0))|40)(0)|41|42|(1:44)|45|(1:47)(1:48)|49|(1:51)(1:52)|53|(1:55)|56|(1:61)(1:60)|(1:63)|64|(1:69)(1:68)|(1:71)|72|(1:77)(1:76)|78|(1:80)) */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d3, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0073 */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01cc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo17984a(org.json.JSONObject r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            if (r9 != 0) goto L_0x0005
            monitor-exit(r8)
            return
        L_0x0005:
            java.lang.String r0 = "fetch_setting_interval"
            r1 = 1200(0x4b0, double:5.93E-321)
            long r0 = r9.optLong(r0, r1)     // Catch:{ all -> 0x01d4 }
            r8.f27189p = r0     // Catch:{ all -> 0x01d4 }
            long r0 = r8.f27189p     // Catch:{ all -> 0x01d4 }
            r2 = 600(0x258, double:2.964E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0019
            r8.f27189p = r2     // Catch:{ all -> 0x01d4 }
        L_0x0019:
            boolean r0 = r8.m20132i()     // Catch:{ all -> 0x01d4 }
            if (r0 == 0) goto L_0x0021
            monitor-exit(r8)
            return
        L_0x0021:
            int r0 = r9.length()     // Catch:{ all -> 0x01d4 }
            r1 = 0
            if (r0 > 0) goto L_0x002c
            r8.f27186m = r1     // Catch:{ all -> 0x01d4 }
            monitor-exit(r8)
            return
        L_0x002c:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01d4 }
            r0.<init>()     // Catch:{ all -> 0x01d4 }
            r2 = 0
            java.lang.String r3 = "report_host_new"
            org.json.JSONArray r3 = r9.optJSONArray(r3)     // Catch:{ Exception -> 0x0073 }
            if (r3 == 0) goto L_0x0073
            int r4 = r3.length()     // Catch:{ Exception -> 0x0073 }
            if (r4 <= 0) goto L_0x0073
            int r4 = r3.length()     // Catch:{ Exception -> 0x0073 }
            r5 = 0
        L_0x0045:
            if (r5 >= r4) goto L_0x0073
            java.lang.String r6 = r3.getString(r5)     // Catch:{ Exception -> 0x0073 }
            java.lang.String r7 = ".snssdk."
            boolean r7 = r6.contains(r7)     // Catch:{ Exception -> 0x0073 }
            if (r7 != 0) goto L_0x0070
            java.lang.String r7 = ".toutiao."
            boolean r7 = r6.contains(r7)     // Catch:{ Exception -> 0x0073 }
            if (r7 == 0) goto L_0x005c
            goto L_0x0070
        L_0x005c:
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0073 }
            if (r7 != 0) goto L_0x006d
            r7 = 46
            int r7 = r6.indexOf(r7)     // Catch:{ Exception -> 0x0073 }
            if (r7 <= 0) goto L_0x006d
            r0.add(r6)     // Catch:{ Exception -> 0x0073 }
        L_0x006d:
            int r5 = r5 + 1
            goto L_0x0045
        L_0x0070:
            r0.clear()     // Catch:{ Exception -> 0x0073 }
        L_0x0073:
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x01d4 }
            if (r3 != 0) goto L_0x007b
            r8.f27186m = r0     // Catch:{ all -> 0x01d4 }
        L_0x007b:
            java.lang.String r0 = "polling_interval"
            r3 = 120(0x78, float:1.68E-43)
            int r0 = r9.optInt(r0, r3)     // Catch:{ all -> 0x01d4 }
            r8.f27190q = r0     // Catch:{ all -> 0x01d4 }
            int r0 = r8.f27190q     // Catch:{ all -> 0x01d4 }
            if (r0 >= 0) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            int r3 = r8.f27190q     // Catch:{ all -> 0x01d4 }
        L_0x008c:
            r8.f27190q = r3     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = "once_max_count"
            r3 = 100
            int r0 = r9.optInt(r0, r3)     // Catch:{ all -> 0x01d4 }
            r8.f27191r = r0     // Catch:{ all -> 0x01d4 }
            int r0 = r8.f27191r     // Catch:{ all -> 0x01d4 }
            if (r0 >= 0) goto L_0x009d
            goto L_0x009f
        L_0x009d:
            int r3 = r8.f27191r     // Catch:{ all -> 0x01d4 }
        L_0x009f:
            r8.f27191r = r3     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = "max_retry_count"
            r3 = 4
            int r0 = r9.optInt(r0, r3)     // Catch:{ all -> 0x01d4 }
            r8.f27192s = r0     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = "report_fail_base_time"
            r3 = 15
            int r0 = r9.optInt(r0, r3)     // Catch:{ all -> 0x01d4 }
            r8.f27193t = r0     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = "log_send_switch"
            r3 = 1
            int r0 = r9.optInt(r0, r3)     // Catch:{ all -> 0x01d4 }
            r8.f27166B = r0     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = "more_channel_stop_interval"
            r4 = 1800(0x708, double:8.893E-321)
            long r4 = r9.optLong(r0, r4)     // Catch:{ all -> 0x01d4 }
            r8.f27167C = r4     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = "log_remvove_switch"
            boolean r0 = r9.optBoolean(r0, r2)     // Catch:{ all -> 0x01d4 }
            r8.f27168D = r0     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = "allow_service_name"
            org.json.JSONObject r0 = r9.optJSONObject(r0)     // Catch:{ all -> 0x01d4 }
            r8.f27194u = r0     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = "allow_log_type"
            org.json.JSONObject r0 = r9.optJSONObject(r0)     // Catch:{ all -> 0x01d4 }
            r8.f27195v = r0     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = "monitor_encrypt_switch"
            boolean r0 = r9.optBoolean(r0, r3)     // Catch:{ all -> 0x01d4 }
            r8.f27183j = r0     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = "monitor_log_max_save_count"
            r3 = 2000(0x7d0, double:9.88E-321)
            long r3 = r9.optLong(r0, r3)     // Catch:{ all -> 0x01d4 }
            r8.f27173I = r3     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = "disable_report_error"
            int r0 = r9.optInt(r0, r2)     // Catch:{ all -> 0x01d4 }
            r8.f27179f = r0     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = "enable_net_stats"
            int r0 = r9.optInt(r0, r2)     // Catch:{ all -> 0x01d4 }
            r8.f27196w = r0     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = "api_black_list"
            java.util.List r0 = com.bytedance.p582g.p583a.p592d.C10002f.m20112a(r9, r0)     // Catch:{ all -> 0x01d4 }
            r8.f27197x = r0     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = "api_black_list"
            java.util.List r0 = com.bytedance.p582g.p583a.p592d.C10002f.m20114b(r9, r0)     // Catch:{ all -> 0x01d4 }
            r8.f27198y = r0     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = "api_allow_list"
            java.util.List r0 = com.bytedance.p582g.p583a.p592d.C10002f.m20112a(r9, r0)     // Catch:{ all -> 0x01d4 }
            r8.f27199z = r0     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = "api_allow_list"
            java.util.List r9 = com.bytedance.p582g.p583a.p592d.C10002f.m20114b(r9, r0)     // Catch:{ all -> 0x01d4 }
            r8.f27165A = r9     // Catch:{ all -> 0x01d4 }
            com.bytedance.g.a.b.b r9 = r8.f27177d     // Catch:{ all -> 0x01d4 }
            if (r9 != 0) goto L_0x0149
            com.bytedance.g.a.b.b r9 = new com.bytedance.g.a.b.b     // Catch:{ all -> 0x01d4 }
            android.content.Context r0 = r8.f27174a     // Catch:{ all -> 0x01d4 }
            java.lang.String r2 = r8.f27188o     // Catch:{ all -> 0x01d4 }
            r9.<init>(r0, r2)     // Catch:{ all -> 0x01d4 }
            r8.f27177d = r9     // Catch:{ all -> 0x01d4 }
            com.bytedance.g.a.b.b r9 = r8.f27177d     // Catch:{ all -> 0x01d4 }
            com.bytedance.g.a.b.d.a r0 = com.bytedance.p582g.p583a.p585b.p589d.C9968a.m20054a()     // Catch:{ all -> 0x01d4 }
            r0.mo17939a(r9)     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = r9.f27040d     // Catch:{ all -> 0x01d4 }
            com.bytedance.g.a.b.c.a r2 = new com.bytedance.g.a.b.c.a     // Catch:{ all -> 0x01d4 }
            android.content.Context r3 = r9.f27041e     // Catch:{ all -> 0x01d4 }
            java.lang.String r9 = r9.f27040d     // Catch:{ all -> 0x01d4 }
            r2.<init>(r3, r9)     // Catch:{ all -> 0x01d4 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.g.a.b.c.b> r9 = com.bytedance.p582g.p583a.p585b.p588c.C9965d.f27076b     // Catch:{ all -> 0x01d4 }
            r9.put(r0, r2)     // Catch:{ all -> 0x01d4 }
        L_0x0149:
            com.bytedance.g.a.b.b r9 = r8.f27177d     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = r9.f27040d     // Catch:{ all -> 0x01d4 }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01d4 }
            if (r2 != 0) goto L_0x0168
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.g.a.b.a.b> r2 = com.bytedance.p582g.p583a.p585b.p586a.C9955c.f27036b     // Catch:{ all -> 0x01d4 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x01d4 }
            if (r2 == 0) goto L_0x0168
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.g.a.b.a.b> r2 = com.bytedance.p582g.p583a.p585b.p586a.C9955c.f27036b     // Catch:{ all -> 0x01d4 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x01d4 }
            com.bytedance.g.a.b.a.b r0 = (com.bytedance.p582g.p583a.p585b.p586a.C9954b) r0     // Catch:{ all -> 0x01d4 }
            int r0 = r0.mo17912a()     // Catch:{ all -> 0x01d4 }
            goto L_0x016e
        L_0x0168:
            com.bytedance.g.a.b.a.b r0 = com.bytedance.p582g.p583a.p585b.p586a.C9955c.f27035a     // Catch:{ all -> 0x01d4 }
            int r0 = r0.mo17912a()     // Catch:{ all -> 0x01d4 }
        L_0x016e:
            if (r0 <= 0) goto L_0x0172
            r9.f27038b = r0     // Catch:{ all -> 0x01d4 }
        L_0x0172:
            java.lang.String r0 = r9.f27040d     // Catch:{ all -> 0x01d4 }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01d4 }
            if (r2 != 0) goto L_0x018f
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.g.a.b.a.b> r2 = com.bytedance.p582g.p583a.p585b.p586a.C9955c.f27036b     // Catch:{ all -> 0x01d4 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x01d4 }
            if (r2 == 0) goto L_0x018f
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.g.a.b.a.b> r2 = com.bytedance.p582g.p583a.p585b.p586a.C9955c.f27036b     // Catch:{ all -> 0x01d4 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x01d4 }
            com.bytedance.g.a.b.a.b r0 = (com.bytedance.p582g.p583a.p585b.p586a.C9954b) r0     // Catch:{ all -> 0x01d4 }
            int r0 = r0.mo17914b()     // Catch:{ all -> 0x01d4 }
            goto L_0x0195
        L_0x018f:
            com.bytedance.g.a.b.a.b r0 = com.bytedance.p582g.p583a.p585b.p586a.C9955c.f27035a     // Catch:{ all -> 0x01d4 }
            int r0 = r0.mo17914b()     // Catch:{ all -> 0x01d4 }
        L_0x0195:
            if (r0 <= 0) goto L_0x0199
            r9.f27039c = r0     // Catch:{ all -> 0x01d4 }
        L_0x0199:
            java.lang.String r0 = r9.f27040d     // Catch:{ all -> 0x01d4 }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01d4 }
            if (r2 != 0) goto L_0x01b6
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.g.a.b.a.b> r2 = com.bytedance.p582g.p583a.p585b.p586a.C9955c.f27036b     // Catch:{ all -> 0x01d4 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x01d4 }
            if (r2 == 0) goto L_0x01b6
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.g.a.b.a.b> r2 = com.bytedance.p582g.p583a.p585b.p586a.C9955c.f27036b     // Catch:{ all -> 0x01d4 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x01d4 }
            com.bytedance.g.a.b.a.b r0 = (com.bytedance.p582g.p583a.p585b.p586a.C9954b) r0     // Catch:{ all -> 0x01d4 }
            org.json.JSONObject r0 = r0.mo17915c()     // Catch:{ all -> 0x01d4 }
            goto L_0x01bc
        L_0x01b6:
            com.bytedance.g.a.b.a.b r0 = com.bytedance.p582g.p583a.p585b.p586a.C9955c.f27035a     // Catch:{ all -> 0x01d4 }
            org.json.JSONObject r0 = r0.mo17915c()     // Catch:{ all -> 0x01d4 }
        L_0x01bc:
            r9.f27042f = r0     // Catch:{ all -> 0x01d4 }
            java.lang.String r9 = r9.f27040d     // Catch:{ all -> 0x01d4 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.g.a.b.c.b> r0 = com.bytedance.p582g.p583a.p585b.p588c.C9965d.f27076b     // Catch:{ all -> 0x01d4 }
            java.lang.Object r9 = r0.get(r9)     // Catch:{ all -> 0x01d4 }
            com.bytedance.g.a.b.c.b r9 = (com.bytedance.p582g.p583a.p585b.p588c.C9963b) r9     // Catch:{ all -> 0x01d4 }
            boolean r0 = r9 instanceof com.bytedance.p582g.p583a.p585b.p588c.C9959a     // Catch:{ all -> 0x01d4 }
            if (r0 == 0) goto L_0x01d2
            com.bytedance.g.a.b.c.a r9 = (com.bytedance.p582g.p583a.p585b.p588c.C9959a) r9     // Catch:{ all -> 0x01d4 }
            com.bytedance.g.a.c.a r9 = r9.f27063a     // Catch:{ all -> 0x01d4 }
            r9.f27111f = r1     // Catch:{ all -> 0x01d4 }
        L_0x01d2:
            monitor-exit(r8)
            return
        L_0x01d4:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p582g.p583a.p592d.C10009j.mo17984a(org.json.JSONObject):void");
    }

    /* renamed from: a */
    public final void mo17978a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            if (!this.f27185l) {
                C9997b bVar = this.f27187n;
                C10021l lVar = new C10021l(str, i, jSONObject, null, null, jSONObject2, System.currentTimeMillis());
                bVar.mo17969a(lVar);
                return;
            }
            m20128b(str, i, jSONObject, null, null, jSONObject2, System.currentTimeMillis());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo17982a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        mo17978a(str, 0, jSONObject, jSONObject2);
    }

    /* renamed from: a */
    public final void mo17983a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        try {
            if (!this.f27185l) {
                C9997b bVar = this.f27187n;
                C10021l lVar = new C10021l(str, 0, null, jSONObject, jSONObject2, jSONObject3, System.currentTimeMillis());
                bVar.mo17969a(lVar);
                return;
            }
            m20128b(str, 0, null, jSONObject, jSONObject2, jSONObject3, System.currentTimeMillis());
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17979a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, long j) {
        if (jSONObject4 == null) {
            try {
                jSONObject4 = new JSONObject();
            } catch (Throwable unused) {
                return;
            }
        }
        jSONObject4.put("log_type", "service_monitor");
        jSONObject4.put("service", str);
        jSONObject4.put("status", i);
        jSONObject4.put("network_type", m20133j());
        jSONObject4.put("value", jSONObject);
        if (jSONObject2 != null) {
            jSONObject4.put("category", jSONObject2);
        }
        if (jSONObject3 != null) {
            jSONObject4.put("metric", jSONObject3);
        }
        if (jSONObject4.isNull("timestamp")) {
            jSONObject4.put("timestamp", j);
        }
        if (!TextUtils.isEmpty(m20134k())) {
            jSONObject4.put("session_id", m20134k());
        }
        if (this.f27176c != null && m20129d(str)) {
            this.f27176c.mo17938a("service_monitor", "service_monitor", jSONObject4);
        }
    }

    /* renamed from: a */
    public final void mo17980a(String str, JSONObject jSONObject) {
        try {
            if (!this.f27185l) {
                this.f27187n.mo17967a(new C9999c(str, jSONObject, System.currentTimeMillis()));
                return;
            }
            final long currentTimeMillis = System.currentTimeMillis();
            C9968a a = C9968a.m20054a();
            final String str2 = str;
            final JSONObject jSONObject2 = jSONObject;
            C100112 r4 = new Runnable() {
                public final void run() {
                    C10009j.this.mo17981a(str2, jSONObject2, currentTimeMillis);
                }
            };
            a.mo17940a((Runnable) r4);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17981a(String str, JSONObject jSONObject, long j) {
        try {
            jSONObject.put("log_type", str);
            jSONObject.put("network_type", m20133j());
            if (!TextUtils.isEmpty(m20134k())) {
                jSONObject.put("session_id", m20134k());
            }
            if (jSONObject.isNull("timestamp")) {
                jSONObject.put("timestamp", j);
            }
            if (this.f27176c != null && m20130e(str)) {
                this.f27176c.mo17938a("common_log", "common_log", jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17976a(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        String str4 = str;
        if (!mo17988c(str4) && C10004h.m20120b(this.f27174a)) {
            JSONObject a = mo17975a("api_all", j, j2, str, str2, str3, i);
            m20126a(a, jSONObject);
            if ((a != null && m20131f(str4)) || this.f27196w != 0) {
                try {
                    a.put("hit_rules", 1);
                    this.f27176c.mo17938a("api_all", "api_all", a);
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: j */
    private int m20133j() {
        return C9981c.m20070a(this.f27174a).getValue();
    }

    /* renamed from: k */
    private String m20134k() {
        if (this.f27180g != null) {
            return this.f27180g.mo17990a();
        }
        return null;
    }

    /* renamed from: b */
    public final int mo17914b() {
        if (this.f27191r <= 0) {
            return 100;
        }
        return this.f27191r;
    }

    /* renamed from: d */
    public final int mo17916d() {
        if (this.f27192s <= 0) {
            return 4;
        }
        return this.f27192s;
    }

    /* renamed from: e */
    public final int mo17917e() {
        if (this.f27193t <= 0) {
            return 15;
        }
        return this.f27193t;
    }

    /* renamed from: g */
    public final boolean mo17919g() {
        if (this.f27172H) {
            return this.f27172H;
        }
        return this.f27168D;
    }

    /* renamed from: i */
    private boolean m20132i() {
        if ((System.currentTimeMillis() - this.f27178e) / 1000 > this.f27189p) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo17912a() {
        if (this.f27190q <= 0) {
            return 120;
        }
        return this.f27190q;
    }

    /* renamed from: f */
    public final long mo17918f() {
        if (this.f27167C == 0) {
            return 1800000;
        }
        return this.f27167C * 1000;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public SharedPreferences mo17989h() {
        String a = C10003g.m20115a(this.f27174a);
        Context context = this.f27174a;
        StringBuilder sb = new StringBuilder("monitor_config");
        sb.append(this.f27188o);
        sb.append(a);
        return C35807d.m80935a(context, sb.toString(), 0);
    }

    /* renamed from: a */
    public final List<String> mo17913a(String str) {
        return this.f27186m;
    }

    /* renamed from: f */
    private boolean m20131f(String str) {
        return m20127a(str, this.f27199z, this.f27165A);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo17988c(String str) {
        return m20127a(str, this.f27197x, this.f27198y);
    }

    /* renamed from: d */
    private boolean m20129d(String str) {
        if (this.f27194u == null || TextUtils.isEmpty(str) || this.f27194u.opt(str) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private boolean m20130e(String str) {
        if (this.f27195v == null || TextUtils.isEmpty(str) || this.f27195v.opt(str) == null) {
            return false;
        }
        return true;
    }

    protected C10009j(String str) {
        this.f27188o = str;
        this.f27185l = false;
        this.f27187n = new C9997b();
        this.f27182i.add("https://i.isnssdk.com/monitor/appmonitor/v2/settings");
        this.f27182i.add("https://mon.isnssdk.com/monitor/appmonitor/v2/settings");
        this.f27186m.add("https://i.isnssdk.com/monitor/collect/");
    }

    /* renamed from: b */
    public final StringBuilder mo17987b(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (TextUtils.isDigitsOnly(str) || this.f27181h == null) {
            return sb;
        }
        if (!str.contains("?")) {
            sb.append("?");
        }
        m20125a(sb, "sdk_version", "400");
        Map<String, String> map = this.f27181h;
        if (map != null && map.size() > 0) {
            for (Entry entry : map.entrySet()) {
                if (entry.getKey() != null) {
                    m20125a(sb, String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
                }
            }
        }
        return sb;
    }

    /* renamed from: a */
    public final void mo17920a(long j) {
        if (System.currentTimeMillis() - this.f27169E > this.f27170F) {
            this.f27172H = false;
            if (this.f27176c != null) {
                C9967d dVar = this.f27176c;
                boolean z = true;
                if (this.f27166B != 1) {
                    z = false;
                }
                dVar.f27079a = z;
            }
        }
        if (this.f27189p > 0) {
            mo17985a(false);
        }
    }

    /* renamed from: a */
    private static String m20124a(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    static void m20126a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null && jSONObject2.length() > 0) {
            try {
                Iterator keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    jSONObject.put(str, jSONObject2.get(str));
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo17977a(String str, int i, JSONObject jSONObject) {
        mo17978a(str, i, (JSONObject) null, jSONObject);
    }

    /* renamed from: a */
    private static StringBuilder m20125a(StringBuilder sb, String str, String str2) {
        if (sb.charAt(sb.length() - 1) != '?') {
            sb.append("&");
        }
        sb.append(m20124a(str, "UTF-8"));
        sb.append('=');
        sb.append(m20124a(str2, "UTF-8"));
        return sb;
    }

    /* renamed from: a */
    private static boolean m20127a(String str, List<String> list, List<Pattern> list2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!C10002f.m20113a(list)) {
            for (String contains : list) {
                if (str.contains(contains)) {
                    return true;
                }
            }
        }
        try {
            String path = new URI(str).getPath();
            if (!C10002f.m20113a(list2)) {
                for (Pattern matcher : list2) {
                    if (matcher.matcher(path).matches()) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:1|2|3|4|5|(1:7)|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x004b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.p582g.p583a.p585b.p588c.C9966e mo17937a(long r8, java.lang.String r10, byte[] r11, int r12, java.lang.String r13) {
        /*
            r7 = this;
            com.bytedance.g.a.b.c.e r8 = new com.bytedance.g.a.b.c.e
            r8.<init>()
            r9 = 0
            java.lang.StringBuilder r10 = r7.mo17987b(r10)     // Catch:{ Throwable -> 0x004e }
            java.lang.String r2 = r10.toString()     // Catch:{ Throwable -> 0x004e }
            r0 = 33554432(0x2000000, double:1.6578092E-316)
            com.bytedance.g.a.d.h$a r4 = com.bytedance.p582g.p583a.p592d.C10004h.C10005a.GZIP     // Catch:{ Throwable -> 0x004e }
            boolean r6 = r7.f27183j     // Catch:{ Throwable -> 0x004e }
            r3 = r11
            r5 = r13
            byte[] r10 = com.bytedance.p582g.p583a.p592d.C10004h.m20117a(r0, r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x004e }
            r7.f27171G = r9     // Catch:{ Throwable -> 0x004e }
            r11 = 0
            r7.f27170F = r11     // Catch:{ Throwable -> 0x004e }
            r11 = 200(0xc8, float:2.8E-43)
            r8.f27077a = r11     // Catch:{ Throwable -> 0x004e }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Throwable -> 0x004e }
            java.lang.String r12 = new java.lang.String     // Catch:{ Throwable -> 0x004e }
            r12.<init>(r10)     // Catch:{ Throwable -> 0x004e }
            r11.<init>(r12)     // Catch:{ Throwable -> 0x004e }
            java.lang.String r10 = "data"
            java.lang.String r10 = r11.optString(r10)     // Catch:{ Throwable -> 0x004b }
            boolean r12 = r10.isEmpty()     // Catch:{ Throwable -> 0x004b }
            if (r12 != 0) goto L_0x0049
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Throwable -> 0x004b }
            byte[] r10 = r10.getBytes()     // Catch:{ Throwable -> 0x004b }
            java.lang.String r10 = com.bytedance.p582g.p583a.p585b.p590e.C9978a.m20066a(r10)     // Catch:{ Throwable -> 0x004b }
            r12.<init>(r10)     // Catch:{ Throwable -> 0x004b }
            r11 = r12
        L_0x0049:
            r8.f27078b = r11     // Catch:{ Throwable -> 0x004b }
        L_0x004b:
            r8.f27078b = r11     // Catch:{ Throwable -> 0x004e }
            return r8
        L_0x004e:
            r10 = move-exception
            boolean r11 = r10 instanceof com.bytedance.p582g.p583a.p592d.C10000d
            if (r11 == 0) goto L_0x005c
            com.bytedance.g.a.d.d r10 = (com.bytedance.p582g.p583a.p592d.C10000d) r10
            int r10 = r10.getStatusCode()
            r8.f27077a = r10
            goto L_0x005f
        L_0x005c:
            r10 = -1
            r8.f27077a = r10
        L_0x005f:
            int r10 = r8.f27077a
            r11 = 503(0x1f7, float:7.05E-43)
            if (r10 == r11) goto L_0x006b
            int r10 = r8.f27077a
            r11 = 509(0x1fd, float:7.13E-43)
            if (r10 != r11) goto L_0x009e
        L_0x006b:
            r10 = 1
            r7.f27172H = r10
            long r11 = java.lang.System.currentTimeMillis()
            r7.f27169E = r11
            com.bytedance.g.a.b.d r11 = r7.f27176c
            r11.f27079a = r9
            com.bytedance.g.a.b.b r11 = r7.f27177d
            if (r11 == 0) goto L_0x0080
            com.bytedance.g.a.b.b r11 = r7.f27177d
            r11.f27037a = r9
        L_0x0080:
            int r9 = r7.f27171G
            if (r9 != 0) goto L_0x008a
            r11 = 300000(0x493e0, double:1.482197E-318)
            r7.f27170F = r11
            goto L_0x0099
        L_0x008a:
            int r9 = r7.f27171G
            if (r9 != r10) goto L_0x0094
            r11 = 900000(0xdbba0, double:4.44659E-318)
            r7.f27170F = r11
            goto L_0x0099
        L_0x0094:
            r11 = 1800000(0x1b7740, double:8.89318E-318)
            r7.f27170F = r11
        L_0x0099:
            int r9 = r7.f27171G
            int r9 = r9 + r10
            r7.f27171G = r9
        L_0x009e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p582g.p583a.p592d.C10009j.mo17937a(long, java.lang.String, byte[], int, java.lang.String):com.bytedance.g.a.b.c.e");
    }

    /* renamed from: b */
    private void m20128b(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, long j) {
        C9968a a = C9968a.m20054a();
        final String str2 = str;
        final int i2 = i;
        final JSONObject jSONObject5 = jSONObject;
        final JSONObject jSONObject6 = jSONObject2;
        final JSONObject jSONObject7 = jSONObject3;
        final JSONObject jSONObject8 = jSONObject4;
        final long j2 = j;
        C100178 r1 = new Runnable() {
            public final void run() {
                C10009j.this.mo17979a(str2, i2, jSONObject5, jSONObject6, jSONObject7, jSONObject8, j2);
            }
        };
        a.mo17940a((Runnable) r1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public JSONObject mo17975a(String str, long j, long j2, String str2, String str3, String str4, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_type", str);
            jSONObject.put("duration", j);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("uri", Uri.parse(str2));
            }
            if (j2 > 0) {
                jSONObject.put("timestamp", j2);
            }
            jSONObject.put("status", i);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("ip", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("trace_code", str4);
            } else {
                jSONObject.put("trace_code", "");
            }
            jSONObject.put("network_type", C10004h.m20116a(this.f27174a).getValue());
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
