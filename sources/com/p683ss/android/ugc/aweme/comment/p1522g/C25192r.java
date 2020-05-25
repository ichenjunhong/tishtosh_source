package com.p683ss.android.ugc.aweme.comment.p1522g;

import com.p683ss.android.ugc.aweme.comment.api.CommentApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.comment.g.r */
final /* synthetic */ class C25192r implements Callable {

    /* renamed from: a */
    private final C25191q f66768a;

    C25192r(C25191q qVar) {
        this.f66768a = qVar;
    }

    public final Object call() {
        C25191q qVar = this.f66768a;
        return CommentApi.m61043a(qVar.f66765b, qVar.f66766c, qVar.f66767d);
    }
}
