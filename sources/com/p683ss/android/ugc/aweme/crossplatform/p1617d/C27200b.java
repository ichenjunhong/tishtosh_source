package com.p683ss.android.ugc.aweme.crossplatform.p1617d;

import android.net.Uri;
import android.text.TextUtils;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.d.b */
public final class C27200b {

    /* renamed from: a */
    public static final C27200b f71826a = new C27200b();

    private C27200b() {
    }

    /* renamed from: a */
    public static final boolean m65621a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(str2);
        C52711k.m112236a((Object) parse, "monitorUri");
        String scheme = parse.getScheme();
        C52711k.m112236a((Object) parse2, "currentUri");
        if (!(!C52711k.m112239a((Object) scheme, (Object) parse2.getScheme())) && !(!C52711k.m112239a((Object) parse.getHost(), (Object) parse2.getHost())) && !(!C52711k.m112239a((Object) parse.getPath(), (Object) parse2.getPath()))) {
            return true;
        }
        return false;
    }
}
