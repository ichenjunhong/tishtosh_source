package com.p683ss.android.ugc.aweme.main;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30309aa;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30342k;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30344m;
import com.p683ss.android.ugc.aweme.profile.p2084b.C39798b;
import com.p683ss.android.ugc.aweme.profile.p2084b.C39799c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import p2628d.C52855s;

/* renamed from: com.ss.android.ugc.aweme.main.ci */
final /* synthetic */ class C36558ci implements C0199s {

    /* renamed from: a */
    private final MainPageFragment f93646a;

    C36558ci(MainPageFragment mainPageFragment) {
        this.f93646a = mainPageFragment;
    }

    public final void onChanged(Object obj) {
        MainPageFragment mainPageFragment = this.f93646a;
        if (((Integer) ((C52855s) obj).getFirst()).intValue() == mainPageFragment.f93508q.mo69869c("page_feed")) {
            if (!mainPageFragment.f93468D) {
                mainPageFragment.f93468D = true;
                C47718bf.m103288a(new C30342k());
                C47718bf.m103288a(new C30344m());
                C47718bf.m103288a(new C39799c());
                C47718bf.m103288a(new C39798b());
            }
            C47718bf.m103288a(new C30309aa(false));
        }
    }
}
