package com.p683ss.android.ugc.aweme.feed.utils;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.utils.x */
public final class C31216x {

    /* renamed from: a */
    public static final C31216x f81663a = new C31216x();

    private C31216x() {
    }

    /* renamed from: a */
    public static final void m72904a(String str, String str2) {
        C26890h.m65011a("enter_compilation_list", C23089d.m56640a().mo47829a("enter_from", str2).mo47829a("author_id", str).f61491a);
    }

    /* renamed from: a */
    public static void m72905a(String str, String str2, String str3, Long l) {
        C26890h.m65011a("compilation_continue", new C23089d().mo47829a("enter_from", str).mo47829a("previous_page", str2).mo47829a("compilation_id", str3).mo47828a("to_order", (Object) l).f61491a);
    }

    /* renamed from: a */
    public static final void m72903a(Aweme aweme, String str, String str2, String str3, String str4) {
        String str5;
        C52711k.m112240b(str4, "enterMethod");
        String str6 = "enter_compilation_detail";
        C23089d a = C23089d.m56640a().mo47829a("enter_from", str3).mo47829a("compilation_id", str).mo47829a("page_type", "complete").mo47829a("impr_type", C23198ae.m56883s(aweme)).mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56857c(aweme))).mo47829a("author_id", str2).mo47829a("enter_method", str4);
        String str7 = "group_id";
        if (aweme != null) {
            str5 = aweme.getAid();
        } else {
            str5 = null;
        }
        C26890h.m65011a(str6, a.mo47829a(str7, str5).f61491a);
    }
}
