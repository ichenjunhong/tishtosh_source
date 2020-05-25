package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.UploadTimeLockPasswordApi */
public final class UploadTimeLockPasswordApi {

    /* renamed from: a */
    public static final String f60982a = Api.f61282b;

    /* renamed from: b */
    public static UploadApi f60983b = ((UploadApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(f60982a).create(UploadApi.class));

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.UploadTimeLockPasswordApi$UploadApi */
    interface UploadApi {
        @C53084o(mo110612a = "/aweme/v2/user/teenmode/")
        @C53074e
        C17832m<BaseResponse> upload(@C53072c(mo110600a = "password") String str, @C53072c(mo110600a = "user_id") String str2);
    }
}
