package com.p683ss.android.ugc.aweme.poi.model;

import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.net.C37776h;
import com.p683ss.android.ugc.aweme.poi.api.PoiCouponApi;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.poi.model.u */
public final class C39137u extends C26832a<C39141y> {
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 2) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        PoiCouponApi.f99532a.getJoinPoiActivity(objArr[0], objArr[1].intValue()).mo20a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0), C0013i.f25b);
        return true;
    }
}
