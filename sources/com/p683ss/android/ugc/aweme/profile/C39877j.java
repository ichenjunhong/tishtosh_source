package com.p683ss.android.ugc.aweme.profile;

import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.j */
public final class C39877j {

    /* renamed from: a */
    public static final C39877j f101725a = new C39877j();

    private C39877j() {
    }

    /* renamed from: a */
    public final String mo80970a() {
        return m88645a("remind_user_complete_profile_last_show_time");
    }

    /* renamed from: b */
    public final String mo80971b() {
        return m88645a("profile_page_complete_profile_guide_bar_show_times");
    }

    /* renamed from: c */
    public final String mo80972c() {
        return m88645a("profile_page_complete_profile_guide_bar_last_show_time");
    }

    /* renamed from: d */
    public final String mo80973d() {
        return m88645a("profile_page_complete_profile_guide_bar_has_click_close");
    }

    /* renamed from: e */
    public final String mo80974e() {
        return m88645a("fans_detail_page_complete_profile_guide_bar_show_times");
    }

    /* renamed from: f */
    public final String mo80975f() {
        return m88645a("fans_detail_page_complete_profile_guide_bar_last_show_time");
    }

    /* renamed from: g */
    public final String mo80976g() {
        return m88645a("post_guide_count_follow_from_recommend");
    }

    /* renamed from: h */
    public final String mo80977h() {
        return m88645a("safe_info_notice_msg");
    }

    /* renamed from: a */
    static String m88645a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('_');
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        sb.append(g.getCurUserId());
        return sb.toString();
    }
}
