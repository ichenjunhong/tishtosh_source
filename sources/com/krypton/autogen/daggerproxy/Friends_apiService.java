package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.friends.service.IFriendsService;
import com.p683ss.android.ugc.aweme.friends.service.IRecommendDependentService;

public interface Friends_apiService {
    IFriendsService provideIFriendsService();

    IRecommendDependentService provideIRecommendDependentService();
}
