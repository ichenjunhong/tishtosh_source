package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.api;

import com.bytedance.retrofit2.C12690b;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.Map;
import p2666g.p2672c.C53073d;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.api.DislikeReasonApi */
public final class DislikeReasonApi {

    /* renamed from: a */
    public static final RealApi f81337a = ((RealApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(RealApi.class));

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.api.DislikeReasonApi$RealApi */
    public interface RealApi {
        @C53084o(mo110612a = "/aweme/v1/commit/dislike/item/")
        @C53074e
        C12690b<BaseResponse> disLikeReason(@C53073d Map<String, String> map);
    }
}
