package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.p683ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.FeedTimeLineFragment_ViewBinding */
public class FeedTimeLineFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FeedTimeLineFragment f80428a;

    public void unbind() {
        FeedTimeLineFragment feedTimeLineFragment = this.f80428a;
        if (feedTimeLineFragment != null) {
            this.f80428a = null;
            feedTimeLineFragment.mFlRootContanier = null;
            feedTimeLineFragment.mStatusView = null;
            feedTimeLineFragment.mVTabBg = null;
            feedTimeLineFragment.mRefreshLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FeedTimeLineFragment_ViewBinding(FeedTimeLineFragment feedTimeLineFragment, View view) {
        this.f80428a = feedTimeLineFragment;
        feedTimeLineFragment.mFlRootContanier = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ahe, "field 'mFlRootContanier'", ViewGroup.class);
        feedTimeLineFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
        feedTimeLineFragment.mVTabBg = Utils.findRequiredView(view, R.id.do7, "field 'mVTabBg'");
        feedTimeLineFragment.mRefreshLayout = (FeedSwipeRefreshLayout) Utils.findRequiredViewAsType(view, R.id.caw, "field 'mRefreshLayout'", FeedSwipeRefreshLayout.class);
    }
}
