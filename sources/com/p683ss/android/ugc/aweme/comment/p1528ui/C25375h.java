package com.p683ss.android.ugc.aweme.comment.p1528ui;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26428bm;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.p1308ad.p1310b.C22328b;
import com.p683ss.android.ugc.aweme.utils.C47957v;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.h */
final /* synthetic */ class C25375h implements C22328b {

    /* renamed from: a */
    private final C25367g f67142a;

    C25375h(C25367g gVar) {
        this.f67142a = gVar;
    }

    /* renamed from: a */
    public final void mo46466a(boolean z) {
        C25367g gVar = this.f67142a;
        if (C26503d.m64071n(gVar.f67111c)) {
            if (!C9376b.m18558a((Collection<T>) gVar.f67120p.mo50673a())) {
                gVar.f67120p.mo50673a().remove(0);
                gVar.f67120p.notifyItemRemoved(0);
            }
            C26138s a = C26428bm.m63902a(gVar.f67111c);
            if (a != null) {
                a.setHasDislike(true);
            }
            C47957v.m103771b(new C25382o(gVar));
        }
    }
}
