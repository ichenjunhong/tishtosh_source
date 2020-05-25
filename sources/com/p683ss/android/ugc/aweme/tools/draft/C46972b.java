package com.p683ss.android.ugc.aweme.tools.draft;

import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.tools.draft.p2359e.C46994b;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.b */
final /* synthetic */ class C46972b implements Runnable {

    /* renamed from: a */
    private final C29059c f118675a;

    C46972b(C29059c cVar) {
        this.f118675a = cVar;
    }

    public final void run() {
        C46994b.m102064a().notifyDraftDelete(this.f118675a);
    }
}
