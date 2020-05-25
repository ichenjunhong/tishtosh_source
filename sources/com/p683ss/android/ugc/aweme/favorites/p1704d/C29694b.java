package com.p683ss.android.ugc.aweme.favorites.p1704d;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.login.utils.C36330a;

/* renamed from: com.ss.android.ugc.aweme.favorites.d.b */
public final class C29694b {
    /* renamed from: a */
    public static boolean m69744a(Aweme aweme, String str) {
        if (aweme == null || !TextUtils.equals(str, "collection_video") || !aweme.isCollected() || (aweme.isCanPlay() && !C36330a.m81964a(aweme))) {
            return false;
        }
        return true;
    }
}
