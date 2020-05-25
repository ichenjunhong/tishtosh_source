package com.p683ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.jedi.p725a.p733f.C11585a;
import com.p683ss.android.ugc.aweme.friends.model.RecommendList;
import com.p683ss.android.ugc.aweme.friends.recommendlist.repository.RecommendApi.C32588a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.user.repository.C47587a;
import java.util.ArrayList;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.c */
public final class C32593c extends C11585a<C32606e, List<? extends C47587a>, C32606e, RecommendList> {

    /* renamed from: a */
    private final RecommendApi f84828a = C32588a.m75381a();

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo22310b(Object obj) {
        C32606e eVar = (C32606e) obj;
        C52711k.m112240b(eVar, "req");
        return eVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C2201v mo22308a(Object obj) {
        C32606e eVar = (C32606e) obj;
        C52711k.m112240b(eVar, "req");
        C2201v b = this.f84828a.recommendList(eVar.f84839a, eVar.f84840b, eVar.f84841c, eVar.f84842d, eVar.f84843e, eVar.f84844f, eVar.f84845g, eVar.f84846h, eVar.f84847i, eVar.f84848j).mo6529b(C2168a.m6521b());
        C52711k.m112236a((Object) b, "service.recommendList(re…scribeOn(Schedulers.io())");
        return b;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo22309a(Object obj, Object obj2) {
        RecommendList recommendList = (RecommendList) obj2;
        C52711k.m112240b((C32606e) obj, "req");
        C52711k.m112240b(recommendList, "resp");
        List list = null;
        if (recommendList.status_code == 0) {
            List<User> userList = recommendList.getUserList();
            if (userList == null) {
                return null;
            }
            list = new ArrayList();
            for (User user : userList) {
                C52711k.m112236a((Object) user, "it");
                user.setRequestId(recommendList.getRid());
                String rid = recommendList.getRid();
                C52711k.m112236a((Object) rid, "resp.rid");
                C47587a aVar = new C47587a(user, rid, 0, 4, null);
                list.add(aVar);
            }
        }
        return list;
    }
}
