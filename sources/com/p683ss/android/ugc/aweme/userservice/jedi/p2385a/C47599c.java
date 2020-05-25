package com.p683ss.android.ugc.aweme.userservice.jedi.p2385a;

import com.bytedance.jedi.p725a.p733f.C11585a;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.profile.model.CommitRemarkNameResponse;
import com.p683ss.android.ugc.aweme.services.IMainService;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.userservice.jedi.model.JediRemarkApi;
import com.p683ss.android.ugc.aweme.utils.C47865ew;
import p064c.p065a.C2201v;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.c */
public final class C47599c extends C11585a<String, String, C47600d, CommitRemarkNameResponse> {

    /* renamed from: a */
    private final JediRemarkApi f120064a;

    public C47599c() {
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
        IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin();
        C52711k.m112236a((Object) createIMainServicebyMonsterPlugin, "ServiceManager.get()\n   …IMainService::class.java)");
        Object create = createIRetrofitServicebyMonsterPlugin.createNewRetrofit(createIMainServicebyMonsterPlugin.getApiUrlPrefix()).create(JediRemarkApi.class);
        C52711k.m112236a(create, "ServiceManager.get()\n   …ediRemarkApi::class.java)");
        this.f120064a = (JediRemarkApi) create;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo22310b(Object obj) {
        C47600d dVar = (C47600d) obj;
        C52711k.m112240b(dVar, "req");
        return dVar.f120065a;
    }

    /* renamed from: a */
    public final /* synthetic */ C2201v mo22308a(Object obj) {
        C47600d dVar = (C47600d) obj;
        C52711k.m112240b(dVar, "req");
        JediRemarkApi jediRemarkApi = this.f120064a;
        String str = dVar.f120066b;
        String str2 = dVar.f120065a;
        String c = C47865ew.m103536a().mo95083c(dVar.f120065a);
        C52711k.m112236a((Object) c, "SecUidManager.get().get(req.userId)");
        C2201v b = jediRemarkApi.commitRemarkName(str, str2, c).mo6529b(C2168a.m6521b());
        C52711k.m112236a((Object) b, "service.commitRemarkName…scribeOn(Schedulers.io())");
        return b;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo22309a(Object obj, Object obj2) {
        CommitRemarkNameResponse commitRemarkNameResponse = (CommitRemarkNameResponse) obj2;
        C52711k.m112240b((C47600d) obj, "req");
        C52711k.m112240b(commitRemarkNameResponse, "resp");
        if (commitRemarkNameResponse.statusCode == 0) {
            return commitRemarkNameResponse.remarkName;
        }
        return null;
    }
}
