package com.p683ss.android.ugc.aweme.profile;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.common.p1146d.C18894a;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.o */
final /* synthetic */ class C39946o implements C0199s {

    /* renamed from: a */
    private final C39940m f101821a;

    /* renamed from: b */
    private final ScrollSwitchStateManager f101822b;

    C39946o(C39940m mVar, ScrollSwitchStateManager scrollSwitchStateManager) {
        this.f101821a = mVar;
        this.f101822b = scrollSwitchStateManager;
    }

    public final void onChanged(Object obj) {
        C39940m mVar = this.f101821a;
        ScrollSwitchStateManager scrollSwitchStateManager = this.f101822b;
        Integer num = (Integer) obj;
        if (mVar.getActivity() != null && num != null && num.intValue() != 0 && C39940m.m88688a(mVar.f101798e)) {
            mVar.f101798e = mVar.mo81071a(mVar.f101798e, 0);
            C0199s<Integer> sVar = mVar.f101797d;
            C52711k.m112240b(sVar, "observer");
            scrollSwitchStateManager.f85669b.removeObserver(sVar);
            C18894a.m46006a("lazy_do_aweme_changed", new JSONObject());
        }
    }
}
