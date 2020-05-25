package com.p683ss.android.ugc.aweme.feed.utils;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.feed.utils.y */
public final class C31217y {
    /* renamed from: a */
    public static void m72907a(boolean z) {
        String str;
        String str2 = "follow_cancel_toast";
        C23089d a = C23089d.m56640a();
        String str3 = "final_status";
        if (z) {
            str = "confirm";
        } else {
            str = "cancel";
        }
        C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
    }

    /* renamed from: a */
    public static void m72906a(Aweme aweme, String str) {
        C26890h.m65011a("follow_cancel", C23089d.m56640a().mo47829a("enter_from", "homepage_follow").mo47829a("enter_method", str).mo47829a("group_id", aweme.getAid()).mo47829a("log_pb", C29981aa.m70153a().mo60161a(aweme.getRequestId())).mo47829a("to_user_id", aweme.getAuthorUid()).mo47829a("author_id", aweme.getAuthorUid()).f61491a);
    }
}
