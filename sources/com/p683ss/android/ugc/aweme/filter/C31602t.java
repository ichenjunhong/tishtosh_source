package com.p683ss.android.ugc.aweme.filter;

import android.arch.lifecycle.C0199s;

/* renamed from: com.ss.android.ugc.aweme.filter.t */
final /* synthetic */ class C31602t implements C0199s {

    /* renamed from: a */
    private final FilterScrollerModule f82606a;

    C31602t(FilterScrollerModule filterScrollerModule) {
        this.f82606a = filterScrollerModule;
    }

    public final void onChanged(Object obj) {
        FilterScrollerModule filterScrollerModule = this.f82606a;
        C31459g gVar = (C31459g) obj;
        if (gVar != null) {
            filterScrollerModule.mo64259a(gVar);
            filterScrollerModule.f82151e.mo64322b(gVar);
        }
    }
}
