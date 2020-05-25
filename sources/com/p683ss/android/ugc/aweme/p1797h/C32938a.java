package com.p683ss.android.ugc.aweme.p1797h;

import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.h.a */
public final class C32938a {

    /* renamed from: a */
    public static boolean f85600a;

    /* renamed from: a */
    public static boolean m75836a(Aweme aweme) {
        if (aweme.getAuthor() != null) {
            C20902b.m53242a().getCurUserId().equals(aweme.getAuthorUid());
        }
        return false;
    }
}
