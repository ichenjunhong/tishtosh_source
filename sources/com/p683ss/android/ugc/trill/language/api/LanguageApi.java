package com.p683ss.android.ugc.trill.language.api;

import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.trill.language.model.ConfigListResponse;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.trill.language.api.LanguageApi */
public interface LanguageApi {
    @C53075f(mo110603a = "/aweme/v1/config/list/")
    C2201v<ConfigListResponse> getUnloginContentLanguage(@C53089t(mo110619a = "type") String str, @C53089t(mo110619a = "content_language") String str2);

    @C53075f(mo110603a = "/aweme/v1/config/list/")
    C2201v<ConfigListResponse> getUserConfig(@C53089t(mo110619a = "type") String str);

    @C53084o(mo110612a = "/aweme/v1/user/set/settings/")
    @C53074e
    C2201v<BaseResponse> setContentLanguage(@C53072c(mo110600a = "field") String str, @C53072c(mo110600a = "content_language") String str2, @C53072c(mo110600a = "action_type") int i);

    @C53084o(mo110612a = "/aweme/v1/user/set/settings/")
    @C53074e
    C2201v<BaseResponse> setContentLanguageDialogShown(@C53072c(mo110600a = "field") String str);

    @C53084o(mo110612a = "/aweme/v1/user/set/settings/")
    @C53074e
    C2201v<BaseResponse> setUnloginContentPreference(@C53072c(mo110600a = "field") String str, @C53072c(mo110600a = "settings_not_login") String str2);
}
