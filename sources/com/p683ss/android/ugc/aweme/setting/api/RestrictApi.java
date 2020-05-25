package com.p683ss.android.ugc.aweme.setting.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.setting.model.CommonResponse;
import com.p683ss.android.ugc.aweme.setting.model.RestrictInfo;
import com.p683ss.android.ugc.aweme.setting.model.RestrictInfoResponse;
import java.util.concurrent.ExecutionException;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.setting.api.RestrictApi */
public final class RestrictApi {

    /* renamed from: a */
    private static final RealApi f105242a = ((RealApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(RealApi.class));

    /* renamed from: b */
    private static IRetrofitService f105243b = RetrofitService.createIRetrofitServicebyMonsterPlugin();

    /* renamed from: com.ss.android.ugc.aweme.setting.api.RestrictApi$RealApi */
    interface RealApi {
        @C53075f(mo110603a = "/aweme/v1/item/restrict/info/")
        C17832m<RestrictInfoResponse> getRestrictInfo(@C53089t(mo110619a = "target_iid") String str);

        @C53084o(mo110612a = "/aweme/v1/item/restrict/")
        @C53074e
        C17832m<CommonResponse> restrictAweme(@C53072c(mo110600a = "target_iid") String str);

        @C53084o(mo110612a = "/aweme/v1/user/restrict/")
        @C53074e
        C17832m<CommonResponse> restrictUser(@C53072c(mo110600a = "target_uid") String str);
    }

    /* renamed from: b */
    public static CommonResponse m91376b(String str) throws Exception {
        try {
            return (CommonResponse) f105242a.restrictAweme(str).get();
        } catch (ExecutionException e) {
            throw f105243b.propagateCompatibleException(e);
        }
    }

    /* renamed from: c */
    public static CommonResponse m91377c(String str) throws Exception {
        try {
            return (CommonResponse) f105242a.restrictUser(str).get();
        } catch (ExecutionException e) {
            throw f105243b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static RestrictInfo m91375a(String str) throws Exception {
        try {
            RestrictInfoResponse restrictInfoResponse = (RestrictInfoResponse) f105242a.getRestrictInfo(str).get();
            if (restrictInfoResponse != null) {
                restrictInfoResponse.mRestrictInfo.awemeId = str;
            }
            if (restrictInfoResponse == null) {
                return null;
            }
            return restrictInfoResponse.mRestrictInfo;
        } catch (ExecutionException e) {
            throw f105243b.propagateCompatibleException(e);
        }
    }
}
