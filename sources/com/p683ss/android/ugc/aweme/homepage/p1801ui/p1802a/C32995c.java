package com.p683ss.android.ugc.aweme.homepage.p1801ui.p1802a;

import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23641a;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C32969a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.a.c */
public final class C32995c extends C23641a {

    /* renamed from: a */
    private final FragmentActivity f85716a;

    /* renamed from: c */
    private final C32994b f85717c;

    /* renamed from: a */
    private final boolean m75932a() {
        if (!C32969a.m75907a(this.f85716a).mo69868b("page_feed") || !C52711k.m112239a((Object) C32969a.m75907a(this.f85716a).f85674g, (Object) "USER")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo49061a(int i) {
        if (!this.f85717c.mo49061a(i) && !m75932a()) {
            return false;
        }
        if (i == -1) {
            if (C32969a.m75907a(this.f85716a).mo69868b("page_discover") || m75932a()) {
                return true;
            }
            return false;
        } else if (i != 1 || !m75932a()) {
            return true;
        } else {
            return false;
        }
    }

    public C32995c(FragmentActivity fragmentActivity, C32994b bVar) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(bVar, "scrollBasicChecker");
        this.f85716a = fragmentActivity;
        this.f85717c = bVar;
    }
}
