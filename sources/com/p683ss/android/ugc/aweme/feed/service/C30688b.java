package com.p683ss.android.ugc.aweme.feed.service;

import com.p683ss.android.ugc.aweme.feed.panel.C30598af;

/* renamed from: com.ss.android.ugc.aweme.feed.service.b */
public final class C30688b {

    /* renamed from: a */
    private static volatile IRecommendFeedComponentService f80315a;

    /* renamed from: a */
    public static C30598af m71970a() {
        return m71971b().getFeedFragmentPanelService();
    }

    /* renamed from: b */
    private static IRecommendFeedComponentService m71971b() {
        if (f80315a == null) {
            f80315a = RecommendFeedComponentServiceImpl.createIRecommendFeedComponentServicebyMonsterPlugin();
        }
        return f80315a;
    }
}
