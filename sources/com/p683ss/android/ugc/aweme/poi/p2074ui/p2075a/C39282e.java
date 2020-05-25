package com.p683ss.android.ugc.aweme.poi.p2074ui.p2075a;

import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.net.C37776h;
import com.p683ss.android.ugc.aweme.poi.C39065f;
import com.p683ss.android.ugc.aweme.poi.api.PoiFeedApi;
import com.p683ss.android.ugc.aweme.poi.model.C39105ak;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.a.e */
public final class C39282e extends C26832a<C39105ak> {

    /* renamed from: a */
    static final PoiFeedApi f100432a = ((PoiFeedApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(PoiFeedApi.class));

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        C39065f fVar = objArr[0];
        f100432a.getQRDetail(fVar.f99618a, fVar.f99624g, fVar.f99625h).mo20a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0), C0013i.f25b);
        return true;
    }
}
