package com.bytedance.ttnet.p884b;

import android.location.Address;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.common.utility.C9415i;
import com.bytedance.common.utility.C9425l;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p523c.C9393e;
import com.bytedance.frameworks.baselib.network.http.C9831a;
import com.bytedance.frameworks.baselib.network.http.C9894e;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9881f;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9881f.C9882a;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9881f.C9883b;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9881f.C9885d;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9881f.C9886e;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9881f.C9887f;
import com.bytedance.ttnet.C13303d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.b.a */
public abstract class C13287a implements ICronetAppProvider, ICronetDepend {

    /* renamed from: a */
    public C9881f f34667a;

    protected C13287a() {
    }

    /* renamed from: a */
    public void mo24892a(int i) {
    }

    /* renamed from: a */
    public void mo24893a(C9881f fVar) {
    }

    public void doLoadLibrary(String str) {
    }

    public String getAbClient() {
        return "";
    }

    public String getAbFeature() {
        return "";
    }

    public String getAbVersion() {
        return "";
    }

    public String getAppId() {
        return "-1";
    }

    public String getAppName() {
        return "";
    }

    public String getBypassBOEJSON() {
        return null;
    }

    public String getCarrierRegion() {
        return "";
    }

    public String getChannel() {
        return "";
    }

    public String getDeviceBrand() {
        return Build.BRAND;
    }

    public String getDeviceId() {
        return "";
    }

    public String getDevicePlatform() {
        return "android";
    }

    public String getDeviceType() {
        return Build.MODEL;
    }

    public String getGetDomainDefaultJSON() {
        return null;
    }

    public String getIId() {
        return "";
    }

    public String getOpenUdid() {
        return "";
    }

    public String getRegion() {
        return "";
    }

    public String getSdkAppId() {
        return "";
    }

    public String getSdkVersion() {
        return "";
    }

    public String getSsCookieKey() {
        return "X-SS-Cookie";
    }

    public String getSsmix() {
        return "a";
    }

    public String getStoreIdc() {
        return "";
    }

    public String getStoreIdcRuleJSON() {
        return null;
    }

    public String getSysRegion() {
        return "";
    }

    public String getUUID() {
        return "";
    }

    public String getUserId() {
        return "";
    }

    public String getVersionName() {
        return "";
    }

    public void loggerD(String str, String str2) {
    }

    public boolean needCustomLoadLibrary() {
        return false;
    }

    public void sendAppMonitorEvent(String str, String str2) {
    }

    public void setAdapter(ICronetDepend iCronetDepend) {
    }

    public String getAbFlag() {
        return String.valueOf("-1");
    }

    public String getManifestVersionCode() {
        return String.valueOf("-1");
    }

    public String getOSApi() {
        return String.valueOf(VERSION.SDK_INT);
    }

    public String getUpdateVersionCode() {
        return String.valueOf("-1");
    }

    public String getVersionCode() {
        return String.valueOf("-1");
    }

    public boolean loggerDebug() {
        return C9415i.m18635b();
    }

    public String getAbi() {
        if (VERSION.SDK_INT < 21) {
            return Build.CPU_ABI;
        }
        return Build.SUPPORTED_ABIS[0];
    }

    public String getLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public String getNetAccessType() {
        return C9425l.m18654e(C13303d.m26799b().mo24896a());
    }

    public String getRticket() {
        return String.valueOf(System.currentTimeMillis());
    }

    public final void onColdStartFinish() {
        new C9393e("NetWork-Event") {
            public final void run() {
                C13303d.m26801c();
            }
        }.start();
    }

    public final void onTNCUpdateFailed() {
        new C9393e("NetWork-Event") {
            /* JADX WARNING: Can't wrap try/catch for region: R(12:5|6|(2:12|(1:14))|15|16|(1:18)(1:19)|20|21|22|(1:24)|25|(2:27|50)(2:28|(1:51)(8:48|30|31|32|(1:36)|37|(1:41)|42))) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x008b */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x0093 A[Catch:{ Throwable -> 0x014f }] */
            /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5 A[Catch:{ Throwable -> 0x014f }] */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x00b7 A[Catch:{ Throwable -> 0x014f }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r12 = this;
                    com.bytedance.ttnet.p883a.C13271c.m26708a()
                    com.bytedance.ttnet.c r0 = com.bytedance.ttnet.C13303d.m26799b()
                    android.content.Context r0 = r0.mo24896a()
                    if (r0 == 0) goto L_0x0153
                    com.bytedance.ttnet.p883a.C13258a.m26660a(r0)
                    java.lang.String[] r1 = com.bytedance.ttnet.p883a.C13258a.m26677p()
                    int r2 = r1.length
                    r3 = 0
                    r4 = 0
                L_0x0017:
                    if (r4 >= r2) goto L_0x0153
                    r5 = r1[r4]
                    com.bytedance.ttnet.c.a r6 = new com.bytedance.ttnet.c.a     // Catch:{ Throwable -> 0x014f }
                    r6.<init>()     // Catch:{ Throwable -> 0x014f }
                    r7 = 1
                    r6.f34687h = r7     // Catch:{ Throwable -> 0x014f }
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x014f }
                    r8.<init>()     // Catch:{ Throwable -> 0x014f }
                    java.lang.String r9 = "https://"
                    r8.append(r9)     // Catch:{ Throwable -> 0x014f }
                    r8.append(r5)     // Catch:{ Throwable -> 0x014f }
                    java.lang.String r5 = "/get_domains/v4/"
                    r8.append(r5)     // Catch:{ Throwable -> 0x014f }
                    com.bytedance.ttnet.c r5 = com.bytedance.ttnet.C13303d.m26799b()     // Catch:{ Throwable -> 0x014f }
                    android.location.Address r5 = r5.mo24897a(r0)     // Catch:{ Throwable -> 0x014f }
                    com.bytedance.frameworks.baselib.network.http.e.k r9 = new com.bytedance.frameworks.baselib.network.http.e.k     // Catch:{ Throwable -> 0x014f }
                    java.lang.String r8 = r8.toString()     // Catch:{ Throwable -> 0x014f }
                    r9.<init>(r8)     // Catch:{ Throwable -> 0x014f }
                    if (r5 == 0) goto L_0x0079
                    boolean r8 = r5.hasLatitude()     // Catch:{ Throwable -> 0x014f }
                    if (r8 == 0) goto L_0x0079
                    boolean r8 = r5.hasLongitude()     // Catch:{ Throwable -> 0x014f }
                    if (r8 == 0) goto L_0x0079
                    java.lang.String r8 = "latitude"
                    double r10 = r5.getLatitude()     // Catch:{ Throwable -> 0x014f }
                    r9.mo17850a(r8, r10)     // Catch:{ Throwable -> 0x014f }
                    java.lang.String r8 = "longitude"
                    double r10 = r5.getLongitude()     // Catch:{ Throwable -> 0x014f }
                    r9.mo17850a(r8, r10)     // Catch:{ Throwable -> 0x014f }
                    java.lang.String r5 = r5.getLocality()     // Catch:{ Throwable -> 0x014f }
                    boolean r8 = com.bytedance.common.utility.C9431p.m18664a(r5)     // Catch:{ Throwable -> 0x014f }
                    if (r8 != 0) goto L_0x0079
                    java.lang.String r8 = "city"
                    java.lang.String r5 = android.net.Uri.encode(r5)     // Catch:{ Throwable -> 0x014f }
                    r9.mo17852a(r8, r5)     // Catch:{ Throwable -> 0x014f }
                L_0x0079:
                    int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x008b }
                    r8 = 21
                    if (r5 >= r8) goto L_0x0082
                    java.lang.String r5 = android.os.Build.CPU_ABI     // Catch:{ Throwable -> 0x008b }
                    goto L_0x0086
                L_0x0082:
                    java.lang.String[] r5 = android.os.Build.SUPPORTED_ABIS     // Catch:{ Throwable -> 0x008b }
                    r5 = r5[r3]     // Catch:{ Throwable -> 0x008b }
                L_0x0086:
                    java.lang.String r8 = "abi"
                    r9.mo17852a(r8, r5)     // Catch:{ Throwable -> 0x008b }
                L_0x008b:
                    java.lang.String r5 = com.bytedance.ttnet.p883a.C13271c.f34599a     // Catch:{ Throwable -> 0x014f }
                    boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x014f }
                    if (r5 != 0) goto L_0x009a
                    java.lang.String r5 = "cronet_version"
                    java.lang.String r8 = com.bytedance.ttnet.p883a.C13271c.f34599a     // Catch:{ Throwable -> 0x014f }
                    r9.mo17852a(r5, r8)     // Catch:{ Throwable -> 0x014f }
                L_0x009a:
                    java.lang.String r5 = "tnc_src"
                    java.lang.String r8 = "7"
                    r9.mo17852a(r5, r8)     // Catch:{ Throwable -> 0x014f }
                    java.lang.String r5 = r9.toString()     // Catch:{ Throwable -> 0x014f }
                    java.util.HashMap r8 = new java.util.HashMap     // Catch:{ Throwable -> 0x014f }
                    r8.<init>()     // Catch:{ Throwable -> 0x014f }
                    r9 = 0
                    java.lang.String r5 = com.bytedance.ttnet.p885c.C13299c.m26783a(r5, r9, r8, r6)     // Catch:{ Throwable -> 0x014f }
                    boolean r6 = com.bytedance.common.utility.C9431p.m18664a(r5)     // Catch:{ Throwable -> 0x014f }
                    if (r6 == 0) goto L_0x00b7
                    goto L_0x014f
                L_0x00b7:
                    org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Throwable -> 0x014f }
                    r6.<init>(r5)     // Catch:{ Throwable -> 0x014f }
                    java.lang.String r9 = "message"
                    java.lang.String r6 = r6.getString(r9)     // Catch:{ Throwable -> 0x014f }
                    java.lang.String r9 = "success"
                    boolean r6 = r9.equals(r6)     // Catch:{ Throwable -> 0x014f }
                    if (r6 != 0) goto L_0x00cc
                    goto L_0x014f
                L_0x00cc:
                    java.lang.String r1 = ""
                    java.lang.String r2 = ""
                    java.lang.String r4 = "X-Ss-Etag"
                    java.lang.Object r4 = r8.get(r4)     // Catch:{ Throwable -> 0x014e }
                    if (r4 == 0) goto L_0x00fa
                    java.lang.String r4 = "X-Ss-Etag"
                    java.lang.Object r4 = r8.get(r4)     // Catch:{ Throwable -> 0x014e }
                    java.util.List r4 = (java.util.List) r4     // Catch:{ Throwable -> 0x014e }
                    java.lang.Object r4 = r4.get(r3)     // Catch:{ Throwable -> 0x014e }
                    java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ Throwable -> 0x014e }
                    boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x014e }
                    if (r4 != 0) goto L_0x00fa
                    java.lang.String r1 = "X-Ss-Etag"
                    java.lang.Object r1 = r8.get(r1)     // Catch:{ Throwable -> 0x014e }
                    java.util.List r1 = (java.util.List) r1     // Catch:{ Throwable -> 0x014e }
                    java.lang.Object r1 = r1.get(r3)     // Catch:{ Throwable -> 0x014e }
                    java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x014e }
                L_0x00fa:
                    java.lang.String r4 = "X-Ss-Canary"
                    java.lang.Object r4 = r8.get(r4)     // Catch:{ Throwable -> 0x014e }
                    if (r4 == 0) goto L_0x0124
                    java.lang.String r4 = "X-Ss-Canary"
                    java.lang.Object r4 = r8.get(r4)     // Catch:{ Throwable -> 0x014e }
                    java.util.List r4 = (java.util.List) r4     // Catch:{ Throwable -> 0x014e }
                    java.lang.Object r4 = r4.get(r3)     // Catch:{ Throwable -> 0x014e }
                    java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ Throwable -> 0x014e }
                    boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x014e }
                    if (r4 != 0) goto L_0x0124
                    java.lang.String r2 = "X-Ss-Canary"
                    java.lang.Object r2 = r8.get(r2)     // Catch:{ Throwable -> 0x014e }
                    java.util.List r2 = (java.util.List) r2     // Catch:{ Throwable -> 0x014e }
                    java.lang.Object r2 = r2.get(r3)     // Catch:{ Throwable -> 0x014e }
                    java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x014e }
                L_0x0124:
                    com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.m19754a(r0)     // Catch:{ Throwable -> 0x014e }
                    com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.m19760a()     // Catch:{ Throwable -> 0x014e }
                    com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient r0 = com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c.f26872b     // Catch:{ Throwable -> 0x014e }
                    com.bytedance.common.utility.f.b r0 = com.bytedance.common.utility.p526f.C9409b.m18609a(r0)     // Catch:{ Throwable -> 0x014e }
                    java.lang.String r4 = "notifyTNCConfigUpdated"
                    r6 = 3
                    java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ Throwable -> 0x014e }
                    java.lang.Class<java.lang.String> r9 = java.lang.String.class
                    r8[r3] = r9     // Catch:{ Throwable -> 0x014e }
                    java.lang.Class<java.lang.String> r9 = java.lang.String.class
                    r8[r7] = r9     // Catch:{ Throwable -> 0x014e }
                    java.lang.Class<java.lang.String> r9 = java.lang.String.class
                    r10 = 2
                    r8[r10] = r9     // Catch:{ Throwable -> 0x014e }
                    java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x014e }
                    r6[r3] = r1     // Catch:{ Throwable -> 0x014e }
                    r6[r7] = r2     // Catch:{ Throwable -> 0x014e }
                    r6[r10] = r5     // Catch:{ Throwable -> 0x014e }
                    r0.mo17052a(r4, (java.lang.Class<?>[]) r8, r6)     // Catch:{ Throwable -> 0x014e }
                    goto L_0x0153
                L_0x014e:
                    return
                L_0x014f:
                    int r4 = r4 + 1
                    goto L_0x0017
                L_0x0153:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p884b.C13287a.C132947.run():void");
            }
        }.start();
    }

    public String getCityName() {
        Address a = C13303d.m26799b().mo24897a(C13303d.m26799b().mo24896a());
        if (a != null) {
            String locality = a.getLocality();
            if (!C9431p.m18664a(locality)) {
                return locality;
            }
        }
        return "";
    }

    public String getDPI() {
        int d = C9432q.m18694d(C13303d.m26799b().mo24896a());
        if (d > 0) {
            return String.valueOf(d);
        }
        return "";
    }

    public String getOSVersion() {
        try {
            String str = VERSION.RELEASE;
            if (str != null && str.length() > 10) {
                str = str.substring(0, 10);
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public String getResolution() {
        String c = C9432q.m18693c(C13303d.m26799b().mo24896a());
        if (!C9431p.m18664a(c)) {
            return c;
        }
        return "";
    }

    public Map<String, String> getGetDomainDependHostMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] b = C13303d.m26799b().mo24904b();
        if (b != null) {
            if (b.length > 0) {
                linkedHashMap.put("first", b[0]);
            }
            if (b.length > 1) {
                linkedHashMap.put("second", b[1]);
            }
            if (b.length > 2) {
                linkedHashMap.put("third", b[2]);
            }
        }
        Map e = C13303d.m26799b().mo24907e();
        if (e != null && !e.isEmpty()) {
            for (Entry entry : e.entrySet()) {
                if (entry != null) {
                    linkedHashMap.put(entry.getValue(), entry.getKey());
                }
            }
        }
        return linkedHashMap;
    }

    public final void onClientIPChanged(final String str) {
        new C9393e("NetWork-Event") {
            public final void run() {
                String str = str;
                if (str != null) {
                    C13303d.f34703f = str;
                }
            }
        }.start();
    }

    public void onEffectiveConnectionTypeChanged(final int i) {
        new C9393e("NetWork-Event") {
            public final void run() {
            }
        }.start();
    }

    public void onServerConfigUpdated(final String str) {
        try {
            new C9393e("NetWork-Event") {
                /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
                /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0040 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r5 = this;
                        com.bytedance.ttnet.c r0 = com.bytedance.ttnet.C13303d.m26799b()     // Catch:{ Throwable -> 0x0046 }
                        android.content.Context r0 = r0.mo24896a()     // Catch:{ Throwable -> 0x0046 }
                        com.bytedance.ttnet.a.a r0 = com.bytedance.ttnet.p883a.C13258a.m26660a(r0)     // Catch:{ Throwable -> 0x0046 }
                        java.lang.String r1 = r3     // Catch:{ Throwable -> 0x0046 }
                        r2 = 0
                        boolean r3 = com.bytedance.common.utility.C9431p.m18664a(r1)     // Catch:{ Throwable -> 0x0046 }
                        if (r3 != 0) goto L_0x0045
                        com.bytedance.ttnet.a.a$7 r3 = new com.bytedance.ttnet.a.a$7     // Catch:{ Exception -> 0x0024 }
                        java.lang.String r4 = "AppConfig-SaveWaitConfigTimesTask"
                        r3.<init>(r4)     // Catch:{ Exception -> 0x0024 }
                        r3.start()     // Catch:{ Exception -> 0x0024 }
                        boolean r1 = r0.mo24852a(r1)     // Catch:{ Exception -> 0x0024 }
                        goto L_0x0025
                    L_0x0024:
                        r1 = 0
                    L_0x0025:
                        r2 = 102(0x66, float:1.43E-43)
                        if (r1 == 0) goto L_0x002b
                        r2 = 101(0x65, float:1.42E-43)
                    L_0x002b:
                        org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0040 }
                        r1.<init>()     // Catch:{ Throwable -> 0x0040 }
                        java.lang.String r3 = "from"
                        java.lang.String r4 = "cronet"
                        r1.put(r3, r4)     // Catch:{ Throwable -> 0x0040 }
                        com.bytedance.ttnet.c r3 = com.bytedance.ttnet.C13303d.m26799b()     // Catch:{ Throwable -> 0x0040 }
                        android.content.Context r4 = r0.f34565d     // Catch:{ Throwable -> 0x0040 }
                        r3.mo24902a(r4, r1)     // Catch:{ Throwable -> 0x0040 }
                    L_0x0040:
                        com.bytedance.common.utility.b.g r0 = r0.f34569i     // Catch:{ Throwable -> 0x0046 }
                        r0.sendEmptyMessage(r2)     // Catch:{ Throwable -> 0x0046 }
                    L_0x0045:
                        return
                    L_0x0046:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p884b.C13287a.C132881.run():void");
                }
            }.start();
        } catch (Throwable unused) {
        }
    }

    public final void onTTNetStateChanged(final int i) {
        new C9393e("NetWork-Event") {
            public final void run() {
                C13287a.this.mo24892a(i);
            }
        }.start();
    }

    public final void onTTNetDetectInfoChanged(final String str) {
        if (!TextUtils.isEmpty(str)) {
            new C9393e("NetWork-Event") {
                public final void run() {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        C9881f fVar = new C9881f();
                        fVar.f26890a = jSONObject.getInt("source");
                        fVar.f26891b = jSONObject.getLong("timestamp");
                        fVar.f26892c = jSONObject.getInt("succ");
                        fVar.f26893d = jSONObject.getInt("fail");
                        fVar.f26894e = jSONObject.getInt("rank");
                        fVar.f26897h = jSONObject.getString("os");
                        fVar.f26898i = jSONObject.getString("os_version");
                        fVar.f26899j = jSONObject.getString("app_version");
                        fVar.f26900k = jSONObject.getInt("signal_strength");
                        fVar.f26901l = jSONObject.getString("wifi_ssid");
                        fVar.f26902m = jSONObject.getInt("wifi_frequency");
                        fVar.f26903n = jSONObject.getString("xg_mcc_mnc");
                        fVar.f26904o = jSONObject.getInt("xg_cid");
                        fVar.f26905p = jSONObject.getInt("xg_lac");
                        fVar.f26906q = jSONObject.getString("apn");
                        fVar.f26895f = jSONObject.getString("nettype");
                        JSONArray jSONArray = jSONObject.getJSONArray("result");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            Object obj = null;
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String string = jSONObject2.getString("type");
                            if ("http_get".equalsIgnoreCase(string)) {
                                obj = C9883b.m19790a(jSONObject2);
                            } else if ("ping".equalsIgnoreCase(string)) {
                                obj = C9886e.m19792a(jSONObject2);
                            } else if ("traceroute".equalsIgnoreCase(string)) {
                                obj = C9887f.m19793a(jSONObject2);
                            } else if ("dns_local".equalsIgnoreCase(string)) {
                                obj = C9885d.m19791a(jSONObject2);
                            } else if ("dns_http".equalsIgnoreCase(string)) {
                                obj = C9882a.m19789a(jSONObject2);
                            } else if ("dns_server".equalsIgnoreCase(string)) {
                                fVar.f26907r = jSONObject2.getString("clientip");
                                fVar.f26908s = jSONObject2.getString("localdns");
                            }
                            if (obj != null) {
                                fVar.f26896g.add(obj);
                            }
                        }
                        synchronized (this) {
                            C13287a.this.f34667a = fVar;
                        }
                        C13287a.this.mo24893a(fVar);
                    } catch (Throwable unused) {
                    }
                }
            }.start();
        }
    }

    public Map<String, String> onCallToAddSecurityFactor(String str, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(entry.getValue());
            hashMap.put(entry.getKey(), arrayList);
        }
        return C9894e.m19816a(str, (Map<String, List<String>>) hashMap);
    }

    public void handleApiResult(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4, String str5, String str6, Exception exc) {
        String str7 = str;
        long j13 = j;
        long j14 = j2;
        long j15 = j5;
        C9831a a = C9831a.m19674a();
        a.f26751a = str3;
        a.f26753c = j13;
        a.f26754d = j13;
        a.f26755e = j14;
        a.f26756f = j3;
        a.f26757g = j4;
        a.f26758h = j15;
        a.f26760j = j6;
        a.f26761k = j7;
        a.f26762l = j8;
        a.f26763m = j9;
        a.f26765o = j10;
        a.f26766p = z2;
        a.f26767q = j11;
        long j16 = j15 - j14;
        a.f26768r = j16;
        a.f26770t = j12;
        a.f26774x = str4;
        a.f26749A = str5;
        a.f26750B = str6;
        a.f26772v = 0;
        if (z) {
            C9894e.m19823a(str, j16, a);
            C9894e.m19818a(j16, j2, str, str2, a);
            return;
        }
        C9894e.m19825a(str, exc, j16, a);
        C9894e.m19819a(j16, j2, str, str2, a, exc);
    }
}
