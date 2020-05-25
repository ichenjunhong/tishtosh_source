package com.p683ss.android.ugc.aweme.notification.tutorialvideo;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.notice.api.p2008sp.C38053d.C38054a;
import com.p683ss.android.ugc.aweme.notice.api.p2008sp.C38055e;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoInfo;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.tutorialvideo.TutorialVideoViewModel */
public final class TutorialVideoViewModel extends C0209x {

    /* renamed from: a */
    public final C0198r<TutorialVideoResp> f97795a = new C0198r<>();

    /* renamed from: com.ss.android.ugc.aweme.notification.tutorialvideo.TutorialVideoViewModel$a */
    static final class C38424a<TTaskResult, TContinuationResult> implements C0011g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ TutorialVideoViewModel f97796a;

        C38424a(TutorialVideoViewModel tutorialVideoViewModel) {
            this.f97796a = tutorialVideoViewModel;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "it");
            if (iVar.mo26b()) {
                if (!(iVar.mo34e() == null || ((TutorialVideoResp) iVar.mo34e()).getInfo() == null)) {
                    TutorialVideoInfo info = ((TutorialVideoResp) iVar.mo34e()).getInfo();
                    C38055e eVar = (C38055e) C38054a.m85114a(C38055e.class);
                    if (!TextUtils.isEmpty(info.getAwemeId()) && eVar != null) {
                        eVar.mo48440b(info.getAwemeId());
                    }
                    if (!TextUtils.isEmpty(info.getTitle()) && eVar != null) {
                        eVar.mo48442d(info.getTitle());
                    }
                    if (!TextUtils.isEmpty(info.getContent()) && eVar != null) {
                        eVar.mo48444f(info.getContent());
                    }
                    if (!TextUtils.isEmpty(info.getButton()) && eVar != null) {
                        eVar.mo48446h(info.getButton());
                    }
                }
                this.f97796a.f97795a.postValue(iVar.mo34e());
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void mo78321a(int i) {
        TutorialVideoApiManager.f96875c.mo77639a(i).mo29c(new C38424a(this));
    }
}
