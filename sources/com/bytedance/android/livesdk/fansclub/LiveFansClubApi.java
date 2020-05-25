package com.bytedance.android.livesdk.fansclub;

import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface LiveFansClubApi {
    @C12706h
    C2201v<C6784g> queryFansClubInfo(@C12699af String str, @C12724z(mo23894a = "anchor_id") long j);

    @C12706h
    C2201v<Object> queryFansDouyinClubInfo(@C12699af String str, @C12724z(mo23894a = "anchor_id") long j);
}
