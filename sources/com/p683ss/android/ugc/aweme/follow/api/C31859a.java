package com.p683ss.android.ugc.aweme.follow.api;

import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.follow.api.a */
public final class C31859a {

    /* renamed from: a */
    public static IFollowFeedApiV1 f83239a;

    /* renamed from: b */
    public static final C31860a f83240b = new C31860a(null);

    /* renamed from: c */
    private static IRetrofitService f83241c;

    /* renamed from: com.ss.android.ugc.aweme.follow.api.a$a */
    public static final class C31860a {
        private C31860a() {
        }

        public /* synthetic */ C31860a(C52707g gVar) {
            this();
        }
    }

    static {
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
        C52711k.m112236a((Object) createIRetrofitServicebyMonsterPlugin, "ServiceManager.get().get…rofitService::class.java)");
        IRetrofitService iRetrofitService = createIRetrofitServicebyMonsterPlugin;
        f83241c = iRetrofitService;
        Object create = iRetrofitService.createNewRetrofit(C18845b.f52040e).create(IFollowFeedApiV1.class);
        C52711k.m112236a(create, "retrofitService.createNe…lowFeedApiV1::class.java)");
        f83239a = (IFollowFeedApiV1) create;
    }
}
