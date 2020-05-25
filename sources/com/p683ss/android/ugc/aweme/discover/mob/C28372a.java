package com.p683ss.android.ugc.aweme.discover.mob;

import android.view.View;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.adapter.C27797ad;
import com.p683ss.android.ugc.aweme.discover.mob.C28386ag.C28387a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.a */
public final class C28372a {

    /* renamed from: a */
    public static final C28372a f74481a = new C28372a();

    private C28372a() {
    }

    /* renamed from: a */
    public static final void m67321a(String str, String str2, View view) {
        C52711k.m112240b(str, "cardPosition");
        C52711k.m112240b(view, "view");
        C27797ad a = C28387a.m67363a(view);
        String str3 = "aladdin_card_click";
        C23089d a2 = C23089d.m56640a().mo47829a("aladdin_card_type", "user").mo47829a("card_position", str).mo47829a("search_keyword", a.mo56235b());
        String str4 = "to_user_id";
        if (str2 == null) {
            str2 = "";
        }
        C26890h.m65011a(str3, a2.mo47829a(str4, str2).mo47829a("log_pb", a.mo56236c()).f61491a);
    }
}
