package com.p683ss.android.ugc.aweme.forward.model;

import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.forward.api.ForwardApi;
import com.p683ss.android.ugc.aweme.net.C37776h;
import p001a.C0011g;

/* renamed from: com.ss.android.ugc.aweme.forward.model.a */
public final class C32413a extends C26832a<BaseResponse> {
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        ForwardApi.f84275a.deleteForward(objArr[0]).mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
        return true;
    }
}
