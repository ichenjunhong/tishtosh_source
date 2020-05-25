package com.bytedance.android.livesdk.user;

import com.bytedance.android.live.base.model.user.C3007g;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p831b.C12694aa;
import com.bytedance.retrofit2.p831b.C12700b;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12724z;
import java.util.HashMap;
import p064c.p065a.C1680ad;

public interface UserApi {
    @C12706h(mo23876a = "/webcast/user/")
    C1680ad<C4177d<User>> queryUser(@C12724z(mo23894a = "target_uid") long j, @C12724z(mo23894a = "packed_level") long j2, @C12724z(mo23894a = "sec_target_uid") String str);

    @C12706h(mo23876a = "/webcast/user/")
    C1680ad<C4177d<User>> queryUser(@C12694aa HashMap<String, String> hashMap);

    @C12718t(mo23886a = "/webcast/room/upload/image/")
    C1680ad<C4177d<C3007g>> uploadAvatar(@C12700b TypedOutput typedOutput);
}
