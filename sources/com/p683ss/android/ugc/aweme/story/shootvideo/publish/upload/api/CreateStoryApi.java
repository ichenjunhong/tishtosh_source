package com.p683ss.android.ugc.aweme.story.shootvideo.publish.upload.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.story.shootvideo.publish.upload.model.CreateStoryResponse;
import java.util.LinkedHashMap;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53073d;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.publish.upload.api.CreateStoryApi */
public final class CreateStoryApi {

    /* renamed from: a */
    private static API f117724a = ((API) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(API.class));

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.publish.upload.api.CreateStoryApi$API */
    public interface API {
        @C53084o(mo110612a = "/aweme/v1/life/create/story/")
        @C53074e
        C17832m<CreateStoryResponse> createStory(@C53072c(mo110600a = "media_id") String str, @C53073d LinkedHashMap<String, String> linkedHashMap);
    }
}
