package com.p683ss.android.ugc.aweme.report;

import android.net.Uri.Builder;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.language.I18nManagerService;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.report.a */
public final class C41201a {

    /* renamed from: a */
    public static final C41201a f104640a = new C41201a();

    private C41201a() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0033, code lost:
        if (r3 == null) goto L_0x0035;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.HashMap<java.lang.String, java.lang.String> m90896a(com.p683ss.android.ugc.aweme.feed.model.Aweme r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            java.lang.String r0 = "from"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "enter_from"
            r0.put(r1, r4)
            java.lang.String r4 = "author_id"
            java.lang.String r1 = r3.getAuthorUid()
            r0.put(r4, r1)
            java.lang.String r4 = "group_id"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            if (r3 == 0) goto L_0x0035
            java.lang.Long r3 = r3.getGroupId()
            if (r3 == 0) goto L_0x0035
            long r1 = r3.longValue()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            if (r3 != 0) goto L_0x0037
        L_0x0035:
            java.lang.String r3 = ""
        L_0x0037:
            r0.put(r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.report.C41201a.m90896a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):java.util.HashMap");
    }

    /* renamed from: a */
    public static final Builder m90895a(Aweme aweme, String str, String str2) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "reportFrom");
        C52711k.m112240b(str2, "reportType");
        return m90893a(new Builder(), aweme, str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        if (r3 == null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        if (r3 == null) goto L_0x003e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.net.Uri.Builder m90893a(android.net.Uri.Builder r5, com.p683ss.android.ugc.aweme.feed.model.Aweme r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "builder"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            java.lang.String r0 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            java.lang.String r0 = "reportFrom"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            java.lang.String r0 = "reportType"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = r0
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "log_extra"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r6.getAwemeRawAd()
            if (r3 == 0) goto L_0x003e
            java.lang.String r3 = r3.getLogExtra()
            if (r3 == 0) goto L_0x003e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r6.getAwemeRawAd()
            if (r3 != 0) goto L_0x0033
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0033:
            java.lang.String r4 = "aweme.awemeRawAd!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            java.lang.String r3 = r3.getLogExtra()
            if (r3 != 0) goto L_0x0040
        L_0x003e:
            java.lang.String r3 = ""
        L_0x0040:
            r1.put(r2, r3)
            java.lang.String r2 = "cid"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r6.getAwemeRawAd()
            if (r3 == 0) goto L_0x0051
            java.lang.String r3 = r3.getCreativeIdStr()
            if (r3 != 0) goto L_0x0053
        L_0x0051:
            java.lang.String r3 = ""
        L_0x0053:
            r1.put(r2, r3)
            com.google.gson.f r1 = new com.google.gson.f
            r1.<init>()
            java.lang.String r0 = r1.mo34889b(r0)
            java.lang.String r1 = "Gson().toJson(extraMap)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.net.Uri$Builder r5 = m90894a(r5, r6, r7, r8, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.report.C41201a.m90893a(android.net.Uri$Builder, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String):android.net.Uri$Builder");
    }

    /* renamed from: a */
    public static final Builder m90894a(Builder builder, Aweme aweme, String str, String str2, String str3) {
        Long l;
        int i;
        C52711k.m112240b(builder, "builder");
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "reportFrom");
        C52711k.m112240b(str2, "reportType");
        C52711k.m112240b(str3, "extra");
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        Builder appendQueryParameter = builder.appendQueryParameter("report_type", str2).appendQueryParameter("item_id", aweme.getAid()).appendQueryParameter("owner_id", aweme.getAuthorUid()).appendQueryParameter("user_id", g.getCurUserId());
        String str4 = "group_id";
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            l = awemeRawAd.getGroupId();
        } else {
            l = null;
        }
        I18nManagerService createI18nManagerServicebyMonsterPlugin = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin();
        C52711k.m112236a((Object) createI18nManagerServicebyMonsterPlugin, "ServiceManager.get().get…nagerService::class.java)");
        Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter(str4, String.valueOf(l)).appendQueryParameter("report_from", str).appendQueryParameter("app_language", createI18nManagerServicebyMonsterPlugin.getAppLanguage()).appendQueryParameter("extra", str3).appendQueryParameter("app_name", C11010c.m22283d()).appendQueryParameter("device_id", AppLog.getServerDeviceId()).appendQueryParameter("platform", "android").appendQueryParameter(C42311c.f106863g, C11010c.m22288i()).appendQueryParameter("install_id", AppLog.getInstallId());
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null) {
            i = awemeRawAd2.getReportAdType();
        } else {
            i = 0;
        }
        if (i != 0) {
            builder.appendQueryParameter("report_ad_type", String.valueOf(i));
        }
        C52711k.m112236a((Object) appendQueryParameter2, "builder\n                …      }\n                }");
        return appendQueryParameter2;
    }
}
