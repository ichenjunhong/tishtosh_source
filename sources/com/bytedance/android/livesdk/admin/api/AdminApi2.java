package com.bytedance.android.livesdk.admin.api;

import com.bytedance.android.live.network.response.C4172a;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.admin.p274b.C4530a;
import com.bytedance.android.livesdk.admin.p274b.C4531b;
import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface AdminApi2 {
    @C12706h(mo23876a = "/webcast/user/admin/list/")
    C2201v<C4172a<C4531b, C4530a>> fetchAdministrators(@C12724z(mo23894a = "anchor_id") long j, @C12724z(mo23894a = "sec_anchor_id") String str, @C12724z(mo23894a = "sec_user_id") String str2);

    @C12718t(mo23886a = "/webcast/user/admin/update/")
    @C12705g
    C2201v<C4177d<Object>> updateAdmin(@C12703e(mo23873a = "update_type") int i, @C12703e(mo23873a = "to_user_id") long j, @C12703e(mo23873a = "anchor_id") long j2, @C12703e(mo23873a = "current_room_id") long j3);
}
