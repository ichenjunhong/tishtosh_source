package com.p683ss.android.ugc.aweme.detail.p1622d;

import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23641a;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C32969a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.d.b */
public final class C27329b extends C23641a {

    /* renamed from: a */
    private final FragmentActivity f72077a;

    /* renamed from: c */
    private final C27328a f72078c;

    /* renamed from: a */
    public final boolean mo49061a(int i) {
        if (!this.f72078c.mo49061a(i)) {
            return false;
        }
        if (i == -1) {
            return C32969a.m75907a(this.f72077a).mo69868b("page_discover");
        }
        return true;
    }

    public C27329b(FragmentActivity fragmentActivity, C27328a aVar) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(aVar, "scrollBasicChecker");
        this.f72077a = fragmentActivity;
        this.f72078c = aVar;
    }
}
