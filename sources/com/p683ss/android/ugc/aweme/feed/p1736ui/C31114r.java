package com.p683ss.android.ugc.aweme.feed.p1736ui;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.r */
final /* synthetic */ class C31114r implements Runnable {

    /* renamed from: a */
    private final FeedAvatarView f81440a;

    /* renamed from: b */
    private final FollowStatus f81441b;

    /* renamed from: c */
    private final Aweme f81442c;

    C31114r(FeedAvatarView feedAvatarView, FollowStatus followStatus, Aweme aweme) {
        this.f81440a = feedAvatarView;
        this.f81441b = followStatus;
        this.f81442c = aweme;
    }

    public final void run() {
        this.f81440a.mo63303a(this.f81441b, this.f81442c);
    }
}
