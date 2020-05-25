package com.p683ss.android.ugc.aweme.newfollow.p2003vh;

import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.u */
final /* synthetic */ class C38004u implements AsyncServiceLoader {

    /* renamed from: a */
    static final AsyncServiceLoader f96759a = new C38004u();

    private C38004u() {
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().draftService().removeRecoverDraft();
    }
}
