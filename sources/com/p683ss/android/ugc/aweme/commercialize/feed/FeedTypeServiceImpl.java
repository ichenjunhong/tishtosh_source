package com.p683ss.android.ugc.aweme.commercialize.feed;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.FeedTypeServiceImpl */
public class FeedTypeServiceImpl implements IFeedTypeService {
    public C25874af getNonAdType() {
        return C25871ae.NONE;
    }

    public C25874af getRawAdType() {
        return C25871ae.RAW_AD;
    }

    public static IFeedTypeService createIFeedTypeServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IFeedTypeService.class);
        if (a != null) {
            return (IFeedTypeService) a;
        }
        if (C27991b.f73468aY == null) {
            synchronized (IFeedTypeService.class) {
                if (C27991b.f73468aY == null) {
                    C27991b.f73468aY = new FeedTypeServiceImpl();
                }
            }
        }
        return (FeedTypeServiceImpl) C27991b.f73468aY;
    }

    public C25874af valueOf(Aweme aweme) {
        return C25871ae.valueOf(aweme);
    }
}
