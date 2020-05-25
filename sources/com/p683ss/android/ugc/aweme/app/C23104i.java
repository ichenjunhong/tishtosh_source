package com.p683ss.android.ugc.aweme.app;

import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.net.CommonApi;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.app.i */
public final class C23104i {

    /* renamed from: a */
    public static final String f61522a;

    /* renamed from: b */
    public static final String f61523b;

    /* renamed from: c */
    public static final CommonApi f61524c = ((CommonApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(CommonApi.class));

    /* renamed from: d */
    private static final String f61525d;

    /* renamed from: a */
    public static void m56672a() {
        C23566n.m57766a().mo48750a(null, new Callable() {
            public final Object call() throws Exception {
                Api.m56468a((String) C23104i.f61524c.doGet(C23104i.f61522a).execute().f33552b, C23104i.f61522a);
                return null;
            }
        }, 0);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Api.f61282b);
        sb.append("/aweme/v1/check/in/");
        f61522a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Api.f61282b);
        sb2.append("/aweme/v1/check/out/");
        f61523b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Api.f61282b);
        sb3.append("/aweme/v1/device/update/");
        f61525d = sb3.toString();
    }
}
