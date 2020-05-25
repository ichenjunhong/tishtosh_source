package com.p683ss.android.ugc.aweme.comment.p1522g;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.comment.g.q */
public final class C25191q extends C25174b<BaseResponse> {

    /* renamed from: b */
    public String f66765b;

    /* renamed from: c */
    public String f66766c;

    /* renamed from: d */
    public boolean f66767d;

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 3) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        this.f66765b = objArr[0];
        this.f66766c = objArr[1];
        this.f66767d = objArr[2].booleanValue();
        C23566n.m57766a().mo48750a(this.mHandler, new C25192r(this), 0);
        return true;
    }
}
