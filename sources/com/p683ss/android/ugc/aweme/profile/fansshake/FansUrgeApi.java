package com.p683ss.android.ugc.aweme.profile.fansshake;

import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import p001a.C0013i;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.profile.fansshake.FansUrgeApi */
public interface FansUrgeApi {
    @C53084o(mo110612a = "/aweme/v1/commit/urge/")
    C0013i<BaseResponse> urge(@C53089t(mo110619a = "user_id") String str);
}
