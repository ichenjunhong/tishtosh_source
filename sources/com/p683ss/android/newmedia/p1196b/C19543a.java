package com.p683ss.android.newmedia.p1196b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.C23057c;
import java.net.URLDecoder;

/* renamed from: com.ss.android.newmedia.b.a */
public final class C19543a {
    /* renamed from: a */
    private static String m47828a() {
        StringBuilder sb = new StringBuilder(C23057c.f61424b);
        sb.append(C11010c.m22289j());
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m47831b(String str) {
        if (C9431p.m18664a(str)) {
            return false;
        }
        return "1".equals(str);
    }

    /* renamed from: a */
    public static String m47829a(String str) {
        if (C9431p.m18664a(str)) {
            return str;
        }
        try {
            String scheme = Uri.parse(str).getScheme();
            String a = m47828a();
            if (C23057c.f61423a.equals(scheme) || C23057c.f61425c.equals(scheme)) {
                str = str.replace(scheme, a);
            }
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: a */
    private static Intent m47827a(Context context, Uri uri) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (uri == null) {
            return null;
        }
        try {
            Intent intent = new Intent();
            intent.setClassName(context, "com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity");
            String queryParameter = uri.getQueryParameter("url");
            if (C9431p.m18664a(queryParameter)) {
                return null;
            }
            if (uri == null) {
                z = false;
            } else {
                z = m47831b(uri.getQueryParameter("rotate"));
            }
            if (uri == null) {
                z2 = false;
            } else {
                z2 = m47831b(uri.getQueryParameter("no_hw"));
            }
            if (uri == null) {
                z3 = false;
            } else {
                z3 = m47831b(uri.getQueryParameter("hide_more"));
            }
            if (uri == null) {
                z4 = false;
            } else {
                z4 = m47831b(uri.getQueryParameter("hide_bar"));
            }
            if (uri == null) {
                z5 = false;
            } else {
                z5 = m47831b(uri.getQueryParameter("hide_status_bar"));
            }
            if (uri == null) {
                z6 = false;
            } else {
                z6 = m47831b(uri.getQueryParameter("hide_nav_bar"));
            }
            if (uri == null) {
                z7 = false;
            } else {
                z7 = m47831b(uri.getQueryParameter("hide_more"));
            }
            if (z4 || z6) {
                intent.putExtra("hide_nav_bar", true);
            }
            if (z5) {
                intent.putExtra("hide_status_bar", true);
            }
            String queryParameter2 = uri.getQueryParameter("ad_id");
            if (!C9431p.m18664a(queryParameter2)) {
                try {
                    intent.putExtra("ad_id", Long.parseLong(queryParameter2));
                } catch (Exception unused) {
                }
            }
            String queryParameter3 = uri.getQueryParameter("log_extra");
            if (!C9431p.m18664a(queryParameter3)) {
                intent.putExtra("bundle_download_app_log_extra", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("download_url");
            if (!C9431p.m18664a(queryParameter4)) {
                intent.putExtra("bundle_download_url", queryParameter4);
            }
            String decode = URLDecoder.decode(queryParameter, "UTF-8");
            intent.setData(Uri.parse(decode));
            intent.putExtra("swipe_mode", 2);
            intent.putExtra("show_toolbar", true);
            if (z) {
                intent.putExtra("orientation", 0);
            }
            if (z2) {
                intent.putExtra("bundle_no_hw_acceleration", z2);
            }
            if (z3) {
                intent.putExtra("hide_more", z3);
            }
            if (z7) {
                intent.putExtra("hide_more", z7);
            }
            String queryParameter5 = uri.getQueryParameter("title");
            if (C9431p.m18664a(queryParameter5)) {
                queryParameter5 = Uri.parse(decode).getQueryParameter("title");
            }
            String queryParameter6 = uri.getQueryParameter("title_extra");
            if (C9431p.m18664a(queryParameter6)) {
                queryParameter6 = queryParameter5;
            }
            if (!C9431p.m18664a(queryParameter6)) {
                intent.putExtra("title", queryParameter6);
            } else {
                intent.putExtra("title", " ");
                intent.putExtra("use_webview_title", true);
            }
            String queryParameter7 = uri.getQueryParameter("gd_label");
            if (!C9431p.m18664a(queryParameter7)) {
                intent.putExtra("gd_label", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("gd_ext_json");
            if (!C9431p.m18664a(queryParameter8)) {
                intent.putExtra("gd_ext_json", queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("webview_track_key");
            if (!C9431p.m18664a(queryParameter9)) {
                intent.putExtra("webview_track_key", queryParameter9);
            }
            String queryParameter10 = uri.getQueryParameter("wap_headers");
            if (!C9431p.m18664a(queryParameter10)) {
                intent.putExtra("wap_headers", queryParameter10);
            }
            intent.putExtra("bundle_auto_play_audio", m47831b(uri.getQueryParameter("auto_play_bgm")));
            intent.putExtra("show_load_dialog", !m47831b(uri.getQueryParameter("hide_loading")));
            return intent;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071 A[Catch:{ Exception -> 0x0029 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0087 A[SYNTHETIC, Splitter:B:39:0x0087] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m47830a(android.content.Context r7, java.lang.String r8, java.lang.String r9) {
        /*
            r9 = 0
            if (r7 != 0) goto L_0x0004
            return r9
        L_0x0004:
            r0 = 1
            boolean r1 = com.bytedance.common.utility.C9431p.m18664a(r8)     // Catch:{ Exception -> 0x00df }
            if (r1 != 0) goto L_0x00ca
            android.net.Uri r1 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x00df }
            boolean r2 = com.p683ss.android.newmedia.C19547d.m47842a(r8)     // Catch:{ Exception -> 0x00df }
            r3 = 2
            if (r2 == 0) goto L_0x002c
            android.content.Intent r8 = new android.content.Intent     // Catch:{ Exception -> 0x0029 }
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity> r9 = com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.class
            r8.<init>(r7, r9)     // Catch:{ Exception -> 0x0029 }
            r8.setData(r1)     // Catch:{ Exception -> 0x0029 }
            java.lang.String r9 = "swipe_mode"
            r8.putExtra(r9, r3)     // Catch:{ Exception -> 0x0029 }
            r7.startActivity(r8)     // Catch:{ Exception -> 0x0029 }
            return r0
        L_0x0029:
            r9 = 1
            goto L_0x00df
        L_0x002c:
            java.lang.String r2 = r1.getScheme()     // Catch:{ Exception -> 0x00df }
            boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r2)     // Catch:{ Exception -> 0x00df }
            if (r4 != 0) goto L_0x0051
            java.lang.String r4 = "sslocal"
            boolean r4 = r4.equals(r2)     // Catch:{ Exception -> 0x00df }
            if (r4 == 0) goto L_0x0040
        L_0x003e:
            r4 = 1
            goto L_0x0052
        L_0x0040:
            java.lang.String r4 = m47828a()     // Catch:{ Exception -> 0x00df }
            boolean r5 = com.bytedance.common.utility.C9431p.m18664a(r4)     // Catch:{ Exception -> 0x00df }
            if (r5 != 0) goto L_0x0051
            boolean r4 = r4.equals(r2)     // Catch:{ Exception -> 0x00df }
            if (r4 == 0) goto L_0x0051
            goto L_0x003e
        L_0x0051:
            r4 = 0
        L_0x0052:
            java.lang.String r5 = r1.getHost()     // Catch:{ Exception -> 0x00df }
            if (r4 == 0) goto L_0x006f
            java.lang.String r6 = "webview"
            boolean r5 = r6.equals(r5)     // Catch:{ Exception -> 0x00df }
            if (r5 == 0) goto L_0x006f
            android.content.Intent r8 = m47827a(r7, r1)     // Catch:{ Exception -> 0x0029 }
            java.lang.String r9 = "swipe_mode"
            r8.putExtra(r9, r3)     // Catch:{ Exception -> 0x0029 }
            if (r8 == 0) goto L_0x006e
            r7.startActivity(r8)     // Catch:{ Exception -> 0x0029 }
        L_0x006e:
            return r0
        L_0x006f:
            if (r4 == 0) goto L_0x0087
            android.content.Intent r8 = new android.content.Intent     // Catch:{ Exception -> 0x0029 }
            r8.<init>()     // Catch:{ Exception -> 0x0029 }
            java.lang.String r9 = "com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity"
            r8.setClassName(r7, r9)     // Catch:{ Exception -> 0x0029 }
            r8.setData(r1)     // Catch:{ Exception -> 0x0029 }
            java.lang.String r9 = "is_from_self"
            r8.putExtra(r9, r0)     // Catch:{ Exception -> 0x0029 }
            r7.startActivity(r8)     // Catch:{ Exception -> 0x0029 }
            return r0
        L_0x0087:
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x00df }
            java.lang.String r4 = "android.intent.action.VIEW"
            r3.<init>(r4)     // Catch:{ Exception -> 0x00df }
            r3.setData(r1)     // Catch:{ Exception -> 0x00df }
            boolean r1 = com.p683ss.android.common.util.C18920g.m46049a(r7, r3)     // Catch:{ Exception -> 0x00df }
            if (r1 == 0) goto L_0x00a0
            java.lang.String r9 = "open_url"
            r3.putExtra(r9, r8)     // Catch:{ Exception -> 0x0029 }
            r7.startActivity(r3)     // Catch:{ Exception -> 0x0029 }
            return r0
        L_0x00a0:
            java.lang.String r1 = "snssdk"
            boolean r1 = r2.startsWith(r1)     // Catch:{ Exception -> 0x00df }
            if (r1 == 0) goto L_0x00ca
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x00df }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00df }
            java.lang.String r4 = "com.ss.android.sdk."
            r3.<init>(r4)     // Catch:{ Exception -> 0x00df }
            r3.append(r2)     // Catch:{ Exception -> 0x00df }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x00df }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00df }
            boolean r2 = com.p683ss.android.common.util.C18920g.m46049a(r7, r1)     // Catch:{ Exception -> 0x00df }
            if (r2 == 0) goto L_0x00ca
            java.lang.String r9 = "open_url"
            r1.putExtra(r9, r8)     // Catch:{ Exception -> 0x0029 }
            r7.startActivity(r1)     // Catch:{ Exception -> 0x0029 }
            return r0
        L_0x00ca:
            r8 = 0
            boolean r1 = com.bytedance.common.utility.C9431p.m18664a(r8)     // Catch:{ Exception -> 0x00df }
            if (r1 != 0) goto L_0x00df
            boolean r1 = com.p683ss.android.common.util.C18920g.m46052b(r7, r8)     // Catch:{ Exception -> 0x00df }
            if (r1 == 0) goto L_0x00df
            android.content.Intent r8 = com.p683ss.android.common.util.C18920g.m46046a(r7, r8)     // Catch:{ Exception -> 0x0029 }
            r7.startActivity(r8)     // Catch:{ Exception -> 0x0029 }
            return r0
        L_0x00df:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.newmedia.p1196b.C19543a.m47830a(android.content.Context, java.lang.String, java.lang.String):boolean");
    }
}
