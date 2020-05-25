package com.p683ss.android.ugc.aweme.profile;

import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel;
import com.p683ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.C40595a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.MultiAccountServiceImpl */
public final class MultiAccountServiceImpl implements C39874g {
    public final void uploadAccountNum(boolean z) {
        MultiAccountViewModel.f103553f.mo82864a(z);
    }

    public final void addAccount(FragmentActivity fragmentActivity, String str, String str2) {
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(str2, "enterMethod");
        C40595a.m90023a(fragmentActivity, str, str2);
    }
}
