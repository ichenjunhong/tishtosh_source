package com.p683ss.android.ugc.aweme.tools.draft;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1451a.C23893a;
import com.p683ss.android.ugc.aweme.tools.draft.p2355a.C46960b.C46961a;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.o */
final /* synthetic */ class C47013o implements Runnable {

    /* renamed from: a */
    private final C47001k f118748a;

    /* renamed from: b */
    private final List f118749b;

    C47013o(C47001k kVar, List list) {
        this.f118748a = kVar;
        this.f118749b = list;
    }

    public final void run() {
        C47001k kVar = this.f118748a;
        List<C29059c> list = this.f118749b;
        if (kVar.isViewValid()) {
            kVar.f118714c.setVisibility(8);
            int size = list.size();
            if (!kVar.f118723p) {
                C26890h.m65011a("click_draft_entrance", C23089d.m56640a().mo47826a("draft_cnt", size).mo47829a("enter_from", kVar.mo94290g()).f61491a);
                kVar.f118723p = true;
            }
            long j = 0;
            if (!(kVar.f118726s == 0 || list == null)) {
                C26890h.m65011a("tool_performance_draft_preview_list", C23089d.m56640a().mo47826a("count", list.size()).mo47827a("duration", System.currentTimeMillis() - kVar.f118726s).f61491a);
                kVar.f118726s = 0;
            }
            for (C29059c cVar : list) {
                C23893a aVar = new C23893a();
                aVar.mo49499a(cVar);
                if (cVar.f76142T.f76082ak != null) {
                    j += aVar.mo49498a();
                }
            }
            C47702b.f120193a.mo94984a("tool_performance_draft_info", C23089d.m56640a().mo47826a("count", list.size()).mo47827a("storage_size", j).f61491a);
            C46953a aVar2 = kVar.f118720m;
            if (!(list == null || list.size() == 0)) {
                C29059c cVar2 = new C29059c();
                cVar2.f76164v = 2;
                cVar2.f76142T.f76062aB = false;
                list.add(0, cVar2);
                aVar2.f118639a = true;
            }
            aVar2.mo50303a(list);
            if (C46961a.m102012a()) {
                ArrayList arrayList = new ArrayList();
                for (C29059c cVar3 : list) {
                    if (cVar3.f76142T.f76062aB) {
                        arrayList.add(cVar3);
                    }
                }
                if (!arrayList.isEmpty()) {
                    kVar.mo94287a(arrayList);
                }
            }
        }
    }
}
