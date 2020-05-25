package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.recommend;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.d */
public final class C34654d extends BaseResponse {
    @C17952c(mo34828a = "user_list")

    /* renamed from: a */
    public List<User> f89268a;
    @C17952c(mo34828a = "rid")

    /* renamed from: b */
    public String f89269b;
    @C17952c(mo34828a = "cursor")

    /* renamed from: c */
    public int f89270c;
    @C17952c(mo34828a = "has_more")

    /* renamed from: d */
    public boolean f89271d;
    @C17952c(mo34828a = "new_user_count")

    /* renamed from: e */
    public int f89272e;
    @C17952c(mo34828a = "log_pb")

    /* renamed from: f */
    public LogPbBean f89273f;

    /* renamed from: a */
    public final List<User> mo72718a() {
        if (this.f89268a == null) {
            this.f89268a = new ArrayList(0);
        }
        return this.f89268a;
    }
}
