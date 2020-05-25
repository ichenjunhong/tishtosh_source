package com.p683ss.android.ugc.aweme.crossplatform.platform.webview;

import android.net.Uri;
import com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c;
import com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c.C27132a;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22521l;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22524n;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22534w;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.j */
public final class C27248j {

    /* renamed from: a */
    public static final C27248j f71900a = new C27248j();

    private C27248j() {
    }

    /* renamed from: a */
    static void m65687a(String str, C22521l lVar) {
        C22524n nVar;
        if (str != null) {
            C27131c a = C27132a.m65458a();
            if (lVar != null) {
                nVar = (C22524n) lVar.mo46870a(C22524n.class);
            } else {
                nVar = null;
            }
            Uri parse = Uri.parse(str);
            C52711k.m112236a((Object) parse, "Uri.parse(it)");
            C22534w wVar = new C22534w(parse, "intent_scheme_", null, 4, null);
            C27131c.m65449a(a, nVar, "webview_safe_log", "filter_scheme", wVar.getFormatData(), null, null, 48, null);
        }
    }
}
