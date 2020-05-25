package com.p683ss.android.ugc.aweme.commercialize.utils.p1582c;

import android.content.Context;
import android.net.Uri;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.adapter.C30033au;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30322am;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30323an;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c.e */
public final class C26460e {

    /* renamed from: a */
    public static final C26460e f69745a = new C26460e();

    private C26460e() {
    }

    /* renamed from: a */
    private static final void m63977a(Uri uri) {
        C26890h.m65011a("enter_personal_detail", C23089d.m56640a().mo47829a("scene_id", "1048").mo47829a("enter_from", "advertisement").mo47829a("to_user_id", uri.getLastPathSegment()).f61491a);
    }

    /* renamed from: a */
    public static final void m63978a(String str) {
        boolean z;
        C52711k.m112240b(str, "url");
        Uri parse = Uri.parse(str);
        C52711k.m112236a((Object) parse, "uri");
        String host = parse.getHost();
        String path = parse.getPath();
        CharSequence charSequence = host;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && host != null) {
            int hashCode = host.hashCode();
            if (hashCode != -309425751) {
                if (hashCode == 3599307 && host.equals("user") && path != null && C52830p.m112411b(path, "/profile", false, 2, null)) {
                    m63977a(parse);
                }
            } else if (host.equals("profile")) {
                m63977a(parse);
            }
        }
    }

    /* renamed from: a */
    public static final void m63976a(Context context, String str) {
        C52711k.m112240b(context, "context");
        C30323an anVar = new C30323an(context.hashCode());
        anVar.f79220c = str;
        C30033au.m70442a(new C30322am("homepage_hot", context instanceof MainActivity), anVar, "homepage_hot");
    }
}
