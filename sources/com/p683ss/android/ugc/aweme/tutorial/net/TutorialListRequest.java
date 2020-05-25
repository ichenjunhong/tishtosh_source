package com.p683ss.android.ugc.aweme.tutorial.net;

import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import com.p683ss.android.ugc.aweme.tutorial.p2374a.C47378e;
import p064c.p065a.C2201v;

/* renamed from: com.ss.android.ugc.aweme.tutorial.net.TutorialListRequest */
public interface TutorialListRequest {
    @C12706h(mo23876a = "/aweme/v1/tutorial/detail/")
    C2201v<C47378e> getTutorialList(@C12724z(mo23894a = "tutorial_type") int i, @C12724z(mo23894a = "cursor") int i2, @C12724z(mo23894a = "count") int i3);
}
