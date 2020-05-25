package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b;

import android.os.Handler;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48656j;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g;
import com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.b.e */
public final class C48863e extends C48656j {

    /* renamed from: a */
    private ProviderEffect f122789a;

    /* renamed from: b */
    private int f122790b;

    /* renamed from: f */
    private C48565a f122791f;

    /* renamed from: g */
    private String f122792g;

    /* renamed from: h */
    private C48890g f122793h;

    /* renamed from: i */
    private String f122794i;

    /* renamed from: j */
    private String f122795j;

    /* JADX WARNING: Can't wrap try/catch for region: R(9:6|7|(1:9)|10|11|12|13|14|(3:28|16|17)(2:29|23)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x006a */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c5 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96139a() {
        /*
            r13 = this;
            int r0 = r13.f122790b
            r1 = 0
        L_0x0003:
            if (r1 >= r0) goto L_0x00c9
            boolean r2 = r13.f122291c
            r3 = 19
            if (r2 == 0) goto L_0x001d
            com.ss.android.ugc.effectmanager.effect.e.a.a r0 = new com.ss.android.ugc.effectmanager.effect.e.a.a
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r1 = r13.f122789a
            com.ss.android.ugc.effectmanager.common.g.d r2 = new com.ss.android.ugc.effectmanager.common.g.d
            r4 = 10001(0x2711, float:1.4014E-41)
            r2.<init>(r4)
            r0.<init>(r1, r2)
            r13.mo96238a(r3, r0)
            return
        L_0x001d:
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r2 = r13.f122789a     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r2 = r2.getPath()     // Catch:{ Exception -> 0x00a7 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x00a7 }
            if (r2 == 0) goto L_0x0051
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r2 = r13.f122789a     // Catch:{ Exception -> 0x00a7 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a7 }
            r4.<init>()     // Catch:{ Exception -> 0x00a7 }
            com.ss.android.ugc.effectmanager.g r5 = r13.f122793h     // Catch:{ Exception -> 0x00a7 }
            java.io.File r5 = r5.f122964j     // Catch:{ Exception -> 0x00a7 }
            r4.append(r5)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r5 = java.io.File.separator     // Catch:{ Exception -> 0x00a7 }
            r4.append(r5)     // Catch:{ Exception -> 0x00a7 }
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r5 = r13.f122789a     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r5 = r5.getId()     // Catch:{ Exception -> 0x00a7 }
            r4.append(r5)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r5 = ".gif"
            r4.append(r5)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00a7 }
            r2.setPath(r4)     // Catch:{ Exception -> 0x00a7 }
        L_0x0051:
            java.lang.String r2 = r13.f122792g     // Catch:{ Exception -> 0x00a7 }
            r13.f122794i = r2     // Catch:{ Exception -> 0x00a7 }
            java.net.URL r2 = new java.net.URL     // Catch:{ MalformedURLException | UnknownHostException -> 0x006a }
            java.lang.String r4 = r13.f122794i     // Catch:{ MalformedURLException | UnknownHostException -> 0x006a }
            r2.<init>(r4)     // Catch:{ MalformedURLException | UnknownHostException -> 0x006a }
            java.lang.String r2 = r2.getHost()     // Catch:{ MalformedURLException | UnknownHostException -> 0x006a }
            java.net.InetAddress r2 = java.net.InetAddress.getByName(r2)     // Catch:{ MalformedURLException | UnknownHostException -> 0x006a }
            java.lang.String r2 = r2.getHostAddress()     // Catch:{ MalformedURLException | UnknownHostException -> 0x006a }
            r13.f122795j = r2     // Catch:{ MalformedURLException | UnknownHostException -> 0x006a }
        L_0x006a:
            java.lang.String r2 = r13.f122792g     // Catch:{ Exception -> 0x00a7 }
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r4 = r13.f122789a     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r4 = r4.getPath()     // Catch:{ Exception -> 0x00a7 }
            com.ss.android.ugc.effectmanager.common.b r5 = new com.ss.android.ugc.effectmanager.common.b     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r6 = "GET"
            r5.<init>(r6, r2)     // Catch:{ Exception -> 0x00a7 }
            com.ss.android.ugc.effectmanager.a.a r2 = r13.f122791f     // Catch:{ Exception -> 0x00a7 }
            com.ss.android.ugc.effectmanager.g r2 = r2.f122047a     // Catch:{ Exception -> 0x00a7 }
            com.ss.android.ugc.effectmanager.common.f.a r2 = r2.f122977w     // Catch:{ Exception -> 0x00a7 }
            java.io.InputStream r2 = r2.mo96221a(r5)     // Catch:{ Exception -> 0x00a7 }
            com.ss.android.ugc.effectmanager.effect.e.a.a r12 = new com.ss.android.ugc.effectmanager.effect.e.a.a     // Catch:{ Exception -> 0x00a7 }
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r7 = r13.f122789a     // Catch:{ Exception -> 0x00a7 }
            r8 = 0
            r9 = 0
            r10 = 0
            r6 = r12
            r6.<init>(r7, r8, r9, r10)     // Catch:{ Exception -> 0x00a7 }
            long r5 = r5.f122199c     // Catch:{ Exception -> 0x00a7 }
            com.ss.android.ugc.effectmanager.effect.e.b.b.e$1 r7 = new com.ss.android.ugc.effectmanager.effect.e.b.b.e$1     // Catch:{ Exception -> 0x00a7 }
            r7.<init>(r12)     // Catch:{ Exception -> 0x00a7 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105305a(r2, r4, r5, r7)     // Catch:{ Exception -> 0x00a7 }
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r2 = r13.f122789a     // Catch:{ Exception -> 0x00a7 }
            if (r2 == 0) goto L_0x00c5
            com.ss.android.ugc.effectmanager.effect.e.a.a r4 = new com.ss.android.ugc.effectmanager.effect.e.a.a     // Catch:{ Exception -> 0x00a7 }
            r5 = 0
            r4.<init>(r2, r5)     // Catch:{ Exception -> 0x00a7 }
            r13.mo96238a(r3, r4)     // Catch:{ Exception -> 0x00a7 }
            return
        L_0x00a7:
            r2 = move-exception
            int r4 = r0 + -1
            if (r1 != r4) goto L_0x00c5
            com.ss.android.ugc.effectmanager.common.g.d r0 = new com.ss.android.ugc.effectmanager.common.g.d
            r0.<init>(r2)
            java.lang.String r1 = r13.f122794i
            java.lang.String r2 = ""
            java.lang.String r4 = r13.f122795j
            r0.mo96230a(r1, r2, r4)
            com.ss.android.ugc.effectmanager.effect.e.a.a r1 = new com.ss.android.ugc.effectmanager.effect.e.a.a
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r2 = r13.f122789a
            r1.<init>(r2, r0)
            r13.mo96238a(r3, r1)
            return
        L_0x00c5:
            int r1 = r1 + 1
            goto L_0x0003
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b.C48863e.mo96139a():void");
    }

    public C48863e(C48565a aVar, String str, ProviderEffect providerEffect, Handler handler) {
        super(handler, str);
        this.f122789a = providerEffect;
        this.f122791f = aVar;
        this.f122793h = aVar.f122047a;
        this.f122790b = aVar.f122047a.f122973s;
        this.f122792g = C48669g.m105306a(providerEffect);
    }
}
