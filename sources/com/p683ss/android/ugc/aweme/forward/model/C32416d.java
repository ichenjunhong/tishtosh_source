package com.p683ss.android.ugc.aweme.forward.model;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.forward.api.ForwardApi;
import com.p683ss.android.ugc.aweme.net.C37776h;
import p001a.C0011g;

/* renamed from: com.ss.android.ugc.aweme.forward.model.d */
public final class C32416d extends C26832a<ForwardDetail> {
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
        ForwardApi.f84275a.getForwardDetail(objArr[0]).mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
        return true;
    }

    public final /* synthetic */ void handleData(Object obj) {
        ForwardDetail forwardDetail = (ForwardDetail) obj;
        super.handleData(forwardDetail);
        if (forwardDetail != null && forwardDetail.getAweme() != null) {
            Aweme aweme = forwardDetail.getAweme();
            if (aweme.getAwemeType() == 13) {
                forwardDetail.setAweme(C23324d.m57378a().updateAweme(aweme));
                Aweme forwardItem = aweme.getForwardItem();
                if (forwardItem != null) {
                    forwardItem.setRepostFromGroupId(aweme.getAid());
                    forwardItem.setRepostFromUserId(aweme.getAuthorUid());
                    C23324d.m57378a().updateAweme(forwardItem);
                }
            }
        }
    }
}
