package com.p683ss.android.ugc.aweme.userservice.jedi.p2385a;

import com.bytedance.jedi.p725a.p733f.C11585a;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.userservice.CommonFollowApi;
import p064c.p065a.C2201v;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.e */
public final class C47601e extends C11585a<String, Integer, C47602f, BaseResponse> {
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo22310b(Object obj) {
        C47602f fVar = (C47602f) obj;
        C52711k.m112240b(fVar, "req");
        return fVar.f120067a;
    }

    /* renamed from: a */
    public final /* synthetic */ C2201v mo22308a(Object obj) {
        C47602f fVar = (C47602f) obj;
        C52711k.m112240b(fVar, "req");
        C2201v a = CommonFollowApi.m103034a(fVar.f120067a, fVar.f120068b);
        C52711k.m112236a((Object) a, "CommonFollowApi.removeFo…r(req.uid, req.secUserId)");
        return a;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo22309a(Object obj, Object obj2) {
        BaseResponse baseResponse = (BaseResponse) obj2;
        C52711k.m112240b((C47602f) obj, "req");
        C52711k.m112240b(baseResponse, "resp");
        return Integer.valueOf(baseResponse.status_code);
    }
}
