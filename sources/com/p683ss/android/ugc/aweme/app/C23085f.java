package com.p683ss.android.ugc.aweme.app;

import android.net.Uri;
import com.bytedance.common.utility.C9431p;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.f */
public final class C23085f {

    /* renamed from: a */
    public static final C23085f f61488a = new C23085f();

    private C23085f() {
    }

    /* renamed from: a */
    public final boolean mo47817a(String str) {
        return m56627a(str, false);
    }

    /* renamed from: b */
    public final boolean mo47818b(String str) {
        C52711k.m112240b(str, "url");
        try {
            Uri parse = Uri.parse(str);
            if (parse == null || !mo47817a(parse.getQueryParameter("hide_more"))) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m56627a(String str, boolean z) {
        if (C9431p.m18664a(str)) {
            return false;
        }
        return C52711k.m112239a((Object) "1", (Object) str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ee A[Catch:{ Exception -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0108 A[Catch:{ Exception -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010f A[Catch:{ Exception -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0116 A[Catch:{ Exception -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011d A[Catch:{ Exception -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012e A[Catch:{ Exception -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0144 A[Catch:{ Exception -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0145 A[Catch:{ Exception -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014c A[Catch:{ Exception -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0152 A[Catch:{ Exception -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x016a A[Catch:{ Exception -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017b A[Catch:{ Exception -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018c A[Catch:{ Exception -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x019d A[Catch:{ Exception -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01d1 A[Catch:{ Exception -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01e2 A[Catch:{ Exception -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01f3 A[Catch:{ Exception -> 0x01fa }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.content.Intent m56626a(android.content.Context r13, android.net.Uri r14) {
        /*
            r0 = 0
            if (r14 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x01fa }
            r1.<init>()     // Catch:{ Exception -> 0x01fa }
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity> r2 = com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.class
            r1.setClass(r13, r2)     // Catch:{ Exception -> 0x01fa }
            java.lang.String r13 = "url"
            java.lang.String r13 = r14.getQueryParameter(r13)     // Catch:{ Exception -> 0x01fa }
            if (r13 == 0) goto L_0x01f9
            r2 = r13
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x01fa }
            int r2 = r2.length()     // Catch:{ Exception -> 0x01fa }
            r3 = 0
            r4 = 1
            if (r2 <= 0) goto L_0x0023
            r2 = 1
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            if (r2 == r4) goto L_0x0028
            goto L_0x01f9
        L_0x0028:
            com.ss.android.ugc.aweme.app.f r2 = f61488a     // Catch:{ Exception -> 0x01fa }
            java.lang.String r5 = "rotate"
            java.lang.String r5 = r14.getQueryParameter(r5)     // Catch:{ Exception -> 0x01fa }
            boolean r2 = r2.mo47817a(r5)     // Catch:{ Exception -> 0x01fa }
            com.ss.android.ugc.aweme.app.f r5 = f61488a     // Catch:{ Exception -> 0x01fa }
            java.lang.String r6 = "no_hw"
            java.lang.String r6 = r14.getQueryParameter(r6)     // Catch:{ Exception -> 0x01fa }
            boolean r5 = r5.mo47817a(r6)     // Catch:{ Exception -> 0x01fa }
            com.ss.android.ugc.aweme.app.f r6 = f61488a     // Catch:{ Exception -> 0x01fa }
            java.lang.String r7 = "hide_more"
            java.lang.String r7 = r14.getQueryParameter(r7)     // Catch:{ Exception -> 0x01fa }
            boolean r6 = r6.mo47817a(r7)     // Catch:{ Exception -> 0x01fa }
            com.ss.android.ugc.aweme.app.f r7 = f61488a     // Catch:{ Exception -> 0x01fa }
            java.lang.String r8 = "hide_bar"
            java.lang.String r8 = r14.getQueryParameter(r8)     // Catch:{ Exception -> 0x01fa }
            boolean r7 = r7.mo47817a(r8)     // Catch:{ Exception -> 0x01fa }
            com.ss.android.ugc.aweme.app.f r8 = f61488a     // Catch:{ Exception -> 0x01fa }
            java.lang.String r9 = "hide_status_bar"
            java.lang.String r9 = r14.getQueryParameter(r9)     // Catch:{ Exception -> 0x01fa }
            boolean r8 = r8.mo47817a(r9)     // Catch:{ Exception -> 0x01fa }
            com.ss.android.ugc.aweme.app.f r9 = f61488a     // Catch:{ Exception -> 0x01fa }
            java.lang.String r10 = "hide_nav_bar"
            java.lang.String r10 = r14.getQueryParameter(r10)     // Catch:{ Exception -> 0x01fa }
            boolean r9 = r9.mo47817a(r10)     // Catch:{ Exception -> 0x01fa }
            com.ss.android.ugc.aweme.app.f r10 = f61488a     // Catch:{ Exception -> 0x01fa }
            java.lang.String r11 = "hide_more"
            java.lang.String r11 = r14.getQueryParameter(r11)     // Catch:{ Exception -> 0x01fa }
            boolean r10 = r10.mo47817a(r11)     // Catch:{ Exception -> 0x01fa }
            if (r7 != 0) goto L_0x0080
            if (r9 == 0) goto L_0x0085
        L_0x0080:
            java.lang.String r7 = "hide_nav_bar"
            r1.putExtra(r7, r4)     // Catch:{ Exception -> 0x01fa }
        L_0x0085:
            if (r8 == 0) goto L_0x008c
            java.lang.String r7 = "hide_status_bar"
            r1.putExtra(r7, r4)     // Catch:{ Exception -> 0x01fa }
        L_0x008c:
            java.lang.String r7 = "ad_id"
            java.lang.String r7 = r14.getQueryParameter(r7)     // Catch:{ Exception -> 0x01fa }
            boolean r8 = com.bytedance.common.utility.C9431p.m18664a(r7)     // Catch:{ Exception -> 0x01fa }
            if (r8 != 0) goto L_0x00a1
            java.lang.String r8 = "ad_id"
            long r11 = java.lang.Long.parseLong(r7)     // Catch:{ Exception -> 0x00a1 }
            r1.putExtra(r8, r11)     // Catch:{ Exception -> 0x00a1 }
        L_0x00a1:
            java.lang.String r7 = "adinfojson"
            java.lang.String r7 = r14.getQueryParameter(r7)     // Catch:{ Exception -> 0x01fa }
            boolean r8 = com.bytedance.common.utility.C9431p.m18664a(r7)     // Catch:{ Exception -> 0x01fa }
            if (r8 != 0) goto L_0x00d8
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x01fa }
            r8.<init>(r7)     // Catch:{ Exception -> 0x01fa }
            java.lang.String r7 = "cid"
            java.lang.String r7 = r8.getString(r7)     // Catch:{ Exception -> 0x01fa }
            java.lang.String r9 = "log_extra"
            java.lang.String r8 = r8.getString(r9)     // Catch:{ Exception -> 0x01fa }
            boolean r9 = com.bytedance.common.utility.C9431p.m18664a(r7)     // Catch:{ Exception -> 0x01fa }
            if (r9 != 0) goto L_0x00cd
            java.lang.String r9 = "ad_id"
            long r11 = java.lang.Long.parseLong(r7)     // Catch:{ Exception -> 0x01fa }
            r1.putExtra(r9, r11)     // Catch:{ Exception -> 0x01fa }
        L_0x00cd:
            boolean r7 = com.bytedance.common.utility.C9431p.m18664a(r8)     // Catch:{ Exception -> 0x01fa }
            if (r7 != 0) goto L_0x00d8
            java.lang.String r7 = "bundle_download_app_log_extra"
            r1.putExtra(r7, r8)     // Catch:{ Exception -> 0x01fa }
        L_0x00d8:
            java.lang.String r7 = "http://"
            boolean r7 = p2628d.p2650m.C52830p.m112410b(r13, r7, r4)     // Catch:{ Exception -> 0x01fa }
            if (r7 != 0) goto L_0x00eb
            java.lang.String r7 = "https://"
            boolean r7 = p2628d.p2650m.C52830p.m112410b(r13, r7, r4)     // Catch:{ Exception -> 0x01fa }
            if (r7 == 0) goto L_0x00e9
            goto L_0x00eb
        L_0x00e9:
            r7 = 0
            goto L_0x00ec
        L_0x00eb:
            r7 = 1
        L_0x00ec:
            if (r7 != 0) goto L_0x00f4
            java.lang.String r7 = "UTF-8"
            java.lang.String r13 = java.net.URLDecoder.decode(r13, r7)     // Catch:{ Exception -> 0x01fa }
        L_0x00f4:
            android.net.Uri r7 = android.net.Uri.parse(r13)     // Catch:{ Exception -> 0x01fa }
            r1.setData(r7)     // Catch:{ Exception -> 0x01fa }
            java.lang.String r7 = "swipe_mode"
            r8 = 2
            r1.putExtra(r7, r8)     // Catch:{ Exception -> 0x01fa }
            java.lang.String r7 = "show_toolbar"
            r1.putExtra(r7, r4)     // Catch:{ Exception -> 0x01fa }
            if (r2 == 0) goto L_0x010d
            java.lang.String r2 = "orientation"
            r1.putExtra(r2, r3)     // Catch:{ Exception -> 0x01fa }
        L_0x010d:
            if (r5 == 0) goto L_0x0114
            java.lang.String r2 = "bundle_no_hw_acceleration"
            r1.putExtra(r2, r5)     // Catch:{ Exception -> 0x01fa }
        L_0x0114:
            if (r6 == 0) goto L_0x011b
            java.lang.String r2 = "hide_more"
            r1.putExtra(r2, r6)     // Catch:{ Exception -> 0x01fa }
        L_0x011b:
            if (r10 == 0) goto L_0x0122
            java.lang.String r2 = "hide_more"
            r1.putExtra(r2, r10)     // Catch:{ Exception -> 0x01fa }
        L_0x0122:
            java.lang.String r2 = "title"
            java.lang.String r2 = r14.getQueryParameter(r2)     // Catch:{ Exception -> 0x01fa }
            boolean r3 = com.bytedance.common.utility.C9431p.m18664a(r2)     // Catch:{ Exception -> 0x01fa }
            if (r3 == 0) goto L_0x0138
            android.net.Uri r13 = android.net.Uri.parse(r13)     // Catch:{ Exception -> 0x01fa }
            java.lang.String r2 = "title"
            java.lang.String r2 = r13.getQueryParameter(r2)     // Catch:{ Exception -> 0x01fa }
        L_0x0138:
            java.lang.String r13 = "title_extra"
            java.lang.String r13 = r14.getQueryParameter(r13)     // Catch:{ Exception -> 0x01fa }
            boolean r3 = com.bytedance.common.utility.C9431p.m18664a(r13)     // Catch:{ Exception -> 0x01fa }
            if (r3 != 0) goto L_0x0145
            goto L_0x0146
        L_0x0145:
            r13 = r2
        L_0x0146:
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r13)     // Catch:{ Exception -> 0x01fa }
            if (r2 != 0) goto L_0x0152
            java.lang.String r2 = "title"
            r1.putExtra(r2, r13)     // Catch:{ Exception -> 0x01fa }
            goto L_0x015e
        L_0x0152:
            java.lang.String r13 = "title"
            java.lang.String r2 = " "
            r1.putExtra(r13, r2)     // Catch:{ Exception -> 0x01fa }
            java.lang.String r13 = "use_webview_title"
            r1.putExtra(r13, r4)     // Catch:{ Exception -> 0x01fa }
        L_0x015e:
            java.lang.String r13 = "gd_label"
            java.lang.String r13 = r14.getQueryParameter(r13)     // Catch:{ Exception -> 0x01fa }
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r13)     // Catch:{ Exception -> 0x01fa }
            if (r2 != 0) goto L_0x016f
            java.lang.String r2 = "gd_label"
            r1.putExtra(r2, r13)     // Catch:{ Exception -> 0x01fa }
        L_0x016f:
            java.lang.String r13 = "gd_ext_json"
            java.lang.String r13 = r14.getQueryParameter(r13)     // Catch:{ Exception -> 0x01fa }
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r13)     // Catch:{ Exception -> 0x01fa }
            if (r2 != 0) goto L_0x0180
            java.lang.String r2 = "gd_ext_json"
            r1.putExtra(r2, r13)     // Catch:{ Exception -> 0x01fa }
        L_0x0180:
            java.lang.String r13 = "webview_track_key"
            java.lang.String r13 = r14.getQueryParameter(r13)     // Catch:{ Exception -> 0x01fa }
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r13)     // Catch:{ Exception -> 0x01fa }
            if (r2 != 0) goto L_0x0191
            java.lang.String r2 = "webview_track_key"
            r1.putExtra(r2, r13)     // Catch:{ Exception -> 0x01fa }
        L_0x0191:
            java.lang.String r13 = "wap_headers"
            java.lang.String r13 = r14.getQueryParameter(r13)     // Catch:{ Exception -> 0x01fa }
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r13)     // Catch:{ Exception -> 0x01fa }
            if (r2 != 0) goto L_0x01a2
            java.lang.String r2 = "wap_headers"
            r1.putExtra(r2, r13)     // Catch:{ Exception -> 0x01fa }
        L_0x01a2:
            java.lang.String r13 = "bundle_auto_play_audio"
            com.ss.android.ugc.aweme.app.f r2 = f61488a     // Catch:{ Exception -> 0x01fa }
            java.lang.String r3 = "auto_play_bgm"
            java.lang.String r3 = r14.getQueryParameter(r3)     // Catch:{ Exception -> 0x01fa }
            boolean r2 = r2.mo47817a(r3)     // Catch:{ Exception -> 0x01fa }
            r1.putExtra(r13, r2)     // Catch:{ Exception -> 0x01fa }
            java.lang.String r13 = "show_load_dialog"
            com.ss.android.ugc.aweme.app.f r2 = f61488a     // Catch:{ Exception -> 0x01fa }
            java.lang.String r3 = "hide_loading"
            java.lang.String r3 = r14.getQueryParameter(r3)     // Catch:{ Exception -> 0x01fa }
            boolean r2 = r2.mo47817a(r3)     // Catch:{ Exception -> 0x01fa }
            r2 = r2 ^ r4
            r1.putExtra(r13, r2)     // Catch:{ Exception -> 0x01fa }
            java.lang.String r13 = "status_bar_color"
            java.lang.String r13 = r14.getQueryParameter(r13)     // Catch:{ Exception -> 0x01fa }
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r13)     // Catch:{ Exception -> 0x01fa }
            if (r2 != 0) goto L_0x01d6
            java.lang.String r2 = "status_bar_color"
            r1.putExtra(r2, r13)     // Catch:{ Exception -> 0x01fa }
        L_0x01d6:
            java.lang.String r13 = "load_no_cache"
            java.lang.String r13 = r14.getQueryParameter(r13)     // Catch:{ Exception -> 0x01fa }
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r13)     // Catch:{ Exception -> 0x01fa }
            if (r2 != 0) goto L_0x01e7
            java.lang.String r2 = "load_no_cache"
            r1.putExtra(r2, r13)     // Catch:{ Exception -> 0x01fa }
        L_0x01e7:
            java.lang.String r13 = "add_common"
            java.lang.String r13 = r14.getQueryParameter(r13)     // Catch:{ Exception -> 0x01fa }
            boolean r14 = com.bytedance.common.utility.C9431p.m18664a(r13)     // Catch:{ Exception -> 0x01fa }
            if (r14 != 0) goto L_0x01f8
            java.lang.String r14 = "add_common"
            r1.putExtra(r14, r13)     // Catch:{ Exception -> 0x01fa }
        L_0x01f8:
            return r1
        L_0x01f9:
            return r0
        L_0x01fa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.app.C23085f.m56626a(android.content.Context, android.net.Uri):android.content.Intent");
    }
}
