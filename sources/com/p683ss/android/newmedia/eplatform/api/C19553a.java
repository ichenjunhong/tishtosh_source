package com.p683ss.android.newmedia.eplatform.api;

import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.newmedia.eplatform.api.a */
public final class C19553a {

    /* renamed from: a */
    public static final C19553a f53930a = new C19553a();

    /* renamed from: b */
    private static final EPlatformApi f53931b;

    private C19553a() {
    }

    static {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit("https://aweme.snssdk.com/").create(EPlatformApi.class);
        C52711k.m112236a(create, "ServiceManager.get().get…EPlatformApi::class.java)");
        f53931b = (EPlatformApi) create;
    }

    /* renamed from: a */
    public static final C0013i<C19554b> m47850a(String str) {
        C52711k.m112240b(str, "schema");
        return f53931b.hostVerify(str);
    }
}
