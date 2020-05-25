package com.p683ss.android.ugc.aweme.follow.recommend.follow.repo;

import com.bytedance.jedi.p725a.p733f.C11585a;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.friends.model.RecommendList;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.C2201v;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.repo.b */
public final class C31890b extends C11585a<C31906d, List<? extends C31907e>, C31906d, RecommendList> {

    /* renamed from: a */
    private final RecommendFollowApi f83330a;

    public C31890b() {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(RecommendFollowApi.class);
        C52711k.m112236a(create, "ServiceManager.get().get…endFollowApi::class.java)");
        this.f83330a = (RecommendFollowApi) create;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo22310b(Object obj) {
        C31906d dVar = (C31906d) obj;
        C52711k.m112240b(dVar, "req");
        return dVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C2201v mo22308a(Object obj) {
        C31906d dVar = (C31906d) obj;
        C52711k.m112240b(dVar, "req");
        return this.f83330a.recommendList(dVar.f83343a, dVar.f83344b, dVar.f83345c, dVar.f83346d, dVar.f83347e, dVar.f83348f, dVar.f83349g, dVar.f83350h, dVar.f83351i);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo22309a(Object obj, Object obj2) {
        RecommendList recommendList = (RecommendList) obj2;
        C52711k.m112240b((C31906d) obj, "req");
        C52711k.m112240b(recommendList, "resp");
        if (recommendList.status_code != 0) {
            return null;
        }
        List recommendFollowList = recommendList.getRecommendFollowList();
        Iterable iterable = recommendFollowList;
        List userList = recommendList.getUserList();
        C52711k.m112236a((Object) userList, "resp.userList");
        Iterable iterable2 = userList;
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C52575l.m112104a(iterable, 10), C52575l.m112104a(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            User user = (User) it2.next();
            C31907e eVar = (C31907e) it.next();
            C52711k.m112236a((Object) user, "user");
            eVar.mo65112a(user);
            arrayList.add(eVar);
        }
        return recommendFollowList;
    }
}
