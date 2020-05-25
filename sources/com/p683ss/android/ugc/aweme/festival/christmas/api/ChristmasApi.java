package com.p683ss.android.ugc.aweme.festival.christmas.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.detail.p1625g.C27337a;
import com.p683ss.android.ugc.aweme.festival.christmas.p1740a.C31359a;
import com.p683ss.android.ugc.aweme.festival.christmas.p1740a.C31360b;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0013i;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.festival.christmas.api.ChristmasApi */
public final class ChristmasApi {

    /* renamed from: a */
    private static API f82137a = ((API) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(API.class));

    /* renamed from: com.ss.android.ugc.aweme.festival.christmas.api.ChristmasApi$API */
    public interface API {
        @C53075f(mo110603a = "/aweme/v1/activity/unlock/status/")
        C17832m<C31359a> getActivityUnlockStatus(@C53089t(mo110619a = "user_id") String str);

        @C53075f(mo110603a = "/aweme/v1/multi/aweme/detail/")
        C0013i<C27337a> getAwemeDetail(@C53089t(mo110619a = "aweme_ids") String str);

        @C53075f(mo110603a = "/aweme/v1/activity/share/ecard/")
        C0013i<Object> getECardShareStats(@C53089t(mo110619a = "item_id") String str);

        @C53075f(mo110603a = "/aweme/v1/activity/item/share_card/")
        C2201v<Object> getSharePanelStatus(@C53089t(mo110619a = "item_id") String str, @C53089t(mo110619a = "activity_type") int i);

        @C53075f(mo110603a = "/aweme/v1/activity/share/stats/")
        C0013i<Object> getShareStats(@C53089t(mo110619a = "item_id") String str);

        @C53084o(mo110612a = "/aweme/v1/activity/donation/create/")
        @C53074e
        C2201v<C31360b> participateFestivalActivity(@C53072c(mo110600a = "item_id") String str, @C53072c(mo110600a = "donation_type") int i, @C53072c(mo110600a = "activity_type") int i2);

        @C53075f(mo110603a = "/aweme/v1/activity/share/record/")
        C0013i<BaseResponse> reportShareEvent(@C53089t(mo110619a = "item_id") String str, @C53089t(mo110619a = "user_id") String str2);
    }

    /* renamed from: a */
    public static API m73109a() {
        return f82137a;
    }
}
