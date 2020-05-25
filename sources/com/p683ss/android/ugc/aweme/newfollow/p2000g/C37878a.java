package com.p683ss.android.ugc.aweme.newfollow.p2000g;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.newfollow.g.a */
public final class C37878a {
    /* renamed from: a */
    public static void m84562a(String str) {
        C26890h.m65011a("page_refresh", C23089d.m56640a().mo47829a("enter_from", "homepage_follow").mo47829a("refresh_method", str).f61491a);
    }

    /* renamed from: a */
    public static String m84561a(Integer num) {
        int i;
        if (num == null) {
            i = 3;
        } else {
            i = num.intValue();
        }
        switch (Integer.valueOf(i).intValue()) {
            case 1:
                return "click_bottom_icon";
            case 2:
                return "click_top_icon";
            case 3:
                return "slide_down";
            case 7:
                return "launch";
            case 8:
                return "slide_right";
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static String m84564b(Integer num) {
        int i;
        if (num == null) {
            i = 4;
        } else {
            i = num.intValue();
        }
        switch (Integer.valueOf(i).intValue()) {
            case 4:
                return "slide_up";
            case 5:
                return "prefetch";
            default:
                return null;
        }
    }

    /* renamed from: a */
    public static void m84563a(String str, boolean z, boolean z2) {
        C26890h.m65011a("page_refresh_response", C23089d.m56640a().mo47829a("enter_from", "homepage_follow").mo47829a("refresh_method", str).mo47826a("is_success", z ? 1 : 0).mo47826a("no_more_content", z2 ^ true ? 1 : 0).f61491a);
    }
}
