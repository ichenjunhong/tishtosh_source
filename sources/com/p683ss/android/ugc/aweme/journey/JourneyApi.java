package com.p683ss.android.ugc.aweme.journey;

import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.journey.JourneyApi */
public interface JourneyApi {

    /* renamed from: com.ss.android.ugc.aweme.journey.JourneyApi$a */
    public static final class C35714a {
    }

    @C53075f(mo110603a = "/aweme/v1/config/list/")
    C2201v<C35768n> getJourney(@C53089t(mo110619a = "recommend_group") int i, @C53089t(mo110619a = "type") String str);

    @C53084o(mo110612a = "aweme/v1/user/preferences/set/")
    @C53074e
    C2201v<BaseResponse> uploadGender(@C53072c(mo110600a = "gender") Integer num);

    @C53084o(mo110612a = "aweme/v1/user/interest/select/")
    @C53074e
    C2201v<BaseResponse> uploadInterest(@C53072c(mo110600a = "selectedInterestList") String str);
}
