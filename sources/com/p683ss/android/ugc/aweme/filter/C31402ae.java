package com.p683ss.android.ugc.aweme.filter;

import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import p2628d.C52847n;

/* renamed from: com.ss.android.ugc.aweme.filter.ae */
final /* synthetic */ class C31402ae implements C0199s {

    /* renamed from: a */
    private final FilterViewImpl f82243a;

    C31402ae(FilterViewImpl filterViewImpl) {
        this.f82243a = filterViewImpl;
    }

    public final void onChanged(Object obj) {
        FilterScrollerModule filterScrollerModule = this.f82243a.f82175b;
        ((FilterViewModel) C0214z.m440a((FragmentActivity) filterScrollerModule.f82149c).mo359a(FilterViewModel.class)).mo64287b().setValue(new C52847n(filterScrollerModule.f82151e.mo64324c(), null));
    }
}
