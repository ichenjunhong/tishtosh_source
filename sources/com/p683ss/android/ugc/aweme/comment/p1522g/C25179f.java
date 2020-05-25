package com.p683ss.android.ugc.aweme.comment.p1522g;

import com.p683ss.android.ugc.aweme.app.p1373d.C23064c;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.comment.api.CommentApi;
import com.p683ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.comment.g.f */
public final class C25179f extends C25174b<BaseCommentResponse> {

    /* renamed from: b */
    public String f66730b = "";

    /* renamed from: c */
    public String f66731c = "";

    /* renamed from: d */
    public String f66732d = "";

    /* renamed from: e */
    public String f66733e = "";

    /* renamed from: f */
    public String f66734f = "";

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 4) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        if (objArr != null && objArr.length == 6) {
            this.f66732d = objArr[2];
            this.f66733e = objArr[4];
            this.f66734f = objArr[5];
        }
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                C25179f.this.f66730b = (String) objArr[0];
                C25179f.this.f66731c = (String) objArr[1];
                return CommentApi.m61045a((String) objArr[0], (String) objArr[1], (String) objArr[2], C23064c.m56602a((String) objArr[3]));
            }
        }, 0);
        return true;
    }
}
