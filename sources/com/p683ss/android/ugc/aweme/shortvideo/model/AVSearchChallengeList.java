package com.p683ss.android.ugc.aweme.shortvideo.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.common.LogPbBean;
import com.p683ss.android.ugc.aweme.shortvideo.C43885i;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList */
public class AVSearchChallengeList {
    @C17952c(mo34828a = "cursor")
    public long cursor;
    @C17952c(mo34828a = "has_more")
    public boolean hasMore;
    @C17952c(mo34828a = "keyword_disabled")
    public boolean isDisabled;
    @C17952c(mo34828a = "is_match")
    public boolean isMatch;
    @C17952c(mo34828a = "challenge_list")
    public List<C43885i> items;
    public String keyword;
    @C17952c(mo34828a = "log_pb")
    public LogPbBean logPb;
    @C17952c(mo34828a = "words_query_record")
    public RecommendWordMob recommendWordMob;
}
