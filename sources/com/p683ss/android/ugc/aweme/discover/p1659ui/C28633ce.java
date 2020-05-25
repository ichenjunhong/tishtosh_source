package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel.C28950a;
import com.p683ss.android.ugc.aweme.search.model.C41434a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.ce */
public final class C28633ce {
    /* renamed from: a */
    public static final boolean m67892a(FragmentActivity fragmentActivity) {
        C52711k.m112240b(fragmentActivity, "activity");
        C41434a aVar = C28950a.m68268a(fragmentActivity).f75785a;
        if (aVar == null || aVar.getEnterSearchFromBusiness() != 1) {
            return false;
        }
        return true;
    }
}
