package com.p683ss.android.ugc.aweme.profile;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25710b;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p683ss.android.ugc.aweme.profile.service.C40008a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;

/* renamed from: com.ss.android.ugc.aweme.profile.p */
final /* synthetic */ class C39947p implements C0199s {

    /* renamed from: a */
    private final C39940m f101823a;

    /* renamed from: b */
    private final ScrollSwitchStateManager f101824b;

    C39947p(C39940m mVar, ScrollSwitchStateManager scrollSwitchStateManager) {
        this.f101823a = mVar;
        this.f101824b = scrollSwitchStateManager;
    }

    public final void onChanged(Object obj) {
        C39940m mVar = this.f101823a;
        ScrollSwitchStateManager scrollSwitchStateManager = this.f101824b;
        Integer num = (Integer) obj;
        if (num.intValue() == 1) {
            mVar.f101799j = "slide";
        }
        Context context = mVar.getContext();
        if (num.intValue() == 0 && scrollSwitchStateManager.mo69868b("page_profile") && context != null && mVar.f101795b != null) {
            C40008a.f101948a.mo82011a(context, mVar.f101795b.getAwemeRawAd(), mVar.f101795b.getAid());
        }
        if (num.intValue() == 0 && scrollSwitchStateManager.mo69868b("page_feed") && context != null && mVar.f101795b != null && mVar.f101795b.isAd() && mVar.f101795b.getAwemeRawAd().getGetAdStatus() == 1 && C40008a.f101948a.mo82012a(mVar.f101795b)) {
            C40008a.f101948a.mo82015b(mVar.getContext(), mVar.f101795b, mVar.f101799j);
        }
        if (num.intValue() == 0 && scrollSwitchStateManager.mo69868b("page_feed")) {
            C47718bf.m103288a(new C25710b(0));
        }
    }
}
