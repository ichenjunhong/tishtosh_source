package com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.p1583a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.C23057c;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26450a;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26456b;
import com.p683ss.android.ugc.aweme.crossplatform.activity.C27108c;
import com.p683ss.android.ugc.aweme.crossplatform.activity.C27112g;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c.a.a */
public final class C26452a {

    /* renamed from: a */
    public static final C26452a f69729a = new C26452a();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c.a.a$a */
    public static final class C26453a {

        /* renamed from: a */
        public Long f69730a;

        /* renamed from: b */
        public String f69731b;

        /* renamed from: c */
        public String f69732c;

        /* renamed from: d */
        public String f69733d;

        /* renamed from: e */
        public String f69734e;

        /* renamed from: f */
        public String f69735f;

        /* renamed from: g */
        public int f69736g;

        /* renamed from: h */
        public int f69737h;

        public C26453a() {
            this(null, null, null, null, null, null, 0, 0, NormalGiftView.ALPHA_255, null);
        }

        public C26453a(Long l, String str, String str2, String str3, String str4, String str5) {
            this(l, str, str2, str3, str4, str5, 0, 0, 192, null);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C26453a) {
                    C26453a aVar = (C26453a) obj;
                    if (C52711k.m112239a((Object) this.f69730a, (Object) aVar.f69730a) && C52711k.m112239a((Object) this.f69731b, (Object) aVar.f69731b) && C52711k.m112239a((Object) this.f69732c, (Object) aVar.f69732c) && C52711k.m112239a((Object) this.f69733d, (Object) aVar.f69733d) && C52711k.m112239a((Object) this.f69734e, (Object) aVar.f69734e) && C52711k.m112239a((Object) this.f69735f, (Object) aVar.f69735f)) {
                        if (this.f69736g == aVar.f69736g) {
                            if (this.f69737h == aVar.f69737h) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            Long l = this.f69730a;
            int i = 0;
            int hashCode = (l != null ? l.hashCode() : 0) * 31;
            String str = this.f69731b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f69732c;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f69733d;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f69734e;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f69735f;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return ((((hashCode5 + i) * 31) + Integer.hashCode(this.f69736g)) * 31) + Integer.hashCode(this.f69737h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AdWebUrlData(creativeId=");
            sb.append(this.f69730a);
            sb.append(", logExtra=");
            sb.append(this.f69731b);
            sb.append(", downloadUrl=");
            sb.append(this.f69732c);
            sb.append(", packageName=");
            sb.append(this.f69733d);
            sb.append(", appName=");
            sb.append(this.f69734e);
            sb.append(", adType=");
            sb.append(this.f69735f);
            sb.append(", adSystemOrigin=");
            sb.append(this.f69736g);
            sb.append(", appAdFrom=");
            sb.append(this.f69737h);
            sb.append(")");
            return sb.toString();
        }

        private C26453a(Long l, String str, String str2, String str3, String str4, String str5, int i, int i2) {
            this.f69730a = l;
            this.f69731b = str;
            this.f69732c = str2;
            this.f69733d = str3;
            this.f69734e = str4;
            this.f69735f = str5;
            this.f69736g = i;
            this.f69737h = i2;
        }

        public /* synthetic */ C26453a(Long l, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, C52707g gVar) {
            String str6;
            String str7;
            String str8;
            String str9;
            if ((i3 & 1) != 0) {
                l = Long.valueOf(0);
            }
            String str10 = null;
            if ((i3 & 2) != 0) {
                str6 = null;
            } else {
                str6 = str;
            }
            if ((i3 & 4) != 0) {
                str7 = null;
            } else {
                str7 = str2;
            }
            if ((i3 & 8) != 0) {
                str8 = null;
            } else {
                str8 = str3;
            }
            if ((i3 & 16) != 0) {
                str9 = null;
            } else {
                str9 = str4;
            }
            if ((i3 & 32) == 0) {
                str10 = str5;
            }
            this(l, str6, str7, str8, str9, str10, 0, 0);
        }
    }

    private C26452a() {
    }

    /* renamed from: a */
    private static void m63961a(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C27108c.m65416b();
            C27112g gVar = new C27112g(str, "直接跳转打开落地页", null, 4, null);
            C27108c.m65415a(gVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r0 == null) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m63963a(android.content.Context r6, com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd r7, android.os.Bundle r8) {
        /*
            com.ss.android.ugc.aweme.commercialize.utils.p r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26532p.f69867a
            boolean r0 = r0.mo54217a(r7)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            if (r7 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.commercialize.model.w r0 = r7.getNativeSiteConfig()
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = r0.getLynxScheme()
            if (r0 != 0) goto L_0x001a
        L_0x0018:
            java.lang.String r0 = ""
        L_0x001a:
            if (r8 != 0) goto L_0x0021
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
        L_0x0021:
            java.lang.String r2 = "is_lynx_landing_page"
            r3 = 1
            r8.putBoolean(r2, r3)
            java.lang.String r2 = "hide_nav_bar"
            r8.putBoolean(r2, r3)
            java.lang.String r2 = "hide_status_bar"
            r8.putBoolean(r2, r1)
            java.lang.String r2 = "bundle_nav_bar_status_padding"
            r8.putBoolean(r2, r3)
            if (r7 == 0) goto L_0x0043
            com.ss.android.ugc.aweme.commercialize.model.w r2 = r7.getNativeSiteConfig()
            if (r2 == 0) goto L_0x0043
            java.util.List r2 = r2.getGeckoChannel()
            goto L_0x0044
        L_0x0043:
            r2 = 0
        L_0x0044:
            java.lang.String r4 = ""
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L_0x0054
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r5 = 0
            goto L_0x0055
        L_0x0054:
            r5 = 1
        L_0x0055:
            if (r5 != 0) goto L_0x005e
            java.lang.Object r1 = r2.get(r1)
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
        L_0x005e:
            java.lang.String r1 = "lynx_channel_name"
            r8.putString(r1, r4)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = "uri"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            boolean r1 = r0.isHierarchical()
            if (r1 == 0) goto L_0x007d
            java.lang.String r1 = "bundle_origin_url"
            java.lang.String r2 = "fallback_url"
            java.lang.String r2 = r0.getQueryParameter(r2)
            r8.putString(r1, r2)
        L_0x007d:
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r1 = "lynx_landing_page_data"
            com.ss.android.ugc.aweme.commercialize.utils.p r2 = com.p683ss.android.ugc.aweme.commercialize.utils.C26532p.f69867a
            java.lang.String r7 = r2.mo54218b(r7)
            r0.appendQueryParameter(r1, r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "urlBuilder.toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
            java.lang.String r0 = "ad_commerce"
            com.p683ss.android.ugc.aweme.bullet.C24098a.m58975a(r6, r7, r0, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.p1583a.C26452a.m63963a(android.content.Context, com.ss.android.ugc.aweme.feed.model.AwemeRawAd, android.os.Bundle):boolean");
    }

    /* renamed from: a */
    private static boolean m63965a(String str, Context context, Aweme aweme) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aweme, "aweme");
        Uri parse = Uri.parse(str);
        C52711k.m112236a((Object) parse, "uri");
        if (C52711k.m112239a((Object) parse.getScheme(), (Object) "market")) {
            if (!C26456b.m63968a(context)) {
                C26450a.m63952a(context, aweme, str);
                C10691a.m21542b(context, (int) R.string.dm).mo19066a();
            } else if (C26456b.m63969a(context, parse)) {
                C26450a.m63954b(context, aweme, str);
            }
            return true;
        } else if (C26456b.m63971a(parse)) {
            if (!C26456b.m63968a(context)) {
                return false;
            }
            if (C26456b.m63972b(context, parse)) {
                C26450a.m63954b(context, aweme, str);
            }
            return true;
        } else if (C26540w.m64227a(parse)) {
            if (!C26450a.m63957c(context, parse)) {
                return false;
            }
            if (C26450a.m63953a(context, parse)) {
                C26450a.m63954b(context, aweme, str);
            }
            return true;
        } else if (C26450a.m63958d(context, parse)) {
            if (C26450a.m63955b(context, parse)) {
                C26450a.m63954b(context, aweme, str);
            }
            return true;
        } else {
            if (!(!C52711k.m112239a((Object) C23057c.f61423a, (Object) parse.getScheme())) || !(!C52711k.m112239a((Object) C23057c.f61425c, (Object) parse.getScheme()))) {
                C23060d.f61431e.mo47789a(context, str, (String) null);
            } else {
                C26450a.m63952a(context, aweme, str);
            }
            C10691a.m21542b(context, (int) R.string.dm).mo19066a();
            return true;
        }
    }

    /* renamed from: a */
    public static final boolean m63964a(Context context, String str, String str2, boolean z, Map<String, String> map, boolean z2, C26453a aVar) {
        CharSequence charSequence;
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (map != null && (!map.isEmpty())) {
            C18922i iVar = new C18922i(str);
            for (Entry entry : map.entrySet()) {
                iVar.mo38778a((String) entry.getKey(), (String) entry.getValue());
            }
            str = iVar.mo38774a();
        }
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        intent.setData(Uri.parse(str));
        Uri data = intent.getData();
        Integer num = null;
        if (data != null) {
            charSequence = data.getQueryParameter("launch_mode");
        } else {
            charSequence = null;
        }
        if (!TextUtils.equals(charSequence, "standard")) {
            intent.setFlags(268435456);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("title", str2);
        } else {
            intent.putExtra("title", " ");
            intent.putExtra("use_webview_title", true);
        }
        intent.putExtra("hide_nav_bar", z);
        intent.putExtra("bundle_forbidden_jump", true);
        intent.putExtra("use_ordinary_web", z2);
        if (aVar != null) {
            if (!TextUtils.isEmpty(aVar.f69731b)) {
                intent.putExtra("bundle_download_app_log_extra", aVar.f69731b);
            }
            Long l = aVar.f69730a;
            if (l == null || l.longValue() != 0) {
                intent.putExtra("ad_id", aVar.f69730a);
                intent.putExtra("ad_type", aVar.f69735f);
                intent.putExtra("ad_system_origin", aVar.f69736g);
                intent.putExtra("aweme_creative_id", String.valueOf(aVar.f69730a));
            }
            SharePrefCache inst = SharePrefCache.inst();
            C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
            C23051bf jsActlogUrl = inst.getJsActlogUrl();
            C52711k.m112236a((Object) jsActlogUrl, "SharePrefCache.inst().jsActlogUrl");
            String str3 = (String) jsActlogUrl.mo47782d();
            if (!TextUtils.isEmpty(str3)) {
                intent.putExtra("ad_js_url", str3);
            }
            if (!TextUtils.isEmpty(aVar.f69732c)) {
                intent.putExtra("bundle_download_url", aVar.f69732c);
                intent.putExtra("aweme_package_name", aVar.f69733d);
                intent.putExtra("bundle_download_app_name", aVar.f69734e);
                intent.putExtra("bundle_app_ad_from", aVar.f69737h);
                intent.putExtra("bundle_is_from_app_ad", true);
                if (map != null) {
                    String str4 = (String) map.get("aweme_package_name");
                    String str5 = (String) map.get("bundle_app_ad_from");
                    if (str5 != null) {
                        num = Integer.valueOf(Integer.parseInt(str5));
                    }
                    intent.putExtra("bundle_app_ad_from", num);
                    intent.putExtra("aweme_package_name", str4);
                    if (num != null && num.intValue() == 6) {
                        intent.putExtra("bundle_is_from_comment_app_ad", true);
                    }
                }
            }
        }
        m63961a(str);
        return C26540w.m64210a(context, intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02cb, code lost:
        if (r0 == null) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x020a, code lost:
        if (r1 == null) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x029c, code lost:
        if (r0 == null) goto L_0x029e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m63962a(android.content.Context r25, com.p683ss.android.ugc.aweme.feed.model.Aweme r26, java.lang.String r27, java.lang.String r28, boolean r29, boolean r30, int r31, java.lang.Boolean r32) {
        /*
            r0 = r25
            r1 = r26
            r2 = r31
            r3 = 0
            if (r0 != 0) goto L_0x000a
            return r3
        L_0x000a:
            if (r1 != 0) goto L_0x000d
            return r3
        L_0x000d:
            boolean r4 = r26.isAd()
            if (r4 != 0) goto L_0x0014
            return r3
        L_0x0014:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r26.getAwemeRawAd()
            r5 = 1
            if (r27 != 0) goto L_0x0026
            if (r4 != 0) goto L_0x0020
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0020:
            java.lang.String r6 = r4.getWebUrl()
            r7 = 1
            goto L_0x0029
        L_0x0026:
            r6 = r27
            r7 = 0
        L_0x0029:
            if (r6 != 0) goto L_0x002f
            java.lang.String r6 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.m64026g(r26)
        L_0x002f:
            if (r6 != 0) goto L_0x0032
            return r3
        L_0x0032:
            android.net.Uri.parse(r6)
            boolean r8 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.m64022c(r26)
            if (r8 != 0) goto L_0x0041
            boolean r8 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.m64023d(r26)
            if (r8 == 0) goto L_0x0048
        L_0x0041:
            boolean r8 = m63965a(r6, r0, r1)
            if (r8 == 0) goto L_0x0048
            return r5
        L_0x0048:
            if (r28 != 0) goto L_0x0054
            if (r4 != 0) goto L_0x004f
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x004f:
            java.lang.String r8 = r4.getWebTitle()
            goto L_0x0056
        L_0x0054:
            r8 = r28
        L_0x0056:
            if (r4 != 0) goto L_0x005b
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x005b:
            java.lang.Long r9 = r4.getCreativeId()
            java.lang.Long r10 = r4.getGroupId()
            java.lang.String r11 = r4.getLogExtra()
            java.lang.String r12 = r4.getDownloadUrl()
            java.lang.String r13 = ""
            org.json.JSONObject r13 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63373m(r0, r1, r13)
            java.lang.String r14 = r4.getPackageName()
            java.lang.String r15 = r4.getQuickAppUrl()
            r16 = r6
            java.lang.CharSequence r16 = (java.lang.CharSequence) r16
            boolean r16 = android.text.TextUtils.isEmpty(r16)
            if (r16 == 0) goto L_0x0084
            return r3
        L_0x0084:
            if (r30 == 0) goto L_0x0099
            com.ss.android.ugc.aweme.commercialize.utils.p r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26532p.f69867a
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r26.getAwemeRawAd()
            boolean r3 = r3.mo54217a(r5)
            if (r3 == 0) goto L_0x0096
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63363h(r25, r26)
            goto L_0x0099
        L_0x0096:
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63359g(r25, r26)
        L_0x0099:
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity> r5 = com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.class
            r3.<init>(r0, r5)
            android.net.Uri r5 = android.net.Uri.parse(r6)
            r3.setData(r5)
            r5 = r8
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x00b2
            java.lang.String r8 = " "
        L_0x00b2:
            r5 = r8
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x00c1
            java.lang.String r5 = "title"
            r3.putExtra(r5, r8)
            goto L_0x00ce
        L_0x00c1:
            java.lang.String r5 = "title"
            java.lang.String r8 = " "
            r3.putExtra(r5, r8)
            java.lang.String r5 = "use_webview_title"
            r8 = 1
            r3.putExtra(r5, r8)
        L_0x00ce:
            java.lang.String r5 = "show_report"
            boolean r8 = r4.isReportEnable()
            r3.putExtra(r5, r8)
            r5 = r11
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x00e5
            java.lang.String r5 = "bundle_download_app_log_extra"
            r3.putExtra(r5, r11)
        L_0x00e5:
            java.lang.String r5 = "bundle_app_ad_from"
            r3.putExtra(r5, r2)
            r17 = 0
            if (r9 != 0) goto L_0x00ef
            goto L_0x00f7
        L_0x00ef:
            long r19 = r9.longValue()
            int r5 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r5 == 0) goto L_0x0124
        L_0x00f7:
            java.lang.String r5 = "ad_id"
            java.lang.String r8 = "creativeId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r8)
            long r0 = r9.longValue()
            r3.putExtra(r5, r0)
            java.lang.String r0 = "ad_type"
            java.lang.String r1 = r4.getType()
            r3.putExtra(r0, r1)
            java.lang.String r0 = "ad_system_origin"
            int r1 = r4.getSystemOrigin()
            r3.putExtra(r0, r1)
            java.lang.String r0 = "bundle_download_app_extra"
            long r19 = r9.longValue()
            java.lang.String r1 = java.lang.String.valueOf(r19)
            r3.putExtra(r0, r1)
        L_0x0124:
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r1 = "SharePrefCache.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.app.bf r0 = r0.getJsActlogUrl()
            java.lang.String r1 = "SharePrefCache.inst().jsActlogUrl"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.Object r0 = r0.mo47782d()
            java.lang.String r0 = (java.lang.String) r0
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x014a
            java.lang.String r1 = "ad_js_url"
            r3.putExtra(r1, r0)
        L_0x014a:
            java.lang.String r0 = "bundle_disable_download_dialog"
            boolean r1 = r4.isDisableDownloadDialog()
            r3.putExtra(r0, r1)
            r0 = r12
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0202
            java.lang.String r0 = "bundle_is_from_app_ad"
            r1 = 1
            r3.putExtra(r0, r1)
            java.lang.String r0 = "bundle_download_url"
            r3.putExtra(r0, r12)
            java.lang.String r0 = "aweme_package_name"
            r3.putExtra(r0, r14)
            java.lang.String r0 = "bundle_ad_quick_app_url"
            r3.putExtra(r0, r15)
            java.lang.String r0 = "bundle_download_app_name"
            java.lang.String r5 = r4.getAppName()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != r1) goto L_0x0184
            java.lang.String r1 = r4.getWebTitle()
            goto L_0x018a
        L_0x0184:
            if (r5 != 0) goto L_0x01fc
            java.lang.String r1 = r4.getAppName()
        L_0x018a:
            r3.putExtra(r0, r1)
            java.lang.String r0 = "bundle_download_mode"
            int r1 = r4.getDownloadMode()
            r3.putExtra(r0, r1)
            java.lang.String r0 = "bundle_link_mode"
            int r1 = r4.getLinkMode()
            r3.putExtra(r0, r1)
            java.lang.String r0 = "bundle_support_multiple_download"
            boolean r1 = r4.isSupportMultiple()
            r3.putExtra(r0, r1)
            java.lang.String r0 = "bundle_web_url"
            java.lang.String r1 = r4.getWebUrl()
            r3.putExtra(r0, r1)
            java.lang.String r0 = "bundle_web_title"
            java.lang.String r1 = r4.getWebTitle()
            r3.putExtra(r0, r1)
            java.lang.String r0 = r4.getOpenUrl()
            boolean r1 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64141b(r0)
            if (r1 == 0) goto L_0x01f6
            java.lang.String r1 = com.p683ss.android.ugc.aweme.commercialize.p1549b.C25652a.C25653a.f67876a
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            r5 = 5
            if (r2 != r5) goto L_0x01d8
            java.lang.String r2 = "tag"
            java.lang.String r5 = "result_ad"
            r1.appendQueryParameter(r2, r5)
        L_0x01d8:
            java.lang.String r2 = "openUrl"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            java.lang.String r20 = "__back_url__"
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "backUrlBuilder.toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r22 = 0
            r23 = 4
            r24 = 0
            r19 = r0
            r21 = r1
            java.lang.String r0 = p2628d.p2650m.C52830p.m112401a(r19, r20, r21, r22, r23, r24)
        L_0x01f6:
            java.lang.String r1 = "bundle_open_url"
            r3.putExtra(r1, r0)
            goto L_0x0202
        L_0x01fc:
            d.l r0 = new d.l
            r0.<init>()
            throw r0
        L_0x0202:
            java.lang.String r0 = "aweme_json_extra"
            if (r13 == 0) goto L_0x020c
            java.lang.String r1 = r13.toString()
            if (r1 != 0) goto L_0x020e
        L_0x020c:
            java.lang.String r1 = ""
        L_0x020e:
            r3.putExtra(r0, r1)
            if (r10 == 0) goto L_0x0228
            long r0 = r10.longValue()
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x0228
            java.lang.String r0 = "aweme_group_id"
            long r1 = r10.longValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.putExtra(r0, r1)
        L_0x0228:
            long r0 = r9.longValue()
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x023d
            java.lang.String r0 = "aweme_creative_id"
            long r1 = r9.longValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.putExtra(r0, r1)
        L_0x023d:
            r0 = r14
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x024b
            java.lang.String r0 = "aweme_package_name"
            r3.putExtra(r0, r14)
        L_0x024b:
            boolean r0 = r4.isUseDefaultColor()
            if (r0 == 0) goto L_0x0262
            java.lang.String r0 = "bundle_webview_background"
            android.content.res.Resources r1 = r25.getResources()
            r2 = 2131821851(0x7f11051b, float:1.9276457E38)
            int r1 = r1.getColor(r2)
            r3.putExtra(r0, r1)
            goto L_0x0268
        L_0x0262:
            java.lang.String r0 = "bundle_webview_background"
            r1 = -1
            r3.putExtra(r0, r1)
        L_0x0268:
            java.lang.String r0 = "aweme_id"
            java.lang.String r1 = r26.getAid()
            r3.putExtra(r0, r1)
            java.lang.String r0 = "owner_id"
            java.lang.String r1 = r26.getAuthorUid()
            r3.putExtra(r0, r1)
            java.lang.String r0 = "bundle_forbidden_jump"
            r1 = 1
            r3.putExtra(r0, r1)
            java.lang.String r0 = "use_ordinary_web"
            r1 = r29
            r3.putExtra(r0, r1)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r0)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r26.getAwemeRawAd()
            if (r0 == 0) goto L_0x029e
            com.ss.android.ugc.aweme.commercialize.feed.d.d r0 = r0.getPreloadData()
            if (r0 == 0) goto L_0x029e
            java.lang.String r0 = r0.getSiteId()
            if (r0 != 0) goto L_0x02a0
        L_0x029e:
            java.lang.String r0 = ""
        L_0x02a0:
            com.ss.android.ugc.aweme.ad.services.IAdService r1 = com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl.createIAdServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.ad.services.IAdService r1 = (com.p683ss.android.ugc.aweme.p1308ad.services.IAdService) r1
            if (r1 == 0) goto L_0x02cd
            com.ss.android.ugc.aweme.ad.f.b r1 = r1.getAdLandPagePreloadService()
            if (r1 == 0) goto L_0x02cd
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r26.getAwemeRawAd()
            r5 = 0
            if (r2 == 0) goto L_0x02ba
            java.lang.Long r2 = r2.getAdId()
            goto L_0x02bb
        L_0x02ba:
            r2 = r5
        L_0x02bb:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r8 = r26.getAwemeRawAd()
            if (r8 == 0) goto L_0x02c5
            java.lang.Long r5 = r8.getCreativeId()
        L_0x02c5:
            java.lang.String r8 = "feed"
            java.lang.String r0 = r1.mo46652a(r0, r2, r5, r8)
            if (r0 != 0) goto L_0x02cf
        L_0x02cd:
            java.lang.String r0 = ""
        L_0x02cf:
            java.lang.String r1 = "preload_channel_name"
            r3.putExtra(r1, r0)
            int r0 = r4.getPreloadWeb()
            java.lang.String r1 = "preload_web_status"
            r3.putExtra(r1, r0)
            java.lang.String r0 = "preload_is_web_url"
            r3.putExtra(r0, r7)
            java.lang.String r0 = "web_type"
            int r1 = r4.getWebType()
            r3.putExtra(r0, r1)
            java.lang.String r0 = "enable_web_report"
            boolean r1 = r4.isEnableWebReport()
            r3.putExtra(r0, r1)
            java.lang.String r0 = "webview_progress_bar"
            int r1 = r4.getWebviewProgressBar()
            r2 = 1
            if (r1 != r2) goto L_0x02ff
            r1 = 1
            goto L_0x0300
        L_0x02ff:
            r1 = 0
        L_0x0300:
            r3.putExtra(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1 = r32
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r0)
            if (r0 == 0) goto L_0x0317
            java.lang.String r0 = "commerce_enter_from"
            java.lang.String r1 = "splash"
            r3.putExtra(r0, r1)
            goto L_0x031e
        L_0x0317:
            java.lang.String r0 = "commerce_enter_from"
            java.lang.String r1 = "feedad"
            r3.putExtra(r0, r1)
        L_0x031e:
            com.p683ss.android.ugc.aweme.commercialize.utils.C26415ba.m63877a(r26)
            m63961a(r6)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r26.getAwemeRawAd()
            android.os.Bundle r1 = r3.getExtras()
            r2 = r25
            boolean r0 = m63963a(r2, r0, r1)
            if (r0 == 0) goto L_0x0336
            r0 = 1
            return r0
        L_0x0336:
            r0 = 1
            boolean r1 = com.p683ss.android.ugc.aweme.bullet.p1471ab.FeedAdBulletExp.realLandPageEnable()
            if (r1 == 0) goto L_0x0347
            java.lang.String r1 = "ad_commerce"
            android.os.Bundle r3 = r3.getExtras()
            com.p683ss.android.ugc.aweme.bullet.C24098a.m58975a(r2, r6, r1, r3)
            return r0
        L_0x0347:
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64210a(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.p1583a.C26452a.m63962a(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, boolean, boolean, int, java.lang.Boolean):boolean");
    }
}
