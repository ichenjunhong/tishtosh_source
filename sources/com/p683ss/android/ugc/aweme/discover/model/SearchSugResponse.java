package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchSugResponse */
public class SearchSugResponse extends BaseResponse {
    @C17952c(mo34828a = "log_pb")
    public LogPbBean logPb;
    @C17952c(mo34828a = "words_query_record")
    public RecommendWordMob recommendWordMob;
    @C17952c(mo34828a = "rid")
    public String requestId = "";
    @C17952c(mo34828a = "sug_list")
    public List<SearchSugEntity> sugList;
}
