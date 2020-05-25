package com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a;

import android.content.Intent;
import com.p683ss.android.newmedia.C19547d;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a.g */
public class C26344g extends C26333a {
    /* renamed from: e */
    private final String m63774e() {
        return mo54083d().f69471b.f69503a;
    }

    /* renamed from: a */
    public final boolean mo54084a() {
        boolean z;
        if (m63774e().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return C19547d.m47842a(m63774e());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0213, code lost:
        if (r1 == null) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x02aa, code lost:
        if (r1 == null) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02e2, code lost:
        if (r1 == null) goto L_0x02e4;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo54085b() {
        /*
            r10 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r10.mo54082c()
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity> r2 = com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.class
            r0.<init>(r1, r2)
            java.lang.String r1 = r10.m63774e()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            com.ss.android.ugc.aweme.commercialize.utils.a.a r2 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r2 = r2.f69471b
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f69506d
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x005f
            java.lang.String r1 = r10.m63774e()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            com.ss.android.ugc.aweme.commercialize.utils.a.a r2 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r2 = r2.f69471b
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f69506d
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x003f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x005b
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r1.appendQueryParameter(r5, r4)
            goto L_0x003f
        L_0x005b:
            android.net.Uri r1 = r1.build()
        L_0x005f:
            r0.setData(r1)
            java.lang.String r2 = "launch_mode"
            java.lang.String r1 = r1.getQueryParameter(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r2 = "standard"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x0079
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r1)
        L_0x0079:
            com.ss.android.ugc.aweme.commercialize.utils.a.a r1 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r1 = r1.f69471b
            java.lang.String r1 = r1.f69504b
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            r2 = 0
            if (r1 <= 0) goto L_0x008c
            r1 = 1
            goto L_0x008d
        L_0x008c:
            r1 = 0
        L_0x008d:
            if (r1 == 0) goto L_0x009d
            java.lang.String r1 = "title"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r4 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r4 = r4.f69471b
            java.lang.String r4 = r4.f69504b
            r0.putExtra(r1, r4)
            goto L_0x00a9
        L_0x009d:
            java.lang.String r1 = "title"
            java.lang.String r4 = " "
            r0.putExtra(r1, r4)
            java.lang.String r1 = "use_webview_title"
            r0.putExtra(r1, r3)
        L_0x00a9:
            java.lang.String r1 = "show_report"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r4 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r4 = r4.f69471b
            boolean r4 = r4.f69508f
            r0.putExtra(r1, r4)
            java.lang.String r1 = "bundle_app_ad_from"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r4 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r4 = r4.f69471b
            int r4 = r4.f69515m
            r0.putExtra(r1, r4)
            com.ss.android.ugc.aweme.commercialize.utils.a.a r1 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r1 = r1.f69470a
            long r4 = r1.f69478b
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x0116
            java.lang.String r1 = "ad_id"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r4 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r4 = r4.f69470a
            long r4 = r4.f69478b
            r0.putExtra(r1, r4)
            java.lang.String r1 = "aweme_creative_id"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r4 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r4 = r4.f69470a
            long r4 = r4.f69478b
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r0.putExtra(r1, r4)
            java.lang.String r1 = "ad_type"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r4 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r4 = r4.f69470a
            java.lang.String r4 = r4.f69481e
            m63773a(r0, r1, r4)
            java.lang.String r1 = "ad_system_origin"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r4 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r4 = r4.f69470a
            int r4 = r4.f69482f
            r0.putExtra(r1, r4)
            java.lang.String r1 = "bundle_download_app_log_extra"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r4 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r4 = r4.f69470a
            java.lang.String r4 = r4.f69479c
            m63773a(r0, r1, r4)
        L_0x0116:
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r4 = "SharePrefCache.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            com.ss.android.ugc.aweme.app.bf r1 = r1.getJsActlogUrl()
            java.lang.String r4 = "SharePrefCache.inst().jsActlogUrl"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            java.lang.Object r1 = r1.mo47782d()
            java.lang.String r1 = (java.lang.String) r1
            r4 = 0
            if (r1 == 0) goto L_0x0148
            r5 = r1
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x013c
            r5 = 1
            goto L_0x013d
        L_0x013c:
            r5 = 0
        L_0x013d:
            if (r5 == 0) goto L_0x0140
            goto L_0x0141
        L_0x0140:
            r1 = r4
        L_0x0141:
            if (r1 == 0) goto L_0x0148
            java.lang.String r5 = "ad_js_url"
            r0.putExtra(r5, r1)
        L_0x0148:
            java.lang.String r1 = "bundle_disable_download_dialog"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r5 = r5.f69475f
            boolean r5 = r5.f69486d
            r0.putExtra(r1, r5)
            com.ss.android.ugc.aweme.commercialize.utils.a.a r1 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r1 = r1.f69475f
            java.lang.String r1 = r1.f69483a
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0167
            r1 = 1
            goto L_0x0168
        L_0x0167:
            r1 = 0
        L_0x0168:
            if (r1 == 0) goto L_0x01f9
            java.lang.String r1 = "bundle_download_url"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r5 = r5.f69475f
            java.lang.String r5 = r5.f69483a
            r0.putExtra(r1, r5)
            java.lang.String r1 = "aweme_package_name"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r5 = r5.f69475f
            java.lang.String r5 = r5.f69484b
            m63773a(r0, r1, r5)
            java.lang.String r1 = "bundle_is_from_app_ad"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r5 = r5.f69475f
            boolean r5 = r5.f69487e
            r0.putExtra(r1, r5)
            java.lang.String r1 = "bundle_ad_quick_app_url"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r5 = r5.f69475f
            java.lang.String r5 = r5.f69485c
            m63773a(r0, r1, r5)
            java.lang.String r1 = "bundle_download_app_name"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r5 = r5.f69475f
            java.lang.String r5 = r5.f69488f
            r0.putExtra(r1, r5)
            java.lang.String r1 = "bundle_download_mode"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r5 = r5.f69475f
            int r5 = r5.f69489g
            r0.putExtra(r1, r5)
            java.lang.String r1 = "bundle_link_mode"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r5 = r5.f69475f
            int r5 = r5.f69490h
            r0.putExtra(r1, r5)
            java.lang.String r1 = "bundle_support_multiple_download"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r5 = r5.f69475f
            boolean r5 = r5.f69491i
            r0.putExtra(r1, r5)
            java.lang.String r1 = "bundle_web_url"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r5 = r5.f69475f
            java.lang.String r5 = r5.f69492j
            r0.putExtra(r1, r5)
            java.lang.String r1 = "bundle_web_title"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r5 = r5.f69475f
            java.lang.String r5 = r5.f69493k
            r0.putExtra(r1, r5)
            java.lang.String r1 = "bundle_open_url"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r5 = r5.f69475f
            java.lang.String r5 = r5.f69494l
            r0.putExtra(r1, r5)
        L_0x01f9:
            android.content.Context r1 = r10.mo54082c()
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r5 = r5.f69470a
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r5.f69477a
            java.lang.String r8 = ""
            org.json.JSONObject r1 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63373m(r1, r5, r8)
            java.lang.String r5 = "aweme_json_extra"
            if (r1 == 0) goto L_0x0215
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto L_0x0217
        L_0x0215:
            java.lang.String r1 = ""
        L_0x0217:
            r0.putExtra(r5, r1)
            com.ss.android.ugc.aweme.commercialize.utils.a.a r1 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r1 = r1.f69470a
            long r8 = r1.f69480d
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r5 = r1
            java.lang.Number r5 = (java.lang.Number) r5
            long r8 = r5.longValue()
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0232
            r2 = 1
        L_0x0232:
            if (r2 == 0) goto L_0x0235
            goto L_0x0236
        L_0x0235:
            r1 = r4
        L_0x0236:
            if (r1 == 0) goto L_0x0243
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            java.lang.String r3 = "group_id"
            r0.putExtra(r3, r1)
        L_0x0243:
            com.ss.android.ugc.aweme.commercialize.utils.a.a r1 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r1 = r1.f69471b
            java.lang.Integer r1 = r1.f69509g
            if (r1 == 0) goto L_0x0258
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.String r2 = "bundle_webview_background"
            r0.putExtra(r2, r1)
        L_0x0258:
            java.lang.String r1 = "aweme_id"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r2 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r2 = r2.f69470a
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f69477a
            if (r2 == 0) goto L_0x0269
            java.lang.String r2 = r2.getAid()
            goto L_0x026a
        L_0x0269:
            r2 = r4
        L_0x026a:
            r0.putExtra(r1, r2)
            java.lang.String r1 = "owner_id"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r2 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r2 = r2.f69470a
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f69477a
            if (r2 == 0) goto L_0x027e
            java.lang.String r2 = r2.getAuthorUid()
            goto L_0x027f
        L_0x027e:
            r2 = r4
        L_0x027f:
            r0.putExtra(r1, r2)
            java.lang.String r1 = "bundle_forbidden_jump"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r2 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r2 = r2.f69471b
            boolean r2 = r2.f69510h
            r0.putExtra(r1, r2)
            java.lang.String r1 = "use_ordinary_web"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r2 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r2 = r2.f69471b
            boolean r2 = r2.f69507e
            r0.putExtra(r1, r2)
            com.ss.android.ugc.aweme.commercialize.utils.a.a r1 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r1 = r1.f69471b
            com.ss.android.ugc.aweme.commercialize.feed.d.d r1 = r1.f69511i
            if (r1 == 0) goto L_0x02ac
            java.lang.String r1 = r1.getSiteId()
            if (r1 != 0) goto L_0x02ae
        L_0x02ac:
            java.lang.String r1 = ""
        L_0x02ae:
            com.ss.android.ugc.aweme.ad.services.IAdService r2 = com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl.createIAdServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.ad.services.IAdService r2 = (com.p683ss.android.ugc.aweme.p1308ad.services.IAdService) r2
            if (r2 == 0) goto L_0x02e4
            com.ss.android.ugc.aweme.ad.f.b r2 = r2.getAdLandPagePreloadService()
            if (r2 == 0) goto L_0x02e4
            com.ss.android.ugc.aweme.commercialize.utils.a.a r3 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r3 = r3.f69470a
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f69477a
            if (r3 == 0) goto L_0x02d0
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            if (r3 == 0) goto L_0x02d0
            java.lang.Long r4 = r3.getAdId()
        L_0x02d0:
            com.ss.android.ugc.aweme.commercialize.utils.a.a r3 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r3 = r3.f69470a
            long r5 = r3.f69478b
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            java.lang.String r5 = "feed"
            java.lang.String r1 = r2.mo46652a(r1, r4, r3, r5)
            if (r1 != 0) goto L_0x02e6
        L_0x02e4:
            java.lang.String r1 = ""
        L_0x02e6:
            java.lang.String r2 = "preload_channel_name"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "preload_web_status"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r2 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r2 = r2.f69471b
            int r2 = r2.f69512j
            r0.putExtra(r1, r2)
            java.lang.String r1 = "preload_is_web_url"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r2 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r2 = r2.f69471b
            int r2 = r2.f69513k
            r0.putExtra(r1, r2)
            java.lang.String r1 = "web_type"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r2 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r2 = r2.f69471b
            int r2 = r2.f69514l
            r0.putExtra(r1, r2)
            java.lang.String r1 = "user_click_time"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r2 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r2 = r2.f69471b
            long r2 = r2.f69516n
            r0.putExtra(r1, r2)
            com.ss.android.ugc.aweme.commercialize.utils.a.a r1 = r10.mo54083d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r1 = r1.f69470a
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.f69477a
            com.p683ss.android.ugc.aweme.commercialize.utils.C26415ba.m63877a(r1)
            android.content.Context r1 = r10.mo54082c()
            boolean r0 = m63755a(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a.C26344g.mo54085b():boolean");
    }

    /* renamed from: a */
    private static void m63773a(Intent intent, String str, String str2) {
        boolean z;
        if (str2 != null) {
            if (str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                intent.putExtra(str, str2);
            }
        }
    }
}
