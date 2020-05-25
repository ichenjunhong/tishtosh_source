package com.p683ss.android.ugc.aweme.profile.p2090ui;

import com.p683ss.android.ugc.aweme.services.external.IAVDraftService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.n */
final /* synthetic */ class C40386n implements Callable {

    /* renamed from: a */
    private final C40280c f103050a;

    /* renamed from: b */
    private final IAVDraftService f103051b;

    C40386n(C40280c cVar, IAVDraftService iAVDraftService) {
        this.f103050a = cVar;
        this.f103051b = iAVDraftService;
    }

    public final Object call() {
        return this.f103050a.mo82528a(this.f103051b);
    }
}
