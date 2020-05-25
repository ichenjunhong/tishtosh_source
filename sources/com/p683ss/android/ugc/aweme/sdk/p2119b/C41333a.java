package com.p683ss.android.ugc.aweme.sdk.p2119b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.common.utility.C9431p;
import java.net.URLDecoder;

/* renamed from: com.ss.android.ugc.aweme.sdk.b.a */
public final class C41333a {
    /* renamed from: a */
    private static boolean m91104a(String str) {
        return "1".equals(str);
    }

    /* renamed from: a */
    public static Intent m91103a(Context context, Uri uri) {
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
            intent.setClassName(context, "com.ss.android.ugc.aweme.app.AmeBrowserActivity");
            String queryParameter = uri.getQueryParameter("url");
            if (C9431p.m18664a(queryParameter)) {
                return null;
            }
            if (uri == null) {
                z = false;
            } else {
                z = m91104a(uri.getQueryParameter("rotate"));
            }
            if (uri == null) {
                z2 = false;
            } else {
                z2 = m91104a(uri.getQueryParameter("no_hw"));
            }
            if (uri == null) {
                z3 = false;
            } else {
                z3 = m91104a(uri.getQueryParameter("hide_more"));
            }
            if (uri == null) {
                z4 = false;
            } else {
                z4 = m91104a(uri.getQueryParameter("hide_bar"));
            }
            if (uri == null) {
                z5 = false;
            } else {
                z5 = m91104a(uri.getQueryParameter("hide_status_bar"));
            }
            if (uri == null) {
                z6 = false;
            } else {
                z6 = m91104a(uri.getQueryParameter("hide_nav_bar"));
            }
            if (uri == null) {
                z7 = false;
            } else {
                z7 = m91104a(uri.getQueryParameter("hide_more"));
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
            String queryParameter3 = uri.getQueryParameter("title");
            if (C9431p.m18664a(queryParameter3)) {
                queryParameter3 = Uri.parse(decode).getQueryParameter("title");
            }
            String queryParameter4 = uri.getQueryParameter("title_extra");
            if (C9431p.m18664a(queryParameter4)) {
                queryParameter4 = queryParameter3;
            }
            if (!C9431p.m18664a(queryParameter4)) {
                intent.putExtra("title", queryParameter4);
            } else {
                intent.putExtra("title", " ");
                intent.putExtra("bundle_user_webview_title", true);
            }
            String queryParameter5 = uri.getQueryParameter("gd_label");
            if (!C9431p.m18664a(queryParameter5)) {
                intent.putExtra("gd_label", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("gd_ext_json");
            if (!C9431p.m18664a(queryParameter6)) {
                intent.putExtra("gd_ext_json", queryParameter6);
            }
            String queryParameter7 = uri.getQueryParameter("webview_track_key");
            if (!C9431p.m18664a(queryParameter7)) {
                intent.putExtra("webview_track_key", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("wap_headers");
            if (!C9431p.m18664a(queryParameter8)) {
                intent.putExtra("wap_headers", queryParameter8);
            }
            return intent;
        } catch (Exception unused2) {
            return null;
        }
    }
}
