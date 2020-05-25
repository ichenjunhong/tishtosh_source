package com.p683ss.android.ugc.aweme.userservice.jedi.p2385a;

import com.bytedance.jedi.p725a.p733f.C11585a;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.services.IMainService;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.userservice.api.C47589a;
import com.p683ss.android.ugc.aweme.userservice.jedi.model.JediFollowApi;
import p064c.p065a.C2201v;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.a */
public final class C47592a extends C11585a<String, Integer, C47589a, FollowStatus> {

    /* renamed from: a */
    public final JediFollowApi f120053a;

    public C47592a() {
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
        IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin();
        C52711k.m112236a((Object) createIMainServicebyMonsterPlugin, "ServiceManager.get()\n   …IMainService::class.java)");
        Object create = createIRetrofitServicebyMonsterPlugin.createNewRetrofit(createIMainServicebyMonsterPlugin.getApiUrlPrefix()).create(JediFollowApi.class);
        C52711k.m112236a(create, "ServiceManager.get()\n   …ediFollowApi::class.java)");
        this.f120053a = (JediFollowApi) create;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo22310b(Object obj) {
        C47589a aVar = (C47589a) obj;
        C52711k.m112240b(aVar, "req");
        return aVar.f120042a;
    }

    /* renamed from: a */
    public final /* synthetic */ C2201v mo22308a(Object obj) {
        C47589a aVar = (C47589a) obj;
        C52711k.m112240b(aVar, "req");
        if (aVar.f120046e == -1) {
            C2201v b = this.f120053a.follow(aVar.f120042a, aVar.f120043b, aVar.f120044c, aVar.f120045d, null, aVar.f120047f, null).mo6529b(C2168a.m6521b());
            C52711k.m112236a((Object) b, "service.follow(req.userI…scribeOn(Schedulers.io())");
            return b;
        }
        C2201v b2 = this.f120053a.follow(aVar.f120042a, aVar.f120043b, aVar.f120044c, aVar.f120045d, Integer.valueOf(aVar.f120046e), aVar.f120047f, Integer.valueOf(aVar.f120048g)).mo6529b(C2168a.m6521b());
        C52711k.m112236a((Object) b2, "service.follow(req.userI…scribeOn(Schedulers.io())");
        return b2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo22309a(Object obj, Object obj2) {
        FollowStatus followStatus = (FollowStatus) obj2;
        C52711k.m112240b((C47589a) obj, "req");
        C52711k.m112240b(followStatus, "resp");
        if (followStatus.status_code == 0) {
            return Integer.valueOf(followStatus.followStatus);
        }
        return null;
    }
}
