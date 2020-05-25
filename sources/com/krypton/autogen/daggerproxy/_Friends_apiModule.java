package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.friends.service.IFriendsService;
import com.p683ss.android.ugc.aweme.friends.service.IRecommendDependentService;
import com.p683ss.android.ugc.p2416c.C48514f;

public class _Friends_apiModule {
    public IFriendsService provideIFriendsService() {
        return ((Friends_apiService) C48514f.m104950a(Friends_apiService.class)).provideIFriendsService();
    }

    public IRecommendDependentService provideIRecommendDependentService() {
        return ((Friends_apiService) C48514f.m104950a(Friends_apiService.class)).provideIRecommendDependentService();
    }
}
