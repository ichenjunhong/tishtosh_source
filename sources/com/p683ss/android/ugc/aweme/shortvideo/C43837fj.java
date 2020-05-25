package com.p683ss.android.ugc.aweme.shortvideo;

import com.google.p1057b.p1065h.p1066a.C17825i;
import com.google.p1057b.p1065h.p1066a.C17833n;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fj */
final /* synthetic */ class C43837fj implements Callable {

    /* renamed from: a */
    static final Callable f110999a = new C43837fj();

    private C43837fj() {
    }

    public final Object call() {
        IRetrofit createNewRetrofit = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(AVApiImpl.createAVApibyMonsterPlugin().getAPI_URL_PREFIX_SI());
        C17825i.m43740a(((RetrofitService) createNewRetrofit.create(RetrofitService.class)).getUploadAuthKeyConfig(new LinkedHashMap(0)), new C42381a(0), C17833n.m43743a());
        return null;
    }
}
