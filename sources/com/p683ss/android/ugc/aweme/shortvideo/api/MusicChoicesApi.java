package com.p683ss.android.ugc.aweme.shortvideo.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.choosemusic.p1513g.C24954a;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicList;
import java.util.concurrent.ExecutionException;
import p2666g.p2672c.C53075f;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.api.MusicChoicesApi */
public final class MusicChoicesApi {

    /* renamed from: a */
    static IRetrofit f107319a = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b);

    /* renamed from: b */
    private static IRetrofitService f107320b = RetrofitService.createIRetrofitServicebyMonsterPlugin();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.api.MusicChoicesApi$RealApi */
    interface RealApi {
        @C53075f(mo110603a = "/aweme/v1/commerce/music/choices/")
        C17832m<MusicList> getCommerceMusicList();

        @C53075f(mo110603a = "/aweme/v1/music/choices/")
        C17832m<MusicList> getMusicList();
    }

    /* renamed from: a */
    public static MusicList m93191a() throws Exception {
        try {
            if (C24954a.m60699b()) {
                return (MusicList) ((RealApi) f107319a.create(RealApi.class)).getCommerceMusicList().get();
            }
            return (MusicList) ((RealApi) f107319a.create(RealApi.class)).getMusicList().get();
        } catch (ExecutionException e) {
            throw f107320b.propagateCompatibleException(e);
        }
    }
}
