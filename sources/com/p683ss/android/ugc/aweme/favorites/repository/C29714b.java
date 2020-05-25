package com.p683ss.android.ugc.aweme.favorites.repository;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.jedi.p725a.p733f.C11585a;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.favorites.p1701a.C29659b;
import com.p683ss.android.ugc.aweme.favorites.p1701a.C29660c;
import com.p683ss.android.ugc.aweme.location.C36272l;
import com.p683ss.android.ugc.aweme.poi.C39054d;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.favorites.repository.b */
public final class C29714b extends C11585a<Integer, List<? extends C29660c>, C29713a, C29659b> {

    /* renamed from: a */
    private final PoiCollectionJediApi f77629a;

    public C29714b() {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(PoiCollectionJediApi.class);
        C52711k.m112236a(create, "ServiceManager.get().get…ctionJediApi::class.java)");
        this.f77629a = (PoiCollectionJediApi) create;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo22310b(Object obj) {
        C29713a aVar = (C29713a) obj;
        C52711k.m112240b(aVar, "req");
        return Integer.valueOf(aVar.f77627a);
    }

    /* renamed from: a */
    public final /* synthetic */ C2201v mo22308a(Object obj) {
        C29713a aVar = (C29713a) obj;
        C52711k.m112240b(aVar, "req");
        C39054d a = C36272l.m81897a(C11010c.m22280a()).mo75072a();
        if (a != null) {
            C2201v b = this.f77629a.getPoiCollection(aVar.f77627a, aVar.f77628b, String.valueOf(a.longitude), String.valueOf(a.latitude)).mo6529b(C2168a.m6521b());
            C52711k.m112236a((Object) b, "service.getPoiCollection…scribeOn(Schedulers.io())");
            return b;
        }
        C2201v b2 = this.f77629a.getPoiCollection(aVar.f77627a, aVar.f77628b, "", "").mo6529b(C2168a.m6521b());
        C52711k.m112236a((Object) b2, "service.getPoiCollection…scribeOn(Schedulers.io())");
        return b2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo22309a(Object obj, Object obj2) {
        C29659b bVar = (C29659b) obj2;
        C52711k.m112240b((C29713a) obj, "req");
        C52711k.m112240b(bVar, "resp");
        if (bVar.status_code == 0) {
            return bVar.f77530a;
        }
        return null;
    }
}
