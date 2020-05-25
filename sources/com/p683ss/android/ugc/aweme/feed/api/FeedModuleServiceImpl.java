package com.p683ss.android.ugc.aweme.feed.api;

import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.C27991b;

/* renamed from: com.ss.android.ugc.aweme.feed.api.FeedModuleServiceImpl */
public final class FeedModuleServiceImpl extends FeedModuleServiceCommonImpl {
    public final void attachActivityToGlobalAcViewModel(FragmentActivity fragmentActivity) {
    }

    public final String getFeedRequstParam() {
        return null;
    }

    public final void initPosterSRProcessorOnHotStart() {
    }

    public final void posterSRProcessorOnDestroy() {
    }

    public static IFeedModuleService createIFeedModuleServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IFeedModuleService.class);
        if (a != null) {
            return (IFeedModuleService) a;
        }
        if (C27991b.f73470aa == null) {
            synchronized (IFeedModuleService.class) {
                if (C27991b.f73470aa == null) {
                    C27991b.f73470aa = new FeedModuleServiceImpl();
                }
            }
        }
        return (FeedModuleServiceImpl) C27991b.f73470aa;
    }
}
