package com.p683ss.android.ugc.aweme.app.p1378h;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p683ss.android.ugc.aweme.bullet.C24098a;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29907m;
import com.p683ss.android.ugc.aweme.router.C41302w.C41309b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.h.a */
public final class C23103a implements IInterceptor, C41309b {

    /* renamed from: a */
    private boolean f61518a;

    /* renamed from: b */
    private boolean f61519b;

    /* renamed from: a */
    public final String mo47844a(String str) {
        if (!TextUtils.isEmpty(str) && (str.startsWith("aweme://webview/") || str.startsWith("aweme://ame/webview/"))) {
            Uri parse = Uri.parse(str);
            if (!(parse == null || parse.getQueryParameter("rn_schema") == null)) {
                return Uri.parse(parse.getQueryParameter("rn_schema")).buildUpon().appendQueryParameter("fallback_url", parse.getQueryParameter("url")).appendQueryParameter("rn_schema", parse.getQueryParameter("rn_schema")).build().toString();
            }
        } else if (!TextUtils.isEmpty(str) && (str.startsWith("http://") || str.startsWith("https://"))) {
            StringBuilder sb = new StringBuilder("aweme://webview/?url=");
            sb.append(Uri.encode(str));
            str = sb.toString();
        }
        if (C29907m.m70059a(str)) {
            str = "";
        }
        return str;
    }

    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url = routeIntent.getUrl();
        if (!TextUtils.isEmpty(routeIntent.getUrl())) {
            if (url.startsWith("aweme://webview/") || url.startsWith("aweme://ame/webview/")) {
                Uri parse = Uri.parse(url);
                if (parse != null && TextUtils.equals(parse.getQueryParameter("hybrid_sdk_version"), "bullet")) {
                    this.f61519b = true;
                    return true;
                } else if (!(parse == null || parse.getQueryParameter("rn_schema") == null)) {
                    routeIntent.setUrl(Uri.parse(parse.getQueryParameter("rn_schema")).buildUpon().appendQueryParameter("fallback_url", parse.getQueryParameter("url")).appendQueryParameter("rn_schema", parse.getQueryParameter("rn_schema")).build().toString());
                    return true;
                }
            } else if (url.startsWith("http://") || url.startsWith("https://")) {
                StringBuilder sb = new StringBuilder("aweme://webview/?url=");
                sb.append(Uri.encode(url));
                routeIntent.setUrl(sb.toString());
                return true;
            } else if (url.startsWith("aweme://reactnative/")) {
                Uri parse2 = Uri.parse(url);
                if (parse2 != null && TextUtils.equals(parse2.getQueryParameter("hybrid_sdk_version"), "bullet")) {
                    this.f61519b = true;
                    return true;
                }
            } else if (url.startsWith("aweme://lynxview/")) {
                this.f61519b = true;
                return true;
            }
        }
        this.f61518a = C29907m.m70059a(url);
        if (this.f61518a) {
            return true;
        }
        return false;
    }

    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        if (this.f61518a) {
            this.f61518a = false;
            return true;
        } else if (!this.f61519b) {
            return false;
        } else {
            this.f61519b = false;
            if (routeIntent.getExtra() != null) {
                String url = routeIntent.getUrl();
                Bundle extras = routeIntent.getExtra().getExtras();
                C52711k.m112240b(context, "context");
                C52711k.m112240b(url, "schema");
                C24098a.m58975a(context, url, null, extras);
            } else {
                C24098a.m58974a(context, routeIntent.getUrl());
            }
            return true;
        }
    }
}
