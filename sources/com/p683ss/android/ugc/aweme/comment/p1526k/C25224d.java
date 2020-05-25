package com.p683ss.android.ugc.aweme.comment.p1526k;

import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.utils.C47718bf;

/* renamed from: com.ss.android.ugc.aweme.comment.k.d */
public final class C25224d {

    /* renamed from: a */
    public static final C25224d f66823a = new C25224d();

    private C25224d() {
    }

    /* renamed from: a */
    public static final void m61330a(String str, long j) {
        if (str != null) {
            C23324d.m57378a().updateCommentCount(str, j);
            C47718bf.m103288a(new C30332aw(14, str));
        }
    }
}
