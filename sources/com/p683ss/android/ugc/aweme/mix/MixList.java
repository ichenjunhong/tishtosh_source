package com.p683ss.android.ugc.aweme.mix;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.mix.MixList */
public class MixList implements Serializable {
    @C17952c(mo34828a = "aweme_list")
    public List<Aweme> awemeList;
    @C17952c(mo34828a = "cursor")
    public long cursor;
    @C17952c(mo34828a = "has_more")
    public int hasMore;
    @C17952c(mo34828a = "log_pb")
    public LogPbBean logPb;
    @C17952c(mo34828a = "min_cursor")
    public long minCursor;
    @C17952c(mo34828a = "status_code")
    public int statusCode;
    @C17952c(mo34828a = "status_msg")
    public String statusMsg;
}
