package com.p683ss.android.ugc.aweme.update;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.update.a */
public final class C47512a {

    /* renamed from: a */
    static volatile int f119888a;

    /* renamed from: b */
    public static final C47512a f119889b = new C47512a();

    private C47512a() {
    }

    /* renamed from: a */
    public static void m102941a(boolean z) {
        String str;
        String str2 = "test_invitation_popup";
        C23089d a = C23089d.m56640a().mo47829a("event_belong", "video").mo47829a("event_type", "click").mo47829a("event_page", "video").mo47829a("event_module", "popup");
        String str3 = "action_type";
        if (z) {
            str = "agree";
        } else {
            str = "cancel";
        }
        C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
    }
}
