package com.p683ss.android.ugc.aweme.p1426bb;

import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IDraftService.OnGetRecoverDraftCallback;
import com.p683ss.android.ugc.aweme.tools.draft.p2359e.C46994b;

/* renamed from: com.ss.android.ugc.aweme.bb.b */
final /* synthetic */ class C23765b implements Runnable {

    /* renamed from: a */
    private final String f63352a;

    /* renamed from: b */
    private final OnGetRecoverDraftCallback f63353b;

    C23765b(String str, OnGetRecoverDraftCallback onGetRecoverDraftCallback) {
        this.f63352a = str;
        this.f63353b = onGetRecoverDraftCallback;
    }

    public final void run() {
        String str = this.f63352a;
        C18842a.m45934b(new C23766c(C46994b.m102064a().queryDraftWithUserId(str), this.f63353b));
    }
}
