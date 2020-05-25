package com.p683ss.android.ugc.aweme.feed.service;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.feed.panel.C30598af;
import com.p683ss.android.ugc.aweme.feed.panel.C30643m;

/* renamed from: com.ss.android.ugc.aweme.feed.service.RecommendFeedComponentServiceImpl */
public class RecommendFeedComponentServiceImpl implements IRecommendFeedComponentService {
    private C30598af feedFragmentPanelService;

    public C30598af getFeedFragmentPanelService() {
        if (this.feedFragmentPanelService == null) {
            this.feedFragmentPanelService = new C30643m();
        }
        return this.feedFragmentPanelService;
    }

    public static IRecommendFeedComponentService createIRecommendFeedComponentServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IRecommendFeedComponentService.class);
        if (a != null) {
            return (IRecommendFeedComponentService) a;
        }
        if (C27991b.f73503bg == null) {
            synchronized (IRecommendFeedComponentService.class) {
                if (C27991b.f73503bg == null) {
                    C27991b.f73503bg = new RecommendFeedComponentServiceImpl();
                }
            }
        }
        return (RecommendFeedComponentServiceImpl) C27991b.f73503bg;
    }
}
