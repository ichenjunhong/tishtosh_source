package com.p683ss.android.ugc.aweme.feed.panel;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.AbsCellFeedFragmentPanel_ViewBinding */
public class AbsCellFeedFragmentPanel_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AbsCellFeedFragmentPanel f79886a;

    public void unbind() {
        AbsCellFeedFragmentPanel absCellFeedFragmentPanel = this.f79886a;
        if (absCellFeedFragmentPanel != null) {
            this.f79886a = null;
            absCellFeedFragmentPanel.mStatusView = null;
            absCellFeedFragmentPanel.mListView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AbsCellFeedFragmentPanel_ViewBinding(AbsCellFeedFragmentPanel absCellFeedFragmentPanel, View view) {
        this.f79886a = absCellFeedFragmentPanel;
        absCellFeedFragmentPanel.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
        absCellFeedFragmentPanel.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bc2, "field 'mListView'", RecyclerView.class);
    }
}
