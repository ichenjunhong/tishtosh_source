package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.BaseMusicListView_ViewBinding */
public class BaseMusicListView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseMusicListView f66098a;

    public void unbind() {
        BaseMusicListView baseMusicListView = this.f66098a;
        if (baseMusicListView != null) {
            this.f66098a = null;
            baseMusicListView.mTitleBar = null;
            baseMusicListView.mRecyclerView = null;
            baseMusicListView.mStatusView = null;
            baseMusicListView.mTitleLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseMusicListView_ViewBinding(BaseMusicListView baseMusicListView, View view) {
        this.f66098a = baseMusicListView;
        baseMusicListView.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.d10, "field 'mTitleBar'", TextTitleBar.class);
        baseMusicListView.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bo_, "field 'mRecyclerView'", RecyclerView.class);
        baseMusicListView.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.bop, "field 'mStatusView'", DmtStatusView.class);
        baseMusicListView.mTitleLayout = (LinearLayout) Utils.findOptionalViewAsType(view, R.id.emc, "field 'mTitleLayout'", LinearLayout.class);
    }
}
