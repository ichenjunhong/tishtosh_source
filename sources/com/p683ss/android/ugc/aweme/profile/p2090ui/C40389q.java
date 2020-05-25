package com.p683ss.android.ugc.aweme.profile.p2090ui;

import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.services.external.IAVDraftService;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.q */
final /* synthetic */ class C40389q implements Callable {

    /* renamed from: a */
    private final C402844 f103055a;

    /* renamed from: b */
    private final IAVDraftService f103056b;

    C40389q(C402844 r1, IAVDraftService iAVDraftService) {
        this.f103055a = r1;
        this.f103056b = iAVDraftService;
    }

    public final Object call() {
        C18842a.m45934b(new Runnable(this.f103056b.draftList(true)) {

            /* renamed from: a */
            final /* synthetic */ List f102879a;

            public final void run() {
                if (this.f102879a == null || this.f102879a.isEmpty()) {
                    C40280c.this.mo82539o();
                    C40280c.this.mo82553y();
                    return;
                }
                C40280c.this.mo82529a((C29059c) this.f102879a.get(this.f102879a.size() - 1));
            }

            {
                this.f102879a = r2;
            }
        });
        return null;
    }
}
