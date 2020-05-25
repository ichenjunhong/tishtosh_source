package com.p683ss.android.ugc.aweme.app.p1379i;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.net.C37777i;
import com.p683ss.android.ugc.aweme.qrcode.p2106d.C41005b;
import com.p683ss.android.ugc.aweme.qrcode.p2106d.C41006c;
import com.p683ss.android.ugc.aweme.web.C48372k;
import java.util.ArrayList;
import java.util.Iterator;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.i.a */
public final class C23106a {

    /* renamed from: a */
    public static final C23106a f61526a = new C23106a();

    private C23106a() {
    }

    /* renamed from: a */
    public static String m56673a(String str, String str2) {
        C52711k.m112240b(str, "url");
        String str3 = "qr_code";
        IESSettingsProxy b = C32816h.m75716b();
        C52711k.m112236a((Object) b, "SettingsReader.get()");
        String ugSecLinkUrl = b.getUgSecLinkUrl();
        boolean z = true;
        if (!C52711k.m112239a((Object) "direct_link", (Object) ugSecLinkUrl)) {
            Uri parse = Uri.parse(str);
            C52711k.m112236a((Object) parse, "uri");
            String host = parse.getHost();
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(ugSecLinkUrl)) {
                Uri parse2 = Uri.parse(ugSecLinkUrl);
                C52711k.m112236a((Object) parse2, "tempUri");
                if (!TextUtils.isEmpty(parse2.getHost())) {
                    arrayList.add(parse2.getHost());
                }
            }
            arrayList.addAll(C48372k.f121668a);
            arrayList.addAll(C32816h.m75716b().getShareH5UrlWhitelist());
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C37777i.m84365a(host, (String) it.next())) {
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                if (TextUtils.equals(str2, str3)) {
                    String a = C41006c.m90631a(str, ugSecLinkUrl, "qrcode");
                    C52711k.m112236a((Object) a, "SecurityLinkHelper.build…elper.ISceneType.QR_CODE)");
                    return a;
                }
                if (TextUtils.isEmpty(ugSecLinkUrl)) {
                    ugSecLinkUrl = "https://link-sg.byteoversea.com/";
                }
                String uri = Uri.parse(ugSecLinkUrl).buildUpon().appendQueryParameter("aid", String.valueOf(C11010c.m22289j())).appendQueryParameter("target", str).appendQueryParameter("lang", C41005b.m90630a()).build().toString();
                C52711k.m112236a((Object) uri, "SecurityLinkHelper.buildSecurityUrl(url, seclink)");
                return uri;
            }
        }
        return str;
    }
}
