package com.p683ss.android.ugc.aweme.filter;

import android.view.KeyEvent;
import com.p683ss.android.ugc.tools.view.p2508a.C50206a;

/* renamed from: com.ss.android.ugc.aweme.filter.aa */
final /* synthetic */ class C31398aa implements C50206a {

    /* renamed from: a */
    private final FilterViewImpl f82239a;

    C31398aa(FilterViewImpl filterViewImpl) {
        this.f82239a = filterViewImpl;
    }

    /* renamed from: a */
    public final boolean mo58985a(int i, KeyEvent keyEvent) {
        FilterViewImpl filterViewImpl = this.f82239a;
        if (i != 4) {
            return false;
        }
        if (filterViewImpl.f82176c == null || !filterViewImpl.f82176c.f82337a) {
            filterViewImpl.mo64271b();
        } else {
            filterViewImpl.f82176c.mo64361a();
        }
        return true;
    }
}
