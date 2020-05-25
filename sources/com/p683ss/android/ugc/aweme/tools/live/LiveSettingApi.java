package com.p683ss.android.ugc.aweme.tools.live;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.shortvideo.AVApiImpl;
import p001a.C0013i;
import p2666g.p2672c.C53075f;

/* renamed from: com.ss.android.ugc.aweme.tools.live.LiveSettingApi */
public final class LiveSettingApi {

    /* renamed from: a */
    public static API f118854a = ((API) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(AVApiImpl.createAVApibyMonsterPlugin().getAPI_URL_PREFIX_SI()).create(API.class));

    /* renamed from: com.ss.android.ugc.aweme.tools.live.LiveSettingApi$API */
    public interface API {
        @C53075f(mo110603a = "/aweme/v1/live/podcast/")
        C0013i<C47068a> getLivePodCast();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.LiveSettingApi$a */
    public class C47068a extends BaseResponse {
        @C17952c(mo34828a = "can_be_live_podcast")

        /* renamed from: a */
        public boolean f118855a;
    }
}
