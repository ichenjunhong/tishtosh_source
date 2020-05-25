package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.util.C15514e;

/* renamed from: com.google.android.gms.measurement.internal.l */
public final class C17127l extends C17076do {

    /* renamed from: a */
    private String f48421a;

    /* renamed from: b */
    private String f48422b;

    /* renamed from: c */
    private int f48423c;

    /* renamed from: d */
    private String f48424d;

    /* renamed from: e */
    private String f48425e;

    /* renamed from: f */
    private long f48426f;

    /* renamed from: g */
    private long f48427g;

    /* renamed from: h */
    private int f48428h;

    /* renamed from: i */
    private String f48429i;

    /* renamed from: j */
    private String f48430j;

    C17127l(C17005ay ayVar) {
        super(ayVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo32997t() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0179 A[Catch:{ IllegalStateException -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x017c A[Catch:{ IllegalStateException -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0185 A[Catch:{ IllegalStateException -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0198 A[Catch:{ IllegalStateException -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c9  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33071u() {
        /*
            r10 = this;
            java.lang.String r0 = "unknown"
            java.lang.String r1 = "Unknown"
            java.lang.String r2 = "Unknown"
            android.content.Context r3 = r10.mo32850m()
            java.lang.String r3 = r3.getPackageName()
            android.content.Context r4 = r10.mo32850m()
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            r5 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != 0) goto L_0x002b
            com.google.android.gms.measurement.internal.r r4 = r10.mo32854q()
            com.google.android.gms.measurement.internal.t r4 = r4.f48445b
            java.lang.String r7 = "PackageManager is null, app identity information might be inaccurate. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C17133r.m41997a(r3)
            r4.mo33377a(r7, r8)
            goto L_0x0085
        L_0x002b:
            java.lang.String r7 = r4.getInstallerPackageName(r3)     // Catch:{ IllegalArgumentException -> 0x0031 }
            r0 = r7
            goto L_0x0040
        L_0x0031:
            com.google.android.gms.measurement.internal.r r7 = r10.mo32854q()
            com.google.android.gms.measurement.internal.t r7 = r7.f48445b
            java.lang.String r8 = "Error retrieving app installer package name. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C17133r.m41997a(r3)
            r7.mo33377a(r8, r9)
        L_0x0040:
            if (r0 != 0) goto L_0x0045
            java.lang.String r0 = "manual_install"
            goto L_0x004f
        L_0x0045:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004f
            java.lang.String r0 = ""
        L_0x004f:
            android.content.Context r7 = r10.mo32850m()     // Catch:{ NameNotFoundException -> 0x0076 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0076 }
            android.content.pm.PackageInfo r7 = r4.getPackageInfo(r7, r5)     // Catch:{ NameNotFoundException -> 0x0076 }
            if (r7 == 0) goto L_0x0085
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0076 }
            java.lang.CharSequence r4 = r4.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0076 }
            boolean r8 = android.text.TextUtils.isEmpty(r4)     // Catch:{ NameNotFoundException -> 0x0076 }
            if (r8 != 0) goto L_0x006e
            java.lang.String r4 = r4.toString()     // Catch:{ NameNotFoundException -> 0x0076 }
            r2 = r4
        L_0x006e:
            java.lang.String r4 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0076 }
            int r1 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0075 }
            r6 = r1
            r1 = r4
            goto L_0x0085
        L_0x0075:
            r1 = r4
        L_0x0076:
            com.google.android.gms.measurement.internal.r r4 = r10.mo32854q()
            com.google.android.gms.measurement.internal.t r4 = r4.f48445b
            java.lang.String r7 = "Error retrieving package info. appId, appName"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C17133r.m41997a(r3)
            r4.mo33378a(r7, r8, r2)
        L_0x0085:
            r10.f48421a = r3
            r10.f48424d = r0
            r10.f48422b = r1
            r10.f48423c = r6
            r10.f48425e = r2
            r0 = 0
            r10.f48426f = r0
            android.content.Context r2 = r10.mo32850m()
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.internal.C15333e.m31883a(r2)
            r4 = 1
            if (r2 == 0) goto L_0x00a6
            boolean r6 = r2.mo28060c()
            if (r6 == 0) goto L_0x00a6
            r6 = 1
            goto L_0x00a7
        L_0x00a6:
            r6 = 0
        L_0x00a7:
            com.google.android.gms.measurement.internal.ay r7 = r10.f48052r
            java.lang.String r7 = r7.f47962a
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x00bf
            java.lang.String r7 = "am"
            com.google.android.gms.measurement.internal.ay r8 = r10.f48052r
            java.lang.String r8 = r8.f47963b
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x00bf
            r7 = 1
            goto L_0x00c0
        L_0x00bf:
            r7 = 0
        L_0x00c0:
            r6 = r6 | r7
            if (r6 != 0) goto L_0x00e4
            if (r2 != 0) goto L_0x00d1
            com.google.android.gms.measurement.internal.r r2 = r10.mo32854q()
            com.google.android.gms.measurement.internal.t r2 = r2.f48445b
            java.lang.String r7 = "GoogleService failed to initialize (no status)"
            r2.mo33376a(r7)
            goto L_0x00e4
        L_0x00d1:
            com.google.android.gms.measurement.internal.r r7 = r10.mo32854q()
            com.google.android.gms.measurement.internal.t r7 = r7.f48445b
            java.lang.String r8 = "GoogleService failed to initialize, status"
            int r9 = r2.f39272g
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r2 = r2.f39273h
            r7.mo33378a(r8, r9, r2)
        L_0x00e4:
            if (r6 == 0) goto L_0x0148
            com.google.android.gms.measurement.internal.eu r2 = r10.mo32856s()
            java.lang.Boolean r2 = r2.mo33285g()
            com.google.android.gms.measurement.internal.eu r6 = r10.mo32856s()
            boolean r6 = r6.mo33283f()
            if (r6 == 0) goto L_0x010c
            com.google.android.gms.measurement.internal.ay r2 = r10.f48052r
            boolean r2 = r2.mo32929h()
            if (r2 == 0) goto L_0x0148
            com.google.android.gms.measurement.internal.r r2 = r10.mo32854q()
            com.google.android.gms.measurement.internal.t r2 = r2.f48451h
            java.lang.String r4 = "Collection disabled with firebase_analytics_collection_deactivated=1"
            r2.mo33376a(r4)
            goto L_0x0148
        L_0x010c:
            if (r2 == 0) goto L_0x0128
            boolean r6 = r2.booleanValue()
            if (r6 != 0) goto L_0x0128
            com.google.android.gms.measurement.internal.ay r2 = r10.f48052r
            boolean r2 = r2.mo32929h()
            if (r2 == 0) goto L_0x0148
            com.google.android.gms.measurement.internal.r r2 = r10.mo32854q()
            com.google.android.gms.measurement.internal.t r2 = r2.f48451h
            java.lang.String r4 = "Collection disabled with firebase_analytics_collection_enabled=0"
            r2.mo33376a(r4)
            goto L_0x0148
        L_0x0128:
            if (r2 != 0) goto L_0x013c
            boolean r2 = com.google.android.gms.common.api.internal.C15333e.m31886b()
            if (r2 == 0) goto L_0x013c
            com.google.android.gms.measurement.internal.r r2 = r10.mo32854q()
            com.google.android.gms.measurement.internal.t r2 = r2.f48451h
            java.lang.String r4 = "Collection disabled with google_app_measurement_enable=0"
            r2.mo33376a(r4)
            goto L_0x0148
        L_0x013c:
            com.google.android.gms.measurement.internal.r r2 = r10.mo32854q()
            com.google.android.gms.measurement.internal.t r2 = r2.f48453j
            java.lang.String r6 = "Collection enabled"
            r2.mo33376a(r6)
            goto L_0x0149
        L_0x0148:
            r4 = 0
        L_0x0149:
            java.lang.String r2 = ""
            r10.f48429i = r2
            java.lang.String r2 = ""
            r10.f48430j = r2
            r10.f48427g = r0
            com.google.android.gms.measurement.internal.ay r0 = r10.f48052r
            java.lang.String r0 = r0.f47962a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x016f
            java.lang.String r0 = "am"
            com.google.android.gms.measurement.internal.ay r1 = r10.f48052r
            java.lang.String r1 = r1.f47963b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x016f
            com.google.android.gms.measurement.internal.ay r0 = r10.f48052r
            java.lang.String r0 = r0.f47962a
            r10.f48430j = r0
        L_0x016f:
            java.lang.String r0 = com.google.android.gms.common.api.internal.C15333e.m31885a()     // Catch:{ IllegalStateException -> 0x01a8 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IllegalStateException -> 0x01a8 }
            if (r1 == 0) goto L_0x017c
            java.lang.String r1 = ""
            goto L_0x017d
        L_0x017c:
            r1 = r0
        L_0x017d:
            r10.f48429i = r1     // Catch:{ IllegalStateException -> 0x01a8 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IllegalStateException -> 0x01a8 }
            if (r0 != 0) goto L_0x0196
            com.google.android.gms.common.internal.s r0 = new com.google.android.gms.common.internal.s     // Catch:{ IllegalStateException -> 0x01a8 }
            android.content.Context r1 = r10.mo32850m()     // Catch:{ IllegalStateException -> 0x01a8 }
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x01a8 }
            java.lang.String r1 = "admob_app_id"
            java.lang.String r0 = r0.mo28451a(r1)     // Catch:{ IllegalStateException -> 0x01a8 }
            r10.f48430j = r0     // Catch:{ IllegalStateException -> 0x01a8 }
        L_0x0196:
            if (r4 == 0) goto L_0x01b8
            com.google.android.gms.measurement.internal.r r0 = r10.mo32854q()     // Catch:{ IllegalStateException -> 0x01a8 }
            com.google.android.gms.measurement.internal.t r0 = r0.f48453j     // Catch:{ IllegalStateException -> 0x01a8 }
            java.lang.String r1 = "App package, google app id"
            java.lang.String r2 = r10.f48421a     // Catch:{ IllegalStateException -> 0x01a8 }
            java.lang.String r4 = r10.f48429i     // Catch:{ IllegalStateException -> 0x01a8 }
            r0.mo33378a(r1, r2, r4)     // Catch:{ IllegalStateException -> 0x01a8 }
            goto L_0x01b8
        L_0x01a8:
            r0 = move-exception
            com.google.android.gms.measurement.internal.r r1 = r10.mo32854q()
            com.google.android.gms.measurement.internal.t r1 = r1.f48445b
            java.lang.String r2 = "getGoogleAppId or isMeasurementEnabled failed with exception. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C17133r.m41997a(r3)
            r1.mo33378a(r2, r3, r0)
        L_0x01b8:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x01c9
            android.content.Context r0 = r10.mo32850m()
            boolean r0 = com.google.android.gms.common.p1037d.C15374a.m31942a(r0)
            r10.f48428h = r0
            return
        L_0x01c9:
            r10.f48428h = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C17127l.mo33071u():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final zzk mo33352a(String str) {
        String str2;
        long j;
        mo32840c();
        String v = mo33353v();
        String w = mo33354w();
        mo33068C();
        String str3 = this.f48422b;
        long y = (long) mo33356y();
        mo33068C();
        String str4 = this.f48424d;
        mo33068C();
        mo32840c();
        if (this.f48426f == 0) {
            this.f48426f = this.f48052r.mo32926e().mo33136a(mo32850m(), mo32850m().getPackageName());
        }
        long j2 = this.f48426f;
        boolean s = this.f48052r.mo32936s();
        boolean z = !mo32855r().f47888q;
        mo32840c();
        if (!mo32856s().mo33278c(this.f48421a, C17122h.f48365aa) || this.f48052r.mo32936s()) {
            str2 = m41918A();
        } else {
            str2 = null;
        }
        String str5 = str2;
        mo33068C();
        long j3 = this.f48427g;
        C17005ay ayVar = this.f48052r;
        Long valueOf = Long.valueOf(ayVar.mo32923b().f47880i.mo32882a());
        if (valueOf.longValue() == 0) {
            j = ayVar.f47972k;
        } else {
            j = Math.min(ayVar.f47972k, valueOf.longValue());
        }
        int z2 = mo33357z();
        Boolean b = mo32856s().mo33276b("google_analytics_adid_collection_enabled");
        boolean booleanValue = Boolean.valueOf(b == null || b.booleanValue()).booleanValue();
        Boolean b2 = mo32856s().mo33276b("google_analytics_ssaid_collection_enabled");
        boolean booleanValue2 = Boolean.valueOf(b2 == null || b2.booleanValue()).booleanValue();
        C16986af r = mo32855r();
        r.mo32840c();
        zzk zzk = new zzk(v, w, str3, y, str4, 14710, j2, str, s, z, str5, j3, j, z2, booleanValue, booleanValue2, r.mo32873f().getBoolean("deferred_analytics_collection", false), mo33355x());
        return zzk;
    }

    /* renamed from: A */
    private final String m41918A() {
        try {
            Class loadClass = mo32850m().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(null, new Object[]{mo32850m()});
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                } catch (Exception unused) {
                    mo32854q().f48450g.mo33376a("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                mo32854q().f48449f.mo33376a("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public final String mo33353v() {
        mo33068C();
        return this.f48421a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final String mo33354w() {
        mo33068C();
        return this.f48429i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public final String mo33355x() {
        mo33068C();
        return this.f48430j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public final int mo33356y() {
        mo33068C();
        return this.f48423c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public final int mo33357z() {
        mo33068C();
        return this.f48428h;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32834a() {
        super.mo32834a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo32838b() {
        super.mo32838b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo32840c() {
        super.mo32840c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C16980a mo32841d() {
        return super.mo32841d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C17038cd mo32842e() {
        return super.mo32842e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C17127l mo32843f() {
        return super.mo32843f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C17055cu mo32844g() {
        return super.mo32844g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C17051cq mo32845h() {
        return super.mo32845h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C17129n mo32846i() {
        return super.mo32846i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C17080ds mo32847j() {
        return super.mo32847j();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C17007b mo32848k() {
        return super.mo32848k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C15514e mo32849l() {
        return super.mo32849l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo32850m() {
        return super.mo32850m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C17131p mo32851n() {
        return super.mo32851n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C17102em mo32852o() {
        return super.mo32852o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C17000at mo32853p() {
        return super.mo32853p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C17133r mo32854q() {
        return super.mo32854q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C16986af mo32855r() {
        return super.mo32855r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C17110eu mo32856s() {
        return super.mo32856s();
    }
}
