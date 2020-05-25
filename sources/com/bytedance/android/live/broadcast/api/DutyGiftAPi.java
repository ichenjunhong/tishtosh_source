package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.api.model.DutyGiftInfo;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface DutyGiftAPi {
    @C12706h(mo23876a = "/webcast/gift/duty_gift/")
    C2201v<C4177d<DutyGiftInfo>> dutyGiftRequest(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "anchor_id") long j2, @C12724z(mo23894a = "op_type") long j3, @C12724z(mo23894a = "is_cut_short") boolean z);
}
