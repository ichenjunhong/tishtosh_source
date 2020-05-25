package com.p683ss.android.ugc.aweme.setting.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.setting.model.BlackList */
public class BlackList extends BaseResponse {
    @C17952c(mo34828a = "block_list")
    public List<User> blockList;
    @C17952c(mo34828a = "has_more")
    public boolean hasMore;
    @C17952c(mo34828a = "hotsoon_filtered_count")
    public int hotsoonFilteredCount;
    @C17952c(mo34828a = "hotsoon_has_more")
    public int hotsoonHasMore;
    @C17952c(mo34828a = "hotsoon_text")
    public String hotsoonText;
    @C17952c(mo34828a = "index")
    public int index;
}
