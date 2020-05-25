package com.p683ss.android.ugc.aweme.feed.service;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.feed.adapter.C30011ab;
import com.p683ss.android.ugc.aweme.feed.adapter.C30021al;

/* renamed from: com.ss.android.ugc.aweme.feed.service.a */
public final class C30687a {

    /* renamed from: a */
    private static volatile IFeedComponentService f80314a;

    /* renamed from: a */
    public static IFeedComponentService m71966a() {
        if (f80314a == null) {
            f80314a = FeedComponentServiceImpl.createIFeedComponentServicebyMonsterPlugin();
        }
        return f80314a;
    }

    /* renamed from: b */
    public static C30021al m71968b() {
        return m71966a().getVideoViewHolderService();
    }

    /* renamed from: c */
    public static C30011ab m71969c() {
        return m71966a().getFeedAdapterService();
    }

    /* renamed from: a */
    public static Boolean m71967a(Activity activity) {
        return m71966a().isPauseVideoByRecommendUserDialog(activity);
    }
}
