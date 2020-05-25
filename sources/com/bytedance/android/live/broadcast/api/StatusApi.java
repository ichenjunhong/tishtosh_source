package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface StatusApi {
    @C12706h(mo23876a = "/webcast/room/ping/anchor/")
    C2201v<C4177d<Void>> sendStatus(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "status") int i, @C12724z(mo23894a = "stream_id") long j2, @C12724z(mo23894a = "reason_no") int i2);
}
