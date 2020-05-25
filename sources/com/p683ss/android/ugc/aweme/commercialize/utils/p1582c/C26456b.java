package com.p683ss.android.ugc.aweme.commercialize.utils.p1582c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailability;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c.b */
public final class C26456b {

    /* renamed from: a */
    public static final C26456b f69740a = new C26456b();

    private C26456b() {
    }

    /* renamed from: a */
    public static final boolean m63968a(Context context) {
        if (context == null || GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m63971a(Uri uri) {
        C52711k.m112240b(uri, "uri");
        if (!C26540w.m64227a(uri)) {
            return false;
        }
        if (TextUtils.equals(uri.getHost(), "play.app.goo.gl")) {
            return true;
        }
        if (TextUtils.equals(uri.getHost(), "google.com") && uri.getQueryParameter("url") != null) {
            Uri parse = Uri.parse(uri.getQueryParameter("url"));
            C52711k.m112236a((Object) parse, "Uri.parse(uri.getQueryParameter(\"url\"))");
            if (TextUtils.equals(parse.getHost(), "play.app.goo.gl")) {
                return true;
            }
        }
        if (!TextUtils.equals(uri.getHost(), "play.google.com") || !TextUtils.equals(uri.getPath(), "/store/apps/details") || TextUtils.isEmpty(uri.getQueryParameter("id"))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m63969a(Context context, Uri uri) {
        String str;
        if (context == null) {
            return false;
        }
        if (uri != null) {
            str = uri.getScheme();
        } else {
            str = null;
        }
        if ((!C52711k.m112239a((Object) str, (Object) "market")) || !m63968a(context)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setPackage("com.android.vending");
        intent.addFlags(268435456);
        return C26540w.m64210a(context, intent);
    }

    /* renamed from: b */
    public static final boolean m63972b(Context context, Uri uri) {
        if (context == null || uri == null) {
            return false;
        }
        if (TextUtils.equals(uri.getHost(), "play.app.goo.gl")) {
            return m63970a(context, uri, "com.google.android.gms");
        }
        if (TextUtils.equals(uri.getHost(), "google.com") && uri.getQueryParameter("url") != null) {
            Uri parse = Uri.parse(uri.getQueryParameter("url"));
            C52711k.m112236a((Object) parse, "Uri.parse(uri.getQueryParameter(\"url\"))");
            if (TextUtils.equals(parse.getHost(), "play.app.goo.gl")) {
                Uri parse2 = Uri.parse(uri.getQueryParameter("url"));
                C52711k.m112236a((Object) parse2, "Uri.parse(uri.getQueryParameter(\"url\"))");
                return m63970a(context, parse2, "com.google.android.gms");
            }
        }
        if (!TextUtils.equals(uri.getHost(), "play.google.com") || !TextUtils.equals(uri.getPath(), "/store/apps/details") || TextUtils.isEmpty(uri.getQueryParameter("id"))) {
            return false;
        }
        return m63970a(context, uri, "com.android.vending");
    }

    /* renamed from: a */
    private static final boolean m63970a(Context context, Uri uri, String str) {
        if (!m63968a(context)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage(str);
        intent.setData(uri);
        intent.addFlags(268435456);
        return C26540w.m64210a(context, intent);
    }
}
