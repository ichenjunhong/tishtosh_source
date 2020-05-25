package com.p683ss.android.ugc.aweme.discover.panel;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.panel.AbsSearchFragmentPanel_ViewBinding */
public class AbsSearchFragmentPanel_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AbsSearchFragmentPanel f74700a;

    public void unbind() {
        AbsSearchFragmentPanel absSearchFragmentPanel = this.f74700a;
        if (absSearchFragmentPanel != null) {
            this.f74700a = null;
            absSearchFragmentPanel.mStatusView = null;
            absSearchFragmentPanel.mListView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AbsSearchFragmentPanel_ViewBinding(AbsSearchFragmentPanel absSearchFragmentPanel, View view) {
        this.f74700a = absSearchFragmentPanel;
        absSearchFragmentPanel.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
        absSearchFragmentPanel.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bc2, "field 'mListView'", RecyclerView.class);
    }
}
