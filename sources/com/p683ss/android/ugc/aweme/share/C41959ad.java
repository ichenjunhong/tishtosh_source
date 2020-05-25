package com.p683ss.android.ugc.aweme.share;

import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.sticker.model.C46070e;
import com.p683ss.android.ugc.aweme.sticker.prop.api.StickerPropApi;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.share.ad */
final /* synthetic */ class C41959ad implements Callable {

    /* renamed from: a */
    private final Effect f106212a;

    C41959ad(Effect effect) {
        this.f106212a = effect;
    }

    public final Object call() {
        return (C46070e) ((StickerPropApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(StickerPropApi.class)).getStickerDetail(this.f106212a.getEffectId()).get();
    }
}
