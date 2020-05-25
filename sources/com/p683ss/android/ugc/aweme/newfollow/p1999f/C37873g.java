package com.p683ss.android.ugc.aweme.newfollow.p1999f;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.newfollow.p1994a.C37837a;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37997r;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.draft.IDraftService.DraftListener;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IDraftService.OnGetRecoverDraftCallback;

/* renamed from: com.ss.android.ugc.aweme.newfollow.f.g */
final /* synthetic */ class C37873g implements AsyncServiceLoader {

    /* renamed from: a */
    private final C37867d f96415a;

    /* renamed from: b */
    private final boolean f96416b;

    C37873g(C37867d dVar, boolean z) {
        this.f96415a = dVar;
        this.f96416b = z;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().draftService().getRecoverDraftIfHave(AwemeApplication.m56199a(), new OnGetRecoverDraftCallback(this.f96416b) {

            /* renamed from: a */
            final /* synthetic */ boolean f96409a;

            public final void onFail() {
            }

            public final void onSuccess(C29059c cVar) {
                if (C37867d.this.f96402e != null) {
                    C37997r rVar = C37867d.this.f96402e;
                    boolean z = this.f96409a;
                    if (rVar.f83139f != null && rVar.mo77464k()) {
                        rVar.mo64861a(4);
                        ((C37837a) rVar.f83139f).mo77276a(cVar, z);
                        C26890h.m65011a("publish_retry_show", C23089d.m56640a().mo47829a("creation_id", cVar.mo58817z()).f61491a);
                        rVar.f96738k = new DraftListener(cVar) {

                            /* renamed from: a */
                            final /* synthetic */ C29059c f96755a;

                            public final void onDraftCheckedChanged(C29059c cVar, boolean z) {
                            }

                            public final void onDraftClean() {
                            }

                            public final void onDraftUpdate(C29059c cVar) {
                            }

                            public final void onDraftDelete(C29059c cVar) {
                                if (cVar != null && TextUtils.equals(cVar.mo58774ak(), this.f96755a.mo58774ak())) {
                                    C37997r.this.mo77462e(false);
                                }
                            }

                            {
                                this.f96755a = r2;
                            }
                        };
                        AVExternalServiceImpl.getAVServiceImpl_Monster().draftService().registerListener(rVar.f96738k);
                    }
                }
            }

            {
                this.f96409a = r2;
            }
        });
    }
}
