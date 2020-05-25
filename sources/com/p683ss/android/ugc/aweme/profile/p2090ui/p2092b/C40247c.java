package com.p683ss.android.ugc.aweme.profile.p2090ui.p2092b;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.b.c */
public final class C40247c {

    /* renamed from: a */
    public static final C40247c f102787a = new C40247c();

    private C40247c() {
    }

    /* renamed from: a */
    public static void m89516a() {
        C26890h.m65011a("show_profile_bio_hint", C23089d.m56640a().f61491a);
    }

    /* renamed from: a */
    public static String m89514a(User user) {
        if (C47915gg.m103664m(user)) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    /* renamed from: a */
    public static void m89517a(String str) {
        if (C40248d.m89520a(str)) {
            C26890h.m65011a("enter_personal_homepage", C23089d.m56640a().mo47829a("tab_name", str).f61491a);
        }
    }

    /* renamed from: a */
    private static String m89515a(User user, String str) {
        if (C52711k.m112239a((Object) str, (Object) "weblink")) {
            return user.getBioUrl();
        }
        return user.getBioEmail();
    }

    /* renamed from: a */
    public static void m89518a(String str, User user) {
        C52711k.m112240b(str, "type");
        if (user != null) {
            C26890h.m65011a("click_link", C23089d.m56640a().mo47829a("enter_from", m89514a(user)).mo47829a("link_type", str).mo47829a("author_id", user.getUid()).mo47829a("link", m89515a(user, str)).f61491a);
        }
    }

    /* renamed from: a */
    public static void m89519a(String str, String str2, User user) {
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(str2, "type");
        if (user != null) {
            C26890h.m65011a("show_link", C23089d.m56640a().mo47829a("enter_from", str).mo47829a("link_type", str2).mo47829a("link", m89515a(user, str2)).mo47829a("scene_id", "1008").mo47829a("author_id", user.getUid()).f61491a);
        }
    }
}
