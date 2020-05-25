package com.p683ss.android.ugc.aweme.antiaddic.lock.api;

import android.text.TextUtils;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.C22716a;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.Map;
import p2666g.p2672c.C53073d;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.api.ParentalPlatformApi */
public final class ParentalPlatformApi {

    /* renamed from: a */
    public static final String f60909a = Api.f61282b;

    /* renamed from: b */
    public static ParentalApi f60910b = ((ParentalApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(f60909a).create(ParentalApi.class));

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.api.ParentalPlatformApi$ParentalApi */
    public interface ParentalApi {
        @C53075f(mo110603a = " /aweme/v1/guardian/platform/dynamic/password/")
        C17832m<C22716a> getDynamicPassword(@C53089t(mo110619a = "user_id") String str);

        @C53084o(mo110612a = " /aweme/v1/guardian/platform/child/manage/")
        @C53074e
        C17832m<BaseResponse> modifyChildSetting(@C53073d Map<String, String> map);

        @C53075f(mo110603a = "/aweme/v1/guardian/platform/verify/password/")
        C17832m<BaseResponse> verifyPassword(@C53089t(mo110619a = "password") String str);
    }

    /* renamed from: a */
    public static C17832m<BaseResponse> m55930a(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str) || map.isEmpty()) {
            return null;
        }
        map.put("user_id", str);
        return f60910b.modifyChildSetting(map);
    }
}
