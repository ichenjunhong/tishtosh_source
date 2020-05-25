package com.p683ss.android.ugc.aweme.comment.p1522g;

import com.p683ss.android.ugc.aweme.comment.api.CommentApi;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25169e;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25230h;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.comment.g.m */
final /* synthetic */ class C25187m implements Callable {

    /* renamed from: a */
    private final Object[] f66754a;

    C25187m(Object[] objArr) {
        this.f66754a = objArr;
    }

    public final Object call() {
        return CommentApi.m61046a((C25169e) this.f66754a[0], C25230h.m61353a() ? 1 : 0);
    }
}
