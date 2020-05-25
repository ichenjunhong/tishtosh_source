package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchChallengeList */
public class SearchChallengeList extends SearchApiResult {
    @C17952c(mo34828a = "challenge_list")
    public List<SearchChallenge> challengeList;
    @C17952c(mo34828a = "cursor", mo34829b = {"min_cursor"})
    public int cursor;
    @C17952c(mo34828a = "has_more")
    public boolean hasMore;
    @C17952c(mo34828a = "is_match")
    public boolean isMatch;
}
