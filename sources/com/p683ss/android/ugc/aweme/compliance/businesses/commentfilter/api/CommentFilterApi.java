package com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.api;

import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.p1604b.C27036a;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0013i;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.api.CommentFilterApi */
public final class CommentFilterApi {

    /* renamed from: a */
    public static API f71349a = ((API) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(API.class));

    /* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.api.CommentFilterApi$API */
    public interface API {
        @C53075f(mo110603a = "/aweme/v2/comment/filter/get_words/")
        C0013i<C27036a> getCommentFilterKeywords();

        @C53084o(mo110612a = "/aweme/v2/comment/filter/update_words/")
        C0013i<BaseResponse> setCommentFilterKeywords(@C53089t(mo110619a = "words") String str);
    }
}
