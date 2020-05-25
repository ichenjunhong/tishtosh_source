package com.p683ss.android.ugc.aweme.challenge.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList */
public class ChallengeAwemeList extends BaseResponse implements C22982e {
    @C17952c(mo34828a = "cursor")
    public long cursor;
    @C17952c(mo34828a = "has_more")
    public int hasMore;
    @C17952c(mo34828a = "aweme_list")
    public List<Aweme> items;
    @C17952c(mo34828a = "log_pb")
    public LogPbBean logPb;
    @C17952c(mo34828a = "mix_list")
    public List<MixCardStruct> mixList;
    @C17952c(mo34828a = "rid")
    String requestId;

    public String getRequestId() {
        return this.requestId;
    }

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }
}
