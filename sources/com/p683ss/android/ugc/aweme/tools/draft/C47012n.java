package com.p683ss.android.ugc.aweme.tools.draft;

import com.bytedance.common.utility.C9414h;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.tools.draft.p2358d.C46987a;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.n */
final /* synthetic */ class C47012n implements Runnable {

    /* renamed from: a */
    private final C47001k f118747a;

    C47012n(C47001k kVar) {
        this.f118747a = kVar;
    }

    public final void run() {
        C47001k kVar = this.f118747a;
        String f = C43214dh.m94817a().mo87856f();
        C50203g.m108358a("Before DraftDataProvider.getDraftDataV2()");
        boolean z = kVar.f118719l;
        ArrayList arrayList = new ArrayList();
        C47017s a = C47017s.m102091a();
        if (a != null) {
            C50203g.m108358a("Before DraftDataProvider.queryMusicAwemeCollectionV2()");
            List<C46987a> a2 = a.mo94304a(f);
            C50203g.m108358a("After DraftDataProvider.queryMusicAwemeCollectionV2()");
            for (C46987a aVar : a2) {
                List b = aVar.mo94279b();
                if (!C9414h.m18630a(b)) {
                    C29059c cVar = new C29059c();
                    cVar.f76164v = 3;
                    cVar.f76168z = aVar.mo94277a();
                    arrayList.add(cVar);
                    arrayList.addAll(C47018t.m102108a(b, z));
                }
                if (z && arrayList.size() > 0) {
                    ((C29059c) arrayList.get(arrayList.size() - 1)).f76166x = true;
                }
            }
        }
        if (z) {
            C47018t.m102109a(arrayList);
        }
        C50203g.m108358a("After DraftDataProvider.getDraftDataV2()");
        C18842a.m45934b(new C47013o(kVar, arrayList));
    }
}
