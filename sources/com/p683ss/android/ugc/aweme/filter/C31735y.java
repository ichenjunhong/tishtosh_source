package com.p683ss.android.ugc.aweme.filter;

import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;

/* renamed from: com.ss.android.ugc.aweme.filter.y */
final /* synthetic */ class C31735y implements C31414ao {

    /* renamed from: a */
    private final FilterScrollerModule f82890a;

    C31735y(FilterScrollerModule filterScrollerModule) {
        this.f82890a = filterScrollerModule;
    }

    /* renamed from: a */
    public final void mo64313a(C31459g gVar, int i, boolean z) {
        FilterScrollerModule filterScrollerModule = this.f82890a;
        if (z) {
            filterScrollerModule.f82156j = null;
            FilterViewModel.m73161a(filterScrollerModule.f82149c, gVar);
            return;
        }
        filterScrollerModule.f82156j = gVar;
        ((FilterViewModel) C0214z.m440a((FragmentActivity) filterScrollerModule.f82149c).mo359a(FilterViewModel.class)).mo64288c().postValue(gVar);
    }
}
