package com.p683ss.android.ugc.aweme.comment.p1522g;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.comment.api.CommentApi;
import com.p683ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.comment.g.d */
public final class C25176d extends C25174b<BaseCommentResponse> {

    /* renamed from: b */
    public String f66726b = "";

    /* renamed from: c */
    public String f66727c = "";

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                C25176d.this.f66726b = (String) objArr[0];
                return CommentApi.m61044a((String) objArr[0]);
            }
        }, 0);
        return true;
    }
}
