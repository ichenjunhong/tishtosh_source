package com.p683ss.android.newmedia.p1202ui.webview;

import android.content.Context;
import android.os.Build.VERSION;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.crossplatform.C27198d;
import com.p683ss.android.ugc.aweme.language.C35837h;
import java.util.Locale;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.newmedia.ui.webview.d */
public final class C19621d {

    /* renamed from: a */
    public static final C19621d f54053a = new C19621d();

    private C19621d() {
    }

    /* renamed from: a */
    public final void mo40908a(WebView webView) {
        if (webView != null) {
            Context context = webView.getContext();
            C52711k.m112236a((Object) context, "webview.context");
            String a = m47970a(context, webView);
            if (!C9431p.m18664a(a)) {
                WebSettings settings = webView.getSettings();
                C52711k.m112236a((Object) settings, "webview.settings");
                settings.setUserAgentString(a);
            }
        }
    }

    /* renamed from: a */
    private static String m47970a(Context context, WebView webView) {
        String str;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(webView, C23060d.f61427a);
        String a = C19622e.m47972a(context, webView);
        if (a == null) {
            a = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(" trill_");
        sb.append(C11010c.m22287h());
        sb.append(" JsSdk/1.0 NetType/");
        String networkAccessType = NetworkUtils.getNetworkAccessType(C11010c.m22280a());
        C52711k.m112236a((Object) networkAccessType, "NetworkUtils.getNetworkA….getApplicationContext())");
        if (networkAccessType != null) {
            String upperCase = networkAccessType.toUpperCase();
            C52711k.m112236a((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            sb.append(upperCase);
            sb.append(" Channel/");
            sb.append(C11010c.m22295p());
            sb.append(" AppName/");
            sb.append(C11010c.m22283d());
            sb.append(" app_version/");
            sb.append(C11010c.m22288i());
            String sb2 = sb.toString();
            Locale localeSetting = C23794bh.m58383I().getLocaleSetting();
            if (VERSION.SDK_INT >= 21) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(" ByteLocale/");
                sb3.append(localeSetting.toLanguageTag());
                str = sb3.toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(sb2);
                sb4.append(" ByteLocale/");
                String locale = localeSetting.toString();
                C52711k.m112236a((Object) locale, "locale.toString()");
                sb4.append(C52830p.m112401a(locale, "_", "-", false, 4, (Object) null));
                str = sb4.toString();
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append(" ByteFullLocale/");
            sb5.append(C23794bh.m58383I().getAppLocale());
            String sb6 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            sb7.append(" Region/");
            sb7.append(C35837h.m80980e());
            String sb8 = sb7.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(sb8);
            sb9.append(" AppSkin/");
            sb9.append(C27198d.m65619b());
            return sb9.toString();
        }
        throw new C52857u("null cannot be cast to non-null type java.lang.String");
    }
}
