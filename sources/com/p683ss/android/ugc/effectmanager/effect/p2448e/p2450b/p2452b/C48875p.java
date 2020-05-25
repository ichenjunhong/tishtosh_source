package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b;

import android.os.Handler;
import android.text.TextUtils;
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
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48754j;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.b.p */
public final class C48875p extends C48656j {

    /* renamed from: a */
    private C48565a f122873a;

    /* renamed from: b */
    private C48890g f122874b = this.f122873a.f122047a;

    /* renamed from: f */
    private int f122875f = this.f122874b.f122973s;

    /* renamed from: g */
    private C48620c f122876g = this.f122874b.f122972r;

    /* renamed from: h */
    private C48641b f122877h = this.f122874b.f122976v;

    /* renamed from: i */
    private C48642c f122878i = this.f122874b.f122978x;

    /* renamed from: j */
    private String f122879j;

    /* renamed from: k */
    private String f122880k;

    /* renamed from: l */
    private String f122881l;

    /* renamed from: m */
    private String f122882m;

    /* renamed from: n */
    private boolean f122883n;

    /* renamed from: o */
    private String f122884o;

    /* renamed from: p */
    private int f122885p;

    /* renamed from: q */
    private int f122886q;

    /* renamed from: r */
    private long f122887r;

    /* renamed from: s */
    private int f122888s = this.f122874b.f122975u;

    /* renamed from: b */
    private C48605b m105619b() {
        String str;
        HashMap a = C48668f.f122308a.mo96252a(this.f122874b);
        if (!TextUtils.isEmpty(this.f122879j)) {
            a.put("panel", this.f122879j);
        }
        if (this.f122883n) {
            a.put("has_category_effects", "true");
            a.put("category", this.f122884o);
            a.put("cursor", String.valueOf(this.f122886q));
            a.put("count", String.valueOf(this.f122885p));
        }
        String str2 = this.f122874b.f122980z;
        if (str2 != null) {
            a.put("test_status", str2);
        }
        this.f122881l = this.f122873a.mo96084a();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f122881l);
        sb.append(this.f122874b.f122955a);
        if (this.f122888s == 2) {
            str = "/panel/info/v2";
        } else {
            str = "/panel/info";
        }
        sb.append(str);
        String a2 = C48676l.m105346a(a, sb.toString());
        this.f122880k = a2;
        try {
            this.f122882m = InetAddress.getByName(new URL(a2).getHost()).getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
        }
        return new C48605b("GET", a2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e8, code lost:
        r16 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        android.util.Log.getStackTraceString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x019c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x019e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01a0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01a2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01a3, code lost:
        r16 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a5, code lost:
        r5 = r16;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x010e */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0116 A[Catch:{ Exception -> 0x019e, all -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x019c A[ExcHandler: all (th java.lang.Throwable), PHI: r16 
      PHI: (r16v6 java.io.InputStream) = (r16v7 java.io.InputStream), (r16v8 java.io.InputStream), (r16v10 java.io.InputStream), (r16v10 java.io.InputStream) binds: [B:49:0x010e, B:43:0x00ea, B:38:0x00e1, B:39:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:43:0x00ea] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01a0 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:14:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01b3 A[Catch:{ all -> 0x01c9 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96139a() {
        /*
            r19 = this;
            r1 = r19
            long r2 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.effectmanager.common.b r4 = r19.m105619b()
        L_0x000a:
            int r0 = r1.f122875f
            int r5 = r0 + -1
            r1.f122875f = r5
            if (r0 == 0) goto L_0x01d0
            r5 = 0
            boolean r0 = r1.f122291c     // Catch:{ Exception -> 0x01ad, all -> 0x01a8 }
            if (r0 == 0) goto L_0x0028
            com.ss.android.ugc.effectmanager.common.g.d r0 = new com.ss.android.ugc.effectmanager.common.g.d     // Catch:{ Exception -> 0x0025 }
            r6 = 10001(0x2711, float:1.4014E-41)
            r0.<init>(r6)     // Catch:{ Exception -> 0x0025 }
            r1.m105618a(r0)     // Catch:{ Exception -> 0x0025 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r5)
            return
        L_0x0025:
            r0 = move-exception
            goto L_0x01af
        L_0x0028:
            com.ss.android.ugc.effectmanager.g r0 = r1.f122874b     // Catch:{ Exception -> 0x01ad, all -> 0x01a8 }
            com.ss.android.ugc.effectmanager.common.f.a r0 = r0.f122977w     // Catch:{ Exception -> 0x01ad, all -> 0x01a8 }
            java.io.InputStream r6 = r0.mo96221a(r4)     // Catch:{ Exception -> 0x01ad, all -> 0x01a8 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01a2, all -> 0x01a0 }
            com.ss.android.ugc.effectmanager.common.e.b r0 = r1.f122877h     // Catch:{ Exception -> 0x01a2, all -> 0x01a0 }
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse> r9 = com.p683ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse.class
            com.ss.android.ugc.effectmanager.common.model.BaseNetResponse r0 = com.p683ss.android.ugc.effectmanager.common.p2439f.C48644a.m105250a(r4, r6, r0, r9)     // Catch:{ Exception -> 0x01a2, all -> 0x01a0 }
            r9 = r0
            com.ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse r9 = (com.p683ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse) r9     // Catch:{ Exception -> 0x01a2, all -> 0x01a0 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01a2, all -> 0x01a0 }
            boolean r0 = r9.checkValue()     // Catch:{ Exception -> 0x01a2, all -> 0x01a0 }
            if (r0 != 0) goto L_0x0063
            int r0 = r1.f122875f     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            if (r0 != 0) goto L_0x005b
            com.ss.android.ugc.effectmanager.common.g.d r0 = new com.ss.android.ugc.effectmanager.common.g.d     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            r5 = 10002(0x2712, float:1.4016E-41)
            r0.<init>(r5)     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            r1.m105618a(r0)     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r6)
            return
        L_0x005b:
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r6)
            goto L_0x000a
        L_0x005f:
            r0 = move-exception
            r5 = r6
            goto L_0x01af
        L_0x0063:
            com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel r12 = r9.getData()     // Catch:{ Exception -> 0x01a2, all -> 0x01a0 }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r0 = r12.getCategoryEffectModel()     // Catch:{ Exception -> 0x01a2, all -> 0x01a0 }
            if (r0 == 0) goto L_0x00c6
            com.ss.android.ugc.effectmanager.g r13 = r1.f122874b     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            java.io.File r13 = r13.f122964j     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            java.lang.String r13 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            java.lang.String r14 = r1.f122879j     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            java.util.List r15 = r0.getEffects()     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105308a(r13, r14, r15)     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            com.ss.android.ugc.effectmanager.g r13 = r1.f122874b     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            java.io.File r13 = r13.f122964j     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            java.lang.String r13 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            java.lang.String r14 = r1.f122879j     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            java.util.List r15 = r0.getCollectEffects()     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105308a(r13, r14, r15)     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            com.ss.android.ugc.effectmanager.g r13 = r1.f122874b     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            java.io.File r13 = r13.f122964j     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            java.lang.String r13 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            java.lang.String r14 = r1.f122879j     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            java.util.List r15 = r0.getBindEffects()     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105308a(r13, r14, r15)     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            int r13 = r1.f122888s     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            r14 = 2
            if (r13 != r14) goto L_0x00c6
            java.util.List r13 = r12.getUrlPrefix()     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            java.util.List r14 = r0.getEffects()     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105310a(r13, r14)     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            java.util.List r13 = r12.getUrlPrefix()     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            java.util.List r14 = r0.getCollectEffects()     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105310a(r13, r14)     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            java.util.List r13 = r12.getUrlPrefix()     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            java.util.List r0 = r0.getBindEffects()     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105310a(r13, r0)     // Catch:{ Exception -> 0x005f, all -> 0x01a0 }
        L_0x00c6:
            com.ss.android.ugc.effectmanager.g r0 = r1.f122874b     // Catch:{ Exception -> 0x01a2, all -> 0x01a0 }
            java.lang.String r0 = r0.f122960f     // Catch:{ Exception -> 0x01a2, all -> 0x01a0 }
            java.lang.String r13 = r1.f122879j     // Catch:{ Exception -> 0x01a2, all -> 0x01a0 }
            java.lang.String r0 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48667e.m105300b(r0, r13)     // Catch:{ Exception -> 0x01a2, all -> 0x01a0 }
            com.ss.android.ugc.effectmanager.common.e.b r13 = r1.f122877h     // Catch:{ Exception -> 0x00e7, all -> 0x01a0 }
            java.lang.String r13 = r13.mo59190a(r9)     // Catch:{ Exception -> 0x00e7, all -> 0x01a0 }
            com.ss.android.ugc.effectmanager.common.b.c r14 = r1.f122876g     // Catch:{ Exception -> 0x00e7, all -> 0x01a0 }
            long r13 = r14.mo96148a(r0, r13)     // Catch:{ Exception -> 0x00e7, all -> 0x01a0 }
            int r0 = com.p683ss.android.ugc.effectmanager.common.C48590a.f122161a     // Catch:{ Exception -> 0x00e7, all -> 0x01a0 }
            r16 = r6
            long r5 = (long) r0
            long r13 = r13 / r5
            r1.f122887r = r13     // Catch:{ Exception -> 0x00e5, all -> 0x019c }
            goto L_0x00ed
        L_0x00e5:
            r0 = move-exception
            goto L_0x00ea
        L_0x00e7:
            r0 = move-exception
            r16 = r6
        L_0x00ea:
            android.util.Log.getStackTraceString(r0)     // Catch:{ Exception -> 0x019e, all -> 0x019c }
        L_0x00ed:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            r0.<init>()     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            java.lang.String r5 = "version"
            com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel r6 = r9.getData()     // Catch:{ JSONException -> 0x010e }
            java.lang.String r6 = r6.getVersion()     // Catch:{ JSONException -> 0x010e }
            r0.put(r5, r6)     // Catch:{ JSONException -> 0x010e }
            com.ss.android.ugc.effectmanager.common.b.c r5 = r1.f122876g     // Catch:{ JSONException -> 0x010e }
            java.lang.String r6 = r1.f122879j     // Catch:{ JSONException -> 0x010e }
            java.lang.String r6 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48667e.m105297a(r6)     // Catch:{ JSONException -> 0x010e }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x010e }
            r5.mo96148a(r6, r0)     // Catch:{ JSONException -> 0x010e }
        L_0x010e:
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            com.ss.android.ugc.effectmanager.common.e.c r0 = r1.f122878i     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            if (r0 == 0) goto L_0x018d
            com.ss.android.ugc.effectmanager.common.e.c r0 = r1.f122878i     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            java.lang.String r9 = "panel_info_success_rate"
            com.ss.android.ugc.effectmanager.common.h.h r14 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48670h.m105314a()     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            java.lang.String r15 = "app_id"
            com.ss.android.ugc.effectmanager.g r13 = r1.f122874b     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            java.lang.String r13 = r13.f122966l     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            com.ss.android.ugc.effectmanager.common.h.h r13 = r14.mo96255a(r15, r13)     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            java.lang.String r14 = "access_key"
            com.ss.android.ugc.effectmanager.g r15 = r1.f122874b     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            java.lang.String r15 = r15.f122956b     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            com.ss.android.ugc.effectmanager.common.h.h r13 = r13.mo96255a(r14, r15)     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            java.lang.String r14 = "panel"
            java.lang.String r15 = r1.f122879j     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            com.ss.android.ugc.effectmanager.common.h.h r13 = r13.mo96255a(r14, r15)     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            java.lang.String r14 = "duration"
            r15 = 0
            long r17 = r5 - r2
            java.lang.Long r15 = java.lang.Long.valueOf(r17)     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            com.ss.android.ugc.effectmanager.common.h.h r13 = r13.mo96254a(r14, r15)     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            java.lang.String r14 = "network_time"
            r15 = 0
            long r17 = r7 - r2
            java.lang.Long r15 = java.lang.Long.valueOf(r17)     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            com.ss.android.ugc.effectmanager.common.h.h r13 = r13.mo96254a(r14, r15)     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            java.lang.String r14 = "json_time"
            r15 = 0
            long r7 = r10 - r7
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            com.ss.android.ugc.effectmanager.common.h.h r7 = r13.mo96254a(r14, r7)     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            java.lang.String r8 = "io_time"
            r13 = 0
            long r5 = r5 - r10
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            com.ss.android.ugc.effectmanager.common.h.h r5 = r7.mo96254a(r8, r5)     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            java.lang.String r6 = "size"
            long r7 = r1.f122887r     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            com.ss.android.ugc.effectmanager.common.h.h r5 = r5.mo96254a(r6, r7)     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            java.lang.String r6 = "request_strategy"
            int r7 = r1.f122888s     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            com.ss.android.ugc.effectmanager.common.h.h r5 = r5.mo96253a(r6, r7)     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            org.json.JSONObject r5 = r5.mo96256b()     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            r6 = 0
            r0.mo59187a(r9, r6, r5)     // Catch:{ Exception -> 0x019e, all -> 0x019c }
        L_0x018d:
            r0 = 22
            com.ss.android.ugc.effectmanager.effect.e.a.j r5 = new com.ss.android.ugc.effectmanager.effect.e.a.j     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            r6 = 0
            r5.<init>(r12, r6)     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            r1.mo96238a(r0, r5)     // Catch:{ Exception -> 0x019e, all -> 0x019c }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r16)
            return
        L_0x019c:
            r0 = move-exception
            goto L_0x01cc
        L_0x019e:
            r0 = move-exception
            goto L_0x01a5
        L_0x01a0:
            r0 = move-exception
            goto L_0x01aa
        L_0x01a2:
            r0 = move-exception
            r16 = r6
        L_0x01a5:
            r5 = r16
            goto L_0x01af
        L_0x01a8:
            r0 = move-exception
            r6 = r5
        L_0x01aa:
            r16 = r6
            goto L_0x01cc
        L_0x01ad:
            r0 = move-exception
            r6 = r5
        L_0x01af:
            int r6 = r1.f122875f     // Catch:{ all -> 0x01c9 }
            if (r6 == 0) goto L_0x01bd
            boolean r6 = r0 instanceof com.p683ss.android.ugc.effectmanager.common.p2437d.C48636c     // Catch:{ all -> 0x01c9 }
            if (r6 == 0) goto L_0x01b8
            goto L_0x01bd
        L_0x01b8:
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r5)
            goto L_0x000a
        L_0x01bd:
            com.ss.android.ugc.effectmanager.common.g.d r2 = new com.ss.android.ugc.effectmanager.common.g.d     // Catch:{ all -> 0x01c9 }
            r2.<init>(r0)     // Catch:{ all -> 0x01c9 }
            r1.m105618a(r2)     // Catch:{ all -> 0x01c9 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r5)
            return
        L_0x01c9:
            r0 = move-exception
            r16 = r5
        L_0x01cc:
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r16)
            throw r0
        L_0x01d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b.C48875p.mo96139a():void");
    }

    /* renamed from: a */
    private void m105618a(C48649d dVar) {
        dVar.mo96230a(this.f122880k, this.f122881l, this.f122882m);
        mo96238a(22, new C48754j(null, dVar));
        if (this.f122878i != null) {
            this.f122878i.mo59187a("panel_info_success_rate", 1, C48670h.m105314a().mo96255a("app_id", this.f122874b.f122966l).mo96255a("access_key", this.f122874b.f122956b).mo96255a("panel", this.f122879j).mo96253a("error_code", Integer.valueOf(dVar.f122279a)).mo96255a("error_msg", dVar.f122280b).mo96255a("host_ip", this.f122882m).mo96255a("download_url", this.f122880k).mo96256b());
        }
    }

    public C48875p(C48565a aVar, String str, String str2, boolean z, String str3, int i, int i2, Handler handler) {
        super(handler, str2);
        this.f122879j = str;
        this.f122883n = z;
        this.f122884o = str3;
        this.f122885p = i;
        this.f122886q = i2;
        this.f122873a = aVar;
    }
}
