package com.p683ss.android.ugc.aweme.challenge.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.common.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.model.SearchChallengeList */
public class SearchChallengeList extends BaseResponse {
    @C17952c(mo34828a = "cursor")
    public long cursor;
    @C17952c(mo34828a = "has_more")
    public boolean hasMore;
    @C17952c(mo34828a = "keyword_disabled")
    public boolean isDisabled;
    @C17952c(mo34828a = "is_match")
    public boolean isMatch;
    @C17952c(mo34828a = "challenge_list")
    public List<SearchChallenge> items;
    public String keyword;
    @C17952c(mo34828a = "log_pb")
    public LogPbBean logPb;
}
