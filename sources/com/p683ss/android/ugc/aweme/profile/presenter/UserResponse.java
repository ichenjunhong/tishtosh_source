package com.p683ss.android.ugc.aweme.profile.presenter;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.UserResponse */
public final class UserResponse extends BaseResponse {
    @C17952c(mo34828a = "log_pb")
    private LogPbBean logPb;
    @C17952c(mo34828a = "user")
    private User user;

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final User getUser() {
        return this.user;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setUser(User user2) {
        this.user = user2;
    }
}
