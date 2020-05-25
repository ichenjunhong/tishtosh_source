package com.p683ss.android.ugc.aweme.discover.p1659ui;

import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout.C23596b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.r */
final /* synthetic */ class C28662r implements C23596b {

    /* renamed from: a */
    private final DiscoverFragment f75230a;

    C28662r(DiscoverFragment discoverFragment) {
        this.f75230a = discoverFragment;
    }

    /* renamed from: a */
    public final void mo47048a() {
        DiscoverFragment discoverFragment = this.f75230a;
        if (!C28712v.m67975a(discoverFragment.getContext())) {
            C10691a.m21542b(discoverFragment.getContext(), (int) R.string.cg1).mo19066a();
            discoverFragment.mRefreshLayout.setRefreshing(false);
            return;
        }
        discoverFragment.mo58047f();
    }
}
