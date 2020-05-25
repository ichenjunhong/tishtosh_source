package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b;

import android.os.Handler;
import android.text.TextUtils;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.C48605b;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48620c;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48656j;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48668f;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48676l;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.b.q */
public final class C48876q extends C48656j {

    /* renamed from: a */
    private C48565a f122889a;

    /* renamed from: b */
    private C48890g f122890b = this.f122889a.f122047a;

    /* renamed from: f */
    private int f122891f = this.f122890b.f122973s;

    /* renamed from: g */
    private C48620c f122892g = this.f122890b.f122972r;

    /* renamed from: h */
    private C48641b f122893h = this.f122890b.f122976v;

    /* renamed from: i */
    private String f122894i;

    /* renamed from: j */
    private String f122895j;

    /* renamed from: k */
    private String f122896k;

    /* renamed from: l */
    private String f122897l;

    /* renamed from: m */
    private int f122898m;

    /* renamed from: n */
    private int f122899n;

    /* renamed from: b */
    private C48605b m105621b() {
        HashMap a = C48668f.f122308a.mo96252a(this.f122890b);
        if (!TextUtils.isEmpty(this.f122894i)) {
            a.put("library", this.f122894i);
        }
        a.put("cursor", String.valueOf(this.f122898m));
        a.put("count", String.valueOf(this.f122899n));
        this.f122896k = this.f122889a.mo96084a();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f122896k);
        sb.append(this.f122890b.f122955a);
        sb.append("/stickers/recommend");
        String a2 = C48676l.m105346a(a, sb.toString());
        this.f122895j = a2;
        try {
            this.f122897l = InetAddress.getByName(new URL(a2).getHost()).getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
        }
        return new C48605b("GET", a2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:15|(2:17|(1:19)(2:20|(2:23|21)))|24|25|26|27|38|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00c1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96139a() {
        /*
            r7 = this;
            com.ss.android.ugc.effectmanager.common.b r0 = r7.m105621b()
        L_0x0004:
            int r1 = r7.f122891f
            int r2 = r1 + -1
            r7.f122891f = r2
            if (r1 == 0) goto L_0x00e7
            r1 = 18
            boolean r2 = r7.f122291c     // Catch:{ Exception -> 0x00cb }
            if (r2 == 0) goto L_0x0030
            com.ss.android.ugc.effectmanager.common.g.d r2 = new com.ss.android.ugc.effectmanager.common.g.d     // Catch:{ Exception -> 0x00cb }
            r3 = 10001(0x2711, float:1.4014E-41)
            r2.<init>(r3)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r3 = r7.f122895j     // Catch:{ Exception -> 0x00cb }
            java.lang.String r4 = r7.f122896k     // Catch:{ Exception -> 0x00cb }
            java.lang.String r5 = r7.f122897l     // Catch:{ Exception -> 0x00cb }
            r2.mo96230a(r3, r4, r5)     // Catch:{ Exception -> 0x00cb }
            com.ss.android.ugc.effectmanager.effect.e.a.l r3 = new com.ss.android.ugc.effectmanager.effect.e.a.l     // Catch:{ Exception -> 0x00cb }
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel r4 = new com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel     // Catch:{ Exception -> 0x00cb }
            r4.<init>()     // Catch:{ Exception -> 0x00cb }
            r3.<init>(r4, r2)     // Catch:{ Exception -> 0x00cb }
            r7.mo96238a(r1, r3)     // Catch:{ Exception -> 0x00cb }
            return
        L_0x0030:
            com.ss.android.ugc.effectmanager.g r2 = r7.f122890b     // Catch:{ Exception -> 0x00cb }
            com.ss.android.ugc.effectmanager.common.f.a r2 = r2.f122977w     // Catch:{ Exception -> 0x00cb }
            com.ss.android.ugc.effectmanager.common.e.b r3 = r7.f122893h     // Catch:{ Exception -> 0x00cb }
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.net.ProviderEffectListResponse> r4 = com.p683ss.android.ugc.effectmanager.effect.model.net.ProviderEffectListResponse.class
            com.ss.android.ugc.effectmanager.common.model.BaseNetResponse r2 = r2.mo96220a(r0, r3, r4)     // Catch:{ Exception -> 0x00cb }
            com.ss.android.ugc.effectmanager.effect.model.net.ProviderEffectListResponse r2 = (com.p683ss.android.ugc.effectmanager.effect.model.net.ProviderEffectListResponse) r2     // Catch:{ Exception -> 0x00cb }
            boolean r3 = r2.checkValue()     // Catch:{ Exception -> 0x00cb }
            if (r3 != 0) goto L_0x0066
            int r2 = r7.f122891f     // Catch:{ Exception -> 0x00cb }
            if (r2 != 0) goto L_0x0004
            com.ss.android.ugc.effectmanager.common.g.d r2 = new com.ss.android.ugc.effectmanager.common.g.d     // Catch:{ Exception -> 0x00cb }
            r3 = 10002(0x2712, float:1.4016E-41)
            r2.<init>(r3)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r3 = r7.f122895j     // Catch:{ Exception -> 0x00cb }
            java.lang.String r4 = r7.f122896k     // Catch:{ Exception -> 0x00cb }
            java.lang.String r5 = r7.f122897l     // Catch:{ Exception -> 0x00cb }
            r2.mo96230a(r3, r4, r5)     // Catch:{ Exception -> 0x00cb }
            com.ss.android.ugc.effectmanager.effect.e.a.l r3 = new com.ss.android.ugc.effectmanager.effect.e.a.l     // Catch:{ Exception -> 0x00cb }
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel r4 = new com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel     // Catch:{ Exception -> 0x00cb }
            r4.<init>()     // Catch:{ Exception -> 0x00cb }
            r3.<init>(r4, r2)     // Catch:{ Exception -> 0x00cb }
            r7.mo96238a(r1, r3)     // Catch:{ Exception -> 0x00cb }
            return
        L_0x0066:
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel r2 = r2.getData()     // Catch:{ Exception -> 0x00cb }
            if (r2 == 0) goto L_0x00ac
            java.util.List r3 = r2.getStickerList()     // Catch:{ Exception -> 0x00cb }
            if (r3 != 0) goto L_0x0073
            goto L_0x00ac
        L_0x0073:
            java.util.List r3 = r2.getStickerList()     // Catch:{ Exception -> 0x00cb }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x00cb }
        L_0x007b:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x00cb }
            if (r4 == 0) goto L_0x00ac
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x00cb }
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r4 = (com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffect) r4     // Catch:{ Exception -> 0x00cb }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cb }
            r5.<init>()     // Catch:{ Exception -> 0x00cb }
            com.ss.android.ugc.effectmanager.g r6 = r7.f122890b     // Catch:{ Exception -> 0x00cb }
            java.io.File r6 = r6.f122964j     // Catch:{ Exception -> 0x00cb }
            r5.append(r6)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r6 = java.io.File.separator     // Catch:{ Exception -> 0x00cb }
            r5.append(r6)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r6 = r4.getId()     // Catch:{ Exception -> 0x00cb }
            r5.append(r6)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r6 = ".gif"
            r5.append(r6)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00cb }
            r4.setPath(r5)     // Catch:{ Exception -> 0x00cb }
            goto L_0x007b
        L_0x00ac:
            com.ss.android.ugc.effectmanager.g r3 = r7.f122890b     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r3 = r3.f122960f     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r4 = r7.f122894i     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r3 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48667e.m105298a(r3, r4)     // Catch:{ Exception -> 0x00c1 }
            com.ss.android.ugc.effectmanager.common.e.b r4 = r7.f122893h     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r4 = r4.mo59190a(r2)     // Catch:{ Exception -> 0x00c1 }
            com.ss.android.ugc.effectmanager.common.b.c r5 = r7.f122892g     // Catch:{ Exception -> 0x00c1 }
            r5.mo96148a(r3, r4)     // Catch:{ Exception -> 0x00c1 }
        L_0x00c1:
            com.ss.android.ugc.effectmanager.effect.e.a.l r3 = new com.ss.android.ugc.effectmanager.effect.e.a.l     // Catch:{ Exception -> 0x00cb }
            r4 = 0
            r3.<init>(r2, r4)     // Catch:{ Exception -> 0x00cb }
            r7.mo96238a(r1, r3)     // Catch:{ Exception -> 0x00cb }
            return
        L_0x00cb:
            r2 = move-exception
            int r3 = r7.f122891f
            if (r3 == 0) goto L_0x00d4
            boolean r3 = r2 instanceof com.p683ss.android.ugc.effectmanager.common.p2437d.C48636c
            if (r3 == 0) goto L_0x0004
        L_0x00d4:
            com.ss.android.ugc.effectmanager.effect.e.a.l r0 = new com.ss.android.ugc.effectmanager.effect.e.a.l
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel r3 = new com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel
            r3.<init>()
            com.ss.android.ugc.effectmanager.common.g.d r4 = new com.ss.android.ugc.effectmanager.common.g.d
            r4.<init>(r2)
            r0.<init>(r3, r4)
            r7.mo96238a(r1, r0)
            return
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b.C48876q.mo96139a():void");
    }

    public C48876q(C48565a aVar, String str, String str2, int i, int i2, Handler handler) {
        super(handler, str);
        this.f122898m = i;
        this.f122899n = i2;
        this.f122894i = str2;
        this.f122889a = aVar;
    }
}
