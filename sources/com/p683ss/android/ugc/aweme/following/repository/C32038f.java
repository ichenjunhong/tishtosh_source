package com.p683ss.android.ugc.aweme.following.repository;

import com.bytedance.jedi.p725a.p733f.C11585a;
import com.p683ss.android.ugc.aweme.following.p1768a.C31992a;
import com.p683ss.android.ugc.aweme.following.repository.FollowRelationApi.C32008a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p064c.p065a.C2201v;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.following.repository.f */
public final class C32038f extends C11585a<C32009a, List<? extends User>, C32009a, C31992a> {

    /* renamed from: a */
    private final FollowRelationApi f83614a = C32008a.m74395a();

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo22310b(Object obj) {
        C32009a aVar = (C32009a) obj;
        C52711k.m112240b(aVar, "req");
        return aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C2201v mo22308a(Object obj) {
        C32009a aVar = (C32009a) obj;
        C52711k.m112240b(aVar, "req");
        return this.f83614a.queryConnectedList(aVar.f83579a, aVar.f83580b, aVar.f83581c, aVar.f83582d);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo22309a(Object obj, Object obj2) {
        C31992a aVar = (C31992a) obj2;
        C52711k.m112240b((C32009a) obj, "req");
        C52711k.m112240b(aVar, "resp");
        if (aVar.status_code == 0) {
            return aVar.f83504b;
        }
        return null;
    }
}
