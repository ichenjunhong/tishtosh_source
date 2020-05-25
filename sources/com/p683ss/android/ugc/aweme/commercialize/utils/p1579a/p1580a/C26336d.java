package com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a;

import android.net.Uri;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.C23057c;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26460e;
import com.p683ss.android.ugc.aweme.miniapp_api.C36949e;
import com.p683ss.android.ugc.aweme.router.C41302w;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a.d */
public final class C26336d extends C26333a {

    /* renamed from: a */
    public static final C26337a f69519a = new C26337a(null);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a.d$a */
    public static final class C26337a {
        private C26337a() {
        }

        public /* synthetic */ C26337a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: e */
    private final String m63764e() {
        return mo54083d().f69472c.f69499a;
    }

    /* renamed from: a */
    public final boolean mo54084a() {
        String str;
        if (TextUtils.isEmpty(m63764e()) || C36949e.m83168d(m63764e())) {
            return false;
        }
        Uri parse = Uri.parse(m63764e());
        C52711k.m112236a((Object) parse, "Uri.parse(openUrl)");
        String scheme = parse.getScheme();
        if (scheme == null) {
            str = null;
        } else if (scheme != null) {
            str = scheme.toLowerCase();
            C52711k.m112236a((Object) str, "(this as java.lang.String).toLowerCase()");
        } else {
            throw new C52857u("null cannot be cast to non-null type java.lang.String");
        }
        if (m63763a(str) || C52711k.m112239a((Object) str, (Object) "aweme")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo54085b() {
        String str;
        Uri parse = Uri.parse(m63764e());
        C52711k.m112236a((Object) parse, "Uri.parse(openUrl)");
        String scheme = parse.getScheme();
        if (scheme == null) {
            str = null;
        } else if (scheme != null) {
            str = scheme.toLowerCase();
            C52711k.m112236a((Object) str, "(this as java.lang.String).toLowerCase()");
        } else {
            throw new C52857u("null cannot be cast to non-null type java.lang.String");
        }
        if (m63763a(str)) {
            C26460e.m63978a(m63764e());
            return C23060d.f61431e.mo47789a(mo54082c(), m63764e(), (String) null);
        } else if (C52711k.m112239a((Object) str, (Object) "aweme")) {
            return C41302w.m91042a().mo83861a(m63764e());
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m63763a(String str) {
        CharSequence charSequence = str;
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        if (TextUtils.equals(C23057c.f61423a, charSequence) || TextUtils.equals(C23057c.f61425c, charSequence)) {
            return true;
        }
        return false;
    }
}
