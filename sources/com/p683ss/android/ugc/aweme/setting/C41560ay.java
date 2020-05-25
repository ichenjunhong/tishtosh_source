package com.p683ss.android.ugc.aweme.setting;

import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.shortvideo.AVApiImpl;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.ay */
public final /* synthetic */ class C41560ay implements Callable {

    /* renamed from: a */
    private final String f105266a;

    /* renamed from: b */
    private final int f105267b;

    public C41560ay(String str, int i) {
        this.f105266a = str;
        this.f105267b = i;
    }

    public final Object call() {
        ((UserSettingsApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(AVApiImpl.createAVApibyMonsterPlugin().getAPI_URL_PREFIX_SI()).create(UserSettingsApi.class)).setItem(this.f105266a, this.f105267b);
        return null;
    }
}
