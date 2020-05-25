package com.p683ss.android.ugc.aweme.profile;

import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import p064c.p065a.C1680ad;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.profile.PushSettingApi */
public interface PushSettingApi {
    @C53075f(mo110603a = "/aweme/v1/user/set/settings/")
    C1680ad<BaseResponse> setItem(@C53089t(mo110619a = "field") String str, @C53089t(mo110619a = "value") int i);
}
