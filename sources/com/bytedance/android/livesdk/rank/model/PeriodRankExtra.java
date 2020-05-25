package com.bytedance.android.livesdk.rank.model;

import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.base.model.user.User;
import com.google.gson.p1076a.C17952c;

public class PeriodRankExtra extends Extra {
    @C17952c(mo34828a = "gap_description")
    public String gapDescription;
    @C17952c(mo34828a = "self_info")
    public User mUser;
    @C17952c(mo34828a = "self_rank")
    public int selfRank;
    @C17952c(mo34828a = "self_score")
    public long selfScore;
}
