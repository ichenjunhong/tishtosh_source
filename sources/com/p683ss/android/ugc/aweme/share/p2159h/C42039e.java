package com.p683ss.android.ugc.aweme.share.p2159h;

import com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.share.h.e */
public final class C42039e {

    /* renamed from: a */
    public static final C42039e f106426a = new C42039e();

    private C42039e() {
    }

    /* renamed from: a */
    public static boolean m92005a(Aweme aweme) {
        if (aweme == null || aweme.getVideo() == null) {
            return false;
        }
        if (aweme.getAuthor() != null || C26469cc.m63997a(aweme, 3)) {
            return true;
        }
        return false;
    }
}
