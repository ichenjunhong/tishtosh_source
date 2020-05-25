package com.p683ss.android.ugc.aweme.challenge.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.common.LogPbBean;
import com.p683ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.challenge.model.SearchSugChallengeList */
public final class SearchSugChallengeList extends BaseResponse {
    @C17952c(mo34828a = "is_match")
    public boolean isMatch;
    @C17952c(mo34828a = "sug_list")
    public List<AVChallenge> items = new ArrayList();
    public String keyword = "";
    @C17952c(mo34828a = "log_pb")
    public LogPbBean logPb;
    @C17952c(mo34828a = "words_query_record")
    public final RecommendWordMob recommendWordMob;

    public final void setItems(List<AVChallenge> list) {
        C52711k.m112240b(list, "<set-?>");
        this.items = list;
    }

    public final void setKeyword(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.keyword = str;
    }
}
