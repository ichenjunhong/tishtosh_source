package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.comment.C25275p;
import com.p683ss.android.ugc.aweme.comment.CommentViewModelImpl;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30337f;
import com.p683ss.android.ugc.aweme.utils.C47718bf;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.l */
final /* synthetic */ class C25379l implements Runnable {

    /* renamed from: a */
    private final C25367g f67147a;

    C25379l(C25367g gVar) {
        this.f67147a = gVar;
    }

    public final void run() {
        C25367g gVar = this.f67147a;
        FragmentActivity activity = gVar.getActivity();
        if (activity != null) {
            C30337f fVar = new C30337f(0);
            fVar.f79245b = gVar.f67067C;
            C30337f a = fVar.mo60716a(activity.hashCode());
            a.f79246c = gVar.mo51940q();
            C47718bf.m103288a(a);
            C25275p pVar = ((CommentViewModelImpl) C0214z.m440a(C25367g.m61676b((Context) activity)).mo359a(CommentViewModelImpl.class)).f66375a;
            pVar.f66867b--;
            if (pVar.f66867b <= 0) {
                pVar.f66866a.setValue(Boolean.valueOf(false));
            }
        }
    }
}
