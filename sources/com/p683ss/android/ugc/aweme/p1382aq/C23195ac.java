package com.p683ss.android.ugc.aweme.p1382aq;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.utils.C47915gg;

/* renamed from: com.ss.android.ugc.aweme.aq.ac */
final class C23195ac {
    /* renamed from: a */
    public static String m56839a(Aweme aweme) {
        if (!C20854a.m53167g().isLogin()) {
            return "";
        }
        if (aweme == null || aweme.getAuthor() == null || C47915gg.m103664m(aweme.getAuthor())) {
            return "";
        }
        return String.valueOf(aweme.getFollowStatus());
    }

    /* renamed from: a */
    public static String m56840a(String str, boolean z, String str2) {
        if (!TextUtils.equals("general_search", str) || z) {
            return str2;
        }
        return "click_search_result_video";
    }
}
