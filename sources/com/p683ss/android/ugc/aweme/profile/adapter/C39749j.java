package com.p683ss.android.ugc.aweme.profile.adapter;

import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.j */
final /* synthetic */ class C39749j implements AsyncServiceLoader {

    /* renamed from: a */
    private final C39744e f101479a;

    C39749j(C39744e eVar) {
        this.f101479a = eVar;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().draftService().enterDraftBoxActivity(this.f101479a.f101469a, null);
    }
}
