package com.bytedance.android.livesdk.rank.model;

import com.google.gson.p1076a.C17952c;
import java.util.List;

public class CurrentRankListResponse {
    @C17952c(mo34828a = "has_more")
    public boolean hasMore;
    @C17952c(mo34828a = "music_wave")
    public String musicWave;
    @C17952c(mo34828a = "ranks")
    public List<C8219f> ranks;
    @C17952c(mo34828a = "seats")
    public List<C8219f> seats;
    @C17952c(mo34828a = "self_info")
    public C8219f selfInfo;
    @C17952c(mo34828a = "total")
    public long total;
}
