package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a;

import android.os.Handler;
import android.text.TextUtils;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.C48605b;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48620c;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48642c;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48650e;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48653h;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48668f;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48670h;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48676l;
import com.p683ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48707l;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.p */
public final class C48832p extends C48653h<PanelInfoModel> {

    /* renamed from: d */
    private final C48890g f122671d;

    /* renamed from: e */
    private int f122672e = this.f122671d.f122973s;

    /* renamed from: f */
    private final C48620c f122673f = this.f122671d.f122972r;

    /* renamed from: g */
    private final C48641b f122674g = this.f122671d.f122976v;

    /* renamed from: h */
    private final C48642c f122675h = this.f122671d.f122978x;

    /* renamed from: i */
    private String f122676i;

    /* renamed from: j */
    private String f122677j;

    /* renamed from: k */
    private String f122678k;

    /* renamed from: l */
    private long f122679l;

    /* renamed from: m */
    private final int f122680m = this.f122671d.f122975u;

    /* renamed from: n */
    private final C48565a f122681n;

    /* renamed from: o */
    private final String f122682o;

    /* renamed from: p */
    private final boolean f122683p;

    /* renamed from: q */
    private final String f122684q;

    /* renamed from: r */
    private final int f122685r;

    /* renamed from: s */
    private final int f122686s;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.p$a */
    static final class C48833a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48832p f122687a;

        /* renamed from: b */
        final /* synthetic */ PanelInfoModel f122688b;

        C48833a(C48832p pVar, PanelInfoModel panelInfoModel) {
            this.f122687a = pVar;
            this.f122688b = panelInfoModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C48650e<T> eVar = this.f122687a.f122286b;
            if (eVar != null) {
                PanelInfoModel panelInfoModel = this.f122688b;
                C52711k.m112236a((Object) panelInfoModel, "panelInfoModel");
                eVar.mo8638a(panelInfoModel);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.p$b */
    static final class C48834b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48832p f122689a;

        /* renamed from: b */
        final /* synthetic */ C48649d f122690b;

        C48834b(C48832p pVar, C48649d dVar) {
            this.f122689a = pVar;
            this.f122690b = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122689a.f122286b instanceof C48707l) {
                C48650e<T> eVar = this.f122689a.f122286b;
                if (eVar != null) {
                    ((C48707l) eVar).mo59192a(this.f122690b);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: h */
    public final void mo96236h() {
        m105558a(new C48649d(10001));
    }

    /* renamed from: a */
    private final C48605b m105557a() {
        String str;
        HashMap a = C48668f.f122308a.mo96252a(this.f122671d);
        if (!TextUtils.isEmpty(this.f122682o)) {
            a.put("panel", this.f122682o);
        }
        if (this.f122683p) {
            Map map = a;
            map.put("has_category_effects", "true");
            String str2 = "category";
            String str3 = this.f122684q;
            if (str3 == null) {
                str3 = "default";
            }
            map.put(str2, str3);
            map.put("cursor", String.valueOf(this.f122686s));
            map.put("count", String.valueOf(this.f122685r));
        }
        String str4 = this.f122671d.f122980z;
        if (str4 != null) {
            a.put("test_status", str4);
        }
        this.f122677j = this.f122681n.mo96084a();
        Map map2 = a;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f122677j);
        sb.append(this.f122671d.f122955a);
        if (this.f122680m == 2) {
            str = "/panel/info/v2";
        } else {
            str = "/panel/info";
        }
        sb.append(str);
        String a2 = C48676l.m105346a(map2, sb.toString());
        this.f122676i = a2;
        try {
            InetAddress byName = InetAddress.getByName(new URL(a2).getHost());
            C52711k.m112236a((Object) byName, "address");
            this.f122678k = byName.getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
        }
        return new C48605b("GET", a2);
    }

    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r17v3 */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r17v4 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r17v5 */
    /* JADX WARNING: type inference failed for: r17v6 */
    /* JADX WARNING: type inference failed for: r17v7 */
    /* JADX WARNING: type inference failed for: r17v8 */
    /* JADX WARNING: type inference failed for: r17v9 */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r17v10 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r17v11 */
    /* JADX WARNING: type inference failed for: r17v12 */
    /* JADX WARNING: type inference failed for: r5v26 */
    /* JADX WARNING: type inference failed for: r6v28 */
    /* JADX WARNING: type inference failed for: r0v32, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r6v29 */
    /* JADX WARNING: type inference failed for: r5v27 */
    /* JADX WARNING: type inference failed for: r17v13 */
    /* JADX WARNING: type inference failed for: r17v14 */
    /* JADX WARNING: type inference failed for: r17v15 */
    /* JADX WARNING: type inference failed for: r17v16 */
    /* JADX WARNING: type inference failed for: r17v17 */
    /* JADX WARNING: type inference failed for: r17v18 */
    /* JADX WARNING: type inference failed for: r17v19 */
    /* JADX WARNING: type inference failed for: r17v20 */
    /* JADX WARNING: type inference failed for: r17v21 */
    /* JADX WARNING: type inference failed for: r17v22 */
    /* JADX WARNING: type inference failed for: r17v23 */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b0, code lost:
        if (r5 == null) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01fc, code lost:
        r0 = th;
        r17 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01fe, code lost:
        r0 = e;
        r17 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0200, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0201, code lost:
        r17 = r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r17v7
      assigns: []
      uses: []
      mth insns count: 236
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0218 A[Catch:{ all -> 0x0234 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01fc A[ExcHandler: all (th java.lang.Throwable), PHI: r17 
      PHI: (r17v8 ?) = (r17v17 ?), (r17v18 ?), (r17v20 ?), (r17v22 ?) binds: [B:79:0x01de, B:50:0x0176, B:62:0x019a, B:46:0x00ed] A[DONT_GENERATE, DONT_INLINE], Splitter:B:46:0x00ed] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0200 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:29:0x0054] */
    /* JADX WARNING: Unknown variable types count: 13 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96229e() {
        /*
            r20 = this;
            r1 = r20
            long r2 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.effectmanager.common.b r4 = r20.m105557a()
        L_0x000a:
            int r0 = r1.f122672e
            int r5 = r0 + -1
            r1.f122672e = r5
            if (r0 == 0) goto L_0x023d
            r5 = 0
            boolean r0 = r1.f122285a     // Catch:{ Exception -> 0x0210, all -> 0x020c }
            if (r0 == 0) goto L_0x002a
            com.ss.android.ugc.effectmanager.common.g.d r0 = new com.ss.android.ugc.effectmanager.common.g.d     // Catch:{ Exception -> 0x0025 }
            r6 = 10001(0x2711, float:1.4014E-41)
            r0.<init>(r6)     // Catch:{ Exception -> 0x0025 }
            r1.m105558a(r0)     // Catch:{ Exception -> 0x0025 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r5)
            return
        L_0x0025:
            r0 = move-exception
            r16 = r4
            goto L_0x0214
        L_0x002a:
            com.ss.android.ugc.effectmanager.g r0 = r1.f122671d     // Catch:{ Exception -> 0x0210, all -> 0x020c }
            com.ss.android.ugc.effectmanager.common.f.a r0 = r0.f122977w     // Catch:{ Exception -> 0x0210, all -> 0x020c }
            if (r0 == 0) goto L_0x0036
            java.io.InputStream r0 = r0.mo96221a(r4)     // Catch:{ Exception -> 0x0025 }
            r6 = r0
            goto L_0x0037
        L_0x0036:
            r6 = r5
        L_0x0037:
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0204, all -> 0x0200 }
            com.ss.android.ugc.effectmanager.g r0 = r1.f122671d     // Catch:{ Exception -> 0x0204, all -> 0x0200 }
            com.ss.android.ugc.effectmanager.common.f.a r0 = r0.f122977w     // Catch:{ Exception -> 0x0204, all -> 0x0200 }
            if (r0 == 0) goto L_0x0053
            com.ss.android.ugc.effectmanager.common.e.b r0 = r1.f122674g     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse> r9 = com.p683ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse.class
            com.ss.android.ugc.effectmanager.common.model.BaseNetResponse r0 = com.p683ss.android.ugc.effectmanager.common.p2439f.C48644a.m105250a(r4, r6, r0, r9)     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            com.ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse r0 = (com.p683ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse) r0     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            r9 = r0
            goto L_0x0054
        L_0x004d:
            r0 = move-exception
            r16 = r4
            r5 = r6
            goto L_0x0214
        L_0x0053:
            r9 = r5
        L_0x0054:
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0204, all -> 0x0200 }
            if (r9 == 0) goto L_0x01da
            boolean r0 = r9.checkValue()     // Catch:{ Exception -> 0x0204, all -> 0x0200 }
            if (r0 != 0) goto L_0x0062
            goto L_0x01da
        L_0x0062:
            com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel r0 = r9.getData()     // Catch:{ Exception -> 0x0204, all -> 0x0200 }
            java.lang.String r12 = "panelInfoModel"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r12)     // Catch:{ Exception -> 0x0204, all -> 0x0200 }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r12 = r0.getCategoryEffectModel()     // Catch:{ Exception -> 0x0204, all -> 0x0200 }
            if (r12 == 0) goto L_0x00d9
            com.ss.android.ugc.effectmanager.g r13 = r1.f122671d     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            java.io.File r13 = r13.f122964j     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            java.lang.String r14 = "mConfiguration.effectDir"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r14)     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            java.lang.String r13 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            java.lang.String r14 = r1.f122682o     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            java.util.List r15 = r12.getEffects()     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105308a(r13, r14, r15)     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            com.ss.android.ugc.effectmanager.g r13 = r1.f122671d     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            java.io.File r13 = r13.f122964j     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            java.lang.String r14 = "mConfiguration.effectDir"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r14)     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            java.lang.String r13 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            java.lang.String r14 = r1.f122682o     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            java.util.List r15 = r12.getCollectEffects()     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105308a(r13, r14, r15)     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            com.ss.android.ugc.effectmanager.g r13 = r1.f122671d     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            java.io.File r13 = r13.f122964j     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            java.lang.String r14 = "mConfiguration.effectDir"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r14)     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            java.lang.String r13 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            java.lang.String r14 = r1.f122682o     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            java.util.List r15 = r12.getBindEffects()     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105308a(r13, r14, r15)     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            int r13 = r1.f122680m     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            r14 = 2
            if (r13 != r14) goto L_0x00d9
            java.util.List r13 = r0.getUrlPrefix()     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            java.util.List r14 = r12.getEffects()     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105310a(r13, r14)     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            java.util.List r13 = r0.getUrlPrefix()     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            java.util.List r14 = r12.getCollectEffects()     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105310a(r13, r14)     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            java.util.List r13 = r0.getUrlPrefix()     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            java.util.List r12 = r12.getBindEffects()     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105310a(r13, r12)     // Catch:{ Exception -> 0x004d, all -> 0x0200 }
        L_0x00d9:
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0204, all -> 0x0200 }
            com.ss.android.ugc.effectmanager.common.e.c r14 = r1.f122675h     // Catch:{ Exception -> 0x0204, all -> 0x0200 }
            if (r14 == 0) goto L_0x015e
            java.lang.String r15 = "panel_info_success_rate"
            com.ss.android.ugc.effectmanager.common.h.h r5 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48670h.m105314a()     // Catch:{ Exception -> 0x0204, all -> 0x0200 }
            r16 = r4
            java.lang.String r4 = "app_id"
            r17 = r6
            com.ss.android.ugc.effectmanager.g r6 = r1.f122671d     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            java.lang.String r6 = r6.f122966l     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            com.ss.android.ugc.effectmanager.common.h.h r4 = r5.mo96255a(r4, r6)     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            java.lang.String r5 = "access_key"
            com.ss.android.ugc.effectmanager.g r6 = r1.f122671d     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            java.lang.String r6 = r6.f122956b     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            com.ss.android.ugc.effectmanager.common.h.h r4 = r4.mo96255a(r5, r6)     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            java.lang.String r5 = "panel"
            java.lang.String r6 = r1.f122682o     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            com.ss.android.ugc.effectmanager.common.h.h r4 = r4.mo96255a(r5, r6)     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            java.lang.String r5 = "duration"
            r6 = 0
            long r18 = r12 - r2
            java.lang.Long r6 = java.lang.Long.valueOf(r18)     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            com.ss.android.ugc.effectmanager.common.h.h r4 = r4.mo96254a(r5, r6)     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            java.lang.String r5 = "network_time"
            r6 = 0
            long r18 = r7 - r2
            java.lang.Long r6 = java.lang.Long.valueOf(r18)     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            com.ss.android.ugc.effectmanager.common.h.h r4 = r4.mo96254a(r5, r6)     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            java.lang.String r5 = "json_time"
            r6 = 0
            long r7 = r10 - r7
            java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            com.ss.android.ugc.effectmanager.common.h.h r4 = r4.mo96254a(r5, r6)     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            java.lang.String r5 = "io_time"
            r6 = 0
            long r12 = r12 - r10
            java.lang.Long r6 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            com.ss.android.ugc.effectmanager.common.h.h r4 = r4.mo96254a(r5, r6)     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            java.lang.String r5 = "size"
            long r6 = r1.f122679l     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            com.ss.android.ugc.effectmanager.common.h.h r4 = r4.mo96254a(r5, r6)     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            java.lang.String r5 = "request_strategy"
            int r6 = r1.f122680m     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            com.ss.android.ugc.effectmanager.common.h.h r4 = r4.mo96253a(r5, r6)     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            org.json.JSONObject r4 = r4.mo96256b()     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            r5 = 0
            r14.mo59187a(r15, r5, r4)     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            goto L_0x0162
        L_0x015b:
            r0 = move-exception
            goto L_0x0207
        L_0x015e:
            r16 = r4
            r17 = r6
        L_0x0162:
            com.ss.android.ugc.effectmanager.effect.e.b.a.p$a r4 = new com.ss.android.ugc.effectmanager.effect.e.b.a.p$a     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            r4.<init>(r1, r0)     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            d.f.a.a r4 = (p2628d.p2639f.p2640a.C52670a) r4     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            r1.mo96235a(r4)     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            com.ss.android.ugc.effectmanager.g r0 = r1.f122671d     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            java.lang.String r0 = r0.f122960f     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            java.lang.String r4 = r1.f122682o     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            java.lang.String r0 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48667e.m105300b(r0, r4)     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            com.ss.android.ugc.effectmanager.common.e.b r4 = r1.f122674g     // Catch:{ Exception -> 0x0199, all -> 0x01fc }
            if (r4 == 0) goto L_0x017f
            java.lang.String r5 = r4.mo59190a(r9)     // Catch:{ Exception -> 0x0199, all -> 0x01fc }
            goto L_0x0180
        L_0x017f:
            r5 = 0
        L_0x0180:
            if (r5 == 0) goto L_0x019f
            com.ss.android.ugc.effectmanager.common.b.c r4 = r1.f122673f     // Catch:{ Exception -> 0x0199, all -> 0x01fc }
            if (r4 == 0) goto L_0x0190
            java.lang.String r6 = "key"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r6)     // Catch:{ Exception -> 0x0199, all -> 0x01fc }
            long r4 = r4.mo96148a(r0, r5)     // Catch:{ Exception -> 0x0199, all -> 0x01fc }
            goto L_0x0192
        L_0x0190:
            r4 = 0
        L_0x0192:
            int r0 = com.p683ss.android.ugc.effectmanager.common.C48590a.f122161a     // Catch:{ Exception -> 0x0199, all -> 0x01fc }
            long r6 = (long) r0     // Catch:{ Exception -> 0x0199, all -> 0x01fc }
            long r4 = r4 / r6
            r1.f122679l = r4     // Catch:{ Exception -> 0x0199, all -> 0x01fc }
            goto L_0x019f
        L_0x0199:
            r0 = move-exception
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            android.util.Log.getStackTraceString(r0)     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
        L_0x019f:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            r0.<init>()     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            java.lang.String r4 = "version"
            com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel r5 = r9.getData()     // Catch:{ JSONException -> 0x01d2 }
            if (r5 == 0) goto L_0x01b2
            java.lang.String r5 = r5.getVersion()     // Catch:{ JSONException -> 0x01d2 }
            if (r5 != 0) goto L_0x01b4
        L_0x01b2:
            java.lang.String r5 = "0"
        L_0x01b4:
            r0.put(r4, r5)     // Catch:{ JSONException -> 0x01d2 }
            com.ss.android.ugc.effectmanager.common.b.c r4 = r1.f122673f     // Catch:{ JSONException -> 0x01d2 }
            if (r4 == 0) goto L_0x01d2
            java.lang.String r5 = r1.f122682o     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r5 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48667e.m105297a(r5)     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r6 = "EffectCacheKeyGenerator.…anelInfoVersionKey(panel)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x01d2 }
            java.lang.String r6 = "jsonObject.toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r6)     // Catch:{ JSONException -> 0x01d2 }
            r4.mo96148a(r5, r0)     // Catch:{ JSONException -> 0x01d2 }
        L_0x01d2:
            r6 = r17
            java.io.Closeable r6 = (java.io.Closeable) r6
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r6)
            return
        L_0x01da:
            r16 = r4
            r17 = r6
            int r0 = r1.f122672e     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            if (r0 != 0) goto L_0x01f4
            com.ss.android.ugc.effectmanager.common.g.d r0 = new com.ss.android.ugc.effectmanager.common.g.d     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            r4 = 10002(0x2712, float:1.4016E-41)
            r0.<init>(r4)     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            r1.m105558a(r0)     // Catch:{ Exception -> 0x01fe, all -> 0x01fc }
            r6 = r17
            java.io.Closeable r6 = (java.io.Closeable) r6
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r6)
            return
        L_0x01f4:
            r6 = r17
            java.io.Closeable r6 = (java.io.Closeable) r6
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r6)
            goto L_0x0222
        L_0x01fc:
            r0 = move-exception
            goto L_0x0237
        L_0x01fe:
            r0 = move-exception
            goto L_0x0209
        L_0x0200:
            r0 = move-exception
            r17 = r6
            goto L_0x0237
        L_0x0204:
            r0 = move-exception
            r16 = r4
        L_0x0207:
            r17 = r6
        L_0x0209:
            r5 = r17
            goto L_0x0214
        L_0x020c:
            r0 = move-exception
            r17 = 0
            goto L_0x0237
        L_0x0210:
            r0 = move-exception
            r16 = r4
            r5 = 0
        L_0x0214:
            int r4 = r1.f122672e     // Catch:{ all -> 0x0234 }
            if (r4 == 0) goto L_0x0226
            boolean r4 = r0 instanceof com.p683ss.android.ugc.effectmanager.common.p2437d.C48636c     // Catch:{ all -> 0x0234 }
            if (r4 == 0) goto L_0x021d
            goto L_0x0226
        L_0x021d:
            java.io.Closeable r5 = (java.io.Closeable) r5
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r5)
        L_0x0222:
            r4 = r16
            goto L_0x000a
        L_0x0226:
            com.ss.android.ugc.effectmanager.common.g.d r2 = new com.ss.android.ugc.effectmanager.common.g.d     // Catch:{ all -> 0x0234 }
            r2.<init>(r0)     // Catch:{ all -> 0x0234 }
            r1.m105558a(r2)     // Catch:{ all -> 0x0234 }
            java.io.Closeable r5 = (java.io.Closeable) r5
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r5)
            return
        L_0x0234:
            r0 = move-exception
            r17 = r5
        L_0x0237:
            java.io.Closeable r17 = (java.io.Closeable) r17
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r17)
            throw r0
        L_0x023d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48832p.mo96229e():void");
    }

    /* renamed from: a */
    private final void m105558a(C48649d dVar) {
        dVar.mo96230a(this.f122676i, this.f122677j, this.f122678k);
        mo96235a((C52670a<C52860x>) new C48834b<C52860x>(this, dVar));
        C48642c cVar = this.f122675h;
        if (cVar != null) {
            cVar.mo59187a("panel_info_success_rate", 1, C48670h.m105314a().mo96255a("app_id", this.f122671d.f122966l).mo96255a("access_key", this.f122671d.f122956b).mo96255a("panel", this.f122682o).mo96253a("error_code", Integer.valueOf(dVar.f122279a)).mo96255a("error_msg", dVar.f122280b).mo96255a("host_ip", this.f122678k).mo96255a("download_url", this.f122676i).mo96256b());
        }
    }

    public C48832p(C48565a aVar, String str, String str2, boolean z, String str3, int i, int i2, Handler handler) {
        C52711k.m112240b(aVar, "mEffectContext");
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(str2, "taskFlag");
        super(handler, str2);
        this.f122681n = aVar;
        this.f122682o = str;
        this.f122683p = z;
        this.f122684q = str3;
        this.f122685r = i;
        this.f122686s = i2;
        C48890g gVar = this.f122681n.f122047a;
        C52711k.m112236a((Object) gVar, "mEffectContext.effectConfiguration");
        this.f122671d = gVar;
    }
}
