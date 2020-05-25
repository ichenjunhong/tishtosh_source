package com.benchmark.p124bl;

import android.content.Context;
import android.os.RemoteException;
import com.benchmark.Benchmark;
import com.benchmark.BenchmarkResult;
import com.benchmark.C2605a;
import com.benchmark.C2627b;
import com.benchmark.C2657k;
import com.bytedance.common.utility.C9414h;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39597bg;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.benchmark.bl.a */
public final class C2633a implements C2657k {

    /* renamed from: a */
    public static BenchmarkAPI f8057a = ((BenchmarkAPI) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(BenchmarkAPI.class));

    /* renamed from: g */
    private static C2633a f8058g = new C2633a();

    /* renamed from: b */
    boolean f8059b;

    /* renamed from: c */
    List<BenchmarkResult> f8060c = new ArrayList();

    /* renamed from: d */
    private C2643k f8061d;

    /* renamed from: e */
    private List<Benchmark> f8062e = new ArrayList();

    /* renamed from: f */
    private List<Benchmark> f8063f = new ArrayList();

    /* renamed from: h */
    private C2627b f8064h;

    /* renamed from: i */
    private C39597bg f8065i;

    /* renamed from: b */
    public static C2633a m7625b() {
        return f8058g;
    }

    /* renamed from: a */
    public final void mo7187a() {
        m7627c(this.f8060c);
    }

    private C2633a() {
        Context a = C11010c.m22280a();
        if (C2627b.f8037c == null) {
            C2627b.f8037c = new C2627b(a);
        }
        this.f8064h = C2627b.f8037c;
        this.f8064h.f8040b = this;
        this.f8065i = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin().getShortVideoPluginService();
    }

    /* renamed from: c */
    private void m7627c(List<BenchmarkResult> list) {
        m7628d(list);
        this.f8064h.mo7175a();
    }

    /* renamed from: a */
    public final void mo7192a(boolean z) {
        m7626b(z);
    }

    /* renamed from: b */
    private void m7626b(boolean z) {
        C0013i.m18a((Callable<TResult>) new C2635c<TResult>(z), (Executor) C24076h.m58902c()).mo20a((C0011g<TResult, TContinuationResult>) new C2636d<TResult,TContinuationResult>(this), C0013i.f25b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7191a(List<Benchmark> list) {
        try {
            if (this.f8064h.mo7177a(list)) {
                this.f8059b = true;
                this.f8063f.clear();
                this.f8063f.addAll(list);
            }
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    static final /* synthetic */ C0013i m7622a(C0013i iVar) throws Exception {
        if (iVar.mo33d()) {
            C2605a.m7549a((Throwable) iVar.mo35f());
        } else if (iVar.mo26b() && iVar.mo34e() != null) {
            C23859b.m58575b().mo49470b(C11010c.m22280a(), "benchmark", iVar.mo34e());
            return iVar;
        }
        return null;
    }

    /* renamed from: d */
    private void m7628d(List<BenchmarkResult> list) {
        if (C9414h.m18630a(list)) {
            this.f8059b = false;
        } else {
            C0013i.m16a((Callable<TResult>) new C2641i<TResult>(this, new ArrayList(list))).mo20a((C0011g<TResult, TContinuationResult>) new C2642j<TResult,TContinuationResult>(this), C0013i.f25b);
        }
    }

    /* renamed from: a */
    private void m7623a(BenchmarkResult benchmarkResult) {
        ListIterator listIterator = this.f8063f.listIterator();
        while (listIterator.hasNext()) {
            Benchmark benchmark = (Benchmark) listIterator.next();
            if (!(benchmark == null || benchmarkResult == null || benchmarkResult.f8019e == null || benchmark.f8014id != benchmarkResult.f8019e.f8014id)) {
                this.f8060c.add(benchmarkResult);
                listIterator.remove();
                this.f8062e.remove(benchmark);
            }
        }
        if (this.f8063f.isEmpty()) {
            m7627c(this.f8060c);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085 A[Catch:{ JSONException -> 0x009d }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m7629e(java.util.List<com.benchmark.BenchmarkResult> r10) {
        /*
            com.ss.android.ugc.aweme.bl.b r0 = com.p683ss.android.ugc.aweme.p1439bl.C23859b.m58575b()
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            java.lang.String r2 = "benchmark"
            r3 = 0
            java.lang.String r0 = r0.mo49468b(r1, r2, r3)
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x009d }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x009d }
            java.lang.String r0 = "benchmarks"
            org.json.JSONArray r0 = r1.optJSONArray(r0)     // Catch:{ JSONException -> 0x009d }
            r2 = 0
            if (r0 == 0) goto L_0x006d
            boolean r4 = com.bytedance.common.utility.C9414h.m18630a(r10)     // Catch:{ JSONException -> 0x009d }
            if (r4 != 0) goto L_0x006d
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ JSONException -> 0x009d }
            r4.<init>()     // Catch:{ JSONException -> 0x009d }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ JSONException -> 0x009d }
        L_0x002c:
            boolean r5 = r10.hasNext()     // Catch:{ JSONException -> 0x009d }
            if (r5 == 0) goto L_0x005e
            java.lang.Object r5 = r10.next()     // Catch:{ JSONException -> 0x009d }
            com.benchmark.BenchmarkResult r5 = (com.benchmark.BenchmarkResult) r5     // Catch:{ JSONException -> 0x009d }
            r6 = 0
        L_0x0039:
            int r7 = r0.length()     // Catch:{ JSONException -> 0x009d }
            if (r6 >= r7) goto L_0x002c
            org.json.JSONObject r7 = r0.getJSONObject(r6)     // Catch:{ JSONException -> 0x009d }
            com.benchmark.Benchmark r8 = r5.f8019e     // Catch:{ JSONException -> 0x009d }
            java.lang.String r8 = r8.name     // Catch:{ JSONException -> 0x009d }
            java.lang.String r9 = "name"
            java.lang.String r7 = r7.optString(r9)     // Catch:{ JSONException -> 0x009d }
            boolean r7 = r8.equals(r7)     // Catch:{ JSONException -> 0x009d }
            if (r7 == 0) goto L_0x005b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ JSONException -> 0x009d }
            r4.add(r5)     // Catch:{ JSONException -> 0x009d }
            goto L_0x002c
        L_0x005b:
            int r6 = r6 + 1
            goto L_0x0039
        L_0x005e:
            boolean r10 = com.bytedance.common.utility.C9414h.m18630a(r4)     // Catch:{ JSONException -> 0x009d }
            if (r10 != 0) goto L_0x006d
            org.json.JSONArray r0 = com.benchmark.C2605a.m7548a(r0, r4)     // Catch:{ JSONException -> 0x009d }
            java.lang.String r10 = "benchmarks"
            r1.put(r10, r0)     // Catch:{ JSONException -> 0x009d }
        L_0x006d:
            if (r0 == 0) goto L_0x007b
            int r10 = r0.length()     // Catch:{ JSONException -> 0x009d }
            if (r10 != 0) goto L_0x0076
            goto L_0x007b
        L_0x0076:
            java.lang.String r10 = r1.toString()     // Catch:{ JSONException -> 0x009d }
            goto L_0x007c
        L_0x007b:
            r10 = r3
        L_0x007c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x009d }
            java.lang.String r4 = "mark finish benchmark and left "
            r1.<init>(r4)     // Catch:{ JSONException -> 0x009d }
            if (r0 == 0) goto L_0x0089
            int r2 = r0.length()     // Catch:{ JSONException -> 0x009d }
        L_0x0089:
            r1.append(r2)     // Catch:{ JSONException -> 0x009d }
            r1.append(r10)     // Catch:{ JSONException -> 0x009d }
            com.ss.android.ugc.aweme.bl.b r0 = com.p683ss.android.ugc.aweme.p1439bl.C23859b.m58575b()     // Catch:{ JSONException -> 0x009d }
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ JSONException -> 0x009d }
            java.lang.String r2 = "benchmark"
            r0.mo49465a(r1, r2, r10)     // Catch:{ JSONException -> 0x009d }
            return
        L_0x009d:
            com.ss.android.ugc.aweme.bl.b r10 = com.p683ss.android.ugc.aweme.p1439bl.C23859b.m58575b()
            android.content.Context r0 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            java.lang.String r1 = "benchmark"
            r10.mo49465a(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.benchmark.p124bl.C2633a.m7629e(java.util.List):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.benchmark.BenchmarkResult>, for r11v0, types: [java.util.List, java.util.List<com.benchmark.BenchmarkResult>] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Boolean mo7193b(java.util.List<com.benchmark.BenchmarkResult> r11) throws java.lang.Exception {
        /*
            r10 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Iterator r1 = r11.iterator()
        L_0x0009:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x009c
            java.lang.Object r2 = r1.next()
            com.benchmark.BenchmarkResult r2 = (com.benchmark.BenchmarkResult) r2
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            com.benchmark.Benchmark r4 = r2.f8019e     // Catch:{ JSONException -> 0x0099 }
            long[] r5 = r2.f8018d     // Catch:{ JSONException -> 0x0099 }
            if (r5 == 0) goto L_0x0039
            int r6 = r5.length     // Catch:{ JSONException -> 0x0099 }
            if (r6 <= 0) goto L_0x0039
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0099 }
            r6.<init>()     // Catch:{ JSONException -> 0x0099 }
            r7 = 0
        L_0x0029:
            int r8 = r5.length     // Catch:{ JSONException -> 0x0099 }
            if (r7 >= r8) goto L_0x0034
            r8 = r5[r7]     // Catch:{ JSONException -> 0x0099 }
            r6.put(r8)     // Catch:{ JSONException -> 0x0099 }
            int r7 = r7 + 1
            goto L_0x0029
        L_0x0034:
            java.lang.String r5 = "consumeTime"
            r3.put(r5, r6)     // Catch:{ JSONException -> 0x0099 }
        L_0x0039:
            java.util.HashMap<java.lang.String, java.lang.String> r5 = r2.f8017c     // Catch:{ JSONException -> 0x0099 }
            if (r5 == 0) goto L_0x006f
            int r6 = r5.size()     // Catch:{ JSONException -> 0x0099 }
            if (r6 <= 0) goto L_0x006f
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0099 }
            r6.<init>()     // Catch:{ JSONException -> 0x0099 }
            java.util.Set r5 = r5.entrySet()     // Catch:{ JSONException -> 0x0099 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ JSONException -> 0x0099 }
        L_0x0050:
            boolean r7 = r5.hasNext()     // Catch:{ JSONException -> 0x0099 }
            if (r7 == 0) goto L_0x006a
            java.lang.Object r7 = r5.next()     // Catch:{ JSONException -> 0x0099 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ JSONException -> 0x0099 }
            java.lang.Object r8 = r7.getKey()     // Catch:{ JSONException -> 0x0099 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ JSONException -> 0x0099 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ JSONException -> 0x0099 }
            r6.put(r8, r7)     // Catch:{ JSONException -> 0x0099 }
            goto L_0x0050
        L_0x006a:
            java.lang.String r5 = "info"
            r3.put(r5, r6)     // Catch:{ JSONException -> 0x0099 }
        L_0x006f:
            java.lang.String r5 = "code"
            int r6 = r2.f8015a     // Catch:{ JSONException -> 0x0099 }
            r3.put(r5, r6)     // Catch:{ JSONException -> 0x0099 }
            java.lang.String r5 = "failedReason"
            java.lang.String r2 = r2.f8016b     // Catch:{ JSONException -> 0x0099 }
            r3.put(r5, r2)     // Catch:{ JSONException -> 0x0099 }
            java.lang.String r2 = "when"
            int r5 = r4.when     // Catch:{ JSONException -> 0x0099 }
            r3.put(r2, r5)     // Catch:{ JSONException -> 0x0099 }
            java.lang.String r2 = "id"
            int r5 = r4.f8014id     // Catch:{ JSONException -> 0x0099 }
            r3.put(r2, r5)     // Catch:{ JSONException -> 0x0099 }
            java.lang.String r2 = "times"
            int r5 = r4.times     // Catch:{ JSONException -> 0x0099 }
            r3.put(r2, r5)     // Catch:{ JSONException -> 0x0099 }
            java.lang.String r2 = r4.name     // Catch:{ JSONException -> 0x0099 }
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x0099 }
            goto L_0x0009
        L_0x0099:
            goto L_0x0009
        L_0x009c:
            java.lang.String r1 = "benchmark"
            com.p683ss.android.ugc.aweme.common.C26890h.m65012a(r1, r0)
            m7629e(r11)
            r11 = 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.benchmark.p124bl.C2633a.mo7193b(java.util.List):java.lang.Boolean");
    }

    /* renamed from: a */
    public final void mo7188a(int i) {
        ArrayList arrayList;
        Object obj;
        boolean z;
        List<Benchmark> list = this.f8062e;
        if (C9414h.m18630a(list)) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Benchmark benchmark : list) {
                if (benchmark.when == i) {
                    arrayList2.add(benchmark);
                }
            }
            arrayList = arrayList2;
        }
        StringBuilder sb = new StringBuilder("startBenchmarkTest called from ");
        sb.append(i);
        sb.append(" with run benchmark ");
        if (arrayList == null) {
            obj = " no task ";
        } else {
            obj = Integer.valueOf(arrayList.size());
        }
        sb.append(obj);
        if (!C9414h.m18630a(arrayList) && !this.f8059b) {
            if (this.f8061d != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m7624a(this.f8061d, (Runnable) new C2634b(this, arrayList));
            } else {
                mo7191a((List<Benchmark>) arrayList);
            }
        }
    }

    /* renamed from: a */
    public final void mo7189a(Benchmark benchmark, BenchmarkResult benchmarkResult) {
        m7623a(benchmarkResult);
    }

    /* renamed from: b */
    public final void mo7194b(Benchmark benchmark, BenchmarkResult benchmarkResult) {
        m7623a(benchmarkResult);
    }

    /* renamed from: a */
    private static void m7624a(C2643k kVar, Runnable runnable) {
        if (kVar != null) {
            C0013i.m18a((Callable<TResult>) new C2639g<TResult>(kVar.f8079a, kVar.f8080b, kVar.f8081c), (Executor) C24076h.m58902c()).mo20a((C0011g<TResult, TContinuationResult>) new C2640h<TResult,TContinuationResult>(runnable), C0013i.f25b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7190a(BenchmarkResponse benchmarkResponse, boolean z) {
        Object obj;
        StringBuilder sb = new StringBuilder("onBenchmarkResponse called from local ");
        sb.append(z);
        sb.append(" benchmark list ");
        if (benchmarkResponse.benchmarks == null) {
            obj = " no task ";
        } else {
            obj = Integer.valueOf(benchmarkResponse.benchmarks.size());
        }
        sb.append(obj);
        if (benchmarkResponse != null && !C9414h.m18630a(benchmarkResponse.benchmarks) && !this.f8059b) {
            List<Benchmark> list = benchmarkResponse.benchmarks;
            this.f8061d = benchmarkResponse.resouces;
            this.f8062e.clear();
            this.f8062e.addAll(list);
            m7624a(this.f8061d, (Runnable) null);
        }
    }
}
