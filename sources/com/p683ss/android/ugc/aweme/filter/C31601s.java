package com.p683ss.android.ugc.aweme.filter;

import android.arch.lifecycle.C0199s;
import p2628d.C52847n;

/* renamed from: com.ss.android.ugc.aweme.filter.s */
final /* synthetic */ class C31601s implements C0199s {

    /* renamed from: a */
    private final FilterScrollerModule f82605a;

    C31601s(FilterScrollerModule filterScrollerModule) {
        this.f82605a = filterScrollerModule;
    }

    public final void onChanged(Object obj) {
        FilterScrollerModule filterScrollerModule = this.f82605a;
        C52847n nVar = (C52847n) obj;
        if (nVar.getFirst() != null) {
            filterScrollerModule.mo64260a(false);
            if (!filterScrollerModule.f82151e.mo64320a((C31459g) nVar.getFirst())) {
                filterScrollerModule.f82155i = (C31459g) nVar.getFirst();
                return;
            }
            filterScrollerModule.mo64259a((C31459g) nVar.getFirst());
        }
    }
}
