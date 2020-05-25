package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b;

import android.os.Handler;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.C48605b;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48620c;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48642c;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48656j;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48668f;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48670h;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48676l;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48751g;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.b.h */
public final class C48867h extends C48656j {

    /* renamed from: a */
    private C48565a f122816a;

    /* renamed from: b */
    private C48890g f122817b = this.f122816a.f122047a;

    /* renamed from: f */
    private C48620c f122818f = this.f122817b.f122972r;

    /* renamed from: g */
    private C48641b f122819g = this.f122817b.f122976v;

    /* renamed from: h */
    private C48642c f122820h = this.f122817b.f122978x;

    /* renamed from: i */
    private String f122821i;

    /* renamed from: j */
    private int f122822j = this.f122817b.f122973s;

    /* renamed from: k */
    private String f122823k;

    /* renamed from: l */
    private int f122824l;

    /* renamed from: m */
    private int f122825m;

    /* renamed from: n */
    private int f122826n;

    /* renamed from: o */
    private String f122827o;

    /* renamed from: p */
    private String f122828p;

    /* renamed from: q */
    private String f122829q;

    /* renamed from: r */
    private String f122830r;

    /* renamed from: s */
    private long f122831s;

    /* renamed from: t */
    private int f122832t = this.f122817b.f122975u;

    /* renamed from: b */
    private C48605b m105607b() {
        String str;
        HashMap a = C48668f.f122308a.mo96252a(this.f122817b);
        if (!TextUtils.isEmpty(this.f122821i)) {
            a.put("panel", this.f122821i);
        }
        a.put("category", this.f122823k);
        a.put("cursor", String.valueOf(this.f122825m));
        a.put("count", String.valueOf(this.f122824l));
        a.put("sorting_position", String.valueOf(this.f122826n));
        a.put(C42311c.f106863g, String.valueOf(this.f122827o));
        String str2 = this.f122817b.f122980z;
        if (!TextUtils.isEmpty(str2)) {
            a.put("test_status", str2);
        }
        this.f122829q = this.f122816a.mo96084a();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f122829q);
        sb.append(this.f122817b.f122955a);
        if (this.f122832t == 2) {
            str = "/category/effects/v2";
        } else {
            str = "/category/effects";
        }
        sb.append(str);
        String a2 = C48676l.m105346a(a, sb.toString());
        this.f122828p = a2;
        try {
            this.f122830r = InetAddress.getByName(new URL(a2).getHost()).getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
        }
        return new C48605b("GET", a2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(19:21|22|(1:24)|25|26|27|28|29|30|36|37|38|39|40|41|(1:43)|44|45|46) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f7, code lost:
        r16 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01dd, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01df, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01e0, code lost:
        r16 = r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0145 */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x014d A[Catch:{ Exception -> 0x01db, all -> 0x01dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01dd A[ExcHandler: all (th java.lang.Throwable), Splitter:B:12:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ee A[Catch:{ all -> 0x01e4 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96139a() {
        /*
            r19 = this;
            r1 = r19
            long r2 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.effectmanager.common.b r4 = r19.m105607b()
        L_0x000a:
            int r0 = r1.f122822j
            int r5 = r0 + -1
            r1.f122822j = r5
            if (r0 == 0) goto L_0x020a
            r5 = 0
            boolean r0 = r1.f122291c     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x0025
            com.ss.android.ugc.effectmanager.common.g.d r0 = new com.ss.android.ugc.effectmanager.common.g.d     // Catch:{ Exception -> 0x01e7 }
            r6 = 10001(0x2711, float:1.4014E-41)
            r0.<init>(r6)     // Catch:{ Exception -> 0x01e7 }
            r1.m105606a(r0)     // Catch:{ Exception -> 0x01e7 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r5)
            return
        L_0x0025:
            com.ss.android.ugc.effectmanager.g r0 = r1.f122817b     // Catch:{ Exception -> 0x01e7 }
            com.ss.android.ugc.effectmanager.common.f.a r0 = r0.f122977w     // Catch:{ Exception -> 0x01e7 }
            java.io.InputStream r6 = r0.mo96221a(r4)     // Catch:{ Exception -> 0x01e7 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            com.ss.android.ugc.effectmanager.common.e.b r0 = r1.f122819g     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse> r9 = com.p683ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse.class
            com.ss.android.ugc.effectmanager.common.model.BaseNetResponse r0 = com.p683ss.android.ugc.effectmanager.common.p2439f.C48644a.m105250a(r4, r6, r0, r9)     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            r9 = r0
            com.ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse r9 = (com.p683ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse) r9     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            boolean r0 = r9.checkValue()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            if (r0 != 0) goto L_0x005c
            int r0 = r1.f122822j     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            if (r0 != 0) goto L_0x0058
            com.ss.android.ugc.effectmanager.common.g.d r0 = new com.ss.android.ugc.effectmanager.common.g.d     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            r5 = 10002(0x2712, float:1.4016E-41)
            r0.<init>(r5)     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            r1.m105606a(r0)     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r6)
            return
        L_0x0058:
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r6)
            goto L_0x000a
        L_0x005c:
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r12 = r9.getData()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            com.ss.android.ugc.effectmanager.g r0 = r1.f122817b     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            java.io.File r0 = r0.f122964j     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            java.lang.String r13 = r1.f122821i     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r14 = r12.getCategoryEffects()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            java.util.List r14 = r14.getEffects()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105308a(r0, r13, r14)     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            com.ss.android.ugc.effectmanager.g r0 = r1.f122817b     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            java.io.File r0 = r0.f122964j     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            java.lang.String r13 = r1.f122821i     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r14 = r12.getCategoryEffects()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            java.util.List r14 = r14.getCollectEffects()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105308a(r0, r13, r14)     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            com.ss.android.ugc.effectmanager.g r0 = r1.f122817b     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            java.io.File r0 = r0.f122964j     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            java.lang.String r13 = r1.f122821i     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r14 = r12.getCategoryEffects()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            java.util.List r14 = r14.getBindEffects()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105308a(r0, r13, r14)     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            int r0 = r1.f122832t     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            r13 = 2
            if (r0 != r13) goto L_0x00d1
            java.util.List r0 = r12.getUrl_prefix()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r13 = r12.getCategoryEffects()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            java.util.List r13 = r13.getEffects()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105310a(r0, r13)     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            java.util.List r0 = r12.getUrl_prefix()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r13 = r12.getCategoryEffects()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            java.util.List r13 = r13.getCollectEffects()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105310a(r0, r13)     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            java.util.List r0 = r12.getUrl_prefix()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r13 = r12.getCategoryEffects()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            java.util.List r13 = r13.getBindEffects()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105310a(r0, r13)     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
        L_0x00d1:
            java.lang.String r0 = r1.f122821i     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            java.lang.String r13 = r1.f122823k     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            int r14 = r1.f122824l     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            int r15 = r1.f122825m     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            int r5 = r1.f122826n     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            java.lang.String r0 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48667e.m105299a(r0, r13, r14, r15, r5)     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            com.ss.android.ugc.effectmanager.common.e.b r5 = r1.f122819g     // Catch:{ Exception -> 0x00f6, all -> 0x01dd }
            java.lang.String r5 = r5.mo59190a(r9)     // Catch:{ Exception -> 0x00f6, all -> 0x01dd }
            com.ss.android.ugc.effectmanager.common.b.c r13 = r1.f122818f     // Catch:{ Exception -> 0x00f6, all -> 0x01dd }
            long r13 = r13.mo96148a(r0, r5)     // Catch:{ Exception -> 0x00f6, all -> 0x01dd }
            int r0 = com.p683ss.android.ugc.effectmanager.common.C48590a.f122161a     // Catch:{ Exception -> 0x00f6, all -> 0x01dd }
            r16 = r4
            long r4 = (long) r0
            long r13 = r13 / r4
            r1.f122831s = r13     // Catch:{ Exception -> 0x00f4, all -> 0x01dd }
            goto L_0x00fc
        L_0x00f4:
            r0 = move-exception
            goto L_0x00f9
        L_0x00f6:
            r0 = move-exception
            r16 = r4
        L_0x00f9:
            android.util.Log.getStackTraceString(r0)     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
        L_0x00fc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            r0.<init>()     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            java.lang.String r4 = "version"
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r5 = r9.getData()     // Catch:{ JSONException -> 0x0145 }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r5 = r5.getCategoryEffects()     // Catch:{ JSONException -> 0x0145 }
            java.lang.String r5 = r5.getVersion()     // Catch:{ JSONException -> 0x0145 }
            r0.put(r4, r5)     // Catch:{ JSONException -> 0x0145 }
            java.lang.String r4 = "cursor"
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r5 = r9.getData()     // Catch:{ JSONException -> 0x0145 }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r5 = r5.getCategoryEffects()     // Catch:{ JSONException -> 0x0145 }
            int r5 = r5.getCursor()     // Catch:{ JSONException -> 0x0145 }
            r0.put(r4, r5)     // Catch:{ JSONException -> 0x0145 }
            java.lang.String r4 = "sorting_position"
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r5 = r9.getData()     // Catch:{ JSONException -> 0x0145 }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r5 = r5.getCategoryEffects()     // Catch:{ JSONException -> 0x0145 }
            int r5 = r5.getSortingPosition()     // Catch:{ JSONException -> 0x0145 }
            r0.put(r4, r5)     // Catch:{ JSONException -> 0x0145 }
            com.ss.android.ugc.effectmanager.common.b.c r4 = r1.f122818f     // Catch:{ JSONException -> 0x0145 }
            java.lang.String r5 = r1.f122821i     // Catch:{ JSONException -> 0x0145 }
            java.lang.String r9 = r1.f122823k     // Catch:{ JSONException -> 0x0145 }
            java.lang.String r5 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48667e.m105302c(r5, r9)     // Catch:{ JSONException -> 0x0145 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0145 }
            r4.mo96148a(r5, r0)     // Catch:{ JSONException -> 0x0145 }
        L_0x0145:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            com.ss.android.ugc.effectmanager.common.e.c r0 = r1.f122820h     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            if (r0 == 0) goto L_0x01cc
            com.ss.android.ugc.effectmanager.common.e.c r0 = r1.f122820h     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            java.lang.String r9 = "category_list_success_rate"
            com.ss.android.ugc.effectmanager.common.h.h r14 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48670h.m105314a()     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            java.lang.String r15 = "app_id"
            com.ss.android.ugc.effectmanager.g r13 = r1.f122817b     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            java.lang.String r13 = r13.f122966l     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            com.ss.android.ugc.effectmanager.common.h.h r13 = r14.mo96255a(r15, r13)     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            java.lang.String r14 = "access_key"
            com.ss.android.ugc.effectmanager.g r15 = r1.f122817b     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            java.lang.String r15 = r15.f122956b     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            com.ss.android.ugc.effectmanager.common.h.h r13 = r13.mo96255a(r14, r15)     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            java.lang.String r14 = "panel"
            java.lang.String r15 = r1.f122821i     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            com.ss.android.ugc.effectmanager.common.h.h r13 = r13.mo96255a(r14, r15)     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            java.lang.String r14 = "category"
            java.lang.String r15 = r1.f122823k     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            com.ss.android.ugc.effectmanager.common.h.h r13 = r13.mo96255a(r14, r15)     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            java.lang.String r14 = "duration"
            r15 = 0
            long r17 = r4 - r2
            java.lang.Long r15 = java.lang.Long.valueOf(r17)     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            com.ss.android.ugc.effectmanager.common.h.h r13 = r13.mo96254a(r14, r15)     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            java.lang.String r14 = "network_time"
            r15 = 0
            long r17 = r7 - r2
            java.lang.Long r15 = java.lang.Long.valueOf(r17)     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            com.ss.android.ugc.effectmanager.common.h.h r13 = r13.mo96254a(r14, r15)     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            java.lang.String r14 = "json_time"
            r15 = 0
            long r7 = r10 - r7
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            com.ss.android.ugc.effectmanager.common.h.h r7 = r13.mo96254a(r14, r7)     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            java.lang.String r8 = "io_time"
            r13 = 0
            long r4 = r4 - r10
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            com.ss.android.ugc.effectmanager.common.h.h r4 = r7.mo96254a(r8, r4)     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            java.lang.String r5 = "size"
            long r7 = r1.f122831s     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            com.ss.android.ugc.effectmanager.common.h.h r4 = r4.mo96254a(r5, r7)     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            java.lang.String r5 = "request_strategy"
            int r7 = r1.f122832t     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            com.ss.android.ugc.effectmanager.common.h.h r4 = r4.mo96253a(r5, r7)     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            org.json.JSONObject r4 = r4.mo96256b()     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            r5 = 0
            r0.mo59187a(r9, r5, r4)     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
        L_0x01cc:
            r0 = 21
            com.ss.android.ugc.effectmanager.effect.e.a.g r4 = new com.ss.android.ugc.effectmanager.effect.e.a.g     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            r5 = 0
            r4.<init>(r12, r5)     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            r1.mo96238a(r0, r4)     // Catch:{ Exception -> 0x01db, all -> 0x01dd }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r6)
            return
        L_0x01db:
            r0 = move-exception
            goto L_0x01e2
        L_0x01dd:
            r0 = move-exception
            goto L_0x0206
        L_0x01df:
            r0 = move-exception
            r16 = r4
        L_0x01e2:
            r5 = r6
            goto L_0x01ea
        L_0x01e4:
            r0 = move-exception
            r6 = r5
            goto L_0x0206
        L_0x01e7:
            r0 = move-exception
            r16 = r4
        L_0x01ea:
            int r4 = r1.f122822j     // Catch:{ all -> 0x01e4 }
            if (r4 == 0) goto L_0x01fa
            boolean r4 = r0 instanceof com.p683ss.android.ugc.effectmanager.common.p2437d.C48636c     // Catch:{ all -> 0x01e4 }
            if (r4 == 0) goto L_0x01f3
            goto L_0x01fa
        L_0x01f3:
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r5)
            r4 = r16
            goto L_0x000a
        L_0x01fa:
            com.ss.android.ugc.effectmanager.common.g.d r2 = new com.ss.android.ugc.effectmanager.common.g.d     // Catch:{ all -> 0x01e4 }
            r2.<init>(r0)     // Catch:{ all -> 0x01e4 }
            r1.m105606a(r2)     // Catch:{ all -> 0x01e4 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r5)
            return
        L_0x0206:
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r6)
            throw r0
        L_0x020a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b.C48867h.mo96139a():void");
    }

    /* renamed from: a */
    private void m105606a(C48649d dVar) {
        dVar.mo96230a(this.f122828p, this.f122829q, this.f122830r);
        mo96238a(21, new C48751g(null, dVar));
        if (this.f122820h != null) {
            this.f122820h.mo59187a("category_list_success_rate", 1, C48670h.m105314a().mo96255a("app_id", this.f122817b.f122966l).mo96255a("access_key", this.f122817b.f122956b).mo96255a("panel", this.f122821i).mo96255a("category", this.f122823k).mo96253a("error_code", Integer.valueOf(dVar.f122279a)).mo96255a("error_msg", dVar.f122280b).mo96255a("download_url", this.f122828p).mo96255a("host_ip", this.f122830r).mo96256b());
        }
    }

    public C48867h(C48565a aVar, String str, String str2, String str3, int i, int i2, int i3, String str4, Handler handler) {
        super(handler, str2);
        this.f122821i = str;
        this.f122823k = str3;
        this.f122824l = i;
        this.f122825m = i2;
        this.f122826n = i3;
        this.f122827o = str4;
        this.f122816a = aVar;
    }
}
