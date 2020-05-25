package com.p683ss.android.ugc.aweme.similarvideo.p2270ui;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.common.widget.ZeusFrameLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoFragment_ViewBinding */
public class SimilarVideoFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SimilarVideoFragment f115449a;

    public void unbind() {
        SimilarVideoFragment similarVideoFragment = this.f115449a;
        if (similarVideoFragment != null) {
            this.f115449a = null;
            similarVideoFragment.mRecyclerView = null;
            similarVideoFragment.mLayout = null;
            similarVideoFragment.mStatusView = null;
            similarVideoFragment.mRefreshLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SimilarVideoFragment_ViewBinding(SimilarVideoFragment similarVideoFragment, View view) {
        this.f115449a = similarVideoFragment;
        similarVideoFragment.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bc2, "field 'mRecyclerView'", RecyclerView.class);
        similarVideoFragment.mLayout = (ZeusFrameLayout) Utils.findRequiredViewAsType(view, R.id.bby, "field 'mLayout'", ZeusFrameLayout.class);
        similarVideoFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csk, "field 'mStatusView'", DmtStatusView.class);
        similarVideoFragment.mRefreshLayout = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, R.id.caw, "field 'mRefreshLayout'", SwipeRefreshLayout.class);
    }
}
