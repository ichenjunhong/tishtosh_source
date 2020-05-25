package com.p683ss.android.ugc.aweme.p1706fe.utils;

import android.webkit.WebView;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.p675g.p676a.C10757a;
import java.util.List;
import java.util.Map;
import p2628d.p2629a.C52568f;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.utils.c */
public final class C29972c {

    /* renamed from: a */
    public static final C29972c f78226a = new C29972c();

    private C29972c() {
    }

    /* renamed from: a */
    public static final Map<String, String> m70117a(C10757a aVar) {
        List list = null;
        if (aVar != null) {
            WebView webView = aVar.f28930d;
            C52711k.m112236a((Object) webView, "it.webView");
            if (aVar.mo19463e(webView.getUrl())) {
                aVar = null;
            }
            if (aVar != null) {
                Object a = C10193n.m20607a().mo18202a(AppInfoSafeHostFieldsSetting.class, "aweme_appinfo_safehost_fields", C10181b.m20511a().mo18175c().getAwemeAppinfoSafehostFields(), "java.lang.String[]", String[].class);
                if (!(a instanceof String[])) {
                    a = null;
                }
                String[] strArr = (String[]) a;
                if (strArr != null) {
                    list = C52568f.m112084e(strArr);
                }
            }
        }
        Map<String, String> a2 = C29971b.m70116a(list);
        C52711k.m112236a((Object) a2, "AppInfoHelper.getAppInfo(screenFields)");
        return a2;
    }
}
