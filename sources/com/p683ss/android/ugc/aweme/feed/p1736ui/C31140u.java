package com.p683ss.android.ugc.aweme.feed.p1736ui;

import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.u */
final /* synthetic */ class C31140u implements Runnable {

    /* renamed from: a */
    private final FeedAvatarViewV1 f81515a;

    /* renamed from: b */
    private final FollowStatus f81516b;

    C31140u(FeedAvatarViewV1 feedAvatarViewV1, FollowStatus followStatus) {
        this.f81515a = feedAvatarViewV1;
        this.f81516b = followStatus;
    }

    public final void run() {
        this.f81515a.mo63315a(this.f81516b);
    }
}
