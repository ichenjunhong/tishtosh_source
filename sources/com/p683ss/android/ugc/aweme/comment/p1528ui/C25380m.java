package com.p683ss.android.ugc.aweme.comment.p1528ui;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.m */
final /* synthetic */ class C25380m implements Runnable {

    /* renamed from: a */
    private final C25367g f67148a;

    /* renamed from: b */
    private final int f67149b;

    /* renamed from: c */
    private final Comment f67150c;

    C25380m(C25367g gVar, int i, Comment comment) {
        this.f67148a = gVar;
        this.f67149b = i;
        this.f67150c = comment;
    }

    public final void run() {
        int i;
        C25367g gVar = this.f67148a;
        int i2 = this.f67149b;
        Comment comment = this.f67150c;
        int i3 = -1;
        if (gVar.mo51543c()) {
            i3 = gVar.f67118n.mo4749j();
            i = gVar.f67118n.mo4752m();
        } else {
            i = -1;
        }
        if (new int[]{i3, i}[1] < i2 && gVar.f67118n != null) {
            gVar.f67118n.mo4721a(Math.max(0, i2 - 2), -gVar.f67090a);
        }
        if (gVar.f67110b.showReplyWithInsertCid()) {
            gVar.f67114j = comment;
            gVar.f67117m.setHint(C11010c.m22280a().getString(R.string.d6y, new Object[]{C47915gg.m103650b(comment.getUser())}));
        }
    }
}
