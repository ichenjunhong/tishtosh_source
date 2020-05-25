package com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.C27181a;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.C27192b;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.C27195d;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.C27196e;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.C27197f;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27184b.C27186b;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.c.a.a */
public class C27182a {

    /* renamed from: a */
    public C27181a f71718a;

    /* renamed from: b */
    public C27192b f71719b;

    /* renamed from: c */
    public C27195d f71720c;

    /* renamed from: d */
    public C27196e f71721d;

    /* renamed from: e */
    public C27197f f71722e;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.c.a.a$a */
    public static final class C27183a {
        /* renamed from: a */
        public static C27182a m65605a(Bundle bundle) {
            return C27186b.m65608a(bundle);
        }

        /* renamed from: a */
        public static C27182a m65604a(Intent intent) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            if (TextUtils.isEmpty(extras.getString("url"))) {
                if (intent.getData() != null && !TextUtils.isEmpty(intent.getData().toString())) {
                    extras.putString("url", intent.getData().toString());
                }
                if (TextUtils.isEmpty(extras.getString("url")) && !TextUtils.isEmpty(extras.getString("rn_schema"))) {
                    extras.putString("url", extras.getString("rn_schema"));
                }
            }
            try {
                if (!TextUtils.isEmpty(extras.getString("url"))) {
                    Uri parse = Uri.parse(extras.getString("url"));
                    extras.putString("hybrid_report_source", parse.getQueryParameter("hybrid_report_source"));
                    String queryParameter = parse.getQueryParameter("has_adinfojson");
                    extras.putString("has_ad_info_json", queryParameter);
                    if (TextUtils.equals(queryParameter, "1")) {
                        extras.putString("ad_info_json", Uri.parse(extras.getString("url")).getQueryParameter("adinfojson"));
                    }
                }
                String string = extras.getString("hide_nav_bar", "-1");
                if (!TextUtils.equals(string, "-1")) {
                    m65606a(extras, "hide_nav_bar", string);
                }
                String string2 = extras.getString("hide_status_bar", "-1");
                if (!TextUtils.equals(string2, "-1")) {
                    m65606a(extras, "hide_status_bar", string2);
                }
                String string3 = extras.getString("hide_more", "-1");
                if (!TextUtils.equals(string3, "-1")) {
                    m65606a(extras, "hide_more", string3);
                }
            } catch (Exception unused) {
            }
            return C27186b.m65608a(extras);
        }

        /* renamed from: a */
        private static void m65606a(Bundle bundle, String str, String str2) {
            if (TextUtils.equals("1", str2)) {
                bundle.putBoolean(str, true);
            } else if (TextUtils.equals("true", str2)) {
                bundle.putBoolean(str, true);
            } else if (TextUtils.equals("0", str2)) {
                bundle.putBoolean(str, false);
            } else {
                if (TextUtils.equals("false", str2)) {
                    bundle.putBoolean(str, false);
                }
            }
        }
    }
}
