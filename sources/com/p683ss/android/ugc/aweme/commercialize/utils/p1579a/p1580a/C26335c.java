package com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p683ss.android.agilelogger.C18778a;
import java.util.Locale;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a.c */
public final class C26335c extends C26333a {
    /* renamed from: a */
    public final boolean mo54084a() {
        if (TextUtils.isEmpty(mo54083d().f69472c.f69499a)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo54085b() {
        String str;
        String str2 = mo54083d().f69472c.f69499a;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        Uri parse = Uri.parse(str2);
        C52711k.m112236a((Object) parse, "uri");
        String scheme = parse.getScheme();
        if (scheme != null) {
            Locale locale = Locale.getDefault();
            C52711k.m112236a((Object) locale, "Locale.getDefault()");
            if (scheme != null) {
                str = scheme.toLowerCase(locale);
                C52711k.m112236a((Object) str, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                throw new C52857u("null cannot be cast to non-null type java.lang.String");
            }
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) || !C52711k.m112239a((Object) "market", (Object) str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder("【filterUrl】 = ");
        sb.append(str2);
        sb.append(" 【market】 special handle");
        C18778a.m45848b("commerce_jump", sb.toString());
        Context c = mo54082c();
        mo54083d();
        C52711k.m112240b(c, "context");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        intent.addFlags(268435456);
        c.startActivity(intent);
        return true;
    }
}
