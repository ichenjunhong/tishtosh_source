package com.p683ss.android.ugc.aweme.service;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.follow.oftenwatch.C31875a;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.service.IFollowFeedService */
public interface IFollowFeedService {
    List<Aweme> getAwemes(List<? extends FollowFeed> list);

    C31875a getOftenWatchAwemeService();
}
