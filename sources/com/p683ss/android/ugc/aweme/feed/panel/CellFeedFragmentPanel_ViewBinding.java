package com.p683ss.android.ugc.aweme.feed.panel;

import android.view.View;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel_ViewBinding */
public class CellFeedFragmentPanel_ViewBinding extends AbsCellFeedFragmentPanel_ViewBinding {

    /* renamed from: a */
    private CellFeedFragmentPanel f79895a;

    public void unbind() {
        CellFeedFragmentPanel cellFeedFragmentPanel = this.f79895a;
        if (cellFeedFragmentPanel != null) {
            this.f79895a = null;
            cellFeedFragmentPanel.mRefreshLayout = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CellFeedFragmentPanel_ViewBinding(CellFeedFragmentPanel cellFeedFragmentPanel, View view) {
        super(cellFeedFragmentPanel, view);
        this.f79895a = cellFeedFragmentPanel;
        cellFeedFragmentPanel.mRefreshLayout = (FeedSwipeRefreshLayout) Utils.findRequiredViewAsType(view, R.id.caw, "field 'mRefreshLayout'", FeedSwipeRefreshLayout.class);
    }
}
