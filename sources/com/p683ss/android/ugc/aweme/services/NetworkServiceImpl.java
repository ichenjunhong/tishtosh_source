package com.p683ss.android.ugc.aweme.services;

import com.google.gson.C17971f;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.net.C37809s;
import com.p683ss.android.ugc.aweme.port.p2082in.C39576ax;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import okhttp3.C53682y;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.NetworkServiceImpl */
public final class NetworkServiceImpl implements C39576ax {
    public final String getApiHost() {
        String str = C18845b.f52037b;
        C52711k.m112236a((Object) str, "CommonConstants.API_URL_PREFIX_API");
        return str;
    }

    public final C17971f getRetrofitFactoryGson() {
        C17971f gson = C47759cc.m103382a().getGson();
        C52711k.m112236a((Object) gson, "GsonProvider.get().getGson()");
        return gson;
    }

    public final C53682y getOKHttpClient() {
        C37809s a = C37809s.m84409a();
        C52711k.m112236a((Object) a, "OkHttpManager.getSingleton()");
        C53682y b = a.mo77268b();
        C52711k.m112236a((Object) b, "OkHttpManager.getSingleton().retrofitClient");
        return b;
    }

    public final <T> T retrofitCreate(String str, Class<T> cls) {
        C52711k.m112240b(str, "baseUrl");
        C52711k.m112240b(cls, "api");
        return RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(str).create(cls);
    }
}
