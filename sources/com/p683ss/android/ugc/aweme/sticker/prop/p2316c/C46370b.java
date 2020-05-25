package com.p683ss.android.ugc.aweme.sticker.prop.p2316c;

import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.sticker.model.C46070e;
import com.p683ss.android.ugc.aweme.sticker.prop.api.StickerPropApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.c.b */
final /* synthetic */ class C46370b implements Callable {

    /* renamed from: a */
    private final String f116985a;

    C46370b(String str) {
        this.f116985a = str;
    }

    public final Object call() {
        return (C46070e) ((StickerPropApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(StickerPropApi.class)).getStickerDetail(this.f116985a).get();
    }
}
