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
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48702g;
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
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.k */
public final class C48813k extends C48653h<EffectChannelResponse> {

    /* renamed from: d */
    public static final C48814a f122614d = new C48814a(null);

    /* renamed from: p */
    private static final String f122615p = f122615p;

    /* renamed from: e */
    private final C48890g f122616e;

    /* renamed from: f */
    private int f122617f = this.f122616e.f122973s;

    /* renamed from: g */
    private final C48620c f122618g = this.f122616e.f122972r;

    /* renamed from: h */
    private final C48641b f122619h = this.f122616e.f122976v;

    /* renamed from: i */
    private final C48642c f122620i = this.f122616e.f122978x;

    /* renamed from: j */
    private String f122621j;

    /* renamed from: k */
    private String f122622k;

    /* renamed from: l */
    private String f122623l;

    /* renamed from: m */
    private long f122624m;

    /* renamed from: n */
    private final C48565a f122625n;

    /* renamed from: o */
    private final String f122626o;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.k$a */
    public static final class C48814a {
        private C48814a() {
        }

        public /* synthetic */ C48814a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.k$b */
    static final class C48815b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48813k f122627a;

        /* renamed from: b */
        final /* synthetic */ EffectChannelResponse f122628b;

        C48815b(C48813k kVar, EffectChannelResponse effectChannelResponse) {
            this.f122627a = kVar;
            this.f122628b = effectChannelResponse;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C48650e<T> eVar = this.f122627a.f122286b;
            if (eVar != null) {
                EffectChannelResponse effectChannelResponse = this.f122628b;
                C52711k.m112236a((Object) effectChannelResponse, "channelResponse");
                eVar.mo8638a(effectChannelResponse);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.k$c */
    static final class C48816c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48813k f122629a;

        /* renamed from: b */
        final /* synthetic */ C48649d f122630b;

        C48816c(C48813k kVar, C48649d dVar) {
            this.f122629a = kVar;
            this.f122630b = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122629a.f122286b instanceof C48702g) {
                C48650e<T> eVar = this.f122629a.f122286b;
                if (eVar != null) {
                    ((C48702g) eVar).mo8637a(this.f122630b);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: h */
    public final void mo96236h() {
        m105545a(new C48649d(10001));
    }

    /* renamed from: a */
    private final C48605b m105544a() {
        HashMap a = C48668f.f122308a.mo96252a(this.f122616e);
        if (!TextUtils.isEmpty(this.f122626o)) {
            a.put("panel", this.f122626o);
        }
        this.f122622k = this.f122625n.mo96084a();
        Map map = a;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f122622k);
        sb.append(this.f122616e.f122955a);
        sb.append("/v3/effects");
        String a2 = C48676l.m105346a(map, sb.toString());
        this.f122621j = a2;
        try {
            InetAddress byName = InetAddress.getByName(new URL(a2).getHost());
            C52711k.m112236a((Object) byName, "InetAddress.getByName(urlHost.host)");
            this.f122623l = byName.getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
        }
        return new C48605b("GET", a2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c2, code lost:
        if (r5 == null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0187, code lost:
        r0 = th;
        r6 = r6;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x00e9 */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00be A[SYNTHETIC, Splitter:B:49:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cd A[Catch:{ JSONException -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fb A[Catch:{ Exception -> 0x0185, all -> 0x0187 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0187 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:44:0x00b0] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0198 A[Catch:{ all -> 0x018e }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96229e() {
        /*
            r18 = this;
            r1 = r18
            long r2 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.effectmanager.common.b r4 = r18.m105544a()
        L_0x000a:
            int r0 = r1.f122617f
            int r5 = r0 + -1
            r1.f122617f = r5
            if (r0 == 0) goto L_0x01ba
            r5 = 0
            boolean r0 = r1.f122285a     // Catch:{ Exception -> 0x0191 }
            if (r0 == 0) goto L_0x0025
            com.ss.android.ugc.effectmanager.common.g.d r0 = new com.ss.android.ugc.effectmanager.common.g.d     // Catch:{ Exception -> 0x0191 }
            r6 = 10001(0x2711, float:1.4014E-41)
            r0.<init>(r6)     // Catch:{ Exception -> 0x0191 }
            r1.m105545a(r0)     // Catch:{ Exception -> 0x0191 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r5)
            return
        L_0x0025:
            com.ss.android.ugc.effectmanager.g r0 = r1.f122616e     // Catch:{ Exception -> 0x0191 }
            com.ss.android.ugc.effectmanager.common.f.a r0 = r0.f122977w     // Catch:{ Exception -> 0x0191 }
            if (r0 == 0) goto L_0x0031
            java.io.InputStream r0 = r0.mo96221a(r4)     // Catch:{ Exception -> 0x0191 }
            r6 = r0
            goto L_0x0032
        L_0x0031:
            r6 = r5
        L_0x0032:
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0189, all -> 0x0187 }
            com.ss.android.ugc.effectmanager.g r0 = r1.f122616e     // Catch:{ Exception -> 0x0189, all -> 0x0187 }
            com.ss.android.ugc.effectmanager.common.f.a r0 = r0.f122977w     // Catch:{ Exception -> 0x0189, all -> 0x0187 }
            if (r0 == 0) goto L_0x0047
            com.ss.android.ugc.effectmanager.common.e.b r0 = r1.f122619h     // Catch:{ Exception -> 0x0189, all -> 0x0187 }
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.net.EffectNetListResponse> r9 = com.p683ss.android.ugc.effectmanager.effect.model.net.EffectNetListResponse.class
            com.ss.android.ugc.effectmanager.common.model.BaseNetResponse r0 = com.p683ss.android.ugc.effectmanager.common.p2439f.C48644a.m105250a(r4, r6, r0, r9)     // Catch:{ Exception -> 0x0189, all -> 0x0187 }
            com.ss.android.ugc.effectmanager.effect.model.net.EffectNetListResponse r0 = (com.p683ss.android.ugc.effectmanager.effect.model.net.EffectNetListResponse) r0     // Catch:{ Exception -> 0x0189, all -> 0x0187 }
            goto L_0x0048
        L_0x0047:
            r0 = r5
        L_0x0048:
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0189, all -> 0x0187 }
            if (r0 == 0) goto L_0x0169
            boolean r11 = r0.checkValue()     // Catch:{ Exception -> 0x0189, all -> 0x0187 }
            if (r11 != 0) goto L_0x0056
            goto L_0x0169
        L_0x0056:
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelModel r11 = r0.getData()     // Catch:{ Exception -> 0x0189, all -> 0x0187 }
            com.ss.android.ugc.effectmanager.effect.model.BuildEffectChannelResponse r0 = new com.ss.android.ugc.effectmanager.effect.model.BuildEffectChannelResponse     // Catch:{ Exception -> 0x0189, all -> 0x0187 }
            java.lang.String r12 = r1.f122626o     // Catch:{ Exception -> 0x0189, all -> 0x0187 }
            com.ss.android.ugc.effectmanager.a.a r13 = r1.f122625n     // Catch:{ Exception -> 0x0189, all -> 0x0187 }
            com.ss.android.ugc.effectmanager.g r13 = r13.f122047a     // Catch:{ Exception -> 0x0189, all -> 0x0187 }
            java.lang.String r14 = "mEffectContext.effectConfiguration"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r14)     // Catch:{ Exception -> 0x0189, all -> 0x0187 }
            java.io.File r13 = r13.f122964j     // Catch:{ Exception -> 0x0189, all -> 0x0187 }
            java.lang.String r14 = "mEffectContext.effectConfiguration.effectDir"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r14)     // Catch:{ Exception -> 0x0189, all -> 0x0187 }
            java.lang.String r13 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x0189, all -> 0x0187 }
            r14 = 0
            r0.<init>(r12, r13, r14)     // Catch:{ Exception -> 0x0189, all -> 0x0187 }
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r12 = r0.buildChannelResponse(r11)     // Catch:{ Exception -> 0x0189, all -> 0x0187 }
            com.ss.android.ugc.effectmanager.g r0 = r1.f122616e     // Catch:{ Exception -> 0x0189, all -> 0x0187 }
            java.lang.String r0 = r0.f122960f     // Catch:{ Exception -> 0x0189, all -> 0x0187 }
            java.lang.String r13 = r1.f122626o     // Catch:{ Exception -> 0x0189, all -> 0x0187 }
            java.lang.String r0 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48667e.m105298a(r0, r13)     // Catch:{ Exception -> 0x0189, all -> 0x0187 }
            com.ss.android.ugc.effectmanager.common.e.b r13 = r1.f122619h     // Catch:{ Exception -> 0x00ad, all -> 0x0187 }
            if (r13 == 0) goto L_0x008c
            java.lang.String r5 = r13.mo59190a(r11)     // Catch:{ Exception -> 0x00ad, all -> 0x0187 }
        L_0x008c:
            if (r5 == 0) goto L_0x00aa
            com.ss.android.ugc.effectmanager.common.b.c r13 = r1.f122618g     // Catch:{ Exception -> 0x00ad, all -> 0x0187 }
            if (r13 == 0) goto L_0x009c
            java.lang.String r15 = "key"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r15)     // Catch:{ Exception -> 0x00ad, all -> 0x0187 }
            long r15 = r13.mo96148a(r0, r5)     // Catch:{ Exception -> 0x00ad, all -> 0x0187 }
            goto L_0x009e
        L_0x009c:
            r15 = 0
        L_0x009e:
            int r0 = com.p683ss.android.ugc.effectmanager.common.C48590a.f122161a     // Catch:{ Exception -> 0x00ad, all -> 0x0187 }
            r17 = r4
            long r4 = (long) r0
            long r4 = r15 / r4
            r1.f122624m = r4     // Catch:{ Exception -> 0x00a8, all -> 0x0187 }
            goto L_0x00b5
        L_0x00a8:
            r0 = move-exception
            goto L_0x00b0
        L_0x00aa:
            r17 = r4
            goto L_0x00b5
        L_0x00ad:
            r0 = move-exception
            r17 = r4
        L_0x00b0:
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            android.util.Log.getStackTraceString(r0)     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
        L_0x00b5:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            r0.<init>()     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            java.lang.String r4 = "version"
            if (r11 == 0) goto L_0x00c4
            java.lang.String r5 = r11.getVersion()     // Catch:{ JSONException -> 0x00e9 }
            if (r5 != 0) goto L_0x00c6
        L_0x00c4:
            java.lang.String r5 = "0"
        L_0x00c6:
            r0.put(r4, r5)     // Catch:{ JSONException -> 0x00e9 }
            com.ss.android.ugc.effectmanager.common.b.c r4 = r1.f122618g     // Catch:{ JSONException -> 0x00e9 }
            if (r4 == 0) goto L_0x00e9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00e9 }
            java.lang.String r11 = "effect_version"
            r5.<init>(r11)     // Catch:{ JSONException -> 0x00e9 }
            java.lang.String r11 = r1.f122626o     // Catch:{ JSONException -> 0x00e9 }
            r5.append(r11)     // Catch:{ JSONException -> 0x00e9 }
            java.lang.String r5 = r5.toString()     // Catch:{ JSONException -> 0x00e9 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x00e9 }
            java.lang.String r11 = "jsonObject.toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r11)     // Catch:{ JSONException -> 0x00e9 }
            r4.mo96148a(r5, r0)     // Catch:{ JSONException -> 0x00e9 }
        L_0x00e9:
            com.ss.android.ugc.effectmanager.effect.e.b.a.k$b r0 = new com.ss.android.ugc.effectmanager.effect.e.b.a.k$b     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            r0.<init>(r1, r12)     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            d.f.a.a r0 = (p2628d.p2639f.p2640a.C52670a) r0     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            r1.mo96235a(r0)     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            com.ss.android.ugc.effectmanager.common.e.c r0 = r1.f122620i     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            if (r0 == 0) goto L_0x0163
            java.lang.String r11 = "effect_list_success_rate"
            com.ss.android.ugc.effectmanager.common.h.h r12 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48670h.m105314a()     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            java.lang.String r13 = "app_id"
            com.ss.android.ugc.effectmanager.g r15 = r1.f122616e     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            java.lang.String r15 = r15.f122966l     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            com.ss.android.ugc.effectmanager.common.h.h r12 = r12.mo96255a(r13, r15)     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            java.lang.String r13 = "access_key"
            com.ss.android.ugc.effectmanager.g r15 = r1.f122616e     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            java.lang.String r15 = r15.f122956b     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            com.ss.android.ugc.effectmanager.common.h.h r12 = r12.mo96255a(r13, r15)     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            java.lang.String r13 = "panel"
            java.lang.String r15 = r1.f122626o     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            com.ss.android.ugc.effectmanager.common.h.h r12 = r12.mo96255a(r13, r15)     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            java.lang.String r13 = "duration"
            r15 = 0
            long r15 = r4 - r2
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            com.ss.android.ugc.effectmanager.common.h.h r12 = r12.mo96254a(r13, r15)     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            java.lang.String r13 = "network_time"
            r15 = 0
            long r15 = r7 - r2
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            com.ss.android.ugc.effectmanager.common.h.h r12 = r12.mo96254a(r13, r15)     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            java.lang.String r13 = "json_time"
            r15 = 0
            long r7 = r9 - r7
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            com.ss.android.ugc.effectmanager.common.h.h r7 = r12.mo96254a(r13, r7)     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            java.lang.String r8 = "io_time"
            r12 = 0
            long r4 = r4 - r9
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            com.ss.android.ugc.effectmanager.common.h.h r4 = r7.mo96254a(r8, r4)     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            java.lang.String r5 = "size"
            long r7 = r1.f122624m     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            com.ss.android.ugc.effectmanager.common.h.h r4 = r4.mo96254a(r5, r7)     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            org.json.JSONObject r4 = r4.mo96256b()     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            r0.mo59187a(r11, r14, r4)     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
        L_0x0163:
            java.io.Closeable r6 = (java.io.Closeable) r6
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r6)
            return
        L_0x0169:
            r17 = r4
            int r0 = r1.f122617f     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            if (r0 != 0) goto L_0x017f
            com.ss.android.ugc.effectmanager.common.g.d r0 = new com.ss.android.ugc.effectmanager.common.g.d     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            r4 = 10002(0x2712, float:1.4016E-41)
            r0.<init>(r4)     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            r1.m105545a(r0)     // Catch:{ Exception -> 0x0185, all -> 0x0187 }
            java.io.Closeable r6 = (java.io.Closeable) r6
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r6)
            return
        L_0x017f:
            java.io.Closeable r6 = (java.io.Closeable) r6
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r6)
            goto L_0x01a2
        L_0x0185:
            r0 = move-exception
            goto L_0x018c
        L_0x0187:
            r0 = move-exception
            goto L_0x01b4
        L_0x0189:
            r0 = move-exception
            r17 = r4
        L_0x018c:
            r5 = r6
            goto L_0x0194
        L_0x018e:
            r0 = move-exception
            r6 = r5
            goto L_0x01b4
        L_0x0191:
            r0 = move-exception
            r17 = r4
        L_0x0194:
            int r4 = r1.f122617f     // Catch:{ all -> 0x018e }
            if (r4 == 0) goto L_0x01a6
            boolean r4 = r0 instanceof com.p683ss.android.ugc.effectmanager.common.p2437d.C48636c     // Catch:{ all -> 0x018e }
            if (r4 == 0) goto L_0x019d
            goto L_0x01a6
        L_0x019d:
            java.io.Closeable r5 = (java.io.Closeable) r5
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r5)
        L_0x01a2:
            r4 = r17
            goto L_0x000a
        L_0x01a6:
            com.ss.android.ugc.effectmanager.common.g.d r2 = new com.ss.android.ugc.effectmanager.common.g.d     // Catch:{ all -> 0x018e }
            r2.<init>(r0)     // Catch:{ all -> 0x018e }
            r1.m105545a(r2)     // Catch:{ all -> 0x018e }
            java.io.Closeable r5 = (java.io.Closeable) r5
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r5)
            return
        L_0x01b4:
            java.io.Closeable r6 = (java.io.Closeable) r6
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r6)
            throw r0
        L_0x01ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48813k.mo96229e():void");
    }

    /* renamed from: a */
    private final void m105545a(C48649d dVar) {
        dVar.mo96230a(this.f122621j, this.f122622k, this.f122623l);
        mo96235a((C52670a<C52860x>) new C48816c<C52860x>(this, dVar));
        C48642c cVar = this.f122620i;
        if (cVar != null) {
            cVar.mo59187a("effect_list_success_rate", 1, C48670h.m105314a().mo96255a("app_id", this.f122616e.f122966l).mo96255a("access_key", this.f122616e.f122956b).mo96255a("panel", this.f122626o).mo96253a("error_code", Integer.valueOf(dVar.f122279a)).mo96255a("error_msg", dVar.f122280b).mo96255a("host_ip", this.f122623l).mo96255a("download_url", this.f122621j).mo96256b());
        }
    }

    public C48813k(C48565a aVar, String str, String str2, Handler handler) {
        C52711k.m112240b(aVar, "mEffectContext");
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(str2, "taskFlag");
        super(handler, str2);
        this.f122625n = aVar;
        this.f122626o = str;
        C48890g gVar = this.f122625n.f122047a;
        C52711k.m112236a((Object) gVar, "mEffectContext.effectConfiguration");
        this.f122616e = gVar;
    }
}
