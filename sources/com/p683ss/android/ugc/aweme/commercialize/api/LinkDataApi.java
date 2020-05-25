package com.p683ss.android.ugc.aweme.commercialize.api;

import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0013i;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.commercialize.api.LinkDataApi */
public final class LinkDataApi {

    /* renamed from: a */
    public static final String f67865a = Api.f61282b;

    /* renamed from: b */
    static final RealApi f67866b = ((RealApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(f67865a).create(RealApi.class));

    /* renamed from: c */
    static String f67867c = null;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.LinkDataApi$RealApi */
    interface RealApi {
        @C53075f(mo110603a = "/api/ad/v1/adlink/")
        C0013i<C25646e> requestLinkData(@C53089t(mo110619a = "ad_from") String str, @C53089t(mo110619a = "item_ids") String str2, @C53089t(mo110619a = "pull_type") Integer num, @C53089t(mo110619a = "last_item_ids") String str3, @C53089t(mo110619a = "pre_item_ids") String str4, @C53089t(mo110619a = "mac_address") String str5);
    }
}
