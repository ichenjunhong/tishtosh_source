package com.p683ss.android.ugc.aweme.tools.draft;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.q */
final /* synthetic */ class C47015q implements OnClickListener {

    /* renamed from: a */
    private final C47001k f118751a;

    C47015q(C47001k kVar) {
        this.f118751a = kVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C47001k kVar = this.f118751a;
        C26890h.m65011a("delete_drafts", C23089d.m56640a().mo47826a("draft_cnt", kVar.f118721n.size()).mo47829a("enter_from", kVar.mo94290g()).f61491a);
        C46953a aVar = kVar.f118720m;
        ArrayList<C29059c> arrayList = new ArrayList<>(aVar.f70670n);
        C18842a.m45932a(new Runnable(arrayList) {

            /* renamed from: a */
            final /* synthetic */ List f118645a;

            public final void run() {
                C29059c cVar = null;
                for (C29059c cVar2 : this.f118645a) {
                    if (cVar2.f76165w) {
                        C46953a.m101993b(cVar2);
                        cVar = cVar2;
                    }
                }
                if (cVar != null) {
                    C18842a.m45934b(new C46972b(cVar));
                }
            }

            {
                this.f118645a = r2;
            }
        });
        for (C29059c cVar : arrayList) {
            if (cVar.f76165w) {
                aVar.mo94260a(cVar);
            }
        }
        kVar.mo94293j();
        kVar.f118722o = false;
        kVar.mo94292i();
    }
}
