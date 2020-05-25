package com.p683ss.android.ugc.aweme.sign;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.sign.RecordManager */
public final class RecordManager {

    /* renamed from: a */
    private static RecordApi f115419a = ((RecordApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(RecordApi.class));

    /* renamed from: com.ss.android.ugc.aweme.sign.RecordManager$RecordApi */
    interface RecordApi {
        @C53075f(mo110603a = "/aweme/v1/sign/gain/url/")
        C17832m<RecordResponseInfo> getRecordInfo(@C53089t(mo110619a = "video_id") String str);
    }
}
