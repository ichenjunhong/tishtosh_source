package com.p683ss.android.ugc.aweme.p1426bb;

import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IDraftService.OnGetRecoverDraftCallback;

/* renamed from: com.ss.android.ugc.aweme.bb.c */
final /* synthetic */ class C23766c implements Runnable {

    /* renamed from: a */
    private final C29059c f63354a;

    /* renamed from: b */
    private final OnGetRecoverDraftCallback f63355b;

    C23766c(C29059c cVar, OnGetRecoverDraftCallback onGetRecoverDraftCallback) {
        this.f63354a = cVar;
        this.f63355b = onGetRecoverDraftCallback;
    }

    public final void run() {
        C29059c cVar = this.f63354a;
        OnGetRecoverDraftCallback onGetRecoverDraftCallback = this.f63355b;
        if (cVar != null) {
            onGetRecoverDraftCallback.onSuccess(cVar);
        } else {
            onGetRecoverDraftCallback.onFail();
        }
    }
}
