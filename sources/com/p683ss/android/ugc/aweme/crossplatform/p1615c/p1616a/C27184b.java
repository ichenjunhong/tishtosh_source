package com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.newmedia.eplatform.C19550a;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.abtest.AppendComParamSetting;
import com.p683ss.android.ugc.aweme.crossplatform.base.C27148b;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.C27181a;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.C27192b;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.C27193c;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.C27195d;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.C27196e;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.C27197f;
import com.p683ss.android.ugc.aweme.ttwebview.C47367a;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.c.a.b */
final class C27184b extends C27182a {

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.c.a.b$a */
    static final class C27185a {

        /* renamed from: a */
        public C27181a f71723a;

        /* renamed from: b */
        public C27195d f71724b;

        /* renamed from: c */
        public C27196e f71725c;

        /* renamed from: d */
        public C27197f f71726d;

        /* renamed from: e */
        public C27192b f71727e;

        C27185a() {
        }

        /* renamed from: a */
        public final C27182a mo55535a() {
            C27182a aVar = new C27182a();
            aVar.f71718a = this.f71723a;
            aVar.f71720c = this.f71724b;
            aVar.f71721d = this.f71725c;
            aVar.f71722e = this.f71726d;
            aVar.f71719b = this.f71727e;
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.c.a.b$b */
    public static final class C27186b {
        /* renamed from: a */
        public static C27182a m65608a(Bundle bundle) {
            C27185a aVar = new C27185a();
            aVar.f71723a = m65612b(bundle);
            if (aVar.f71723a.f71704a.intValue() == 2) {
                aVar.f71724b = m65614c(bundle);
            }
            aVar.f71727e = m65613b(bundle, aVar.f71723a);
            aVar.f71725c = m65615c(bundle, aVar.f71723a);
            aVar.f71726d = m65609a(bundle, aVar.f71723a);
            return aVar.mo55535a();
        }

        /* renamed from: b */
        private static C27181a m65612b(Bundle bundle) {
            int i;
            String str;
            boolean z;
            C27181a aVar = new C27181a();
            if (!TextUtils.isEmpty(bundle.getString("rn_schema"))) {
                i = 2;
            } else {
                i = 1;
            }
            aVar.f71704a = Integer.valueOf(i);
            aVar.f71705b = bundle;
            String a = m65610a(bundle.getString("url"), bundle);
            if (TextUtils.isEmpty(a)) {
                str = "";
            } else {
                str = a.trim();
            }
            aVar.f71706c = str;
            Uri parse = Uri.parse(aVar.f71706c);
            aVar.f71707d = bundle.getBoolean("safeTemplate", false);
            if (aVar.f71707d && parse.isHierarchical()) {
                String decode = Uri.decode(parse.getQueryParameter("target"));
                if (!TextUtils.isEmpty(decode)) {
                    Builder buildUpon = parse.buildUpon();
                    Uri parse2 = Uri.parse(decode);
                    Set<String> queryParameterNames = parse2.getQueryParameterNames();
                    if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                        for (String str2 : queryParameterNames) {
                            if (!"target".equals(str2)) {
                                buildUpon.appendQueryParameter(str2, parse2.getQueryParameter(str2));
                            }
                        }
                    }
                    aVar.f71706c = buildUpon.build().toString();
                }
            }
            if (parse.isHierarchical()) {
                z = C27148b.m65497a(parse.getQueryParameter("auto_play_bgm"));
            } else {
                z = false;
            }
            aVar.f71710g = bundle.getBoolean("bundle_auto_play_audio", z);
            aVar.f71708e = C27148b.m65489a(C27148b.m65500b(aVar.f71706c), bundle, "group_id");
            aVar.f71709f = bundle.getString("enter_from");
            aVar.f71712i = bundle.getBoolean("from_notification", false);
            aVar.f71713j = bundle.getString("aweme_id", "");
            aVar.f71714k = bundle.getBoolean("control_request_url", false);
            if (parse.isHierarchical()) {
                aVar.f71715l = C27148b.m65497a(parse.getQueryParameter("no_hw"));
            }
            if (!aVar.f71715l) {
                aVar.f71715l = false;
            }
            aVar.mo55531a(bundle.getString("owner_id", ""));
            aVar.f71717n = C27148b.m65497a(parse.getQueryParameter("hide_system_video_poster"));
            return aVar;
        }

        /* renamed from: c */
        private static C27195d m65614c(Bundle bundle) {
            String str;
            C27195d dVar = new C27195d();
            dVar.f71774a = bundle.getString("channel_name");
            dVar.f71776c = bundle.getString("bundle_name");
            dVar.f71778e = bundle.getString("module_name");
            String string = bundle.getString("force_h5");
            if (string == null) {
                string = "0";
            }
            dVar.f71779f = string;
            dVar.f71780g = bundle.getString("fallback_url");
            dVar.f71781h = bundle.getString("dev");
            String string2 = PreferenceManager.getDefaultSharedPreferences(C11010c.m22280a()).getString("rn_setting_bundle_url", "");
            if (string2 == null || string2.isEmpty()) {
                string2 = bundle.getString("rn_bundle_url");
            }
            dVar.f71782i = string2;
            dVar.f71783j = bundle.getString("rn_schema");
            String string3 = bundle.getString("dynamic");
            dVar.f71784k = TextUtils.equals(string3, "1");
            try {
                C27193c parse = C27193c.parse(Integer.parseInt(string3));
                C52711k.m112240b(parse, "<set-?>");
                dVar.f71785l = parse;
            } catch (NumberFormatException unused) {
            }
            dVar.f71777d = bundle.getString("bundle");
            dVar.f71775b = bundle.getString("channel");
            dVar.f71787n = TextUtils.equals(bundle.getString("need_share_bridge"), "1");
            dVar.f71788o = bundle.getString("hybrid_report_source");
            String string4 = bundle.getString("a_surl");
            if (!TextUtils.isEmpty(string4)) {
                dVar.f71786m = string4;
            } else {
                Map map = (Map) ((C27188d) C27188d.f71731c.getValue()).f71733b.getValue();
                if (!TextUtils.isEmpty(dVar.f71775b)) {
                    str = dVar.f71775b;
                    if (str == null) {
                        C52711k.m112234a();
                    }
                } else {
                    str = dVar.f71774a;
                    if (!TextUtils.isEmpty(str)) {
                        if (str == null) {
                            C52711k.m112234a();
                        }
                        if (!C52830p.m112413c(str, "_android", false, 2, null)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append("_android");
                            str = sb.toString();
                        }
                    }
                }
                if (map != null && !TextUtils.isEmpty(str) && map.containsKey(str)) {
                    dVar.f71786m = (String) map.get(str);
                }
            }
            return dVar;
        }

        /* renamed from: a */
        private static C27197f m65609a(Bundle bundle, C27181a aVar) {
            Uri uri;
            C27197f fVar = new C27197f();
            fVar.f71821a = bundle.getString("load_no_cache");
            fVar.f71823c = bundle.getString("resso_key");
            String str = aVar.f71706c;
            if (!TextUtils.isEmpty(str)) {
                uri = Uri.parse(str);
            } else {
                uri = null;
            }
            if (uri != null && !uri.isOpaque() && TextUtils.equals(uri.getQueryParameter("is_view_only"), "1")) {
                fVar.f71822b = true;
            }
            return fVar;
        }

        /* renamed from: a */
        private static String m65610a(String str, Bundle bundle) {
            boolean z;
            if (str == null) {
                return null;
            }
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return str;
            }
            if (!parse.isHierarchical() || (!TextUtils.equals("1", parse.getQueryParameter("append_common_params")) && !TextUtils.equals("1", bundle.getString("add_common")))) {
                z = false;
            } else {
                z = true;
            }
            boolean z2 = bundle.getBoolean("safeTemplate", false);
            if (z) {
                m65611a(parse, z2);
                if (!C10193n.m20607a().mo18204a(AppendComParamSetting.class, "awewebview_append_common_params_enabled", C10181b.m20511a().mo18175c().getAwewebviewAppendCommonParamsEnabled(), true)) {
                    return str;
                }
            } else if (z2) {
                try {
                    Uri parse2 = Uri.parse(Uri.decode(parse.getQueryParameter("target")));
                    if (TextUtils.equals("1", parse2.getQueryParameter("append_common_params"))) {
                        m65611a(parse2, true);
                    }
                } catch (Exception unused) {
                }
            }
            StringBuilder sb = new StringBuilder(str);
            if (z) {
                AppLog.appendCommonParams(sb, false);
            }
            return sb.toString();
        }

        /* renamed from: a */
        private static void m65611a(Uri uri, boolean z) {
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("url", uri.toString());
                hashMap.put("host", uri.getHost());
            } catch (Exception unused) {
            }
            if (!hashMap.containsKey("url")) {
                hashMap.put("url", uri.toString());
            }
            hashMap.put("is_sec_url_wrapped", String.valueOf(z ? 1 : 0));
            C26890h.m65011a("awewebview_append_common_params", (Map<String, String>) hashMap);
        }

        /* renamed from: b */
        private static C27192b m65613b(Bundle bundle, C27181a aVar) {
            Uri uri;
            boolean z;
            boolean z2;
            String str = aVar.f71706c;
            if (!TextUtils.isEmpty(str)) {
                uri = Uri.parse(str);
            } else {
                uri = null;
            }
            C27192b bVar = new C27192b();
            Bundle bundle2 = bundle;
            bVar.f71741E = (String) C27148b.m65484a(uri, "commerce_enter_from", bundle2, "commerce_enter_from", String.class, "");
            bVar.f71744H = (String) C27148b.m65484a(uri, "challenge_id", bundle2, "challenge_id", String.class, "");
            bVar.f71746a = bundle.getLong("ad_id", 0);
            if (bVar.f71746a <= 0) {
                Long l = (Long) C27148b.m65486a(uri, "cid", Long.class, Long.valueOf(0));
                Long l2 = (Long) C27148b.m65486a(uri, "ad_id", Long.class, Long.valueOf(0));
                if (l.longValue() > 0) {
                    bVar.f71746a = l.longValue();
                } else if (l2.longValue() > 0) {
                    bVar.f71746a = l2.longValue();
                }
            }
            bVar.f71747b = bundle.getString("ad_type", "");
            bVar.f71748c = bundle.getInt("ad_system_origin", 0);
            bVar.f71749d = bundle.getBoolean("bundle_is_from_app_ad", false);
            bVar.f71737A = bundle.getBoolean("bundle_is_from_comment_app_ad", false);
            bVar.f71750e = bundle.getString("bundle_download_url");
            bVar.f71765t = bundle.getString("bundle_ad_quick_app_url");
            bVar.f71751f = bundle.getString("bundle_download_app_name");
            bVar.f71752g = bundle.getString("aweme_package_name");
            bVar.f71753h = bundle.getString("bundle_download_app_extra");
            bVar.f71754i = (String) C27148b.m65484a(uri, "log_extra", bundle, "bundle_download_app_log_extra", String.class, "");
            bVar.f71739C = bundle.getString("has_ad_info_json");
            bVar.f71740D = bundle.getString("ad_info_json");
            bVar.f71755j = bundle.getString("gd_label");
            bVar.f71756k = bundle.getString("gd_ext_json");
            bVar.f71760o = bundle.getBoolean("bundle_forbidden_jump", false);
            bVar.f71757l = bundle.getBoolean("bundle_disable_download_dialog", true);
            bVar.f71758m = bundle.getString("aweme_creative_id");
            bVar.f71759n = bundle.getBoolean("bundle_show_download_status_bar", true);
            if (bVar.f71746a > 0 || !TextUtils.isEmpty(bVar.f71755j)) {
                z = true;
            } else {
                z = false;
            }
            bVar.f71761p = z;
            String string = bundle.getString("ad_js_url");
            if (bVar.f71746a > 0 && TextUtils.isEmpty(string)) {
                string = (String) SharePrefCache.inst().getJsActlogUrl().mo47782d();
            }
            bVar.f71762q = string;
            bVar.f71763r = bundle.getString("dou_plus_fail_monitor_url");
            if (!bundle.getBoolean("enable_dou_plus_full_process_monitor", false) || !TextUtils.equals("TTWebView", C47367a.m102734a())) {
                z2 = false;
            } else {
                z2 = true;
            }
            bVar.f71764s = z2;
            bVar.f71766u = bundle.getString("preload_channel_name");
            bVar.f71767v = bundle.getInt("preload_web_status");
            bVar.f71768w = bundle.getInt("preload_is_web_url");
            bVar.f71769x = C19550a.m47847a(aVar.f71706c);
            bVar.f71770y = bundle.getInt("web_type");
            bVar.f71771z = bundle.getString("quick_shop_enter_from");
            bVar.f71738B = bundle.getBoolean("enable_web_report", false);
            bVar.f71742F = bundle.getBoolean("bundle_enable_open_browser_to_download_apk", false);
            bVar.f71743G = bundle.getBoolean("bundle_enable_card_preload", true);
            bVar.f71745I = bundle.getLong("user_click_time", 0);
            return bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00af  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00fa  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00ff  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0125  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0145  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x014a  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static com.p683ss.android.ugc.aweme.crossplatform.p1615c.C27196e m65615c(android.os.Bundle r6, com.p683ss.android.ugc.aweme.crossplatform.p1615c.C27181a r7) {
            /*
                com.ss.android.ugc.aweme.crossplatform.c.e r0 = new com.ss.android.ugc.aweme.crossplatform.c.e
                r0.<init>()
                java.lang.String r1 = r7.f71706c
                android.net.Uri r1 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65500b(r1)
                java.lang.String r2 = "use_ordinary_web"
                r3 = 1
                boolean r2 = r6.getBoolean(r2, r3)
                r4 = 0
                if (r2 != 0) goto L_0x0016
                goto L_0x0029
            L_0x0016:
                if (r1 == 0) goto L_0x002e
                java.lang.String r2 = "immersive_mode"
                java.lang.String r2 = r1.getQueryParameter(r2)
                if (r2 == 0) goto L_0x002b
                java.lang.String r5 = "0"
                boolean r2 = android.text.TextUtils.equals(r2, r5)
                if (r2 == 0) goto L_0x0029
                goto L_0x002b
            L_0x0029:
                r2 = 0
                goto L_0x002c
            L_0x002b:
                r2 = 1
            L_0x002c:
                r0.f71808n = r2
            L_0x002e:
                if (r1 == 0) goto L_0x0038
                java.lang.String r2 = "topbar_type"
                java.lang.String r2 = r1.getQueryParameter(r2)
                r0.f71809o = r2
            L_0x0038:
                java.lang.String r2 = "need_bottom_out"
                boolean r2 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65501b(r1, r6, r2, r4)
                r0.f71806l = r2
                r0.f71815u = r4
                java.lang.String r2 = "bundle_nav_bar_status_padding"
                boolean r2 = r6.getBoolean(r2, r4)
                r0.f71810p = r2
                java.lang.String r2 = "full_screen_show_nav_bar"
                boolean r2 = r6.getBoolean(r2, r4)
                r0.f71793E = r2
                java.lang.String r2 = "full_screen_nav_bar_top_margin"
                r5 = -1
                int r2 = r6.getInt(r2, r5)
                r0.f71794F = r2
                java.lang.String r2 = "hide_more"
                boolean r2 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65493a(r1, r6, r2, r3)
                r0.f71797c = r2
                java.lang.String r7 = r7.f71706c
                android.net.Uri r7 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65500b(r7)
                java.lang.String r2 = "nav_btn_type"
                int r7 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65499b(r7, r6, r2)
                r0.f71790B = r7
                java.lang.String r7 = "show_report"
                boolean r7 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65493a(r1, r6, r7, r4)
                r0.f71798d = r7
                java.lang.String r7 = "hide_loading"
                boolean r7 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65493a(r1, r6, r7, r4)
                if (r7 != 0) goto L_0x0089
                java.lang.String r7 = "show_load_dialog"
                boolean r7 = r6.getBoolean(r7, r3)
                if (r7 != 0) goto L_0x008b
            L_0x0089:
                r0.f71789A = r4
            L_0x008b:
                java.lang.String r7 = "forbidden_anim"
                java.lang.String r7 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65489a(r1, r6, r7)
                java.lang.String r2 = "1"
                boolean r7 = android.text.TextUtils.equals(r7, r2)
                r0.f71795a = r7
                boolean r7 = r0.f71795a
                if (r7 == 0) goto L_0x009f
                r0.f71789A = r4
            L_0x009f:
                java.lang.String r7 = "title"
                java.lang.String r7 = r6.getString(r7)
                r0.f71799e = r7
                java.lang.String r7 = r0.f71799e
                boolean r7 = android.text.TextUtils.isEmpty(r7)
                if (r7 == 0) goto L_0x00b7
                java.lang.String r7 = "bundle_web_title"
                java.lang.String r7 = r6.getString(r7)
                r0.f71799e = r7
            L_0x00b7:
                java.lang.String r7 = r0.f71799e
                boolean r7 = android.text.TextUtils.isEmpty(r7)
                if (r7 == 0) goto L_0x00c9
                if (r1 == 0) goto L_0x00c9
                java.lang.String r7 = "title"
                java.lang.String r7 = r1.getQueryParameter(r7)
                r0.f71799e = r7
            L_0x00c9:
                java.lang.String r7 = "use_webview_title"
                boolean r7 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65493a(r1, r6, r7, r4)
                r0.f71817w = r7
                java.lang.String r7 = "nav_bar_color"
                int r7 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65502c(r1, r6, r7)
                r0.f71800f = r7
                java.lang.String r7 = "loading_bgcolor"
                int r7 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65502c(r1, r6, r7)
                r0.f71801g = r7
                java.lang.String r7 = "container_bgcolor"
                int r7 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65502c(r1, r6, r7)
                r0.f71807m = r7
                java.lang.String r7 = "title_color"
                int r7 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65502c(r1, r6, r7)
                r0.f71802h = r7
                java.lang.String r7 = "web_type"
                int r7 = r6.getInt(r7)
                r2 = 2
                if (r7 != r3) goto L_0x00ff
                r0.f71819y = r2
                r0.f71818x = r3
                goto L_0x0120
            L_0x00ff:
                if (r1 == 0) goto L_0x0120
                java.lang.String r7 = "disable_pop_gesture"
                java.lang.String r7 = r1.getQueryParameter(r7)
                java.lang.String r5 = "0"
                boolean r5 = android.text.TextUtils.equals(r7, r5)
                if (r5 == 0) goto L_0x0114
                r0.f71819y = r2
                r0.f71818x = r3
                goto L_0x0120
            L_0x0114:
                java.lang.String r2 = "1"
                boolean r7 = android.text.TextUtils.equals(r7, r2)
                if (r7 == 0) goto L_0x0120
                r0.f71819y = r4
                r0.f71818x = r4
            L_0x0120:
                int r7 = r0.f71800f
                r2 = -2
                if (r7 == r2) goto L_0x0129
                int r7 = r0.f71800f
                r0.f71801g = r7
            L_0x0129:
                java.lang.String r7 = "show_closeall"
                boolean r7 = r6.getBoolean(r7, r4)
                r0.f71803i = r7
                java.lang.String r7 = "show_more_button"
                boolean r7 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65493a(r1, r6, r7, r4)
                r0.f71804j = r7
                java.lang.String r7 = "copy_link_action"
                boolean r7 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65493a(r1, r6, r7, r4)
                r0.f71805k = r7
                int r7 = r0.f71801g
                if (r7 == r2) goto L_0x014a
                int r7 = r0.f71801g
                r0.f71820z = r7
                goto L_0x015f
            L_0x014a:
                android.content.Context r7 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                android.content.res.Resources r7 = r7.getResources()
                r2 = 2131821851(0x7f11051b, float:1.9276457E38)
                int r7 = r7.getColor(r2)
                int r7 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65480a(r1, r6, r7)
                r0.f71820z = r7
            L_0x015f:
                java.lang.String r7 = "should_full_screen"
                boolean r7 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65493a(r1, r6, r7, r4)
                r0.f71811q = r7
                java.lang.String r7 = "hide_nav_bar"
                boolean r7 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65493a(r1, r6, r7, r4)
                r0.f71812r = r7
                java.lang.String r7 = "hide_status_bar"
                boolean r7 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65493a(r1, r6, r7, r4)
                r0.f71813s = r7
                java.lang.String r7 = "status_bar_color"
                int r7 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65502c(r1, r6, r7)
                r0.f71814t = r7
                java.lang.String r7 = "status_font_dark"
                boolean r2 = com.p683ss.android.ugc.aweme.crossplatform.C27198d.m65618a()
                boolean r7 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65493a(r1, r6, r7, r2)
                r0.f71796b = r7
                java.lang.String r7 = "show_not_official_content_warning"
                boolean r7 = r6.getBoolean(r7, r4)
                r0.f71816v = r7
                java.lang.String r7 = "webview_progress_bar"
                boolean r7 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65493a(r1, r6, r7, r4)
                r0.f71791C = r7
                java.lang.String r7 = "enable_video_landscape"
                boolean r6 = com.p683ss.android.ugc.aweme.crossplatform.base.C27148b.m65493a(r1, r6, r7, r4)
                r0.f71792D = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27184b.C27186b.m65615c(android.os.Bundle, com.ss.android.ugc.aweme.crossplatform.c.a):com.ss.android.ugc.aweme.crossplatform.c.e");
        }
    }
}
