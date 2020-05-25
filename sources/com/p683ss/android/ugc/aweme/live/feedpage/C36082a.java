package com.p683ss.android.ugc.aweme.live.feedpage;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.live.feedpage.a */
public interface C36082a {
    /* renamed from: a */
    LiveStateApi mo74798a();

    /* renamed from: a */
    void mo74799a(long j);

    /* renamed from: a */
    void mo74800a(User user, List<User> list, C1710e<Long> eVar);

    /* renamed from: a */
    void mo74801a(Class cls, User user, C1710e<Map<Long, Long>> eVar);

    /* renamed from: a */
    void mo74802a(List<Aweme> list);

    /* renamed from: b */
    void mo74803b(List<FollowFeed> list);
}
