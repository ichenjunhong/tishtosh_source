package com.bytedance.p126ad.symphony.p129b.p130a;

import android.content.Context;
import android.os.Handler;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9379e;
import com.bytedance.p126ad.symphony.C2680b;
import com.bytedance.p126ad.symphony.C2715d;
import com.bytedance.p126ad.symphony.C2721e;
import com.bytedance.p126ad.symphony.p127a.C2673a;
import com.bytedance.p126ad.symphony.p129b.C2682a;
import com.bytedance.p126ad.symphony.p131c.C2709c;
import com.bytedance.p126ad.symphony.p131c.C2710d;
import com.bytedance.p126ad.symphony.p131c.C2711e;
import com.bytedance.p126ad.symphony.p131c.C2713g;
import com.bytedance.p126ad.symphony.p132d.C2716a;
import com.bytedance.p126ad.symphony.p134e.C2722a;
import com.bytedance.p126ad.symphony.p134e.p135a.C2724b;
import com.bytedance.p126ad.symphony.p134e.p135a.C2726d;
import com.bytedance.p126ad.symphony.p137g.C2737b;
import com.bytedance.p126ad.symphony.p138h.C2739a;
import com.bytedance.p126ad.symphony.p138h.C2740b;
import com.bytedance.p126ad.symphony.p139i.C2742a;
import com.bytedance.p126ad.symphony.p139i.C2745d;
import com.bytedance.p126ad.symphony.p139i.C2747f;
import com.bytedance.p126ad.symphony.provider.AbsNativeAdProvider;
import com.bytedance.p126ad.symphony.provider.C2752b;
import com.bytedance.p126ad.symphony.provider.C2752b.C2753a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.ad.symphony.b.a.a */
public abstract class C2683a<AD extends C2673a> implements C2682a<AD> {

    /* renamed from: a */
    protected Handler f8151a;

    /* renamed from: b */
    protected Handler f8152b;

    /* renamed from: c */
    public Map<Integer, C2752b<AD>> f8153c = new ConcurrentHashMap();

    /* renamed from: d */
    protected Map<String, Long> f8154d = new ConcurrentHashMap();

    /* renamed from: e */
    protected Map<String, C9379e<Object>> f8155e = new ConcurrentHashMap();

    /* renamed from: f */
    protected Context f8156f;

    /* renamed from: g */
    protected C2740b f8157g;

    /* renamed from: h */
    public C2716a f8158h;

    /* renamed from: i */
    public Map<String, List<String>> f8159i;

    /* renamed from: j */
    private final Object f8160j = new Object();

    /* renamed from: k */
    private volatile Boolean f8161k;

    /* renamed from: l */
    private volatile boolean f8162l;

    /* renamed from: m */
    private boolean f8163m;

    /* renamed from: n */
    private C2753a f8164n;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo7249a();

    /* renamed from: b */
    public final C2740b mo7253b() {
        return this.f8157g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7255c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7251a(List<String> list) {
        if (C2745d.m7836a(list)) {
            mo7249a();
            return;
        }
        for (final String str : list) {
            if (m7723f(str)) {
                mo7249a();
                return;
            }
            this.f8151a.post(new Runnable() {
                public final void run() {
                    C2683a.this.mo7254b(str);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        mo7249a();
        new java.lang.StringBuilder("createProvider, className-->").append(r6);
        r4 = null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0088 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7252a(java.util.List<com.bytedance.p126ad.symphony.p134e.p135a.C2723a> r13, android.util.SparseArray<com.bytedance.p126ad.symphony.provider.C2749a.C2751a> r14, java.lang.Class<? extends com.bytedance.p126ad.symphony.p129b.C2682a> r15) {
        /*
            r12 = this;
            boolean r0 = r12.f8162l
            r1 = 0
            if (r0 == 0) goto L_0x000a
            r12.f8162l = r1
            r12.mo7255c()
        L_0x000a:
            if (r13 == 0) goto L_0x0146
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x0014
            goto L_0x0146
        L_0x0014:
            boolean r0 = r12.f8163m
            if (r0 != 0) goto L_0x0019
            return
        L_0x0019:
            java.lang.Object r0 = r12.f8160j
            monitor-enter(r0)
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0143 }
            r2.<init>(r13)     // Catch:{ all -> 0x0143 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0143 }
        L_0x0025:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0143 }
            if (r3 == 0) goto L_0x00c7
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0143 }
            com.bytedance.ad.symphony.e.a.a r3 = (com.bytedance.p126ad.symphony.p134e.p135a.C2723a) r3     // Catch:{ all -> 0x0143 }
            if (r3 == 0) goto L_0x0025
            java.util.Map<java.lang.Integer, com.bytedance.ad.symphony.provider.b<AD>> r4 = r12.f8153c     // Catch:{ all -> 0x0143 }
            int r5 = r3.f8227a     // Catch:{ all -> 0x0143 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0143 }
            boolean r4 = r4.containsKey(r5)     // Catch:{ all -> 0x0143 }
            if (r4 != 0) goto L_0x00b4
            android.content.Context r4 = r12.f8156f     // Catch:{ all -> 0x0143 }
            r5 = 0
            java.lang.String r6 = ""
            if (r3 == 0) goto L_0x005b
            if (r14 == 0) goto L_0x005b
            int r7 = r3.f8227a     // Catch:{ Exception -> 0x0088 }
            int r7 = com.bytedance.p126ad.symphony.provider.C2749a.getRealProviderId(r7)     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r7 = r14.get(r7)     // Catch:{ Exception -> 0x0088 }
            com.bytedance.ad.symphony.provider.a$a r7 = (com.bytedance.p126ad.symphony.provider.C2749a.C2751a) r7     // Catch:{ Exception -> 0x0088 }
            if (r7 == 0) goto L_0x005b
            java.lang.String r7 = r7.f8305c     // Catch:{ Exception -> 0x0088 }
            r6 = r7
        L_0x005b:
            boolean r7 = com.bytedance.common.utility.C9431p.m18664a(r6)     // Catch:{ Exception -> 0x0088 }
            if (r7 == 0) goto L_0x0062
            goto L_0x0025
        L_0x0062:
            java.lang.Class r7 = java.lang.Class.forName(r6)     // Catch:{ Exception -> 0x0088 }
            r8 = 3
            java.lang.Class[] r9 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x0088 }
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            r9[r1] = r10     // Catch:{ Exception -> 0x0088 }
            java.lang.Class<com.bytedance.ad.symphony.e.a.a> r10 = com.bytedance.p126ad.symphony.p134e.p135a.C2723a.class
            r11 = 1
            r9[r11] = r10     // Catch:{ Exception -> 0x0088 }
            r10 = 2
            r9[r10] = r15     // Catch:{ Exception -> 0x0088 }
            java.lang.reflect.Constructor r7 = r7.getConstructor(r9)     // Catch:{ Exception -> 0x0088 }
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0088 }
            r8[r1] = r4     // Catch:{ Exception -> 0x0088 }
            r8[r11] = r3     // Catch:{ Exception -> 0x0088 }
            r8[r10] = r12     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r4 = r7.newInstance(r8)     // Catch:{ Exception -> 0x0088 }
            com.bytedance.ad.symphony.provider.a r4 = (com.bytedance.p126ad.symphony.provider.C2749a) r4     // Catch:{ Exception -> 0x0088 }
            goto L_0x0096
        L_0x0088:
            r12.mo7249a()     // Catch:{ all -> 0x0143 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0143 }
            java.lang.String r7 = "createProvider, className-->"
            r4.<init>(r7)     // Catch:{ all -> 0x0143 }
            r4.append(r6)     // Catch:{ all -> 0x0143 }
            r4 = r5
        L_0x0096:
            if (r4 == 0) goto L_0x0025
            r12.mo7249a()     // Catch:{ all -> 0x0143 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0143 }
            java.lang.String r6 = "createProvider, providerId-->"
            r5.<init>(r6)     // Catch:{ all -> 0x0143 }
            int r6 = r3.f8227a     // Catch:{ all -> 0x0143 }
            r5.append(r6)     // Catch:{ all -> 0x0143 }
            java.util.Map<java.lang.Integer, com.bytedance.ad.symphony.provider.b<AD>> r5 = r12.f8153c     // Catch:{ all -> 0x0143 }
            int r3 = r3.f8227a     // Catch:{ all -> 0x0143 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0143 }
            r5.put(r3, r4)     // Catch:{ all -> 0x0143 }
            goto L_0x0025
        L_0x00b4:
            java.util.Map<java.lang.Integer, com.bytedance.ad.symphony.provider.b<AD>> r4 = r12.f8153c     // Catch:{ all -> 0x0143 }
            int r5 = r3.f8227a     // Catch:{ all -> 0x0143 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0143 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0143 }
            com.bytedance.ad.symphony.provider.b r4 = (com.bytedance.p126ad.symphony.provider.C2752b) r4     // Catch:{ all -> 0x0143 }
            r4.setAdConfig(r3)     // Catch:{ all -> 0x0143 }
            goto L_0x0025
        L_0x00c7:
            r12.mo7249a()     // Catch:{ all -> 0x0143 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0143 }
            java.lang.String r15 = "initConfig, providers created, size-->"
            r14.<init>(r15)     // Catch:{ all -> 0x0143 }
            java.util.Map<java.lang.Integer, com.bytedance.ad.symphony.provider.b<AD>> r15 = r12.f8153c     // Catch:{ all -> 0x0143 }
            if (r15 != 0) goto L_0x00d7
            r15 = 0
            goto L_0x00dd
        L_0x00d7:
            java.util.Map<java.lang.Integer, com.bytedance.ad.symphony.provider.b<AD>> r15 = r12.f8153c     // Catch:{ all -> 0x0143 }
            int r15 = r15.size()     // Catch:{ all -> 0x0143 }
        L_0x00dd:
            r14.append(r15)     // Catch:{ all -> 0x0143 }
            monitor-exit(r0)     // Catch:{ all -> 0x0143 }
            com.bytedance.ad.symphony.d.a r14 = r12.f8158h
            if (r14 == 0) goto L_0x0142
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Map<java.lang.Integer, com.bytedance.ad.symphony.provider.b<AD>> r15 = r12.f8153c
            java.util.Set r15 = r15.keySet()
            java.util.Iterator r15 = r15.iterator()
        L_0x00f4:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0104
            java.lang.Object r0 = r15.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            r14.add(r0)
            goto L_0x00f4
        L_0x0104:
            java.lang.Boolean r14 = r12.f8161k
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x0132
            java.lang.Boolean r14 = r12.f8161k
            monitor-enter(r14)
            java.lang.Boolean r15 = r12.f8161k     // Catch:{ all -> 0x012f }
            boolean r15 = r15.booleanValue()     // Catch:{ all -> 0x012f }
            if (r15 == 0) goto L_0x012d
            java.util.Map<java.lang.Integer, com.bytedance.ad.symphony.provider.b<AD>> r15 = r12.f8153c     // Catch:{ all -> 0x012f }
            if (r15 == 0) goto L_0x012d
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x012f }
            r12.f8161k = r13     // Catch:{ all -> 0x012f }
            android.os.Handler r13 = r12.f8152b     // Catch:{ all -> 0x012f }
            com.bytedance.ad.symphony.b.a.a$4 r15 = new com.bytedance.ad.symphony.b.a.a$4     // Catch:{ all -> 0x012f }
            r15.<init>()     // Catch:{ all -> 0x012f }
            r13.post(r15)     // Catch:{ all -> 0x012f }
            monitor-exit(r14)     // Catch:{ all -> 0x012f }
            return
        L_0x012d:
            monitor-exit(r14)     // Catch:{ all -> 0x012f }
            goto L_0x0132
        L_0x012f:
            r13 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x012f }
            throw r13
        L_0x0132:
            boolean r13 = com.bytedance.p126ad.symphony.p139i.C2745d.m7836a(r13)
            if (r13 != 0) goto L_0x0142
            android.os.Handler r13 = r12.f8152b
            com.bytedance.ad.symphony.b.a.a$5 r14 = new com.bytedance.ad.symphony.b.a.a$5
            r14.<init>()
            r13.post(r14)
        L_0x0142:
            return
        L_0x0143:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0143 }
            throw r13
        L_0x0146:
            r12.mo7249a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p126ad.symphony.p129b.p130a.C2683a.mo7252a(java.util.List, android.util.SparseArray, java.lang.Class):void");
    }

    /* renamed from: e */
    private void m7722e(final String str) {
        if (C9431p.m18664a(str)) {
            mo7249a();
        } else if (m7723f(str)) {
            mo7249a();
        } else {
            this.f8151a.post(new Runnable() {
                public final void run() {
                    C2683a.this.mo7254b(str);
                }
            });
        }
    }

    /* renamed from: a */
    public final int mo7247a(C2722a aVar) {
        if (aVar == null || C2745d.m7836a(aVar.f8224b) || aVar.f8223a == null) {
            return -1;
        }
        return m7718a(aVar.f8223a, (String) aVar.f8224b.get(0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final List<String> mo7257d(String str) {
        if (C2745d.m7837a(this.f8159i)) {
            return null;
        }
        return (List) this.f8159i.get(str);
    }

    /* renamed from: f */
    private boolean m7723f(String str) {
        if (!this.f8154d.containsKey(str) || ((Long) this.f8154d.get(str)).longValue() == 0) {
            return false;
        }
        if (System.currentTimeMillis() - ((Long) this.f8154d.get(str)).longValue() < 25000) {
            return true;
        }
        this.f8154d.put(str, Long.valueOf(0));
        C2713g.m7763a(str);
        mo7249a();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("：requestHandler fail to call onPreloadFinish,trigger timeout strategy");
        new Exception(sb.toString());
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo7256c(String str) {
        if (C2680b.m7713b()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(":ad pool status\n");
            for (Entry value : this.f8153c.entrySet()) {
                C2752b bVar = (C2752b) value.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(bVar.toString());
                sb2.append("\n");
                sb.append(sb2.toString());
            }
            mo7249a();
        }
    }

    /* renamed from: b */
    public final void mo7254b(String str) {
        C2747f.m7838a();
        if (m7723f(str)) {
            mo7249a();
            return;
        }
        C2739a a = this.f8157g.mo7299a(str);
        if (a != null) {
            if (!C2745d.m7836a(a.mo7296d()) || (!C2745d.m7836a(a.mo7295c()) && !C2745d.m7836a((List) a.mo7295c().get(0)))) {
                mo7256c("before crate request handler:");
                mo7249a();
                StringBuilder sb = new StringBuilder("tryPreloadAd, type:");
                sb.append(str);
                sb.append(",use strategy:");
                sb.append(a.toString());
                List<C2737b> a2 = C2721e.m7776a(this.f8156f, a, str, this.f8164n, this);
                if (!C2745d.m7836a(a2)) {
                    mo7249a();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(": start loading");
                    this.f8154d.put(str, Long.valueOf(System.currentTimeMillis()));
                    for (C2737b c : a2) {
                        c.mo7290c();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo7250a(C2726d dVar) {
        this.f8157g.f8288c = dVar;
    }

    /* renamed from: a */
    public final void mo7246a(String str) {
        List<String> d = mo7257d(str);
        if (!C2745d.m7836a(d)) {
            for (String e : d) {
                m7722e(e);
            }
        }
    }

    /* renamed from: a */
    private int m7718a(C2739a aVar, String str) {
        return mo7248a(aVar, str, false);
    }

    /* renamed from: a */
    private static void m7721a(C2673a aVar, C2709c cVar) {
        if (!(aVar == null || cVar == null)) {
            try {
                C2713g.m7762a(aVar);
            } catch (Exception e) {
                C2715d.m7770a(e);
            }
        }
    }

    /* renamed from: a */
    public final AD mo7245a(C2722a aVar, C2709c cVar) {
        String str;
        AD ad = null;
        if (aVar == null || C2745d.m7836a(aVar.f8224b) || aVar.f8223a == null) {
            return null;
        }
        if (cVar == null || cVar.f8200b == null) {
            mo7249a();
        }
        List<String> list = aVar.f8224b;
        C2739a aVar2 = aVar.f8223a;
        if (list.size() == 1) {
            String str2 = (String) list.get(0);
            long j = aVar.f8226d;
            JSONObject jSONObject = aVar.f8225c;
            if (aVar2 == null || str2 == null) {
                mo7249a();
                return null;
            }
            mo7249a();
            StringBuilder sb = new StringBuilder("placementType:");
            sb.append(str2);
            sb.append(",fillStrategy:");
            sb.append(aVar2);
            this.f8157g.mo7300a(str2, aVar2);
            int a = m7718a(this.f8157g.mo7299a(str2), str2);
            if (a == -1) {
                m7722e(str2);
                return null;
            }
            mo7249a();
            new StringBuilder("find cached ad ,providerId:").append(a);
            if (cVar != null) {
                str = cVar.f8200b;
            } else {
                str = "";
            }
            String str3 = str;
            if (C9431p.m18664a(str2)) {
                mo7249a();
            } else {
                ad = m7719a(a, str2, j, jSONObject, str3);
                m7721a((C2673a) ad, cVar);
                m7722e(str2);
            }
            mo7256c("after geNext ad:");
            return ad;
        }
        return m7720a(aVar.f8223a, aVar.f8224b, cVar, aVar.f8226d, aVar.f8225c);
    }

    public C2683a(C2690b bVar, String str, String str2) {
        boolean z = true;
        this.f8161k = Boolean.valueOf(true);
        this.f8162l = true;
        this.f8164n = new C2753a() {
            /* renamed from: a */
            public final void mo7260a(final String str) {
                C2747f.m7838a();
                C2683a.this.mo7249a();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(":onPreloadFinished");
                C2683a.this.f8154d.put(str, Long.valueOf(0));
                C2683a.this.f8152b.post(new Runnable() {
                    public final void run() {
                        C9379e eVar = (C9379e) C2683a.this.f8155e.get(str);
                        if (eVar != null) {
                            Iterator it = eVar.iterator();
                            while (it.hasNext()) {
                                it.next();
                            }
                        }
                    }
                });
            }

            /* renamed from: a */
            public final void mo7261a(String str, String str2, int i, String str3, double d) {
                C2747f.m7838a();
                C2683a.this.mo7249a();
                StringBuilder sb = new StringBuilder("preload FAILED, providerId--> ");
                sb.append(i);
                sb.append(", type-->");
                sb.append(str);
                sb.append(", requestTime-->");
                sb.append(d);
                if (!C2737b.f8276a.contains(str3)) {
                    if ("Request Timeout".equals(str3)) {
                        C2711e eVar = new C2711e();
                        eVar.f8209c = i;
                        eVar.f8207a = str2;
                        eVar.f8208b = str;
                        if (C2713g.m7767a()) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("ad_placement_id", eVar.f8207a);
                            hashMap.put("ad_placement_type_prefix", C2724b.m7786a(eVar.f8208b));
                            hashMap.put("ad_placement_type", eVar.f8208b);
                            hashMap.put("ad_provider_id", Integer.valueOf(eVar.f8209c));
                            C2713g.m7765a("ad_request_timeout", "sdk_ad", 0, null, hashMap);
                        }
                        return;
                    }
                    C2710d dVar = new C2710d();
                    dVar.f8206f = i;
                    dVar.f8205e = d;
                    dVar.f8203c = str2;
                    dVar.f8204d = str;
                    dVar.f8201a = "failed";
                    dVar.f8202b = str3;
                    if (C2713g.m7767a()) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("request_status", dVar.f8201a);
                        hashMap2.put("error_message", dVar.f8202b);
                        hashMap2.put("ad_placement_id", dVar.f8203c);
                        hashMap2.put("ad_placement_type_prefix", C2724b.m7786a(dVar.f8204d));
                        hashMap2.put("ad_placement_type", dVar.f8204d);
                        hashMap2.put("ad_request_time", Double.valueOf(dVar.f8205e));
                        hashMap2.put("ad_provider_id", Integer.valueOf(dVar.f8206f));
                        C2713g.m7765a("ad_sdk_request", "sdk_ad", 0, null, hashMap2);
                    }
                }
            }
        };
        this.f8151a = new Handler(C2742a.m7828a());
        this.f8152b = C2742a.f8294a;
        this.f8156f = bVar.f8174a.getApplicationContext();
        this.f8163m = bVar.f8175b;
        this.f8158h = bVar.f8177d;
        this.f8157g = new C2740b(this.f8156f, str, str2);
        C2740b bVar2 = this.f8157g;
        if (!bVar.f8176c || !C2680b.m7713b()) {
            z = false;
        }
        bVar2.f8287b = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo7248a(C2739a aVar, String str, boolean z) {
        mo7249a();
        StringBuilder sb = new StringBuilder("getCachedAdProviderId,type:");
        sb.append(str);
        sb.append("    use strategy：");
        sb.append(aVar.mo7293a());
        if (!(aVar == null || aVar.mo7294b() == null)) {
            for (Integer intValue : aVar.mo7294b()) {
                int intValue2 = intValue.intValue();
                if ((!z || !AbsNativeAdProvider.isInhouseNativeAdProvider(intValue2)) && (!z || !AbsNativeAdProvider.isHeaderBiddingProvider(intValue2))) {
                    C2752b bVar = (C2752b) this.f8153c.get(Integer.valueOf(intValue2));
                    if (bVar != null && bVar.hasValidAd(str)) {
                        return intValue2;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    private AD m7719a(int i, String str, long j, JSONObject jSONObject, String str2) {
        C2752b bVar = (C2752b) this.f8153c.get(Integer.valueOf(i));
        if (bVar == null) {
            return null;
        }
        AD nextAd = bVar.getNextAd(str);
        if (!(nextAd == null || nextAd.mo7232a() == null)) {
            nextAd.mo7232a().f8253d = j;
            nextAd.mo7232a().f8254e = jSONObject;
            nextAd.mo7232a().f8256g = str2;
        }
        return nextAd;
    }

    /* renamed from: a */
    private AD m7720a(C2739a aVar, List<String> list, C2709c cVar, long j, JSONObject jSONObject) {
        String str;
        List<String> list2 = list;
        C2709c cVar2 = cVar;
        AD ad = null;
        if (aVar == null || C2745d.m7836a(list)) {
            mo7249a();
            return null;
        }
        mo7249a();
        StringBuilder sb = new StringBuilder("placementType:");
        sb.append(list);
        sb.append(",fillStrategy:");
        sb.append(aVar);
        for (String a : list) {
            this.f8157g.mo7300a(a, aVar);
        }
        List b = this.f8157g.mo7299a((String) list.get(0)).mo7294b();
        if (C2745d.m7836a(b)) {
            return null;
        }
        for (int i = 0; i < b.size(); i++) {
            int intValue = ((Integer) b.get(i)).intValue();
            C2752b bVar = (C2752b) this.f8153c.get(Integer.valueOf(intValue));
            if (bVar != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= list.size()) {
                        break;
                    }
                    String str2 = (String) list.get(i2);
                    if (bVar.hasValidAd(str2)) {
                        if (cVar2 != null) {
                            str = cVar2.f8200b;
                        } else {
                            str = "";
                        }
                        ad = m7719a(intValue, str2, j, jSONObject, str);
                    } else {
                        i2++;
                    }
                }
                if (ad != null) {
                    break;
                }
            }
        }
        if (ad != null) {
            m7721a((C2673a) ad, cVar2);
        }
        for (String e : list) {
            m7722e(e);
        }
        if (ad != null) {
            mo7249a();
            new StringBuilder("find cached ad:").append(ad);
        } else {
            mo7249a();
        }
        return ad;
    }
}
