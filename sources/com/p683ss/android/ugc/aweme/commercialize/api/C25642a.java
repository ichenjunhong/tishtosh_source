package com.p683ss.android.ugc.aweme.commercialize.api;

import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.services.RetrofitService;

/* renamed from: com.ss.android.ugc.aweme.commercialize.api.a */
public final class C25642a {
    /* renamed from: a */
    public static <T> T m62165a(Class<T> cls) {
        return RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(cls);
    }
}
