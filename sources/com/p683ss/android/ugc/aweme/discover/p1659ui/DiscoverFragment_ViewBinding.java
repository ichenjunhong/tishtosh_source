package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.view.View;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.p683ss.android.ugc.aweme.discover.widget.BannerSwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.discover.widget.DiscoveryRecyclerView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.DiscoverFragment_ViewBinding */
public class DiscoverFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DiscoverFragment f74749a;

    public void unbind() {
        DiscoverFragment discoverFragment = this.f74749a;
        if (discoverFragment != null) {
            this.f74749a = null;
            discoverFragment.mFlRootContainer = null;
            discoverFragment.mListView = null;
            discoverFragment.mRefreshLayout = null;
            discoverFragment.mStatusBar = null;
            discoverFragment.mStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DiscoverFragment_ViewBinding(DiscoverFragment discoverFragment, View view) {
        this.f74749a = discoverFragment;
        discoverFragment.mFlRootContainer = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.ahd, "field 'mFlRootContainer'", RelativeLayout.class);
        discoverFragment.mListView = (DiscoveryRecyclerView) Utils.findRequiredViewAsType(view, R.id.bc2, "field 'mListView'", DiscoveryRecyclerView.class);
        discoverFragment.mRefreshLayout = (BannerSwipeRefreshLayout) Utils.findRequiredViewAsType(view, R.id.n2, "field 'mRefreshLayout'", BannerSwipeRefreshLayout.class);
        discoverFragment.mStatusBar = Utils.findRequiredView(view, R.id.csm, "field 'mStatusBar'");
        discoverFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
    }
}
