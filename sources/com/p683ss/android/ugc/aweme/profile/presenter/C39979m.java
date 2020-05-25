package com.p683ss.android.ugc.aweme.profile.presenter;

import com.p683ss.android.ugc.aweme.common.C26865e;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.m */
public interface C39979m extends C26865e {
    void onFollowFail(Exception exc);

    void onFollowSuccess(FollowStatus followStatus);
}
