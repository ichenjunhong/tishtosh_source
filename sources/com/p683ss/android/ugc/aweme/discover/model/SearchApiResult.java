package com.p683ss.android.ugc.aweme.discover.model;

import com.bytedance.frameworks.baselib.network.http.C9831a;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.app.api.C22990h;
import com.p683ss.android.ugc.aweme.app.api.C22991i;
import com.p683ss.android.ugc.aweme.app.api.C22992j;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.commercialize.model.C26112af;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchApiResult */
public class SearchApiResult extends BaseResponse implements C22982e, C22990h {
    @C17952c(mo34828a = "ad_info")
    public C26112af adInfo;
    @C17952c(mo34828a = "guide_search_words")
    public List<GuideSearchWord> guideSearchWordList;
    @C17952c(mo34828a = "log_pb")
    public LogPbBean logPb;
    @C17952c(mo34828a = "query_correct_info")
    public QueryCorrectInfo queryCorrectInfo;
    String requestId = "";
    C9831a requestInfo;
    @C17952c(mo34828a = "search_nil_info")
    public SearchNilInfo searchNilInfo;
    @C17952c(mo34828a = "search_nil_text")
    public SearchNilText searchNilText;
    @C17952c(mo34828a = "suicide_prevent")
    public SearchPreventSuicide suicidePrevent;

    public String getRequestId() {
        return this.requestId;
    }

    public C9831a getRequestInfo() {
        return this.requestInfo;
    }

    public C22992j getRequestLog() {
        return C22991i.m56510a(this);
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setRequestInfo(C9831a aVar) {
        this.requestInfo = aVar;
    }
}
