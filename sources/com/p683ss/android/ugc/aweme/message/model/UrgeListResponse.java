package com.p683ss.android.ugc.aweme.message.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.message.model.UrgeListResponse */
public class UrgeListResponse extends BaseResponse {
    @C17952c(mo34828a = "has_history")
    public int hasHistory;
    @C17952c(mo34828a = "has_more")
    public int hasMore;
    @C17952c(mo34828a = "cursor")
    public long timestamp;
    @C17952c(mo34828a = "total")
    public long total;
    @C17952c(mo34828a = "urge_list")
    public List<UrgeUserStruct> urgeList;
    @C17952c(mo34828a = "user_type")
    public int userType;
}
