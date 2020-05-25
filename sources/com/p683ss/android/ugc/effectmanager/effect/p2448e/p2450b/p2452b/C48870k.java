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
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48746b;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.b.k */
public final class C48870k extends C48656j {

    /* renamed from: a */
    private C48565a f122840a;

    /* renamed from: b */
    private C48890g f122841b = this.f122840a.f122047a;

    /* renamed from: f */
    private int f122842f = this.f122841b.f122973s;

    /* renamed from: g */
    private C48620c f122843g = this.f122841b.f122972r;

    /* renamed from: h */
    private C48641b f122844h = this.f122841b.f122976v;

    /* renamed from: i */
    private C48642c f122845i = this.f122841b.f122978x;

    /* renamed from: j */
    private String f122846j;

    /* renamed from: k */
    private String f122847k;

    /* renamed from: l */
    private String f122848l;

    /* renamed from: m */
    private String f122849m;

    /* renamed from: n */
    private long f122850n;

    /* renamed from: b */
    private C48605b m105612b() {
        HashMap a = C48668f.f122308a.mo96252a(this.f122841b);
        if (!TextUtils.isEmpty(this.f122846j)) {
            a.put("panel", this.f122846j);
        }
        this.f122848l = this.f122840a.mo96084a();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f122848l);
        sb.append(this.f122841b.f122955a);
        sb.append("/v3/effects");
        String a2 = C48676l.m105346a(a, sb.toString());
        this.f122847k = a2;
        try {
            this.f122849m = InetAddress.getByName(new URL(a2).getHost()).getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
        }
        return new C48605b("GET", a2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005f, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x014e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0150, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0152, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0153, code lost:
        r17 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0155, code lost:
        r5 = r17;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00de A[Catch:{ Exception -> 0x014e, all -> 0x014c }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x014c A[ExcHandler: all (th java.lang.Throwable), PHI: r17 
      PHI: (r17v6 java.io.InputStream) = (r17v7 java.io.InputStream), (r17v8 java.io.InputStream), (r17v10 java.io.InputStream), (r17v10 java.io.InputStream) binds: [B:44:0x00cd, B:36:0x00a1, B:31:0x0097, B:32:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:31:0x0097] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0150 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:14:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0163 A[Catch:{ all -> 0x0179 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96139a() {
        /*
            r18 = this;
            r1 = r18
            long r2 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.effectmanager.common.b r4 = r18.m105612b()
        L_0x000a:
            int r0 = r1.f122842f
            int r5 = r0 + -1
            r1.f122842f = r5
            if (r0 == 0) goto L_0x0180
            r5 = 0
            boolean r0 = r1.f122291c     // Catch:{ Exception -> 0x015d, all -> 0x0158 }
            if (r0 == 0) goto L_0x0028
            com.ss.android.ugc.effectmanager.common.g.d r0 = new com.ss.android.ugc.effectmanager.common.g.d     // Catch:{ Exception -> 0x0025 }
            r6 = 10001(0x2711, float:1.4014E-41)
            r0.<init>(r6)     // Catch:{ Exception -> 0x0025 }
            r1.m105611a(r0)     // Catch:{ Exception -> 0x0025 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r5)
            return
        L_0x0025:
            r0 = move-exception
            goto L_0x015f
        L_0x0028:
            com.ss.android.ugc.effectmanager.g r0 = r1.f122841b     // Catch:{ Exception -> 0x015d, all -> 0x0158 }
            com.ss.android.ugc.effectmanager.common.f.a r0 = r0.f122977w     // Catch:{ Exception -> 0x015d, all -> 0x0158 }
            java.io.InputStream r6 = r0.mo96221a(r4)     // Catch:{ Exception -> 0x015d, all -> 0x0158 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0152, all -> 0x0150 }
            com.ss.android.ugc.effectmanager.common.e.b r0 = r1.f122844h     // Catch:{ Exception -> 0x0152, all -> 0x0150 }
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.net.EffectNetListResponse> r9 = com.p683ss.android.ugc.effectmanager.effect.model.net.EffectNetListResponse.class
            com.ss.android.ugc.effectmanager.common.model.BaseNetResponse r0 = com.p683ss.android.ugc.effectmanager.common.p2439f.C48644a.m105250a(r4, r6, r0, r9)     // Catch:{ Exception -> 0x0152, all -> 0x0150 }
            com.ss.android.ugc.effectmanager.effect.model.net.EffectNetListResponse r0 = (com.p683ss.android.ugc.effectmanager.effect.model.net.EffectNetListResponse) r0     // Catch:{ Exception -> 0x0152, all -> 0x0150 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0152, all -> 0x0150 }
            boolean r11 = r0.checkValue()     // Catch:{ Exception -> 0x0152, all -> 0x0150 }
            if (r11 != 0) goto L_0x0062
            int r0 = r1.f122842f     // Catch:{ Exception -> 0x005e, all -> 0x0150 }
            if (r0 != 0) goto L_0x005a
            com.ss.android.ugc.effectmanager.common.g.d r0 = new com.ss.android.ugc.effectmanager.common.g.d     // Catch:{ Exception -> 0x005e, all -> 0x0150 }
            r5 = 10002(0x2712, float:1.4016E-41)
            r0.<init>(r5)     // Catch:{ Exception -> 0x005e, all -> 0x0150 }
            r1.m105611a(r0)     // Catch:{ Exception -> 0x005e, all -> 0x0150 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r6)
            return
        L_0x005a:
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r6)
            goto L_0x000a
        L_0x005e:
            r0 = move-exception
            r5 = r6
            goto L_0x015f
        L_0x0062:
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelModel r11 = r0.getData()     // Catch:{ Exception -> 0x0152, all -> 0x0150 }
            com.ss.android.ugc.effectmanager.effect.model.BuildEffectChannelResponse r0 = new com.ss.android.ugc.effectmanager.effect.model.BuildEffectChannelResponse     // Catch:{ Exception -> 0x0152, all -> 0x0150 }
            java.lang.String r12 = r1.f122846j     // Catch:{ Exception -> 0x0152, all -> 0x0150 }
            com.ss.android.ugc.effectmanager.a.a r13 = r1.f122840a     // Catch:{ Exception -> 0x0152, all -> 0x0150 }
            com.ss.android.ugc.effectmanager.g r13 = r13.f122047a     // Catch:{ Exception -> 0x0152, all -> 0x0150 }
            java.io.File r13 = r13.f122964j     // Catch:{ Exception -> 0x0152, all -> 0x0150 }
            java.lang.String r13 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x0152, all -> 0x0150 }
            r14 = 0
            r0.<init>(r12, r13, r14)     // Catch:{ Exception -> 0x0152, all -> 0x0150 }
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r12 = r0.buildChannelResponse(r11)     // Catch:{ Exception -> 0x0152, all -> 0x0150 }
            com.ss.android.ugc.effectmanager.g r0 = r1.f122841b     // Catch:{ Exception -> 0x0152, all -> 0x0150 }
            java.lang.String r0 = r0.f122960f     // Catch:{ Exception -> 0x0152, all -> 0x0150 }
            java.lang.String r13 = r1.f122846j     // Catch:{ Exception -> 0x0152, all -> 0x0150 }
            java.lang.String r0 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48667e.m105298a(r0, r13)     // Catch:{ Exception -> 0x0152, all -> 0x0150 }
            com.ss.android.ugc.effectmanager.common.e.b r13 = r1.f122844h     // Catch:{ Exception -> 0x009e, all -> 0x0150 }
            java.lang.String r13 = r13.mo59190a(r11)     // Catch:{ Exception -> 0x009e, all -> 0x0150 }
            com.ss.android.ugc.effectmanager.common.b.c r15 = r1.f122843g     // Catch:{ Exception -> 0x009e, all -> 0x0150 }
            long r15 = r15.mo96148a(r0, r13)     // Catch:{ Exception -> 0x009e, all -> 0x0150 }
            int r0 = com.p683ss.android.ugc.effectmanager.common.C48590a.f122161a     // Catch:{ Exception -> 0x009e, all -> 0x0150 }
            r17 = r6
            long r5 = (long) r0
            long r5 = r15 / r5
            r1.f122850n = r5     // Catch:{ Exception -> 0x009c, all -> 0x014c }
            goto L_0x00a4
        L_0x009c:
            r0 = move-exception
            goto L_0x00a1
        L_0x009e:
            r0 = move-exception
            r17 = r6
        L_0x00a1:
            android.util.Log.getStackTraceString(r0)     // Catch:{ Exception -> 0x014e, all -> 0x014c }
        L_0x00a4:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            r0.<init>()     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            java.lang.String r5 = "version"
            java.lang.String r6 = r11.getVersion()     // Catch:{ JSONException -> 0x00cb }
            r0.put(r5, r6)     // Catch:{ JSONException -> 0x00cb }
            com.ss.android.ugc.effectmanager.common.b.c r5 = r1.f122843g     // Catch:{ JSONException -> 0x00cb }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00cb }
            java.lang.String r11 = "effect_version"
            r6.<init>(r11)     // Catch:{ JSONException -> 0x00cb }
            java.lang.String r11 = r1.f122846j     // Catch:{ JSONException -> 0x00cb }
            r6.append(r11)     // Catch:{ JSONException -> 0x00cb }
            java.lang.String r6 = r6.toString()     // Catch:{ JSONException -> 0x00cb }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x00cb }
            r5.mo96148a(r6, r0)     // Catch:{ JSONException -> 0x00cb }
        L_0x00cb:
            r0 = 14
            com.ss.android.ugc.effectmanager.effect.e.a.b r5 = new com.ss.android.ugc.effectmanager.effect.e.a.b     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            r6 = 0
            r5.<init>(r12, r6)     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            r1.mo96238a(r0, r5)     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            com.ss.android.ugc.effectmanager.common.e.c r0 = r1.f122845i     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            if (r0 == 0) goto L_0x0148
            com.ss.android.ugc.effectmanager.common.e.c r0 = r1.f122845i     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            java.lang.String r11 = "effect_list_success_rate"
            com.ss.android.ugc.effectmanager.common.h.h r12 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48670h.m105314a()     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            java.lang.String r13 = "app_id"
            com.ss.android.ugc.effectmanager.g r15 = r1.f122841b     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            java.lang.String r15 = r15.f122966l     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            com.ss.android.ugc.effectmanager.common.h.h r12 = r12.mo96255a(r13, r15)     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            java.lang.String r13 = "access_key"
            com.ss.android.ugc.effectmanager.g r15 = r1.f122841b     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            java.lang.String r15 = r15.f122956b     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            com.ss.android.ugc.effectmanager.common.h.h r12 = r12.mo96255a(r13, r15)     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            java.lang.String r13 = "panel"
            java.lang.String r15 = r1.f122846j     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            com.ss.android.ugc.effectmanager.common.h.h r12 = r12.mo96255a(r13, r15)     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            java.lang.String r13 = "duration"
            r15 = 0
            long r15 = r5 - r2
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            com.ss.android.ugc.effectmanager.common.h.h r12 = r12.mo96254a(r13, r15)     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            java.lang.String r13 = "network_time"
            r15 = 0
            long r15 = r7 - r2
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            com.ss.android.ugc.effectmanager.common.h.h r12 = r12.mo96254a(r13, r15)     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            java.lang.String r13 = "json_time"
            r15 = 0
            long r7 = r9 - r7
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            com.ss.android.ugc.effectmanager.common.h.h r7 = r12.mo96254a(r13, r7)     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            java.lang.String r8 = "io_time"
            r12 = 0
            long r5 = r5 - r9
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            com.ss.android.ugc.effectmanager.common.h.h r5 = r7.mo96254a(r8, r5)     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            java.lang.String r6 = "size"
            long r7 = r1.f122850n     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            com.ss.android.ugc.effectmanager.common.h.h r5 = r5.mo96254a(r6, r7)     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            org.json.JSONObject r5 = r5.mo96256b()     // Catch:{ Exception -> 0x014e, all -> 0x014c }
            r0.mo59187a(r11, r14, r5)     // Catch:{ Exception -> 0x014e, all -> 0x014c }
        L_0x0148:
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r17)
            return
        L_0x014c:
            r0 = move-exception
            goto L_0x017c
        L_0x014e:
            r0 = move-exception
            goto L_0x0155
        L_0x0150:
            r0 = move-exception
            goto L_0x015a
        L_0x0152:
            r0 = move-exception
            r17 = r6
        L_0x0155:
            r5 = r17
            goto L_0x015f
        L_0x0158:
            r0 = move-exception
            r6 = r5
        L_0x015a:
            r17 = r6
            goto L_0x017c
        L_0x015d:
            r0 = move-exception
            r6 = r5
        L_0x015f:
            int r6 = r1.f122842f     // Catch:{ all -> 0x0179 }
            if (r6 == 0) goto L_0x016d
            boolean r6 = r0 instanceof com.p683ss.android.ugc.effectmanager.common.p2437d.C48636c     // Catch:{ all -> 0x0179 }
            if (r6 == 0) goto L_0x0168
            goto L_0x016d
        L_0x0168:
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r5)
            goto L_0x000a
        L_0x016d:
            com.ss.android.ugc.effectmanager.common.g.d r2 = new com.ss.android.ugc.effectmanager.common.g.d     // Catch:{ all -> 0x0179 }
            r2.<init>(r0)     // Catch:{ all -> 0x0179 }
            r1.m105611a(r2)     // Catch:{ all -> 0x0179 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r5)
            return
        L_0x0179:
            r0 = move-exception
            r17 = r5
        L_0x017c:
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a.m105288a(r17)
            throw r0
        L_0x0180:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b.C48870k.mo96139a():void");
    }

    /* renamed from: a */
    private void m105611a(C48649d dVar) {
        dVar.mo96230a(this.f122847k, this.f122848l, this.f122849m);
        mo96238a(14, new C48746b(null, dVar));
        if (this.f122845i != null) {
            this.f122845i.mo59187a("effect_list_success_rate", 1, C48670h.m105314a().mo96255a("app_id", this.f122841b.f122966l).mo96255a("access_key", this.f122841b.f122956b).mo96255a("panel", this.f122846j).mo96253a("error_code", Integer.valueOf(dVar.f122279a)).mo96255a("error_msg", dVar.f122280b).mo96255a("host_ip", this.f122849m).mo96255a("download_url", this.f122847k).mo96256b());
        }
    }

    public C48870k(C48565a aVar, String str, String str2, Handler handler) {
        super(handler, str2);
        this.f122846j = str;
        this.f122840a = aVar;
    }
}
