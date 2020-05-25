package com.p683ss.android.ugc.aweme.legoImp.task;

import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer */
public class InitAppsFlyer implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.MAIN;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d7 A[Catch:{ Exception -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e8 A[Catch:{ Exception -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0045 A[SYNTHETIC, Splitter:B:7:0x0045] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run(android.content.Context r8) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.an.a r0 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
            java.lang.String r1 = "method_app_flyer_duration"
            r2 = 0
            r0.mo46917a(r1, r2)
            long r0 = android.os.SystemClock.uptimeMillis()
            com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer$1 r3 = new com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer$1
            r3.<init>(r0)
            java.lang.String r0 = "preinsatll_appflyer"
            android.content.SharedPreferences r0 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r8, r0, r2)
            if (r0 == 0) goto L_0x0042
            java.lang.String r1 = "preinsatll_channel"
            java.lang.String r4 = ""
            java.lang.String r1 = r0.getString(r1, r4)
            java.lang.String r4 = "preinsatll_campaign"
            java.lang.String r5 = ""
            java.lang.String r4 = r0.getString(r4, r5)
            java.lang.String r5 = "preinsatll_site_id"
            java.lang.String r6 = ""
            java.lang.String r0 = r0.getString(r5, r6)
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x0042
            com.appsflyer.AppsFlyerLib r5 = com.appsflyer.AppsFlyerLib.getInstance()
            r5.setPreinstallAttribution(r1, r4, r0)
            r0 = 1
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            if (r0 != 0) goto L_0x00b9
            android.content.pm.PackageManager r0 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00b9 }
            java.lang.String r1 = r8.getPackageName()     // Catch:{ NameNotFoundException -> 0x00b9 }
            android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ NameNotFoundException -> 0x00b9 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x00b9 }
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch:{ NameNotFoundException -> 0x00b9 }
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x006a
            android.content.pm.ApplicationInfo r4 = com.p683ss.android.ugc.aweme.lancet.p1151a.C18970b.f52271a     // Catch:{ NameNotFoundException -> 0x00b9 }
            if (r4 != 0) goto L_0x0067
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r5)     // Catch:{ NameNotFoundException -> 0x00b9 }
            com.p683ss.android.ugc.aweme.lancet.p1151a.C18970b.f52271a = r0     // Catch:{ NameNotFoundException -> 0x00b9 }
        L_0x0067:
            android.content.pm.ApplicationInfo r0 = com.p683ss.android.ugc.aweme.lancet.p1151a.C18970b.f52271a     // Catch:{ NameNotFoundException -> 0x00b9 }
            goto L_0x006e
        L_0x006a:
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r5)     // Catch:{ NameNotFoundException -> 0x00b9 }
        L_0x006e:
            android.os.Bundle r1 = r0.metaData     // Catch:{ NameNotFoundException -> 0x00b9 }
            java.lang.String r4 = "AF_PRE_INSTALL_NAME"
            java.lang.String r1 = r1.getString(r4)     // Catch:{ NameNotFoundException -> 0x00b9 }
            android.os.Bundle r4 = r0.metaData     // Catch:{ NameNotFoundException -> 0x00b9 }
            java.lang.String r5 = "AF_PRE_INSTALL_CAMPAIGN"
            java.lang.String r6 = ""
            java.lang.String r4 = r4.getString(r5, r6)     // Catch:{ NameNotFoundException -> 0x00b9 }
            android.os.Bundle r0 = r0.metaData     // Catch:{ NameNotFoundException -> 0x00b9 }
            java.lang.String r5 = "AF_PRE_INSTALL_SITE_ID"
            java.lang.String r6 = ""
            java.lang.String r0 = r0.getString(r5, r6)     // Catch:{ NameNotFoundException -> 0x00b9 }
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ NameNotFoundException -> 0x00b9 }
            if (r5 != 0) goto L_0x00a4
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ NameNotFoundException -> 0x00b9 }
            if (r5 == 0) goto L_0x009c
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch:{ NameNotFoundException -> 0x00b9 }
            if (r5 != 0) goto L_0x00a4
        L_0x009c:
            com.appsflyer.AppsFlyerLib r5 = com.appsflyer.AppsFlyerLib.getInstance()     // Catch:{ NameNotFoundException -> 0x00b9 }
            r5.setPreinstallAttribution(r1, r4, r0)     // Catch:{ NameNotFoundException -> 0x00b9 }
            goto L_0x00b9
        L_0x00a4:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ NameNotFoundException -> 0x00b9 }
            if (r0 != 0) goto L_0x00b9
            java.lang.String r0 = "googleplay"
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch:{ NameNotFoundException -> 0x00b9 }
            if (r0 != 0) goto L_0x00b9
            com.appsflyer.AppsFlyerLib r0 = com.appsflyer.AppsFlyerLib.getInstance()     // Catch:{ NameNotFoundException -> 0x00b9 }
            r0.setOutOfStore(r1)     // Catch:{ NameNotFoundException -> 0x00b9 }
        L_0x00b9:
            com.appsflyer.AppsFlyerLib r0 = com.appsflyer.AppsFlyerLib.getInstance()
            java.lang.String r1 = "wiMmKJ9xudwzNqJW6HoM2g"
            r0.init(r1, r3, r8)
            com.appsflyer.AppsFlyerLib r0 = com.appsflyer.AppsFlyerLib.getInstance()     // Catch:{ Exception -> 0x00fc }
            r0.setCollectIMEI(r2)     // Catch:{ Exception -> 0x00fc }
            android.content.ContentResolver r0 = r8.getContentResolver()     // Catch:{ Exception -> 0x00fc }
            java.lang.String r1 = "android_id"
            java.lang.String r3 = "android_id"
            boolean r3 = android.text.TextUtils.equals(r1, r3)     // Catch:{ Exception -> 0x00fc }
            if (r3 == 0) goto L_0x00e8
            java.lang.String r3 = com.p683ss.android.ugc.aweme.lancet.p1151a.C18969a.f52270a     // Catch:{ Exception -> 0x00fc }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x00fc }
            if (r3 == 0) goto L_0x00e5
            java.lang.String r0 = android.provider.Settings.System.getString(r0, r1)     // Catch:{ Exception -> 0x00fc }
            com.p683ss.android.ugc.aweme.lancet.p1151a.C18969a.f52270a = r0     // Catch:{ Exception -> 0x00fc }
        L_0x00e5:
            java.lang.String r0 = com.p683ss.android.ugc.aweme.lancet.p1151a.C18969a.f52270a     // Catch:{ Exception -> 0x00fc }
            goto L_0x00ec
        L_0x00e8:
            java.lang.String r0 = android.provider.Settings.System.getString(r0, r1)     // Catch:{ Exception -> 0x00fc }
        L_0x00ec:
            com.appsflyer.AppsFlyerLib r1 = com.appsflyer.AppsFlyerLib.getInstance()     // Catch:{ Exception -> 0x00fc }
            r1.setAndroidIdData(r0)     // Catch:{ Exception -> 0x00fc }
            com.appsflyer.AppsFlyerLib r0 = com.appsflyer.AppsFlyerLib.getInstance()     // Catch:{ Exception -> 0x00fc }
            android.app.Application r8 = (android.app.Application) r8     // Catch:{ Exception -> 0x00fc }
            r0.startTracking(r8)     // Catch:{ Exception -> 0x00fc }
        L_0x00fc:
            com.ss.android.ugc.aweme.an.a r8 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
            java.lang.String r0 = "method_app_flyer_duration"
            r8.mo46921b(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.legoImp.task.InitAppsFlyer.run(android.content.Context):void");
    }
}
