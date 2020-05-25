package com.p683ss.android.ugc.aweme.mix;

import com.bytedance.jedi.p725a.p733f.C11597d;
import com.p683ss.android.ugc.aweme.mix.MixDetailApi.C36989a;
import p064c.p065a.C2201v;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.mix.r */
public final class C37087r extends C11597d<C37088s, MixInfo> {

    /* renamed from: a */
    private final MixDetailApi f94726a = C36989a.m83212a();

    /* renamed from: a */
    public final /* synthetic */ C2201v mo22308a(Object obj) {
        C37088s sVar = (C37088s) obj;
        C52711k.m112240b(sVar, "req");
        return this.f94726a.getMixInfo(sVar.f94727a);
    }
}
