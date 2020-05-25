package com.p683ss.android.ugc.aweme.newfollow.p1999f;

import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;

/* renamed from: com.ss.android.ugc.aweme.newfollow.f.c */
final /* synthetic */ class C37866c implements AsyncServiceLoader {

    /* renamed from: a */
    static final AsyncServiceLoader f96397a = new C37866c();

    private C37866c() {
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().draftService().removeRecoverDraft();
    }
}
