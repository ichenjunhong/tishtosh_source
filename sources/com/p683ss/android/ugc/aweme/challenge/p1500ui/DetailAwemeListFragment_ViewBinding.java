package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment_ViewBinding */
public class DetailAwemeListFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DetailAwemeListFragment f65172a;

    public void unbind() {
        DetailAwemeListFragment detailAwemeListFragment = this.f65172a;
        if (detailAwemeListFragment != null) {
            this.f65172a = null;
            detailAwemeListFragment.mListView = null;
            detailAwemeListFragment.mStatusView = null;
            detailAwemeListFragment.mStatusViewContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DetailAwemeListFragment_ViewBinding(DetailAwemeListFragment detailAwemeListFragment, View view) {
        this.f65172a = detailAwemeListFragment;
        detailAwemeListFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.aeg, "field 'mListView'", RecyclerView.class);
        detailAwemeListFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
        detailAwemeListFragment.mStatusViewContainer = (FrameLayout) Utils.findOptionalViewAsType(view, R.id.csw, "field 'mStatusViewContainer'", FrameLayout.class);
    }
}
