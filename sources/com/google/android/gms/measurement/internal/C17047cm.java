package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.google.android.gms.measurement.internal.cm */
final class C17047cm implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final /* synthetic */ C17038cd f48114a;

    private C17047cm(C17038cd cdVar) {
        this.f48114a = cdVar;
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056 A[Catch:{ Exception -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059 A[Catch:{ Exception -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d A[Catch:{ Exception -> 0x00cf }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityCreated(android.app.Activity r8, android.os.Bundle r9) {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.cd r0 = r7.f48114a     // Catch:{ Exception -> 0x00cf }
            com.google.android.gms.measurement.internal.r r0 = r0.mo32854q()     // Catch:{ Exception -> 0x00cf }
            com.google.android.gms.measurement.internal.t r0 = r0.f48453j     // Catch:{ Exception -> 0x00cf }
            java.lang.String r1 = "onActivityCreated"
            r0.mo33376a(r1)     // Catch:{ Exception -> 0x00cf }
            android.content.Intent r0 = r8.getIntent()     // Catch:{ Exception -> 0x00cf }
            if (r0 == 0) goto L_0x00dd
            android.net.Uri r1 = r0.getData()     // Catch:{ Exception -> 0x00cf }
            if (r1 == 0) goto L_0x00dd
            boolean r2 = r1.isHierarchical()     // Catch:{ Exception -> 0x00cf }
            if (r2 == 0) goto L_0x00dd
            r2 = 0
            r3 = 1
            if (r9 != 0) goto L_0x0064
            com.google.android.gms.measurement.internal.cd r4 = r7.f48114a     // Catch:{ Exception -> 0x00cf }
            com.google.android.gms.measurement.internal.em r4 = r4.mo32852o()     // Catch:{ Exception -> 0x00cf }
            android.os.Bundle r4 = r4.mo33137a(r1)     // Catch:{ Exception -> 0x00cf }
            com.google.android.gms.measurement.internal.cd r5 = r7.f48114a     // Catch:{ Exception -> 0x00cf }
            r5.mo32852o()     // Catch:{ Exception -> 0x00cf }
            java.lang.String r5 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r0 = r0.getStringExtra(r5)     // Catch:{ Exception -> 0x00cf }
            java.lang.String r5 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r5 = r5.equals(r0)     // Catch:{ Exception -> 0x00cf }
            if (r5 != 0) goto L_0x0053
            java.lang.String r5 = "https://www.google.com"
            boolean r5 = r5.equals(r0)     // Catch:{ Exception -> 0x00cf }
            if (r5 != 0) goto L_0x0053
            java.lang.String r5 = "android-app://com.google.appcrawler"
            boolean r0 = r5.equals(r0)     // Catch:{ Exception -> 0x00cf }
            if (r0 == 0) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r0 = 0
            goto L_0x0054
        L_0x0053:
            r0 = 1
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = "gs"
            goto L_0x005b
        L_0x0059:
            java.lang.String r0 = "auto"
        L_0x005b:
            if (r4 == 0) goto L_0x0064
            com.google.android.gms.measurement.internal.cd r5 = r7.f48114a     // Catch:{ Exception -> 0x00cf }
            java.lang.String r6 = "_cmp"
            r5.mo32991a(r0, r6, r4)     // Catch:{ Exception -> 0x00cf }
        L_0x0064:
            java.lang.String r0 = "referrer"
            java.lang.String r0 = r1.getQueryParameter(r0)     // Catch:{ Exception -> 0x00cf }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00cf }
            if (r1 == 0) goto L_0x0071
            return
        L_0x0071:
            java.lang.String r1 = "gclid"
            boolean r1 = r0.contains(r1)     // Catch:{ Exception -> 0x00cf }
            if (r1 == 0) goto L_0x00a2
            java.lang.String r1 = "utm_campaign"
            boolean r1 = r0.contains(r1)     // Catch:{ Exception -> 0x00cf }
            if (r1 != 0) goto L_0x00a1
            java.lang.String r1 = "utm_source"
            boolean r1 = r0.contains(r1)     // Catch:{ Exception -> 0x00cf }
            if (r1 != 0) goto L_0x00a1
            java.lang.String r1 = "utm_medium"
            boolean r1 = r0.contains(r1)     // Catch:{ Exception -> 0x00cf }
            if (r1 != 0) goto L_0x00a1
            java.lang.String r1 = "utm_term"
            boolean r1 = r0.contains(r1)     // Catch:{ Exception -> 0x00cf }
            if (r1 != 0) goto L_0x00a1
            java.lang.String r1 = "utm_content"
            boolean r1 = r0.contains(r1)     // Catch:{ Exception -> 0x00cf }
            if (r1 == 0) goto L_0x00a2
        L_0x00a1:
            r2 = 1
        L_0x00a2:
            if (r2 != 0) goto L_0x00b2
            com.google.android.gms.measurement.internal.cd r0 = r7.f48114a     // Catch:{ Exception -> 0x00cf }
            com.google.android.gms.measurement.internal.r r0 = r0.mo32854q()     // Catch:{ Exception -> 0x00cf }
            com.google.android.gms.measurement.internal.t r0 = r0.f48452i     // Catch:{ Exception -> 0x00cf }
            java.lang.String r1 = "Activity created with data 'referrer' param without gclid and at least one utm field"
            r0.mo33376a(r1)     // Catch:{ Exception -> 0x00cf }
            return
        L_0x00b2:
            com.google.android.gms.measurement.internal.cd r1 = r7.f48114a     // Catch:{ Exception -> 0x00cf }
            com.google.android.gms.measurement.internal.r r1 = r1.mo32854q()     // Catch:{ Exception -> 0x00cf }
            com.google.android.gms.measurement.internal.t r1 = r1.f48452i     // Catch:{ Exception -> 0x00cf }
            java.lang.String r2 = "Activity created with referrer"
            r1.mo33377a(r2, r0)     // Catch:{ Exception -> 0x00cf }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00cf }
            if (r1 != 0) goto L_0x00dd
            com.google.android.gms.measurement.internal.cd r1 = r7.f48114a     // Catch:{ Exception -> 0x00cf }
            java.lang.String r2 = "auto"
            java.lang.String r4 = "_ldl"
            r1.mo32994a(r2, r4, r0, r3)     // Catch:{ Exception -> 0x00cf }
            goto L_0x00dd
        L_0x00cf:
            r0 = move-exception
            com.google.android.gms.measurement.internal.cd r1 = r7.f48114a
            com.google.android.gms.measurement.internal.r r1 = r1.mo32854q()
            com.google.android.gms.measurement.internal.t r1 = r1.f48445b
            java.lang.String r2 = "Throwable caught in onActivityCreated"
            r1.mo33377a(r2, r0)
        L_0x00dd:
            com.google.android.gms.measurement.internal.cd r0 = r7.f48114a
            com.google.android.gms.measurement.internal.cq r0 = r0.mo32845h()
            if (r9 == 0) goto L_0x0109
            java.lang.String r1 = "com.google.app_measurement.screen_service"
            android.os.Bundle r9 = r9.getBundle(r1)
            if (r9 == 0) goto L_0x0109
            com.google.android.gms.measurement.internal.cp r1 = new com.google.android.gms.measurement.internal.cp
            java.lang.String r2 = "name"
            java.lang.String r2 = r9.getString(r2)
            java.lang.String r3 = "referrer_name"
            java.lang.String r3 = r9.getString(r3)
            java.lang.String r4 = "id"
            long r4 = r9.getLong(r4)
            r1.<init>(r2, r3, r4)
            java.util.Map<android.app.Activity, com.google.android.gms.measurement.internal.cp> r9 = r0.f48122d
            r9.put(r8, r1)
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C17047cm.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f48114a.mo32845h().f48122d.remove(activity);
    }

    public final void onActivityPaused(Activity activity) {
        C17051cq h = this.f48114a.mo32845h();
        C17050cp a = h.mo33018a(activity);
        h.f48121c = h.f48120b;
        h.f48120b = null;
        h.mo32853p().mo32912a((Runnable) new C17054ct(h, a));
        C17080ds j = this.f48114a.mo32847j();
        j.mo32853p().mo32912a((Runnable) new C17085dx(j, j.mo32849l().mo28524b()));
    }

    public final void onActivityResumed(Activity activity) {
        C17051cq h = this.f48114a.mo32845h();
        h.mo33019a(activity, h.mo33018a(activity), false);
        C16980a d = h.mo32841d();
        d.mo32853p().mo32912a((Runnable) new C17037cc(d, d.mo32849l().mo28524b()));
        C17080ds j = this.f48114a.mo32847j();
        j.mo32853p().mo32912a((Runnable) new C17084dw(j, j.mo32849l().mo28524b()));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C17051cq h = this.f48114a.mo32845h();
        if (bundle != null) {
            C17050cp cpVar = (C17050cp) h.f48122d.get(activity);
            if (cpVar != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("id", cpVar.f48117c);
                bundle2.putString(LeakCanaryFileProvider.f132049i, cpVar.f48115a);
                bundle2.putString("referrer_name", cpVar.f48116b);
                bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
            }
        }
    }

    /* synthetic */ C17047cm(C17038cd cdVar, C17039ce ceVar) {
        this(cdVar);
    }
}
