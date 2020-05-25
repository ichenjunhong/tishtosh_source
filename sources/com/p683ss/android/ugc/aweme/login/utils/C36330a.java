package com.p683ss.android.ugc.aweme.login.utils;

import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;

/* renamed from: com.ss.android.ugc.aweme.login.utils.a */
public final class C36330a {
    /* renamed from: a */
    public static boolean m81964a(Aweme aweme) {
        if (aweme == null || aweme.getTakeDownReason() != 6) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m81965b(Aweme aweme) {
        if (!m81964a(aweme) || !C31190f.m72831a(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m81963a(Aweme aweme, int i) {
        if (aweme == null || TextUtils.isEmpty(aweme.getTakeDownDesc()) || !m81964a(aweme)) {
            return C11010c.m22280a().getString(i);
        }
        return aweme.getTakeDownDesc();
    }
}
