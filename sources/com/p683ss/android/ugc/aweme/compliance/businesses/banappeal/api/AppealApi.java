package com.p683ss.android.ugc.aweme.compliance.businesses.banappeal.api;

import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.compliance.business.api.model.AppealStatusResponse;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0013i;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.compliance.businesses.banappeal.api.AppealApi */
public interface AppealApi {

    /* renamed from: a */
    public static final C27028a f71337a = C27028a.f71339b;

    /* renamed from: com.ss.android.ugc.aweme.compliance.businesses.banappeal.api.AppealApi$a */
    public static final class C27028a {

        /* renamed from: a */
        public static final AppealApi f71338a = ((AppealApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(AppealApi.class));

        /* renamed from: b */
        static final /* synthetic */ C27028a f71339b = new C27028a();

        private C27028a() {
        }
    }

    @C53075f(mo110603a = "/aweme/v2/appeal/status/")
    C0013i<AppealStatusResponse> getUserAppealStatus(@C53089t(mo110619a = "object_type") String str, @C53089t(mo110619a = "object_id") String str2);
}
