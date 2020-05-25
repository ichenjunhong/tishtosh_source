package com.p683ss.android.ugc.aweme.newfollow.p1998e;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.friends.api.C32559b;
import com.p683ss.android.ugc.aweme.friends.api.RecommendApi;
import com.p683ss.android.ugc.aweme.net.C37776h;
import p001a.C0011g;

/* renamed from: com.ss.android.ugc.aweme.newfollow.e.d */
public final class C37861d extends C26832a<BaseResponse> {

    /* renamed from: a */
    private RecommendApi f96388a = C32559b.m75337a();

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1 || !(objArr[0] instanceof String) || TextUtils.isEmpty(objArr[0])) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        this.f96388a.dislikeRecommend(1, objArr[0]).mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
        return true;
    }
}
