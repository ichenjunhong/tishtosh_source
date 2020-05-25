package com.p683ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.jedi.p725a.p733f.C11585a;
import com.p683ss.android.ugc.aweme.friends.model.RecommendList;
import com.p683ss.android.ugc.aweme.friends.recommendlist.repository.RecommendApi.C32588a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.user.repository.C47587a;
import java.util.ArrayList;
import java.util.List;
import p064c.p065a.C2201v;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.f */
public final class C32607f extends C11585a<C32609g, List<? extends C47587a>, C32609g, RecommendList> {

    /* renamed from: a */
    public static final C32608a f84849a = new C32608a(null);

    /* renamed from: b */
    private final RecommendApi f84850b = C32588a.m75381a();

    /* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.f$a */
    public static final class C32608a {
        private C32608a() {
        }

        public /* synthetic */ C32608a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo22310b(Object obj) {
        C32609g gVar = (C32609g) obj;
        C52711k.m112240b(gVar, "req");
        return gVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C2201v mo22308a(Object obj) {
        int i;
        C32609g gVar = (C32609g) obj;
        C52711k.m112240b(gVar, "req");
        RecommendApi recommendApi = this.f84850b;
        Integer num = gVar.f84851a;
        Integer num2 = gVar.f84852b;
        String str = gVar.f84857g;
        String str2 = gVar.f84860j;
        Integer valueOf = Integer.valueOf(gVar.f84854d);
        if (valueOf != null && valueOf.intValue() == 4) {
            i = 1;
        } else if (valueOf != null && valueOf.intValue() == 21) {
            i = 3;
        } else if (valueOf != null && valueOf.intValue() == 13) {
            i = 2;
        } else {
            i = 0;
        }
        return recommendApi.recommendListMT(num, num2, str, str2, Integer.valueOf(i));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo22309a(Object obj, Object obj2) {
        RecommendList recommendList = (RecommendList) obj2;
        C52711k.m112240b((C32609g) obj, "req");
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
