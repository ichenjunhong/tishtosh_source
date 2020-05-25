package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.internal.ads.bye.C15742a.C15744b;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.ut */
public final class C16302ut extends C15563abr implements C16315vf {

    /* renamed from: a */
    final C16324vo f45693a;

    /* renamed from: b */
    final Object f45694b = new Object();

    /* renamed from: c */
    final Context f45695c;

    /* renamed from: d */
    Runnable f45696d;

    /* renamed from: e */
    boolean f45697e;

    /* renamed from: f */
    acz f45698f;

    /* renamed from: h */
    private final C16301us f45699h;

    /* renamed from: i */
    private final byc f45700i;

    /* renamed from: j */
    private final byh f45701j;

    /* renamed from: k */
    private zzaxe f45702k;

    /* renamed from: l */
    private zzaxi f45703l;

    /* renamed from: m */
    private C16118ny f45704m;

    public C16302ut(Context context, C16324vo voVar, C16301us usVar, byh byh) {
        this.f45699h = usVar;
        this.f45695c = context;
        this.f45693a = voVar;
        this.f45701j = byh;
        this.f45700i = new byc(this.f45701j);
        this.f45700i.mo30860a((byd) new C16303uu(this));
        bzi bzi = new bzi();
        bzi.f44676c = Integer.valueOf(this.f45693a.f45769j.f46238b);
        bzi.f44677d = Integer.valueOf(this.f45693a.f45769j.f46239c);
        bzi.f44678e = Integer.valueOf(this.f45693a.f45769j.f46240d ? 0 : 2);
        this.f45700i.mo30860a((byd) new C16304uv(bzi));
        if (this.f45693a.f45765f != null) {
            this.f45700i.mo30860a((byd) new C16305uw(this));
        }
        zzyz zzyz = this.f45693a.f45762c;
        if (zzyz.f46341d && "interstitial_mb".equals(zzyz.f46338a)) {
            this.f45700i.mo30860a(C16306ux.f45708a);
        } else if (zzyz.f46341d && "reward_mb".equals(zzyz.f46338a)) {
            this.f45700i.mo30860a(C16307uy.f45709a);
        } else if (zzyz.f46345h || zzyz.f46341d) {
            this.f45700i.mo30860a(C16310va.f45711a);
        } else {
            this.f45700i.mo30860a(C16308uz.f45710a);
        }
        this.f45700i.mo30861a(C15744b.AD_REQUEST);
    }

    /* renamed from: a */
    public final void mo27696a() {
        abv.m32792b("AdLoaderBackgroundTask started.");
        this.f45696d = new C16311vb(this);
        acd.f40245a.postDelayed(this.f45696d, ((Long) caf.m37099d().mo30717a(C15740bx.f44307bo)).longValue());
        long b = C14963ax.m30837g().mo28524b();
        if (this.f45693a.f45761b.f46319c != null) {
            String string = this.f45693a.f45761b.f46319c.getString("_ad");
            if (string != null) {
                zzaxe zzaxe = new zzaxe(this.f45693a, b, null, null, null, null);
                this.f45702k = zzaxe;
                mo31428a(C16360wx.m38976a(this.f45695c, this.f45702k, string));
                return;
            }
        }
        agr agr = new agr();
        acb.m32566a((Runnable) new C16312vc(this, agr));
        zzaxe zzaxe2 = new zzaxe(this.f45693a, b, C14963ax.m30849s().mo28562d(this.f45695c), C14963ax.m30849s().mo28564e(this.f45695c), C14963ax.m30849s().mo28566f(this.f45695c), C14963ax.m30849s().mo28568g(this.f45695c));
        this.f45702k = zzaxe2;
        agr.mo28830a(this.f45702k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo31427a(int i, String str) {
        zzaxe zzaxe;
        int i2 = i;
        if (i2 == 3 || i2 == -1) {
            abv.m32796d(str);
        } else {
            abv.m32798e(str);
        }
        if (this.f45703l == null) {
            this.f45703l = new zzaxi(i2);
        } else {
            this.f45703l = new zzaxi(i2, this.f45703l.f46192j);
        }
        if (this.f45702k != null) {
            zzaxe = this.f45702k;
        } else {
            zzaxe = new zzaxe(this.f45693a, -1, null, null, null, null);
        }
        abc abc = new abc(zzaxe, this.f45703l, this.f45704m, null, i, -1, this.f45703l.f46195m, null, this.f45700i, null);
        this.f45699h.mo27454a(abc);
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01da  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31428a(com.google.android.gms.internal.ads.zzaxi r14) {
        /*
            r13 = this;
            java.lang.String r0 = "Received ad response."
            com.google.android.gms.internal.ads.abv.m32792b(r0)
            r13.f45703l = r14
            com.google.android.gms.internal.ads.zzaxi r14 = r13.f45703l
            java.lang.String r14 = r14.f46176U
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x001a
            com.google.android.gms.internal.ads.aad r0 = com.google.android.gms.ads.internal.C14963ax.m30849s()
            android.content.Context r1 = r13.f45695c
            r0.mo28565e(r1, r14)
        L_0x001a:
            com.google.android.gms.common.util.e r14 = com.google.android.gms.ads.internal.C14963ax.m30837g()
            long r6 = r14.mo28524b()
            java.lang.Object r14 = r13.f45694b
            monitor-enter(r14)
            r0 = 0
            r13.f45698f = r0     // Catch:{ all -> 0x022d }
            monitor-exit(r14)     // Catch:{ all -> 0x022d }
            com.google.android.gms.internal.ads.abh r14 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abx r14 = r14.mo28595f()
            com.google.android.gms.internal.ads.zzaxi r1 = r13.f45703l
            boolean r1 = r1.f46161F
            r14.mo28639d(r1)
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r14 = com.google.android.gms.internal.ads.C15740bx.f44226aM
            com.google.android.gms.internal.ads.bu r1 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r14 = r1.mo30717a(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x006f
            com.google.android.gms.internal.ads.zzaxi r14 = r13.f45703l
            boolean r14 = r14.f46169N
            if (r14 == 0) goto L_0x0060
            com.google.android.gms.internal.ads.abh r14 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abx r14 = r14.mo28595f()
            com.google.android.gms.internal.ads.zzaxe r1 = r13.f45702k
            java.lang.String r1 = r1.f46134e
            r14.mo28634c(r1)
            goto L_0x006f
        L_0x0060:
            com.google.android.gms.internal.ads.abh r14 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abx r14 = r14.mo28595f()
            com.google.android.gms.internal.ads.zzaxe r1 = r13.f45702k
            java.lang.String r1 = r1.f46134e
            r14.mo28638d(r1)
        L_0x006f:
            com.google.android.gms.internal.ads.zzaxi r14 = r13.f45703l     // Catch:{ vd -> 0x0219 }
            int r14 = r14.f46186d     // Catch:{ vd -> 0x0219 }
            r1 = -2
            r2 = -3
            if (r14 == r1) goto L_0x009f
            com.google.android.gms.internal.ads.zzaxi r14 = r13.f45703l     // Catch:{ vd -> 0x0219 }
            int r14 = r14.f46186d     // Catch:{ vd -> 0x0219 }
            if (r14 != r2) goto L_0x007e
            goto L_0x009f
        L_0x007e:
            com.google.android.gms.internal.ads.vd r14 = new com.google.android.gms.internal.ads.vd     // Catch:{ vd -> 0x0219 }
            com.google.android.gms.internal.ads.zzaxi r0 = r13.f45703l     // Catch:{ vd -> 0x0219 }
            int r0 = r0.f46186d     // Catch:{ vd -> 0x0219 }
            r1 = 66
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ vd -> 0x0219 }
            r2.<init>(r1)     // Catch:{ vd -> 0x0219 }
            java.lang.String r1 = "There was a problem getting an ad response. ErrorCode: "
            r2.append(r1)     // Catch:{ vd -> 0x0219 }
            r2.append(r0)     // Catch:{ vd -> 0x0219 }
            java.lang.String r0 = r2.toString()     // Catch:{ vd -> 0x0219 }
            com.google.android.gms.internal.ads.zzaxi r1 = r13.f45703l     // Catch:{ vd -> 0x0219 }
            int r1 = r1.f46186d     // Catch:{ vd -> 0x0219 }
            r14.<init>(r0, r1)     // Catch:{ vd -> 0x0219 }
            throw r14     // Catch:{ vd -> 0x0219 }
        L_0x009f:
            com.google.android.gms.internal.ads.zzaxi r14 = r13.f45703l     // Catch:{ vd -> 0x0219 }
            int r14 = r14.f46186d     // Catch:{ vd -> 0x0219 }
            r1 = 0
            if (r14 == r2) goto L_0x013c
            com.google.android.gms.internal.ads.zzaxi r14 = r13.f45703l     // Catch:{ vd -> 0x0219 }
            java.lang.String r14 = r14.f46184b     // Catch:{ vd -> 0x0219 }
            boolean r14 = android.text.TextUtils.isEmpty(r14)     // Catch:{ vd -> 0x0219 }
            if (r14 != 0) goto L_0x0133
            com.google.android.gms.internal.ads.abh r14 = com.google.android.gms.ads.internal.C14963ax.m30834d()     // Catch:{ vd -> 0x0219 }
            com.google.android.gms.internal.ads.abx r14 = r14.mo28595f()     // Catch:{ vd -> 0x0219 }
            com.google.android.gms.internal.ads.zzaxi r2 = r13.f45703l     // Catch:{ vd -> 0x0219 }
            boolean r2 = r2.f46202t     // Catch:{ vd -> 0x0219 }
            r14.mo28628a(r2)     // Catch:{ vd -> 0x0219 }
            com.google.android.gms.internal.ads.zzaxi r14 = r13.f45703l     // Catch:{ vd -> 0x0219 }
            boolean r14 = r14.f46189g     // Catch:{ vd -> 0x0219 }
            if (r14 == 0) goto L_0x0103
            com.google.android.gms.internal.ads.ny r14 = new com.google.android.gms.internal.ads.ny     // Catch:{ JSONException -> 0x00dc }
            com.google.android.gms.internal.ads.zzaxi r2 = r13.f45703l     // Catch:{ JSONException -> 0x00dc }
            java.lang.String r2 = r2.f46184b     // Catch:{ JSONException -> 0x00dc }
            r14.<init>(r2)     // Catch:{ JSONException -> 0x00dc }
            r13.f45704m = r14     // Catch:{ JSONException -> 0x00dc }
            com.google.android.gms.internal.ads.abh r14 = com.google.android.gms.ads.internal.C14963ax.m30834d()     // Catch:{ JSONException -> 0x00dc }
            com.google.android.gms.internal.ads.ny r2 = r13.f45704m     // Catch:{ JSONException -> 0x00dc }
            boolean r2 = r2.f45301h     // Catch:{ JSONException -> 0x00dc }
            r14.mo28589a(r2)     // Catch:{ JSONException -> 0x00dc }
            goto L_0x010e
        L_0x00dc:
            r14 = move-exception
            java.lang.String r0 = "Could not parse mediation config."
            com.google.android.gms.internal.ads.abv.m32793b(r0, r14)     // Catch:{ vd -> 0x0219 }
            com.google.android.gms.internal.ads.vd r14 = new com.google.android.gms.internal.ads.vd     // Catch:{ vd -> 0x0219 }
            java.lang.String r0 = "Could not parse mediation config: "
            com.google.android.gms.internal.ads.zzaxi r2 = r13.f45703l     // Catch:{ vd -> 0x0219 }
            java.lang.String r2 = r2.f46184b     // Catch:{ vd -> 0x0219 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ vd -> 0x0219 }
            int r3 = r2.length()     // Catch:{ vd -> 0x0219 }
            if (r3 == 0) goto L_0x00f9
            java.lang.String r0 = r0.concat(r2)     // Catch:{ vd -> 0x0219 }
            goto L_0x00ff
        L_0x00f9:
            java.lang.String r2 = new java.lang.String     // Catch:{ vd -> 0x0219 }
            r2.<init>(r0)     // Catch:{ vd -> 0x0219 }
            r0 = r2
        L_0x00ff:
            r14.<init>(r0, r1)     // Catch:{ vd -> 0x0219 }
            throw r14     // Catch:{ vd -> 0x0219 }
        L_0x0103:
            com.google.android.gms.internal.ads.abh r14 = com.google.android.gms.ads.internal.C14963ax.m30834d()     // Catch:{ vd -> 0x0219 }
            com.google.android.gms.internal.ads.zzaxi r2 = r13.f45703l     // Catch:{ vd -> 0x0219 }
            boolean r2 = r2.f46164I     // Catch:{ vd -> 0x0219 }
            r14.mo28589a(r2)     // Catch:{ vd -> 0x0219 }
        L_0x010e:
            com.google.android.gms.internal.ads.zzaxi r14 = r13.f45703l     // Catch:{ vd -> 0x0219 }
            java.lang.String r14 = r14.f46162G     // Catch:{ vd -> 0x0219 }
            boolean r14 = android.text.TextUtils.isEmpty(r14)     // Catch:{ vd -> 0x0219 }
            if (r14 != 0) goto L_0x013c
            java.lang.String r14 = "Received cookie from server. Setting webview cookie in CookieManager."
            com.google.android.gms.internal.ads.abv.m32792b(r14)     // Catch:{ vd -> 0x0219 }
            com.google.android.gms.internal.ads.acm r14 = com.google.android.gms.ads.internal.C14963ax.m30832b()     // Catch:{ vd -> 0x0219 }
            android.content.Context r2 = r13.f45695c     // Catch:{ vd -> 0x0219 }
            android.webkit.CookieManager r14 = r14.mo28696c(r2)     // Catch:{ vd -> 0x0219 }
            if (r14 == 0) goto L_0x013c
            java.lang.String r2 = "googleads.g.doubleclick.net"
            com.google.android.gms.internal.ads.zzaxi r3 = r13.f45703l     // Catch:{ vd -> 0x0219 }
            java.lang.String r3 = r3.f46162G     // Catch:{ vd -> 0x0219 }
            r14.setCookie(r2, r3)     // Catch:{ vd -> 0x0219 }
            goto L_0x013c
        L_0x0133:
            com.google.android.gms.internal.ads.vd r14 = new com.google.android.gms.internal.ads.vd     // Catch:{ vd -> 0x0219 }
            java.lang.String r0 = "No fill from ad server."
            r1 = 3
            r14.<init>(r0, r1)     // Catch:{ vd -> 0x0219 }
            throw r14     // Catch:{ vd -> 0x0219 }
        L_0x013c:
            com.google.android.gms.internal.ads.zzaxe r14 = r13.f45702k     // Catch:{ vd -> 0x0219 }
            com.google.android.gms.internal.ads.zzyz r14 = r14.f46133d     // Catch:{ vd -> 0x0219 }
            com.google.android.gms.internal.ads.zzyz[] r14 = r14.f46344g     // Catch:{ vd -> 0x0219 }
            if (r14 == 0) goto L_0x014c
            com.google.android.gms.internal.ads.zzaxe r14 = r13.f45702k     // Catch:{ vd -> 0x0219 }
            com.google.android.gms.internal.ads.zzyz r14 = r13.m38902a(r14)     // Catch:{ vd -> 0x0219 }
            r4 = r14
            goto L_0x014d
        L_0x014c:
            r4 = r0
        L_0x014d:
            com.google.android.gms.internal.ads.abh r14 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abx r14 = r14.mo28595f()
            com.google.android.gms.internal.ads.zzaxi r2 = r13.f45703l
            boolean r2 = r2.f46203u
            r14.mo28632b(r2)
            com.google.android.gms.internal.ads.abh r14 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abx r14 = r14.mo28595f()
            com.google.android.gms.internal.ads.zzaxi r2 = r13.f45703l
            boolean r2 = r2.f46168M
            r14.mo28635c(r2)
            com.google.android.gms.internal.ads.zzaxi r14 = r13.f45703l
            java.lang.String r14 = r14.f46199q
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x0186
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Exception -> 0x0180 }
            com.google.android.gms.internal.ads.zzaxi r2 = r13.f45703l     // Catch:{ Exception -> 0x0180 }
            java.lang.String r2 = r2.f46199q     // Catch:{ Exception -> 0x0180 }
            r14.<init>(r2)     // Catch:{ Exception -> 0x0180 }
            r10 = r14
            goto L_0x0187
        L_0x0180:
            r14 = move-exception
            java.lang.String r2 = "Error parsing the JSON for Active View."
            com.google.android.gms.internal.ads.abv.m32793b(r2, r14)
        L_0x0186:
            r10 = r0
        L_0x0187:
            com.google.android.gms.internal.ads.zzaxe r14 = r13.f45702k
            com.google.android.gms.internal.ads.zzyv r14 = r14.f46132c
            android.os.Bundle r14 = r14.f46329m
            com.google.android.gms.internal.ads.zzaxi r2 = r13.f45703l
            int r2 = r2.f46171P
            r3 = 2
            r5 = 1
            if (r2 != r3) goto L_0x01ba
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r1 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r1 = r1.getName()
            android.os.Bundle r1 = r14.getBundle(r1)
            if (r1 != 0) goto L_0x01b3
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r2 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r2 = r2.getName()
            r14.putBundle(r2, r1)
        L_0x01b3:
            java.lang.String r2 = "render_test_ad_label"
            r1.putBoolean(r2, r5)
        L_0x01b8:
            r12 = r0
            goto L_0x01d4
        L_0x01ba:
            com.google.android.gms.internal.ads.zzaxi r2 = r13.f45703l
            int r2 = r2.f46171P
            if (r2 != r5) goto L_0x01c5
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            goto L_0x01b8
        L_0x01c5:
            com.google.android.gms.internal.ads.zzaxi r1 = r13.f45703l
            int r1 = r1.f46171P
            if (r1 != 0) goto L_0x01b8
            boolean r0 = com.google.android.gms.internal.ads.ael.m32733a(r14)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x01b8
        L_0x01d4:
            com.google.android.gms.internal.ads.zzaxi r0 = r13.f45703l
            boolean r0 = r0.f46177V
            if (r0 == 0) goto L_0x01f9
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r0 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r0 = r0.getName()
            android.os.Bundle r0 = r14.getBundle(r0)
            if (r0 != 0) goto L_0x01f4
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r1 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r1 = r1.getName()
            r14.putBundle(r1, r0)
        L_0x01f4:
            java.lang.String r14 = "is_analytics_logging_enabled"
            r0.putBoolean(r14, r5)
        L_0x01f9:
            com.google.android.gms.internal.ads.abc r14 = new com.google.android.gms.internal.ads.abc
            com.google.android.gms.internal.ads.zzaxe r1 = r13.f45702k
            com.google.android.gms.internal.ads.zzaxi r2 = r13.f45703l
            com.google.android.gms.internal.ads.ny r3 = r13.f45704m
            r5 = -2
            com.google.android.gms.internal.ads.zzaxi r0 = r13.f45703l
            long r8 = r0.f46195m
            com.google.android.gms.internal.ads.byc r11 = r13.f45700i
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12)
            com.google.android.gms.internal.ads.us r0 = r13.f45699h
            r0.mo27454a(r14)
            android.os.Handler r14 = com.google.android.gms.internal.ads.acd.f40245a
            java.lang.Runnable r0 = r13.f45696d
            r14.removeCallbacks(r0)
            return
        L_0x0219:
            r14 = move-exception
            int r0 = r14.mo31431a()
            java.lang.String r14 = r14.getMessage()
            r13.mo31427a(r0, r14)
            android.os.Handler r14 = com.google.android.gms.internal.ads.acd.f40245a
            java.lang.Runnable r0 = r13.f45696d
            r14.removeCallbacks(r0)
            return
        L_0x022d:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x022d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16302ut.mo31428a(com.google.android.gms.internal.ads.zzaxi):void");
    }

    /* renamed from: x_ */
    public final void mo27697x_() {
        synchronized (this.f45694b) {
            if (this.f45698f != null) {
                this.f45698f.mo28617b();
            }
        }
    }

    /* renamed from: a */
    private final zzyz m38902a(zzaxe zzaxe) throws C16313vd {
        int i;
        zzyz[] zzyzArr;
        if (((this.f45702k == null || this.f45702k.f46118V == null || this.f45702k.f46118V.size() <= 1) ? false : true) && this.f45704m != null && !this.f45704m.f45314u) {
            return null;
        }
        if (this.f45703l.f46207y) {
            for (zzyz zzyz : zzaxe.f46133d.f46344g) {
                if (zzyz.f46346i) {
                    return new zzyz(zzyz, zzaxe.f46133d.f46344g);
                }
            }
        }
        if (this.f45703l.f46194l != null) {
            String[] split = this.f45703l.f46194l.split("x");
            if (split.length != 2) {
                String str = "Invalid ad size format from the ad response: ";
                String valueOf = String.valueOf(this.f45703l.f46194l);
                throw new C16313vd(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
            }
            try {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                zzyz[] zzyzArr2 = zzaxe.f46133d.f46344g;
                int length = zzyzArr2.length;
                for (int i2 = 0; i2 < length; i2++) {
                    zzyz zzyz2 = zzyzArr2[i2];
                    float f = this.f45695c.getResources().getDisplayMetrics().density;
                    int i3 = zzyz2.f46342e == -1 ? (int) (((float) zzyz2.f46343f) / f) : zzyz2.f46342e;
                    if (zzyz2.f46339b == -2) {
                        i = (int) (((float) zzyz2.f46340c) / f);
                    } else {
                        i = zzyz2.f46339b;
                    }
                    if (parseInt == i3 && parseInt2 == i && !zzyz2.f46346i) {
                        return new zzyz(zzyz2, zzaxe.f46133d.f46344g);
                    }
                }
                String str2 = "The ad size from the ad response was not one of the requested sizes: ";
                String valueOf2 = String.valueOf(this.f45703l.f46194l);
                throw new C16313vd(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), 0);
            } catch (NumberFormatException unused) {
                String str3 = "Invalid ad size number from the ad response: ";
                String valueOf3 = String.valueOf(this.f45703l.f46194l);
                throw new C16313vd(valueOf3.length() != 0 ? str3.concat(valueOf3) : new String(str3), 0);
            }
        } else {
            throw new C16313vd("The ad response must specify one of the supported ad sizes.", 0);
        }
    }
}
