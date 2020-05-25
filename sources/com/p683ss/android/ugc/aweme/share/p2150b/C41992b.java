package com.p683ss.android.ugc.aweme.share.p2150b;

import android.net.Uri;
import android.text.TextUtils;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C22835a;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;

/* renamed from: com.ss.android.ugc.aweme.share.b.b */
public final class C41992b {

    /* renamed from: a */
    private static boolean f106286a;

    /* renamed from: a */
    public static void m91956a(boolean z) {
        f106286a = false;
    }

    /* renamed from: a */
    public static String m91955a(String str) {
        C18922i iVar = new C18922i(str);
        String curSecUserId = C20854a.m53167g().getCurSecUserId();
        if (!TextUtils.isEmpty(curSecUserId)) {
            iVar.mo38778a(C22835a.f61196a, curSecUserId);
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(iVar.mo38774a()).openConnection();
            httpURLConnection.setRequestMethod("HEAD");
            C41993c.m91958a(httpURLConnection, "accept", "*/*");
            C41993c.m91958a(httpURLConnection, "connection", "Keep-Alive");
            httpURLConnection.setInstanceFollowRedirects(false);
            return httpURLConnection.getHeaderField("Location");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m91957b(String str) {
        boolean z;
        Uri uri;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("microapp") || str.contains("microgame")) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return str;
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("android_scheme");
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = parse.getQueryParameter("ios_scheme");
        }
        if (TextUtils.isEmpty(queryParameter)) {
            return str;
        }
        try {
            uri = Uri.parse(URLDecoder.decode(str, "UTF8"));
        } catch (UnsupportedEncodingException unused) {
            uri = parse;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(queryParameter);
        sb.append("&app_id=");
        sb.append(uri.getQueryParameter("app_id"));
        sb.append("&token=");
        sb.append(uri.getQueryParameter("token"));
        sb.append("&channel=");
        sb.append(uri.getQueryParameter("channel"));
        sb.append("&iid=");
        sb.append(uri.getQueryParameter("iid"));
        return sb.toString();
    }
}
