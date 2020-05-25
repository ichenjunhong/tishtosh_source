package com.p683ss.android.newmedia;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.newmedia.eplatform.C19550a.C19551a;
import com.p683ss.android.newmedia.eplatform.api.C19554b;
import com.p683ss.android.ugc.aweme.app.C23057c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p683ss.android.ugc.aweme.p2405z.C48422a;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p001a.C0013i;

/* renamed from: com.ss.android.newmedia.j */
public final class C19562j {
    /* renamed from: a */
    public static boolean m47865a(String str) {
        for (String startsWith : C48422a.m104773a()) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m47864a(WebView webView) {
        if (webView != null) {
            if (TextUtils.isEmpty(C48422a.m104775c())) {
                if (!TextUtils.isEmpty(C48422a.m104774b())) {
                    C10691a.m21551c(webView.getContext(), C48422a.m104774b()).mo19066a();
                } else {
                    C10691a.m21551c(webView.getContext(), webView.getContext().getString(R.string.cfw)).mo19066a();
                }
                C26890h.m65011a("enter_blacklist_page", C23089d.m56640a().mo47829a("black_list_type", "toast").f61491a);
                return;
            }
            C19565m.m47867a(webView, C48422a.m104775c());
            C26890h.m65011a("enter_blacklist_page", C23089d.m56640a().mo47829a("black_list_type", "intercept_page").f61491a);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Void m47862a(WebView webView, String str, C0013i iVar) throws Exception {
        if (iVar.mo33d() || iVar.mo34e() == null) {
            C10691a.m21551c(webView.getContext(), webView.getContext().getString(R.string.cfw)).mo19066a();
            return null;
        }
        if (!((C19554b) iVar.mo34e()).f53932a) {
            ((SingleWebView) webView).visit(str);
            C19565m.m47867a(webView, str);
        } else if (TextUtils.isEmpty(C48422a.m104775c())) {
            if (!TextUtils.isEmpty(C48422a.m104774b())) {
                C10691a.m21551c(webView.getContext(), C48422a.m104774b()).mo19066a();
            } else {
                C10691a.m21551c(webView.getContext(), webView.getContext().getString(R.string.cfw)).mo19066a();
            }
            return null;
        } else {
            C19565m.m47867a(webView, Uri.parse(C48422a.m104775c()).buildUpon().appendQueryParameter("forbidden_url", str).appendQueryParameter("risk_level", String.valueOf(((C19554b) iVar.mo34e()).f53933b)).toString());
            C26890h.m65011a("enter_blacklist_page", C23089d.m56640a().mo47829a("black_list_type", "intercept_page").f61491a);
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m47866a(String str, String str2, List<String> list) {
        boolean z;
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return false;
        }
        if (str2 == null) {
            str2 = Uri.parse(str).getScheme();
        }
        if (TextUtils.equals(str2, C23057c.f61423a)) {
            return true;
        }
        for (String str3 : list) {
            if (str == null || str2 == null || str3 == null) {
                z = false;
                continue;
            } else if (!str3.contains(":")) {
                z = TextUtils.equals(str2, str3);
                continue;
            } else {
                z = str.startsWith(str3);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static final /* synthetic */ Void m47863a(WebView webView, String str, C19551a aVar, C0013i iVar) throws Exception {
        if (iVar.mo33d() || iVar.mo34e() == null) {
            C10691a.m21551c(webView.getContext(), webView.getContext().getString(R.string.cfw)).mo19066a();
            return null;
        }
        if (!((C19554b) iVar.mo34e()).f53932a) {
            aVar.mo40802b(str);
            C19565m.m47867a(webView, str);
        } else if (TextUtils.isEmpty(C48422a.m104775c())) {
            if (!TextUtils.isEmpty(C48422a.m104774b())) {
                C10691a.m21551c(webView.getContext(), C48422a.m104774b()).mo19066a();
            } else {
                C10691a.m21551c(webView.getContext(), webView.getContext().getString(R.string.cfw)).mo19066a();
            }
            return null;
        } else {
            C19565m.m47867a(webView, Uri.parse(C48422a.m104775c()).buildUpon().appendQueryParameter("forbidden_url", str).appendQueryParameter("risk_level", String.valueOf(((C19554b) iVar.mo34e()).f53933b)).toString());
            C26890h.m65011a("enter_blacklist_page", C23089d.m56640a().mo47829a("black_list_type", "intercept_page").f61491a);
        }
        return null;
    }
}
