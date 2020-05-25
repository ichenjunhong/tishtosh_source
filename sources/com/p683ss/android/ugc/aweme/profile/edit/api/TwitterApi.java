package com.p683ss.android.ugc.aweme.profile.edit.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.ExecutionException;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.api.TwitterApi */
public final class TwitterApi {

    /* renamed from: a */
    private static final IRetrofit f101650a = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b);

    /* renamed from: b */
    private static IRetrofitService f101651b = RetrofitService.createIRetrofitServicebyMonsterPlugin();

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.api.TwitterApi$RealApi */
    interface RealApi {
        @C53084o(mo110612a = "/aweme/v1/twitter/bind/")
        @C53074e
        C17832m<String> bindTwitter(@C53072c(mo110600a = "twitter_id") String str, @C53072c(mo110600a = "twitter_name") String str2, @C53072c(mo110600a = "access_token") String str3, @C53072c(mo110600a = "secret_token") String str4);

        @C53075f(mo110603a = "/aweme/v1/twitter/unbind/")
        C17832m<String> unbindYouTube();
    }

    /* renamed from: a */
    public static String m88592a() throws Exception {
        try {
            return (String) ((RealApi) f101650a.create(RealApi.class)).unbindYouTube().get();
        } catch (ExecutionException e) {
            throw f101651b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static String m88593a(String str, String str2, String str3, String str4) throws Exception {
        try {
            return (String) ((RealApi) f101650a.create(RealApi.class)).bindTwitter(str, str2, str3, str4).get();
        } catch (ExecutionException e) {
            throw f101651b.propagateCompatibleException(e);
        }
    }
}
