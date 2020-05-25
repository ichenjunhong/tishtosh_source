package com.bytedance.android.live.core.performance;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.core.performance.BaseSampler.C3972a;
import com.bytedance.android.live.core.performance.C3982g.C3983a;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.performance.b */
public final class C3974b {

    /* renamed from: d */
    public static Handler f11070d;

    /* renamed from: f */
    private static C3974b f11071f = new C3974b();

    /* renamed from: g */
    private static Handler f11072g = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public boolean f11073a;

    /* renamed from: b */
    public int f11074b = 300;

    /* renamed from: c */
    ConcurrentHashMap<String, BaseSampler> f11075c = new ConcurrentHashMap<>();

    /* renamed from: e */
    private final int f11076e = 3000;

    /* renamed from: a */
    public static C3974b m10061a() {
        return f11071f;
    }

    /* renamed from: a */
    public final void mo9380a(ArrayList arrayList, String str, String str2, HashMap<String, String> hashMap) {
        JSONObject a = m10062a(arrayList, str, str2);
        if (hashMap != null) {
            C3982g.m10089a(a, "extra", C2942b.m8369a().mo34889b(hashMap));
        }
        C3837e.m9749b(C3982g.m10082a(str), 0, a);
        new StringBuilder("monitor:").append(a.toString());
    }

    private C3974b() {
    }

    /* renamed from: a */
    public final void mo9374a(String str) {
        mo9379a(str, null);
    }

    /* renamed from: a */
    public static double m10060a(ArrayList<Double> arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        double d = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        if (isEmpty) {
            return ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Double d2 = (Double) it.next();
            if (d2 != null) {
                d += d2.doubleValue();
            } else {
                i++;
            }
        }
        double size = (double) (arrayList.size() - i);
        Double.isNaN(size);
        return d / size;
    }

    /* renamed from: b */
    public final void mo9381b(String str) {
        if (this.f11073a) {
            for (String str2 : this.f11075c.keySet()) {
                if (str2.contains(str)) {
                    ((BaseSampler) this.f11075c.get(str2)).mo9358a();
                    this.f11075c.remove(str2);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m10063a(C0176h hVar, BaseSampler baseSampler) {
        if (hVar != null) {
            try {
                hVar.mo325b(baseSampler);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    /* renamed from: a */
    public final void mo9379a(String str, HashMap<String, String> hashMap) {
        if (this.f11073a) {
            for (String str2 : this.f11075c.keySet()) {
                if (str2.contains(str)) {
                    BaseSampler baseSampler = (BaseSampler) this.f11075c.get(str2);
                    if (baseSampler != null) {
                        baseSampler.mo9361a(hashMap);
                    }
                    this.f11075c.remove(str2);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo9382b(String str, C0176h hVar, Context context) {
        mo9383b(str, hVar, context, -1);
    }

    /* renamed from: c */
    public final void mo9385c(String str, C0184k kVar, Context context) {
        mo9384b(str, kVar, context);
        mo9377a(str, kVar, context);
    }

    /* renamed from: b */
    public final void mo9384b(String str, C0184k kVar, Context context) {
        mo9382b(str, kVar.getLifecycle(), context);
    }

    /* renamed from: a */
    public final void mo9375a(String str, C0176h hVar, Context context) {
        mo9376a(str, hVar, context, -1);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:11|(2:13|(1:15)(4:16|(8:19|20|(2:23|21)|52|24|51|29|17)|49|30))(2:31|(3:35|36|37))|38|39|40) */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a6, code lost:
        return r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00a3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject m10062a(java.util.ArrayList r10, java.lang.String r11, java.lang.String r12) {
        /*
            r9 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            monitor-enter(r10)     // Catch:{ Throwable -> 0x00aa }
            boolean r1 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x00a7 }
            if (r1 != 0) goto L_0x0011
            java.lang.String r1 = "biz"
            com.bytedance.android.live.core.performance.C3982g.m10089a(r0, r1, r11)     // Catch:{ all -> 0x00a7 }
        L_0x0011:
            if (r10 == 0) goto L_0x00a5
            int r11 = r10.size()     // Catch:{ all -> 0x00a7 }
            if (r11 != 0) goto L_0x001b
            goto L_0x00a5
        L_0x001b:
            java.lang.String r11 = "mem"
            boolean r11 = android.text.TextUtils.equals(r11, r12)     // Catch:{ all -> 0x00a7 }
            if (r11 == 0) goto L_0x008c
            int r11 = r10.size()     // Catch:{ all -> 0x00a7 }
            r1 = 1
            r2 = 0
            if (r11 != r1) goto L_0x0037
            java.lang.String r11 = "mem"
            java.lang.Object r12 = r10.get(r2)     // Catch:{ all -> 0x00a7 }
            org.json.JSONObject r12 = (org.json.JSONObject) r12     // Catch:{ all -> 0x00a7 }
            com.bytedance.android.live.core.performance.C3982g.m10090a(r0, r11, r12)     // Catch:{ all -> 0x00a7 }
            goto L_0x00a3
        L_0x0037:
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ all -> 0x00a7 }
            r11.<init>()     // Catch:{ all -> 0x00a7 }
            java.lang.Object r1 = r10.get(r2)     // Catch:{ all -> 0x00a7 }
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ all -> 0x00a7 }
            r3 = 0
        L_0x0043:
            org.json.JSONArray r4 = r1.names()     // Catch:{ all -> 0x00a7 }
            int r4 = r4.length()     // Catch:{ all -> 0x00a7 }
            if (r3 >= r4) goto L_0x0088
            org.json.JSONArray r4 = r1.names()     // Catch:{ JSONException -> 0x007f }
            java.lang.String r4 = r4.getString(r3)     // Catch:{ JSONException -> 0x007f }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ JSONException -> 0x007f }
            r5.<init>()     // Catch:{ JSONException -> 0x007f }
            java.util.Iterator r6 = r10.iterator()     // Catch:{ JSONException -> 0x007f }
        L_0x005e:
            boolean r7 = r6.hasNext()     // Catch:{ JSONException -> 0x007f }
            if (r7 == 0) goto L_0x0077
            java.lang.Object r7 = r6.next()     // Catch:{ JSONException -> 0x007f }
            org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x007f }
            int r7 = r7.optInt(r4, r2)     // Catch:{ JSONException -> 0x007f }
            double r7 = (double) r7     // Catch:{ JSONException -> 0x007f }
            java.lang.Double r7 = java.lang.Double.valueOf(r7)     // Catch:{ JSONException -> 0x007f }
            r5.add(r7)     // Catch:{ JSONException -> 0x007f }
            goto L_0x005e
        L_0x0077:
            double r5 = m10060a(r5)     // Catch:{ JSONException -> 0x007f }
            r11.put(r4, r5)     // Catch:{ JSONException -> 0x007f }
            goto L_0x0085
        L_0x007f:
            r4 = move-exception
            java.lang.String r5 = "PerformanceMonitor"
            com.bytedance.android.live.core.p224c.C3831a.m9714b(r5, r4)     // Catch:{ all -> 0x00a7 }
        L_0x0085:
            int r3 = r3 + 1
            goto L_0x0043
        L_0x0088:
            com.bytedance.android.live.core.performance.C3982g.m10090a(r0, r12, r11)     // Catch:{ all -> 0x00a7 }
            goto L_0x00a3
        L_0x008c:
            java.lang.String r11 = "cpu"
            boolean r11 = android.text.TextUtils.equals(r11, r12)     // Catch:{ all -> 0x00a7 }
            if (r11 != 0) goto L_0x009c
            java.lang.String r11 = "fps"
            boolean r11 = android.text.TextUtils.equals(r11, r12)     // Catch:{ all -> 0x00a7 }
            if (r11 == 0) goto L_0x00a3
        L_0x009c:
            double r1 = m10060a(r10)     // Catch:{ all -> 0x00a7 }
            r0.put(r12, r1)     // Catch:{ JSONException -> 0x00a3 }
        L_0x00a3:
            monitor-exit(r10)     // Catch:{ all -> 0x00a7 }
            return r0
        L_0x00a5:
            monitor-exit(r10)     // Catch:{ all -> 0x00a7 }
            return r0
        L_0x00a7:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00a7 }
            throw r11     // Catch:{ Throwable -> 0x00aa }
        L_0x00aa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.performance.C3974b.m10062a(java.util.ArrayList, java.lang.String, java.lang.String):org.json.JSONObject");
    }

    /* renamed from: a */
    public final void mo9377a(String str, C0184k kVar, Context context) {
        mo9375a(str, kVar.getLifecycle(), context);
    }

    /* renamed from: a */
    public final void mo9376a(final String str, final C0176h hVar, Context context, int i) {
        if (this.f11073a) {
            if (TextUtils.equals(str, C3983a.CreateLive.name())) {
                hVar = null;
            }
            StringBuilder sb = new StringBuilder(str);
            sb.append("-mem");
            String sb2 = sb.toString();
            if (i == -1) {
                i = this.f11074b;
            }
            final MemSampler memSampler = new MemSampler(i, 3000);
            this.f11075c.put(sb2, memSampler);
            if (hVar != null) {
                hVar.mo324a(memSampler);
            }
            memSampler.mo9359a(f11070d, context, new C3972a() {
                /* renamed from: a */
                public final void mo9368a() {
                    C3974b.m10063a(hVar, (BaseSampler) memSampler);
                }

                /* renamed from: a */
                public final void mo9369a(ArrayList arrayList, HashMap<String, String> hashMap) {
                    C3974b.f11070d.post(new C3979d(this, arrayList, str, hashMap));
                    C3974b.m10063a(hVar, (BaseSampler) memSampler);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo9383b(final String str, final C0176h hVar, Context context, int i) {
        if (this.f11073a) {
            if (TextUtils.equals(str, C3983a.CreateLive.name())) {
                hVar = null;
            }
            StringBuilder sb = new StringBuilder(str);
            sb.append("-cpu");
            String sb2 = sb.toString();
            if (i == -1) {
                i = this.f11074b;
            }
            final CpuSampler cpuSampler = new CpuSampler(i, 3000);
            this.f11075c.put(sb2, cpuSampler);
            if (hVar != null) {
                hVar.mo324a(cpuSampler);
            }
            cpuSampler.mo9359a(f11070d, context, new C3972a() {
                /* renamed from: a */
                public final void mo9368a() {
                    C3974b.m10063a(hVar, (BaseSampler) cpuSampler);
                }

                /* renamed from: a */
                public final void mo9369a(ArrayList arrayList, HashMap<String, String> hashMap) {
                    C3974b.f11070d.post(new C3980e(this, arrayList, str, hashMap));
                    C3974b.m10063a(hVar, (BaseSampler) cpuSampler);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo9378a(String str, C0184k kVar, Context context, int i) {
        boolean z;
        if (this.f11073a) {
            if (VERSION.SDK_INT >= 16) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i == 0) {
                    mo9374a(str);
                    return;
                }
                StringBuilder sb = new StringBuilder(str);
                sb.append("-fps");
                String sb2 = sb.toString();
                Handler handler = f11072g;
                C3978c cVar = new C3978c(this, sb2, kVar, context, str);
                handler.post(cVar);
            }
        }
    }
}
