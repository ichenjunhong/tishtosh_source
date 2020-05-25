package com.p683ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.lego.C35889c;
import com.p683ss.android.ugc.aweme.lego.C35897g;
import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import com.p683ss.android.ugc.aweme.notice.api.bean.C38041h;
import com.p683ss.android.ugc.aweme.notice.api.p2008sp.C38053d.C38054a;
import com.p683ss.android.ugc.aweme.notice.api.p2008sp.C38055e;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.i */
public final class C41259i implements C35889c {

    /* renamed from: com.ss.android.ugc.aweme.requesttask.idle.i$a */
    static final class C41260a<TTaskResult, TContinuationResult> implements C0011g<TutorialVideoResp, Object> {

        /* renamed from: a */
        public static final C41260a f104701a = new C41260a();

        C41260a() {
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "it");
            if (!iVar.mo26b()) {
                return null;
            }
            C38055e eVar = (C38055e) C38054a.m85114a(C38055e.class);
            if (iVar.mo34e() == null || ((TutorialVideoResp) iVar.mo34e()).getInfo() == null) {
                if (eVar != null) {
                    eVar.mo48440b("");
                }
                if (eVar != null) {
                    eVar.mo48442d("");
                }
                if (eVar != null) {
                    eVar.mo48444f("");
                }
                if (eVar != null) {
                    eVar.mo48446h("");
                }
            } else {
                int count = ((TutorialVideoResp) iVar.mo34e()).getCount();
                C38046d.m85099a(1000, count);
                C47718bf.m103289b(new C38041h(1000, count));
                if (!TextUtils.isEmpty(((TutorialVideoResp) iVar.mo34e()).getInfo().getAwemeId()) && eVar != null) {
                    eVar.mo48440b(((TutorialVideoResp) iVar.mo34e()).getInfo().getAwemeId());
                }
                if (!TextUtils.isEmpty(((TutorialVideoResp) iVar.mo34e()).getInfo().getTitle()) && eVar != null) {
                    eVar.mo48442d(((TutorialVideoResp) iVar.mo34e()).getInfo().getTitle());
                }
                if (!TextUtils.isEmpty(((TutorialVideoResp) iVar.mo34e()).getInfo().getContent()) && eVar != null) {
                    eVar.mo48444f(((TutorialVideoResp) iVar.mo34e()).getInfo().getContent());
                }
                if (!TextUtils.isEmpty(((TutorialVideoResp) iVar.mo34e()).getInfo().getButton()) && eVar != null) {
                    eVar.mo48446h(((TutorialVideoResp) iVar.mo34e()).getInfo().getButton());
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public final C35897g mo46246a() {
        return C35897g.NORMAL;
    }

    /* renamed from: a */
    public final void mo46247a(Context context, boolean z) {
        C52711k.m112240b(context, "context");
        TutorialVideoApiManager.f96875c.mo77639a(0).mo30c(C41260a.f104701a, C0013i.f25b);
    }
}
