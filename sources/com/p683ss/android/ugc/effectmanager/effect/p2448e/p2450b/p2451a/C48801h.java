package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a;

import android.os.Handler;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
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
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48701f;
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

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.h */
public final class C48801h extends C48653h<CategoryPageModel> {

    /* renamed from: d */
    private final C48890g f122578d;

    /* renamed from: e */
    private final C48620c f122579e = this.f122578d.f122972r;

    /* renamed from: f */
    private final C48641b f122580f = this.f122578d.f122976v;

    /* renamed from: g */
    private final C48642c f122581g = this.f122578d.f122978x;

    /* renamed from: h */
    private int f122582h = this.f122578d.f122973s;

    /* renamed from: i */
    private String f122583i;

    /* renamed from: j */
    private String f122584j;

    /* renamed from: k */
    private String f122585k;

    /* renamed from: l */
    private long f122586l;

    /* renamed from: m */
    private final int f122587m = this.f122578d.f122975u;

    /* renamed from: n */
    private final C48565a f122588n;

    /* renamed from: o */
    private final String f122589o;

    /* renamed from: p */
    private final String f122590p;

    /* renamed from: q */
    private final int f122591q;

    /* renamed from: r */
    private final int f122592r;

    /* renamed from: s */
    private final int f122593s;

    /* renamed from: t */
    private final String f122594t;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.h$a */
    static final class C48802a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48801h f122595a;

        /* renamed from: b */
        final /* synthetic */ CategoryPageModel f122596b;

        C48802a(C48801h hVar, CategoryPageModel categoryPageModel) {
            this.f122595a = hVar;
            this.f122596b = categoryPageModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C48650e<T> eVar = this.f122595a.f122286b;
            if (eVar != null) {
                CategoryPageModel categoryPageModel = this.f122596b;
                C52711k.m112236a((Object) categoryPageModel, "effectModel");
                eVar.mo8638a(categoryPageModel);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.h$b */
    static final class C48803b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48801h f122597a;

        /* renamed from: b */
        final /* synthetic */ C48649d f122598b;

        C48803b(C48801h hVar, C48649d dVar) {
            this.f122597a = hVar;
            this.f122598b = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122597a.f122286b instanceof C48701f) {
                C48650e<T> eVar = this.f122597a.f122286b;
                if (eVar != null) {
                    ((C48701f) eVar).mo59186a(this.f122598b);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: h */
    public final void mo96236h() {
        m105537a(new C48649d(10001));
    }

    /* renamed from: a */
    private final C48605b m105536a() {
        String str;
        HashMap a = C48668f.f122308a.mo96252a(this.f122578d);
        if (!TextUtils.isEmpty(this.f122589o)) {
            a.put("panel", this.f122589o);
        }
        Map map = a;
        String str2 = "category";
        String str3 = this.f122590p;
        if (str3 == null) {
            str3 = "default";
        }
        map.put(str2, str3);
        map.put("cursor", String.valueOf(this.f122592r));
        map.put("count", String.valueOf(this.f122591q));
        map.put("sorting_position", String.valueOf(this.f122593s));
        String str4 = C42311c.f106863g;
        String str5 = this.f122594t;
        if (str5 == null) {
            str5 = "0";
        }
        map.put(str4, str5);
        String str6 = this.f122578d.f122980z;
        if (!TextUtils.isEmpty(str6)) {
            C52711k.m112236a((Object) str6, "testStatus");
            map.put("test_status", str6);
        }
        this.f122584j = this.f122588n.mo96084a();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f122584j);
        sb.append(this.f122578d.f122955a);
        if (this.f122587m == 2) {
            str = "/category/effects/v2";
        } else {
            str = "/category/effects";
        }
        sb.append(str);
        String a2 = C48676l.m105346a(map, sb.toString());
        this.f122583i = a2;
        try {
            InetAddress byName = InetAddress.getByName(new URL(a2).getHost());
            C52711k.m112236a((Object) byName, "InetAddress.getByName(urlHost.host)");
            this.f122585k = byName.getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
        }
        return new C48605b("GET", a2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0136, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013c, code lost:
        r17 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015d, code lost:
        if (r5 == null) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x026a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x026c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x026d, code lost:
        r17 = r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x01b7 */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0159 A[Catch:{ JSONException -> 0x01b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x019e A[Catch:{ JSONException -> 0x01b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01bf A[Catch:{ Exception -> 0x0268, all -> 0x026a }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x026a A[ExcHandler: all (th java.lang.Throwable), Splitter:B:20:0x0037] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x027c A[Catch:{ all -> 0x0298 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96229e() {
        /*
            r18 = this;
            r1 = r18
            long r2 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.effectmanager.common.b r4 = r18.m105536a()
        L_0x000a:
            int r0 = r1.f122582h
            int r5 = r0 + -1
            r1.f122582h = r5
            if (r0 == 0) goto L_0x02a0
            r5 = 0
            boolean r0 = r1.f122285a     // Catch:{ Exception -> 0x0274, all -> 0x0271 }
            if (r0 == 0) goto L_0x002a
            com.ss.android.ugc.effectmanager.common.g.d r0 = new com.ss.android.ugc.effectmanager.common.g.d     // Catch:{ Exception -> 0x0025 }
            r6 = 10001(0x2711, float:1.4014E-41)
            r0.<init>(r6)     // Catch:{ Exception -> 0x0025 }
            r1.m105537a(r0)     // Catch:{ Exception -> 0x0025 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r5)
            return
        L_0x0025:
            r0 = move-exception
            r17 = r4
            goto L_0x0278
        L_0x002a:
            com.ss.android.ugc.effectmanager.g r0 = r1.f122578d     // Catch:{ Exception -> 0x0274, all -> 0x0271 }
            com.ss.android.ugc.effectmanager.common.f.a r0 = r0.f122977w     // Catch:{ Exception -> 0x0274, all -> 0x0271 }
            if (r0 == 0) goto L_0x0036
            java.io.InputStream r0 = r0.mo96221a(r4)     // Catch:{ Exception -> 0x0025 }
            r6 = r0
            goto L_0x0037
        L_0x0036:
            r6 = r5
        L_0x0037:
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            com.ss.android.ugc.effectmanager.g r0 = r1.f122578d     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            com.ss.android.ugc.effectmanager.common.f.a r0 = r0.f122977w     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            if (r0 == 0) goto L_0x004d
            com.ss.android.ugc.effectmanager.common.e.b r0 = r1.f122580f     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse> r9 = com.p683ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse.class
            com.ss.android.ugc.effectmanager.common.model.BaseNetResponse r0 = com.p683ss.android.ugc.effectmanager.common.p2439f.C48644a.m105250a(r4, r6, r0, r9)     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            com.ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse r0 = (com.p683ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse) r0     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            r9 = r0
            goto L_0x004e
        L_0x004d:
            r9 = r5
        L_0x004e:
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            if (r9 == 0) goto L_0x024c
            boolean r0 = r9.checkValue()     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            if (r0 != 0) goto L_0x005c
            goto L_0x024c
        L_0x005c:
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r12 = r9.getData()     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            com.ss.android.ugc.effectmanager.g r0 = r1.f122578d     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.io.File r0 = r0.f122964j     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.lang.String r13 = "mConfiguration.effectDir"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r13)     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.lang.String r13 = r1.f122589o     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.lang.String r14 = "effectModel"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r14)     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r14 = r12.getCategoryEffects()     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.lang.String r15 = "effectModel.categoryEffects"
            p2628d.p2639f.p2641b.C52711k.m112236a(r14, r15)     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.util.List r14 = r14.getEffects()     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105308a(r0, r13, r14)     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            com.ss.android.ugc.effectmanager.g r0 = r1.f122578d     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.io.File r0 = r0.f122964j     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.lang.String r13 = "mConfiguration.effectDir"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r13)     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.lang.String r13 = r1.f122589o     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r14 = r12.getCategoryEffects()     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.lang.String r15 = "effectModel.categoryEffects"
            p2628d.p2639f.p2641b.C52711k.m112236a(r14, r15)     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.util.List r14 = r14.getCollectEffects()     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105308a(r0, r13, r14)     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            com.ss.android.ugc.effectmanager.g r0 = r1.f122578d     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.io.File r0 = r0.f122964j     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.lang.String r13 = "mConfiguration.effectDir"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r13)     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.lang.String r13 = r1.f122589o     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r14 = r12.getCategoryEffects()     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.lang.String r15 = "effectModel.categoryEffects"
            p2628d.p2639f.p2641b.C52711k.m112236a(r14, r15)     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.util.List r14 = r14.getBindEffects()     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105308a(r0, r13, r14)     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            int r0 = r1.f122587m     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            r13 = 2
            if (r0 != r13) goto L_0x0103
            java.util.List r0 = r12.getUrl_prefix()     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r13 = r12.getCategoryEffects()     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.lang.String r14 = "effectModel.categoryEffects"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r14)     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.util.List r13 = r13.getEffects()     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105310a(r0, r13)     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.util.List r0 = r12.getUrl_prefix()     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r13 = r12.getCategoryEffects()     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.lang.String r14 = "effectModel.categoryEffects"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r14)     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.util.List r13 = r13.getCollectEffects()     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105310a(r0, r13)     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.util.List r0 = r12.getUrl_prefix()     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r13 = r12.getCategoryEffects()     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.lang.String r14 = "effectModel.categoryEffects"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r14)     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.util.List r13 = r13.getBindEffects()     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105310a(r0, r13)     // Catch:{ Exception -> 0x026c, all -> 0x026a }
        L_0x0103:
            java.lang.String r0 = r1.f122589o     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.lang.String r13 = r1.f122590p     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            int r14 = r1.f122591q     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            int r15 = r1.f122592r     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            int r5 = r1.f122593s     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            java.lang.String r0 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48667e.m105299a(r0, r13, r14, r15, r5)     // Catch:{ Exception -> 0x026c, all -> 0x026a }
            com.ss.android.ugc.effectmanager.common.e.b r5 = r1.f122580f     // Catch:{ Exception -> 0x013b, all -> 0x026a }
            if (r5 == 0) goto L_0x011a
            java.lang.String r5 = r5.mo59190a(r9)     // Catch:{ Exception -> 0x013b, all -> 0x026a }
            goto L_0x011b
        L_0x011a:
            r5 = 0
        L_0x011b:
            if (r5 == 0) goto L_0x0138
            com.ss.android.ugc.effectmanager.common.b.c r13 = r1.f122579e     // Catch:{ Exception -> 0x013b, all -> 0x026a }
            if (r13 == 0) goto L_0x012b
            java.lang.String r14 = "key"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r14)     // Catch:{ Exception -> 0x013b, all -> 0x026a }
            long r13 = r13.mo96148a(r0, r5)     // Catch:{ Exception -> 0x013b, all -> 0x026a }
            goto L_0x012d
        L_0x012b:
            r13 = 0
        L_0x012d:
            int r0 = com.p683ss.android.ugc.effectmanager.common.C48590a.f122161a     // Catch:{ Exception -> 0x013b, all -> 0x026a }
            r17 = r4
            long r4 = (long) r0
            long r13 = r13 / r4
            r1.f122586l = r13     // Catch:{ Exception -> 0x0136, all -> 0x026a }
            goto L_0x0143
        L_0x0136:
            r0 = move-exception
            goto L_0x013e
        L_0x0138:
            r17 = r4
            goto L_0x0143
        L_0x013b:
            r0 = move-exception
            r17 = r4
        L_0x013e:
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            android.util.Log.getStackTraceString(r0)     // Catch:{ Exception -> 0x0268, all -> 0x026a }
        L_0x0143:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            r0.<init>()     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            java.lang.String r4 = "version"
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r5 = r9.getData()     // Catch:{ JSONException -> 0x01b7 }
            java.lang.String r13 = "model.data"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r13)     // Catch:{ JSONException -> 0x01b7 }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r5 = r5.getCategoryEffects()     // Catch:{ JSONException -> 0x01b7 }
            if (r5 == 0) goto L_0x015f
            java.lang.String r5 = r5.getVersion()     // Catch:{ JSONException -> 0x01b7 }
            if (r5 != 0) goto L_0x0161
        L_0x015f:
            java.lang.String r5 = "0"
        L_0x0161:
            r0.put(r4, r5)     // Catch:{ JSONException -> 0x01b7 }
            java.lang.String r4 = "cursor"
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r5 = r9.getData()     // Catch:{ JSONException -> 0x01b7 }
            java.lang.String r13 = "model.data"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r13)     // Catch:{ JSONException -> 0x01b7 }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r5 = r5.getCategoryEffects()     // Catch:{ JSONException -> 0x01b7 }
            java.lang.String r13 = "model.data.categoryEffects"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r13)     // Catch:{ JSONException -> 0x01b7 }
            int r5 = r5.getCursor()     // Catch:{ JSONException -> 0x01b7 }
            r0.put(r4, r5)     // Catch:{ JSONException -> 0x01b7 }
            java.lang.String r4 = "sorting_position"
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r5 = r9.getData()     // Catch:{ JSONException -> 0x01b7 }
            java.lang.String r9 = "model.data"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r9)     // Catch:{ JSONException -> 0x01b7 }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r5 = r5.getCategoryEffects()     // Catch:{ JSONException -> 0x01b7 }
            java.lang.String r9 = "model.data.categoryEffects"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r9)     // Catch:{ JSONException -> 0x01b7 }
            int r5 = r5.getSortingPosition()     // Catch:{ JSONException -> 0x01b7 }
            r0.put(r4, r5)     // Catch:{ JSONException -> 0x01b7 }
            com.ss.android.ugc.effectmanager.common.b.c r4 = r1.f122579e     // Catch:{ JSONException -> 0x01b7 }
            if (r4 == 0) goto L_0x01b7
            java.lang.String r5 = r1.f122589o     // Catch:{ JSONException -> 0x01b7 }
            java.lang.String r9 = r1.f122590p     // Catch:{ JSONException -> 0x01b7 }
            java.lang.String r5 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48667e.m105302c(r5, r9)     // Catch:{ JSONException -> 0x01b7 }
            java.lang.String r9 = "EffectCacheKeyGenerator.…rsionKey(panel, category)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r9)     // Catch:{ JSONException -> 0x01b7 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x01b7 }
            java.lang.String r9 = "jsonObject.toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r9)     // Catch:{ JSONException -> 0x01b7 }
            r4.mo96148a(r5, r0)     // Catch:{ JSONException -> 0x01b7 }
        L_0x01b7:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            com.ss.android.ugc.effectmanager.common.e.c r0 = r1.f122581g     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            if (r0 == 0) goto L_0x023c
            java.lang.String r9 = "category_list_success_rate"
            com.ss.android.ugc.effectmanager.common.h.h r14 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48670h.m105314a()     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            java.lang.String r15 = "app_id"
            com.ss.android.ugc.effectmanager.g r13 = r1.f122578d     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            java.lang.String r13 = r13.f122966l     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            com.ss.android.ugc.effectmanager.common.h.h r13 = r14.mo96255a(r15, r13)     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            java.lang.String r14 = "access_key"
            com.ss.android.ugc.effectmanager.g r15 = r1.f122578d     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            java.lang.String r15 = r15.f122956b     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            com.ss.android.ugc.effectmanager.common.h.h r13 = r13.mo96255a(r14, r15)     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            java.lang.String r14 = "panel"
            java.lang.String r15 = r1.f122589o     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            com.ss.android.ugc.effectmanager.common.h.h r13 = r13.mo96255a(r14, r15)     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            java.lang.String r14 = "category"
            java.lang.String r15 = r1.f122590p     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            com.ss.android.ugc.effectmanager.common.h.h r13 = r13.mo96255a(r14, r15)     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            java.lang.String r14 = "duration"
            r15 = 0
            long r15 = r4 - r2
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            com.ss.android.ugc.effectmanager.common.h.h r13 = r13.mo96254a(r14, r15)     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            java.lang.String r14 = "network_time"
            r15 = 0
            long r15 = r7 - r2
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            com.ss.android.ugc.effectmanager.common.h.h r13 = r13.mo96254a(r14, r15)     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            java.lang.String r14 = "json_time"
            r15 = 0
            long r7 = r10 - r7
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            com.ss.android.ugc.effectmanager.common.h.h r7 = r13.mo96254a(r14, r7)     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            java.lang.String r8 = "io_time"
            r13 = 0
            long r4 = r4 - r10
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            com.ss.android.ugc.effectmanager.common.h.h r4 = r7.mo96254a(r8, r4)     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            java.lang.String r5 = "size"
            long r7 = r1.f122586l     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            com.ss.android.ugc.effectmanager.common.h.h r4 = r4.mo96254a(r5, r7)     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            java.lang.String r5 = "request_strategy"
            int r7 = r1.f122587m     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            com.ss.android.ugc.effectmanager.common.h.h r4 = r4.mo96253a(r5, r7)     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            org.json.JSONObject r4 = r4.mo96256b()     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            r5 = 0
            r0.mo59187a(r9, r5, r4)     // Catch:{ Exception -> 0x0268, all -> 0x026a }
        L_0x023c:
            com.ss.android.ugc.effectmanager.effect.e.b.a.h$a r0 = new com.ss.android.ugc.effectmanager.effect.e.b.a.h$a     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            r0.<init>(r1, r12)     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            d.f.a.a r0 = (p2628d.p2639f.p2640a.C52670a) r0     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            r1.mo96235a(r0)     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            java.io.Closeable r6 = (java.io.Closeable) r6
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r6)
            return
        L_0x024c:
            r17 = r4
            int r0 = r1.f122582h     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            if (r0 != 0) goto L_0x0262
            com.ss.android.ugc.effectmanager.common.g.d r0 = new com.ss.android.ugc.effectmanager.common.g.d     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            r4 = 10002(0x2712, float:1.4016E-41)
            r0.<init>(r4)     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            r1.m105537a(r0)     // Catch:{ Exception -> 0x0268, all -> 0x026a }
            java.io.Closeable r6 = (java.io.Closeable) r6
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r6)
            return
        L_0x0262:
            java.io.Closeable r6 = (java.io.Closeable) r6
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r6)
            goto L_0x0286
        L_0x0268:
            r0 = move-exception
            goto L_0x026f
        L_0x026a:
            r0 = move-exception
            goto L_0x029a
        L_0x026c:
            r0 = move-exception
            r17 = r4
        L_0x026f:
            r5 = r6
            goto L_0x0278
        L_0x0271:
            r0 = move-exception
            r6 = 0
            goto L_0x029a
        L_0x0274:
            r0 = move-exception
            r17 = r4
            r5 = 0
        L_0x0278:
            int r4 = r1.f122582h     // Catch:{ all -> 0x0298 }
            if (r4 == 0) goto L_0x028a
            boolean r4 = r0 instanceof com.p683ss.android.ugc.effectmanager.common.p2437d.C48636c     // Catch:{ all -> 0x0298 }
            if (r4 == 0) goto L_0x0281
            goto L_0x028a
        L_0x0281:
            java.io.Closeable r5 = (java.io.Closeable) r5
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r5)
        L_0x0286:
            r4 = r17
            goto L_0x000a
        L_0x028a:
            com.ss.android.ugc.effectmanager.common.g.d r2 = new com.ss.android.ugc.effectmanager.common.g.d     // Catch:{ all -> 0x0298 }
            r2.<init>(r0)     // Catch:{ all -> 0x0298 }
            r1.m105537a(r2)     // Catch:{ all -> 0x0298 }
            java.io.Closeable r5 = (java.io.Closeable) r5
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r5)
            return
        L_0x0298:
            r0 = move-exception
            r6 = r5
        L_0x029a:
            java.io.Closeable r6 = (java.io.Closeable) r6
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r6)
            throw r0
        L_0x02a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48801h.mo96229e():void");
    }

    /* renamed from: a */
    private final void m105537a(C48649d dVar) {
        dVar.mo96230a(this.f122583i, this.f122584j, this.f122585k);
        mo96235a((C52670a<C52860x>) new C48803b<C52860x>(this, dVar));
        C48642c cVar = this.f122581g;
        if (cVar != null) {
            cVar.mo59187a("category_list_success_rate", 1, C48670h.m105314a().mo96255a("app_id", this.f122578d.f122966l).mo96255a("access_key", this.f122578d.f122956b).mo96255a("panel", this.f122589o).mo96255a("category", this.f122590p).mo96253a("error_code", Integer.valueOf(dVar.f122279a)).mo96255a("error_msg", dVar.f122280b).mo96255a("download_url", this.f122583i).mo96255a("host_ip", this.f122585k).mo96256b());
        }
    }

    public C48801h(C48565a aVar, String str, String str2, String str3, int i, int i2, int i3, String str4, Handler handler) {
        C52711k.m112240b(aVar, "mEffectContext");
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(str2, "taskFlag");
        super(handler, str2);
        this.f122588n = aVar;
        this.f122589o = str;
        this.f122590p = str3;
        this.f122591q = i;
        this.f122592r = i2;
        this.f122593s = i3;
        this.f122594t = str4;
        C48890g gVar = this.f122588n.f122047a;
        C52711k.m112236a((Object) gVar, "mEffectContext.effectConfiguration");
        this.f122578d = gVar;
    }
}
