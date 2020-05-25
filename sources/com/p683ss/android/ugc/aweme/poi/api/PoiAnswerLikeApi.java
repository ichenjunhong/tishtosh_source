package com.p683ss.android.ugc.aweme.poi.api;

import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.poi.api.PoiAnswerLikeApi */
public interface PoiAnswerLikeApi {

    /* renamed from: a */
    public static final C39039a f99529a = C39039a.f99530a;

    /* renamed from: com.ss.android.ugc.aweme.poi.api.PoiAnswerLikeApi$a */
    public static final class C39039a {

        /* renamed from: a */
        static final /* synthetic */ C39039a f99530a = new C39039a();

        private C39039a() {
        }
    }

    @C53084o(mo110612a = "/aweme/v1/poi/answer/digg/")
    @C53074e
    C2201v<BaseResponse> uploadAnswerLike(@C53072c(mo110600a = "answer_id") String str, @C53072c(mo110600a = "digg_action") int i);
}
