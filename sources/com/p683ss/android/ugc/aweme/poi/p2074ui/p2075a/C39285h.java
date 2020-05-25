package com.p683ss.android.ugc.aweme.poi.p2074ui.p2075a;

import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.net.C37776h;
import com.p683ss.android.ugc.aweme.poi.C39065f;
import com.p683ss.android.ugc.aweme.poi.api.PoiFeedApi;
import com.p683ss.android.ugc.aweme.poi.model.C39135s;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.a.h */
public final class C39285h extends C26832a<C39135s> {

    /* renamed from: a */
    public final PoiFeedApi f100433a = ((PoiFeedApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(PoiFeedApi.class));

    public final boolean checkParams(Object... objArr) {
        boolean z;
        C52711k.m112240b(objArr, "params");
        if (objArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    public final boolean sendRequest(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        C39065f fVar = objArr[0];
        if (fVar != null) {
            C39065f fVar2 = fVar;
            this.f100433a.getPoiCommonBanner(fVar2.f99626i, 53, fVar2.f99618a).mo20a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0), C0013i.f25b);
            return true;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.PoiParams");
    }
}
