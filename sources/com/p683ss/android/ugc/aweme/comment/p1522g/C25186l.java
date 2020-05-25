package com.p683ss.android.ugc.aweme.comment.p1522g;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.comment.model.CommentResponse;

/* renamed from: com.ss.android.ugc.aweme.comment.g.l */
public final class C25186l extends C25174b<CommentResponse> {
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C23566n.m57766a().mo48750a(this.mHandler, new C25187m(objArr), 0);
        return true;
    }
}
