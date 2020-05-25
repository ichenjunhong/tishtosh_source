package com.p683ss.android.ugc.aweme.feed.panel;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import java.util.Collection;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.h */
final /* synthetic */ class C30638h implements C1710e {

    /* renamed from: a */
    private final C30616b f80072a;

    C30638h(C30616b bVar) {
        this.f80072a = bVar;
    }

    public final void accept(Object obj) {
        C30616b bVar = this.f80072a;
        ScrollSwitchStateManager scrollSwitchStateManager = (ScrollSwitchStateManager) obj;
        if (bVar.f79945E != null) {
            scrollSwitchStateManager.mo69863a(!C9376b.m18558a((Collection<T>) bVar.f79945E.mo60286c()));
        }
    }
}
