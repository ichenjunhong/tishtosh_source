package com.p683ss.android.ugc.aweme.message.api;

import com.p683ss.android.ugc.aweme.message.model.MultiUserNoticeCountResponse;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0013i;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.message.api.MultiUserNoticeApi */
public final class MultiUserNoticeApi {

    /* renamed from: a */
    public static final MultiUserNoticeRetrofitApi f93993a = ((MultiUserNoticeRetrofitApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(TutorialVideoApiManager.f96873a).create(MultiUserNoticeRetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.message.api.MultiUserNoticeApi$MultiUserNoticeRetrofitApi */
    public interface MultiUserNoticeRetrofitApi {
        @C53075f(mo110603a = "/aweme/v1/notice/multi_user/count/")
        C0013i<MultiUserNoticeCountResponse> getMultiUserNoticeCount(@C53089t(mo110619a = "user_ids") String str);
    }
}
