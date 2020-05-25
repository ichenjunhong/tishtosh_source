package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.arch.lifecycle.C0199s;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.m */
final /* synthetic */ class C28655m implements C0199s {

    /* renamed from: a */
    private final DiscoverFragment f75223a;

    C28655m(DiscoverFragment discoverFragment) {
        this.f75223a = discoverFragment;
    }

    public final void onChanged(Object obj) {
        DiscoverFragment discoverFragment = this.f75223a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (discoverFragment.isViewValid()) {
            discoverFragment.mo58045b(false);
            if (discoverFragment.mRefreshLayout.isEnabled()) {
                discoverFragment.mRefreshLayout.setRefreshing(false);
            }
            if (discoverFragment.f74729e != null && discoverFragment.f74729e.isEnabled()) {
                discoverFragment.f74729e.setRefreshing(false);
            }
            if (discoverFragment.mStatusView != null) {
                if (booleanValue) {
                    discoverFragment.mStatusView.mo19208c(true);
                    return;
                }
                discoverFragment.mStatusView.mo19204a(true);
            }
        }
    }
}
