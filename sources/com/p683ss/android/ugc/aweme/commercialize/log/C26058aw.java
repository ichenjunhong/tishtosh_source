package com.p683ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.aw */
public final class C26058aw {

    /* renamed from: a */
    public static final C26058aw f68818a = new C26058aw();

    private C26058aw() {
    }

    /* renamed from: a */
    public static final void m63132a(String str) {
        C52711k.m112240b(str, "openUrl");
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            Uri parse = Uri.parse(str);
            C52711k.m112236a((Object) parse, "uri");
            if (TextUtils.equals(parse.getHost(), "stickers")) {
                int b = C52830p.m112446b(charSequence, "/", 0, false, 6, (Object) null) + 1;
                if (b < str.length()) {
                    String substring = str.substring(b);
                    C52711k.m112236a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                    C26890h.m65011a("enter_prop_detail", C23089d.m56640a().mo47829a("enter_from", "draw_ad").mo47829a("prop_id", substring).f61491a);
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m63131a(Context context, Aweme aweme, int i) {
        C26088l.m63339d(context, aweme, i);
    }
}
