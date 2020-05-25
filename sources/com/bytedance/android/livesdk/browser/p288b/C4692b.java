package com.bytedance.android.livesdk.browser.p288b;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.live.core.p223b.C3830b;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.C4690b;
import com.bytedance.android.livesdk.p270ab.C4507h.C4510b;
import com.bytedance.android.livesdk.p270ab.C4507h.C4510b.C4511a;
import com.bytedance.android.livesdk.p279af.C4581b;
import com.p683ss.android.common.util.NetworkUtils;
import java.util.Locale;

/* renamed from: com.bytedance.android.livesdk.browser.b.b */
public final class C4692b implements C4691a {

    /* renamed from: com.bytedance.android.livesdk.browser.b.b$a */
    public static final class C4694a implements C4510b<C4691a> {
        /* renamed from: a */
        public final C4511a<C4691a> mo10307a(C4511a<C4691a> aVar) {
            return aVar.mo10337a(new C4692b());
        }
    }

    private C4692b() {
    }

    /* renamed from: a */
    public final int mo10481a() {
        int intValue = ((Integer) C4690b.f12774g.mo9431a()).intValue();
        if (intValue == 1 || intValue == 0 || intValue == 2) {
            return intValue;
        }
        return 2;
    }

    /* renamed from: a */
    public final void mo10482a(WebView webView) {
        Context context = webView.getContext();
        String a = C4581b.m11002a(context, webView);
        if (a == null) {
            a = "";
        }
        Locale locale = Resources.getSystem().getConfiguration().locale;
        if (context != null) {
            locale = context.getResources().getConfiguration().locale;
        }
        if (!TextUtils.isEmpty(a)) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append(" ");
            sb.append(TTLiveSDKContext.getHostService().mo10308a().appName());
            sb.append("_");
            sb.append(TTLiveSDKContext.getHostService().mo10308a().getVersionCode());
            sb.append(" AppVersion/");
            sb.append(TTLiveSDKContext.getHostService().mo10308a().getVersionCode());
            sb.append(" JsSdk/2.0 NetType/");
            sb.append(NetworkUtils.getNetworkAccessType(TTLiveSDKContext.getHostService().mo10308a().context()).toUpperCase());
            sb.append(" Channel/");
            sb.append(TTLiveSDKContext.getHostService().mo10308a().getChannel());
            sb.append(" ByteLocale/");
            sb.append(locale.toString());
            sb.append(" Webcast_ByteLocale/");
            sb.append(C3830b.m9703a(TTLiveSDKContext.getHostService().mo10308a().currentLocale()));
            sb.append(" Region/");
            String country = Locale.getDefault().getCountry();
            if (TextUtils.isEmpty(country)) {
                country = "";
            }
            sb.append(country);
            sb.append(" App/");
            sb.append(TTLiveSDKContext.getHostService().mo10308a().appName());
            sb.append(" WebcastSDK/1510");
            a = sb.toString();
        }
        if (!TextUtils.isEmpty(a)) {
            webView.getSettings().setUserAgentString(a);
        }
    }
}
