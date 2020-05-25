package com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit;

import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.p2211a.C44009g;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.b */
final /* synthetic */ class C43118b implements C44009g {

    /* renamed from: a */
    private final C43113a f108952a;

    C43118b(C43113a aVar) {
        this.f108952a = aVar;
    }

    /* renamed from: a */
    public final void mo59016a(List list) {
        C43113a aVar = this.f108952a;
        if (list != null && !list.isEmpty()) {
            aVar.f108941l.clear();
            aVar.f108941l.addAll(list);
            aVar.notifyDataSetChanged();
        }
    }
}
