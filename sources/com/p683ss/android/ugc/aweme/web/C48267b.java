package com.p683ss.android.ugc.aweme.web;

import com.p683ss.android.sdk.webview.C19767n;
import java.util.List;
import java.util.regex.Pattern;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.web.b */
public final class C48267b implements C19767n {

    /* renamed from: a */
    private final String f121473a;

    /* renamed from: d */
    public final String mo41210d() {
        return this.f121473a;
    }

    /* renamed from: a */
    public final boolean mo41207a() {
        C48380q e = C48380q.m104672e();
        C52711k.m112236a((Object) e, "WebOfflineConfig.getInstance()");
        return e.mo41207a();
    }

    /* renamed from: b */
    public final String mo41208b() {
        String a = C48380q.m104672e().mo41206a(this.f121473a);
        C52711k.m112236a((Object) a, "WebOfflineConfig.getInst…neRootDir(geckoAccessKey)");
        return a;
    }

    /* renamed from: c */
    public final List<Pattern> mo41209c() {
        List<Pattern> c = C48380q.m104672e().mo41209c();
        C52711k.m112236a((Object) c, "WebOfflineConfig.getInstance().offlineHostPrefix()");
        return c;
    }

    public C48267b(String str) {
        C52711k.m112240b(str, "geckoAccessKey");
        this.f121473a = str;
    }

    /* renamed from: a */
    public final String mo41206a(String str) {
        if (str == null) {
            return "";
        }
        String a = C48380q.m104672e().mo41206a(str);
        C52711k.m112236a((Object) a, "WebOfflineConfig.getInst…neRootDir(geckoAccessKey)");
        return a;
    }
}
