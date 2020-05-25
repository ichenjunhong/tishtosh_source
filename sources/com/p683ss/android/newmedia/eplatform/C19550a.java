package com.p683ss.android.newmedia.eplatform;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.p683ss.android.newmedia.C19562j;
import com.p683ss.android.newmedia.C19563k;
import com.p683ss.android.newmedia.C19564l;
import com.p683ss.android.newmedia.eplatform.api.C19553a;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p683ss.android.ugc.aweme.p2405z.C48422a;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.newmedia.eplatform.a */
public final class C19550a {

    /* renamed from: com.ss.android.newmedia.eplatform.a$a */
    public interface C19551a {
        /* renamed from: a */
        boolean mo40801a(String str);

        /* renamed from: b */
        void mo40802b(String str);
    }

    /* renamed from: a */
    public static boolean m47847a(String str) {
        try {
            return TextUtils.equals(Uri.parse(str).getQueryParameter("bbb815f4751d8b93e7f52e43a9a5c429"), "1");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static Boolean m47845a(WebView webView, String str, Boolean bool) {
        if (bool.booleanValue()) {
            if (C48422a.m104776d() == 1 && C19562j.m47865a(str)) {
                C19562j.m47864a(webView);
                return Boolean.valueOf(true);
            } else if (C48422a.m104776d() == 2) {
                if (!TextUtils.isEmpty(str) && ((str.startsWith("http://") || str.startsWith("https://")) && !((SingleWebView) webView).isVisited(str))) {
                    if (webView != null) {
                        C19553a.m47850a(str).mo20a((C0011g<TResult, TContinuationResult>) new C19563k<TResult,TContinuationResult>(webView, str), C0013i.f25b);
                    }
                    return Boolean.valueOf(true);
                } else if (C19562j.m47865a(str)) {
                    C19562j.m47864a(webView);
                    return Boolean.valueOf(true);
                }
            }
        }
        return Boolean.valueOf(false);
    }

    /* renamed from: a */
    public static Boolean m47846a(WebView webView, String str, Boolean bool, C19551a aVar) {
        if (bool.booleanValue() && webView != null) {
            if (C48422a.m104776d() == 1 && C19562j.m47865a(str)) {
                C19562j.m47864a(webView);
                return Boolean.valueOf(true);
            } else if (C48422a.m104776d() == 2) {
                if (!TextUtils.isEmpty(str) && ((str.startsWith("http://") || str.startsWith("https://")) && !aVar.mo40801a(str))) {
                    if (webView != null) {
                        C19553a.m47850a(str).mo20a((C0011g<TResult, TContinuationResult>) new C19564l<TResult,TContinuationResult>(webView, str, aVar), C0013i.f25b);
                    }
                    return Boolean.valueOf(true);
                } else if (C19562j.m47865a(str)) {
                    C19562j.m47864a(webView);
                    return Boolean.valueOf(true);
                }
            }
        }
        return Boolean.valueOf(false);
    }
}
