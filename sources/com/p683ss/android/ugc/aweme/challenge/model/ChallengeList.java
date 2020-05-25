package com.p683ss.android.ugc.aweme.challenge.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.model.ChallengeList */
public class ChallengeList extends BaseResponse {
    @C17952c(mo34828a = "has_more")
    public boolean hasMore;
    @C17952c(mo34828a = "is_match")
    public boolean isMatch;
    @C17952c(mo34828a = "challenge_list")
    public List<Challenge> items;
    @C17952c(mo34828a = "max_cursor")
    public long maxCursor;
    @C17952c(mo34828a = "min_cursor")
    public long minCursor;
}
