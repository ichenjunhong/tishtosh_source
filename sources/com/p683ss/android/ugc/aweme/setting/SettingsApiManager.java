package com.p683ss.android.ugc.aweme.setting;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.setting.SettingsApiManager */
public final class SettingsApiManager {

    /* renamed from: com.ss.android.ugc.aweme.setting.SettingsApiManager$UserSettingsApi */
    interface UserSettingsApi {
        @C53075f(mo110603a = "/aweme/v1/user/set/settings/")
        C17832m<BaseResponse> setItem(@C53089t(mo110619a = "field") String str, @C53089t(mo110619a = "value") int i);
    }
}
