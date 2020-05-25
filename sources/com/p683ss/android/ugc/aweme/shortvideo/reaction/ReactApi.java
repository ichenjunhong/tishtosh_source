package com.p683ss.android.ugc.aweme.shortvideo.reaction;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.services.RetrofitService;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.ReactApi */
public final class ReactApi {

    /* renamed from: a */
    static final IReactApi f112348a = ((IReactApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(IReactApi.class));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.ReactApi$IReactApi */
    public interface IReactApi {
        @C12706h(mo23876a = "/aweme/v1/aweme/react/info/")
        C12690b<C44409a> fetchReactApi(@C12724z(mo23894a = "aweme_id") String str);
    }
}
