package com.p683ss.android.ugc.aweme.detail.p1628ui;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30309aa;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30342k;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30344m;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p683ss.android.ugc.aweme.profile.p2084b.C39798b;
import com.p683ss.android.ugc.aweme.profile.p2084b.C39799c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import p2628d.C52855s;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.t */
final /* synthetic */ class C27519t implements C0199s {

    /* renamed from: a */
    private final C27514r f72356a;

    /* renamed from: b */
    private final ScrollSwitchStateManager f72357b;

    /* renamed from: c */
    private final int f72358c;

    C27519t(C27514r rVar, ScrollSwitchStateManager scrollSwitchStateManager, int i) {
        this.f72356a = rVar;
        this.f72357b = scrollSwitchStateManager;
        this.f72358c = i;
    }

    public final void onChanged(Object obj) {
        C27514r rVar = this.f72356a;
        ScrollSwitchStateManager scrollSwitchStateManager = this.f72357b;
        int i = this.f72358c;
        C52855s sVar = (C52855s) obj;
        int intValue = ((Integer) sVar.getFirst()).intValue();
        float floatValue = ((Float) sVar.getSecond()).floatValue();
        int intValue2 = ((Integer) sVar.getThird()).intValue();
        rVar.f72335j.mo55781a(intValue, floatValue, intValue2);
        if (intValue == scrollSwitchStateManager.mo69869c("page_feed")) {
            if (!rVar.f72338m) {
                rVar.f72338m = true;
                C47718bf.m103288a(new C30342k());
                C47718bf.m103288a(new C30344m());
                C47718bf.m103288a(new C39799c());
                C47718bf.m103288a(new C39798b());
            }
            if (intValue2 > i) {
                rVar.f72335j.mo55802c(false);
            } else {
                rVar.f72335j.mo55802c(true);
            }
            C47718bf.m103288a(new C30309aa(false));
        }
    }
}
