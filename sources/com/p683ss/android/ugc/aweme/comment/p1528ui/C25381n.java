package com.p683ss.android.ugc.aweme.comment.p1528ui;

import com.p683ss.android.ugc.aweme.comment.list.C25265n;
import com.p683ss.android.ugc.aweme.comment.model.Comment;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.n */
final /* synthetic */ class C25381n implements Runnable {

    /* renamed from: a */
    private final C25367g f67151a;

    /* renamed from: b */
    private final C25265n f67152b;

    /* renamed from: c */
    private final Comment f67153c;

    C25381n(C25367g gVar, C25265n nVar, Comment comment) {
        this.f67151a = gVar;
        this.f67152b = nVar;
        this.f67153c = comment;
    }

    public final void run() {
        this.f67151a.mo51253a(this.f67152b, this.f67153c);
    }
}
