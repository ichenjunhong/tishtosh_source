package com.p683ss.android.ugc.aweme.following.repository;

import com.bytedance.jedi.p725a.p733f.C11585a;
import com.p683ss.android.ugc.aweme.following.p1768a.C31998e;
import com.p683ss.android.ugc.aweme.following.repository.FollowRelationApi.C32008a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.following.repository.h */
public final class C32040h extends C11585a<C32019c, List<? extends User>, C32019c, C31998e> {

    /* renamed from: a */
    private final FollowRelationApi f83616a = C32008a.m74395a();

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo22310b(Object obj) {
        C32019c cVar = (C32019c) obj;
        C52711k.m112240b(cVar, "req");
        return cVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C2201v mo22308a(Object obj) {
        C32019c cVar = (C32019c) obj;
        C52711k.m112240b(cVar, "req");
        C2201v b = this.f83616a.queryFollowingList(cVar.f83590a, cVar.f83591b, cVar.f83592c, cVar.f83593d, cVar.f83594e, cVar.f83595f, cVar.f83596g, cVar.f83597h, cVar.f83598i, cVar.f83599j).mo6529b(C2168a.m6521b());
        C52711k.m112236a((Object) b, "service.queryFollowingLi…scribeOn(Schedulers.io())");
        return b;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo22309a(Object obj, Object obj2) {
        C31998e eVar = (C31998e) obj2;
        C52711k.m112240b((C32019c) obj, "req");
        C52711k.m112240b(eVar, "resp");
        return eVar.f83542a;
    }
}
