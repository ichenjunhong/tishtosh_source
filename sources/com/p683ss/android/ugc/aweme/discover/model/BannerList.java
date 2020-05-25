package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.BannerList */
public class BannerList extends BaseResponse implements C22982e {
    @C17952c(mo34828a = "banner")
    public List<Banner> items;
    @C17952c(mo34828a = "log_pb")
    public LogPbBean logPb;
    String requestId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }
}
