package com.p683ss.android.ugc.aweme.main.story.live;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.main.story.live.d */
public final class C36744d extends BaseResponse implements C22982e {
    @C17952c(mo34828a = "avatar_list")

    /* renamed from: a */
    public List<UrlModel> f93910a;
    @C17952c(mo34828a = "enable")

    /* renamed from: b */
    public boolean f93911b;

    /* renamed from: c */
    public String f93912c;

    public final String getRequestId() {
        return this.f93912c;
    }

    public final void setRequestId(String str) {
        this.f93912c = str;
    }
}
